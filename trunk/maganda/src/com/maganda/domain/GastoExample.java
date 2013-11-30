package com.maganda.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class GastoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GastoExample() {
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

        public Criteria andIdgastoIsNull() {
            addCriterion("IDGASTO is null");
            return (Criteria) this;
        }

        public Criteria andIdgastoIsNotNull() {
            addCriterion("IDGASTO is not null");
            return (Criteria) this;
        }

        public Criteria andIdgastoEqualTo(Integer value) {
            addCriterion("IDGASTO =", value, "idgasto");
            return (Criteria) this;
        }

        public Criteria andIdgastoNotEqualTo(Integer value) {
            addCriterion("IDGASTO <>", value, "idgasto");
            return (Criteria) this;
        }

        public Criteria andIdgastoGreaterThan(Integer value) {
            addCriterion("IDGASTO >", value, "idgasto");
            return (Criteria) this;
        }

        public Criteria andIdgastoGreaterThanOrEqualTo(Integer value) {
            addCriterion("IDGASTO >=", value, "idgasto");
            return (Criteria) this;
        }

        public Criteria andIdgastoLessThan(Integer value) {
            addCriterion("IDGASTO <", value, "idgasto");
            return (Criteria) this;
        }

        public Criteria andIdgastoLessThanOrEqualTo(Integer value) {
            addCriterion("IDGASTO <=", value, "idgasto");
            return (Criteria) this;
        }

        public Criteria andIdgastoIn(List<Integer> values) {
            addCriterion("IDGASTO in", values, "idgasto");
            return (Criteria) this;
        }

        public Criteria andIdgastoNotIn(List<Integer> values) {
            addCriterion("IDGASTO not in", values, "idgasto");
            return (Criteria) this;
        }

        public Criteria andIdgastoBetween(Integer value1, Integer value2) {
            addCriterion("IDGASTO between", value1, value2, "idgasto");
            return (Criteria) this;
        }

        public Criteria andIdgastoNotBetween(Integer value1, Integer value2) {
            addCriterion("IDGASTO not between", value1, value2, "idgasto");
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

        public Criteria andDescripcionIsNull() {
            addCriterion("DESCRIPCION is null");
            return (Criteria) this;
        }

        public Criteria andDescripcionIsNotNull() {
            addCriterion("DESCRIPCION is not null");
            return (Criteria) this;
        }

        public Criteria andDescripcionEqualTo(String value) {
            addCriterion("DESCRIPCION =", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotEqualTo(String value) {
            addCriterion("DESCRIPCION <>", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionGreaterThan(String value) {
            addCriterion("DESCRIPCION >", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPCION >=", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionLessThan(String value) {
            addCriterion("DESCRIPCION <", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPCION <=", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionLike(String value) {
            addCriterion("DESCRIPCION like", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotLike(String value) {
            addCriterion("DESCRIPCION not like", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionIn(List<String> values) {
            addCriterion("DESCRIPCION in", values, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotIn(List<String> values) {
            addCriterion("DESCRIPCION not in", values, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionBetween(String value1, String value2) {
            addCriterion("DESCRIPCION between", value1, value2, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPCION not between", value1, value2, "descripcion");
            return (Criteria) this;
        }

        public Criteria andFecgastoIsNull() {
            addCriterion("FECGASTO is null");
            return (Criteria) this;
        }

        public Criteria andFecgastoIsNotNull() {
            addCriterion("FECGASTO is not null");
            return (Criteria) this;
        }

        public Criteria andFecgastoEqualTo(Date value) {
            addCriterionForJDBCDate("FECGASTO =", value, "fecgasto");
            return (Criteria) this;
        }

        public Criteria andFecgastoNotEqualTo(Date value) {
            addCriterionForJDBCDate("FECGASTO <>", value, "fecgasto");
            return (Criteria) this;
        }

        public Criteria andFecgastoGreaterThan(Date value) {
            addCriterionForJDBCDate("FECGASTO >", value, "fecgasto");
            return (Criteria) this;
        }

        public Criteria andFecgastoGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FECGASTO >=", value, "fecgasto");
            return (Criteria) this;
        }

        public Criteria andFecgastoLessThan(Date value) {
            addCriterionForJDBCDate("FECGASTO <", value, "fecgasto");
            return (Criteria) this;
        }

        public Criteria andFecgastoLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FECGASTO <=", value, "fecgasto");
            return (Criteria) this;
        }

        public Criteria andFecgastoIn(List<Date> values) {
            addCriterionForJDBCDate("FECGASTO in", values, "fecgasto");
            return (Criteria) this;
        }

        public Criteria andFecgastoNotIn(List<Date> values) {
            addCriterionForJDBCDate("FECGASTO not in", values, "fecgasto");
            return (Criteria) this;
        }

        public Criteria andFecgastoBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FECGASTO between", value1, value2, "fecgasto");
            return (Criteria) this;
        }

        public Criteria andFecgastoNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FECGASTO not between", value1, value2, "fecgasto");
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