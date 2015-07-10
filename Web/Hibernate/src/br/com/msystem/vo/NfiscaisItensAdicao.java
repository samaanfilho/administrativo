package br.com.msystem.vo;
// Generated 12/03/2013 13:33:49 by Hibernate Tools 3.4.0.CR1


import java.math.BigDecimal;
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
 * NfiscaisItensAdicao generated by hbm2java
 */
@Entity
@Table(name="nfiscais_itens_adicao"
    ,catalog="handy"
)
public class NfiscaisItensAdicao  implements java.io.Serializable {


     private int nfiscalItemAdicaoSq;
     private NfiscaisItens nfiscaisItens;
     private Integer numeroAdicao;
     private Integer numeroSequencialAdicao;
     private String codigoFabricante;
     private BigDecimal vlrDescAdicao;

    public NfiscaisItensAdicao() {
    }

	
    public NfiscaisItensAdicao(NfiscaisItens nfiscaisItens) {
        this.nfiscaisItens = nfiscaisItens;
    }
    public NfiscaisItensAdicao(NfiscaisItens nfiscaisItens, Integer numeroAdicao, Integer numeroSequencialAdicao, String codigoFabricante, BigDecimal vlrDescAdicao) {
       this.nfiscaisItens = nfiscaisItens;
       this.numeroAdicao = numeroAdicao;
       this.numeroSequencialAdicao = numeroSequencialAdicao;
       this.codigoFabricante = codigoFabricante;
       this.vlrDescAdicao = vlrDescAdicao;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="nfiscal_item_adicao_sq", unique=true, nullable=false)
    public int getNfiscalItemAdicaoSq() {
        return this.nfiscalItemAdicaoSq;
    }
    
    public void setNfiscalItemAdicaoSq(int nfiscalItemAdicaoSq) {
        this.nfiscalItemAdicaoSq = nfiscalItemAdicaoSq;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="nfiscal_item_sq", nullable=false)
    public NfiscaisItens getNfiscaisItens() {
        return this.nfiscaisItens;
    }
    
    public void setNfiscaisItens(NfiscaisItens nfiscaisItens) {
        this.nfiscaisItens = nfiscaisItens;
    }

    
    @Column(name="numero_adicao")
    public Integer getNumeroAdicao() {
        return this.numeroAdicao;
    }
    
    public void setNumeroAdicao(Integer numeroAdicao) {
        this.numeroAdicao = numeroAdicao;
    }

    
    @Column(name="numero_sequencial_adicao")
    public Integer getNumeroSequencialAdicao() {
        return this.numeroSequencialAdicao;
    }
    
    public void setNumeroSequencialAdicao(Integer numeroSequencialAdicao) {
        this.numeroSequencialAdicao = numeroSequencialAdicao;
    }

    
    @Column(name="codigo_fabricante", length=60)
    public String getCodigoFabricante() {
        return this.codigoFabricante;
    }
    
    public void setCodigoFabricante(String codigoFabricante) {
        this.codigoFabricante = codigoFabricante;
    }

    
    @Column(name="vlr_desc_adicao", precision=9)
    public BigDecimal getVlrDescAdicao() {
        return this.vlrDescAdicao;
    }
    
    public void setVlrDescAdicao(BigDecimal vlrDescAdicao) {
        this.vlrDescAdicao = vlrDescAdicao;
    }




}


