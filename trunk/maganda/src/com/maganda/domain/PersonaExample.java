package com.maganda.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PersonaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PersonaExample() {
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

        public Criteria andNumdocumentoIsNull() {
            addCriterion("NUMDOCUMENTO is null");
            return (Criteria) this;
        }

        public Criteria andNumdocumentoIsNotNull() {
            addCriterion("NUMDOCUMENTO is not null");
            return (Criteria) this;
        }

        public Criteria andNumdocumentoEqualTo(String value) {
            addCriterion("NUMDOCUMENTO =", value, "numdocumento");
            return (Criteria) this;
        }

        public Criteria andNumdocumentoNotEqualTo(String value) {
            addCriterion("NUMDOCUMENTO <>", value, "numdocumento");
            return (Criteria) this;
        }

        public Criteria andNumdocumentoGreaterThan(String value) {
            addCriterion("NUMDOCUMENTO >", value, "numdocumento");
            return (Criteria) this;
        }

        public Criteria andNumdocumentoGreaterThanOrEqualTo(String value) {
            addCriterion("NUMDOCUMENTO >=", value, "numdocumento");
            return (Criteria) this;
        }

        public Criteria andNumdocumentoLessThan(String value) {
            addCriterion("NUMDOCUMENTO <", value, "numdocumento");
            return (Criteria) this;
        }

        public Criteria andNumdocumentoLessThanOrEqualTo(String value) {
            addCriterion("NUMDOCUMENTO <=", value, "numdocumento");
            return (Criteria) this;
        }

        public Criteria andNumdocumentoLike(String value) {
            addCriterion("NUMDOCUMENTO like", value, "numdocumento");
            return (Criteria) this;
        }

        public Criteria andNumdocumentoNotLike(String value) {
            addCriterion("NUMDOCUMENTO not like", value, "numdocumento");
            return (Criteria) this;
        }

        public Criteria andNumdocumentoIn(List<String> values) {
            addCriterion("NUMDOCUMENTO in", values, "numdocumento");
            return (Criteria) this;
        }

        public Criteria andNumdocumentoNotIn(List<String> values) {
            addCriterion("NUMDOCUMENTO not in", values, "numdocumento");
            return (Criteria) this;
        }

        public Criteria andNumdocumentoBetween(String value1, String value2) {
            addCriterion("NUMDOCUMENTO between", value1, value2, "numdocumento");
            return (Criteria) this;
        }

        public Criteria andNumdocumentoNotBetween(String value1, String value2) {
            addCriterion("NUMDOCUMENTO not between", value1, value2, "numdocumento");
            return (Criteria) this;
        }

        public Criteria andTippersonaIsNull() {
            addCriterion("TIPPERSONA is null");
            return (Criteria) this;
        }

        public Criteria andTippersonaIsNotNull() {
            addCriterion("TIPPERSONA is not null");
            return (Criteria) this;
        }

        public Criteria andTippersonaEqualTo(String value) {
            addCriterion("TIPPERSONA =", value, "tippersona");
            return (Criteria) this;
        }

        public Criteria andTippersonaNotEqualTo(String value) {
            addCriterion("TIPPERSONA <>", value, "tippersona");
            return (Criteria) this;
        }

        public Criteria andTippersonaGreaterThan(String value) {
            addCriterion("TIPPERSONA >", value, "tippersona");
            return (Criteria) this;
        }

        public Criteria andTippersonaGreaterThanOrEqualTo(String value) {
            addCriterion("TIPPERSONA >=", value, "tippersona");
            return (Criteria) this;
        }

        public Criteria andTippersonaLessThan(String value) {
            addCriterion("TIPPERSONA <", value, "tippersona");
            return (Criteria) this;
        }

        public Criteria andTippersonaLessThanOrEqualTo(String value) {
            addCriterion("TIPPERSONA <=", value, "tippersona");
            return (Criteria) this;
        }

        public Criteria andTippersonaLike(String value) {
            addCriterion("TIPPERSONA like", value, "tippersona");
            return (Criteria) this;
        }

        public Criteria andTippersonaNotLike(String value) {
            addCriterion("TIPPERSONA not like", value, "tippersona");
            return (Criteria) this;
        }

        public Criteria andTippersonaIn(List<String> values) {
            addCriterion("TIPPERSONA in", values, "tippersona");
            return (Criteria) this;
        }

        public Criteria andTippersonaNotIn(List<String> values) {
            addCriterion("TIPPERSONA not in", values, "tippersona");
            return (Criteria) this;
        }

        public Criteria andTippersonaBetween(String value1, String value2) {
            addCriterion("TIPPERSONA between", value1, value2, "tippersona");
            return (Criteria) this;
        }

        public Criteria andTippersonaNotBetween(String value1, String value2) {
            addCriterion("TIPPERSONA not between", value1, value2, "tippersona");
            return (Criteria) this;
        }

        public Criteria andApepaternoIsNull() {
            addCriterion("APEPATERNO is null");
            return (Criteria) this;
        }

        public Criteria andApepaternoIsNotNull() {
            addCriterion("APEPATERNO is not null");
            return (Criteria) this;
        }

        public Criteria andApepaternoEqualTo(String value) {
            addCriterion("APEPATERNO =", value, "apepaterno");
            return (Criteria) this;
        }

        public Criteria andApepaternoNotEqualTo(String value) {
            addCriterion("APEPATERNO <>", value, "apepaterno");
            return (Criteria) this;
        }

        public Criteria andApepaternoGreaterThan(String value) {
            addCriterion("APEPATERNO >", value, "apepaterno");
            return (Criteria) this;
        }

        public Criteria andApepaternoGreaterThanOrEqualTo(String value) {
            addCriterion("APEPATERNO >=", value, "apepaterno");
            return (Criteria) this;
        }

        public Criteria andApepaternoLessThan(String value) {
            addCriterion("APEPATERNO <", value, "apepaterno");
            return (Criteria) this;
        }

        public Criteria andApepaternoLessThanOrEqualTo(String value) {
            addCriterion("APEPATERNO <=", value, "apepaterno");
            return (Criteria) this;
        }

        public Criteria andApepaternoLike(String value) {
            addCriterion("APEPATERNO like", value, "apepaterno");
            return (Criteria) this;
        }

        public Criteria andApepaternoNotLike(String value) {
            addCriterion("APEPATERNO not like", value, "apepaterno");
            return (Criteria) this;
        }

        public Criteria andApepaternoIn(List<String> values) {
            addCriterion("APEPATERNO in", values, "apepaterno");
            return (Criteria) this;
        }

        public Criteria andApepaternoNotIn(List<String> values) {
            addCriterion("APEPATERNO not in", values, "apepaterno");
            return (Criteria) this;
        }

        public Criteria andApepaternoBetween(String value1, String value2) {
            addCriterion("APEPATERNO between", value1, value2, "apepaterno");
            return (Criteria) this;
        }

        public Criteria andApepaternoNotBetween(String value1, String value2) {
            addCriterion("APEPATERNO not between", value1, value2, "apepaterno");
            return (Criteria) this;
        }

        public Criteria andApematernoIsNull() {
            addCriterion("APEMATERNO is null");
            return (Criteria) this;
        }

        public Criteria andApematernoIsNotNull() {
            addCriterion("APEMATERNO is not null");
            return (Criteria) this;
        }

        public Criteria andApematernoEqualTo(String value) {
            addCriterion("APEMATERNO =", value, "apematerno");
            return (Criteria) this;
        }

        public Criteria andApematernoNotEqualTo(String value) {
            addCriterion("APEMATERNO <>", value, "apematerno");
            return (Criteria) this;
        }

        public Criteria andApematernoGreaterThan(String value) {
            addCriterion("APEMATERNO >", value, "apematerno");
            return (Criteria) this;
        }

        public Criteria andApematernoGreaterThanOrEqualTo(String value) {
            addCriterion("APEMATERNO >=", value, "apematerno");
            return (Criteria) this;
        }

        public Criteria andApematernoLessThan(String value) {
            addCriterion("APEMATERNO <", value, "apematerno");
            return (Criteria) this;
        }

        public Criteria andApematernoLessThanOrEqualTo(String value) {
            addCriterion("APEMATERNO <=", value, "apematerno");
            return (Criteria) this;
        }

        public Criteria andApematernoLike(String value) {
            addCriterion("APEMATERNO like", value, "apematerno");
            return (Criteria) this;
        }

        public Criteria andApematernoNotLike(String value) {
            addCriterion("APEMATERNO not like", value, "apematerno");
            return (Criteria) this;
        }

        public Criteria andApematernoIn(List<String> values) {
            addCriterion("APEMATERNO in", values, "apematerno");
            return (Criteria) this;
        }

        public Criteria andApematernoNotIn(List<String> values) {
            addCriterion("APEMATERNO not in", values, "apematerno");
            return (Criteria) this;
        }

        public Criteria andApematernoBetween(String value1, String value2) {
            addCriterion("APEMATERNO between", value1, value2, "apematerno");
            return (Criteria) this;
        }

        public Criteria andApematernoNotBetween(String value1, String value2) {
            addCriterion("APEMATERNO not between", value1, value2, "apematerno");
            return (Criteria) this;
        }

        public Criteria andNombresIsNull() {
            addCriterion("NOMBRES is null");
            return (Criteria) this;
        }

        public Criteria andNombresIsNotNull() {
            addCriterion("NOMBRES is not null");
            return (Criteria) this;
        }

        public Criteria andNombresEqualTo(String value) {
            addCriterion("NOMBRES =", value, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresNotEqualTo(String value) {
            addCriterion("NOMBRES <>", value, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresGreaterThan(String value) {
            addCriterion("NOMBRES >", value, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresGreaterThanOrEqualTo(String value) {
            addCriterion("NOMBRES >=", value, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresLessThan(String value) {
            addCriterion("NOMBRES <", value, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresLessThanOrEqualTo(String value) {
            addCriterion("NOMBRES <=", value, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresLike(String value) {
            addCriterion("NOMBRES like", value, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresNotLike(String value) {
            addCriterion("NOMBRES not like", value, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresIn(List<String> values) {
            addCriterion("NOMBRES in", values, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresNotIn(List<String> values) {
            addCriterion("NOMBRES not in", values, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresBetween(String value1, String value2) {
            addCriterion("NOMBRES between", value1, value2, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresNotBetween(String value1, String value2) {
            addCriterion("NOMBRES not between", value1, value2, "nombres");
            return (Criteria) this;
        }

        public Criteria andFeccreacionIsNull() {
            addCriterion("FECCREACION is null");
            return (Criteria) this;
        }

        public Criteria andFeccreacionIsNotNull() {
            addCriterion("FECCREACION is not null");
            return (Criteria) this;
        }

        public Criteria andFeccreacionEqualTo(Date value) {
            addCriterion("FECCREACION =", value, "feccreacion");
            return (Criteria) this;
        }

        public Criteria andFeccreacionNotEqualTo(Date value) {
            addCriterion("FECCREACION <>", value, "feccreacion");
            return (Criteria) this;
        }

        public Criteria andFeccreacionGreaterThan(Date value) {
            addCriterion("FECCREACION >", value, "feccreacion");
            return (Criteria) this;
        }

        public Criteria andFeccreacionGreaterThanOrEqualTo(Date value) {
            addCriterion("FECCREACION >=", value, "feccreacion");
            return (Criteria) this;
        }

        public Criteria andFeccreacionLessThan(Date value) {
            addCriterion("FECCREACION <", value, "feccreacion");
            return (Criteria) this;
        }

        public Criteria andFeccreacionLessThanOrEqualTo(Date value) {
            addCriterion("FECCREACION <=", value, "feccreacion");
            return (Criteria) this;
        }

        public Criteria andFeccreacionIn(List<Date> values) {
            addCriterion("FECCREACION in", values, "feccreacion");
            return (Criteria) this;
        }

        public Criteria andFeccreacionNotIn(List<Date> values) {
            addCriterion("FECCREACION not in", values, "feccreacion");
            return (Criteria) this;
        }

        public Criteria andFeccreacionBetween(Date value1, Date value2) {
            addCriterion("FECCREACION between", value1, value2, "feccreacion");
            return (Criteria) this;
        }

        public Criteria andFeccreacionNotBetween(Date value1, Date value2) {
            addCriterion("FECCREACION not between", value1, value2, "feccreacion");
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