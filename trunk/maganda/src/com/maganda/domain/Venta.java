package com.maganda.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Venta {
    private Integer iddocumento;

    private Integer numventa;

    private Integer idcliente;

    private Date fecventa;

    private Date fecentrega;

    private Date fecpago;

    private String estado;

    private BigDecimal monventa;

    private BigDecimal mondescuento;

    private BigDecimal monadelanto;

    private BigDecimal monigv;

    private Date fecregistro;

    private Date fecmodificacion;

	private String desDocVenta;
	private String numDocCliente;
	private String desDocCliente;
	private String nomCliente;
    private double monTotal;
    

    public Integer getIddocumento() {
        return iddocumento;
    }

    public void setIddocumento(Integer iddocumento) {
        this.iddocumento = iddocumento;
    }

    public Integer getNumventa() {
        return numventa;
    }

    public void setNumventa(Integer numventa) {
        this.numventa = numventa;
    }

    public Integer getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Integer idcliente) {
        this.idcliente = idcliente;
    }

    public Date getFecventa() {
        return fecventa;
    }

    public void setFecventa(Date fecventa) {
        this.fecventa = fecventa;
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

    public BigDecimal getMonventa() {
        return monventa;
    }

    public void setMonventa(BigDecimal monventa) {
        this.monventa = monventa;
    }

    public BigDecimal getMondescuento() {
        return mondescuento;
    }

    public void setMondescuento(BigDecimal mondescuento) {
        this.mondescuento = mondescuento;
    }

    public BigDecimal getMonadelanto() {
        return monadelanto;
    }

    public void setMonadelanto(BigDecimal monadelanto) {
        this.monadelanto = monadelanto;
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

	public String getDesDocVenta() {
		return desDocVenta;
	}

	public void setDesDocVenta(String desDocVenta) {
		this.desDocVenta = desDocVenta;
	}

	public String getNumDocCliente() {
		return numDocCliente;
	}

	public void setNumDocCliente(String numDocCliente) {
		this.numDocCliente = numDocCliente;
	}

	public String getDesDocCliente() {
		return desDocCliente;
	}

	public void setDesDocCliente(String desDocCliente) {
		this.desDocCliente = desDocCliente;
	}

	public String getNomCliente() {
		return nomCliente;
	}

	public void setNomCliente(String nomCliente) {
		this.nomCliente = nomCliente;
	}

	public double getMonTotal() {
		return monTotal;
	}

	public void setMonTotal(double monTotal) {
		this.monTotal = monTotal;
	}
}