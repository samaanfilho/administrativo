package br.com.msystem.vo;
// Generated 12/03/2013 13:33:49 by Hibernate Tools 3.4.0.CR1


import static javax.persistence.GenerationType.IDENTITY;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Pedidos generated by hbm2java
 */
@Entity
@Table(name="pedidos"
    ,catalog="handy"
    , uniqueConstraints = @UniqueConstraint(columnNames="NUMERO_PEDIDO") 
)
public class Pedidos  implements java.io.Serializable {


     private int pedidoSq;
     private Transportadoras transportadoras;
     private CondPagto condPagto;
     private Naturezas naturezas;
     private Linha linha;
     private Clientes clientes;
     private Vendedores vendedores;
     private Date dataPedido;
     private BigDecimal cotacaoDolar;
     private String observacaoPed;
     private String observacaoNf;
     private BigDecimal vlrFrete;
     private String freteTransp;
     private Integer nfiscalSq;
     private BigDecimal vlrDesc;
     private BigDecimal pctDesc;
     private BigDecimal vlrIcms;
     private BigDecimal vlrIpi;
     private BigDecimal vlrProdutos;
     private BigDecimal baseIcms;
     private Integer numeroPedido;
     private Integer diasDemonstracao;
     private BigDecimal pctJuros;
     private BigDecimal vlrJuros;
     private BigDecimal pesoBruto;
     private BigDecimal pesoLiquido;
     private BigDecimal vlrSeguro;
     private char baixouEstoque;
     private Character status;
     private BigDecimal baseIcmsSubst;
     private BigDecimal vlrIcmsSubst;
     private BigDecimal vlrTotal;
     private Integer numeroComprovanteCartao;
     private Set<PedidosItens> pedidosItenses = new HashSet<PedidosItens>(0);
     private Set<Nfiscais> nfiscaises = new HashSet<Nfiscais>(0);

	public Pedidos() {
    }

	
    public Pedidos(Transportadoras transportadoras, CondPagto condPagto, Naturezas naturezas, Clientes clientes, Vendedores vendedores, Date dataPedido, char baixouEstoque) {
        this.transportadoras = transportadoras;
        this.condPagto = condPagto;
        this.naturezas = naturezas;
        this.clientes = clientes;
        this.vendedores = vendedores;
        this.dataPedido = dataPedido;
        this.baixouEstoque = baixouEstoque;
    }
    public Pedidos(Transportadoras transportadoras, CondPagto condPagto, Naturezas naturezas, Linha linha, Clientes clientes, Vendedores vendedores, Date dataPedido, BigDecimal cotacaoDolar, String observacaoPed, String observacaoNf, BigDecimal vlrFrete, String freteTransp, Integer nfiscalSq, BigDecimal vlrDesc, BigDecimal pctDesc, BigDecimal vlrIcms, BigDecimal vlrIpi, BigDecimal vlrProdutos, BigDecimal baseIcms, Integer numeroPedido, Integer diasDemonstracao, BigDecimal pctJuros, BigDecimal vlrJuros, BigDecimal pesoBruto, BigDecimal pesoLiquido, BigDecimal vlrSeguro, char baixouEstoque, Character status, BigDecimal baseIcmsSubst, BigDecimal vlrIcmsSubst, BigDecimal vlrTotal, Integer numeroComprovanteCartao, Set<PedidosItens> pedidosItenses, Set<Nfiscais> nfiscaises) {
       this.transportadoras = transportadoras;
       this.condPagto = condPagto;
       this.naturezas = naturezas;
       this.linha = linha;
       this.clientes = clientes;
       this.vendedores = vendedores;
       this.dataPedido = dataPedido;
       this.cotacaoDolar = cotacaoDolar;
       this.observacaoPed = observacaoPed;
       this.observacaoNf = observacaoNf;
       this.vlrFrete = vlrFrete;
       this.freteTransp = freteTransp;
       this.nfiscalSq = nfiscalSq;
       this.vlrDesc = vlrDesc;
       this.pctDesc = pctDesc;
       this.vlrIcms = vlrIcms;
       this.vlrIpi = vlrIpi;
       this.vlrProdutos = vlrProdutos;
       this.baseIcms = baseIcms;
       this.numeroPedido = numeroPedido;
       this.diasDemonstracao = diasDemonstracao;
       this.pctJuros = pctJuros;
       this.vlrJuros = vlrJuros;
       this.pesoBruto = pesoBruto;
       this.pesoLiquido = pesoLiquido;
       this.vlrSeguro = vlrSeguro;
       this.baixouEstoque = baixouEstoque;
       this.status = status;
       this.baseIcmsSubst = baseIcmsSubst;
       this.vlrIcmsSubst = vlrIcmsSubst;
       this.vlrTotal = vlrTotal;
       this.numeroComprovanteCartao = numeroComprovanteCartao;
       this.pedidosItenses = pedidosItenses;
       this.nfiscaises = nfiscaises;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="PEDIDO_SQ", unique=true, nullable=false)
    public int getPedidoSq() {
        return this.pedidoSq;
    }
    
    public void setPedidoSq(int pedidoSq) {
        this.pedidoSq = pedidoSq;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="TRANSPORTADORA_SQ", nullable=false)
    public Transportadoras getTransportadoras() {
        return this.transportadoras;
    }
    
    public void setTransportadoras(Transportadoras transportadoras) {
        this.transportadoras = transportadoras;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="COND_PAGTO_SQ", nullable=false)
    public CondPagto getCondPagto() {
        return this.condPagto;
    }
    
    public void setCondPagto(CondPagto condPagto) {
        this.condPagto = condPagto;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="NATUREZA_SQ", nullable=false)
    public Naturezas getNaturezas() {
        return this.naturezas;
    }
    
    public void setNaturezas(Naturezas naturezas) {
        this.naturezas = naturezas;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="linha_sq")
    public Linha getLinha() {
        return this.linha;
    }
    
    public void setLinha(Linha linha) {
        this.linha = linha;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CLIENTE_SQ", nullable=false)
    public Clientes getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="VENDEDOR_SQ", nullable=false)
    public Vendedores getVendedores() {
        return this.vendedores;
    }
    
    public void setVendedores(Vendedores vendedores) {
        this.vendedores = vendedores;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="DATA_PEDIDO", nullable=false, length=19)
    public Date getDataPedido() {
        return this.dataPedido;
    }
    
    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    
    @Column(name="COTACAO_DOLAR", precision=9, scale=4)
    public BigDecimal getCotacaoDolar() {
        return this.cotacaoDolar;
    }
    
    public void setCotacaoDolar(BigDecimal cotacaoDolar) {
        this.cotacaoDolar = cotacaoDolar;
    }

    
    @Column(name="OBSERVACAO_PED", length=65535)
    public String getObservacaoPed() {
        return this.observacaoPed;
    }
    
    public void setObservacaoPed(String observacaoPed) {
        this.observacaoPed = observacaoPed;
    }

    
    @Column(name="OBSERVACAO_NF", length=65535)
    public String getObservacaoNf() {
        return this.observacaoNf;
    }
    
    public void setObservacaoNf(String observacaoNf) {
        this.observacaoNf = observacaoNf;
    }

    
    @Column(name="VLR_FRETE", precision=9)
    public BigDecimal getVlrFrete() {
        return this.vlrFrete;
    }
    
    public void setVlrFrete(BigDecimal vlrFrete) {
        this.vlrFrete = vlrFrete;
    }

    
    @Column(name="FRETE_TRANSP", length=1)
    public String getFreteTransp() {
        return this.freteTransp;
    }
    
    public void setFreteTransp(String freteTransp) {
        this.freteTransp = freteTransp;
    }

    
    @Column(name="NFISCAL_SQ")
    public Integer getNfiscalSq() {
        return this.nfiscalSq;
    }
    
    public void setNfiscalSq(Integer nfiscalSq) {
        this.nfiscalSq = nfiscalSq;
    }

    
    @Column(name="VLR_DESC", precision=9)
    public BigDecimal getVlrDesc() {
        return this.vlrDesc;
    }
    
    public void setVlrDesc(BigDecimal vlrDesc) {
        this.vlrDesc = vlrDesc;
    }

    
    @Column(name="PCT_DESC", precision=9)
    public BigDecimal getPctDesc() {
        return this.pctDesc;
    }
    
    public void setPctDesc(BigDecimal pctDesc) {
        this.pctDesc = pctDesc;
    }

    
    @Column(name="VLR_ICMS", precision=9)
    public BigDecimal getVlrIcms() {
        return this.vlrIcms;
    }
    
    public void setVlrIcms(BigDecimal vlrIcms) {
        this.vlrIcms = vlrIcms;
    }

    
    @Column(name="VLR_IPI", precision=9)
    public BigDecimal getVlrIpi() {
        return this.vlrIpi;
    }
    
    public void setVlrIpi(BigDecimal vlrIpi) {
        this.vlrIpi = vlrIpi;
    }

    
    @Column(name="VLR_PRODUTOS", precision=9)
    public BigDecimal getVlrProdutos() {
        return this.vlrProdutos;
    }
    
    public void setVlrProdutos(BigDecimal vlrProdutos) {
        this.vlrProdutos = vlrProdutos;
    }

    
    @Column(name="BASE_ICMS", precision=9)
    public BigDecimal getBaseIcms() {
        return this.baseIcms;
    }
    
    public void setBaseIcms(BigDecimal baseIcms) {
        this.baseIcms = baseIcms;
    }

    
    @Column(name="NUMERO_PEDIDO", unique=true)
    public Integer getNumeroPedido() {
        return this.numeroPedido;
    }
    
    public void setNumeroPedido(Integer numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    
    @Column(name="DIAS_DEMONSTRACAO")
    public Integer getDiasDemonstracao() {
        return this.diasDemonstracao;
    }
    
    public void setDiasDemonstracao(Integer diasDemonstracao) {
        this.diasDemonstracao = diasDemonstracao;
    }

    
    @Column(name="pct_juros", precision=4)
    public BigDecimal getPctJuros() {
        return this.pctJuros;
    }
    
    public void setPctJuros(BigDecimal pctJuros) {
        this.pctJuros = pctJuros;
    }

    
    @Column(name="VLR_JUROS", precision=9)
    public BigDecimal getVlrJuros() {
        return this.vlrJuros;
    }
    
    public void setVlrJuros(BigDecimal vlrJuros) {
        this.vlrJuros = vlrJuros;
    }

    
    @Column(name="PESO_BRUTO", precision=9)
    public BigDecimal getPesoBruto() {
        return this.pesoBruto;
    }
    
    public void setPesoBruto(BigDecimal pesoBruto) {
        this.pesoBruto = pesoBruto;
    }

    
    @Column(name="PESO_LIQUIDO", precision=9)
    public BigDecimal getPesoLiquido() {
        return this.pesoLiquido;
    }
    
    public void setPesoLiquido(BigDecimal pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }

    
    @Column(name="VLR_SEGURO", precision=9)
    public BigDecimal getVlrSeguro() {
        return this.vlrSeguro;
    }
    
    public void setVlrSeguro(BigDecimal vlrSeguro) {
        this.vlrSeguro = vlrSeguro;
    }

    
    @Column(name="baixou_estoque", nullable=false, length=1)
    public char getBaixouEstoque() {
        return this.baixouEstoque;
    }
    
    public void setBaixouEstoque(char baixouEstoque) {
        this.baixouEstoque = baixouEstoque;
    }

    
    @Column(name="status", length=1)
    public Character getStatus() {
        return this.status;
    }
    
    public void setStatus(Character status) {
        this.status = status;
    }

    
    @Column(name="base_icms_subst", precision=9)
    public BigDecimal getBaseIcmsSubst() {
        return this.baseIcmsSubst;
    }
    
    public void setBaseIcmsSubst(BigDecimal baseIcmsSubst) {
        this.baseIcmsSubst = baseIcmsSubst;
    }

    
    @Column(name="vlr_icms_subst", precision=9)
    public BigDecimal getVlrIcmsSubst() {
        return this.vlrIcmsSubst;
    }
    
    public void setVlrIcmsSubst(BigDecimal vlrIcmsSubst) {
        this.vlrIcmsSubst = vlrIcmsSubst;
    }

    
    @Column(name="vlr_total", precision=9)
    public BigDecimal getVlrTotal() {
        return this.vlrTotal;
    }
    
    public void setVlrTotal(BigDecimal vlrTotal) {
        this.vlrTotal = vlrTotal;
    }

    
    @Column(name="numero_comprovante_cartao")
    public Integer getNumeroComprovanteCartao() {
        return this.numeroComprovanteCartao;
    }
    
    public void setNumeroComprovanteCartao(Integer numeroComprovanteCartao) {
        this.numeroComprovanteCartao = numeroComprovanteCartao;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="pedidos", cascade={CascadeType.ALL}, orphanRemoval=true)
    public Set<PedidosItens> getPedidosItenses() {
        return this.pedidosItenses;
    }
    
    public void setPedidosItenses(Set<PedidosItens> pedidosItenses) {
        this.pedidosItenses = pedidosItenses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="pedidos")
    public Set<Nfiscais> getNfiscaises() {
        return this.nfiscaises;
    }
    
    public void setNfiscaises(Set<Nfiscais> nfiscaises) {
        this.nfiscaises = nfiscaises;
    }




}


