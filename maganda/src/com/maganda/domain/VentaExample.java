package com.maganda.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VentaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VentaExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIddocumentoIsNull() {
            addCriterion("IDDOCUMENTO is null");
            return (Criteria) this;
        }

        public Criteria andIddocumentoIsNotNull() {
            addCriterion("IDDOCUMENTO is not null");
            return (Criteria) this;
        }

        public Criteria andIddocumentoEqualTo(Integer value) {
            addCriterion("IDDOCUMENTO =", value, "iddocumento");
            return (Criteria) this;
        }

        public Criteria andIddocumentoNotEqualTo(Integer value) {
            addCriterion("IDDOCUMENTO <>", value, "iddocumento");
            return (Criteria) this;
        }

        public Criteria andIddocumentoGreaterThan(Integer value) {
            addCriterion("IDDOCUMENTO >", value, "iddocumento");
            return (Criteria) this;
        }

        public Criteria andIddocumentoGreaterThanOrEqualTo(Integer value) {
            addCriterion("IDDOCUMENTO >=", value, "iddocumento");
            return (Criteria) this;
        }

        public Criteria andIddocumentoLessThan(Integer value) {
            addCriterion("IDDOCUMENTO <", value, "iddocumento");
            return (Criteria) this;
        }

        public Criteria andIddocumentoLessThanOrEqualTo(Integer value) {
            addCriterion("IDDOCUMENTO <=", value, "iddocumento");
            return (Criteria) this;
        }

        public Criteria andIddocumentoIn(List<Integer> values) {
            addCriterion("IDDOCUMENTO in", values, "iddocumento");
            return (Criteria) this;
        }

        public Criteria andIddocumentoNotIn(List<Integer> values) {
            addCriterion("IDDOCUMENTO not in", values, "iddocumento");
            return (Criteria) this;
        }

        public Criteria andIddocumentoBetween(Integer value1, Integer value2) {
            addCriterion("IDDOCUMENTO between", value1, value2, "iddocumento");
            return (Criteria) this;
        }

        public Criteria andIddocumentoNotBetween(Integer value1, Integer value2) {
            addCriterion("IDDOCUMENTO not between", value1, value2, "iddocumento");
            return (Criteria) this;
        }

        public Criteria andNumventaIsNull() {
            addCriterion("NUMVENTA is null");
            return (Criteria) this;
        }

        public Criteria andNumventaIsNotNull() {
            addCriterion("NUMVENTA is not null");
            return (Criteria) this;
        }

        public Criteria andNumventaEqualTo(String value) {
            addCriterion("NUMVENTA =", value, "numventa");
            return (Criteria) this;
        }

        public Criteria andNumventaNotEqualTo(String value) {
            addCriterion("NUMVENTA <>", value, "numventa");
            return (Criteria) this;
        }

        public Criteria andNumventaGreaterThan(String value) {
            addCriterion("NUMVENTA >", value, "numventa");
            return (Criteria) this;
        }

        public Criteria andNumventaGreaterThanOrEqualTo(String value) {
            addCriterion("NUMVENTA >=", value, "numventa");
            return (Criteria) this;
        }

        public Criteria andNumventaLessThan(String value) {
            addCriterion("NUMVENTA <", value, "numventa");
            return (Criteria) this;
        }

        public Criteria andNumventaLessThanOrEqualTo(String value) {
            addCriterion("NUMVENTA <=", value, "numventa");
            return (Criteria) this;
        }

        public Criteria andNumventaLike(String value) {
            addCriterion("NUMVENTA like", value, "numventa");
            return (Criteria) this;
        }

        public Criteria andNumventaNotLike(String value) {
            addCriterion("NUMVENTA not like", value, "numventa");
            return (Criteria) this;
        }

        public Criteria andNumventaIn(List<String> values) {
            addCriterion("NUMVENTA in", values, "numventa");
            return (Criteria) this;
        }

        public Criteria andNumventaNotIn(List<String> values) {
            addCriterion("NUMVENTA not in", values, "numventa");
            return (Criteria) this;
        }

        public Criteria andNumventaBetween(String value1, String value2) {
            addCriterion("NUMVENTA between", value1, value2, "numventa");
            return (Criteria) this;
        }

        public Criteria andNumventaNotBetween(String value1, String value2) {
            addCriterion("NUMVENTA not between", value1, value2, "numventa");
            return (Criteria) this;
        }

        public Criteria andIdclienteIsNull() {
            addCriterion("IDCLIENTE is null");
            return (Criteria) this;
        }

        public Criteria andIdclienteIsNotNull() {
            addCriterion("IDCLIENTE is not null");
            return (Criteria) this;
        }

        public Criteria andIdclienteEqualTo(Integer value) {
            addCriterion("IDCLIENTE =", value, "idcliente");
            return (Criteria) this;
        }

        public Criteria andIdclienteNotEqualTo(Integer value) {
            addCriterion("IDCLIENTE <>", value, "idcliente");
            return (Criteria) this;
        }

        public Criteria andIdclienteGreaterThan(Integer value) {
            addCriterion("IDCLIENTE >", value, "idcliente");
            return (Criteria) this;
        }

        public Criteria andIdclienteGreaterThanOrEqualTo(Integer value) {
            addCriterion("IDCLIENTE >=", value, "idcliente");
            return (Criteria) this;
        }

        public Criteria andIdclienteLessThan(Integer value) {
            addCriterion("IDCLIENTE <", value, "idcliente");
            return (Criteria) this;
        }

        public Criteria andIdclienteLessThanOrEqualTo(Integer value) {
            addCriterion("IDCLIENTE <=", value, "idcliente");
            return (Criteria) this;
        }

        public Criteria andIdclienteIn(List<Integer> values) {
            addCriterion("IDCLIENTE in", values, "idcliente");
            return (Criteria) this;
        }

        public Criteria andIdclienteNotIn(List<Integer> values) {
            addCriterion("IDCLIENTE not in", values, "idcliente");
            return (Criteria) this;
        }

        public Criteria andIdclienteBetween(Integer value1, Integer value2) {
            addCriterion("IDCLIENTE between", value1, value2, "idcliente");
            return (Criteria) this;
        }

        public Criteria andIdclienteNotBetween(Integer value1, Integer value2) {
            addCriterion("IDCLIENTE not between", value1, value2, "idcliente");
            return (Criteria) this;
        }

        public Criteria andFecventaIsNull() {
            addCriterion("FECVENTA is null");
            return (Criteria) this;
        }

        public Criteria andFecventaIsNotNull() {
            addCriterion("FECVENTA is not null");
            return (Criteria) this;
        }

        public Criteria andFecventaEqualTo(Date value) {
            addCriterion("FECVENTA =", value, "fecventa");
            return (Criteria) this;
        }

        public Criteria andFecventaNotEqualTo(Date value) {
            addCriterion("FECVENTA <>", value, "fecventa");
            return (Criteria) this;
        }

        public Criteria andFecventaGreaterThan(Date value) {
            addCriterion("FECVENTA >", value, "fecventa");
            return (Criteria) this;
        }

        public Criteria andFecventaGreaterThanOrEqualTo(Date value) {
            addCriterion("FECVENTA >=", value, "fecventa");
            return (Criteria) this;
        }

        public Criteria andFecventaLessThan(Date value) {
            addCriterion("FECVENTA <", value, "fecventa");
            return (Criteria) this;
        }

        public Criteria andFecventaLessThanOrEqualTo(Date value) {
            addCriterion("FECVENTA <=", value, "fecventa");
            return (Criteria) this;
        }

        public Criteria andFecventaIn(List<Date> values) {
            addCriterion("FECVENTA in", values, "fecventa");
            return (Criteria) this;
        }

        public Criteria andFecventaNotIn(List<Date> values) {
            addCriterion("FECVENTA not in", values, "fecventa");
            return (Criteria) this;
        }

        public Criteria andFecventaBetween(Date value1, Date value2) {
            addCriterion("FECVENTA between", value1, value2, "fecventa");
            return (Criteria) this;
        }

        public Criteria andFecventaNotBetween(Date value1, Date value2) {
            addCriterion("FECVENTA not between", value1, value2, "fecventa");
            return (Criteria) this;
        }

        public Criteria andFecentregaIsNull() {
            addCriterion("FECENTREGA is null");
            return (Criteria) this;
        }

        public Criteria andFecentregaIsNotNull() {
            addCriterion("FECENTREGA is not null");
            return (Criteria) this;
        }

        public Criteria andFecentregaEqualTo(Date value) {
            addCriterion("FECENTREGA =", value, "fecentrega");
            return (Criteria) this;
        }

        public Criteria andFecentregaNotEqualTo(Date value) {
            addCriterion("FECENTREGA <>", value, "fecentrega");
            return (Criteria) this;
        }

        public Criteria andFecentregaGreaterThan(Date value) {
            addCriterion("FECENTREGA >", value, "fecentrega");
            return (Criteria) this;
        }

        public Criteria andFecentregaGreaterThanOrEqualTo(Date value) {
            addCriterion("FECENTREGA >=", value, "fecentrega");
            return (Criteria) this;
        }

        public Criteria andFecentregaLessThan(Date value) {
            addCriterion("FECENTREGA <", value, "fecentrega");
            return (Criteria) this;
        }

        public Criteria andFecentregaLessThanOrEqualTo(Date value) {
            addCriterion("FECENTREGA <=", value, "fecentrega");
            return (Criteria) this;
        }

        public Criteria andFecentregaIn(List<Date> values) {
            addCriterion("FECENTREGA in", values, "fecentrega");
            return (Criteria) this;
        }

        public Criteria andFecentregaNotIn(List<Date> values) {
            addCriterion("FECENTREGA not in", values, "fecentrega");
            return (Criteria) this;
        }

        public Criteria andFecentregaBetween(Date value1, Date value2) {
            addCriterion("FECENTREGA between", value1, value2, "fecentrega");
            return (Criteria) this;
        }

        public Criteria andFecentregaNotBetween(Date value1, Date value2) {
            addCriterion("FECENTREGA not between", value1, value2, "fecentrega");
            return (Criteria) this;
        }

        public Criteria andFecpagoIsNull() {
            addCriterion("FECPAGO is null");
            return (Criteria) this;
        }

        public Criteria andFecpagoIsNotNull() {
            addCriterion("FECPAGO is not null");
            return (Criteria) this;
        }

        public Criteria andFecpagoEqualTo(Date value) {
            addCriterion("FECPAGO =", value, "fecpago");
            return (Criteria) this;
        }

        public Criteria andFecpagoNotEqualTo(Date value) {
            addCriterion("FECPAGO <>", value, "fecpago");
            return (Criteria) this;
        }

        public Criteria andFecpagoGreaterThan(Date value) {
            addCriterion("FECPAGO >", value, "fecpago");
            return (Criteria) this;
        }

        public Criteria andFecpagoGreaterThanOrEqualTo(Date value) {
            addCriterion("FECPAGO >=", value, "fecpago");
            return (Criteria) this;
        }

        public Criteria andFecpagoLessThan(Date value) {
            addCriterion("FECPAGO <", value, "fecpago");
            return (Criteria) this;
        }

        public Criteria andFecpagoLessThanOrEqualTo(Date value) {
            addCriterion("FECPAGO <=", value, "fecpago");
            return (Criteria) this;
        }

        public Criteria andFecpagoIn(List<Date> values) {
            addCriterion("FECPAGO in", values, "fecpago");
            return (Criteria) this;
        }

        public Criteria andFecpagoNotIn(List<Date> values) {
            addCriterion("FECPAGO not in", values, "fecpago");
            return (Criteria) this;
        }

        public Criteria andFecpagoBetween(Date value1, Date value2) {
            addCriterion("FECPAGO between", value1, value2, "fecpago");
            return (Criteria) this;
        }

        public Criteria andFecpagoNotBetween(Date value1, Date value2) {
            addCriterion("FECPAGO not between", value1, value2, "fecpago");
            return (Criteria) this;
        }

        public Criteria andEstadoIsNull() {
            addCriterion("ESTADO is null");
            return (Criteria) this;
        }

        public Criteria andEstadoIsNotNull() {
            addCriterion("ESTADO is not null");
            return (Criteria) this;
        }

        public Criteria andEstadoEqualTo(String value) {
            addCriterion("ESTADO =", value, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoNotEqualTo(String value) {
            addCriterion("ESTADO <>", value, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoGreaterThan(String value) {
            addCriterion("ESTADO >", value, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoGreaterThanOrEqualTo(String value) {
            addCriterion("ESTADO >=", value, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoLessThan(String value) {
            addCriterion("ESTADO <", value, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoLessThanOrEqualTo(String value) {
            addCriterion("ESTADO <=", value, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoLike(String value) {
            addCriterion("ESTADO like", value, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoNotLike(String value) {
            addCriterion("ESTADO not like", value, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoIn(List<String> values) {
            addCriterion("ESTADO in", values, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoNotIn(List<String> values) {
            addCriterion("ESTADO not in", values, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoBetween(String value1, String value2) {
            addCriterion("ESTADO between", value1, value2, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoNotBetween(String value1, String value2) {
            addCriterion("ESTADO not between", value1, value2, "estado");
            return (Criteria) this;
        }

        public Criteria andMonventaIsNull() {
            addCriterion("MONVENTA is null");
            return (Criteria) this;
        }

        public Criteria andMonventaIsNotNull() {
            addCriterion("MONVENTA is not null");
            return (Criteria) this;
        }

        public Criteria andMonventaEqualTo(BigDecimal value) {
            addCriterion("MONVENTA =", value, "monventa");
            return (Criteria) this;
        }

        public Criteria andMonventaNotEqualTo(BigDecimal value) {
            addCriterion("MONVENTA <>", value, "monventa");
            return (Criteria) this;
        }

        public Criteria andMonventaGreaterThan(BigDecimal value) {
            addCriterion("MONVENTA >", value, "monventa");
            return (Criteria) this;
        }

        public Criteria andMonventaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MONVENTA >=", value, "monventa");
            return (Criteria) this;
        }

        public Criteria andMonventaLessThan(BigDecimal value) {
            addCriterion("MONVENTA <", value, "monventa");
            return (Criteria) this;
        }

        public Criteria andMonventaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MONVENTA <=", value, "monventa");
            return (Criteria) this;
        }

        public Criteria andMonventaIn(List<BigDecimal> values) {
            addCriterion("MONVENTA in", values, "monventa");
            return (Criteria) this;
        }

        public Criteria andMonventaNotIn(List<BigDecimal> values) {
            addCriterion("MONVENTA not in", values, "monventa");
            return (Criteria) this;
        }

        public Criteria andMonventaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONVENTA between", value1, value2, "monventa");
            return (Criteria) this;
        }

        public Criteria andMonventaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONVENTA not between", value1, value2, "monventa");
            return (Criteria) this;
        }

        public Criteria andMondescuentoIsNull() {
            addCriterion("MONDESCUENTO is null");
            return (Criteria) this;
        }

        public Criteria andMondescuentoIsNotNull() {
            addCriterion("MONDESCUENTO is not null");
            return (Criteria) this;
        }

        public Criteria andMondescuentoEqualTo(BigDecimal value) {
            addCriterion("MONDESCUENTO =", value, "mondescuento");
            return (Criteria) this;
        }

        public Criteria andMondescuentoNotEqualTo(BigDecimal value) {
            addCriterion("MONDESCUENTO <>", value, "mondescuento");
            return (Criteria) this;
        }

        public Criteria andMondescuentoGreaterThan(BigDecimal value) {
            addCriterion("MONDESCUENTO >", value, "mondescuento");
            return (Criteria) this;
        }

        public Criteria andMondescuentoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MONDESCUENTO >=", value, "mondescuento");
            return (Criteria) this;
        }

        public Criteria andMondescuentoLessThan(BigDecimal value) {
            addCriterion("MONDESCUENTO <", value, "mondescuento");
            return (Criteria) this;
        }

        public Criteria andMondescuentoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MONDESCUENTO <=", value, "mondescuento");
            return (Criteria) this;
        }

        public Criteria andMondescuentoIn(List<BigDecimal> values) {
            addCriterion("MONDESCUENTO in", values, "mondescuento");
            return (Criteria) this;
        }

        public Criteria andMondescuentoNotIn(List<BigDecimal> values) {
            addCriterion("MONDESCUENTO not in", values, "mondescuento");
            return (Criteria) this;
        }

        public Criteria andMondescuentoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONDESCUENTO between", value1, value2, "mondescuento");
            return (Criteria) this;
        }

        public Criteria andMondescuentoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONDESCUENTO not between", value1, value2, "mondescuento");
            return (Criteria) this;
        }

        public Criteria andMonadelantoIsNull() {
            addCriterion("MONADELANTO is null");
            return (Criteria) this;
        }

        public Criteria andMonadelantoIsNotNull() {
            addCriterion("MONADELANTO is not null");
            return (Criteria) this;
        }

        public Criteria andMonadelantoEqualTo(BigDecimal value) {
            addCriterion("MONADELANTO =", value, "monadelanto");
            return (Criteria) this;
        }

        public Criteria andMonadelantoNotEqualTo(BigDecimal value) {
            addCriterion("MONADELANTO <>", value, "monadelanto");
            return (Criteria) this;
        }

        public Criteria andMonadelantoGreaterThan(BigDecimal value) {
            addCriterion("MONADELANTO >", value, "monadelanto");
            return (Criteria) this;
        }

        public Criteria andMonadelantoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MONADELANTO >=", value, "monadelanto");
            return (Criteria) this;
        }

        public Criteria andMonadelantoLessThan(BigDecimal value) {
            addCriterion("MONADELANTO <", value, "monadelanto");
            return (Criteria) this;
        }

        public Criteria andMonadelantoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MONADELANTO <=", value, "monadelanto");
            return (Criteria) this;
        }

        public Criteria andMonadelantoIn(List<BigDecimal> values) {
            addCriterion("MONADELANTO in", values, "monadelanto");
            return (Criteria) this;
        }

        public Criteria andMonadelantoNotIn(List<BigDecimal> values) {
            addCriterion("MONADELANTO not in", values, "monadelanto");
            return (Criteria) this;
        }

        public Criteria andMonadelantoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONADELANTO between", value1, value2, "monadelanto");
            return (Criteria) this;
        }

        public Criteria andMonadelantoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONADELANTO not between", value1, value2, "monadelanto");
            return (Criteria) this;
        }

        public Criteria andMonigvIsNull() {
            addCriterion("MONIGV is null");
            return (Criteria) this;
        }

        public Criteria andMonigvIsNotNull() {
            addCriterion("MONIGV is not null");
            return (Criteria) this;
        }

        public Criteria andMonigvEqualTo(BigDecimal value) {
            addCriterion("MONIGV =", value, "monigv");
            return (Criteria) this;
        }

        public Criteria andMonigvNotEqualTo(BigDecimal value) {
            addCriterion("MONIGV <>", value, "monigv");
            return (Criteria) this;
        }

        public Criteria andMonigvGreaterThan(BigDecimal value) {
            addCriterion("MONIGV >", value, "monigv");
            return (Criteria) this;
        }

        public Criteria andMonigvGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MONIGV >=", value, "monigv");
            return (Criteria) this;
        }

        public Criteria andMonigvLessThan(BigDecimal value) {
            addCriterion("MONIGV <", value, "monigv");
            return (Criteria) this;
        }

        public Criteria andMonigvLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MONIGV <=", value, "monigv");
            return (Criteria) this;
        }

        public Criteria andMonigvIn(List<BigDecimal> values) {
            addCriterion("MONIGV in", values, "monigv");
            return (Criteria) this;
        }

        public Criteria andMonigvNotIn(List<BigDecimal> values) {
            addCriterion("MONIGV not in", values, "monigv");
            return (Criteria) this;
        }

        public Criteria andMonigvBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONIGV between", value1, value2, "monigv");
            return (Criteria) this;
        }

        public Criteria andMonigvNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONIGV not between", value1, value2, "monigv");
            return (Criteria) this;
        }

        public Criteria andFecregistroIsNull() {
            addCriterion("FECREGISTRO is null");
            return (Criteria) this;
        }

        public Criteria andFecregistroIsNotNull() {
            addCriterion("FECREGISTRO is not null");
            return (Criteria) this;
        }

        public Criteria andFecregistroEqualTo(Date value) {
            addCriterion("FECREGISTRO =", value, "fecregistro");
            return (Criteria) this;
        }

        public Criteria andFecregistroNotEqualTo(Date value) {
            addCriterion("FECREGISTRO <>", value, "fecregistro");
            return (Criteria) this;
        }

        public Criteria andFecregistroGreaterThan(Date value) {
            addCriterion("FECREGISTRO >", value, "fecregistro");
            return (Criteria) this;
        }

        public Criteria andFecregistroGreaterThanOrEqualTo(Date value) {
            addCriterion("FECREGISTRO >=", value, "fecregistro");
            return (Criteria) this;
        }

        public Criteria andFecregistroLessThan(Date value) {
            addCriterion("FECREGISTRO <", value, "fecregistro");
            return (Criteria) this;
        }

        public Criteria andFecregistroLessThanOrEqualTo(Date value) {
            addCriterion("FECREGISTRO <=", value, "fecregistro");
            return (Criteria) this;
        }

        public Criteria andFecregistroIn(List<Date> values) {
            addCriterion("FECREGISTRO in", values, "fecregistro");
            return (Criteria) this;
        }

        public Criteria andFecregistroNotIn(List<Date> values) {
            addCriterion("FECREGISTRO not in", values, "fecregistro");
            return (Criteria) this;
        }

        public Criteria andFecregistroBetween(Date value1, Date value2) {
            addCriterion("FECREGISTRO between", value1, value2, "fecregistro");
            return (Criteria) this;
        }

        public Criteria andFecregistroNotBetween(Date value1, Date value2) {
            addCriterion("FECREGISTRO not between", value1, value2, "fecregistro");
            return (Criteria) this;
        }

        public Criteria andFecmodificacionIsNull() {
            addCriterion("FECMODIFICACION is null");
            return (Criteria) this;
        }

        public Criteria andFecmodificacionIsNotNull() {
            addCriterion("FECMODIFICACION is not null");
            return (Criteria) this;
        }

        public Criteria andFecmodificacionEqualTo(Date value) {
            addCriterion("FECMODIFICACION =", value, "fecmodificacion");
            return (Criteria) this;
        }

        public Criteria andFecmodificacionNotEqualTo(Date value) {
            addCriterion("FECMODIFICACION <>", value, "fecmodificacion");
            return (Criteria) this;
        }

        public Criteria andFecmodificacionGreaterThan(Date value) {
            addCriterion("FECMODIFICACION >", value, "fecmodificacion");
            return (Criteria) this;
        }

        public Criteria andFecmodificacionGreaterThanOrEqualTo(Date value) {
            addCriterion("FECMODIFICACION >=", value, "fecmodificacion");
            return (Criteria) this;
        }

        public Criteria andFecmodificacionLessThan(Date value) {
            addCriterion("FECMODIFICACION <", value, "fecmodificacion");
            return (Criteria) this;
        }

        public Criteria andFecmodificacionLessThanOrEqualTo(Date value) {
            addCriterion("FECMODIFICACION <=", value, "fecmodificacion");
            return (Criteria) this;
        }

        public Criteria andFecmodificacionIn(List<Date> values) {
            addCriterion("FECMODIFICACION in", values, "fecmodificacion");
            return (Criteria) this;
        }

        public Criteria andFecmodificacionNotIn(List<Date> values) {
            addCriterion("FECMODIFICACION not in", values, "fecmodificacion");
            return (Criteria) this;
        }

        public Criteria andFecmodificacionBetween(Date value1, Date value2) {
            addCriterion("FECMODIFICACION between", value1, value2, "fecmodificacion");
            return (Criteria) this;
        }

        public Criteria andFecmodificacionNotBetween(Date value1, Date value2) {
            addCriterion("FECMODIFICACION not between", value1, value2, "fecmodificacion");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}