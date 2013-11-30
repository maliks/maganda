package com.maganda.domain;

import java.util.Date;

public class Proveedor {
    private Integer idproveedor;

    private Integer iddocumento;

    private String numdocumento;

    private String numtelefono;

    private String direccion;

    private String estado;

    private Date fecregistro;

    private Date fecmodificacion;

    public Integer getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(Integer idproveedor) {
        this.idproveedor = idproveedor;
    }

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

    public String getNumtelefono() {
        return numtelefono;
    }

    public void setNumtelefono(String numtelefono) {
        this.numtelefono = numtelefono == null ? null : numtelefono.trim();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion == null ? null : direccion.trim();
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