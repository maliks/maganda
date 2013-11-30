package com.maganda.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsuarioExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsuarioExample() {
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

        public Criteria andIdrolIsNull() {
            addCriterion("IDROL is null");
            return (Criteria) this;
        }

        public Criteria andIdrolIsNotNull() {
            addCriterion("IDROL is not null");
            return (Criteria) this;
        }

        public Criteria andIdrolEqualTo(Integer value) {
            addCriterion("IDROL =", value, "idrol");
            return (Criteria) this;
        }

        public Criteria andIdrolNotEqualTo(Integer value) {
            addCriterion("IDROL <>", value, "idrol");
            return (Criteria) this;
        }

        public Criteria andIdrolGreaterThan(Integer value) {
            addCriterion("IDROL >", value, "idrol");
            return (Criteria) this;
        }

        public Criteria andIdrolGreaterThanOrEqualTo(Integer value) {
            addCriterion("IDROL >=", value, "idrol");
            return (Criteria) this;
        }

        public Criteria andIdrolLessThan(Integer value) {
            addCriterion("IDROL <", value, "idrol");
            return (Criteria) this;
        }

        public Criteria andIdrolLessThanOrEqualTo(Integer value) {
            addCriterion("IDROL <=", value, "idrol");
            return (Criteria) this;
        }

        public Criteria andIdrolIn(List<Integer> values) {
            addCriterion("IDROL in", values, "idrol");
            return (Criteria) this;
        }

        public Criteria andIdrolNotIn(List<Integer> values) {
            addCriterion("IDROL not in", values, "idrol");
            return (Criteria) this;
        }

        public Criteria andIdrolBetween(Integer value1, Integer value2) {
            addCriterion("IDROL between", value1, value2, "idrol");
            return (Criteria) this;
        }

        public Criteria andIdrolNotBetween(Integer value1, Integer value2) {
            addCriterion("IDROL not between", value1, value2, "idrol");
            return (Criteria) this;
        }

        public Criteria andNomusuarioIsNull() {
            addCriterion("NOMUSUARIO is null");
            return (Criteria) this;
        }

        public Criteria andNomusuarioIsNotNull() {
            addCriterion("NOMUSUARIO is not null");
            return (Criteria) this;
        }

        public Criteria andNomusuarioEqualTo(String value) {
            addCriterion("NOMUSUARIO =", value, "nomusuario");
            return (Criteria) this;
        }

        public Criteria andNomusuarioNotEqualTo(String value) {
            addCriterion("NOMUSUARIO <>", value, "nomusuario");
            return (Criteria) this;
        }

        public Criteria andNomusuarioGreaterThan(String value) {
            addCriterion("NOMUSUARIO >", value, "nomusuario");
            return (Criteria) this;
        }

        public Criteria andNomusuarioGreaterThanOrEqualTo(String value) {
            addCriterion("NOMUSUARIO >=", value, "nomusuario");
            return (Criteria) this;
        }

        public Criteria andNomusuarioLessThan(String value) {
            addCriterion("NOMUSUARIO <", value, "nomusuario");
            return (Criteria) this;
        }

        public Criteria andNomusuarioLessThanOrEqualTo(String value) {
            addCriterion("NOMUSUARIO <=", value, "nomusuario");
            return (Criteria) this;
        }

        public Criteria andNomusuarioLike(String value) {
            addCriterion("NOMUSUARIO like", value, "nomusuario");
            return (Criteria) this;
        }

        public Criteria andNomusuarioNotLike(String value) {
            addCriterion("NOMUSUARIO not like", value, "nomusuario");
            return (Criteria) this;
        }

        public Criteria andNomusuarioIn(List<String> values) {
            addCriterion("NOMUSUARIO in", values, "nomusuario");
            return (Criteria) this;
        }

        public Criteria andNomusuarioNotIn(List<String> values) {
            addCriterion("NOMUSUARIO not in", values, "nomusuario");
            return (Criteria) this;
        }

        public Criteria andNomusuarioBetween(String value1, String value2) {
            addCriterion("NOMUSUARIO between", value1, value2, "nomusuario");
            return (Criteria) this;
        }

        public Criteria andNomusuarioNotBetween(String value1, String value2) {
            addCriterion("NOMUSUARIO not between", value1, value2, "nomusuario");
            return (Criteria) this;
        }

        public Criteria andClausuarioIsNull() {
            addCriterion("CLAUSUARIO is null");
            return (Criteria) this;
        }

        public Criteria andClausuarioIsNotNull() {
            addCriterion("CLAUSUARIO is not null");
            return (Criteria) this;
        }

        public Criteria andClausuarioEqualTo(String value) {
            addCriterion("CLAUSUARIO =", value, "clausuario");
            return (Criteria) this;
        }

        public Criteria andClausuarioNotEqualTo(String value) {
            addCriterion("CLAUSUARIO <>", value, "clausuario");
            return (Criteria) this;
        }

        public Criteria andClausuarioGreaterThan(String value) {
            addCriterion("CLAUSUARIO >", value, "clausuario");
            return (Criteria) this;
        }

        public Criteria andClausuarioGreaterThanOrEqualTo(String value) {
            addCriterion("CLAUSUARIO >=", value, "clausuario");
            return (Criteria) this;
        }

        public Criteria andClausuarioLessThan(String value) {
            addCriterion("CLAUSUARIO <", value, "clausuario");
            return (Criteria) this;
        }

        public Criteria andClausuarioLessThanOrEqualTo(String value) {
            addCriterion("CLAUSUARIO <=", value, "clausuario");
            return (Criteria) this;
        }

        public Criteria andClausuarioLike(String value) {
            addCriterion("CLAUSUARIO like", value, "clausuario");
            return (Criteria) this;
        }

        public Criteria andClausuarioNotLike(String value) {
            addCriterion("CLAUSUARIO not like", value, "clausuario");
            return (Criteria) this;
        }

        public Criteria andClausuarioIn(List<String> values) {
            addCriterion("CLAUSUARIO in", values, "clausuario");
            return (Criteria) this;
        }

        public Criteria andClausuarioNotIn(List<String> values) {
            addCriterion("CLAUSUARIO not in", values, "clausuario");
            return (Criteria) this;
        }

        public Criteria andClausuarioBetween(String value1, String value2) {
            addCriterion("CLAUSUARIO between", value1, value2, "clausuario");
            return (Criteria) this;
        }

        public Criteria andClausuarioNotBetween(String value1, String value2) {
            addCriterion("CLAUSUARIO not between", value1, value2, "clausuario");
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