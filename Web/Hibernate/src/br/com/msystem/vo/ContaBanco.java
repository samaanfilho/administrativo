package br.com.msystem.vo;
// Generated 12/03/2013 13:33:49 by Hibernate Tools 3.4.0.CR1


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

/**
 * ContaBanco generated by hbm2java
 */
@Entity
@Table(name="conta_banco"
    ,catalog="handy"
)
public class ContaBanco  implements java.io.Serializable {


     private int contaBancoSq;
     private String nomeBanco;
     private String nomeAgencia;
     private String numeroConta;
     private Set<ContasPagar> contasPagars = new HashSet<ContasPagar>(0);

    public ContaBanco() {
    }

	
    public ContaBanco(String nomeBanco, String numeroConta) {
        this.nomeBanco = nomeBanco;
        this.numeroConta = numeroConta;
    }
    public ContaBanco(String nomeBanco, String nomeAgencia, String numeroConta, Set<ContasPagar> contasPagars) {
       this.nomeBanco = nomeBanco;
       this.nomeAgencia = nomeAgencia;
       this.numeroConta = numeroConta;
       this.contasPagars = contasPagars;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="conta_banco_sq", unique=true, nullable=false)
    public int getContaBancoSq() {
        return this.contaBancoSq;
    }
    
    public void setContaBancoSq(int contaBancoSq) {
        this.contaBancoSq = contaBancoSq;
    }

    
    @Column(name="nome_banco", nullable=false, length=50)
    public String getNomeBanco() {
        return this.nomeBanco;
    }
    
    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    
    @Column(name="nome_agencia", length=50)
    public String getNomeAgencia() {
        return this.nomeAgencia;
    }
    
    public void setNomeAgencia(String nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }

    
    @Column(name="numero_conta", nullable=false, length=50)
    public String getNumeroConta() {
        return this.numeroConta;
    }
    
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="contaBanco")
    public Set<ContasPagar> getContasPagars() {
        return this.contasPagars;
    }
    
    public void setContasPagars(Set<ContasPagar> contasPagars) {
        this.contasPagars = contasPagars;
    }




}


