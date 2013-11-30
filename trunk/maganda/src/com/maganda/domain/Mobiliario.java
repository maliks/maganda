package com.maganda.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Mobiliario {
    private Integer idmobiliario;

    private String nombre;

    private Integer cantidad;

    private String descripcion;

    private Date feccompra;

    private BigDecimal monto;

    private String estado;

    private Date fecregistro;

    private Date fecmodificacion;

    public Integer getIdmobiliario() {
        return idmobiliario;
    }

    public void setIdmobiliario(Integer idmobiliario) {
        this.idmobiliario = idmobiliario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre == null ? null : nombre.trim();
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion == null ? null : descripcion.trim();
    }

    public Date getFeccompra() {
        return feccompra;
    }

    public void setFeccompra(Date feccompra) {
        this.feccompra = feccompra;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
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