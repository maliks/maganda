package com.maganda.domain;

import java.util.Date;

public class Usuario {
    private Integer idempleado;

    private Integer idrol;

    private String nomusuario;

    private String clausuario;

    private String estado;

    private Date fecregistro;

    private Date fecmodificacion;

    public Integer getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(Integer idempleado) {
        this.idempleado = idempleado;
    }

    public Integer getIdrol() {
        return idrol;
    }

    public void setIdrol(Integer idrol) {
        this.idrol = idrol;
    }

    public String getNomusuario() {
        return nomusuario;
    }

    public void setNomusuario(String nomusuario) {
        this.nomusuario = nomusuario == null ? null : nomusuario.trim();
    }

    public String getClausuario() {
        return clausuario;
    }

    public void setClausuario(String clausuario) {
        this.clausuario = clausuario == null ? null : clausuario.trim();
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado == null ? null : estado.trim();
    }

    public Date getFecregistro() {
        return fecregistro;
    }

    public void setFecregistro(Date fecregistro) {
        this.fecregistro = fecregistro;
    }

    public Date getFecmodificacion() {
        return fecmodificacion;
    }

    public void setFecmodificacion(Date fecmodificacion) {
        this.fecmodificacion = fecmodificacion;
    }
}