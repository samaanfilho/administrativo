�
 TFIMPRIMIRNFISCAISVEND 0�"  TPF0TFImprimirNFiscaisVendFImprimirNFiscaisVendLeft� ToppWidthHeightRCaption   Imprimir Relação de VendasColor	clBtnFaceFont.CharsetDEFAULT_CHARSET
Font.ColorclWindowTextFont.Height�	Font.NameMS Sans Serif
Font.Style OldCreateOrderPositionpoMainFormCenterOnClose	FormCloseOnCreate
FormCreatePixelsPerInch`
TextHeight TPanelPanel2Left Top WidthHeightyAlignalTopTabOrder  TLabelLabel2LeftvTopWidthHeightCaption   Início  TLabelLabel4LeftnTop Width&HeightCaption   Término  TRzEditedCnpjLeft� Top"Width�HeightEnabledFrameHotTrack	FrameVisible	TabOrderOnChangedblVendedorClick  TRzDBLookupComboBox	dblEstadoLeft� TopTWidth� HeightCtl3DEnabledKeyFieldcodigo_estado	ListFielddescricao_estado
ListSourcedsListaEstadosParentCtl3DTabOrder
OnClickdblVendedorClickFlatButtons	FrameHotTrack	FrameVisible	  TRzDBLookupComboBox
dblProdutoLeft� Top<Width�HeightCtl3DEnabledKeyField
PRODUTO_SQ	ListField CODIGO_PRODUTO;DESCRICAO_PRODUTO
ListSourcedsListaProdutosParentCtl3DTabOrderOnClickdblVendedorClickFlatButtons	FrameHotTrack	FrameVisible	  TRzDBLookupComboBoxdblVendedorLeft� TopWidth�HeightCtl3DEnabledKeyFieldVENDEDOR_SQ	ListFieldNOME_VENDEDOR
ListSourcedsListaVendedoresParentCtl3DTabOrder OnClickdblVendedorClickFlatButtons	FrameHotTrack	FrameVisible	  TRzCheckBox
cbVendedorLeftTopWidthIHeightCaptionVendedorHotTrack	StatecbUncheckedTabOrderOnClickdblVendedorClick  TRzCheckBox	cbClienteLeftTop"WidthyHeightCaptionCliente (Nome/CNPJ)HotTrack	StatecbUncheckedTabOrderOnClickdblVendedorClick  TRzCheckBox	cbProdutoLeftTop<WidthIHeightCaptionProdutoHotTrack	StatecbUncheckedTabOrderOnClickdblVendedorClick  TRzCheckBoxcbEstadoLeftTopTWidthIHeightCaptionEstadoHotTrack	StatecbUncheckedTabOrder	OnClickdblVendedorClick  TRzRadioGroupRadioGroup1Left�Top8WidthYHeight9Caption   Tipo do GráficoItemHotTrack		ItemIndex Items.StringsBarraPizza ParentColor	TabOrderOnClickRadioGroup1Click  TRzDateTimePicker	dtpInicioLeft�TopWidthbHeightDate `^��i��@Time `^��i��@TabOrderOnChangedblVendedorClickFlatButtons	FrameHotTrack	FrameVisible	  TRzDateTimePickerdtpFimLeft�Top WidthbHeightDate `^��i��@Time `^��i��@TabOrderOnChangedblVendedorClickFlatButtons	FrameHotTrack	FrameVisible	   TPanelPanel1Left TopWidthHeightAlignalBottomTabOrder TLabelLabel3LeftTopWidth4HeightCaptionQtde. Itens  TLabellbItensLeft@TopWidthHeightCaption    Font.CharsetDEFAULT_CHARSET
Font.ColorclWindowTextFont.Height�	Font.NameMS Sans Serif
Font.StylefsBold 
ParentFont  TLabellbValorLeft� TopWidthHeightCaption    Font.CharsetDEFAULT_CHARSET
Font.ColorclWindowTextFont.Height�	Font.NameMS Sans Serif
Font.StylefsBold 
ParentFont  TLabelLabel6Left� Top	Width3HeightCaptionValor Total  TLabellbValorLiquidoLeft�TopWidthHeightCaption    Font.CharsetDEFAULT_CHARSET
Font.ColorclWindowTextFont.Height�	Font.NameMS Sans Serif
Font.StylefsBold 
ParentFont  TLabelLabel5LeftPTop	Width?HeightCaption   Valor Líquido  TBitBtn
bbImprimirLeftoTopWidthKHeightCaptionImprimirDefault	TabOrder OnClickbbImprimirClick
Glyph.Data
z  v  BMv      v   (                                    �  �   �� �   � � ��   ���   �  �   �� �   � � ��  ��� 0      ?��������������wwwwwww�������wwwwwww        ���������������wwwwwww�������wwwwwww�������wwwwww        wwwwwww30����337���?330� 337�wss330����337��?�330�  337�swws330���3337��73330��3337�ss3330�� 33337��w33330  33337wws333	NumGlyphs  TBitBtnbbFecharLeft�TopWidthKHeightCancel	Caption&FecharModalResultTabOrder
Glyph.Data
�  �  BM�      v   (   $            h                       �  �   �� �   � � ��  ��� ���   �  �   �� �   � � ��  ��� 8����w���������33?  DD@���DD������3��  33MP��33�����38��  33E���3333���38�?  33M]��3333�x�38�?  33E���3333���38�?  33M]��3333�x�38�?  33E���3333���38�?  33M]��3333�x�38�?  33E���3333���38�?  33M]��3333�x�38�?  33E���3333���38�?  33M]��3333�x�38�?  33DDDDD3333������?  33333333333�����3?  333   333333?���3?  333
��333333����3?  333   333333����3?  	NumGlyphs   TPageControlPageControl1Left TopyWidthHeight�
ActivePage	TabSheet1AlignalClientTabOrder 	TTabSheet	TabSheet1CaptionVendas TDBGridDBGrid1Left Top WidthHeight�AlignalClient
DataSourcedsImprNfVendOptionsdgTitlesdgIndicatordgColumnResize
dgColLines
dgRowLinesdgTabsdgRowSelectdgAlwaysShowSelectiondgConfirmDeletedgCancelOnExit TabOrder TitleFont.CharsetDEFAULT_CHARSETTitleFont.ColorclWindowTextTitleFont.Height�TitleFont.NameMS Sans SerifTitleFont.Style 
OnDblClickDBGrid1DblClickColumnsExpanded	FieldNamenome_clienteTitle.CaptionClienteVisible	 Expanded	FieldName
numero_nfeTitle.CaptionNFeVisible	 Expanded	FieldNameDTEMISSAO_NFISCALTitle.Caption   Dt EmissãoVisible	 Expanded	FieldName	VLR_TOTALTitle.CaptionValor TotalVisible	 Expanded	FieldNameVLR_TOTAL_ITEMTitle.CaptionValot Total ProdutoVisible	 Expanded	FieldName	QTDE_ITEMTitle.Caption	Qtde ItemVisible	 Expanded	FieldNameVLR1Title.Caption
Vlr Parc.1Visible	 Expanded	FieldNameVCT1Title.CaptionVenc Parc.1Visible	 Expanded	FieldNameVLR2Title.Caption
Vlr Parc.2Visible	 Expanded	FieldNameVCT2Title.CaptionVenc Parc.2Visible	 Expanded	FieldNameVLR3Title.Caption
Vlr Parc.3Visible	 Expanded	FieldNameVCT3Title.CaptionVenc Parc.3Visible	 Expanded	FieldNameVLR4Title.Caption
Vlr Parc.4Visible	 Expanded	FieldNameVCT4Title.CaptionVenc Parc.4Visible	 Expanded	FieldNameVLR5Title.Caption
Vlr Parc.5Visible	 Expanded	FieldNameVCT5Title.CaptionVenc Parc.5Visible	     	TTabSheet	TabSheet3CaptionResumo por Vendedor
ImageIndex TDBChartdbcVendLeft Top WidthHeight�AllowPanningpmNone	AllowZoomBackWall.Brush.ColorclWhiteBackWall.Brush.StylebsClearBackWall.Pen.VisibleTitle.Font.CharsetANSI_CHARSETTitle.Font.ColorclBlueTitle.Font.Height�Title.Font.NameComic Sans MSTitle.Font.Style Title.Text.StringsResumo de Vendas AxisVisible
ClipPointsFrame.VisibleLeftAxis.ExactDateTimeView3DOptions.Elevation;View3DOptions.OrthogonalView3DOptions.Perspective View3DOptions.RotationhView3DWallsAlignalClientTabOrder  
TBarSeries
BarSeries1ColorEachPoint	Marks.ArrowLengthMarks.VisibleSeriesColorclRedXLabelsSourcenome_vendedorMultiBarmbNoneXValues.DateTimeXValues.NameXXValues.Multiplier       ��?XValues.OrderloAscendingYValues.DateTimeYValues.NameBarYValues.Multiplier       ��?YValues.OrderloNoneYValues.ValueSourcetotal  
TPieSeriesSeries2Marks.ArrowLengthMarks.StylesmsLabelPercentMarks.VisibleSeriesColorclRedXLabelsSourcenome_vendedorOtherSlice.TextOtherPieValues.DateTimePieValues.NamePiePieValues.Multiplier       ��?PieValues.OrderloNonePieValues.ValueSourcetotal    	TTabSheet	TabSheet2CaptionResumo por Produto
ImageIndex TDBChartdbcProdLeft Top WidthHeight�AllowPanningpmNone	AllowZoomBackWall.Brush.ColorclWhiteBackWall.Brush.StylebsClearBackWall.Pen.VisibleTitle.Font.CharsetANSI_CHARSETTitle.Font.ColorclBlueTitle.Font.Height�Title.Font.NameComic Sans MSTitle.Font.Style Title.Text.StringsResumo de Vendas AxisVisible
ClipPointsFrame.VisibleLeftAxis.ExactDateTimeView3DOptions.Elevation;View3DOptions.OrthogonalView3DOptions.Perspective View3DOptions.RotationhView3DWallsAlignalClientTabOrder  
TBarSeries
BarSeries2ColorEachPoint	Marks.ArrowLengthMarks.StylesmsLabelPercentMarks.VisibleSeriesColorclRedXLabelsSourcedescricao_produtoMultiBarmbNoneXValues.DateTimeXValues.NameXXValues.Multiplier       ��?XValues.OrderloAscendingYValues.DateTimeYValues.NameBarYValues.Multiplier       ��?YValues.OrderloNoneYValues.ValueSourcetotal  
TPieSeriesSeries1Marks.ArrowLengthMarks.StylesmsLabelPercentMarks.VisibleSeriesColorclRedXLabelsSourcedescricao_produtoOtherSlice.TextOtherPieValues.DateTimePieValues.NamePiePieValues.Multiplier       ��?PieValues.OrderloNonePieValues.ValueSourcetotal     TDataSourcedsListaVendedoresLeft�Top�   TDataSourcedsImprNfVendLeftHTop�   TDataSourcedsImprResVendLeft�Top�   TDataSourcedsListaProdutosLeft�Top  TDataSourcedsListaEstadosLeftLTop(   