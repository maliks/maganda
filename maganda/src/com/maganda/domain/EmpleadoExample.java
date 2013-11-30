package com.maganda.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmpleadoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmpleadoExample() {
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

        public Criteria andDireccionIsNull() {
            addCriterion("DIRECCION is null");
            return (Criteria) this;
        }

        public Criteria andDireccionIsNotNull() {
            addCriterion("DIRECCION is not null");
            return (Criteria) this;
        }

        public Criteria andDireccionEqualTo(String value) {
            addCriterion("DIRECCION =", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionNotEqualTo(String value) {
            addCriterion("DIRECCION <>", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionGreaterThan(String value) {
            addCriterion("DIRECCION >", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionGreaterThanOrEqualTo(String value) {
            addCriterion("DIRECCION >=", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionLessThan(String value) {
            addCriterion("DIRECCION <", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionLessThanOrEqualTo(String value) {
            addCriterion("DIRECCION <=", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionLike(String value) {
            addCriterion("DIRECCION like", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionNotLike(String value) {
            addCriterion("DIRECCION not like", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionIn(List<String> values) {
            addCriterion("DIRECCION in", values, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionNotIn(List<String> values) {
            addCriterion("DIRECCION not in", values, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionBetween(String value1, String value2) {
            addCriterion("DIRECCION between", value1, value2, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionNotBetween(String value1, String value2) {
            addCriterion("DIRECCION not between", value1, value2, "direccion");
            return (Criteria) this;
        }

        public Criteria andNumtelefonoIsNull() {
            addCriterion("NUMTELEFONO is null");
            return (Criteria) this;
        }

        public Criteria andNumtelefonoIsNotNull() {
            addCriterion("NUMTELEFONO is not null");
            return (Criteria) this;
        }

        public Criteria andNumtelefonoEqualTo(String value) {
            addCriterion("NUMTELEFONO =", value, "numtelefono");
            return (Criteria) this;
        }

        public Criteria andNumtelefonoNotEqualTo(String value) {
            addCriterion("NUMTELEFONO <>", value, "numtelefono");
            return (Criteria) this;
        }

        public Criteria andNumtelefonoGreaterThan(String value) {
            addCriterion("NUMTELEFONO >", value, "numtelefono");
            return (Criteria) this;
        }

        public Criteria andNumtelefonoGreaterThanOrEqualTo(String value) {
            addCriterion("NUMTELEFONO >=", value, "numtelefono");
            return (Criteria) this;
        }

        public Criteria andNumtelefonoLessThan(String value) {
            addCriterion("NUMTELEFONO <", value, "numtelefono");
            return (Criteria) this;
        }

        public Criteria andNumtelefonoLessThanOrEqualTo(String value) {
            addCriterion("NUMTELEFONO <=", value, "numtelefono");
            return (Criteria) this;
        }

        public Criteria andNumtelefonoLike(String value) {
            addCriterion("NUMTELEFONO like", value, "numtelefono");
            return (Criteria) this;
        }

        public Criteria andNumtelefonoNotLike(String value) {
            addCriterion("NUMTELEFONO not like", value, "numtelefono");
            return (Criteria) this;
        }

        public Criteria andNumtelefonoIn(List<String> values) {
            addCriterion("NUMTELEFONO in", values, "numtelefono");
            return (Criteria) this;
        }

        public Criteria andNumtelefonoNotIn(List<String> values) {
            addCriterion("NUMTELEFONO not in", values, "numtelefono");
            return (Criteria) this;
        }

        public Criteria andNumtelefonoBetween(String value1, String value2) {
            addCriterion("NUMTELEFONO between", value1, value2, "numtelefono");
            return (Criteria) this;
        }

        public Criteria andNumtelefonoNotBetween(String value1, String value2) {
            addCriterion("NUMTELEFONO not between", value1, value2, "numtelefono");
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