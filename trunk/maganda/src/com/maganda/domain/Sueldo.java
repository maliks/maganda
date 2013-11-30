package com.maganda.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Sueldo {
    private Integer idempleado;

    private Date fecinicio;

    private Date fecfin;

    private BigDecimal monbasico;

    private BigDecimal moncomision;

    private BigDecimal monbonos;

    private String estado;

    private Date fecregistro;

    private Date fecmodificacion;

    public Integer getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(Integer idempleado) {
        this.idempleado = idempleado;
    }

    public Date getFecinicio() {
        return fecinicio;
    }

    public void setFecinicio(Date fecinicio) {
        this.fecinicio = fecinicio;
    }

    public Date getFecfin() {
        return fecfin;
    }

    public void setFecfin(Date fecfin) {
        this.fecfin = fecfin;
    }

    public BigDecimal getMonbasico() {
        return monbasico;
    }

    public void setMonbasico(BigDecimal monbasico) {
        this.monbasico = monbasico;
    }

    public BigDecimal getMoncomision() {
        return moncomision;
    }

    public void setMoncomision(BigDecimal moncomision) {
        this.moncomision = moncomision;
    }

    public BigDecimal getMonbonos() {
        return monbonos;
    }

    public void setMonbonos(BigDecimal monbonos) {
        this.monbonos = monbonos;
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