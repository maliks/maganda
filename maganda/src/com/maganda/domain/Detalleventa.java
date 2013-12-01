package com.maganda.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Detalleventa {
    private Integer idproducto;

    private Integer iddocumento;

    private String numventa;

    private Integer cantidad;

    private BigDecimal monto;

    private BigDecimal descuento;

    private String estproducto;

    private Date fecregistro;

    private Date fecmodificacion;

    public Integer getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Integer idproducto) {
        this.idproducto = idproducto;
    }

    public Integer getIddocumento() {
        return iddocumento;
    }

    public void setIddocumento(Integer iddocumento) {
        this.iddocumento = iddocumento;
    }

    public String getNumventa() {
        return numventa;
    }

    public void setNumventa(String numventa) {
        this.numventa = numventa == null ? null : numventa.trim();
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public BigDecimal getDescuento() {
        return descuento;
    }

    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }

    public String getEstproducto() {
        return estproducto;
    }

    public void setEstproducto(String estproducto) {
        this.estproducto = estproducto == null ? null : estproducto.trim();
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