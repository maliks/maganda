package com.maganda.domain;

import java.util.Date;

public class Documento {
    private Integer iddocumento;

    private String nombre;

    private String grupo;

    private String estado;

    private Date feccreacion;

    private Date fecmodifcacion;

    public Integer getIddocumento() {
        return iddocumento;
    }

    public void setIddocumento(Integer iddocumento) {
        this.iddocumento = iddocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre == null ? null : nombre.trim();
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo == null ? null : grupo.trim();
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado == null ? null : estado.trim();
    }

    public Date getFeccreacion() {
        return feccreacion;
    }

    public void setFeccreacion(Date feccreacion) {
        this.feccreacion = feccreacion;
    }

    public Date getFecmodifcacion() {
        return fecmodifcacion;
    }

    public void setFecmodifcacion(Date fecmodifcacion) {
        this.fecmodifcacion = fecmodifcacion;
    }
}