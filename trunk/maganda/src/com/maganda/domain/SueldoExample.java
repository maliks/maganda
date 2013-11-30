package com.maganda.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SueldoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SueldoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdempleadoIsNull() {
            addCriterion("IDEMPLEADO is null");
            return (Criteria) this;
        }

        public Criteria andIdempleadoIsNotNull() {
            addCriterion("IDEMPLEADO is not null");
            return (Criteria) this;
        }

        public Criteria andIdempleadoEqualTo(Integer value) {
            addCriterion("IDEMPLEADO =", value, "idempleado");
            return (Criteria) this;
        }

        public Criteria andIdempleadoNotEqualTo(Integer value) {
            addCriterion("IDEMPLEADO <>", value, "idempleado");
            return (Criteria) this;
        }

        public Criteria andIdempleadoGreaterThan(Integer value) {
            addCriterion("IDEMPLEADO >", value, "idempleado");
            return (Criteria) this;
        }

        public Criteria andIdempleadoGreaterThanOrEqualTo(Integer value) {
            addCriterion("IDEMPLEADO >=", value, "idempleado");
            return (Criteria) this;
        }

        public Criteria andIdempleadoLessThan(Integer value) {
            addCriterion("IDEMPLEADO <", value, "idempleado");
            return (Criteria) this;
        }

        public Criteria andIdempleadoLessThanOrEqualTo(Integer value) {
            addCriterion("IDEMPLEADO <=", value, "idempleado");
            return (Criteria) this;
        }

        public Criteria andIdempleadoIn(List<Integer> values) {
            addCriterion("IDEMPLEADO in", values, "idempleado");
            return (Criteria) this;
        }

        public Criteria andIdempleadoNotIn(List<Integer> values) {
            addCriterion("IDEMPLEADO not in", values, "idempleado");
            return (Criteria) this;
        }

        public Criteria andIdempleadoBetween(Integer value1, Integer value2) {
            addCriterion("IDEMPLEADO between", value1, value2, "idempleado");
            return (Criteria) this;
        }

        public Criteria andIdempleadoNotBetween(Integer value1, Integer value2) {
            addCriterion("IDEMPLEADO not between", value1, value2, "idempleado");
            return (Criteria) this;
        }

        public Criteria andFecinicioIsNull() {
            addCriterion("FECINICIO is null");
            return (Criteria) this;
        }

        public Criteria andFecinicioIsNotNull() {
            addCriterion("FECINICIO is not null");
            return (Criteria) this;
        }

        public Criteria andFecinicioEqualTo(Date value) {
            addCriterionForJDBCDate("FECINICIO =", value, "fecinicio");
            return (Criteria) this;
        }

        public Criteria andFecinicioNotEqualTo(Date value) {
            addCriterionForJDBCDate("FECINICIO <>", value, "fecinicio");
            return (Criteria) this;
        }

        public Criteria andFecinicioGreaterThan(Date value) {
            addCriterionForJDBCDate("FECINICIO >", value, "fecinicio");
            return (Criteria) this;
        }

        public Criteria andFecinicioGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FECINICIO >=", value, "fecinicio");
            return (Criteria) this;
        }

        public Criteria andFecinicioLessThan(Date value) {
            addCriterionForJDBCDate("FECINICIO <", value, "fecinicio");
            return (Criteria) this;
        }

        public Criteria andFecinicioLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FECINICIO <=", value, "fecinicio");
            return (Criteria) this;
        }

        public Criteria andFecinicioIn(List<Date> values) {
            addCriterionForJDBCDate("FECINICIO in", values, "fecinicio");
            return (Criteria) this;
        }

        public Criteria andFecinicioNotIn(List<Date> values) {
            addCriterionForJDBCDate("FECINICIO not in", values, "fecinicio");
            return (Criteria) this;
        }

        public Criteria andFecinicioBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FECINICIO between", value1, value2, "fecinicio");
            return (Criteria) this;
        }

        public Criteria andFecinicioNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FECINICIO not between", value1, value2, "fecinicio");
            return (Criteria) this;
        }

        public Criteria andFecfinIsNull() {
            addCriterion("FECFIN is null");
            return (Criteria) this;
        }

        public Criteria andFecfinIsNotNull() {
            addCriterion("FECFIN is not null");
            return (Criteria) this;
        }

        public Criteria andFecfinEqualTo(Date value) {
            addCriterionForJDBCDate("FECFIN =", value, "fecfin");
            return (Criteria) this;
        }

        public Criteria andFecfinNotEqualTo(Date value) {
            addCriterionForJDBCDate("FECFIN <>", value, "fecfin");
            return (Criteria) this;
        }

        public Criteria andFecfinGreaterThan(Date value) {
            addCriterionForJDBCDate("FECFIN >", value, "fecfin");
            return (Criteria) this;
        }

        public Criteria andFecfinGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FECFIN >=", value, "fecfin");
            return (Criteria) this;
        }

        public Criteria andFecfinLessThan(Date value) {
            addCriterionForJDBCDate("FECFIN <", value, "fecfin");
            return (Criteria) this;
        }

        public Criteria andFecfinLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FECFIN <=", value, "fecfin");
            return (Criteria) this;
        }

        public Criteria andFecfinIn(List<Date> values) {
            addCriterionForJDBCDate("FECFIN in", values, "fecfin");
            return (Criteria) this;
        }

        public Criteria andFecfinNotIn(List<Date> values) {
            addCriterionForJDBCDate("FECFIN not in", values, "fecfin");
            return (Criteria) this;
        }

        public Criteria andFecfinBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FECFIN between", value1, value2, "fecfin");
            return (Criteria) this;
        }

        public Criteria andFecfinNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FECFIN not between", value1, value2, "fecfin");
            return (Criteria) this;
        }

        public Criteria andMonbasicoIsNull() {
            addCriterion("MONBASICO is null");
            return (Criteria) this;
        }

        public Criteria andMonbasicoIsNotNull() {
            addCriterion("MONBASICO is not null");
            return (Criteria) this;
        }

        public Criteria andMonbasicoEqualTo(BigDecimal value) {
            addCriterion("MONBASICO =", value, "monbasico");
            return (Criteria) this;
        }

        public Criteria andMonbasicoNotEqualTo(BigDecimal value) {
            addCriterion("MONBASICO <>", value, "monbasico");
            return (Criteria) this;
        }

        public Criteria andMonbasicoGreaterThan(BigDecimal value) {
            addCriterion("MONBASICO >", value, "monbasico");
            return (Criteria) this;
        }

        public Criteria andMonbasicoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MONBASICO >=", value, "monbasico");
            return (Criteria) this;
        }

        public Criteria andMonbasicoLessThan(BigDecimal value) {
            addCriterion("MONBASICO <", value, "monbasico");
            return (Criteria) this;
        }

        public Criteria andMonbasicoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MONBASICO <=", value, "monbasico");
            return (Criteria) this;
        }

        public Criteria andMonbasicoIn(List<BigDecimal> values) {
            addCriterion("MONBASICO in", values, "monbasico");
            return (Criteria) this;
        }

        public Criteria andMonbasicoNotIn(List<BigDecimal> values) {
            addCriterion("MONBASICO not in", values, "monbasico");
            return (Criteria) this;
        }

        public Criteria andMonbasicoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONBASICO between", value1, value2, "monbasico");
            return (Criteria) this;
        }

        public Criteria andMonbasicoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONBASICO not between", value1, value2, "monbasico");
            return (Criteria) this;
        }

        public Criteria andMoncomisionIsNull() {
            addCriterion("MONCOMISION is null");
            return (Criteria) this;
        }

        public Criteria andMoncomisionIsNotNull() {
            addCriterion("MONCOMISION is not null");
            return (Criteria) this;
        }

        public Criteria andMoncomisionEqualTo(BigDecimal value) {
            addCriterion("MONCOMISION =", value, "moncomision");
            return (Criteria) this;
        }

        public Criteria andMoncomisionNotEqualTo(BigDecimal value) {
            addCriterion("MONCOMISION <>", value, "moncomision");
            return (Criteria) this;
        }

        public Criteria andMoncomisionGreaterThan(BigDecimal value) {
            addCriterion("MONCOMISION >", value, "moncomision");
            return (Criteria) this;
        }

        public Criteria andMoncomisionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MONCOMISION >=", value, "moncomision");
            return (Criteria) this;
        }

        public Criteria andMoncomisionLessThan(BigDecimal value) {
            addCriterion("MONCOMISION <", value, "moncomision");
            return (Criteria) this;
        }

        public Criteria andMoncomisionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MONCOMISION <=", value, "moncomision");
            return (Criteria) this;
        }

        public Criteria andMoncomisionIn(List<BigDecimal> values) {
            addCriterion("MONCOMISION in", values, "moncomision");
            return (Criteria) this;
        }

        public Criteria andMoncomisionNotIn(List<BigDecimal> values) {
            addCriterion("MONCOMISION not in", values, "moncomision");
            return (Criteria) this;
        }

        public Criteria andMoncomisionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONCOMISION between", value1, value2, "moncomision");
            return (Criteria) this;
        }

        public Criteria andMoncomisionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONCOMISION not between", value1, value2, "moncomision");
            return (Criteria) this;
        }

        public Criteria andMonbonosIsNull() {
            addCriterion("MONBONOS is null");
            return (Criteria) this;
        }

        public Criteria andMonbonosIsNotNull() {
            addCriterion("MONBONOS is not null");
            return (Criteria) this;
        }

        public Criteria andMonbonosEqualTo(BigDecimal value) {
            addCriterion("MONBONOS =", value, "monbonos");
            return (Criteria) this;
        }

        public Criteria andMonbonosNotEqualTo(BigDecimal value) {
            addCriterion("MONBONOS <>", value, "monbonos");
            return (Criteria) this;
        }

        public Criteria andMonbonosGreaterThan(BigDecimal value) {
            addCriterion("MONBONOS >", value, "monbonos");
            return (Criteria) this;
        }

        public Criteria andMonbonosGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MONBONOS >=", value, "monbonos");
            return (Criteria) this;
        }

        public Criteria andMonbonosLessThan(BigDecimal value) {
            addCriterion("MONBONOS <", value, "monbonos");
            return (Criteria) this;
        }

        public Criteria andMonbonosLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MONBONOS <=", value, "monbonos");
            return (Criteria) this;
        }

        public Criteria andMonbonosIn(List<BigDecimal> values) {
            addCriterion("MONBONOS in", values, "monbonos");
            return (Criteria) this;
        }

        public Criteria andMonbonosNotIn(List<BigDecimal> values) {
            addCriterion("MONBONOS not in", values, "monbonos");
            return (Criteria) this;
        }

        public Criteria andMonbonosBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONBONOS between", value1, value2, "monbonos");
            return (Criteria) this;
        }

        public Criteria andMonbonosNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONBONOS not between", value1, value2, "monbonos");
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