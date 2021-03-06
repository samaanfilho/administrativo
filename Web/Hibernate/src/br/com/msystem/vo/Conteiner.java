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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Conteiner generated by hbm2java
 */
@Entity
@Table(name="conteiner"
    ,catalog="handy"
    , uniqueConstraints = @UniqueConstraint(columnNames="invoice_number") 
)
public class Conteiner  implements java.io.Serializable {


     private int conteinerSq;
     private String invoiceNumber;
     private Date dataRemessa;
     private Date dataChegada;
     private String tipoEnvio;
     private String conhecimento;
     private String observacao;
     private Set<ConteinerItens> conteinerItenses = new HashSet<ConteinerItens>(0);

    public Conteiner() {
    }

	
    public Conteiner(String invoiceNumber, Date dataRemessa, Date dataChegada, String tipoEnvio) {
        this.invoiceNumber = invoiceNumber;
        this.dataRemessa = dataRemessa;
        this.dataChegada = dataChegada;
        this.tipoEnvio = tipoEnvio;
    }
    public Conteiner(String invoiceNumber, Date dataRemessa, Date dataChegada, String tipoEnvio, String conhecimento, String observacao, Set<ConteinerItens> conteinerItenses) {
       this.invoiceNumber = invoiceNumber;
       this.dataRemessa = dataRemessa;
       this.dataChegada = dataChegada;
       this.tipoEnvio = tipoEnvio;
       this.conhecimento = conhecimento;
       this.observacao = observacao;
       this.conteinerItenses = conteinerItenses;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="conteiner_sq", unique=true, nullable=false)
    public int getConteinerSq() {
        return this.conteinerSq;
    }
    
    public void setConteinerSq(int conteinerSq) {
        this.conteinerSq = conteinerSq;
    }

    
    @Column(name="invoice_number", unique=true, nullable=false, length=20)
    public String getInvoiceNumber() {
        return this.invoiceNumber;
    }
    
    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="data_remessa", nullable=false, length=19)
    public Date getDataRemessa() {
        return this.dataRemessa;
    }
    
    public void setDataRemessa(Date dataRemessa) {
        this.dataRemessa = dataRemessa;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="data_chegada", nullable=false, length=19)
    public Date getDataChegada() {
        return this.dataChegada;
    }
    
    public void setDataChegada(Date dataChegada) {
        this.dataChegada = dataChegada;
    }

    
    @Column(name="tipo_envio", nullable=false, length=1)
    public String getTipoEnvio() {
        return this.tipoEnvio;
    }
    
    public void setTipoEnvio(String tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }

    
    @Column(name="conhecimento", length=20)
    public String getConhecimento() {
        return this.conhecimento;
    }
    
    public void setConhecimento(String conhecimento) {
        this.conhecimento = conhecimento;
    }

    
    @Column(name="observacao", length=65535)
    public String getObservacao() {
        return this.observacao;
    }
    
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="conteiner")
    public Set<ConteinerItens> getConteinerItenses() {
        return this.conteinerItenses;
    }
    
    public void setConteinerItenses(Set<ConteinerItens> conteinerItenses) {
        this.conteinerItenses = conteinerItenses;
    }




}


