package com.fh.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class T_StockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public T_StockExample() {
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

        public Criteria andFitemidIsNull() {
            addCriterion("FItemID is null");
            return (Criteria) this;
        }

        public Criteria andFitemidIsNotNull() {
            addCriterion("FItemID is not null");
            return (Criteria) this;
        }

        public Criteria andFitemidEqualTo(Integer value) {
            addCriterion("FItemID =", value, "fitemid");
            return (Criteria) this;
        }

        public Criteria andFitemidNotEqualTo(Integer value) {
            addCriterion("FItemID <>", value, "fitemid");
            return (Criteria) this;
        }

        public Criteria andFitemidGreaterThan(Integer value) {
            addCriterion("FItemID >", value, "fitemid");
            return (Criteria) this;
        }

        public Criteria andFitemidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FItemID >=", value, "fitemid");
            return (Criteria) this;
        }

        public Criteria andFitemidLessThan(Integer value) {
            addCriterion("FItemID <", value, "fitemid");
            return (Criteria) this;
        }

        public Criteria andFitemidLessThanOrEqualTo(Integer value) {
            addCriterion("FItemID <=", value, "fitemid");
            return (Criteria) this;
        }

        public Criteria andFitemidIn(List<Integer> values) {
            addCriterion("FItemID in", values, "fitemid");
            return (Criteria) this;
        }

        public Criteria andFitemidNotIn(List<Integer> values) {
            addCriterion("FItemID not in", values, "fitemid");
            return (Criteria) this;
        }

        public Criteria andFitemidBetween(Integer value1, Integer value2) {
            addCriterion("FItemID between", value1, value2, "fitemid");
            return (Criteria) this;
        }

        public Criteria andFitemidNotBetween(Integer value1, Integer value2) {
            addCriterion("FItemID not between", value1, value2, "fitemid");
            return (Criteria) this;
        }

        public Criteria andFbrnoIsNull() {
            addCriterion("FBrNO is null");
            return (Criteria) this;
        }

        public Criteria andFbrnoIsNotNull() {
            addCriterion("FBrNO is not null");
            return (Criteria) this;
        }

        public Criteria andFbrnoEqualTo(String value) {
            addCriterion("FBrNO =", value, "fbrno");
            return (Criteria) this;
        }

        public Criteria andFbrnoNotEqualTo(String value) {
            addCriterion("FBrNO <>", value, "fbrno");
            return (Criteria) this;
        }

        public Criteria andFbrnoGreaterThan(String value) {
            addCriterion("FBrNO >", value, "fbrno");
            return (Criteria) this;
        }

        public Criteria andFbrnoGreaterThanOrEqualTo(String value) {
            addCriterion("FBrNO >=", value, "fbrno");
            return (Criteria) this;
        }

        public Criteria andFbrnoLessThan(String value) {
            addCriterion("FBrNO <", value, "fbrno");
            return (Criteria) this;
        }

        public Criteria andFbrnoLessThanOrEqualTo(String value) {
            addCriterion("FBrNO <=", value, "fbrno");
            return (Criteria) this;
        }

        public Criteria andFbrnoLike(String value) {
            addCriterion("FBrNO like", value, "fbrno");
            return (Criteria) this;
        }

        public Criteria andFbrnoNotLike(String value) {
            addCriterion("FBrNO not like", value, "fbrno");
            return (Criteria) this;
        }

        public Criteria andFbrnoIn(List<String> values) {
            addCriterion("FBrNO in", values, "fbrno");
            return (Criteria) this;
        }

        public Criteria andFbrnoNotIn(List<String> values) {
            addCriterion("FBrNO not in", values, "fbrno");
            return (Criteria) this;
        }

        public Criteria andFbrnoBetween(String value1, String value2) {
            addCriterion("FBrNO between", value1, value2, "fbrno");
            return (Criteria) this;
        }

        public Criteria andFbrnoNotBetween(String value1, String value2) {
            addCriterion("FBrNO not between", value1, value2, "fbrno");
            return (Criteria) this;
        }

        public Criteria andFhelpercodeIsNull() {
            addCriterion("FHelperCode is null");
            return (Criteria) this;
        }

        public Criteria andFhelpercodeIsNotNull() {
            addCriterion("FHelperCode is not null");
            return (Criteria) this;
        }

        public Criteria andFhelpercodeEqualTo(String value) {
            addCriterion("FHelperCode =", value, "fhelpercode");
            return (Criteria) this;
        }

        public Criteria andFhelpercodeNotEqualTo(String value) {
            addCriterion("FHelperCode <>", value, "fhelpercode");
            return (Criteria) this;
        }

        public Criteria andFhelpercodeGreaterThan(String value) {
            addCriterion("FHelperCode >", value, "fhelpercode");
            return (Criteria) this;
        }

        public Criteria andFhelpercodeGreaterThanOrEqualTo(String value) {
            addCriterion("FHelperCode >=", value, "fhelpercode");
            return (Criteria) this;
        }

        public Criteria andFhelpercodeLessThan(String value) {
            addCriterion("FHelperCode <", value, "fhelpercode");
            return (Criteria) this;
        }

        public Criteria andFhelpercodeLessThanOrEqualTo(String value) {
            addCriterion("FHelperCode <=", value, "fhelpercode");
            return (Criteria) this;
        }

        public Criteria andFhelpercodeLike(String value) {
            addCriterion("FHelperCode like", value, "fhelpercode");
            return (Criteria) this;
        }

        public Criteria andFhelpercodeNotLike(String value) {
            addCriterion("FHelperCode not like", value, "fhelpercode");
            return (Criteria) this;
        }

        public Criteria andFhelpercodeIn(List<String> values) {
            addCriterion("FHelperCode in", values, "fhelpercode");
            return (Criteria) this;
        }

        public Criteria andFhelpercodeNotIn(List<String> values) {
            addCriterion("FHelperCode not in", values, "fhelpercode");
            return (Criteria) this;
        }

        public Criteria andFhelpercodeBetween(String value1, String value2) {
            addCriterion("FHelperCode between", value1, value2, "fhelpercode");
            return (Criteria) this;
        }

        public Criteria andFhelpercodeNotBetween(String value1, String value2) {
            addCriterion("FHelperCode not between", value1, value2, "fhelpercode");
            return (Criteria) this;
        }

        public Criteria andFempidIsNull() {
            addCriterion("FEmpID is null");
            return (Criteria) this;
        }

        public Criteria andFempidIsNotNull() {
            addCriterion("FEmpID is not null");
            return (Criteria) this;
        }

        public Criteria andFempidEqualTo(Integer value) {
            addCriterion("FEmpID =", value, "fempid");
            return (Criteria) this;
        }

        public Criteria andFempidNotEqualTo(Integer value) {
            addCriterion("FEmpID <>", value, "fempid");
            return (Criteria) this;
        }

        public Criteria andFempidGreaterThan(Integer value) {
            addCriterion("FEmpID >", value, "fempid");
            return (Criteria) this;
        }

        public Criteria andFempidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FEmpID >=", value, "fempid");
            return (Criteria) this;
        }

        public Criteria andFempidLessThan(Integer value) {
            addCriterion("FEmpID <", value, "fempid");
            return (Criteria) this;
        }

        public Criteria andFempidLessThanOrEqualTo(Integer value) {
            addCriterion("FEmpID <=", value, "fempid");
            return (Criteria) this;
        }

        public Criteria andFempidIn(List<Integer> values) {
            addCriterion("FEmpID in", values, "fempid");
            return (Criteria) this;
        }

        public Criteria andFempidNotIn(List<Integer> values) {
            addCriterion("FEmpID not in", values, "fempid");
            return (Criteria) this;
        }

        public Criteria andFempidBetween(Integer value1, Integer value2) {
            addCriterion("FEmpID between", value1, value2, "fempid");
            return (Criteria) this;
        }

        public Criteria andFempidNotBetween(Integer value1, Integer value2) {
            addCriterion("FEmpID not between", value1, value2, "fempid");
            return (Criteria) this;
        }

        public Criteria andFaddressIsNull() {
            addCriterion("FAddress is null");
            return (Criteria) this;
        }

        public Criteria andFaddressIsNotNull() {
            addCriterion("FAddress is not null");
            return (Criteria) this;
        }

        public Criteria andFaddressEqualTo(String value) {
            addCriterion("FAddress =", value, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressNotEqualTo(String value) {
            addCriterion("FAddress <>", value, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressGreaterThan(String value) {
            addCriterion("FAddress >", value, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressGreaterThanOrEqualTo(String value) {
            addCriterion("FAddress >=", value, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressLessThan(String value) {
            addCriterion("FAddress <", value, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressLessThanOrEqualTo(String value) {
            addCriterion("FAddress <=", value, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressLike(String value) {
            addCriterion("FAddress like", value, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressNotLike(String value) {
            addCriterion("FAddress not like", value, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressIn(List<String> values) {
            addCriterion("FAddress in", values, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressNotIn(List<String> values) {
            addCriterion("FAddress not in", values, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressBetween(String value1, String value2) {
            addCriterion("FAddress between", value1, value2, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressNotBetween(String value1, String value2) {
            addCriterion("FAddress not between", value1, value2, "faddress");
            return (Criteria) this;
        }

        public Criteria andFphoneIsNull() {
            addCriterion("FPhone is null");
            return (Criteria) this;
        }

        public Criteria andFphoneIsNotNull() {
            addCriterion("FPhone is not null");
            return (Criteria) this;
        }

        public Criteria andFphoneEqualTo(String value) {
            addCriterion("FPhone =", value, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneNotEqualTo(String value) {
            addCriterion("FPhone <>", value, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneGreaterThan(String value) {
            addCriterion("FPhone >", value, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneGreaterThanOrEqualTo(String value) {
            addCriterion("FPhone >=", value, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneLessThan(String value) {
            addCriterion("FPhone <", value, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneLessThanOrEqualTo(String value) {
            addCriterion("FPhone <=", value, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneLike(String value) {
            addCriterion("FPhone like", value, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneNotLike(String value) {
            addCriterion("FPhone not like", value, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneIn(List<String> values) {
            addCriterion("FPhone in", values, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneNotIn(List<String> values) {
            addCriterion("FPhone not in", values, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneBetween(String value1, String value2) {
            addCriterion("FPhone between", value1, value2, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneNotBetween(String value1, String value2) {
            addCriterion("FPhone not between", value1, value2, "fphone");
            return (Criteria) this;
        }

        public Criteria andFpropertyIsNull() {
            addCriterion("FProperty is null");
            return (Criteria) this;
        }

        public Criteria andFpropertyIsNotNull() {
            addCriterion("FProperty is not null");
            return (Criteria) this;
        }

        public Criteria andFpropertyEqualTo(Short value) {
            addCriterion("FProperty =", value, "fproperty");
            return (Criteria) this;
        }

        public Criteria andFpropertyNotEqualTo(Short value) {
            addCriterion("FProperty <>", value, "fproperty");
            return (Criteria) this;
        }

        public Criteria andFpropertyGreaterThan(Short value) {
            addCriterion("FProperty >", value, "fproperty");
            return (Criteria) this;
        }

        public Criteria andFpropertyGreaterThanOrEqualTo(Short value) {
            addCriterion("FProperty >=", value, "fproperty");
            return (Criteria) this;
        }

        public Criteria andFpropertyLessThan(Short value) {
            addCriterion("FProperty <", value, "fproperty");
            return (Criteria) this;
        }

        public Criteria andFpropertyLessThanOrEqualTo(Short value) {
            addCriterion("FProperty <=", value, "fproperty");
            return (Criteria) this;
        }

        public Criteria andFpropertyIn(List<Short> values) {
            addCriterion("FProperty in", values, "fproperty");
            return (Criteria) this;
        }

        public Criteria andFpropertyNotIn(List<Short> values) {
            addCriterion("FProperty not in", values, "fproperty");
            return (Criteria) this;
        }

        public Criteria andFpropertyBetween(Short value1, Short value2) {
            addCriterion("FProperty between", value1, value2, "fproperty");
            return (Criteria) this;
        }

        public Criteria andFpropertyNotBetween(Short value1, Short value2) {
            addCriterion("FProperty not between", value1, value2, "fproperty");
            return (Criteria) this;
        }

        public Criteria andFbworkshopIsNull() {
            addCriterion("FBWorkShop is null");
            return (Criteria) this;
        }

        public Criteria andFbworkshopIsNotNull() {
            addCriterion("FBWorkShop is not null");
            return (Criteria) this;
        }

        public Criteria andFbworkshopEqualTo(Integer value) {
            addCriterion("FBWorkShop =", value, "fbworkshop");
            return (Criteria) this;
        }

        public Criteria andFbworkshopNotEqualTo(Integer value) {
            addCriterion("FBWorkShop <>", value, "fbworkshop");
            return (Criteria) this;
        }

        public Criteria andFbworkshopGreaterThan(Integer value) {
            addCriterion("FBWorkShop >", value, "fbworkshop");
            return (Criteria) this;
        }

        public Criteria andFbworkshopGreaterThanOrEqualTo(Integer value) {
            addCriterion("FBWorkShop >=", value, "fbworkshop");
            return (Criteria) this;
        }

        public Criteria andFbworkshopLessThan(Integer value) {
            addCriterion("FBWorkShop <", value, "fbworkshop");
            return (Criteria) this;
        }

        public Criteria andFbworkshopLessThanOrEqualTo(Integer value) {
            addCriterion("FBWorkShop <=", value, "fbworkshop");
            return (Criteria) this;
        }

        public Criteria andFbworkshopIn(List<Integer> values) {
            addCriterion("FBWorkShop in", values, "fbworkshop");
            return (Criteria) this;
        }

        public Criteria andFbworkshopNotIn(List<Integer> values) {
            addCriterion("FBWorkShop not in", values, "fbworkshop");
            return (Criteria) this;
        }

        public Criteria andFbworkshopBetween(Integer value1, Integer value2) {
            addCriterion("FBWorkShop between", value1, value2, "fbworkshop");
            return (Criteria) this;
        }

        public Criteria andFbworkshopNotBetween(Integer value1, Integer value2) {
            addCriterion("FBWorkShop not between", value1, value2, "fbworkshop");
            return (Criteria) this;
        }

        public Criteria andFnameIsNull() {
            addCriterion("FName is null");
            return (Criteria) this;
        }

        public Criteria andFnameIsNotNull() {
            addCriterion("FName is not null");
            return (Criteria) this;
        }

        public Criteria andFnameEqualTo(String value) {
            addCriterion("FName =", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotEqualTo(String value) {
            addCriterion("FName <>", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameGreaterThan(String value) {
            addCriterion("FName >", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameGreaterThanOrEqualTo(String value) {
            addCriterion("FName >=", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLessThan(String value) {
            addCriterion("FName <", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLessThanOrEqualTo(String value) {
            addCriterion("FName <=", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLike(String value) {
            addCriterion("FName like", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotLike(String value) {
            addCriterion("FName not like", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameIn(List<String> values) {
            addCriterion("FName in", values, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotIn(List<String> values) {
            addCriterion("FName not in", values, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameBetween(String value1, String value2) {
            addCriterion("FName between", value1, value2, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotBetween(String value1, String value2) {
            addCriterion("FName not between", value1, value2, "fname");
            return (Criteria) this;
        }

        public Criteria andFnumberIsNull() {
            addCriterion("FNumber is null");
            return (Criteria) this;
        }

        public Criteria andFnumberIsNotNull() {
            addCriterion("FNumber is not null");
            return (Criteria) this;
        }

        public Criteria andFnumberEqualTo(String value) {
            addCriterion("FNumber =", value, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberNotEqualTo(String value) {
            addCriterion("FNumber <>", value, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberGreaterThan(String value) {
            addCriterion("FNumber >", value, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberGreaterThanOrEqualTo(String value) {
            addCriterion("FNumber >=", value, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberLessThan(String value) {
            addCriterion("FNumber <", value, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberLessThanOrEqualTo(String value) {
            addCriterion("FNumber <=", value, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberLike(String value) {
            addCriterion("FNumber like", value, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberNotLike(String value) {
            addCriterion("FNumber not like", value, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberIn(List<String> values) {
            addCriterion("FNumber in", values, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberNotIn(List<String> values) {
            addCriterion("FNumber not in", values, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberBetween(String value1, String value2) {
            addCriterion("FNumber between", value1, value2, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberNotBetween(String value1, String value2) {
            addCriterion("FNumber not between", value1, value2, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFparentidIsNull() {
            addCriterion("FParentID is null");
            return (Criteria) this;
        }

        public Criteria andFparentidIsNotNull() {
            addCriterion("FParentID is not null");
            return (Criteria) this;
        }

        public Criteria andFparentidEqualTo(Integer value) {
            addCriterion("FParentID =", value, "fparentid");
            return (Criteria) this;
        }

        public Criteria andFparentidNotEqualTo(Integer value) {
            addCriterion("FParentID <>", value, "fparentid");
            return (Criteria) this;
        }

        public Criteria andFparentidGreaterThan(Integer value) {
            addCriterion("FParentID >", value, "fparentid");
            return (Criteria) this;
        }

        public Criteria andFparentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FParentID >=", value, "fparentid");
            return (Criteria) this;
        }

        public Criteria andFparentidLessThan(Integer value) {
            addCriterion("FParentID <", value, "fparentid");
            return (Criteria) this;
        }

        public Criteria andFparentidLessThanOrEqualTo(Integer value) {
            addCriterion("FParentID <=", value, "fparentid");
            return (Criteria) this;
        }

        public Criteria andFparentidIn(List<Integer> values) {
            addCriterion("FParentID in", values, "fparentid");
            return (Criteria) this;
        }

        public Criteria andFparentidNotIn(List<Integer> values) {
            addCriterion("FParentID not in", values, "fparentid");
            return (Criteria) this;
        }

        public Criteria andFparentidBetween(Integer value1, Integer value2) {
            addCriterion("FParentID between", value1, value2, "fparentid");
            return (Criteria) this;
        }

        public Criteria andFparentidNotBetween(Integer value1, Integer value2) {
            addCriterion("FParentID not between", value1, value2, "fparentid");
            return (Criteria) this;
        }

        public Criteria andFdeletedIsNull() {
            addCriterion("FDeleted is null");
            return (Criteria) this;
        }

        public Criteria andFdeletedIsNotNull() {
            addCriterion("FDeleted is not null");
            return (Criteria) this;
        }

        public Criteria andFdeletedEqualTo(Short value) {
            addCriterion("FDeleted =", value, "fdeleted");
            return (Criteria) this;
        }

        public Criteria andFdeletedNotEqualTo(Short value) {
            addCriterion("FDeleted <>", value, "fdeleted");
            return (Criteria) this;
        }

        public Criteria andFdeletedGreaterThan(Short value) {
            addCriterion("FDeleted >", value, "fdeleted");
            return (Criteria) this;
        }

        public Criteria andFdeletedGreaterThanOrEqualTo(Short value) {
            addCriterion("FDeleted >=", value, "fdeleted");
            return (Criteria) this;
        }

        public Criteria andFdeletedLessThan(Short value) {
            addCriterion("FDeleted <", value, "fdeleted");
            return (Criteria) this;
        }

        public Criteria andFdeletedLessThanOrEqualTo(Short value) {
            addCriterion("FDeleted <=", value, "fdeleted");
            return (Criteria) this;
        }

        public Criteria andFdeletedIn(List<Short> values) {
            addCriterion("FDeleted in", values, "fdeleted");
            return (Criteria) this;
        }

        public Criteria andFdeletedNotIn(List<Short> values) {
            addCriterion("FDeleted not in", values, "fdeleted");
            return (Criteria) this;
        }

        public Criteria andFdeletedBetween(Short value1, Short value2) {
            addCriterion("FDeleted between", value1, value2, "fdeleted");
            return (Criteria) this;
        }

        public Criteria andFdeletedNotBetween(Short value1, Short value2) {
            addCriterion("FDeleted not between", value1, value2, "fdeleted");
            return (Criteria) this;
        }

        public Criteria andFshortnumberIsNull() {
            addCriterion("FShortNumber is null");
            return (Criteria) this;
        }

        public Criteria andFshortnumberIsNotNull() {
            addCriterion("FShortNumber is not null");
            return (Criteria) this;
        }

        public Criteria andFshortnumberEqualTo(String value) {
            addCriterion("FShortNumber =", value, "fshortnumber");
            return (Criteria) this;
        }

        public Criteria andFshortnumberNotEqualTo(String value) {
            addCriterion("FShortNumber <>", value, "fshortnumber");
            return (Criteria) this;
        }

        public Criteria andFshortnumberGreaterThan(String value) {
            addCriterion("FShortNumber >", value, "fshortnumber");
            return (Criteria) this;
        }

        public Criteria andFshortnumberGreaterThanOrEqualTo(String value) {
            addCriterion("FShortNumber >=", value, "fshortnumber");
            return (Criteria) this;
        }

        public Criteria andFshortnumberLessThan(String value) {
            addCriterion("FShortNumber <", value, "fshortnumber");
            return (Criteria) this;
        }

        public Criteria andFshortnumberLessThanOrEqualTo(String value) {
            addCriterion("FShortNumber <=", value, "fshortnumber");
            return (Criteria) this;
        }

        public Criteria andFshortnumberLike(String value) {
            addCriterion("FShortNumber like", value, "fshortnumber");
            return (Criteria) this;
        }

        public Criteria andFshortnumberNotLike(String value) {
            addCriterion("FShortNumber not like", value, "fshortnumber");
            return (Criteria) this;
        }

        public Criteria andFshortnumberIn(List<String> values) {
            addCriterion("FShortNumber in", values, "fshortnumber");
            return (Criteria) this;
        }

        public Criteria andFshortnumberNotIn(List<String> values) {
            addCriterion("FShortNumber not in", values, "fshortnumber");
            return (Criteria) this;
        }

        public Criteria andFshortnumberBetween(String value1, String value2) {
            addCriterion("FShortNumber between", value1, value2, "fshortnumber");
            return (Criteria) this;
        }

        public Criteria andFshortnumberNotBetween(String value1, String value2) {
            addCriterion("FShortNumber not between", value1, value2, "fshortnumber");
            return (Criteria) this;
        }

        public Criteria andFtypeidIsNull() {
            addCriterion("FTypeID is null");
            return (Criteria) this;
        }

        public Criteria andFtypeidIsNotNull() {
            addCriterion("FTypeID is not null");
            return (Criteria) this;
        }

        public Criteria andFtypeidEqualTo(Integer value) {
            addCriterion("FTypeID =", value, "ftypeid");
            return (Criteria) this;
        }

        public Criteria andFtypeidNotEqualTo(Integer value) {
            addCriterion("FTypeID <>", value, "ftypeid");
            return (Criteria) this;
        }

        public Criteria andFtypeidGreaterThan(Integer value) {
            addCriterion("FTypeID >", value, "ftypeid");
            return (Criteria) this;
        }

        public Criteria andFtypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FTypeID >=", value, "ftypeid");
            return (Criteria) this;
        }

        public Criteria andFtypeidLessThan(Integer value) {
            addCriterion("FTypeID <", value, "ftypeid");
            return (Criteria) this;
        }

        public Criteria andFtypeidLessThanOrEqualTo(Integer value) {
            addCriterion("FTypeID <=", value, "ftypeid");
            return (Criteria) this;
        }

        public Criteria andFtypeidIn(List<Integer> values) {
            addCriterion("FTypeID in", values, "ftypeid");
            return (Criteria) this;
        }

        public Criteria andFtypeidNotIn(List<Integer> values) {
            addCriterion("FTypeID not in", values, "ftypeid");
            return (Criteria) this;
        }

        public Criteria andFtypeidBetween(Integer value1, Integer value2) {
            addCriterion("FTypeID between", value1, value2, "ftypeid");
            return (Criteria) this;
        }

        public Criteria andFtypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("FTypeID not between", value1, value2, "ftypeid");
            return (Criteria) this;
        }

        public Criteria andFisstockmgrIsNull() {
            addCriterion("FIsStockMgr is null");
            return (Criteria) this;
        }

        public Criteria andFisstockmgrIsNotNull() {
            addCriterion("FIsStockMgr is not null");
            return (Criteria) this;
        }

        public Criteria andFisstockmgrEqualTo(Boolean value) {
            addCriterion("FIsStockMgr =", value, "fisstockmgr");
            return (Criteria) this;
        }

        public Criteria andFisstockmgrNotEqualTo(Boolean value) {
            addCriterion("FIsStockMgr <>", value, "fisstockmgr");
            return (Criteria) this;
        }

        public Criteria andFisstockmgrGreaterThan(Boolean value) {
            addCriterion("FIsStockMgr >", value, "fisstockmgr");
            return (Criteria) this;
        }

        public Criteria andFisstockmgrGreaterThanOrEqualTo(Boolean value) {
            addCriterion("FIsStockMgr >=", value, "fisstockmgr");
            return (Criteria) this;
        }

        public Criteria andFisstockmgrLessThan(Boolean value) {
            addCriterion("FIsStockMgr <", value, "fisstockmgr");
            return (Criteria) this;
        }

        public Criteria andFisstockmgrLessThanOrEqualTo(Boolean value) {
            addCriterion("FIsStockMgr <=", value, "fisstockmgr");
            return (Criteria) this;
        }

        public Criteria andFisstockmgrIn(List<Boolean> values) {
            addCriterion("FIsStockMgr in", values, "fisstockmgr");
            return (Criteria) this;
        }

        public Criteria andFisstockmgrNotIn(List<Boolean> values) {
            addCriterion("FIsStockMgr not in", values, "fisstockmgr");
            return (Criteria) this;
        }

        public Criteria andFisstockmgrBetween(Boolean value1, Boolean value2) {
            addCriterion("FIsStockMgr between", value1, value2, "fisstockmgr");
            return (Criteria) this;
        }

        public Criteria andFisstockmgrNotBetween(Boolean value1, Boolean value2) {
            addCriterion("FIsStockMgr not between", value1, value2, "fisstockmgr");
            return (Criteria) this;
        }

        public Criteria andFspgroupidIsNull() {
            addCriterion("FSPGroupID is null");
            return (Criteria) this;
        }

        public Criteria andFspgroupidIsNotNull() {
            addCriterion("FSPGroupID is not null");
            return (Criteria) this;
        }

        public Criteria andFspgroupidEqualTo(Integer value) {
            addCriterion("FSPGroupID =", value, "fspgroupid");
            return (Criteria) this;
        }

        public Criteria andFspgroupidNotEqualTo(Integer value) {
            addCriterion("FSPGroupID <>", value, "fspgroupid");
            return (Criteria) this;
        }

        public Criteria andFspgroupidGreaterThan(Integer value) {
            addCriterion("FSPGroupID >", value, "fspgroupid");
            return (Criteria) this;
        }

        public Criteria andFspgroupidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FSPGroupID >=", value, "fspgroupid");
            return (Criteria) this;
        }

        public Criteria andFspgroupidLessThan(Integer value) {
            addCriterion("FSPGroupID <", value, "fspgroupid");
            return (Criteria) this;
        }

        public Criteria andFspgroupidLessThanOrEqualTo(Integer value) {
            addCriterion("FSPGroupID <=", value, "fspgroupid");
            return (Criteria) this;
        }

        public Criteria andFspgroupidIn(List<Integer> values) {
            addCriterion("FSPGroupID in", values, "fspgroupid");
            return (Criteria) this;
        }

        public Criteria andFspgroupidNotIn(List<Integer> values) {
            addCriterion("FSPGroupID not in", values, "fspgroupid");
            return (Criteria) this;
        }

        public Criteria andFspgroupidBetween(Integer value1, Integer value2) {
            addCriterion("FSPGroupID between", value1, value2, "fspgroupid");
            return (Criteria) this;
        }

        public Criteria andFspgroupidNotBetween(Integer value1, Integer value2) {
            addCriterion("FSPGroupID not between", value1, value2, "fspgroupid");
            return (Criteria) this;
        }

        public Criteria andFmrpavailIsNull() {
            addCriterion("FMRPAvail is null");
            return (Criteria) this;
        }

        public Criteria andFmrpavailIsNotNull() {
            addCriterion("FMRPAvail is not null");
            return (Criteria) this;
        }

        public Criteria andFmrpavailEqualTo(Boolean value) {
            addCriterion("FMRPAvail =", value, "fmrpavail");
            return (Criteria) this;
        }

        public Criteria andFmrpavailNotEqualTo(Boolean value) {
            addCriterion("FMRPAvail <>", value, "fmrpavail");
            return (Criteria) this;
        }

        public Criteria andFmrpavailGreaterThan(Boolean value) {
            addCriterion("FMRPAvail >", value, "fmrpavail");
            return (Criteria) this;
        }

        public Criteria andFmrpavailGreaterThanOrEqualTo(Boolean value) {
            addCriterion("FMRPAvail >=", value, "fmrpavail");
            return (Criteria) this;
        }

        public Criteria andFmrpavailLessThan(Boolean value) {
            addCriterion("FMRPAvail <", value, "fmrpavail");
            return (Criteria) this;
        }

        public Criteria andFmrpavailLessThanOrEqualTo(Boolean value) {
            addCriterion("FMRPAvail <=", value, "fmrpavail");
            return (Criteria) this;
        }

        public Criteria andFmrpavailIn(List<Boolean> values) {
            addCriterion("FMRPAvail in", values, "fmrpavail");
            return (Criteria) this;
        }

        public Criteria andFmrpavailNotIn(List<Boolean> values) {
            addCriterion("FMRPAvail not in", values, "fmrpavail");
            return (Criteria) this;
        }

        public Criteria andFmrpavailBetween(Boolean value1, Boolean value2) {
            addCriterion("FMRPAvail between", value1, value2, "fmrpavail");
            return (Criteria) this;
        }

        public Criteria andFmrpavailNotBetween(Boolean value1, Boolean value2) {
            addCriterion("FMRPAvail not between", value1, value2, "fmrpavail");
            return (Criteria) this;
        }

        public Criteria andFgroupidIsNull() {
            addCriterion("FGroupID is null");
            return (Criteria) this;
        }

        public Criteria andFgroupidIsNotNull() {
            addCriterion("FGroupID is not null");
            return (Criteria) this;
        }

        public Criteria andFgroupidEqualTo(Integer value) {
            addCriterion("FGroupID =", value, "fgroupid");
            return (Criteria) this;
        }

        public Criteria andFgroupidNotEqualTo(Integer value) {
            addCriterion("FGroupID <>", value, "fgroupid");
            return (Criteria) this;
        }

        public Criteria andFgroupidGreaterThan(Integer value) {
            addCriterion("FGroupID >", value, "fgroupid");
            return (Criteria) this;
        }

        public Criteria andFgroupidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FGroupID >=", value, "fgroupid");
            return (Criteria) this;
        }

        public Criteria andFgroupidLessThan(Integer value) {
            addCriterion("FGroupID <", value, "fgroupid");
            return (Criteria) this;
        }

        public Criteria andFgroupidLessThanOrEqualTo(Integer value) {
            addCriterion("FGroupID <=", value, "fgroupid");
            return (Criteria) this;
        }

        public Criteria andFgroupidIn(List<Integer> values) {
            addCriterion("FGroupID in", values, "fgroupid");
            return (Criteria) this;
        }

        public Criteria andFgroupidNotIn(List<Integer> values) {
            addCriterion("FGroupID not in", values, "fgroupid");
            return (Criteria) this;
        }

        public Criteria andFgroupidBetween(Integer value1, Integer value2) {
            addCriterion("FGroupID between", value1, value2, "fgroupid");
            return (Criteria) this;
        }

        public Criteria andFgroupidNotBetween(Integer value1, Integer value2) {
            addCriterion("FGroupID not between", value1, value2, "fgroupid");
            return (Criteria) this;
        }

        public Criteria andFstockgroupidIsNull() {
            addCriterion("FStockGroupID is null");
            return (Criteria) this;
        }

        public Criteria andFstockgroupidIsNotNull() {
            addCriterion("FStockGroupID is not null");
            return (Criteria) this;
        }

        public Criteria andFstockgroupidEqualTo(Integer value) {
            addCriterion("FStockGroupID =", value, "fstockgroupid");
            return (Criteria) this;
        }

        public Criteria andFstockgroupidNotEqualTo(Integer value) {
            addCriterion("FStockGroupID <>", value, "fstockgroupid");
            return (Criteria) this;
        }

        public Criteria andFstockgroupidGreaterThan(Integer value) {
            addCriterion("FStockGroupID >", value, "fstockgroupid");
            return (Criteria) this;
        }

        public Criteria andFstockgroupidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FStockGroupID >=", value, "fstockgroupid");
            return (Criteria) this;
        }

        public Criteria andFstockgroupidLessThan(Integer value) {
            addCriterion("FStockGroupID <", value, "fstockgroupid");
            return (Criteria) this;
        }

        public Criteria andFstockgroupidLessThanOrEqualTo(Integer value) {
            addCriterion("FStockGroupID <=", value, "fstockgroupid");
            return (Criteria) this;
        }

        public Criteria andFstockgroupidIn(List<Integer> values) {
            addCriterion("FStockGroupID in", values, "fstockgroupid");
            return (Criteria) this;
        }

        public Criteria andFstockgroupidNotIn(List<Integer> values) {
            addCriterion("FStockGroupID not in", values, "fstockgroupid");
            return (Criteria) this;
        }

        public Criteria andFstockgroupidBetween(Integer value1, Integer value2) {
            addCriterion("FStockGroupID between", value1, value2, "fstockgroupid");
            return (Criteria) this;
        }

        public Criteria andFstockgroupidNotBetween(Integer value1, Integer value2) {
            addCriterion("FStockGroupID not between", value1, value2, "fstockgroupid");
            return (Criteria) this;
        }

        public Criteria andFcalccostorderIsNull() {
            addCriterion("FCalcCostOrder is null");
            return (Criteria) this;
        }

        public Criteria andFcalccostorderIsNotNull() {
            addCriterion("FCalcCostOrder is not null");
            return (Criteria) this;
        }

        public Criteria andFcalccostorderEqualTo(Integer value) {
            addCriterion("FCalcCostOrder =", value, "fcalccostorder");
            return (Criteria) this;
        }

        public Criteria andFcalccostorderNotEqualTo(Integer value) {
            addCriterion("FCalcCostOrder <>", value, "fcalccostorder");
            return (Criteria) this;
        }

        public Criteria andFcalccostorderGreaterThan(Integer value) {
            addCriterion("FCalcCostOrder >", value, "fcalccostorder");
            return (Criteria) this;
        }

        public Criteria andFcalccostorderGreaterThanOrEqualTo(Integer value) {
            addCriterion("FCalcCostOrder >=", value, "fcalccostorder");
            return (Criteria) this;
        }

        public Criteria andFcalccostorderLessThan(Integer value) {
            addCriterion("FCalcCostOrder <", value, "fcalccostorder");
            return (Criteria) this;
        }

        public Criteria andFcalccostorderLessThanOrEqualTo(Integer value) {
            addCriterion("FCalcCostOrder <=", value, "fcalccostorder");
            return (Criteria) this;
        }

        public Criteria andFcalccostorderIn(List<Integer> values) {
            addCriterion("FCalcCostOrder in", values, "fcalccostorder");
            return (Criteria) this;
        }

        public Criteria andFcalccostorderNotIn(List<Integer> values) {
            addCriterion("FCalcCostOrder not in", values, "fcalccostorder");
            return (Criteria) this;
        }

        public Criteria andFcalccostorderBetween(Integer value1, Integer value2) {
            addCriterion("FCalcCostOrder between", value1, value2, "fcalccostorder");
            return (Criteria) this;
        }

        public Criteria andFcalccostorderNotBetween(Integer value1, Integer value2) {
            addCriterion("FCalcCostOrder not between", value1, value2, "fcalccostorder");
            return (Criteria) this;
        }

        public Criteria andFplanareaIsNull() {
            addCriterion("FPlanArea is null");
            return (Criteria) this;
        }

        public Criteria andFplanareaIsNotNull() {
            addCriterion("FPlanArea is not null");
            return (Criteria) this;
        }

        public Criteria andFplanareaEqualTo(Integer value) {
            addCriterion("FPlanArea =", value, "fplanarea");
            return (Criteria) this;
        }

        public Criteria andFplanareaNotEqualTo(Integer value) {
            addCriterion("FPlanArea <>", value, "fplanarea");
            return (Criteria) this;
        }

        public Criteria andFplanareaGreaterThan(Integer value) {
            addCriterion("FPlanArea >", value, "fplanarea");
            return (Criteria) this;
        }

        public Criteria andFplanareaGreaterThanOrEqualTo(Integer value) {
            addCriterion("FPlanArea >=", value, "fplanarea");
            return (Criteria) this;
        }

        public Criteria andFplanareaLessThan(Integer value) {
            addCriterion("FPlanArea <", value, "fplanarea");
            return (Criteria) this;
        }

        public Criteria andFplanareaLessThanOrEqualTo(Integer value) {
            addCriterion("FPlanArea <=", value, "fplanarea");
            return (Criteria) this;
        }

        public Criteria andFplanareaIn(List<Integer> values) {
            addCriterion("FPlanArea in", values, "fplanarea");
            return (Criteria) this;
        }

        public Criteria andFplanareaNotIn(List<Integer> values) {
            addCriterion("FPlanArea not in", values, "fplanarea");
            return (Criteria) this;
        }

        public Criteria andFplanareaBetween(Integer value1, Integer value2) {
            addCriterion("FPlanArea between", value1, value2, "fplanarea");
            return (Criteria) this;
        }

        public Criteria andFplanareaNotBetween(Integer value1, Integer value2) {
            addCriterion("FPlanArea not between", value1, value2, "fplanarea");
            return (Criteria) this;
        }

        public Criteria andFunderstockIsNull() {
            addCriterion("FUnderStock is null");
            return (Criteria) this;
        }

        public Criteria andFunderstockIsNotNull() {
            addCriterion("FUnderStock is not null");
            return (Criteria) this;
        }

        public Criteria andFunderstockEqualTo(Integer value) {
            addCriterion("FUnderStock =", value, "funderstock");
            return (Criteria) this;
        }

        public Criteria andFunderstockNotEqualTo(Integer value) {
            addCriterion("FUnderStock <>", value, "funderstock");
            return (Criteria) this;
        }

        public Criteria andFunderstockGreaterThan(Integer value) {
            addCriterion("FUnderStock >", value, "funderstock");
            return (Criteria) this;
        }

        public Criteria andFunderstockGreaterThanOrEqualTo(Integer value) {
            addCriterion("FUnderStock >=", value, "funderstock");
            return (Criteria) this;
        }

        public Criteria andFunderstockLessThan(Integer value) {
            addCriterion("FUnderStock <", value, "funderstock");
            return (Criteria) this;
        }

        public Criteria andFunderstockLessThanOrEqualTo(Integer value) {
            addCriterion("FUnderStock <=", value, "funderstock");
            return (Criteria) this;
        }

        public Criteria andFunderstockIn(List<Integer> values) {
            addCriterion("FUnderStock in", values, "funderstock");
            return (Criteria) this;
        }

        public Criteria andFunderstockNotIn(List<Integer> values) {
            addCriterion("FUnderStock not in", values, "funderstock");
            return (Criteria) this;
        }

        public Criteria andFunderstockBetween(Integer value1, Integer value2) {
            addCriterion("FUnderStock between", value1, value2, "funderstock");
            return (Criteria) this;
        }

        public Criteria andFunderstockNotBetween(Integer value1, Integer value2) {
            addCriterion("FUnderStock not between", value1, value2, "funderstock");
            return (Criteria) this;
        }

        public Criteria andFhelpcodeIsNull() {
            addCriterion("FHelpcode is null");
            return (Criteria) this;
        }

        public Criteria andFhelpcodeIsNotNull() {
            addCriterion("FHelpcode is not null");
            return (Criteria) this;
        }

        public Criteria andFhelpcodeEqualTo(String value) {
            addCriterion("FHelpcode =", value, "fhelpcode");
            return (Criteria) this;
        }

        public Criteria andFhelpcodeNotEqualTo(String value) {
            addCriterion("FHelpcode <>", value, "fhelpcode");
            return (Criteria) this;
        }

        public Criteria andFhelpcodeGreaterThan(String value) {
            addCriterion("FHelpcode >", value, "fhelpcode");
            return (Criteria) this;
        }

        public Criteria andFhelpcodeGreaterThanOrEqualTo(String value) {
            addCriterion("FHelpcode >=", value, "fhelpcode");
            return (Criteria) this;
        }

        public Criteria andFhelpcodeLessThan(String value) {
            addCriterion("FHelpcode <", value, "fhelpcode");
            return (Criteria) this;
        }

        public Criteria andFhelpcodeLessThanOrEqualTo(String value) {
            addCriterion("FHelpcode <=", value, "fhelpcode");
            return (Criteria) this;
        }

        public Criteria andFhelpcodeLike(String value) {
            addCriterion("FHelpcode like", value, "fhelpcode");
            return (Criteria) this;
        }

        public Criteria andFhelpcodeNotLike(String value) {
            addCriterion("FHelpcode not like", value, "fhelpcode");
            return (Criteria) this;
        }

        public Criteria andFhelpcodeIn(List<String> values) {
            addCriterion("FHelpcode in", values, "fhelpcode");
            return (Criteria) this;
        }

        public Criteria andFhelpcodeNotIn(List<String> values) {
            addCriterion("FHelpcode not in", values, "fhelpcode");
            return (Criteria) this;
        }

        public Criteria andFhelpcodeBetween(String value1, String value2) {
            addCriterion("FHelpcode between", value1, value2, "fhelpcode");
            return (Criteria) this;
        }

        public Criteria andFhelpcodeNotBetween(String value1, String value2) {
            addCriterion("FHelpcode not between", value1, value2, "fhelpcode");
            return (Criteria) this;
        }

        public Criteria andFbranchidIsNull() {
            addCriterion("FBranchID is null");
            return (Criteria) this;
        }

        public Criteria andFbranchidIsNotNull() {
            addCriterion("FBranchID is not null");
            return (Criteria) this;
        }

        public Criteria andFbranchidEqualTo(Integer value) {
            addCriterion("FBranchID =", value, "fbranchid");
            return (Criteria) this;
        }

        public Criteria andFbranchidNotEqualTo(Integer value) {
            addCriterion("FBranchID <>", value, "fbranchid");
            return (Criteria) this;
        }

        public Criteria andFbranchidGreaterThan(Integer value) {
            addCriterion("FBranchID >", value, "fbranchid");
            return (Criteria) this;
        }

        public Criteria andFbranchidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FBranchID >=", value, "fbranchid");
            return (Criteria) this;
        }

        public Criteria andFbranchidLessThan(Integer value) {
            addCriterion("FBranchID <", value, "fbranchid");
            return (Criteria) this;
        }

        public Criteria andFbranchidLessThanOrEqualTo(Integer value) {
            addCriterion("FBranchID <=", value, "fbranchid");
            return (Criteria) this;
        }

        public Criteria andFbranchidIn(List<Integer> values) {
            addCriterion("FBranchID in", values, "fbranchid");
            return (Criteria) this;
        }

        public Criteria andFbranchidNotIn(List<Integer> values) {
            addCriterion("FBranchID not in", values, "fbranchid");
            return (Criteria) this;
        }

        public Criteria andFbranchidBetween(Integer value1, Integer value2) {
            addCriterion("FBranchID between", value1, value2, "fbranchid");
            return (Criteria) this;
        }

        public Criteria andFbranchidNotBetween(Integer value1, Integer value2) {
            addCriterion("FBranchID not between", value1, value2, "fbranchid");
            return (Criteria) this;
        }

        public Criteria andFpointsrateIsNull() {
            addCriterion("FPointsRate is null");
            return (Criteria) this;
        }

        public Criteria andFpointsrateIsNotNull() {
            addCriterion("FPointsRate is not null");
            return (Criteria) this;
        }

        public Criteria andFpointsrateEqualTo(BigDecimal value) {
            addCriterion("FPointsRate =", value, "fpointsrate");
            return (Criteria) this;
        }

        public Criteria andFpointsrateNotEqualTo(BigDecimal value) {
            addCriterion("FPointsRate <>", value, "fpointsrate");
            return (Criteria) this;
        }

        public Criteria andFpointsrateGreaterThan(BigDecimal value) {
            addCriterion("FPointsRate >", value, "fpointsrate");
            return (Criteria) this;
        }

        public Criteria andFpointsrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FPointsRate >=", value, "fpointsrate");
            return (Criteria) this;
        }

        public Criteria andFpointsrateLessThan(BigDecimal value) {
            addCriterion("FPointsRate <", value, "fpointsrate");
            return (Criteria) this;
        }

        public Criteria andFpointsrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FPointsRate <=", value, "fpointsrate");
            return (Criteria) this;
        }

        public Criteria andFpointsrateIn(List<BigDecimal> values) {
            addCriterion("FPointsRate in", values, "fpointsrate");
            return (Criteria) this;
        }

        public Criteria andFpointsrateNotIn(List<BigDecimal> values) {
            addCriterion("FPointsRate not in", values, "fpointsrate");
            return (Criteria) this;
        }

        public Criteria andFpointsrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FPointsRate between", value1, value2, "fpointsrate");
            return (Criteria) this;
        }

        public Criteria andFpointsrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FPointsRate not between", value1, value2, "fpointsrate");
            return (Criteria) this;
        }

        public Criteria andFissharedIsNull() {
            addCriterion("FIsShared is null");
            return (Criteria) this;
        }

        public Criteria andFissharedIsNotNull() {
            addCriterion("FIsShared is not null");
            return (Criteria) this;
        }

        public Criteria andFissharedEqualTo(Integer value) {
            addCriterion("FIsShared =", value, "fisshared");
            return (Criteria) this;
        }

        public Criteria andFissharedNotEqualTo(Integer value) {
            addCriterion("FIsShared <>", value, "fisshared");
            return (Criteria) this;
        }

        public Criteria andFissharedGreaterThan(Integer value) {
            addCriterion("FIsShared >", value, "fisshared");
            return (Criteria) this;
        }

        public Criteria andFissharedGreaterThanOrEqualTo(Integer value) {
            addCriterion("FIsShared >=", value, "fisshared");
            return (Criteria) this;
        }

        public Criteria andFissharedLessThan(Integer value) {
            addCriterion("FIsShared <", value, "fisshared");
            return (Criteria) this;
        }

        public Criteria andFissharedLessThanOrEqualTo(Integer value) {
            addCriterion("FIsShared <=", value, "fisshared");
            return (Criteria) this;
        }

        public Criteria andFissharedIn(List<Integer> values) {
            addCriterion("FIsShared in", values, "fisshared");
            return (Criteria) this;
        }

        public Criteria andFissharedNotIn(List<Integer> values) {
            addCriterion("FIsShared not in", values, "fisshared");
            return (Criteria) this;
        }

        public Criteria andFissharedBetween(Integer value1, Integer value2) {
            addCriterion("FIsShared between", value1, value2, "fisshared");
            return (Criteria) this;
        }

        public Criteria andFissharedNotBetween(Integer value1, Integer value2) {
            addCriterion("FIsShared not between", value1, value2, "fisshared");
            return (Criteria) this;
        }

        public Criteria andFisinstatisticsIsNull() {
            addCriterion("FIsInStatistics is null");
            return (Criteria) this;
        }

        public Criteria andFisinstatisticsIsNotNull() {
            addCriterion("FIsInStatistics is not null");
            return (Criteria) this;
        }

        public Criteria andFisinstatisticsEqualTo(Boolean value) {
            addCriterion("FIsInStatistics =", value, "fisinstatistics");
            return (Criteria) this;
        }

        public Criteria andFisinstatisticsNotEqualTo(Boolean value) {
            addCriterion("FIsInStatistics <>", value, "fisinstatistics");
            return (Criteria) this;
        }

        public Criteria andFisinstatisticsGreaterThan(Boolean value) {
            addCriterion("FIsInStatistics >", value, "fisinstatistics");
            return (Criteria) this;
        }

        public Criteria andFisinstatisticsGreaterThanOrEqualTo(Boolean value) {
            addCriterion("FIsInStatistics >=", value, "fisinstatistics");
            return (Criteria) this;
        }

        public Criteria andFisinstatisticsLessThan(Boolean value) {
            addCriterion("FIsInStatistics <", value, "fisinstatistics");
            return (Criteria) this;
        }

        public Criteria andFisinstatisticsLessThanOrEqualTo(Boolean value) {
            addCriterion("FIsInStatistics <=", value, "fisinstatistics");
            return (Criteria) this;
        }

        public Criteria andFisinstatisticsIn(List<Boolean> values) {
            addCriterion("FIsInStatistics in", values, "fisinstatistics");
            return (Criteria) this;
        }

        public Criteria andFisinstatisticsNotIn(List<Boolean> values) {
            addCriterion("FIsInStatistics not in", values, "fisinstatistics");
            return (Criteria) this;
        }

        public Criteria andFisinstatisticsBetween(Boolean value1, Boolean value2) {
            addCriterion("FIsInStatistics between", value1, value2, "fisinstatistics");
            return (Criteria) this;
        }

        public Criteria andFisinstatisticsNotBetween(Boolean value1, Boolean value2) {
            addCriterion("FIsInStatistics not between", value1, value2, "fisinstatistics");
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