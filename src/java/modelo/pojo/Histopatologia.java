package modelo.pojo;
// Generated 01-10-2017 02:06:43 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Histopatologia generated by hbm2java
 */
public class Histopatologia  implements java.io.Serializable {


     private int idtblhisto;
     private Camposhansa camposhansa;
     private Firmasmedicos firmasmedicos;
     private String diagnosticoclinico;
     private String muestra;
     private String mor1;
     private String mor2;
     private Date fechainforme;
     private Date fechabiopsia;
     private Integer idtblfirma2;
     private String topog;
     private Date fechamuestra;
     private String descmacro;
     private String descmicro;
     private String diagnostico;
     private String codigohisto;

    public Histopatologia() {
    }

	
    public Histopatologia(int idtblhisto) {
        this.idtblhisto = idtblhisto;
    }
    public Histopatologia(int idtblhisto, Camposhansa camposhansa, Firmasmedicos firmasmedicos, String diagnosticoclinico, String muestra, String mor1, String mor2, Date fechainforme, Date fechabiopsia, Integer idtblfirma2, String topog, Date fechamuestra, String descmacro, String descmicro, String diagnostico, String codigohisto) {
       this.idtblhisto = idtblhisto;
       this.camposhansa = camposhansa;
       this.firmasmedicos = firmasmedicos;
       this.diagnosticoclinico = diagnosticoclinico;
       this.muestra = muestra;
       this.mor1 = mor1;
       this.mor2 = mor2;
       this.fechainforme = fechainforme;
       this.fechabiopsia = fechabiopsia;
       this.idtblfirma2 = idtblfirma2;
       this.topog = topog;
       this.fechamuestra = fechamuestra;
       this.descmacro = descmacro;
       this.descmicro = descmicro;
       this.diagnostico = diagnostico;
       this.codigohisto = codigohisto;
    }
   
    public int getIdtblhisto() {
        return this.idtblhisto;
    }
    
    public void setIdtblhisto(int idtblhisto) {
        this.idtblhisto = idtblhisto;
    }
    public Camposhansa getCamposhansa() {
        return this.camposhansa;
    }
    
    public void setCamposhansa(Camposhansa camposhansa) {
        this.camposhansa = camposhansa;
    }
    public Firmasmedicos getFirmasmedicos() {
        return this.firmasmedicos;
    }
    
    public void setFirmasmedicos(Firmasmedicos firmasmedicos) {
        this.firmasmedicos = firmasmedicos;
    }
    public String getDiagnosticoclinico() {
        return this.diagnosticoclinico;
    }
    
    public void setDiagnosticoclinico(String diagnosticoclinico) {
        this.diagnosticoclinico = diagnosticoclinico;
    }
    public String getMuestra() {
        return this.muestra;
    }
    
    public void setMuestra(String muestra) {
        this.muestra = muestra;
    }
    public String getMor1() {
        return this.mor1;
    }
    
    public void setMor1(String mor1) {
        this.mor1 = mor1;
    }
    public String getMor2() {
        return this.mor2;
    }
    
    public void setMor2(String mor2) {
        this.mor2 = mor2;
    }
    public Date getFechainforme() {
        return this.fechainforme;
    }
    
    public void setFechainforme(Date fechainforme) {
        this.fechainforme = fechainforme;
    }
    public Date getFechabiopsia() {
        return this.fechabiopsia;
    }
    
    public void setFechabiopsia(Date fechabiopsia) {
        this.fechabiopsia = fechabiopsia;
    }
    public Integer getIdtblfirma2() {
        return this.idtblfirma2;
    }
    
    public void setIdtblfirma2(Integer idtblfirma2) {
        this.idtblfirma2 = idtblfirma2;
    }
    public String getTopog() {
        return this.topog;
    }
    
    public void setTopog(String topog) {
        this.topog = topog;
    }
    public Date getFechamuestra() {
        return this.fechamuestra;
    }
    
    public void setFechamuestra(Date fechamuestra) {
        this.fechamuestra = fechamuestra;
    }
    public String getDescmacro() {
        return this.descmacro;
    }
    
    public void setDescmacro(String descmacro) {
        this.descmacro = descmacro;
    }
    public String getDescmicro() {
        return this.descmicro;
    }
    
    public void setDescmicro(String descmicro) {
        this.descmicro = descmicro;
    }
    public String getDiagnostico() {
        return this.diagnostico;
    }
    
    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
    public String getCodigohisto() {
        return this.codigohisto;
    }
    
    public void setCodigohisto(String codigohisto) {
        this.codigohisto = codigohisto;
    }




}


