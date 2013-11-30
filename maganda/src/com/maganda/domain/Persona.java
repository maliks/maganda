package com.maganda.domain;

import java.util.Date;

public class Persona {
    private Integer iddocumento;

    private String numdocumento;

    private String tippersona;

    private String apepaterno;

    private String apematerno;

    private String nombres;

    private Date feccreacion;

    private Date fecmodificacion;

    public Integer getIddocumento() {
        return iddocumento;
    }

    public void setIddocumento(Integer iddocumento) {
        this.iddocumento = iddocumento;
    }

    public String getNumdocumento() {
        return numdocumento;
    }

    public void setNumdocumento(String numdocumento) {
        this.numdocumento = numdocumento == null ? null : numdocumento.trim();
    }

    public String getTippersona() {
        return tippersona;
    }

    public void setTippersona(String tippersona) {
        this.tippersona = tippersona == null ? null : tippersona.trim();
    }

    public String getApepaterno() {
        return apepaterno;
    }

    public void setApepaterno(String apepaterno) {
        this.apepaterno = apepaterno == null ? null : apepaterno.trim();
    }

    public String getApematerno() {
        return apematerno;
    }

    public void setApematerno(String apematerno) {
        this.apematerno = apematerno == null ? null : apematerno.trim();
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres == null ? null : nombres.trim();
    }

    public Date getFeccreacion() {
        return feccreacion;
    }

    public void setFeccreacion(Date feccreacion) {
        this.feccreacion = feccreacion;
    }

    public Date getFecmodificacion() {
        return fecmodificacion;
    }

    public void setFecmodificacion(Date fecmodificacion) {
        this.fecmodificacion = fecmodificacion;
    }
}