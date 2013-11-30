package com.maganda.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompraExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompraExample() {
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

        public Criteria andNumcompraIsNull() {
            addCriterion("NUMCOMPRA is null");
            return (Criteria) this;
        }

        public Criteria andNumcompraIsNotNull() {
            addCriterion("NUMCOMPRA is not null");
            return (Criteria) this;
        }

        public Criteria andNumcompraEqualTo(String value) {
            addCriterion("NUMCOMPRA =", value, "numcompra");
            return (Criteria) this;
        }

        public Criteria andNumcompraNotEqualTo(String value) {
            addCriterion("NUMCOMPRA <>", value, "numcompra");
            return (Criteria) this;
        }

        public Criteria andNumcompraGreaterThan(String value) {
            addCriterion("NUMCOMPRA >", value, "numcompra");
            return (Criteria) this;
        }

        public Criteria andNumcompraGreaterThanOrEqualTo(String value) {
            addCriterion("NUMCOMPRA >=", value, "numcompra");
            return (Criteria) this;
        }

        public Criteria andNumcompraLessThan(String value) {
            addCriterion("NUMCOMPRA <", value, "numcompra");
            return (Criteria) this;
        }

        public Criteria andNumcompraLessThanOrEqualTo(String value) {
            addCriterion("NUMCOMPRA <=", value, "numcompra");
            return (Criteria) this;
        }

        public Criteria andNumcompraLike(String value) {
            addCriterion("NUMCOMPRA like", value, "numcompra");
            return (Criteria) this;
        }

        public Criteria andNumcompraNotLike(String value) {
            addCriterion("NUMCOMPRA not like", value, "numcompra");
            return (Criteria) this;
        }

        public Criteria andNumcompraIn(List<String> values) {
            addCriterion("NUMCOMPRA in", values, "numcompra");
            return (Criteria) this;
        }

        public Criteria andNumcompraNotIn(List<String> values) {
            addCriterion("NUMCOMPRA not in", values, "numcompra");
            return (Criteria) this;
        }

        public Criteria andNumcompraBetween(String value1, String value2) {
            addCriterion("NUMCOMPRA between", value1, value2, "numcompra");
            return (Criteria) this;
        }

        public Criteria andNumcompraNotBetween(String value1, String value2) {
            addCriterion("NUMCOMPRA not between", value1, value2, "numcompra");
            return (Criteria) this;
        }

        public Criteria andIdproveedorIsNull() {
            addCriterion("IDPROVEEDOR is null");
            return (Criteria) this;
        }

        public Criteria andIdproveedorIsNotNull() {
            addCriterion("IDPROVEEDOR is not null");
            return (Criteria) this;
        }

        public Criteria andIdproveedorEqualTo(Integer value) {
            addCriterion("IDPROVEEDOR =", value, "idproveedor");
            return (Criteria) this;
        }

        public Criteria andIdproveedorNotEqualTo(Integer value) {
            addCriterion("IDPROVEEDOR <>", value, "idproveedor");
            return (Criteria) this;
        }

        public Criteria andIdproveedorGreaterThan(Integer value) {
            addCriterion("IDPROVEEDOR >", value, "idproveedor");
            return (Criteria) this;
        }

        public Criteria andIdproveedorGreaterThanOrEqualTo(Integer value) {
            addCriterion("IDPROVEEDOR >=", value, "idproveedor");
            return (Criteria) this;
        }

        public Criteria andIdproveedorLessThan(Integer value) {
            addCriterion("IDPROVEEDOR <", value, "idproveedor");
            return (Criteria) this;
        }

        public Criteria andIdproveedorLessThanOrEqualTo(Integer value) {
            addCriterion("IDPROVEEDOR <=", value, "idproveedor");
            return (Criteria) this;
        }

        public Criteria andIdproveedorIn(List<Integer> values) {
            addCriterion("IDPROVEEDOR in", values, "idproveedor");
            return (Criteria) this;
        }

        public Criteria andIdproveedorNotIn(List<Integer> values) {
            addCriterion("IDPROVEEDOR not in", values, "idproveedor");
            return (Criteria) this;
        }

        public Criteria andIdproveedorBetween(Integer value1, Integer value2) {
            addCriterion("IDPROVEEDOR between", value1, value2, "idproveedor");
            return (Criteria) this;
        }

        public Criteria andIdproveedorNotBetween(Integer value1, Integer value2) {
            addCriterion("IDPROVEEDOR not between", value1, value2, "idproveedor");
            return (Criteria) this;
        }

        public Criteria andFeccompraIsNull() {
            addCriterion("FECCOMPRA is null");
            return (Criteria) this;
        }

        public Criteria andFeccompraIsNotNull() {
            addCriterion("FECCOMPRA is not null");
            return (Criteria) this;
        }

        public Criteria andFeccompraEqualTo(Date value) {
            addCriterion("FECCOMPRA =", value, "feccompra");
            return (Criteria) this;
        }

        public Criteria andFeccompraNotEqualTo(Date value) {
            addCriterion("FECCOMPRA <>", value, "feccompra");
            return (Criteria) this;
        }

        public Criteria andFeccompraGreaterThan(Date value) {
            addCriterion("FECCOMPRA >", value, "feccompra");
            return (Criteria) this;
        }

        public Criteria andFeccompraGreaterThanOrEqualTo(Date value) {
            addCriterion("FECCOMPRA >=", value, "feccompra");
            return (Criteria) this;
        }

        public Criteria andFeccompraLessThan(Date value) {
            addCriterion("FECCOMPRA <", value, "feccompra");
            return (Criteria) this;
        }

        public Criteria andFeccompraLessThanOrEqualTo(Date value) {
            addCriterion("FECCOMPRA <=", value, "feccompra");
            return (Criteria) this;
        }

        public Criteria andFeccompraIn(List<Date> values) {
            addCriterion("FECCOMPRA in", values, "feccompra");
            return (Criteria) this;
        }

        public Criteria andFeccompraNotIn(List<Date> values) {
            addCriterion("FECCOMPRA not in", values, "feccompra");
            return (Criteria) this;
        }

        public Criteria andFeccompraBetween(Date value1, Date value2) {
            addCriterion("FECCOMPRA between", value1, value2, "feccompra");
            return (Criteria) this;
        }

        public Criteria andFeccompraNotBetween(Date value1, Date value2) {
            addCriterion("FECCOMPRA not between", value1, value2, "feccompra");
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

        public Criteria andMoncompraIsNull() {
            addCriterion("MONCOMPRA is null");
            return (Criteria) this;
        }

        public Criteria andMoncompraIsNotNull() {
            addCriterion("MONCOMPRA is not null");
            return (Criteria) this;
        }

        public Criteria andMoncompraEqualTo(BigDecimal value) {
            addCriterion("MONCOMPRA =", value, "moncompra");
            return (Criteria) this;
        }

        public Criteria andMoncompraNotEqualTo(BigDecimal value) {
            addCriterion("MONCOMPRA <>", value, "moncompra");
            return (Criteria) this;
        }

        public Criteria andMoncompraGreaterThan(BigDecimal value) {
            addCriterion("MONCOMPRA >", value, "moncompra");
            return (Criteria) this;
        }

        public Criteria andMoncompraGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MONCOMPRA >=", value, "moncompra");
            return (Criteria) this;
        }

        public Criteria andMoncompraLessThan(BigDecimal value) {
            addCriterion("MONCOMPRA <", value, "moncompra");
            return (Criteria) this;
        }

        public Criteria andMoncompraLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MONCOMPRA <=", value, "moncompra");
            return (Criteria) this;
        }

        public Criteria andMoncompraIn(List<BigDecimal> values) {
            addCriterion("MONCOMPRA in", values, "moncompra");
            return (Criteria) this;
        }

        public Criteria andMoncompraNotIn(List<BigDecimal> values) {
            addCriterion("MONCOMPRA not in", values, "moncompra");
            return (Criteria) this;
        }

        public Criteria andMoncompraBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONCOMPRA between", value1, value2, "moncompra");
            return (Criteria) this;
        }

        public Criteria andMoncompraNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONCOMPRA not between", value1, value2, "moncompra");
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