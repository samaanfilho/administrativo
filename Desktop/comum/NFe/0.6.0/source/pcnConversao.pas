////////////////////////////////////////////////////////////////////////////////
//                                                                            //
//              PCN - Projeto Cooperar NFe                                    //
//                                                                            //
//   Descri��o: Classes para gera��o/leitura dos arquivos xml da NFe          //
//                                                                            //
//        site: www.projetocooperar.org/nfe                                   //
//       email: projetocooperar@zipmail.com.br                                //
//       forum: http://br.groups.yahoo.com/group/projeto_cooperar_nfe/        //
//     projeto: http://code.google.com/p/projetocooperar/                     //
//         svn: http://projetocooperar.googlecode.com/svn/trunk/              //
//                                                                            //
// Coordena��o: (c) 2009 - Paulo Casagrande                                   //
//                                                                            //
//      Equipe: Vide o arquivo leiame.txt na pasta raiz do projeto            //
//                                                                            //
//      Vers�o: Vide o arquivo leiame.txt na pasta raiz do projeto            //
//                                                                            //
//     Licen�a: GNU Lesser General Public License (GNU LGPL)                  //
//                                                                            //
//              - Este programa � software livre; voc� pode redistribu�-lo    //
//              e/ou modific�-lo sob os termos da Licen�a P�blica Geral GNU,  //
//              conforme publicada pela Free Software Foundation; tanto a     //
//              vers�o 2 da Licen�a como (a seu crit�rio) qualquer vers�o     //
//              mais nova.                                                    //
//                                                                            //
//              - Este programa � distribu�do na expectativa de ser �til,     //
//              mas SEM QUALQUER GARANTIA; sem mesmo a garantia impl�cita de  //
//              COMERCIALIZA��O ou de ADEQUA��O A QUALQUER PROP�SITO EM       //
//              PARTICULAR. Consulte a Licen�a P�blica Geral GNU para obter   //
//              mais detalhes. Voc� deve ter recebido uma c�pia da Licen�a    //
//              P�blica Geral GNU junto com este programa; se n�o, escreva    //
//              para a Free Software Foundation, Inc., 59 Temple Place,       //
//              Suite 330, Boston, MA - 02111-1307, USA ou consulte a         //
//              licen�a oficial em http://www.gnu.org/licenses/gpl.txt        //
//                                                                            //
//    Nota (1): - Esta  licen�a  n�o  concede  o  direito  de  uso  do nome   //
//              "PCN  -  Projeto  Cooperar  NFe", n�o  podendo o mesmo ser    //
//              utilizado sem previa autoriza��o.                             //
//                                                                            //
//    Nota (2): - O uso integral (ou parcial) das units do projeto esta       //
//              condicionado a manuten��o deste cabe�alho junto ao c�digo     //
//                                                                            //
////////////////////////////////////////////////////////////////////////////////

unit pcnConversao;

interface uses

  SysUtils, windows,
{$IFNDEF VER130}
  Variants,
{$ENDIF}
  Classes;

type

  (* IMPORTANTE - Sempre que alterar um Tipo efetuar a atualiza��o das fun��es de convers�o correspondentes *)

  TpcnSchema = (TsPL005c);
  TpcnTipoLayout = (tlAtuCadEmiDFe, tlCadEmiDFe, tlCancNFe, tlConsCad, tlConsReciNFe, tlConsSitNFe, tlConsStatServ,
    tlInutNFe, tlNFe, tlProcNFe, tlProcInutNFe, tlRetAtuCadEmiDFe, tlRetCancNFe, tlRetConsCad, tlRetConsReciNFe,
    tlRetConsStatServ, tlRetConsSitNFe, tlRetEnvNFe, tlRetInutNFe, tlEnvNFe, tlProcCancNFe);
  TpcnTipoCampo = (tcStr, tcInt, tcDat, tcDatHor, tcEsp, tcDe2, tcDe3, tcDe4 ); // tcEsp = String: somente numeros;
  TpcnFormatoGravacao = (fgXML, fgTXT);
  TpcnTagAssinatura = (taSempre, taNunca, taSomenteSeAssinada, taSomenteParaNaoAssinada);

  TpcnIndicadorPagamento = (ipVista, ipPrazo, ipOutras);
  TpcnTipoNFe = (tnEntrada, tnSaida);
  TpcnTipoImpressao = (tiRetrato, tiPaisagem);
  TpcnTipoEmissao = (teNormal, teContingencia, teSCAN, teDPEC, teFSDA);
  TpcnTipoAmbiente = (taProducao, taHomologacao);
  TpcnSituacaoEmissor = (seHomologacao, seProducao);
  TpcnFinalidadeNFe = (fnNormal, fnComplementar, fnAjuste);
  TpcnProcessoEmissao = (peAplicativoContribuinte, peAvulsaFisco, peAvulsaContribuinte, peContribuinteAplicativoFisco);
  TpcnTipoOperacao = (toVendaConcessionaria, toFaturamentoDireto, toVendaDireta, toOutros);
  TpcnCondicaoVeiculo = (cvAcabado, cvInacabado, cvSemiAcabado);
  TpcnTipoArma = (taUsoPermitido, taUsoRestrito);
  TpcnOrigemMercadoria = (oeNacional, oeEstrangeiraImportacaoDireta, oeEstrangeiraAdquiridaBrasil);
  TpcnCSTIcms = (cst00, cst10, cst20, cst30, cst40, cst41, cst50, cst51, cst60, cst70, cst90);
  TpcnDeterminacaoBaseIcms = (dbiMargemValorAgregado, dbiPauta, dbiPrecoTabelado, dbiValorOperacao);
  TpcnDeterminacaoBaseIcmsST = (dbisPrecoTabelado, dbisListaNegativa, dbisListaPositiva, dbisListaNeutra, dbisMargemValorAgregado, dbisPauta);
  TpcnCstIpi = (ipi00, ipi49, ipi50, ipi99, ipi01, ipi02, ipi03, ipi04, ipi05, ipi51, ipi52, ipi53, ipi54, ipi55);
  TpcnCstPis = (pis01, pis02, pis03, pis04, pis06, pis07, pis08, pis09, pis99);
  TpcnCstCofins = (cof01, cof02, cof03, cof04, cof06, cof07, cof08, cof09, cof99);
  TpcnModalidadeFrete = (mfContaEmitente, mfContaDestinatario);
  TpcnIndicadorProcesso = (ipSEFAZ, ipJusticaFederal, ipJusticaEstadual, ipSecexRFB, ipOutros);

function StrToEnumerado(var ok: boolean; const s: string; const AString: array of string;
  const AEnumerados: array of variant): variant;
function EnumeradoToStr(const t: variant; const AString:
  array of string; const AEnumerados: array of variant): variant;

function SchemaToStr(const t: TpcnSchema): string;
function StrToSchema(var ok: boolean; const s: string): TpcnSchema;
function TipoLayoutToStr(const t: TpcnTipoLayout): string;
function StrToTipoLayout(var ok: boolean; const s: string): TpcnTipoLayout;
function IndpagToStr(const t: TpcnIndicadorPagamento): string;
function StrToIndpag(var ok: boolean; const s: string): TpcnIndicadorPagamento;
function tpNFToStr(const t: TpcnTipoNFe): string;
function StrToTpNF(var ok: boolean; const s: string): TpcnTipoNFe;
function TpImpToStr(const t: TpcnTipoImpressao): string;
function StrToTpImp(var ok: boolean; const s: string): TpcnTipoImpressao;
function TpEmisToStr(const t: TpcnTipoEmissao): string;
function StrToTpEmis(var ok: boolean; const s: string): TpcnTipoEmissao;
function TpAmbToStr(const t: TpcnTipoAmbiente): string;
function StrToTpAmb(var ok: boolean; const s: string): TpcnTipoAmbiente;
function TpSitToStr(const t: TpcnSituacaoEmissor): string;
function StrToTpSit(var ok: boolean; const s: string): TpcnSituacaoEmissor;
function FinNFeToStr(const t: TpcnFinalidadeNFe): string;
function StrToFinNFe(var ok: boolean; const s: string): TpcnFinalidadeNFe;
function procEmiToStr(const t: TpcnProcessoEmissao): string;
function StrToprocEmi(var ok: boolean; const s: string): TpcnProcessoEmissao;
function tpOPToStr(const t: TpcnTipoOperacao): string;
function StrTotpOP(var ok: boolean; const s: string): TpcnTipoOperacao;
function condVeicToStr(const t: TpcnCondicaoVeiculo): string;
function StrTocondVeic(var ok: boolean; const s: string): TpcnCondicaoVeiculo;
function tpArmaToStr(const t: TpcnTipoArma): string;
function StrTotpArma(var ok: boolean; const s: string): TpcnTipoArma;
function OrigToStr(const t: TpcnOrigemMercadoria): string;
function StrToOrig(var ok: boolean; const s: string): TpcnOrigemMercadoria;
function CSTICMSToStr(const t: TpcnCSTIcms): string;
function StrToCSTICMS(var ok: boolean; const s: string): TpcnCSTIcms;
function CSTICMSToStrTagPos(const t: TpcnCSTIcms): string;
function modBCToStr(const t: TpcnDeterminacaoBaseIcms): string;
function StrTomodBC(var ok: boolean; const s: string): TpcnDeterminacaoBaseIcms;
function modBCSTToStr(const t: TpcnDeterminacaoBaseIcmsST): string;
function StrTomodBCST(var ok: boolean; const s: string): TpcnDeterminacaoBaseIcmsST;
function CSTIPIToStr(const t: TpcnCstIpi): string;
function StrToCSTIPI(var ok: boolean; const s: string): TpcnCstIpi;
function CSTPISToStr(const t: TpcnCstPIS): string;
function StrToCSTPIS(var ok: boolean; const s: string): TpcnCstPIS;
function CSTCOFINSToStr(const t: TpcnCstCOFINS): string;
function StrToCSTCOFINS(var ok: boolean; const s: string): TpcnCstCOFINS;
function modFreteToStr(const t: TpcnModalidadeFrete): string;
function StrTomodFrete(var ok: boolean; const s: string): TpcnModalidadeFrete;
function indProcToStr(const t: TpcnIndicadorProcesso): string;
function StrToindProc(var ok: boolean; const s: string): TpcnIndicadorProcesso;

implementation

function StrToEnumerado(var ok: boolean; const s: string; const AString:
  array of string; const AEnumerados: array of variant): variant;
var
  i: integer;
begin
  result := -1;
  for i := Low(AString) to High(AString) do
    if AnsiSameText(s, AString[i]) then
      result := AEnumerados[i];
  ok := result <> -1;
  if not ok then
    result := AEnumerados[0];
end;

function EnumeradoToStr(const t: variant; const AString:
  array of string; const AEnumerados: array of variant): variant;
var
  i: integer;
begin
  result := '';
  for i := Low(AEnumerados) to High(AEnumerados) do
    if t = AEnumerados[i] then
      result := AString[i];
end;

// Tipo de Schema **************************************************************

function SchemaToStr(const t: TpcnSchema): string;
begin
  result := EnumeradoToStr(t, ['PL005C'], [TsPL005c]);
end;

function StrToSchema(var ok: boolean; const s: string): TpcnSchema;
begin
  result := StrToEnumerado(ok, s, ['PL005C'], [TsPL005c]);
end;

// Tipo do Layout **************************************************************

function TipoLayoutToStr(const t: TpcnTipoLayout): string;
begin
  result := EnumeradoToStr(t, ['AtuCadEmiDFe', 'CadEmiDFe', 'CancNFe', 'ConsCad', 'ConsReciNFe', 'ConsSitNFe', 'ConsStatServ',
    'InutNFe', 'NFe', 'ProcNFe', 'ProcInutNFe', 'RetAtuCadEmiDFe', 'RetCancNFe', 'RetConsCad', 'RetConsReciNFe',
      'RetConsStatServ', 'RetConsSitNFe', 'RetEnvNFe', 'RetInutNFe', 'EnvNFe', 'ProcCancNFe'],
      [tlAtuCadEmiDFe, tlCadEmiDFe, tlCancNFe, tlConsCad, tlConsReciNFe, tlConsSitNFe, tlConsStatServ,
    tlInutNFe, tlNFe, tlProcNFe, tlProcInutNFe, tlRetAtuCadEmiDFe, tlRetCancNFe, tlRetConsCad, tlRetConsReciNFe,
      tlRetConsStatServ, tlRetConsSitNFe, tlRetEnvNFe, tlRetInutNFe, tlEnvNFe, tlProcCancNFe]);
end;

function StrToTipoLayout(var ok: boolean; const s: string): TpcnTipoLayout;
begin
  result := StrToEnumerado(ok, s, ['AtuCadEmiDFe', 'CadEmiDFe', 'CancNFe', 'ConsCad', 'ConsReciNFe', 'ConsSitNFe', 'ConsStatServ',
    'InutNFe', 'NFe', 'ProcNFe', 'ProcInutNFe', 'RetAtuCadEmiDFe', 'RetCancNFe', 'RetConsCad', 'RetConsReciNFe',
      'RetConsStatServ', 'RetConsSitNFe', 'RetEnvNFe', 'RetInutNFe', 'EnvNFe'],
      [tlAtuCadEmiDFe, tlCadEmiDFe, tlCancNFe, tlConsCad, tlConsReciNFe, tlConsSitNFe, tlConsStatServ,
    tlInutNFe, tlNFe, tlProcNFe, tlProcInutNFe, tlRetAtuCadEmiDFe, tlRetCancNFe, tlRetConsCad, tlRetConsReciNFe,
      tlRetConsStatServ, tlRetConsSitNFe, tlRetEnvNFe, tlRetInutNFe, tlEnvNFe]);
end;

// Indicador do Tipo de pagamento **********************************************

function IndpagToStr(const t: TpcnIndicadorPagamento): string;
begin
  result := EnumeradoToStr(t, ['0', '1', '2'], [ipVista, ipPrazo, ipOutras]);
end;

function StrToIndpag(var ok: boolean; const s: string): TpcnIndicadorPagamento;
begin
  result := StrToEnumerado(ok, s, ['0', '1', '2'], [ipVista, ipPrazo, ipOutras]);
end;

// B11 - Tipo do Documento Fiscal **********************************************

function tpNFToStr(const t: TpcnTipoNFe): string;
begin
  result := EnumeradoToStr(t, ['0', '1'], [tnEntrada, tnSaida]);
end;

function StrToTpNF(var ok: boolean; const s: string): TpcnTipoNFe;
begin
  result := StrToEnumerado(ok, s, ['0', '1'], [tnEntrada, tnSaida]);
end;

// B21 - Formato de Impress�o do DANFE *****************************************

function TpImpToStr(const t: TpcnTipoImpressao): string;
begin
  result := EnumeradoToStr(t, ['1', '2'], [tiRetrato, tiPaisagem]);
end;

function StrToTpImp(var ok: boolean; const s: string): TpcnTipoImpressao;
begin
  result := StrToEnumerado(ok, s, ['1', '2'], [tiRetrato, tiPaisagem]);
end;

// B22 - Forma de Emiss�o da NF-e **********************************************

function TpEmisToStr(const t: TpcnTipoEmissao): string;
begin
  result := EnumeradoToStr(t, ['1', '2', '3', '4', '5'], [teNormal, teContingencia, teSCAN, teDPEC, teFSDA]);
end;

function StrToTpEmis(var ok: boolean; const s: string): TpcnTipoEmissao;
begin
  result := StrToEnumerado(ok, s, ['1', '2', '3', '4', '5'], [teNormal, teContingencia, teSCAN, teDPEC, teFSDA]);
end;

// B24 - Identifica��o do Ambiente *********************************************

function TpAmbToStr(const t: TpcnTipoAmbiente): string;
begin
  result := EnumeradoToStr(t, ['1', '2'], [taProducao, taHomologacao]);
end;

function StrToTpAmb(var ok: boolean; const s: string): TpcnTipoAmbiente;
begin
  result := StrToEnumerado(ok, s, ['1', '2'], [taProducao, taHomologacao]);
end;

// *** - Situacao Emissor ******************************************************

function TpSitToStr(const t: TpcnSituacaoEmissor): string;
begin
  result := EnumeradoToStr(t, ['0', '1'], [seHomologacao, seProducao]);
end;

function StrToTpSit(var ok: boolean; const s: string): TpcnSituacaoEmissor;
begin
  result := StrToEnumerado(ok, s, ['0', '1'], [seHomologacao, seProducao]);
end;

// B25 - Finalidade de emiss�o da NF-e *****************************************

function FinNFeToStr(const t: TpcnFinalidadeNFe): string;
begin
  result := EnumeradoToStr(t, ['1', '2', '3'], [fnNormal, fnComplementar, fnAjuste]);
end;

function StrToFinNFe(var ok: boolean; const s: string): TpcnFinalidadeNFe;
begin
  result := StrToEnumerado(ok, s, ['1', '2', '3'], [fnNormal, fnComplementar, fnAjuste]);
end;

// B26 - Processo de emiss�o da NF-e *******************************************

function procEmiToStr(const t: TpcnProcessoEmissao): string;
begin
  // 0 - emiss�o de NF-e com aplicativo do contribuinte;
  // 1 - emiss�o de NF-e avulsa pelo Fisco;
  // 2 - emiss�o de NF-e avulsa, pelo contribuinte com seu certificado digital, atrav�s do site do Fisco;
  // 3 - emiss�o NF-e pelo contribuinte com aplicativo fornecido pelo Fisco.
  result := EnumeradoToStr(t, ['0', '1', '2', '3'], [peAplicativoContribuinte, peAvulsaFisco, peAvulsaContribuinte, peContribuinteAplicativoFisco]);
end;

function StrToprocEmi(var ok: boolean; const s: string): TpcnProcessoEmissao;
begin
  result := StrToEnumerado(ok, s, ['0', '1', '2', '3'], [peAplicativoContribuinte, peAvulsaFisco, peAvulsaContribuinte, peContribuinteAplicativoFisco]);
end;

// J02 - Tipo da opera��o ******************************************************

function tpOPToStr(const t: TpcnTipoOperacao): string;
begin
  result := EnumeradoToStr(t, ['1', '2', '3', '0'], [toVendaConcessionaria, toFaturamentoDireto, toVendaDireta, toOutros]);
end;

function StrTotpOP(var ok: boolean; const s: string): TpcnTipoOperacao;
begin
  result := StrToEnumerado(ok, s, ['1', '2', '3', '0'], [toVendaConcessionaria, toFaturamentoDireto, toVendaDireta, toOutros]);
end;

// J22 - Condi��o do Ve�culo ***************************************************

function condVeicToStr(const t: TpcnCondicaoVeiculo): string;
begin
  result := EnumeradoToStr(t, ['1', '2', '3'], [cvAcabado, cvInacabado, cvSemiAcabado]);
end;

function StrTocondVeic(var ok: boolean; const s: string): TpcnCondicaoVeiculo;
begin
  result := StrToEnumerado(ok, s, ['1', '2', '3'], [cvAcabado, cvInacabado, cvSemiAcabado]);
end;

// L02 - Indicador do tipo de arma de fogo *************************************

function tpArmaToStr(const t: TpcnTipoArma): string;
begin
  result := EnumeradoToStr(t, ['0', '1'], [taUsoPermitido, taUsoRestrito]);
end;

function StrTotpArma(var ok: boolean; const s: string): TpcnTipoArma;
begin
  result := StrToEnumerado(ok, s, ['0', '1'], [taUsoPermitido, taUsoRestrito]);
end;

// N11 - Origem da mercadoria **************************************************

function OrigToStr(const t: TpcnOrigemMercadoria): string;
begin
  result := EnumeradoToStr(t, ['0', '1', '2'], [oeNacional, oeEstrangeiraImportacaoDireta, oeEstrangeiraAdquiridaBrasil]);
end;

function StrToOrig(var ok: boolean; const s: string): TpcnOrigemMercadoria;
begin
  result := StrToEnumerado(ok, s, ['0', '1', '2'], [oeNacional, oeEstrangeiraImportacaoDireta, oeEstrangeiraAdquiridaBrasil]);
end;

// CST ICMS ********************************************************************

function CSTICMSToStr(const t: TpcnCSTIcms): string;
begin
  // ID -> N02 - Tributada integralmente
  // ID -> N03 - Tributada e com cobran�a do ICMS por substitui��o tribut�ria
  // ID -> N04 - Com redu��o de base de c�lculo
  // ID -> N05 - Isenta ou n�o tributada e com cobran�a do ICMS por substitui��o tribut�ria
  // ID -> N06 - Isenta
  // ID -> N06 - N�o tributada
  // ID -> N06 - Suspens�o
  // ID -> N07 - Diferimento A exig�ncia do preenchimento das informa��es do ICMS diferido fica � crit�rio de cada UF.
  // ID -> N08 - ICMS cobrado anteriormente por substitui��o
  // ID -> N09 - Com redu��o de base de c�lculo e cobran�a do ICMS por substitui��o tribut�ria
  // ID -> N10 - Outros
  result := EnumeradoToStr(t, ['00', '10', '20', '30', '40', '41', '50', '51', '60', '70', '90'],
    [cst00, cst10, cst20, cst30, cst40, cst41, cst50, cst51, cst60, cst70, cst90]);
end;

function StrToCSTICMS(var ok: boolean; const s: string): TpcnCSTIcms;
begin
  result := StrToEnumerado(ok, s, ['00', '10', '20', '30', '40', '41', '50', '51', '60', '70', '90'],
    [cst00, cst10, cst20, cst30, cst40, cst41, cst50, cst51, cst60, cst70, cst90]);
end;

function CSTICMSToStrTagPos(const t: TpcnCSTIcms): string;
begin
  result := EnumeradoToStr(t, ['02', '03', '04', '05', '06', '06', '06', '07', '08', '09', '10'],
    [cst00, cst10, cst20, cst30, cst40, cst41, cst50, cst51, cst60, cst70, cst90]);
end;

// N13 - Modalidade de determina��o da BC do ICMS ******************************

function modBCToStr(const t: TpcnDeterminacaoBaseIcms): string;
begin
  // 0 - Margem Valor Agregado (%);
  // 1 - Pauta (Valor);
  // 2 - Pre�o Tabelado M�x. (valor);
  // 3 - valor da opera��o.
  result := EnumeradoToStr(t, ['0', '1', '2', '3'],
    [dbiMargemValorAgregado, dbiPauta, dbiPrecoTabelado, dbiValorOperacao]);
end;

function StrTomodBC(var ok: boolean; const s: string): TpcnDeterminacaoBaseIcms;
begin
  result := StrToEnumerado(ok, s, ['0', '1', '2', '3'],
    [dbiMargemValorAgregado, dbiPauta, dbiPrecoTabelado, dbiValorOperacao]);
end;

// N18 - Modalidade de determina��o da BC do ICMS ST ***************************

function modBCSTToStr(const t: TpcnDeterminacaoBaseIcmsST): string;
begin
  // 0 � Pre�o tabelado ou m�ximo sugerido;
  // 1 - Lista Negativa (valor);
  // 2 - Lista Positiva (valor);
  // 3 - Lista Neutra (valor);
  // 4 - Margem Valor Agregado (%);
  // 5 - Pauta (valor);
  result := EnumeradoToStr(t, ['0', '1', '2', '3', '4', '5'],
    [dbisPrecoTabelado, dbisListaNegativa, dbisListaPositiva, dbisListaNeutra, dbisMargemValorAgregado, dbisPauta]);
end;

function StrTomodBCST(var ok: boolean; const s: string): TpcnDeterminacaoBaseIcmsST;
begin
  result := StrToEnumerado(ok, s, ['0', '1', '2', '3', '4', '5'],
    [dbisPrecoTabelado, dbisListaNegativa, dbisListaPositiva, dbisListaNeutra, dbisMargemValorAgregado, dbisPauta]);
end;

// CST IPI *********************************************************************

function CSTIPIToStr(const t: TpcnCstIpi): string;
begin
  result := EnumeradoToStr(t, ['00', '49', '50', '99', '01', '02', '03', '04', '05', '51', '52', '53', '54', '55'],
    [ipi00, ipi49, ipi50, ipi99, ipi01, ipi02, ipi03, ipi04, ipi05, ipi51, ipi52, ipi53, ipi54, ipi55]);
end;

function StrToCSTIPI(var ok: boolean; const s: string): TpcnCstIpi;
begin
  result := StrToEnumerado(ok, s, ['00', '49', '50', '99', '01', '02', '03', '04', '05', '51', '52', '53', '54', '55'],
    [ipi00, ipi49, ipi50, ipi99, ipi01, ipi02, ipi03, ipi04, ipi05, ipi51, ipi52, ipi53, ipi54, ipi55]);
end;

// CST PIS *********************************************************************

function CSTPISToStr(const t: TpcnCstPIS): string;
begin
  result := EnumeradoToStr(t, ['01', '02', '03', '04', '06', '07', '08', '09', '99'],
    [pis01, pis02, pis03, pis04, pis06, pis07, pis08, pis09, pis99]);
end;

function StrToCSTPIS(var ok: boolean; const s: string): TpcnCstPIS;
begin
  result := StrToEnumerado(ok, s, ['01', '02', '03', '04', '06', '07', '08', '09', '99'],
    [pis01, pis02, pis03, pis04, pis06, pis07, pis08, pis09, pis99]);
end;

// CST COFINS ******************************************************************

function CSTCOFINSToStr(const t: TpcnCstCOFINS): string;
begin
  result := EnumeradoToStr(t, ['01', '02', '03', '04', '06', '07', '08', '09', '99'],
    [cof01, cof02, cof03, cof04, cof06, cof07, cof08, cof09, cof99]);
end;

function StrToCSTCOFINS(var ok: boolean; const s: string): TpcnCstCOFINS;
begin
  result := StrToEnumerado(ok, s, ['01', '02', '03', '04', '06', '07', '08', '09', '99'],
    [cof01, cof02, cof03, cof04, cof06, cof07, cof08, cof09, cof99]);
end;

// ??? - Modalidade do frete ***************************************************

function modFreteToStr(const t: TpcnModalidadeFrete): string;
begin
  result := EnumeradoToStr(t, ['0', '1'], [mfContaEmitente, mfContaDestinatario]);
end;

function StrTomodFrete(var ok: boolean; const s: string): TpcnModalidadeFrete;
begin
  result := StrToEnumerado(ok, s, ['0', '1'], [mfContaEmitente, mfContaDestinatario]);
end;

// 401i - Indicador da origem do processo **************************************

function indProcToStr(const t: TpcnIndicadorProcesso): string;
begin
  result := EnumeradoToStr(t, ['0', '1', '2', '3', '4'], [ipSEFAZ, ipJusticaFederal, ipJusticaEstadual, ipSecexRFB, ipOutros]);
end;

function StrToindProc(var ok: boolean; const s: string): TpcnIndicadorProcesso;
begin
  result := StrToEnumerado(ok, s, ['0', '1', '2', '3', '4'], [ipSEFAZ, ipJusticaFederal, ipJusticaEstadual, ipSecexRFB, ipOutros]);
end;

end.

