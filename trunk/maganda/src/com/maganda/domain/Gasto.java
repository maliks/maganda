package com.maganda.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Gasto {
    private Integer idgasto;

    private BigDecimal monto;

    private String descripcion;

    private Date fecgasto;

    private Date fecregistro;

    private Date fecmodificacion;

    public Integer getIdgasto() {
        return idgasto;
    }

    public void setIdgasto(Integer idgasto) {
        this.idgasto = idgasto;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion == null ? null : descripcion.trim();
    }

    public Date getFecgasto() {
        return fecgasto;
    }

    public void setFecgasto(Date fecgasto) {
        this.fecgasto = fecgasto;
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