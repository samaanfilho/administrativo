package br.com.msystem.vo;
// Generated 12/03/2013 13:33:49 by Hibernate Tools 3.4.0.CR1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * BalancoContagemProduto generated by hbm2java
 */
@Entity
@Table(name="balanco_contagem_produto"
    ,catalog="handy"
)
public class BalancoContagemProduto  implements java.io.Serializable {


     private int balancoContagemProdutoSq;
     private Produtos produtos;
     private BalancoContagem balancoContagem;
     private Integer qtdeEstoque;
     private Integer qtdeContada;

    public BalancoContagemProduto() {
    }

	
    public BalancoContagemProduto(Produtos produtos, BalancoContagem balancoContagem) {
        this.produtos = produtos;
        this.balancoContagem = balancoContagem;
    }
    public BalancoContagemProduto(Produtos produtos, BalancoContagem balancoContagem, Integer qtdeEstoque, Integer qtdeContada) {
       this.produtos = produtos;
       this.balancoContagem = balancoContagem;
       this.qtdeEstoque = qtdeEstoque;
       this.qtdeContada = qtdeContada;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="balanco_contagem_produto_sq", unique=true, nullable=false)
    public int getBalancoContagemProdutoSq() {
        return this.balancoContagemProdutoSq;
    }
    
    public void setBalancoContagemProdutoSq(int balancoContagemProdutoSq) {
        this.balancoContagemProdutoSq = balancoContagemProdutoSq;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="produto_sq", nullable=false)
    public Produtos getProdutos() {
        return this.produtos;
    }
    
    public void setProdutos(Produtos produtos) {
        this.produtos = produtos;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="balanco_contagem_sq", nullable=false)
    public BalancoContagem getBalancoContagem() {
        return this.balancoContagem;
    }
    
    public void setBalancoContagem(BalancoContagem balancoContagem) {
        this.balancoContagem = balancoContagem;
    }

    
    @Column(name="qtde_estoque")
    public Integer getQtdeEstoque() {
        return this.qtdeEstoque;
    }
    
    public void setQtdeEstoque(Integer qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }

    
    @Column(name="qtde_contada")
    public Integer getQtdeContada() {
        return this.qtdeContada;
    }
    
    public void setQtdeContada(Integer qtdeContada) {
        this.qtdeContada = qtdeContada;
    }




}


