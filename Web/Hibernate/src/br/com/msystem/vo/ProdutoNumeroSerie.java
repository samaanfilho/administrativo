package br.com.msystem.vo;
// Generated 12/03/2013 13:33:49 by Hibernate Tools 3.4.0.CR1


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
 * ProdutoNumeroSerie generated by hbm2java
 */
@Entity
@Table(name="produto_numero_serie"
    ,catalog="handy"
    , uniqueConstraints = @UniqueConstraint(columnNames={"produto_sq", "numero_serie"}) 
)
public class ProdutoNumeroSerie  implements java.io.Serializable {


     private int produtoNumeroSerieSq;
     private Produtos produtos;
     private int numeroEstoque;
     private String numeroSerie;
     private Date dataUltimaEntrada;
     private Date dataUltimaSaida;
     private Integer numeroNfEnt;
     private Set<PedidosItensSerie> pedidosItensSeries = new HashSet<PedidosItensSerie>(0);
     private Set<NfiscaisItensSerie> nfiscaisItensSeries = new HashSet<NfiscaisItensSerie>(0);

    public ProdutoNumeroSerie() {
    }

	
    public ProdutoNumeroSerie(Produtos produtos, int numeroEstoque, Date dataUltimaEntrada) {
        this.produtos = produtos;
        this.numeroEstoque = numeroEstoque;
        this.dataUltimaEntrada = dataUltimaEntrada;
    }
    public ProdutoNumeroSerie(Produtos produtos, int numeroEstoque, String numeroSerie, Date dataUltimaEntrada, Date dataUltimaSaida, Integer numeroNfEnt, Set<PedidosItensSerie> pedidosItensSeries, Set<NfiscaisItensSerie> nfiscaisItensSeries) {
       this.produtos = produtos;
       this.numeroEstoque = numeroEstoque;
       this.numeroSerie = numeroSerie;
       this.dataUltimaEntrada = dataUltimaEntrada;
       this.dataUltimaSaida = dataUltimaSaida;
       this.numeroNfEnt = numeroNfEnt;
       this.pedidosItensSeries = pedidosItensSeries;
       this.nfiscaisItensSeries = nfiscaisItensSeries;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="produto_numero_serie_sq", unique=true, nullable=false)
    public int getProdutoNumeroSerieSq() {
        return this.produtoNumeroSerieSq;
    }
    
    public void setProdutoNumeroSerieSq(int produtoNumeroSerieSq) {
        this.produtoNumeroSerieSq = produtoNumeroSerieSq;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="produto_sq", nullable=false)
    public Produtos getProdutos() {
        return this.produtos;
    }
    
    public void setProdutos(Produtos produtos) {
        this.produtos = produtos;
    }

    
    @Column(name="numero_estoque", nullable=false)
    public int getNumeroEstoque() {
        return this.numeroEstoque;
    }
    
    public void setNumeroEstoque(int numeroEstoque) {
        this.numeroEstoque = numeroEstoque;
    }

    
    @Column(name="numero_serie", length=100)
    public String getNumeroSerie() {
        return this.numeroSerie;
    }
    
    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="data_ultima_entrada", nullable=false, length=19)
    public Date getDataUltimaEntrada() {
        return this.dataUltimaEntrada;
    }
    
    public void setDataUltimaEntrada(Date dataUltimaEntrada) {
        this.dataUltimaEntrada = dataUltimaEntrada;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="data_ultima_saida", length=19)
    public Date getDataUltimaSaida() {
        return this.dataUltimaSaida;
    }
    
    public void setDataUltimaSaida(Date dataUltimaSaida) {
        this.dataUltimaSaida = dataUltimaSaida;
    }

    
    @Column(name="numero_nf_ent")
    public Integer getNumeroNfEnt() {
        return this.numeroNfEnt;
    }
    
    public void setNumeroNfEnt(Integer numeroNfEnt) {
        this.numeroNfEnt = numeroNfEnt;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="produtoNumeroSerie")
    public Set<PedidosItensSerie> getPedidosItensSeries() {
        return this.pedidosItensSeries;
    }
    
    public void setPedidosItensSeries(Set<PedidosItensSerie> pedidosItensSeries) {
        this.pedidosItensSeries = pedidosItensSeries;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="produtoNumeroSerie")
    public Set<NfiscaisItensSerie> getNfiscaisItensSeries() {
        return this.nfiscaisItensSeries;
    }
    
    public void setNfiscaisItensSeries(Set<NfiscaisItensSerie> nfiscaisItensSeries) {
        this.nfiscaisItensSeries = nfiscaisItensSeries;
    }




}


