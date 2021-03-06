package br.com.msystem.vo;
// Generated 12/03/2013 13:33:49 by Hibernate Tools 3.4.0.CR1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Clientes generated by hbm2java
 */
@Entity
@Table(name="clientes"
    ,catalog="handy"
    , uniqueConstraints = @UniqueConstraint(columnNames="CODIGO_CLIENTE") 
)
public class Clientes  implements java.io.Serializable {


     private int clienteSq;
     private Transportadoras transportadoras;
     private Classificacao classificacao;
     private TipoCliente tipoCliente;
     private Usuarios usuarios;
     private Vendedores vendedores;
     private String codigoCliente;
     private String nomeCliente;
     private String inscrEstadual;
     private String endereco;
     private String numero;
     private String bairro;
     private String complEndereco;
     private String cidade;
     private String estado;
     private String cep;
     private String dddFone1;
     private String numeroFone1;
     private String complFone1;
     private String dddFone2;
     private String numeroFone2;
     private String complFone2;
     private String dddFone3;
     private String numeroFone3;
     private String complFone3;
     private String dddCelular;
     private String numeroCelular;
     private String complCelular;
     private String dddFax;
     private String numeroFax;
     private String complFax;
     private String EMail;
     private String webSite;
     private String contato;
     private String pais;
     private String observacao;
     private String revenda;
     private String biro;
     private BigDecimal capitalAtual;
     private String nomeFantasia;
     private Integer ramoAtividadeSq;
     private BigDecimal faturamentoMensal;
     private Date dataFundacao;
     private String inscrMunicipal;
     private Date dataCadastro;
     private Date dataAlt;
     private BigDecimal pctComissaoPropria;
     private BigDecimal pctComissaoParceria;
     private String baseComissao;
     private BigDecimal pctComissaoDesconto;
     private String obsComissaoDesconto;
     private String cnae;
     private Set<Agenda> agendas = new HashSet<Agenda>(0);
     private Set<Pedidos> pedidoses = new HashSet<Pedidos>(0);
     private Set<NfServicos> nfServicoses = new HashSet<NfServicos>(0);
     private Set<NfEntradas> nfEntradases = new HashSet<NfEntradas>(0);
     private Set<ProdutosFaltantes> produtosFaltanteses = new HashSet<ProdutosFaltantes>(0);
     private Set<Nfiscais> nfiscaises = new HashSet<Nfiscais>(0);
     private Set<ContasPagarAuto> contasPagarAutos = new HashSet<ContasPagarAuto>(0);
     private Set<Assistencias> assistenciases = new HashSet<Assistencias>(0);
     private Set<Contatos> contatoses = new HashSet<Contatos>(0);

    public Clientes() {
    }

	
    public Clientes(String codigoCliente, String nomeCliente) {
        this.codigoCliente = codigoCliente;
        this.nomeCliente = nomeCliente;
    }
    public Clientes(Transportadoras transportadoras, Classificacao classificacao, TipoCliente tipoCliente, Usuarios usuarios, Vendedores vendedores, String codigoCliente, String nomeCliente, String inscrEstadual, String endereco, String numero, String bairro, String complEndereco, String cidade, String estado, String cep, String dddFone1, String numeroFone1, String complFone1, String dddFone2, String numeroFone2, String complFone2, String dddFone3, String numeroFone3, String complFone3, String dddCelular, String numeroCelular, String complCelular, String dddFax, String numeroFax, String complFax, String EMail, String webSite, String contato, String pais, String observacao, String revenda, String biro, BigDecimal capitalAtual, String nomeFantasia, Integer ramoAtividadeSq, BigDecimal faturamentoMensal, Date dataFundacao, String inscrMunicipal, Date dataCadastro, Date dataAlt, BigDecimal pctComissaoPropria, BigDecimal pctComissaoParceria, String baseComissao, BigDecimal pctComissaoDesconto, String obsComissaoDesconto, String cnae, Set<Agenda> agendas, Set<Pedidos> pedidoses, Set<NfServicos> nfServicoses, Set<NfEntradas> nfEntradases, Set<ProdutosFaltantes> produtosFaltanteses, Set<Nfiscais> nfiscaises, Set<ContasPagarAuto> contasPagarAutos, Set<Assistencias> assistenciases, Set<Contatos> contatoses) {
       this.transportadoras = transportadoras;
       this.classificacao = classificacao;
       this.tipoCliente = tipoCliente;
       this.usuarios = usuarios;
       this.vendedores = vendedores;
       this.codigoCliente = codigoCliente;
       this.nomeCliente = nomeCliente;
       this.inscrEstadual = inscrEstadual;
       this.endereco = endereco;
       this.numero = numero;
       this.bairro = bairro;
       this.complEndereco = complEndereco;
       this.cidade = cidade;
       this.estado = estado;
       this.cep = cep;
       this.dddFone1 = dddFone1;
       this.numeroFone1 = numeroFone1;
       this.complFone1 = complFone1;
       this.dddFone2 = dddFone2;
       this.numeroFone2 = numeroFone2;
       this.complFone2 = complFone2;
       this.dddFone3 = dddFone3;
       this.numeroFone3 = numeroFone3;
       this.complFone3 = complFone3;
       this.dddCelular = dddCelular;
       this.numeroCelular = numeroCelular;
       this.complCelular = complCelular;
       this.dddFax = dddFax;
       this.numeroFax = numeroFax;
       this.complFax = complFax;
       this.EMail = EMail;
       this.webSite = webSite;
       this.contato = contato;
       this.pais = pais;
       this.observacao = observacao;
       this.revenda = revenda;
       this.biro = biro;
       this.capitalAtual = capitalAtual;
       this.nomeFantasia = nomeFantasia;
       this.ramoAtividadeSq = ramoAtividadeSq;
       this.faturamentoMensal = faturamentoMensal;
       this.dataFundacao = dataFundacao;
       this.inscrMunicipal = inscrMunicipal;
       this.dataCadastro = dataCadastro;
       this.dataAlt = dataAlt;
       this.pctComissaoPropria = pctComissaoPropria;
       this.pctComissaoParceria = pctComissaoParceria;
       this.baseComissao = baseComissao;
       this.pctComissaoDesconto = pctComissaoDesconto;
       this.obsComissaoDesconto = obsComissaoDesconto;
       this.cnae = cnae;
       this.agendas = agendas;
       this.pedidoses = pedidoses;
       this.nfServicoses = nfServicoses;
       this.nfEntradases = nfEntradases;
       this.produtosFaltanteses = produtosFaltanteses;
       this.nfiscaises = nfiscaises;
       this.contasPagarAutos = contasPagarAutos;
       this.assistenciases = assistenciases;
       this.contatoses = contatoses;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="CLIENTE_SQ", unique=true, nullable=false)
    public int getClienteSq() {
        return this.clienteSq;
    }
    
    public void setClienteSq(int clienteSq) {
        this.clienteSq = clienteSq;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="TRANSPORTADORA_SQ")
    public Transportadoras getTransportadoras() {
        return this.transportadoras;
    }
    
    public void setTransportadoras(Transportadoras transportadoras) {
        this.transportadoras = transportadoras;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CLASSIFICACAO_SQ")
    public Classificacao getClassificacao() {
        return this.classificacao;
    }
    
    public void setClassificacao(Classificacao classificacao) {
        this.classificacao = classificacao;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="tipo_cliente_sq")
    public TipoCliente getTipoCliente() {
        return this.tipoCliente;
    }
    
    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="USUARIO_SQ_ALT")
    public Usuarios getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="vendedor_sq")
    public Vendedores getVendedores() {
        return this.vendedores;
    }
    
    public void setVendedores(Vendedores vendedores) {
        this.vendedores = vendedores;
    }

    
    @Column(name="CODIGO_CLIENTE", unique=true, nullable=false, length=15)
    public String getCodigoCliente() {
        return this.codigoCliente;
    }
    
    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    
    @Column(name="NOME_CLIENTE", nullable=false, length=50)
    public String getNomeCliente() {
        return this.nomeCliente;
    }
    
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    
    @Column(name="INSCR_ESTADUAL", length=20)
    public String getInscrEstadual() {
        return this.inscrEstadual;
    }
    
    public void setInscrEstadual(String inscrEstadual) {
        this.inscrEstadual = inscrEstadual;
    }

    
    @Column(name="ENDERECO", length=50)
    public String getEndereco() {
        return this.endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    
    @Column(name="NUMERO", length=20)
    public String getNumero() {
        return this.numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }

    
    @Column(name="BAIRRO", length=30)
    public String getBairro() {
        return this.bairro;
    }
    
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    
    @Column(name="COMPL_ENDERECO", length=50)
    public String getComplEndereco() {
        return this.complEndereco;
    }
    
    public void setComplEndereco(String complEndereco) {
        this.complEndereco = complEndereco;
    }

    
    @Column(name="CIDADE", length=30)
    public String getCidade() {
        return this.cidade;
    }
    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    
    @Column(name="ESTADO", length=2)
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    @Column(name="CEP", length=8)
    public String getCep() {
        return this.cep;
    }
    
    public void setCep(String cep) {
        this.cep = cep;
    }

    
    @Column(name="DDD_FONE1", length=4)
    public String getDddFone1() {
        return this.dddFone1;
    }
    
    public void setDddFone1(String dddFone1) {
        this.dddFone1 = dddFone1;
    }

    
    @Column(name="NUMERO_FONE1", length=15)
    public String getNumeroFone1() {
        return this.numeroFone1;
    }
    
    public void setNumeroFone1(String numeroFone1) {
        this.numeroFone1 = numeroFone1;
    }

    
    @Column(name="COMPL_FONE1", length=10)
    public String getComplFone1() {
        return this.complFone1;
    }
    
    public void setComplFone1(String complFone1) {
        this.complFone1 = complFone1;
    }

    
    @Column(name="DDD_FONE2", length=4)
    public String getDddFone2() {
        return this.dddFone2;
    }
    
    public void setDddFone2(String dddFone2) {
        this.dddFone2 = dddFone2;
    }

    
    @Column(name="NUMERO_FONE2", length=15)
    public String getNumeroFone2() {
        return this.numeroFone2;
    }
    
    public void setNumeroFone2(String numeroFone2) {
        this.numeroFone2 = numeroFone2;
    }

    
    @Column(name="COMPL_FONE2", length=10)
    public String getComplFone2() {
        return this.complFone2;
    }
    
    public void setComplFone2(String complFone2) {
        this.complFone2 = complFone2;
    }

    
    @Column(name="DDD_FONE3", length=4)
    public String getDddFone3() {
        return this.dddFone3;
    }
    
    public void setDddFone3(String dddFone3) {
        this.dddFone3 = dddFone3;
    }

    
    @Column(name="NUMERO_FONE3", length=15)
    public String getNumeroFone3() {
        return this.numeroFone3;
    }
    
    public void setNumeroFone3(String numeroFone3) {
        this.numeroFone3 = numeroFone3;
    }

    
    @Column(name="COMPL_FONE3", length=10)
    public String getComplFone3() {
        return this.complFone3;
    }
    
    public void setComplFone3(String complFone3) {
        this.complFone3 = complFone3;
    }

    
    @Column(name="DDD_CELULAR", length=4)
    public String getDddCelular() {
        return this.dddCelular;
    }
    
    public void setDddCelular(String dddCelular) {
        this.dddCelular = dddCelular;
    }

    
    @Column(name="NUMERO_CELULAR", length=15)
    public String getNumeroCelular() {
        return this.numeroCelular;
    }
    
    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    
    @Column(name="COMPL_CELULAR", length=10)
    public String getComplCelular() {
        return this.complCelular;
    }
    
    public void setComplCelular(String complCelular) {
        this.complCelular = complCelular;
    }

    
    @Column(name="DDD_FAX", length=4)
    public String getDddFax() {
        return this.dddFax;
    }
    
    public void setDddFax(String dddFax) {
        this.dddFax = dddFax;
    }

    
    @Column(name="NUMERO_FAX", length=15)
    public String getNumeroFax() {
        return this.numeroFax;
    }
    
    public void setNumeroFax(String numeroFax) {
        this.numeroFax = numeroFax;
    }

    
    @Column(name="COMPL_FAX", length=10)
    public String getComplFax() {
        return this.complFax;
    }
    
    public void setComplFax(String complFax) {
        this.complFax = complFax;
    }

    
    @Column(name="E_MAIL", length=100)
    public String getEMail() {
        return this.EMail;
    }
    
    public void setEMail(String EMail) {
        this.EMail = EMail;
    }

    
    @Column(name="WEB_SITE", length=100)
    public String getWebSite() {
        return this.webSite;
    }
    
    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    
    @Column(name="CONTATO", length=50)
    public String getContato() {
        return this.contato;
    }
    
    public void setContato(String contato) {
        this.contato = contato;
    }

    
    @Column(name="PAIS", length=20)
    public String getPais() {
        return this.pais;
    }
    
    public void setPais(String pais) {
        this.pais = pais;
    }

    
    @Column(name="OBSERVACAO", length=65535)
    public String getObservacao() {
        return this.observacao;
    }
    
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    
    @Column(name="REVENDA", length=1)
    public String getRevenda() {
        return this.revenda;
    }
    
    public void setRevenda(String revenda) {
        this.revenda = revenda;
    }

    
    @Column(name="BIRO", length=1)
    public String getBiro() {
        return this.biro;
    }
    
    public void setBiro(String biro) {
        this.biro = biro;
    }

    
    @Column(name="CAPITAL_ATUAL", precision=9)
    public BigDecimal getCapitalAtual() {
        return this.capitalAtual;
    }
    
    public void setCapitalAtual(BigDecimal capitalAtual) {
        this.capitalAtual = capitalAtual;
    }

    
    @Column(name="NOME_FANTASIA", length=50)
    public String getNomeFantasia() {
        return this.nomeFantasia;
    }
    
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    
    @Column(name="RAMO_ATIVIDADE_SQ")
    public Integer getRamoAtividadeSq() {
        return this.ramoAtividadeSq;
    }
    
    public void setRamoAtividadeSq(Integer ramoAtividadeSq) {
        this.ramoAtividadeSq = ramoAtividadeSq;
    }

    
    @Column(name="FATURAMENTO_MENSAL", precision=9)
    public BigDecimal getFaturamentoMensal() {
        return this.faturamentoMensal;
    }
    
    public void setFaturamentoMensal(BigDecimal faturamentoMensal) {
        this.faturamentoMensal = faturamentoMensal;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="DATA_FUNDACAO", length=19)
    public Date getDataFundacao() {
        return this.dataFundacao;
    }
    
    public void setDataFundacao(Date dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    
    @Column(name="INSCR_MUNICIPAL", length=20)
    public String getInscrMunicipal() {
        return this.inscrMunicipal;
    }
    
    public void setInscrMunicipal(String inscrMunicipal) {
        this.inscrMunicipal = inscrMunicipal;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="DATA_CADASTRO", length=19)
    public Date getDataCadastro() {
        return this.dataCadastro;
    }
    
    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="DATA_ALT", length=19)
    public Date getDataAlt() {
        return this.dataAlt;
    }
    
    public void setDataAlt(Date dataAlt) {
        this.dataAlt = dataAlt;
    }

    
    @Column(name="pct_comissao_propria", precision=4)
    public BigDecimal getPctComissaoPropria() {
        return this.pctComissaoPropria;
    }
    
    public void setPctComissaoPropria(BigDecimal pctComissaoPropria) {
        this.pctComissaoPropria = pctComissaoPropria;
    }

    
    @Column(name="pct_comissao_parceria", precision=4)
    public BigDecimal getPctComissaoParceria() {
        return this.pctComissaoParceria;
    }
    
    public void setPctComissaoParceria(BigDecimal pctComissaoParceria) {
        this.pctComissaoParceria = pctComissaoParceria;
    }

    
    @Column(name="base_comissao", length=1)
    public String getBaseComissao() {
        return this.baseComissao;
    }
    
    public void setBaseComissao(String baseComissao) {
        this.baseComissao = baseComissao;
    }

    
    @Column(name="pct_comissao_desconto", precision=4)
    public BigDecimal getPctComissaoDesconto() {
        return this.pctComissaoDesconto;
    }
    
    public void setPctComissaoDesconto(BigDecimal pctComissaoDesconto) {
        this.pctComissaoDesconto = pctComissaoDesconto;
    }

    
    @Column(name="obs_comissao_desconto", length=100)
    public String getObsComissaoDesconto() {
        return this.obsComissaoDesconto;
    }
    
    public void setObsComissaoDesconto(String obsComissaoDesconto) {
        this.obsComissaoDesconto = obsComissaoDesconto;
    }

    
    @Column(name="cnae", length=7)
    public String getCnae() {
        return this.cnae;
    }
    
    public void setCnae(String cnae) {
        this.cnae = cnae;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="clientes")
    public Set<Agenda> getAgendas() {
        return this.agendas;
    }
    
    public void setAgendas(Set<Agenda> agendas) {
        this.agendas = agendas;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="clientes")
    public Set<Pedidos> getPedidoses() {
        return this.pedidoses;
    }
    
    public void setPedidoses(Set<Pedidos> pedidoses) {
        this.pedidoses = pedidoses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="clientes")
    public Set<NfServicos> getNfServicoses() {
        return this.nfServicoses;
    }
    
    public void setNfServicoses(Set<NfServicos> nfServicoses) {
        this.nfServicoses = nfServicoses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="clientes")
    public Set<NfEntradas> getNfEntradases() {
        return this.nfEntradases;
    }
    
    public void setNfEntradases(Set<NfEntradas> nfEntradases) {
        this.nfEntradases = nfEntradases;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="clientes")
    public Set<ProdutosFaltantes> getProdutosFaltanteses() {
        return this.produtosFaltanteses;
    }
    
    public void setProdutosFaltanteses(Set<ProdutosFaltantes> produtosFaltanteses) {
        this.produtosFaltanteses = produtosFaltanteses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="clientes")
    public Set<Nfiscais> getNfiscaises() {
        return this.nfiscaises;
    }
    
    public void setNfiscaises(Set<Nfiscais> nfiscaises) {
        this.nfiscaises = nfiscaises;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="clientes")
    public Set<ContasPagarAuto> getContasPagarAutos() {
        return this.contasPagarAutos;
    }
    
    public void setContasPagarAutos(Set<ContasPagarAuto> contasPagarAutos) {
        this.contasPagarAutos = contasPagarAutos;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="clientes")
    public Set<Assistencias> getAssistenciases() {
        return this.assistenciases;
    }
    
    public void setAssistenciases(Set<Assistencias> assistenciases) {
        this.assistenciases = assistenciases;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="clientes")
    public Set<Contatos> getContatoses() {
        return this.contatoses;
    }
    
    public void setContatoses(Set<Contatos> contatoses) {
        this.contatoses = contatoses;
    }




}


