�
 TFEDITARNFENTRADASITENS 0<  TPF0TFEditarNfEntradasItensFEditarNfEntradasItensLeft�TopHelpType	htKeywordHelpKeywordItens dos PedidosBorderIconsbiSystemMenu BorderStylebsSingleCaption'   Editar Ítens da Nota Fiscal de EntradaClientHeightKClientWidthUColor	clBtnFaceFont.CharsetDEFAULT_CHARSET
Font.ColorclWindowTextFont.Height�	Font.NameMS Sans Serif
Font.Style 
KeyPreview	OldCreateOrderPositionpoScreenCenterOnCreate
FormCreatePixelsPerInch`
TextHeight TPanelPanel1Left Top.WidthUHeightAlignalBottomTabOrder  TBitBtnbbOkLeft�TopWidthKHeightCaptionSalvarDefault	ModalResultTabOrder OnClick	bbOkClick
Glyph.Data
�  �  BM�      v   (   $            h                       �  �   �� �   � � ��  ��� ���   �  �   �� �   � � ��  ��� 333333333333333333  333333333333�33333  334C33333338�33333  33B$3333333�8�3333  34""C33333833�3333  3B""$33333�338�333  4"*""C3338�8�3�333  2"��"C3338�3�333  :*3:"$3338�38�8�33  3�33�"C333�33�3�33  3333:"$3333338�8�3  33333�"C333333�3�3  33333:"$3333338�8�  333333�"C333333�3�  333333:"C3333338�  3333333�#3333333��  3333333:3333333383  333333333333333333  	NumGlyphs  TBitBtn
bbCancelarLeft�TopWidthKHeightCaptionCancelarTabOrderKindbkCancel   TRzPanelRzPanel1Left Top WidthUHeight.AlignalClientBorderOuterfsNoneTabOrder TLabellbNfEntradaLeftTopWidth)HeightCaption	N. Fiscal  TLabelLabel3Left�TopXWidth7Height	AlignmenttaRightJustifyCaption
Quantidade  TLabelLabel5Left� TopWidth%HeightCursorcrHandPoint	AlignmenttaRightJustifyCaptionProdutoFocusControldblcProdutoOnClickLabel5Click  TLabelLabel8Left� Top0Width!Height	AlignmenttaRightJustifyCaptionN.C.M.  TLabelLabel2Left�Top� WidthIHeightAutoSizeCaption   Valor unitário (com IPI)WordWrap	  TLabelLabel10Left�Top0Width1Height	AlignmenttaRightJustifyCaption
Aliq. ICMS  TLabelLabel11LeftTop0Width$Height	AlignmenttaRightJustifyCaption	Aliq. IPI  TLabelLabel12Left�Top� Width)HeightCaptionVlr ICMS  TLabelLabel13Left Top� WidthHeightCaptionVlr IPI  TLabelLabel14Left Top� WidthIHeightAutoSizeCaption   Preço total (sem IPI)WordWrap	  TLabelLabel15Left�Top� Width.HeightCaption	Aliq ICMS  TLabelLabel16Left Top� Width!HeightCaptionAliq IPI  TSpeedButton	sbIncluirLeft8Top� WidthHeight
Glyph.Data
�   �   BM�       v   (               p                        �  �   �� �   � � ��  ��� ���   �  �   �� �   � � ��  ��� 3333333 3333333 3333333 330 333 330�333 330�333 3  � 3 3���3 3  � 3 330�333 330�333 330 333 3333333 3333333 OnClicksbIncluirClick  TSpeedButton	sbExcluirLeft8Top� WidthHeight
Glyph.Data
�   �   BM�       v   (               p                        �  �   �� �   � � ��  ��� ���   �  �   �� �   � � ��  ��� 3333333 3333333 3333333 3333333 3333333 3333333 3     3 3����3 3     3 3333333 3333333 3333333 3333333 3333333 OnClicksbExcluirClick  TLabellabelNumeroSerieLeftTop� WidthRHeightCaption   Números de série  TLabelLabel4LeftTopHWidth'Height	AlignmenttaRightJustifyCaptionEstoque  TDBLookupComboBoxdblcProdutoLeft� TopWidthRHeightKeyField
PRODUTO_SQ	ListFieldCODIGO_PRODUTO
ListSourcedsListaProdutosTabOrder OnClickdblcProdutoClick  TDBLookupComboBoxDBLookupComboBox2LeftTopWidthBHeightKeyField
PRODUTO_SQ	ListFieldDESCRICAO_PRODUTO
ListSourcedsListaProdutosTabOrderOnClickdblcProdutoClick  TDBEditDBEdit2Left� Top0WidthPHeightTabStop	DataField
CODIGO_NBM
DataSourcedsListaProdutosTabOrder  TDBEditDBEdit9Left�Top0WidthAHeightTabStop	DataField	ALIQ_ICMS
DataSourcedsListaProdutosTabOrder  TDBEditDBEdit10Left8Top0WidthAHeightTabStop	DataFieldALIQ_IPI
DataSourcedsListaProdutosTabOrder  TRzNumericEditedPrecoLeft�Top� WidthIHeight	AlignmenttaLeftJustifyTabOrderOnExit
edQtdeExitIntegersOnlyDisplayFormat,0.00;(,0.00)  TRzNumericEditedQtdeLeft�TophWidthIHeight	AlignmenttaLeftJustifyTabOrderOnExit
edQtdeExitDisplayFormat,0;(,0)  TRzNumericEdit
edVlrTotalLeft Top� WidthIHeight	AlignmenttaLeftJustifyColorclInfoBkReadOnly	TabOrderIntegersOnlyDisplayFormat,0.00;(,0.00)  TRzNumericEdit	edVlrIcmsLeft�Top WidthIHeight	AlignmenttaLeftJustifyTabOrderDisplayFormat,0.00;(,0.00)  TRzNumericEditedVlrIpiLeft Top WidthIHeight	AlignmenttaLeftJustifyTabOrder	DisplayFormat,0.00;(,0.00)  TRzNumericEdit
edAliqICMSLeft�Top� WidthIHeight	AlignmenttaLeftJustifyColorclInfoBkReadOnly	TabOrder
DisplayFormat,0.00;(,0.00)  TRzNumericEdit	edAliqIPILeft Top� WidthIHeight	AlignmenttaLeftJustifyColorclInfoBkReadOnly	TabOrderDisplayFormat,0.00;(,0.00)  
TRzListBoxlistBoxNumerosSerieLeftTop� Width)Height� FrameHotTrack	FrameVisible	
ItemHeightTabOrder  TRzComboBoxcomboNumeroEstoqueLeftTopXWidthiHeightStylecsDropDownListCtl3DFlatButtons	FrameHotTrack	FrameVisible	
ItemHeightParentCtl3DTabOrder  TRzMemomemoNumeroSerieLeftTop� Width)Height� TabOrderFrameHotTrack	FrameVisible	   TDataSourcedsListaProdutosLeft� Top�   