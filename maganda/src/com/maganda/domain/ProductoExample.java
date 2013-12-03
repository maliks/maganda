package com.maganda.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductoExample() {
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

        public Criteria andCodproductoIsNull() {
            addCriterion("CODPRODUCTO is null");
            return (Criteria) this;
        }

        public Criteria andCodproductoIsNotNull() {
            addCriterion("CODPRODUCTO is not null");
            return (Criteria) this;
        }

        public Criteria andCodproductoEqualTo(String value) {
            addCriterion("CODPRODUCTO =", value, "codproducto");
            return (Criteria) this;
        }

        public Criteria andCodproductoNotEqualTo(String value) {
            addCriterion("CODPRODUCTO <>", value, "codproducto");
            return (Criteria) this;
        }

        public Criteria andCodproductoGreaterThan(String value) {
            addCriterion("CODPRODUCTO >", value, "codproducto");
            return (Criteria) this;
        }

        public Criteria andCodproductoGreaterThanOrEqualTo(String value) {
            addCriterion("CODPRODUCTO >=", value, "codproducto");
            return (Criteria) this;
        }

        public Criteria andCodproductoLessThan(String value) {
            addCriterion("CODPRODUCTO <", value, "codproducto");
            return (Criteria) this;
        }

        public Criteria andCodproductoLessThanOrEqualTo(String value) {
            addCriterion("CODPRODUCTO <=", value, "codproducto");
            return (Criteria) this;
        }

        public Criteria andCodproductoLike(String value) {
            addCriterion("CODPRODUCTO like", value, "codproducto");
            return (Criteria) this;
        }

        public Criteria andCodproductoNotLike(String value) {
            addCriterion("CODPRODUCTO not like", value, "codproducto");
            return (Criteria) this;
        }

        public Criteria andCodproductoIn(List<String> values) {
            addCriterion("CODPRODUCTO in", values, "codproducto");
            return (Criteria) this;
        }

        public Criteria andCodproductoNotIn(List<String> values) {
            addCriterion("CODPRODUCTO not in", values, "codproducto");
            return (Criteria) this;
        }

        public Criteria andCodproductoBetween(String value1, String value2) {
            addCriterion("CODPRODUCTO between", value1, value2, "codproducto");
            return (Criteria) this;
        }

        public Criteria andCodproductoNotBetween(String value1, String value2) {
            addCriterion("CODPRODUCTO not between", value1, value2, "codproducto");
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

        public Criteria andTallaIsNull() {
            addCriterion("TALLA is null");
            return (Criteria) this;
        }

        public Criteria andTallaIsNotNull() {
            addCriterion("TALLA is not null");
            return (Criteria) this;
        }

        public Criteria andTallaEqualTo(String value) {
            addCriterion("TALLA =", value, "talla");
            return (Criteria) this;
        }

        public Criteria andTallaNotEqualTo(String value) {
            addCriterion("TALLA <>", value, "talla");
            return (Criteria) this;
        }

        public Criteria andTallaGreaterThan(String value) {
            addCriterion("TALLA >", value, "talla");
            return (Criteria) this;
        }

        public Criteria andTallaGreaterThanOrEqualTo(String value) {
            addCriterion("TALLA >=", value, "talla");
            return (Criteria) this;
        }

        public Criteria andTallaLessThan(String value) {
            addCriterion("TALLA <", value, "talla");
            return (Criteria) this;
        }

        public Criteria andTallaLessThanOrEqualTo(String value) {
            addCriterion("TALLA <=", value, "talla");
            return (Criteria) this;
        }

        public Criteria andTallaLike(String value) {
            addCriterion("TALLA like", value, "talla");
            return (Criteria) this;
        }

        public Criteria andTallaNotLike(String value) {
            addCriterion("TALLA not like", value, "talla");
            return (Criteria) this;
        }

        public Criteria andTallaIn(List<String> values) {
            addCriterion("TALLA in", values, "talla");
            return (Criteria) this;
        }

        public Criteria andTallaNotIn(List<String> values) {
            addCriterion("TALLA not in", values, "talla");
            return (Criteria) this;
        }

        public Criteria andTallaBetween(String value1, String value2) {
            addCriterion("TALLA between", value1, value2, "talla");
            return (Criteria) this;
        }

        public Criteria andTallaNotBetween(String value1, String value2) {
            addCriterion("TALLA not between", value1, value2, "talla");
            return (Criteria) this;
        }

        public Criteria andIdcolorIsNull() {
            addCriterion("IDCOLOR is null");
            return (Criteria) this;
        }

        public Criteria andIdcolorIsNotNull() {
            addCriterion("IDCOLOR is not null");
            return (Criteria) this;
        }

        public Criteria andIdcolorEqualTo(Integer value) {
            addCriterion("IDCOLOR =", value, "idcolor");
            return (Criteria) this;
        }

        public Criteria andIdcolorNotEqualTo(Integer value) {
            addCriterion("IDCOLOR <>", value, "idcolor");
            return (Criteria) this;
        }

        public Criteria andIdcolorGreaterThan(Integer value) {
            addCriterion("IDCOLOR >", value, "idcolor");
            return (Criteria) this;
        }

        public Criteria andIdcolorGreaterThanOrEqualTo(Integer value) {
            addCriterion("IDCOLOR >=", value, "idcolor");
            return (Criteria) this;
        }

        public Criteria andIdcolorLessThan(Integer value) {
            addCriterion("IDCOLOR <", value, "idcolor");
            return (Criteria) this;
        }

        public Criteria andIdcolorLessThanOrEqualTo(Integer value) {
            addCriterion("IDCOLOR <=", value, "idcolor");
            return (Criteria) this;
        }

        public Criteria andIdcolorIn(List<Integer> values) {
            addCriterion("IDCOLOR in", values, "idcolor");
            return (Criteria) this;
        }

        public Criteria andIdcolorNotIn(List<Integer> values) {
            addCriterion("IDCOLOR not in", values, "idcolor");
            return (Criteria) this;
        }

        public Criteria andIdcolorBetween(Integer value1, Integer value2) {
            addCriterion("IDCOLOR between", value1, value2, "idcolor");
            return (Criteria) this;
        }

        public Criteria andIdcolorNotBetween(Integer value1, Integer value2) {
            addCriterion("IDCOLOR not between", value1, value2, "idcolor");
            return (Criteria) this;
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

        public Criteria andIdmarcaIsNull() {
            addCriterion("IDMARCA is null");
            return (Criteria) this;
        }

        public Criteria andIdmarcaIsNotNull() {
            addCriterion("IDMARCA is not null");
            return (Criteria) this;
        }

        public Criteria andIdmarcaEqualTo(Integer value) {
            addCriterion("IDMARCA =", value, "idmarca");
            return (Criteria) this;
        }

        public Criteria andIdmarcaNotEqualTo(Integer value) {
            addCriterion("IDMARCA <>", value, "idmarca");
            return (Criteria) this;
        }

        public Criteria andIdmarcaGreaterThan(Integer value) {
            addCriterion("IDMARCA >", value, "idmarca");
            return (Criteria) this;
        }

        public Criteria andIdmarcaGreaterThanOrEqualTo(Integer value) {
            addCriterion("IDMARCA >=", value, "idmarca");
            return (Criteria) this;
        }

        public Criteria andIdmarcaLessThan(Integer value) {
            addCriterion("IDMARCA <", value, "idmarca");
            return (Criteria) this;
        }

        public Criteria andIdmarcaLessThanOrEqualTo(Integer value) {
            addCriterion("IDMARCA <=", value, "idmarca");
            return (Criteria) this;
        }

        public Criteria andIdmarcaIn(List<Integer> values) {
            addCriterion("IDMARCA in", values, "idmarca");
            return (Criteria) this;
        }

        public Criteria andIdmarcaNotIn(List<Integer> values) {
            addCriterion("IDMARCA not in", values, "idmarca");
            return (Criteria) this;
        }

        public Criteria andIdmarcaBetween(Integer value1, Integer value2) {
            addCriterion("IDMARCA between", value1, value2, "idmarca");
            return (Criteria) this;
        }

        public Criteria andIdmarcaNotBetween(Integer value1, Integer value2) {
            addCriterion("IDMARCA not between", value1, value2, "idmarca");
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

        public Criteria andMoncostoIsNull() {
            addCriterion("MONCOSTO is null");
            return (Criteria) this;
        }

        public Criteria andMoncostoIsNotNull() {
            addCriterion("MONCOSTO is not null");
            return (Criteria) this;
        }

        public Criteria andMoncostoEqualTo(BigDecimal value) {
            addCriterion("MONCOSTO =", value, "moncosto");
            return (Criteria) this;
        }

        public Criteria andMoncostoNotEqualTo(BigDecimal value) {
            addCriterion("MONCOSTO <>", value, "moncosto");
            return (Criteria) this;
        }

        public Criteria andMoncostoGreaterThan(BigDecimal value) {
            addCriterion("MONCOSTO >", value, "moncosto");
            return (Criteria) this;
        }

        public Criteria andMoncostoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MONCOSTO >=", value, "moncosto");
            return (Criteria) this;
        }

        public Criteria andMoncostoLessThan(BigDecimal value) {
            addCriterion("MONCOSTO <", value, "moncosto");
            return (Criteria) this;
        }

        public Criteria andMoncostoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MONCOSTO <=", value, "moncosto");
            return (Criteria) this;
        }

        public Criteria andMoncostoIn(List<BigDecimal> values) {
            addCriterion("MONCOSTO in", values, "moncosto");
            return (Criteria) this;
        }

        public Criteria andMoncostoNotIn(List<BigDecimal> values) {
            addCriterion("MONCOSTO not in", values, "moncosto");
            return (Criteria) this;
        }

        public Criteria andMoncostoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONCOSTO between", value1, value2, "moncosto");
            return (Criteria) this;
        }

        public Criteria andMoncostoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONCOSTO not between", value1, value2, "moncosto");
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