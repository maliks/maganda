package com.maganda.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DetalleventaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DetalleventaExample() {
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

        public Criteria andIdproductoIsNull() {
            addCriterion("IDPRODUCTO is null");
            return (Criteria) this;
        }

        public Criteria andIdproductoIsNotNull() {
            addCriterion("IDPRODUCTO is not null");
            return (Criteria) this;
        }

        public Criteria andIdproductoEqualTo(Integer value) {
            addCriterion("IDPRODUCTO =", value, "idproducto");
            return (Criteria) this;
        }

        public Criteria andIdproductoNotEqualTo(Integer value) {
            addCriterion("IDPRODUCTO <>", value, "idproducto");
            return (Criteria) this;
        }

        public Criteria andIdproductoGreaterThan(Integer value) {
            addCriterion("IDPRODUCTO >", value, "idproducto");
            return (Criteria) this;
        }

        public Criteria andIdproductoGreaterThanOrEqualTo(Integer value) {
            addCriterion("IDPRODUCTO >=", value, "idproducto");
            return (Criteria) this;
        }

        public Criteria andIdproductoLessThan(Integer value) {
            addCriterion("IDPRODUCTO <", value, "idproducto");
            return (Criteria) this;
        }

        public Criteria andIdproductoLessThanOrEqualTo(Integer value) {
            addCriterion("IDPRODUCTO <=", value, "idproducto");
            return (Criteria) this;
        }

        public Criteria andIdproductoIn(List<Integer> values) {
            addCriterion("IDPRODUCTO in", values, "idproducto");
            return (Criteria) this;
        }

        public Criteria andIdproductoNotIn(List<Integer> values) {
            addCriterion("IDPRODUCTO not in", values, "idproducto");
            return (Criteria) this;
        }

        public Criteria andIdproductoBetween(Integer value1, Integer value2) {
            addCriterion("IDPRODUCTO between", value1, value2, "idproducto");
            return (Criteria) this;
        }

        public Criteria andIdproductoNotBetween(Integer value1, Integer value2) {
            addCriterion("IDPRODUCTO not between", value1, value2, "idproducto");
            return (Criteria) this;
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

        public Criteria andNumventaEqualTo(Integer value) {
            addCriterion("NUMVENTA =", value, "numventa");
            return (Criteria) this;
        }

        public Criteria andNumventaNotEqualTo(Integer value) {
            addCriterion("NUMVENTA <>", value, "numventa");
            return (Criteria) this;
        }

        public Criteria andNumventaGreaterThan(Integer value) {
            addCriterion("NUMVENTA >", value, "numventa");
            return (Criteria) this;
        }

        public Criteria andNumventaGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUMVENTA >=", value, "numventa");
            return (Criteria) this;
        }

        public Criteria andNumventaLessThan(Integer value) {
            addCriterion("NUMVENTA <", value, "numventa");
            return (Criteria) this;
        }

        public Criteria andNumventaLessThanOrEqualTo(Integer value) {
            addCriterion("NUMVENTA <=", value, "numventa");
            return (Criteria) this;
        }

        public Criteria andNumventaIn(List<Integer> values) {
            addCriterion("NUMVENTA in", values, "numventa");
            return (Criteria) this;
        }

        public Criteria andNumventaNotIn(List<Integer> values) {
            addCriterion("NUMVENTA not in", values, "numventa");
            return (Criteria) this;
        }

        public Criteria andNumventaBetween(Integer value1, Integer value2) {
            addCriterion("NUMVENTA between", value1, value2, "numventa");
            return (Criteria) this;
        }

        public Criteria andNumventaNotBetween(Integer value1, Integer value2) {
            addCriterion("NUMVENTA not between", value1, value2, "numventa");
            return (Criteria) this;
        }

        public Criteria andCantidadIsNull() {
            addCriterion("CANTIDAD is null");
            return (Criteria) this;
        }

        public Criteria andCantidadIsNotNull() {
            addCriterion("CANTIDAD is not null");
            return (Criteria) this;
        }

        public Criteria andCantidadEqualTo(Integer value) {
            addCriterion("CANTIDAD =", value, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadNotEqualTo(Integer value) {
            addCriterion("CANTIDAD <>", value, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadGreaterThan(Integer value) {
            addCriterion("CANTIDAD >", value, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadGreaterThanOrEqualTo(Integer value) {
            addCriterion("CANTIDAD >=", value, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadLessThan(Integer value) {
            addCriterion("CANTIDAD <", value, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadLessThanOrEqualTo(Integer value) {
            addCriterion("CANTIDAD <=", value, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadIn(List<Integer> values) {
            addCriterion("CANTIDAD in", values, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadNotIn(List<Integer> values) {
            addCriterion("CANTIDAD not in", values, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadBetween(Integer value1, Integer value2) {
            addCriterion("CANTIDAD between", value1, value2, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadNotBetween(Integer value1, Integer value2) {
            addCriterion("CANTIDAD not between", value1, value2, "cantidad");
            return (Criteria) this;
        }

        public Criteria andMontoIsNull() {
            addCriterion("MONTO is null");
            return (Criteria) this;
        }

        public Criteria andMontoIsNotNull() {
            addCriterion("MONTO is not null");
            return (Criteria) this;
        }

        public Criteria andMontoEqualTo(BigDecimal value) {
            addCriterion("MONTO =", value, "monto");
            return (Criteria) this;
        }

        public Criteria andMontoNotEqualTo(BigDecimal value) {
            addCriterion("MONTO <>", value, "monto");
            return (Criteria) this;
        }

        public Criteria andMontoGreaterThan(BigDecimal value) {
            addCriterion("MONTO >", value, "monto");
            return (Criteria) this;
        }

        public Criteria andMontoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MONTO >=", value, "monto");
            return (Criteria) this;
        }

        public Criteria andMontoLessThan(BigDecimal value) {
            addCriterion("MONTO <", value, "monto");
            return (Criteria) this;
        }

        public Criteria andMontoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MONTO <=", value, "monto");
            return (Criteria) this;
        }

        public Criteria andMontoIn(List<BigDecimal> values) {
            addCriterion("MONTO in", values, "monto");
            return (Criteria) this;
        }

        public Criteria andMontoNotIn(List<BigDecimal> values) {
            addCriterion("MONTO not in", values, "monto");
            return (Criteria) this;
        }

        public Criteria andMontoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONTO between", value1, value2, "monto");
            return (Criteria) this;
        }

        public Criteria andMontoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONTO not between", value1, value2, "monto");
            return (Criteria) this;
        }

        public Criteria andDescuentoIsNull() {
            addCriterion("DESCUENTO is null");
            return (Criteria) this;
        }

        public Criteria andDescuentoIsNotNull() {
            addCriterion("DESCUENTO is not null");
            return (Criteria) this;
        }

        public Criteria andDescuentoEqualTo(BigDecimal value) {
            addCriterion("DESCUENTO =", value, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoNotEqualTo(BigDecimal value) {
            addCriterion("DESCUENTO <>", value, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoGreaterThan(BigDecimal value) {
            addCriterion("DESCUENTO >", value, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DESCUENTO >=", value, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoLessThan(BigDecimal value) {
            addCriterion("DESCUENTO <", value, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DESCUENTO <=", value, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoIn(List<BigDecimal> values) {
            addCriterion("DESCUENTO in", values, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoNotIn(List<BigDecimal> values) {
            addCriterion("DESCUENTO not in", values, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DESCUENTO between", value1, value2, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DESCUENTO not between", value1, value2, "descuento");
            return (Criteria) this;
        }

        public Criteria andEstproductoIsNull() {
            addCriterion("ESTPRODUCTO is null");
            return (Criteria) this;
        }

        public Criteria andEstproductoIsNotNull() {
            addCriterion("ESTPRODUCTO is not null");
            return (Criteria) this;
        }

        public Criteria andEstproductoEqualTo(String value) {
            addCriterion("ESTPRODUCTO =", value, "estproducto");
            return (Criteria) this;
        }

        public Criteria andEstproductoNotEqualTo(String value) {
            addCriterion("ESTPRODUCTO <>", value, "estproducto");
            return (Criteria) this;
        }

        public Criteria andEstproductoGreaterThan(String value) {
            addCriterion("ESTPRODUCTO >", value, "estproducto");
            return (Criteria) this;
        }

        public Criteria andEstproductoGreaterThanOrEqualTo(String value) {
            addCriterion("ESTPRODUCTO >=", value, "estproducto");
            return (Criteria) this;
        }

        public Criteria andEstproductoLessThan(String value) {
            addCriterion("ESTPRODUCTO <", value, "estproducto");
            return (Criteria) this;
        }

        public Criteria andEstproductoLessThanOrEqualTo(String value) {
            addCriterion("ESTPRODUCTO <=", value, "estproducto");
            return (Criteria) this;
        }

        public Criteria andEstproductoLike(String value) {
            addCriterion("ESTPRODUCTO like", value, "estproducto");
            return (Criteria) this;
        }

        public Criteria andEstproductoNotLike(String value) {
            addCriterion("ESTPRODUCTO not like", value, "estproducto");
            return (Criteria) this;
        }

        public Criteria andEstproductoIn(List<String> values) {
            addCriterion("ESTPRODUCTO in", values, "estproducto");
            return (Criteria) this;
        }

        public Criteria andEstproductoNotIn(List<String> values) {
            addCriterion("ESTPRODUCTO not in", values, "estproducto");
            return (Criteria) this;
        }

        public Criteria andEstproductoBetween(String value1, String value2) {
            addCriterion("ESTPRODUCTO between", value1, value2, "estproducto");
            return (Criteria) this;
        }

        public Criteria andEstproductoNotBetween(String value1, String value2) {
            addCriterion("ESTPRODUCTO not between", value1, value2, "estproducto");
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