package com.maganda.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CategoriaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CategoriaExample() {
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

        public Criteria andIdcategoriaIsNull() {
            addCriterion("IDCATEGORIA is null");
            return (Criteria) this;
        }

        public Criteria andIdcategoriaIsNotNull() {
            addCriterion("IDCATEGORIA is not null");
            return (Criteria) this;
        }

        public Criteria andIdcategoriaEqualTo(Integer value) {
            addCriterion("IDCATEGORIA =", value, "idcategoria");
            return (Criteria) this;
        }

        public Criteria andIdcategoriaNotEqualTo(Integer value) {
            addCriterion("IDCATEGORIA <>", value, "idcategoria");
            return (Criteria) this;
        }

        public Criteria andIdcategoriaGreaterThan(Integer value) {
            addCriterion("IDCATEGORIA >", value, "idcategoria");
            return (Criteria) this;
        }

        public Criteria andIdcategoriaGreaterThanOrEqualTo(Integer value) {
            addCriterion("IDCATEGORIA >=", value, "idcategoria");
            return (Criteria) this;
        }

        public Criteria andIdcategoriaLessThan(Integer value) {
            addCriterion("IDCATEGORIA <", value, "idcategoria");
            return (Criteria) this;
        }

        public Criteria andIdcategoriaLessThanOrEqualTo(Integer value) {
            addCriterion("IDCATEGORIA <=", value, "idcategoria");
            return (Criteria) this;
        }

        public Criteria andIdcategoriaIn(List<Integer> values) {
            addCriterion("IDCATEGORIA in", values, "idcategoria");
            return (Criteria) this;
        }

        public Criteria andIdcategoriaNotIn(List<Integer> values) {
            addCriterion("IDCATEGORIA not in", values, "idcategoria");
            return (Criteria) this;
        }

        public Criteria andIdcategoriaBetween(Integer value1, Integer value2) {
            addCriterion("IDCATEGORIA between", value1, value2, "idcategoria");
            return (Criteria) this;
        }

        public Criteria andIdcategoriaNotBetween(Integer value1, Integer value2) {
            addCriterion("IDCATEGORIA not between", value1, value2, "idcategoria");
            return (Criteria) this;
        }

        public Criteria andNombreIsNull() {
            addCriterion("NOMBRE is null");
            return (Criteria) this;
        }

        public Criteria andNombreIsNotNull() {
            addCriterion("NOMBRE is not null");
            return (Criteria) this;
        }

        public Criteria andNombreEqualTo(String value) {
            addCriterion("NOMBRE =", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotEqualTo(String value) {
            addCriterion("NOMBRE <>", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreGreaterThan(String value) {
            addCriterion("NOMBRE >", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreGreaterThanOrEqualTo(String value) {
            addCriterion("NOMBRE >=", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreLessThan(String value) {
            addCriterion("NOMBRE <", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreLessThanOrEqualTo(String value) {
            addCriterion("NOMBRE <=", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreLike(String value) {
            addCriterion("NOMBRE like", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotLike(String value) {
            addCriterion("NOMBRE not like", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreIn(List<String> values) {
            addCriterion("NOMBRE in", values, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotIn(List<String> values) {
            addCriterion("NOMBRE not in", values, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreBetween(String value1, String value2) {
            addCriterion("NOMBRE between", value1, value2, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotBetween(String value1, String value2) {
            addCriterion("NOMBRE not between", value1, value2, "nombre");
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