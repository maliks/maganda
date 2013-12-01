package com.maganda.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Producto {
    private Integer idproducto;

    private String codproducto;

    private String nombre;

    private String descripcion;

    private String talla;

    private Integer idcolor;

    private Integer idcategoria;

    private Integer idmarca;

    private Integer iddocumento;

    private String numcompra;

    private Integer idproveedor;

    private BigDecimal moncosto;

    private BigDecimal monventa;

    private Date feccompra;

    private String estado;

    private Date fecregistro;

    private Date fecmodificacion;

    public Integer getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Integer idproducto) {
        this.idproducto = idproducto;
    }

    public String getCodproducto() {
        return codproducto;
    }

    public void setCodproducto(String codproducto) {
        this.codproducto = codproducto == null ? null : codproducto.trim();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre == null ? null : nombre.trim();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion == null ? null : descripcion.trim();
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla == null ? null : talla.trim();
    }

    public Integer getIdcolor() {
        return idcolor;
    }

    public void setIdcolor(Integer idcolor) {
        this.idcolor = idcolor;
    }

    public Integer getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(Integer idcategoria) {
        this.idcategoria = idcategoria;
    }

    public Integer getIdmarca() {
        return idmarca;
    }

    public void setIdmarca(Integer idmarca) {
        this.idmarca = idmarca;
    }

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

    public BigDecimal getMoncosto() {
        return moncosto;
    }

    public void setMoncosto(BigDecimal moncosto) {
        this.moncosto = moncosto;
    }

    public BigDecimal getMonventa() {
        return monventa;
    }

    public void setMonventa(BigDecimal monventa) {
        this.monventa = monventa;
    }

    public Date getFeccompra() {
        return feccompra;
    }

    public void setFeccompra(Date feccompra) {
        this.feccompra = feccompra;
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