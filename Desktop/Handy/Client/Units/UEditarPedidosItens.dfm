�
 TFEDITARPEDIDOSITENS 0w  TPF0TFEditarPedidosItensFEditarPedidosItensLeft�Top<HelpType	htKeywordHelpKeywordItens dos PedidosBorderIconsbiSystemMenu BorderStylebsSingleCaptionEditar item do pedidoClientHeight�ClientWidthSColor	clBtnFaceFont.CharsetDEFAULT_CHARSET
Font.ColorclWindowTextFont.Height�	Font.NameMS Sans Serif
Font.Style 
KeyPreview	OldCreateOrderPositionpoScreenCenterOnCreate
FormCreatePixelsPerInch`
TextHeight TLabelLabel1LeftTopWidth!Height	AlignmenttaRightJustifyCaptionPedido  TLabelLabel3LeftTopXWidth7Height	AlignmenttaRightJustifyCaption
Quantidade  TLabel
lblProdutoLefthTopWidth%HeightCursorcrHandPoint	AlignmenttaRightJustifyCaptionProdutoFocusControldblcProdutoOnClicklblProdutoClick  TLabelLabel8LeftTop8Width!Height	AlignmenttaRightJustifyCaptionN.C.M.  TLabelLabel2LeftTop�WidthCHeightCaptionVlr. Unit (US$)  TLabelLabel6Left`Top�Width=HeightCaptionVlr Desconto  TLabelLabel9Left`TopXWidthHHeightCaption% de Desconto  TLabelLabel10Left� Top8Width1Height	AlignmenttaRightJustifyCaption
Aliq. ICMS  TLabelLabel11LefthTop8Width$Height	AlignmenttaRightJustifyCaption	Aliq. IPI  TLabelLabel12Left Top�Width)HeightCaptionVlr ICMS  TLabelLabel13Left�Top�WidthHeightCaptionVlr IPI  TLabelLabel14Left�Top�WidthDHeightCaptionVlr Total s/ IPI  TLabelLabel15Left TopXWidth.HeightCaption	Aliq ICMS  TLabelLabel16Left�TopXWidth!HeightCaptionAliq IPI  TLabelLabel22Left Top8Width4HeightCaption
Peso Bruto  TLabelLabel23LeftxTop8Width?HeightCaption   Peso Líquido  TLabelLabel24Left� Top�Width(HeightCaption	Vlr Juros  TLabelLabel25Left� TopXWidth3HeightCaption
% de Juros  TLabelLabel7LeftPTop�Width:HeightCaptionVlr ICMS-ST  TLabelLabel17LeftPTopXWidthFHeightCaptionBase ICMS-ST  TSpeedButton	sbIncluirLeft@Top� WidthHeight
Glyph.Data
�   �   BM�       v   (               p                        �  �   �� �   � � ��  ��� ���   �  �   �� �   � � ��  ��� 3333333 3333333 3333333 330 333 330�333 330�333 3  � 3 3���3 3  � 3 330�333 330�333 330 333 3333333 3333333 OnClicksbIncluirClick  TSpeedButton	sbExcluirLeft@Top� WidthHeight
Glyph.Data
�   �   BM�       v   (               p                        �  �   �� �   � � ��  ��� ���   �  �   �� �   � � ��  ��� 3333333 3333333 3333333 3333333 3333333 3333333 3     3 3����3 3     3 3333333 3333333 3333333 3333333 3333333 OnClicksbExcluirClick  TLabellabelNumeroSerieLeftTop� WidthRHeightCaption   Números de série  TLabelLabel4LeftTophWidth'Height	AlignmenttaRightJustifyCaptionEstoque  TPanelPanel1Left Top�WidthSHeightAlignalBottomTabOrder TBitBtnbbOkLeft�TopWidthKHeightCaptionSalvarDefault	ModalResultTabOrder OnClick	bbOkClick
Glyph.Data
�  �  BM�      v   (   $            h                       �  �   �� �   � � ��  ��� ���   �  �   �� �   � � ��  ��� 333333333333333333  333333333333�33333  334C33333338�33333  33B$3333333�8�3333  34""C33333833�3333  3B""$33333�338�333  4"*""C3338�8�3�333  2"��"C3338�3�333  :*3:"$3338�38�8�33  3�33�"C333�33�3�33  3333:"$3333338�8�3  33333�"C333333�3�3  33333:"$3333338�8�  333333�"C333333�3�  333333:"C3333338�  3333333�#3333333��  3333333:3333333383  333333333333333333  	NumGlyphs  TBitBtn
bbCancelarLeft�TopWidthKHeightCaptionCancelarTabOrderKindbkCancel   TDBEditDBEdit2LeftTopHWidthPHeightTabStop	DataField
CODIGO_NBM
DataSourcedsListaProdutosTabOrder  TDBEditDBEdit9Left� TopHWidthAHeightTabStop	DataField	ALIQ_ICMS
DataSourcedsListaProdutosTabOrder  TDBEditDBEdit10LefthTopHWidthAHeightTabStop	DataFieldALIQ_IPI
DataSourcedsListaProdutosTabOrder  TRzEditedPedidoLeftTopWidthIHeightTabStopColorclInfoBkFrameHotTrack	FrameVisible	ReadOnly	TabOrder   TRzNumericEditedQtdeLeftTophWidthIHeightFrameHotTrack	FrameVisible	TabOrderOnExit
edQtdeExitDisplayFormat,0;(,0)  TRzNumericEditedPrecoLeftTop�WidthIHeightFrameHotTrack	FrameVisible	TabOrderOnExit
edQtdeExitIntegersOnlyDisplayFormat,0.00;(,0.00)  TRzNumericEdit	edVlrDescLeft`Top�WidthIHeightFrameHotTrack	FrameVisible	TabOrderOnExit
edQtdeExitIntegersOnlyDisplayFormat,0.00;(,0.00)  TRzNumericEdit	edVlrIcmsLeft Top�WidthIHeightColorclInfoBkFrameHotTrack	FrameVisible	ReadOnly	TabOrderIntegersOnlyDisplayFormat,0.00;(,0.00)  TRzNumericEditedVlrIpiLeft�Top�WidthIHeightColorclInfoBkFrameHotTrack	FrameVisible	ReadOnly	TabOrderIntegersOnlyDisplayFormat,0.00;(,0.00)  TRzNumericEdit
edVlrTotalLeft�Top�WidthIHeightColorclInfoBkFrameHotTrack	FrameVisible	ReadOnly	TabOrderIntegersOnlyDisplayFormat,0.00;(,0.00)  TRzNumericEdit
edVlrJurosLeft� Top�WidthIHeightFrameHotTrack	FrameVisible	TabOrderOnExit
edQtdeExitIntegersOnlyDisplayFormat,0.00;(,0.00)  TRzNumericEdit
edAliqICMSLeft TophWidthIHeightColorclInfoBkFrameHotTrack	FrameVisible	ReadOnly	TabOrderIntegersOnlyDisplayFormat,0.00;(,0.00)  TRzNumericEdit	edPctDescLeft`TophWidthIHeightFrameHotTrack	FrameVisible	TabOrderOnExitedPctDescExitIntegersOnlyDisplayFormat,0.00;(,0.00)  TRzNumericEdit	edAliqIPILeft�TophWidthIHeightColorclInfoBkFrameHotTrack	FrameVisible	ReadOnly	TabOrderIntegersOnlyDisplayFormat,0.00;(,0.00)  TRzNumericEdit
edPctJurosLeft� TophWidthIHeightFrameHotTrack	FrameVisible	TabOrderOnExitedPctDescExitIntegersOnlyDisplayFormat,0.00;(,0.00)  TRzNumericEditedPesoBrutoLeft TopHWidthIHeightColorclInfoBkFrameHotTrack	FrameVisible	ReadOnly	TabOrderIntegersOnlyDisplayFormat,0.00;(,0.00)  TRzNumericEditedPesoLiquidoLeftxTopHWidthIHeightColorclInfoBkFrameHotTrack	FrameVisible	ReadOnly	TabOrderIntegersOnlyDisplayFormat,0.00;(,0.00)  TRzNumericEditedVlrIcmsSubstLeftPTop�WidthIHeightColorclInfoBkFrameHotTrack	FrameVisible	ReadOnly	TabOrderIntegersOnlyDisplayFormat,0.00;(,0.00)  TRzNumericEditedBaseIcmsSubstLeftPTophWidthIHeightColorclInfoBkFrameHotTrack	FrameVisible	ReadOnly	TabOrderIntegersOnlyDisplayFormat,0.00;(,0.00)  
TRzListBoxlistBoxNumerosSerieLeftTop� Width)Height� FrameHotTrack	FrameVisible	
ItemHeightTabOrder	  TRzComboBoxcomboNumeroEstoqueLeftTopxWidthiHeightStylecsDropDownListCtl3DFlatButtons	FrameHotTrack	FrameVisible	
ItemHeightParentCtl3DTabOrder  TRzMemomemoNumeroSerieLeftTop� Width)Height� TabOrder
FrameHotTrack	FrameVisible	  TRzDBLookupComboBoxdblcProdutoLefthTopWidthRHeightCtl3DKeyField
PRODUTO_SQ	ListFieldCODIGO_PRODUTO
ListSourcedsListaProdutosParentCtl3DTabOrderOnClickdblcProdutoClickFlatButtons	FrameHotTrack	FrameVisible	  TRzDBLookupComboBoxdbldProdutoLeft� TopWidthBHeightCtl3DKeyField
PRODUTO_SQ	ListFieldDESCRICAO_PRODUTO
ListSourcedsListaProdutosParentCtl3DTabOrderOnClickdblcProdutoClickFlatButtons	FrameHotTrack	FrameVisible	  TDataSourcedsListaProdutosLeftxTop    