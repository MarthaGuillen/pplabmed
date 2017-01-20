package modelo.pojo;
// Generated 01-10-2017 02:06:43 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Perfiles generated by hbm2java
 */
public class Perfiles  implements java.io.Serializable {


     private int idtblperfiles;
     private String nombreperfil;
     private String descripcion;
     private Boolean estado;
     private Set usuariosporperfils = new HashSet(0);
     private Set perfilporpermisos = new HashSet(0);

    public Perfiles() {
    }

	
    public Perfiles(int idtblperfiles, String nombreperfil) {
        this.idtblperfiles = idtblperfiles;
        this.nombreperfil = nombreperfil;
    }
    public Perfiles(int idtblperfiles, String nombreperfil, String descripcion, Boolean estado, Set usuariosporperfils, Set perfilporpermisos) {
       this.idtblperfiles = idtblperfiles;
       this.nombreperfil = nombreperfil;
       this.descripcion = descripcion;
       this.estado = estado;
       this.usuariosporperfils = usuariosporperfils;
       this.perfilporpermisos = perfilporpermisos;
    }
   
    public int getIdtblperfiles() {
        return this.idtblperfiles;
    }
    
    public void setIdtblperfiles(int idtblperfiles) {
        this.idtblperfiles = idtblperfiles;
    }
    public String getNombreperfil() {
        return this.nombreperfil;
    }
    
    public void setNombreperfil(String nombreperfil) {
        this.nombreperfil = nombreperfil;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Boolean getEstado() {
        return this.estado;
    }
    
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    public Set getUsuariosporperfils() {
        return this.usuariosporperfils;
    }
    
    public void setUsuariosporperfils(Set usuariosporperfils) {
        this.usuariosporperfils = usuariosporperfils;
    }
    public Set getPerfilporpermisos() {
        return this.perfilporpermisos;
    }
    
    public void setPerfilporpermisos(Set perfilporpermisos) {
        this.perfilporpermisos = perfilporpermisos;
    }




}

