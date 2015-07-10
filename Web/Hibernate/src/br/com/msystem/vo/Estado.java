package br.com.msystem.vo;
// Generated 12/03/2013 13:33:49 by Hibernate Tools 3.4.0.CR1


import java.math.BigDecimal;
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
 * Estado generated by hbm2java
 */
@Entity
@Table(name="estado"
    ,catalog="handy"
)
public class Estado  implements java.io.Serializable {


     private int estadoSq;
     private String codigoEstado;
     private BigDecimal aliqIcmsIntra;
     private String descricaoEstado;
     private int codigoIbge;
     private Set<EstadoIva> estadoIvas = new HashSet<EstadoIva>(0);

    public Estado() {
    }

	
    public Estado(String codigoEstado, BigDecimal aliqIcmsIntra, String descricaoEstado, int codigoIbge) {
        this.codigoEstado = codigoEstado;
        this.aliqIcmsIntra = aliqIcmsIntra;
        this.descricaoEstado = descricaoEstado;
        this.codigoIbge = codigoIbge;
    }
    public Estado(String codigoEstado, BigDecimal aliqIcmsIntra, String descricaoEstado, int codigoIbge, Set<EstadoIva> estadoIvas) {
       this.codigoEstado = codigoEstado;
       this.aliqIcmsIntra = aliqIcmsIntra;
       this.descricaoEstado = descricaoEstado;
       this.codigoIbge = codigoIbge;
       this.estadoIvas = estadoIvas;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="estado_sq", unique=true, nullable=false)
    public int getEstadoSq() {
        return this.estadoSq;
    }
    
    public void setEstadoSq(int estadoSq) {
        this.estadoSq = estadoSq;
    }

    
    @Column(name="codigo_estado", nullable=false, length=2)
    public String getCodigoEstado() {
        return this.codigoEstado;
    }
    
    public void setCodigoEstado(String codigoEstado) {
        this.codigoEstado = codigoEstado;
    }

    
    @Column(name="aliq_icms_intra", nullable=false, precision=5)
    public BigDecimal getAliqIcmsIntra() {
        return this.aliqIcmsIntra;
    }
    
    public void setAliqIcmsIntra(BigDecimal aliqIcmsIntra) {
        this.aliqIcmsIntra = aliqIcmsIntra;
    }

    
    @Column(name="descricao_estado", nullable=false, length=50)
    public String getDescricaoEstado() {
        return this.descricaoEstado;
    }
    
    public void setDescricaoEstado(String descricaoEstado) {
        this.descricaoEstado = descricaoEstado;
    }

    
    @Column(name="codigo_ibge", nullable=false)
    public int getCodigoIbge() {
        return this.codigoIbge;
    }
    
    public void setCodigoIbge(int codigoIbge) {
        this.codigoIbge = codigoIbge;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="estado")
    public Set<EstadoIva> getEstadoIvas() {
        return this.estadoIvas;
    }
    
    public void setEstadoIvas(Set<EstadoIva> estadoIvas) {
        this.estadoIvas = estadoIvas;
    }




}


