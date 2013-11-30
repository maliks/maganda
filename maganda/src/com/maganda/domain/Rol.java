package com.maganda.domain;

import java.util.Date;

public class Rol {
    private Integer idrol;

    private String nombre;

    private String nivacceso;

    private String estado;

    private Date fecregistro;

    private Date fecmodificacion;

    public Integer getIdrol() {
        return idrol;
    }

    public void setIdrol(Integer idrol) {
        this.idrol = idrol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre == null ? null : nombre.trim();
    }

    public String getNivacceso() {
        return nivacceso;
    }

    public void setNivacceso(String nivacceso) {
        this.nivacceso = nivacceso == null ? null : nivacceso.trim();
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