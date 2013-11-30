package com.maganda.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Compra {
    private Integer iddocumento;

    private String numcompra;

    private Integer idproveedor;

    private Date feccompra;

    private Date fecentrega;

    private Date fecpago;

    private String estado;

    private BigDecimal moncompra;

    private BigDecimal monigv;

    private Date fecregistro;

    private Date fecmodificacion;

    public Integer getIddocumento() {
        return iddocumento;
    }

    public void setIddocumento(Integer iddocumento) {
        this.iddocumento = iddocumento;
    }

    public String getNumcompra() {
        return numcompra;
    }

    public void setNumcompra(String numcompra) {
        this.numcompra = numcompra == null ? null : numcompra.trim();
    }

    public Integer getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(Integer idproveedor) {
        this.idproveedor = idproveedor;
    }

    public Date getFeccompra() {
        return feccompra;
    }

    public void setFeccompra(Date feccompra) {
        this.feccompra = feccompra;
    }

    public Date getFecentrega() {
        return fecentrega;
    }

    public void setFecentrega(Date fecentrega) {
        this.fecentrega = fecentrega;
    }

    public Date getFecpago() {
        return fecpago;
    }

    public void setFecpago(Date fecpago) {
        this.fecpago = fecpago;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado == null ? null : estado.trim();
    }

    public BigDecimal getMoncompra() {
        return moncompra;
    }

    public void setMoncompra(BigDecimal moncompra) {
        this.moncompra = moncompra;
    }

    public BigDecimal getMonigv() {
        return monigv;
    }

    public void setMonigv(BigDecimal monigv) {
        this.monigv = monigv;
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