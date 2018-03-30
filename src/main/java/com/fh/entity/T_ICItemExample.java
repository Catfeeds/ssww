package com.fh.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class T_ICItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public T_ICItemExample() {
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

        public Criteria andFmodelIsNull() {
            addCriterion("FModel is null");
            return (Criteria) this;
        }

        public Criteria andFmodelIsNotNull() {
            addCriterion("FModel is not null");
            return (Criteria) this;
        }

        public Criteria andFmodelEqualTo(String value) {
            addCriterion("FModel =", value, "fmodel");
            return (Criteria) this;
        }

        public Criteria andFmodelNotEqualTo(String value) {
            addCriterion("FModel <>", value, "fmodel");
            return (Criteria) this;
        }

        public Criteria andFmodelGreaterThan(String value) {
            addCriterion("FModel >", value, "fmodel");
            return (Criteria) this;
        }

        public Criteria andFmodelGreaterThanOrEqualTo(String value) {
            addCriterion("FModel >=", value, "fmodel");
            return (Criteria) this;
        }

        public Criteria andFmodelLessThan(String value) {
            addCriterion("FModel <", value, "fmodel");
            return (Criteria) this;
        }

        public Criteria andFmodelLessThanOrEqualTo(String value) {
            addCriterion("FModel <=", value, "fmodel");
            return (Criteria) this;
        }

        public Criteria andFmodelLike(String value) {
            addCriterion("FModel like", value, "fmodel");
            return (Criteria) this;
        }

        public Criteria andFmodelNotLike(String value) {
            addCriterion("FModel not like", value, "fmodel");
            return (Criteria) this;
        }

        public Criteria andFmodelIn(List<String> values) {
            addCriterion("FModel in", values, "fmodel");
            return (Criteria) this;
        }

        public Criteria andFmodelNotIn(List<String> values) {
            addCriterion("FModel not in", values, "fmodel");
            return (Criteria) this;
        }

        public Criteria andFmodelBetween(String value1, String value2) {
            addCriterion("FModel between", value1, value2, "fmodel");
            return (Criteria) this;
        }

        public Criteria andFmodelNotBetween(String value1, String value2) {
            addCriterion("FModel not between", value1, value2, "fmodel");
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
            addCriterion("A.FName +ISNULL(A.FModel,'') like", value, "fname");
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

        public Criteria andFhelpcodeIsNull() {
            addCriterion("FHelpCode is null");
            return (Criteria) this;
        }

        public Criteria andFhelpcodeIsNotNull() {
            addCriterion("FHelpCode is not null");
            return (Criteria) this;
        }

        public Criteria andFhelpcodeEqualTo(String value) {
            addCriterion("FHelpCode =", value, "fhelpcode");
            return (Criteria) this;
        }

        public Criteria andFhelpcodeNotEqualTo(String value) {
            addCriterion("FHelpCode <>", value, "fhelpcode");
            return (Criteria) this;
        }

        public Criteria andFhelpcodeGreaterThan(String value) {
            addCriterion("FHelpCode >", value, "fhelpcode");
            return (Criteria) this;
        }

        public Criteria andFhelpcodeGreaterThanOrEqualTo(String value) {
            addCriterion("FHelpCode >=", value, "fhelpcode");
            return (Criteria) this;
        }

        public Criteria andFhelpcodeLessThan(String value) {
            addCriterion("FHelpCode <", value, "fhelpcode");
            return (Criteria) this;
        }

        public Criteria andFhelpcodeLessThanOrEqualTo(String value) {
            addCriterion("FHelpCode <=", value, "fhelpcode");
            return (Criteria) this;
        }

        public Criteria andFhelpcodeLike(String value) {
            addCriterion("FHelpCode like", value, "fhelpcode");
            return (Criteria) this;
        }

        public Criteria andFhelpcodeNotLike(String value) {
            addCriterion("FHelpCode not like", value, "fhelpcode");
            return (Criteria) this;
        }

        public Criteria andFhelpcodeIn(List<String> values) {
            addCriterion("FHelpCode in", values, "fhelpcode");
            return (Criteria) this;
        }

        public Criteria andFhelpcodeNotIn(List<String> values) {
            addCriterion("FHelpCode not in", values, "fhelpcode");
            return (Criteria) this;
        }

        public Criteria andFhelpcodeBetween(String value1, String value2) {
            addCriterion("FHelpCode between", value1, value2, "fhelpcode");
            return (Criteria) this;
        }

        public Criteria andFhelpcodeNotBetween(String value1, String value2) {
            addCriterion("FHelpCode not between", value1, value2, "fhelpcode");
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

        public Criteria andFbrnoIsNull() {
            addCriterion("FBrNo is null");
            return (Criteria) this;
        }

        public Criteria andFbrnoIsNotNull() {
            addCriterion("FBrNo is not null");
            return (Criteria) this;
        }

        public Criteria andFbrnoEqualTo(String value) {
            addCriterion("FBrNo =", value, "fbrno");
            return (Criteria) this;
        }

        public Criteria andFbrnoNotEqualTo(String value) {
            addCriterion("FBrNo <>", value, "fbrno");
            return (Criteria) this;
        }

        public Criteria andFbrnoGreaterThan(String value) {
            addCriterion("FBrNo >", value, "fbrno");
            return (Criteria) this;
        }

        public Criteria andFbrnoGreaterThanOrEqualTo(String value) {
            addCriterion("FBrNo >=", value, "fbrno");
            return (Criteria) this;
        }

        public Criteria andFbrnoLessThan(String value) {
            addCriterion("FBrNo <", value, "fbrno");
            return (Criteria) this;
        }

        public Criteria andFbrnoLessThanOrEqualTo(String value) {
            addCriterion("FBrNo <=", value, "fbrno");
            return (Criteria) this;
        }

        public Criteria andFbrnoLike(String value) {
            addCriterion("FBrNo like", value, "fbrno");
            return (Criteria) this;
        }

        public Criteria andFbrnoNotLike(String value) {
            addCriterion("FBrNo not like", value, "fbrno");
            return (Criteria) this;
        }

        public Criteria andFbrnoIn(List<String> values) {
            addCriterion("FBrNo in", values, "fbrno");
            return (Criteria) this;
        }

        public Criteria andFbrnoNotIn(List<String> values) {
            addCriterion("FBrNo not in", values, "fbrno");
            return (Criteria) this;
        }

        public Criteria andFbrnoBetween(String value1, String value2) {
            addCriterion("FBrNo between", value1, value2, "fbrno");
            return (Criteria) this;
        }

        public Criteria andFbrnoNotBetween(String value1, String value2) {
            addCriterion("FBrNo not between", value1, value2, "fbrno");
            return (Criteria) this;
        }

        public Criteria andFtopidIsNull() {
            addCriterion("FTopID is null");
            return (Criteria) this;
        }

        public Criteria andFtopidIsNotNull() {
            addCriterion("FTopID is not null");
            return (Criteria) this;
        }

        public Criteria andFtopidEqualTo(Integer value) {
            addCriterion("FTopID =", value, "ftopid");
            return (Criteria) this;
        }

        public Criteria andFtopidNotEqualTo(Integer value) {
            addCriterion("FTopID <>", value, "ftopid");
            return (Criteria) this;
        }

        public Criteria andFtopidGreaterThan(Integer value) {
            addCriterion("FTopID >", value, "ftopid");
            return (Criteria) this;
        }

        public Criteria andFtopidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FTopID >=", value, "ftopid");
            return (Criteria) this;
        }

        public Criteria andFtopidLessThan(Integer value) {
            addCriterion("FTopID <", value, "ftopid");
            return (Criteria) this;
        }

        public Criteria andFtopidLessThanOrEqualTo(Integer value) {
            addCriterion("FTopID <=", value, "ftopid");
            return (Criteria) this;
        }

        public Criteria andFtopidIn(List<Integer> values) {
            addCriterion("FTopID in", values, "ftopid");
            return (Criteria) this;
        }

        public Criteria andFtopidNotIn(List<Integer> values) {
            addCriterion("FTopID not in", values, "ftopid");
            return (Criteria) this;
        }

        public Criteria andFtopidBetween(Integer value1, Integer value2) {
            addCriterion("FTopID between", value1, value2, "ftopid");
            return (Criteria) this;
        }

        public Criteria andFtopidNotBetween(Integer value1, Integer value2) {
            addCriterion("FTopID not between", value1, value2, "ftopid");
            return (Criteria) this;
        }

        public Criteria andFrpIsNull() {
            addCriterion("FRP is null");
            return (Criteria) this;
        }

        public Criteria andFrpIsNotNull() {
            addCriterion("FRP is not null");
            return (Criteria) this;
        }

        public Criteria andFrpEqualTo(Short value) {
            addCriterion("FRP =", value, "frp");
            return (Criteria) this;
        }

        public Criteria andFrpNotEqualTo(Short value) {
            addCriterion("FRP <>", value, "frp");
            return (Criteria) this;
        }

        public Criteria andFrpGreaterThan(Short value) {
            addCriterion("FRP >", value, "frp");
            return (Criteria) this;
        }

        public Criteria andFrpGreaterThanOrEqualTo(Short value) {
            addCriterion("FRP >=", value, "frp");
            return (Criteria) this;
        }

        public Criteria andFrpLessThan(Short value) {
            addCriterion("FRP <", value, "frp");
            return (Criteria) this;
        }

        public Criteria andFrpLessThanOrEqualTo(Short value) {
            addCriterion("FRP <=", value, "frp");
            return (Criteria) this;
        }

        public Criteria andFrpIn(List<Short> values) {
            addCriterion("FRP in", values, "frp");
            return (Criteria) this;
        }

        public Criteria andFrpNotIn(List<Short> values) {
            addCriterion("FRP not in", values, "frp");
            return (Criteria) this;
        }

        public Criteria andFrpBetween(Short value1, Short value2) {
            addCriterion("FRP between", value1, value2, "frp");
            return (Criteria) this;
        }

        public Criteria andFrpNotBetween(Short value1, Short value2) {
            addCriterion("FRP not between", value1, value2, "frp");
            return (Criteria) this;
        }

        public Criteria andFomortizeIsNull() {
            addCriterion("FOmortize is null");
            return (Criteria) this;
        }

        public Criteria andFomortizeIsNotNull() {
            addCriterion("FOmortize is not null");
            return (Criteria) this;
        }

        public Criteria andFomortizeEqualTo(Short value) {
            addCriterion("FOmortize =", value, "fomortize");
            return (Criteria) this;
        }

        public Criteria andFomortizeNotEqualTo(Short value) {
            addCriterion("FOmortize <>", value, "fomortize");
            return (Criteria) this;
        }

        public Criteria andFomortizeGreaterThan(Short value) {
            addCriterion("FOmortize >", value, "fomortize");
            return (Criteria) this;
        }

        public Criteria andFomortizeGreaterThanOrEqualTo(Short value) {
            addCriterion("FOmortize >=", value, "fomortize");
            return (Criteria) this;
        }

        public Criteria andFomortizeLessThan(Short value) {
            addCriterion("FOmortize <", value, "fomortize");
            return (Criteria) this;
        }

        public Criteria andFomortizeLessThanOrEqualTo(Short value) {
            addCriterion("FOmortize <=", value, "fomortize");
            return (Criteria) this;
        }

        public Criteria andFomortizeIn(List<Short> values) {
            addCriterion("FOmortize in", values, "fomortize");
            return (Criteria) this;
        }

        public Criteria andFomortizeNotIn(List<Short> values) {
            addCriterion("FOmortize not in", values, "fomortize");
            return (Criteria) this;
        }

        public Criteria andFomortizeBetween(Short value1, Short value2) {
            addCriterion("FOmortize between", value1, value2, "fomortize");
            return (Criteria) this;
        }

        public Criteria andFomortizeNotBetween(Short value1, Short value2) {
            addCriterion("FOmortize not between", value1, value2, "fomortize");
            return (Criteria) this;
        }

        public Criteria andFomortizescaleIsNull() {
            addCriterion("FOmortizeScale is null");
            return (Criteria) this;
        }

        public Criteria andFomortizescaleIsNotNull() {
            addCriterion("FOmortizeScale is not null");
            return (Criteria) this;
        }

        public Criteria andFomortizescaleEqualTo(Short value) {
            addCriterion("FOmortizeScale =", value, "fomortizescale");
            return (Criteria) this;
        }

        public Criteria andFomortizescaleNotEqualTo(Short value) {
            addCriterion("FOmortizeScale <>", value, "fomortizescale");
            return (Criteria) this;
        }

        public Criteria andFomortizescaleGreaterThan(Short value) {
            addCriterion("FOmortizeScale >", value, "fomortizescale");
            return (Criteria) this;
        }

        public Criteria andFomortizescaleGreaterThanOrEqualTo(Short value) {
            addCriterion("FOmortizeScale >=", value, "fomortizescale");
            return (Criteria) this;
        }

        public Criteria andFomortizescaleLessThan(Short value) {
            addCriterion("FOmortizeScale <", value, "fomortizescale");
            return (Criteria) this;
        }

        public Criteria andFomortizescaleLessThanOrEqualTo(Short value) {
            addCriterion("FOmortizeScale <=", value, "fomortizescale");
            return (Criteria) this;
        }

        public Criteria andFomortizescaleIn(List<Short> values) {
            addCriterion("FOmortizeScale in", values, "fomortizescale");
            return (Criteria) this;
        }

        public Criteria andFomortizescaleNotIn(List<Short> values) {
            addCriterion("FOmortizeScale not in", values, "fomortizescale");
            return (Criteria) this;
        }

        public Criteria andFomortizescaleBetween(Short value1, Short value2) {
            addCriterion("FOmortizeScale between", value1, value2, "fomortizescale");
            return (Criteria) this;
        }

        public Criteria andFomortizescaleNotBetween(Short value1, Short value2) {
            addCriterion("FOmortizeScale not between", value1, value2, "fomortizescale");
            return (Criteria) this;
        }

        public Criteria andFforsaleIsNull() {
            addCriterion("FForSale is null");
            return (Criteria) this;
        }

        public Criteria andFforsaleIsNotNull() {
            addCriterion("FForSale is not null");
            return (Criteria) this;
        }

        public Criteria andFforsaleEqualTo(Boolean value) {
            addCriterion("FForSale =", value, "fforsale");
            return (Criteria) this;
        }

        public Criteria andFforsaleNotEqualTo(Boolean value) {
            addCriterion("FForSale <>", value, "fforsale");
            return (Criteria) this;
        }

        public Criteria andFforsaleGreaterThan(Boolean value) {
            addCriterion("FForSale >", value, "fforsale");
            return (Criteria) this;
        }

        public Criteria andFforsaleGreaterThanOrEqualTo(Boolean value) {
            addCriterion("FForSale >=", value, "fforsale");
            return (Criteria) this;
        }

        public Criteria andFforsaleLessThan(Boolean value) {
            addCriterion("FForSale <", value, "fforsale");
            return (Criteria) this;
        }

        public Criteria andFforsaleLessThanOrEqualTo(Boolean value) {
            addCriterion("FForSale <=", value, "fforsale");
            return (Criteria) this;
        }

        public Criteria andFforsaleIn(List<Boolean> values) {
            addCriterion("FForSale in", values, "fforsale");
            return (Criteria) this;
        }

        public Criteria andFforsaleNotIn(List<Boolean> values) {
            addCriterion("FForSale not in", values, "fforsale");
            return (Criteria) this;
        }

        public Criteria andFforsaleBetween(Boolean value1, Boolean value2) {
            addCriterion("FForSale between", value1, value2, "fforsale");
            return (Criteria) this;
        }

        public Criteria andFforsaleNotBetween(Boolean value1, Boolean value2) {
            addCriterion("FForSale not between", value1, value2, "fforsale");
            return (Criteria) this;
        }

        public Criteria andFstacostIsNull() {
            addCriterion("FStaCost is null");
            return (Criteria) this;
        }

        public Criteria andFstacostIsNotNull() {
            addCriterion("FStaCost is not null");
            return (Criteria) this;
        }

        public Criteria andFstacostEqualTo(Double value) {
            addCriterion("FStaCost =", value, "fstacost");
            return (Criteria) this;
        }

        public Criteria andFstacostNotEqualTo(Double value) {
            addCriterion("FStaCost <>", value, "fstacost");
            return (Criteria) this;
        }

        public Criteria andFstacostGreaterThan(Double value) {
            addCriterion("FStaCost >", value, "fstacost");
            return (Criteria) this;
        }

        public Criteria andFstacostGreaterThanOrEqualTo(Double value) {
            addCriterion("FStaCost >=", value, "fstacost");
            return (Criteria) this;
        }

        public Criteria andFstacostLessThan(Double value) {
            addCriterion("FStaCost <", value, "fstacost");
            return (Criteria) this;
        }

        public Criteria andFstacostLessThanOrEqualTo(Double value) {
            addCriterion("FStaCost <=", value, "fstacost");
            return (Criteria) this;
        }

        public Criteria andFstacostIn(List<Double> values) {
            addCriterion("FStaCost in", values, "fstacost");
            return (Criteria) this;
        }

        public Criteria andFstacostNotIn(List<Double> values) {
            addCriterion("FStaCost not in", values, "fstacost");
            return (Criteria) this;
        }

        public Criteria andFstacostBetween(Double value1, Double value2) {
            addCriterion("FStaCost between", value1, value2, "fstacost");
            return (Criteria) this;
        }

        public Criteria andFstacostNotBetween(Double value1, Double value2) {
            addCriterion("FStaCost not between", value1, value2, "fstacost");
            return (Criteria) this;
        }

        public Criteria andForderpriceIsNull() {
            addCriterion("FOrderPrice is null");
            return (Criteria) this;
        }

        public Criteria andForderpriceIsNotNull() {
            addCriterion("FOrderPrice is not null");
            return (Criteria) this;
        }

        public Criteria andForderpriceEqualTo(Double value) {
            addCriterion("FOrderPrice =", value, "forderprice");
            return (Criteria) this;
        }

        public Criteria andForderpriceNotEqualTo(Double value) {
            addCriterion("FOrderPrice <>", value, "forderprice");
            return (Criteria) this;
        }

        public Criteria andForderpriceGreaterThan(Double value) {
            addCriterion("FOrderPrice >", value, "forderprice");
            return (Criteria) this;
        }

        public Criteria andForderpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("FOrderPrice >=", value, "forderprice");
            return (Criteria) this;
        }

        public Criteria andForderpriceLessThan(Double value) {
            addCriterion("FOrderPrice <", value, "forderprice");
            return (Criteria) this;
        }

        public Criteria andForderpriceLessThanOrEqualTo(Double value) {
            addCriterion("FOrderPrice <=", value, "forderprice");
            return (Criteria) this;
        }

        public Criteria andForderpriceIn(List<Double> values) {
            addCriterion("FOrderPrice in", values, "forderprice");
            return (Criteria) this;
        }

        public Criteria andForderpriceNotIn(List<Double> values) {
            addCriterion("FOrderPrice not in", values, "forderprice");
            return (Criteria) this;
        }

        public Criteria andForderpriceBetween(Double value1, Double value2) {
            addCriterion("FOrderPrice between", value1, value2, "forderprice");
            return (Criteria) this;
        }

        public Criteria andForderpriceNotBetween(Double value1, Double value2) {
            addCriterion("FOrderPrice not between", value1, value2, "forderprice");
            return (Criteria) this;
        }

        public Criteria andFordermethodIsNull() {
            addCriterion("FOrderMethod is null");
            return (Criteria) this;
        }

        public Criteria andFordermethodIsNotNull() {
            addCriterion("FOrderMethod is not null");
            return (Criteria) this;
        }

        public Criteria andFordermethodEqualTo(Integer value) {
            addCriterion("FOrderMethod =", value, "fordermethod");
            return (Criteria) this;
        }

        public Criteria andFordermethodNotEqualTo(Integer value) {
            addCriterion("FOrderMethod <>", value, "fordermethod");
            return (Criteria) this;
        }

        public Criteria andFordermethodGreaterThan(Integer value) {
            addCriterion("FOrderMethod >", value, "fordermethod");
            return (Criteria) this;
        }

        public Criteria andFordermethodGreaterThanOrEqualTo(Integer value) {
            addCriterion("FOrderMethod >=", value, "fordermethod");
            return (Criteria) this;
        }

        public Criteria andFordermethodLessThan(Integer value) {
            addCriterion("FOrderMethod <", value, "fordermethod");
            return (Criteria) this;
        }

        public Criteria andFordermethodLessThanOrEqualTo(Integer value) {
            addCriterion("FOrderMethod <=", value, "fordermethod");
            return (Criteria) this;
        }

        public Criteria andFordermethodIn(List<Integer> values) {
            addCriterion("FOrderMethod in", values, "fordermethod");
            return (Criteria) this;
        }

        public Criteria andFordermethodNotIn(List<Integer> values) {
            addCriterion("FOrderMethod not in", values, "fordermethod");
            return (Criteria) this;
        }

        public Criteria andFordermethodBetween(Integer value1, Integer value2) {
            addCriterion("FOrderMethod between", value1, value2, "fordermethod");
            return (Criteria) this;
        }

        public Criteria andFordermethodNotBetween(Integer value1, Integer value2) {
            addCriterion("FOrderMethod not between", value1, value2, "fordermethod");
            return (Criteria) this;
        }

        public Criteria andFpricefixingtypeIsNull() {
            addCriterion("FPriceFixingType is null");
            return (Criteria) this;
        }

        public Criteria andFpricefixingtypeIsNotNull() {
            addCriterion("FPriceFixingType is not null");
            return (Criteria) this;
        }

        public Criteria andFpricefixingtypeEqualTo(Integer value) {
            addCriterion("FPriceFixingType =", value, "fpricefixingtype");
            return (Criteria) this;
        }

        public Criteria andFpricefixingtypeNotEqualTo(Integer value) {
            addCriterion("FPriceFixingType <>", value, "fpricefixingtype");
            return (Criteria) this;
        }

        public Criteria andFpricefixingtypeGreaterThan(Integer value) {
            addCriterion("FPriceFixingType >", value, "fpricefixingtype");
            return (Criteria) this;
        }

        public Criteria andFpricefixingtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("FPriceFixingType >=", value, "fpricefixingtype");
            return (Criteria) this;
        }

        public Criteria andFpricefixingtypeLessThan(Integer value) {
            addCriterion("FPriceFixingType <", value, "fpricefixingtype");
            return (Criteria) this;
        }

        public Criteria andFpricefixingtypeLessThanOrEqualTo(Integer value) {
            addCriterion("FPriceFixingType <=", value, "fpricefixingtype");
            return (Criteria) this;
        }

        public Criteria andFpricefixingtypeIn(List<Integer> values) {
            addCriterion("FPriceFixingType in", values, "fpricefixingtype");
            return (Criteria) this;
        }

        public Criteria andFpricefixingtypeNotIn(List<Integer> values) {
            addCriterion("FPriceFixingType not in", values, "fpricefixingtype");
            return (Criteria) this;
        }

        public Criteria andFpricefixingtypeBetween(Integer value1, Integer value2) {
            addCriterion("FPriceFixingType between", value1, value2, "fpricefixingtype");
            return (Criteria) this;
        }

        public Criteria andFpricefixingtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("FPriceFixingType not between", value1, value2, "fpricefixingtype");
            return (Criteria) this;
        }

        public Criteria andFsalepricefixingtypeIsNull() {
            addCriterion("FSalePriceFixingType is null");
            return (Criteria) this;
        }

        public Criteria andFsalepricefixingtypeIsNotNull() {
            addCriterion("FSalePriceFixingType is not null");
            return (Criteria) this;
        }

        public Criteria andFsalepricefixingtypeEqualTo(Integer value) {
            addCriterion("FSalePriceFixingType =", value, "fsalepricefixingtype");
            return (Criteria) this;
        }

        public Criteria andFsalepricefixingtypeNotEqualTo(Integer value) {
            addCriterion("FSalePriceFixingType <>", value, "fsalepricefixingtype");
            return (Criteria) this;
        }

        public Criteria andFsalepricefixingtypeGreaterThan(Integer value) {
            addCriterion("FSalePriceFixingType >", value, "fsalepricefixingtype");
            return (Criteria) this;
        }

        public Criteria andFsalepricefixingtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("FSalePriceFixingType >=", value, "fsalepricefixingtype");
            return (Criteria) this;
        }

        public Criteria andFsalepricefixingtypeLessThan(Integer value) {
            addCriterion("FSalePriceFixingType <", value, "fsalepricefixingtype");
            return (Criteria) this;
        }

        public Criteria andFsalepricefixingtypeLessThanOrEqualTo(Integer value) {
            addCriterion("FSalePriceFixingType <=", value, "fsalepricefixingtype");
            return (Criteria) this;
        }

        public Criteria andFsalepricefixingtypeIn(List<Integer> values) {
            addCriterion("FSalePriceFixingType in", values, "fsalepricefixingtype");
            return (Criteria) this;
        }

        public Criteria andFsalepricefixingtypeNotIn(List<Integer> values) {
            addCriterion("FSalePriceFixingType not in", values, "fsalepricefixingtype");
            return (Criteria) this;
        }

        public Criteria andFsalepricefixingtypeBetween(Integer value1, Integer value2) {
            addCriterion("FSalePriceFixingType between", value1, value2, "fsalepricefixingtype");
            return (Criteria) this;
        }

        public Criteria andFsalepricefixingtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("FSalePriceFixingType not between", value1, value2, "fsalepricefixingtype");
            return (Criteria) this;
        }

        public Criteria andFperwastageIsNull() {
            addCriterion("FPerWastage is null");
            return (Criteria) this;
        }

        public Criteria andFperwastageIsNotNull() {
            addCriterion("FPerWastage is not null");
            return (Criteria) this;
        }

        public Criteria andFperwastageEqualTo(Double value) {
            addCriterion("FPerWastage =", value, "fperwastage");
            return (Criteria) this;
        }

        public Criteria andFperwastageNotEqualTo(Double value) {
            addCriterion("FPerWastage <>", value, "fperwastage");
            return (Criteria) this;
        }

        public Criteria andFperwastageGreaterThan(Double value) {
            addCriterion("FPerWastage >", value, "fperwastage");
            return (Criteria) this;
        }

        public Criteria andFperwastageGreaterThanOrEqualTo(Double value) {
            addCriterion("FPerWastage >=", value, "fperwastage");
            return (Criteria) this;
        }

        public Criteria andFperwastageLessThan(Double value) {
            addCriterion("FPerWastage <", value, "fperwastage");
            return (Criteria) this;
        }

        public Criteria andFperwastageLessThanOrEqualTo(Double value) {
            addCriterion("FPerWastage <=", value, "fperwastage");
            return (Criteria) this;
        }

        public Criteria andFperwastageIn(List<Double> values) {
            addCriterion("FPerWastage in", values, "fperwastage");
            return (Criteria) this;
        }

        public Criteria andFperwastageNotIn(List<Double> values) {
            addCriterion("FPerWastage not in", values, "fperwastage");
            return (Criteria) this;
        }

        public Criteria andFperwastageBetween(Double value1, Double value2) {
            addCriterion("FPerWastage between", value1, value2, "fperwastage");
            return (Criteria) this;
        }

        public Criteria andFperwastageNotBetween(Double value1, Double value2) {
            addCriterion("FPerWastage not between", value1, value2, "fperwastage");
            return (Criteria) this;
        }

        public Criteria andFaracctidIsNull() {
            addCriterion("FARAcctID is null");
            return (Criteria) this;
        }

        public Criteria andFaracctidIsNotNull() {
            addCriterion("FARAcctID is not null");
            return (Criteria) this;
        }

        public Criteria andFaracctidEqualTo(Integer value) {
            addCriterion("FARAcctID =", value, "faracctid");
            return (Criteria) this;
        }

        public Criteria andFaracctidNotEqualTo(Integer value) {
            addCriterion("FARAcctID <>", value, "faracctid");
            return (Criteria) this;
        }

        public Criteria andFaracctidGreaterThan(Integer value) {
            addCriterion("FARAcctID >", value, "faracctid");
            return (Criteria) this;
        }

        public Criteria andFaracctidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FARAcctID >=", value, "faracctid");
            return (Criteria) this;
        }

        public Criteria andFaracctidLessThan(Integer value) {
            addCriterion("FARAcctID <", value, "faracctid");
            return (Criteria) this;
        }

        public Criteria andFaracctidLessThanOrEqualTo(Integer value) {
            addCriterion("FARAcctID <=", value, "faracctid");
            return (Criteria) this;
        }

        public Criteria andFaracctidIn(List<Integer> values) {
            addCriterion("FARAcctID in", values, "faracctid");
            return (Criteria) this;
        }

        public Criteria andFaracctidNotIn(List<Integer> values) {
            addCriterion("FARAcctID not in", values, "faracctid");
            return (Criteria) this;
        }

        public Criteria andFaracctidBetween(Integer value1, Integer value2) {
            addCriterion("FARAcctID between", value1, value2, "faracctid");
            return (Criteria) this;
        }

        public Criteria andFaracctidNotBetween(Integer value1, Integer value2) {
            addCriterion("FARAcctID not between", value1, value2, "faracctid");
            return (Criteria) this;
        }

        public Criteria andFplanpricemethodIsNull() {
            addCriterion("FPlanPriceMethod is null");
            return (Criteria) this;
        }

        public Criteria andFplanpricemethodIsNotNull() {
            addCriterion("FPlanPriceMethod is not null");
            return (Criteria) this;
        }

        public Criteria andFplanpricemethodEqualTo(Short value) {
            addCriterion("FPlanPriceMethod =", value, "fplanpricemethod");
            return (Criteria) this;
        }

        public Criteria andFplanpricemethodNotEqualTo(Short value) {
            addCriterion("FPlanPriceMethod <>", value, "fplanpricemethod");
            return (Criteria) this;
        }

        public Criteria andFplanpricemethodGreaterThan(Short value) {
            addCriterion("FPlanPriceMethod >", value, "fplanpricemethod");
            return (Criteria) this;
        }

        public Criteria andFplanpricemethodGreaterThanOrEqualTo(Short value) {
            addCriterion("FPlanPriceMethod >=", value, "fplanpricemethod");
            return (Criteria) this;
        }

        public Criteria andFplanpricemethodLessThan(Short value) {
            addCriterion("FPlanPriceMethod <", value, "fplanpricemethod");
            return (Criteria) this;
        }

        public Criteria andFplanpricemethodLessThanOrEqualTo(Short value) {
            addCriterion("FPlanPriceMethod <=", value, "fplanpricemethod");
            return (Criteria) this;
        }

        public Criteria andFplanpricemethodIn(List<Short> values) {
            addCriterion("FPlanPriceMethod in", values, "fplanpricemethod");
            return (Criteria) this;
        }

        public Criteria andFplanpricemethodNotIn(List<Short> values) {
            addCriterion("FPlanPriceMethod not in", values, "fplanpricemethod");
            return (Criteria) this;
        }

        public Criteria andFplanpricemethodBetween(Short value1, Short value2) {
            addCriterion("FPlanPriceMethod between", value1, value2, "fplanpricemethod");
            return (Criteria) this;
        }

        public Criteria andFplanpricemethodNotBetween(Short value1, Short value2) {
            addCriterion("FPlanPriceMethod not between", value1, value2, "fplanpricemethod");
            return (Criteria) this;
        }

        public Criteria andFplanclassIsNull() {
            addCriterion("FPlanClass is null");
            return (Criteria) this;
        }

        public Criteria andFplanclassIsNotNull() {
            addCriterion("FPlanClass is not null");
            return (Criteria) this;
        }

        public Criteria andFplanclassEqualTo(Short value) {
            addCriterion("FPlanClass =", value, "fplanclass");
            return (Criteria) this;
        }

        public Criteria andFplanclassNotEqualTo(Short value) {
            addCriterion("FPlanClass <>", value, "fplanclass");
            return (Criteria) this;
        }

        public Criteria andFplanclassGreaterThan(Short value) {
            addCriterion("FPlanClass >", value, "fplanclass");
            return (Criteria) this;
        }

        public Criteria andFplanclassGreaterThanOrEqualTo(Short value) {
            addCriterion("FPlanClass >=", value, "fplanclass");
            return (Criteria) this;
        }

        public Criteria andFplanclassLessThan(Short value) {
            addCriterion("FPlanClass <", value, "fplanclass");
            return (Criteria) this;
        }

        public Criteria andFplanclassLessThanOrEqualTo(Short value) {
            addCriterion("FPlanClass <=", value, "fplanclass");
            return (Criteria) this;
        }

        public Criteria andFplanclassIn(List<Short> values) {
            addCriterion("FPlanClass in", values, "fplanclass");
            return (Criteria) this;
        }

        public Criteria andFplanclassNotIn(List<Short> values) {
            addCriterion("FPlanClass not in", values, "fplanclass");
            return (Criteria) this;
        }

        public Criteria andFplanclassBetween(Short value1, Short value2) {
            addCriterion("FPlanClass between", value1, value2, "fplanclass");
            return (Criteria) this;
        }

        public Criteria andFplanclassNotBetween(Short value1, Short value2) {
            addCriterion("FPlanClass not between", value1, value2, "fplanclass");
            return (Criteria) this;
        }

        public Criteria andFpyIsNull() {
            addCriterion("FPY is null");
            return (Criteria) this;
        }

        public Criteria andFpyIsNotNull() {
            addCriterion("FPY is not null");
            return (Criteria) this;
        }

        public Criteria andFpyEqualTo(String value) {
            addCriterion("FPY =", value, "fpy");
            return (Criteria) this;
        }

        public Criteria andFpyNotEqualTo(String value) {
            addCriterion("FPY <>", value, "fpy");
            return (Criteria) this;
        }

        public Criteria andFpyGreaterThan(String value) {
            addCriterion("FPY >", value, "fpy");
            return (Criteria) this;
        }

        public Criteria andFpyGreaterThanOrEqualTo(String value) {
            addCriterion("FPY >=", value, "fpy");
            return (Criteria) this;
        }

        public Criteria andFpyLessThan(String value) {
            addCriterion("FPY <", value, "fpy");
            return (Criteria) this;
        }

        public Criteria andFpyLessThanOrEqualTo(String value) {
            addCriterion("FPY <=", value, "fpy");
            return (Criteria) this;
        }

        public Criteria andFpyLike(String value) {
            addCriterion("FPY like", value, "fpy");
            return (Criteria) this;
        }

        public Criteria andFpyNotLike(String value) {
            addCriterion("FPY not like", value, "fpy");
            return (Criteria) this;
        }

        public Criteria andFpyIn(List<String> values) {
            addCriterion("FPY in", values, "fpy");
            return (Criteria) this;
        }

        public Criteria andFpyNotIn(List<String> values) {
            addCriterion("FPY not in", values, "fpy");
            return (Criteria) this;
        }

        public Criteria andFpyBetween(String value1, String value2) {
            addCriterion("FPY between", value1, value2, "fpy");
            return (Criteria) this;
        }

        public Criteria andFpyNotBetween(String value1, String value2) {
            addCriterion("FPY not between", value1, value2, "fpy");
            return (Criteria) this;
        }

        public Criteria andFpinyinIsNull() {
            addCriterion("FPinYin is null");
            return (Criteria) this;
        }

        public Criteria andFpinyinIsNotNull() {
            addCriterion("FPinYin is not null");
            return (Criteria) this;
        }

        public Criteria andFpinyinEqualTo(String value) {
            addCriterion("FPinYin =", value, "fpinyin");
            return (Criteria) this;
        }

        public Criteria andFpinyinNotEqualTo(String value) {
            addCriterion("FPinYin <>", value, "fpinyin");
            return (Criteria) this;
        }

        public Criteria andFpinyinGreaterThan(String value) {
            addCriterion("FPinYin >", value, "fpinyin");
            return (Criteria) this;
        }

        public Criteria andFpinyinGreaterThanOrEqualTo(String value) {
            addCriterion("FPinYin >=", value, "fpinyin");
            return (Criteria) this;
        }

        public Criteria andFpinyinLessThan(String value) {
            addCriterion("FPinYin <", value, "fpinyin");
            return (Criteria) this;
        }

        public Criteria andFpinyinLessThanOrEqualTo(String value) {
            addCriterion("FPinYin <=", value, "fpinyin");
            return (Criteria) this;
        }

        public Criteria andFpinyinLike(String value) {
            addCriterion("FPinYin like", value, "fpinyin");
            return (Criteria) this;
        }

        public Criteria andFpinyinNotLike(String value) {
            addCriterion("FPinYin not like", value, "fpinyin");
            return (Criteria) this;
        }

        public Criteria andFpinyinIn(List<String> values) {
            addCriterion("FPinYin in", values, "fpinyin");
            return (Criteria) this;
        }

        public Criteria andFpinyinNotIn(List<String> values) {
            addCriterion("FPinYin not in", values, "fpinyin");
            return (Criteria) this;
        }

        public Criteria andFpinyinBetween(String value1, String value2) {
            addCriterion("FPinYin between", value1, value2, "fpinyin");
            return (Criteria) this;
        }

        public Criteria andFpinyinNotBetween(String value1, String value2) {
            addCriterion("FPinYin not between", value1, value2, "fpinyin");
            return (Criteria) this;
        }

        public Criteria andFrefcostIsNull() {
            addCriterion("FRefCost is null");
            return (Criteria) this;
        }

        public Criteria andFrefcostIsNotNull() {
            addCriterion("FRefCost is not null");
            return (Criteria) this;
        }

        public Criteria andFrefcostEqualTo(BigDecimal value) {
            addCriterion("FRefCost =", value, "frefcost");
            return (Criteria) this;
        }

        public Criteria andFrefcostNotEqualTo(BigDecimal value) {
            addCriterion("FRefCost <>", value, "frefcost");
            return (Criteria) this;
        }

        public Criteria andFrefcostGreaterThan(BigDecimal value) {
            addCriterion("FRefCost >", value, "frefcost");
            return (Criteria) this;
        }

        public Criteria andFrefcostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FRefCost >=", value, "frefcost");
            return (Criteria) this;
        }

        public Criteria andFrefcostLessThan(BigDecimal value) {
            addCriterion("FRefCost <", value, "frefcost");
            return (Criteria) this;
        }

        public Criteria andFrefcostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FRefCost <=", value, "frefcost");
            return (Criteria) this;
        }

        public Criteria andFrefcostIn(List<BigDecimal> values) {
            addCriterion("FRefCost in", values, "frefcost");
            return (Criteria) this;
        }

        public Criteria andFrefcostNotIn(List<BigDecimal> values) {
            addCriterion("FRefCost not in", values, "frefcost");
            return (Criteria) this;
        }

        public Criteria andFrefcostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FRefCost between", value1, value2, "frefcost");
            return (Criteria) this;
        }

        public Criteria andFrefcostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FRefCost not between", value1, value2, "frefcost");
            return (Criteria) this;
        }

        public Criteria andFinvnameIsNull() {
            addCriterion("FInvName is null");
            return (Criteria) this;
        }

        public Criteria andFinvnameIsNotNull() {
            addCriterion("FInvName is not null");
            return (Criteria) this;
        }

        public Criteria andFinvnameEqualTo(String value) {
            addCriterion("FInvName =", value, "finvname");
            return (Criteria) this;
        }

        public Criteria andFinvnameNotEqualTo(String value) {
            addCriterion("FInvName <>", value, "finvname");
            return (Criteria) this;
        }

        public Criteria andFinvnameGreaterThan(String value) {
            addCriterion("FInvName >", value, "finvname");
            return (Criteria) this;
        }

        public Criteria andFinvnameGreaterThanOrEqualTo(String value) {
            addCriterion("FInvName >=", value, "finvname");
            return (Criteria) this;
        }

        public Criteria andFinvnameLessThan(String value) {
            addCriterion("FInvName <", value, "finvname");
            return (Criteria) this;
        }

        public Criteria andFinvnameLessThanOrEqualTo(String value) {
            addCriterion("FInvName <=", value, "finvname");
            return (Criteria) this;
        }

        public Criteria andFinvnameLike(String value) {
            addCriterion("FInvName like", value, "finvname");
            return (Criteria) this;
        }

        public Criteria andFinvnameNotLike(String value) {
            addCriterion("FInvName not like", value, "finvname");
            return (Criteria) this;
        }

        public Criteria andFinvnameIn(List<String> values) {
            addCriterion("FInvName in", values, "finvname");
            return (Criteria) this;
        }

        public Criteria andFinvnameNotIn(List<String> values) {
            addCriterion("FInvName not in", values, "finvname");
            return (Criteria) this;
        }

        public Criteria andFinvnameBetween(String value1, String value2) {
            addCriterion("FInvName between", value1, value2, "finvname");
            return (Criteria) this;
        }

        public Criteria andFinvnameNotBetween(String value1, String value2) {
            addCriterion("FInvName not between", value1, value2, "finvname");
            return (Criteria) this;
        }

        public Criteria andFerpclsidIsNull() {
            addCriterion("FErpClsID is null");
            return (Criteria) this;
        }

        public Criteria andFerpclsidIsNotNull() {
            addCriterion("FErpClsID is not null");
            return (Criteria) this;
        }

        public Criteria andFerpclsidEqualTo(Integer value) {
            addCriterion("FErpClsID =", value, "ferpclsid");
            return (Criteria) this;
        }

        public Criteria andFerpclsidNotEqualTo(Integer value) {
            addCriterion("FErpClsID <>", value, "ferpclsid");
            return (Criteria) this;
        }

        public Criteria andFerpclsidGreaterThan(Integer value) {
            addCriterion("FErpClsID >", value, "ferpclsid");
            return (Criteria) this;
        }

        public Criteria andFerpclsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FErpClsID >=", value, "ferpclsid");
            return (Criteria) this;
        }

        public Criteria andFerpclsidLessThan(Integer value) {
            addCriterion("FErpClsID <", value, "ferpclsid");
            return (Criteria) this;
        }

        public Criteria andFerpclsidLessThanOrEqualTo(Integer value) {
            addCriterion("FErpClsID <=", value, "ferpclsid");
            return (Criteria) this;
        }

        public Criteria andFerpclsidIn(List<Integer> values) {
            addCriterion("FErpClsID in", values, "ferpclsid");
            return (Criteria) this;
        }

        public Criteria andFerpclsidNotIn(List<Integer> values) {
            addCriterion("FErpClsID not in", values, "ferpclsid");
            return (Criteria) this;
        }

        public Criteria andFerpclsidBetween(Integer value1, Integer value2) {
            addCriterion("FErpClsID between", value1, value2, "ferpclsid");
            return (Criteria) this;
        }

        public Criteria andFerpclsidNotBetween(Integer value1, Integer value2) {
            addCriterion("FErpClsID not between", value1, value2, "ferpclsid");
            return (Criteria) this;
        }

        public Criteria andFunitidIsNull() {
            addCriterion("FUnitID is null");
            return (Criteria) this;
        }

        public Criteria andFunitidIsNotNull() {
            addCriterion("FUnitID is not null");
            return (Criteria) this;
        }

        public Criteria andFunitidEqualTo(Integer value) {
            addCriterion("FUnitID =", value, "funitid");
            return (Criteria) this;
        }

        public Criteria andFunitidNotEqualTo(Integer value) {
            addCriterion("FUnitID <>", value, "funitid");
            return (Criteria) this;
        }

        public Criteria andFunitidGreaterThan(Integer value) {
            addCriterion("FUnitID >", value, "funitid");
            return (Criteria) this;
        }

        public Criteria andFunitidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FUnitID >=", value, "funitid");
            return (Criteria) this;
        }

        public Criteria andFunitidLessThan(Integer value) {
            addCriterion("FUnitID <", value, "funitid");
            return (Criteria) this;
        }

        public Criteria andFunitidLessThanOrEqualTo(Integer value) {
            addCriterion("FUnitID <=", value, "funitid");
            return (Criteria) this;
        }

        public Criteria andFunitidIn(List<Integer> values) {
            addCriterion("FUnitID in", values, "funitid");
            return (Criteria) this;
        }

        public Criteria andFunitidNotIn(List<Integer> values) {
            addCriterion("FUnitID not in", values, "funitid");
            return (Criteria) this;
        }

        public Criteria andFunitidBetween(Integer value1, Integer value2) {
            addCriterion("FUnitID between", value1, value2, "funitid");
            return (Criteria) this;
        }

        public Criteria andFunitidNotBetween(Integer value1, Integer value2) {
            addCriterion("FUnitID not between", value1, value2, "funitid");
            return (Criteria) this;
        }

        public Criteria andFunitgroupidIsNull() {
            addCriterion("FUnitGroupID is null");
            return (Criteria) this;
        }

        public Criteria andFunitgroupidIsNotNull() {
            addCriterion("FUnitGroupID is not null");
            return (Criteria) this;
        }

        public Criteria andFunitgroupidEqualTo(Integer value) {
            addCriterion("FUnitGroupID =", value, "funitgroupid");
            return (Criteria) this;
        }

        public Criteria andFunitgroupidNotEqualTo(Integer value) {
            addCriterion("FUnitGroupID <>", value, "funitgroupid");
            return (Criteria) this;
        }

        public Criteria andFunitgroupidGreaterThan(Integer value) {
            addCriterion("FUnitGroupID >", value, "funitgroupid");
            return (Criteria) this;
        }

        public Criteria andFunitgroupidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FUnitGroupID >=", value, "funitgroupid");
            return (Criteria) this;
        }

        public Criteria andFunitgroupidLessThan(Integer value) {
            addCriterion("FUnitGroupID <", value, "funitgroupid");
            return (Criteria) this;
        }

        public Criteria andFunitgroupidLessThanOrEqualTo(Integer value) {
            addCriterion("FUnitGroupID <=", value, "funitgroupid");
            return (Criteria) this;
        }

        public Criteria andFunitgroupidIn(List<Integer> values) {
            addCriterion("FUnitGroupID in", values, "funitgroupid");
            return (Criteria) this;
        }

        public Criteria andFunitgroupidNotIn(List<Integer> values) {
            addCriterion("FUnitGroupID not in", values, "funitgroupid");
            return (Criteria) this;
        }

        public Criteria andFunitgroupidBetween(Integer value1, Integer value2) {
            addCriterion("FUnitGroupID between", value1, value2, "funitgroupid");
            return (Criteria) this;
        }

        public Criteria andFunitgroupidNotBetween(Integer value1, Integer value2) {
            addCriterion("FUnitGroupID not between", value1, value2, "funitgroupid");
            return (Criteria) this;
        }

        public Criteria andFdefaultlocIsNull() {
            addCriterion("FDefaultLoc is null");
            return (Criteria) this;
        }

        public Criteria andFdefaultlocIsNotNull() {
            addCriterion("FDefaultLoc is not null");
            return (Criteria) this;
        }

        public Criteria andFdefaultlocEqualTo(Integer value) {
            addCriterion("FDefaultLoc =", value, "fdefaultloc");
            return (Criteria) this;
        }

        public Criteria andFdefaultlocNotEqualTo(Integer value) {
            addCriterion("FDefaultLoc <>", value, "fdefaultloc");
            return (Criteria) this;
        }

        public Criteria andFdefaultlocGreaterThan(Integer value) {
            addCriterion("FDefaultLoc >", value, "fdefaultloc");
            return (Criteria) this;
        }

        public Criteria andFdefaultlocGreaterThanOrEqualTo(Integer value) {
            addCriterion("FDefaultLoc >=", value, "fdefaultloc");
            return (Criteria) this;
        }

        public Criteria andFdefaultlocLessThan(Integer value) {
            addCriterion("FDefaultLoc <", value, "fdefaultloc");
            return (Criteria) this;
        }

        public Criteria andFdefaultlocLessThanOrEqualTo(Integer value) {
            addCriterion("FDefaultLoc <=", value, "fdefaultloc");
            return (Criteria) this;
        }

        public Criteria andFdefaultlocIn(List<Integer> values) {
            addCriterion("FDefaultLoc in", values, "fdefaultloc");
            return (Criteria) this;
        }

        public Criteria andFdefaultlocNotIn(List<Integer> values) {
            addCriterion("FDefaultLoc not in", values, "fdefaultloc");
            return (Criteria) this;
        }

        public Criteria andFdefaultlocBetween(Integer value1, Integer value2) {
            addCriterion("FDefaultLoc between", value1, value2, "fdefaultloc");
            return (Criteria) this;
        }

        public Criteria andFdefaultlocNotBetween(Integer value1, Integer value2) {
            addCriterion("FDefaultLoc not between", value1, value2, "fdefaultloc");
            return (Criteria) this;
        }

        public Criteria andFspidIsNull() {
            addCriterion("FSPID is null");
            return (Criteria) this;
        }

        public Criteria andFspidIsNotNull() {
            addCriterion("FSPID is not null");
            return (Criteria) this;
        }

        public Criteria andFspidEqualTo(Integer value) {
            addCriterion("FSPID =", value, "fspid");
            return (Criteria) this;
        }

        public Criteria andFspidNotEqualTo(Integer value) {
            addCriterion("FSPID <>", value, "fspid");
            return (Criteria) this;
        }

        public Criteria andFspidGreaterThan(Integer value) {
            addCriterion("FSPID >", value, "fspid");
            return (Criteria) this;
        }

        public Criteria andFspidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FSPID >=", value, "fspid");
            return (Criteria) this;
        }

        public Criteria andFspidLessThan(Integer value) {
            addCriterion("FSPID <", value, "fspid");
            return (Criteria) this;
        }

        public Criteria andFspidLessThanOrEqualTo(Integer value) {
            addCriterion("FSPID <=", value, "fspid");
            return (Criteria) this;
        }

        public Criteria andFspidIn(List<Integer> values) {
            addCriterion("FSPID in", values, "fspid");
            return (Criteria) this;
        }

        public Criteria andFspidNotIn(List<Integer> values) {
            addCriterion("FSPID not in", values, "fspid");
            return (Criteria) this;
        }

        public Criteria andFspidBetween(Integer value1, Integer value2) {
            addCriterion("FSPID between", value1, value2, "fspid");
            return (Criteria) this;
        }

        public Criteria andFspidNotBetween(Integer value1, Integer value2) {
            addCriterion("FSPID not between", value1, value2, "fspid");
            return (Criteria) this;
        }

        public Criteria andFsourceIsNull() {
            addCriterion("FSource is null");
            return (Criteria) this;
        }

        public Criteria andFsourceIsNotNull() {
            addCriterion("FSource is not null");
            return (Criteria) this;
        }

        public Criteria andFsourceEqualTo(Integer value) {
            addCriterion("FSource =", value, "fsource");
            return (Criteria) this;
        }

        public Criteria andFsourceNotEqualTo(Integer value) {
            addCriterion("FSource <>", value, "fsource");
            return (Criteria) this;
        }

        public Criteria andFsourceGreaterThan(Integer value) {
            addCriterion("FSource >", value, "fsource");
            return (Criteria) this;
        }

        public Criteria andFsourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("FSource >=", value, "fsource");
            return (Criteria) this;
        }

        public Criteria andFsourceLessThan(Integer value) {
            addCriterion("FSource <", value, "fsource");
            return (Criteria) this;
        }

        public Criteria andFsourceLessThanOrEqualTo(Integer value) {
            addCriterion("FSource <=", value, "fsource");
            return (Criteria) this;
        }

        public Criteria andFsourceIn(List<Integer> values) {
            addCriterion("FSource in", values, "fsource");
            return (Criteria) this;
        }

        public Criteria andFsourceNotIn(List<Integer> values) {
            addCriterion("FSource not in", values, "fsource");
            return (Criteria) this;
        }

        public Criteria andFsourceBetween(Integer value1, Integer value2) {
            addCriterion("FSource between", value1, value2, "fsource");
            return (Criteria) this;
        }

        public Criteria andFsourceNotBetween(Integer value1, Integer value2) {
            addCriterion("FSource not between", value1, value2, "fsource");
            return (Criteria) this;
        }

        public Criteria andFqtydecimalIsNull() {
            addCriterion("FQtyDecimal is null");
            return (Criteria) this;
        }

        public Criteria andFqtydecimalIsNotNull() {
            addCriterion("FQtyDecimal is not null");
            return (Criteria) this;
        }

        public Criteria andFqtydecimalEqualTo(Short value) {
            addCriterion("FQtyDecimal =", value, "fqtydecimal");
            return (Criteria) this;
        }

        public Criteria andFqtydecimalNotEqualTo(Short value) {
            addCriterion("FQtyDecimal <>", value, "fqtydecimal");
            return (Criteria) this;
        }

        public Criteria andFqtydecimalGreaterThan(Short value) {
            addCriterion("FQtyDecimal >", value, "fqtydecimal");
            return (Criteria) this;
        }

        public Criteria andFqtydecimalGreaterThanOrEqualTo(Short value) {
            addCriterion("FQtyDecimal >=", value, "fqtydecimal");
            return (Criteria) this;
        }

        public Criteria andFqtydecimalLessThan(Short value) {
            addCriterion("FQtyDecimal <", value, "fqtydecimal");
            return (Criteria) this;
        }

        public Criteria andFqtydecimalLessThanOrEqualTo(Short value) {
            addCriterion("FQtyDecimal <=", value, "fqtydecimal");
            return (Criteria) this;
        }

        public Criteria andFqtydecimalIn(List<Short> values) {
            addCriterion("FQtyDecimal in", values, "fqtydecimal");
            return (Criteria) this;
        }

        public Criteria andFqtydecimalNotIn(List<Short> values) {
            addCriterion("FQtyDecimal not in", values, "fqtydecimal");
            return (Criteria) this;
        }

        public Criteria andFqtydecimalBetween(Short value1, Short value2) {
            addCriterion("FQtyDecimal between", value1, value2, "fqtydecimal");
            return (Criteria) this;
        }

        public Criteria andFqtydecimalNotBetween(Short value1, Short value2) {
            addCriterion("FQtyDecimal not between", value1, value2, "fqtydecimal");
            return (Criteria) this;
        }

        public Criteria andFlowlimitIsNull() {
            addCriterion("FLowLimit is null");
            return (Criteria) this;
        }

        public Criteria andFlowlimitIsNotNull() {
            addCriterion("FLowLimit is not null");
            return (Criteria) this;
        }

        public Criteria andFlowlimitEqualTo(BigDecimal value) {
            addCriterion("FLowLimit =", value, "flowlimit");
            return (Criteria) this;
        }

        public Criteria andFlowlimitNotEqualTo(BigDecimal value) {
            addCriterion("FLowLimit <>", value, "flowlimit");
            return (Criteria) this;
        }

        public Criteria andFlowlimitGreaterThan(BigDecimal value) {
            addCriterion("FLowLimit >", value, "flowlimit");
            return (Criteria) this;
        }

        public Criteria andFlowlimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FLowLimit >=", value, "flowlimit");
            return (Criteria) this;
        }

        public Criteria andFlowlimitLessThan(BigDecimal value) {
            addCriterion("FLowLimit <", value, "flowlimit");
            return (Criteria) this;
        }

        public Criteria andFlowlimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FLowLimit <=", value, "flowlimit");
            return (Criteria) this;
        }

        public Criteria andFlowlimitIn(List<BigDecimal> values) {
            addCriterion("FLowLimit in", values, "flowlimit");
            return (Criteria) this;
        }

        public Criteria andFlowlimitNotIn(List<BigDecimal> values) {
            addCriterion("FLowLimit not in", values, "flowlimit");
            return (Criteria) this;
        }

        public Criteria andFlowlimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FLowLimit between", value1, value2, "flowlimit");
            return (Criteria) this;
        }

        public Criteria andFlowlimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FLowLimit not between", value1, value2, "flowlimit");
            return (Criteria) this;
        }

        public Criteria andFhighlimitIsNull() {
            addCriterion("FHighLimit is null");
            return (Criteria) this;
        }

        public Criteria andFhighlimitIsNotNull() {
            addCriterion("FHighLimit is not null");
            return (Criteria) this;
        }

        public Criteria andFhighlimitEqualTo(BigDecimal value) {
            addCriterion("FHighLimit =", value, "fhighlimit");
            return (Criteria) this;
        }

        public Criteria andFhighlimitNotEqualTo(BigDecimal value) {
            addCriterion("FHighLimit <>", value, "fhighlimit");
            return (Criteria) this;
        }

        public Criteria andFhighlimitGreaterThan(BigDecimal value) {
            addCriterion("FHighLimit >", value, "fhighlimit");
            return (Criteria) this;
        }

        public Criteria andFhighlimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FHighLimit >=", value, "fhighlimit");
            return (Criteria) this;
        }

        public Criteria andFhighlimitLessThan(BigDecimal value) {
            addCriterion("FHighLimit <", value, "fhighlimit");
            return (Criteria) this;
        }

        public Criteria andFhighlimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FHighLimit <=", value, "fhighlimit");
            return (Criteria) this;
        }

        public Criteria andFhighlimitIn(List<BigDecimal> values) {
            addCriterion("FHighLimit in", values, "fhighlimit");
            return (Criteria) this;
        }

        public Criteria andFhighlimitNotIn(List<BigDecimal> values) {
            addCriterion("FHighLimit not in", values, "fhighlimit");
            return (Criteria) this;
        }

        public Criteria andFhighlimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FHighLimit between", value1, value2, "fhighlimit");
            return (Criteria) this;
        }

        public Criteria andFhighlimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FHighLimit not between", value1, value2, "fhighlimit");
            return (Criteria) this;
        }

        public Criteria andFsecinvIsNull() {
            addCriterion("FSecInv is null");
            return (Criteria) this;
        }

        public Criteria andFsecinvIsNotNull() {
            addCriterion("FSecInv is not null");
            return (Criteria) this;
        }

        public Criteria andFsecinvEqualTo(BigDecimal value) {
            addCriterion("FSecInv =", value, "fsecinv");
            return (Criteria) this;
        }

        public Criteria andFsecinvNotEqualTo(BigDecimal value) {
            addCriterion("FSecInv <>", value, "fsecinv");
            return (Criteria) this;
        }

        public Criteria andFsecinvGreaterThan(BigDecimal value) {
            addCriterion("FSecInv >", value, "fsecinv");
            return (Criteria) this;
        }

        public Criteria andFsecinvGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FSecInv >=", value, "fsecinv");
            return (Criteria) this;
        }

        public Criteria andFsecinvLessThan(BigDecimal value) {
            addCriterion("FSecInv <", value, "fsecinv");
            return (Criteria) this;
        }

        public Criteria andFsecinvLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FSecInv <=", value, "fsecinv");
            return (Criteria) this;
        }

        public Criteria andFsecinvIn(List<BigDecimal> values) {
            addCriterion("FSecInv in", values, "fsecinv");
            return (Criteria) this;
        }

        public Criteria andFsecinvNotIn(List<BigDecimal> values) {
            addCriterion("FSecInv not in", values, "fsecinv");
            return (Criteria) this;
        }

        public Criteria andFsecinvBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FSecInv between", value1, value2, "fsecinv");
            return (Criteria) this;
        }

        public Criteria andFsecinvNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FSecInv not between", value1, value2, "fsecinv");
            return (Criteria) this;
        }

        public Criteria andFusestateIsNull() {
            addCriterion("FUseState is null");
            return (Criteria) this;
        }

        public Criteria andFusestateIsNotNull() {
            addCriterion("FUseState is not null");
            return (Criteria) this;
        }

        public Criteria andFusestateEqualTo(Integer value) {
            addCriterion("FUseState =", value, "fusestate");
            return (Criteria) this;
        }

        public Criteria andFusestateNotEqualTo(Integer value) {
            addCriterion("FUseState <>", value, "fusestate");
            return (Criteria) this;
        }

        public Criteria andFusestateGreaterThan(Integer value) {
            addCriterion("FUseState >", value, "fusestate");
            return (Criteria) this;
        }

        public Criteria andFusestateGreaterThanOrEqualTo(Integer value) {
            addCriterion("FUseState >=", value, "fusestate");
            return (Criteria) this;
        }

        public Criteria andFusestateLessThan(Integer value) {
            addCriterion("FUseState <", value, "fusestate");
            return (Criteria) this;
        }

        public Criteria andFusestateLessThanOrEqualTo(Integer value) {
            addCriterion("FUseState <=", value, "fusestate");
            return (Criteria) this;
        }

        public Criteria andFusestateIn(List<Integer> values) {
            addCriterion("FUseState in", values, "fusestate");
            return (Criteria) this;
        }

        public Criteria andFusestateNotIn(List<Integer> values) {
            addCriterion("FUseState not in", values, "fusestate");
            return (Criteria) this;
        }

        public Criteria andFusestateBetween(Integer value1, Integer value2) {
            addCriterion("FUseState between", value1, value2, "fusestate");
            return (Criteria) this;
        }

        public Criteria andFusestateNotBetween(Integer value1, Integer value2) {
            addCriterion("FUseState not between", value1, value2, "fusestate");
            return (Criteria) this;
        }

        public Criteria andFisequipmentIsNull() {
            addCriterion("FIsEquipment is null");
            return (Criteria) this;
        }

        public Criteria andFisequipmentIsNotNull() {
            addCriterion("FIsEquipment is not null");
            return (Criteria) this;
        }

        public Criteria andFisequipmentEqualTo(Boolean value) {
            addCriterion("FIsEquipment =", value, "fisequipment");
            return (Criteria) this;
        }

        public Criteria andFisequipmentNotEqualTo(Boolean value) {
            addCriterion("FIsEquipment <>", value, "fisequipment");
            return (Criteria) this;
        }

        public Criteria andFisequipmentGreaterThan(Boolean value) {
            addCriterion("FIsEquipment >", value, "fisequipment");
            return (Criteria) this;
        }

        public Criteria andFisequipmentGreaterThanOrEqualTo(Boolean value) {
            addCriterion("FIsEquipment >=", value, "fisequipment");
            return (Criteria) this;
        }

        public Criteria andFisequipmentLessThan(Boolean value) {
            addCriterion("FIsEquipment <", value, "fisequipment");
            return (Criteria) this;
        }

        public Criteria andFisequipmentLessThanOrEqualTo(Boolean value) {
            addCriterion("FIsEquipment <=", value, "fisequipment");
            return (Criteria) this;
        }

        public Criteria andFisequipmentIn(List<Boolean> values) {
            addCriterion("FIsEquipment in", values, "fisequipment");
            return (Criteria) this;
        }

        public Criteria andFisequipmentNotIn(List<Boolean> values) {
            addCriterion("FIsEquipment not in", values, "fisequipment");
            return (Criteria) this;
        }

        public Criteria andFisequipmentBetween(Boolean value1, Boolean value2) {
            addCriterion("FIsEquipment between", value1, value2, "fisequipment");
            return (Criteria) this;
        }

        public Criteria andFisequipmentNotBetween(Boolean value1, Boolean value2) {
            addCriterion("FIsEquipment not between", value1, value2, "fisequipment");
            return (Criteria) this;
        }

        public Criteria andFequipmentnumIsNull() {
            addCriterion("FEquipmentNum is null");
            return (Criteria) this;
        }

        public Criteria andFequipmentnumIsNotNull() {
            addCriterion("FEquipmentNum is not null");
            return (Criteria) this;
        }

        public Criteria andFequipmentnumEqualTo(String value) {
            addCriterion("FEquipmentNum =", value, "fequipmentnum");
            return (Criteria) this;
        }

        public Criteria andFequipmentnumNotEqualTo(String value) {
            addCriterion("FEquipmentNum <>", value, "fequipmentnum");
            return (Criteria) this;
        }

        public Criteria andFequipmentnumGreaterThan(String value) {
            addCriterion("FEquipmentNum >", value, "fequipmentnum");
            return (Criteria) this;
        }

        public Criteria andFequipmentnumGreaterThanOrEqualTo(String value) {
            addCriterion("FEquipmentNum >=", value, "fequipmentnum");
            return (Criteria) this;
        }

        public Criteria andFequipmentnumLessThan(String value) {
            addCriterion("FEquipmentNum <", value, "fequipmentnum");
            return (Criteria) this;
        }

        public Criteria andFequipmentnumLessThanOrEqualTo(String value) {
            addCriterion("FEquipmentNum <=", value, "fequipmentnum");
            return (Criteria) this;
        }

        public Criteria andFequipmentnumLike(String value) {
            addCriterion("FEquipmentNum like", value, "fequipmentnum");
            return (Criteria) this;
        }

        public Criteria andFequipmentnumNotLike(String value) {
            addCriterion("FEquipmentNum not like", value, "fequipmentnum");
            return (Criteria) this;
        }

        public Criteria andFequipmentnumIn(List<String> values) {
            addCriterion("FEquipmentNum in", values, "fequipmentnum");
            return (Criteria) this;
        }

        public Criteria andFequipmentnumNotIn(List<String> values) {
            addCriterion("FEquipmentNum not in", values, "fequipmentnum");
            return (Criteria) this;
        }

        public Criteria andFequipmentnumBetween(String value1, String value2) {
            addCriterion("FEquipmentNum between", value1, value2, "fequipmentnum");
            return (Criteria) this;
        }

        public Criteria andFequipmentnumNotBetween(String value1, String value2) {
            addCriterion("FEquipmentNum not between", value1, value2, "fequipmentnum");
            return (Criteria) this;
        }

        public Criteria andFissparepartIsNull() {
            addCriterion("FIsSparePart is null");
            return (Criteria) this;
        }

        public Criteria andFissparepartIsNotNull() {
            addCriterion("FIsSparePart is not null");
            return (Criteria) this;
        }

        public Criteria andFissparepartEqualTo(Boolean value) {
            addCriterion("FIsSparePart =", value, "fissparepart");
            return (Criteria) this;
        }

        public Criteria andFissparepartNotEqualTo(Boolean value) {
            addCriterion("FIsSparePart <>", value, "fissparepart");
            return (Criteria) this;
        }

        public Criteria andFissparepartGreaterThan(Boolean value) {
            addCriterion("FIsSparePart >", value, "fissparepart");
            return (Criteria) this;
        }

        public Criteria andFissparepartGreaterThanOrEqualTo(Boolean value) {
            addCriterion("FIsSparePart >=", value, "fissparepart");
            return (Criteria) this;
        }

        public Criteria andFissparepartLessThan(Boolean value) {
            addCriterion("FIsSparePart <", value, "fissparepart");
            return (Criteria) this;
        }

        public Criteria andFissparepartLessThanOrEqualTo(Boolean value) {
            addCriterion("FIsSparePart <=", value, "fissparepart");
            return (Criteria) this;
        }

        public Criteria andFissparepartIn(List<Boolean> values) {
            addCriterion("FIsSparePart in", values, "fissparepart");
            return (Criteria) this;
        }

        public Criteria andFissparepartNotIn(List<Boolean> values) {
            addCriterion("FIsSparePart not in", values, "fissparepart");
            return (Criteria) this;
        }

        public Criteria andFissparepartBetween(Boolean value1, Boolean value2) {
            addCriterion("FIsSparePart between", value1, value2, "fissparepart");
            return (Criteria) this;
        }

        public Criteria andFissparepartNotBetween(Boolean value1, Boolean value2) {
            addCriterion("FIsSparePart not between", value1, value2, "fissparepart");
            return (Criteria) this;
        }

        public Criteria andFfullnameIsNull() {
            addCriterion("FFullName is null");
            return (Criteria) this;
        }

        public Criteria andFfullnameIsNotNull() {
            addCriterion("FFullName is not null");
            return (Criteria) this;
        }

        public Criteria andFfullnameEqualTo(String value) {
            addCriterion("FFullName =", value, "ffullname");
            return (Criteria) this;
        }

        public Criteria andFfullnameNotEqualTo(String value) {
            addCriterion("FFullName <>", value, "ffullname");
            return (Criteria) this;
        }

        public Criteria andFfullnameGreaterThan(String value) {
            addCriterion("FFullName >", value, "ffullname");
            return (Criteria) this;
        }

        public Criteria andFfullnameGreaterThanOrEqualTo(String value) {
            addCriterion("FFullName >=", value, "ffullname");
            return (Criteria) this;
        }

        public Criteria andFfullnameLessThan(String value) {
            addCriterion("FFullName <", value, "ffullname");
            return (Criteria) this;
        }

        public Criteria andFfullnameLessThanOrEqualTo(String value) {
            addCriterion("FFullName <=", value, "ffullname");
            return (Criteria) this;
        }

        public Criteria andFfullnameLike(String value) {
            addCriterion("FFullName like", value, "ffullname");
            return (Criteria) this;
        }

        public Criteria andFfullnameNotLike(String value) {
            addCriterion("FFullName not like", value, "ffullname");
            return (Criteria) this;
        }

        public Criteria andFfullnameIn(List<String> values) {
            addCriterion("FFullName in", values, "ffullname");
            return (Criteria) this;
        }

        public Criteria andFfullnameNotIn(List<String> values) {
            addCriterion("FFullName not in", values, "ffullname");
            return (Criteria) this;
        }

        public Criteria andFfullnameBetween(String value1, String value2) {
            addCriterion("FFullName between", value1, value2, "ffullname");
            return (Criteria) this;
        }

        public Criteria andFfullnameNotBetween(String value1, String value2) {
            addCriterion("FFullName not between", value1, value2, "ffullname");
            return (Criteria) this;
        }

        public Criteria andFsecunitidIsNull() {
            addCriterion("FSecUnitID is null");
            return (Criteria) this;
        }

        public Criteria andFsecunitidIsNotNull() {
            addCriterion("FSecUnitID is not null");
            return (Criteria) this;
        }

        public Criteria andFsecunitidEqualTo(Integer value) {
            addCriterion("FSecUnitID =", value, "fsecunitid");
            return (Criteria) this;
        }

        public Criteria andFsecunitidNotEqualTo(Integer value) {
            addCriterion("FSecUnitID <>", value, "fsecunitid");
            return (Criteria) this;
        }

        public Criteria andFsecunitidGreaterThan(Integer value) {
            addCriterion("FSecUnitID >", value, "fsecunitid");
            return (Criteria) this;
        }

        public Criteria andFsecunitidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FSecUnitID >=", value, "fsecunitid");
            return (Criteria) this;
        }

        public Criteria andFsecunitidLessThan(Integer value) {
            addCriterion("FSecUnitID <", value, "fsecunitid");
            return (Criteria) this;
        }

        public Criteria andFsecunitidLessThanOrEqualTo(Integer value) {
            addCriterion("FSecUnitID <=", value, "fsecunitid");
            return (Criteria) this;
        }

        public Criteria andFsecunitidIn(List<Integer> values) {
            addCriterion("FSecUnitID in", values, "fsecunitid");
            return (Criteria) this;
        }

        public Criteria andFsecunitidNotIn(List<Integer> values) {
            addCriterion("FSecUnitID not in", values, "fsecunitid");
            return (Criteria) this;
        }

        public Criteria andFsecunitidBetween(Integer value1, Integer value2) {
            addCriterion("FSecUnitID between", value1, value2, "fsecunitid");
            return (Criteria) this;
        }

        public Criteria andFsecunitidNotBetween(Integer value1, Integer value2) {
            addCriterion("FSecUnitID not between", value1, value2, "fsecunitid");
            return (Criteria) this;
        }

        public Criteria andFseccoefficientIsNull() {
            addCriterion("FSecCoefficient is null");
            return (Criteria) this;
        }

        public Criteria andFseccoefficientIsNotNull() {
            addCriterion("FSecCoefficient is not null");
            return (Criteria) this;
        }

        public Criteria andFseccoefficientEqualTo(BigDecimal value) {
            addCriterion("FSecCoefficient =", value, "fseccoefficient");
            return (Criteria) this;
        }

        public Criteria andFseccoefficientNotEqualTo(BigDecimal value) {
            addCriterion("FSecCoefficient <>", value, "fseccoefficient");
            return (Criteria) this;
        }

        public Criteria andFseccoefficientGreaterThan(BigDecimal value) {
            addCriterion("FSecCoefficient >", value, "fseccoefficient");
            return (Criteria) this;
        }

        public Criteria andFseccoefficientGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FSecCoefficient >=", value, "fseccoefficient");
            return (Criteria) this;
        }

        public Criteria andFseccoefficientLessThan(BigDecimal value) {
            addCriterion("FSecCoefficient <", value, "fseccoefficient");
            return (Criteria) this;
        }

        public Criteria andFseccoefficientLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FSecCoefficient <=", value, "fseccoefficient");
            return (Criteria) this;
        }

        public Criteria andFseccoefficientIn(List<BigDecimal> values) {
            addCriterion("FSecCoefficient in", values, "fseccoefficient");
            return (Criteria) this;
        }

        public Criteria andFseccoefficientNotIn(List<BigDecimal> values) {
            addCriterion("FSecCoefficient not in", values, "fseccoefficient");
            return (Criteria) this;
        }

        public Criteria andFseccoefficientBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FSecCoefficient between", value1, value2, "fseccoefficient");
            return (Criteria) this;
        }

        public Criteria andFseccoefficientNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FSecCoefficient not between", value1, value2, "fseccoefficient");
            return (Criteria) this;
        }

        public Criteria andFsecunitdecimalIsNull() {
            addCriterion("FSecUnitDecimal is null");
            return (Criteria) this;
        }

        public Criteria andFsecunitdecimalIsNotNull() {
            addCriterion("FSecUnitDecimal is not null");
            return (Criteria) this;
        }

        public Criteria andFsecunitdecimalEqualTo(Integer value) {
            addCriterion("FSecUnitDecimal =", value, "fsecunitdecimal");
            return (Criteria) this;
        }

        public Criteria andFsecunitdecimalNotEqualTo(Integer value) {
            addCriterion("FSecUnitDecimal <>", value, "fsecunitdecimal");
            return (Criteria) this;
        }

        public Criteria andFsecunitdecimalGreaterThan(Integer value) {
            addCriterion("FSecUnitDecimal >", value, "fsecunitdecimal");
            return (Criteria) this;
        }

        public Criteria andFsecunitdecimalGreaterThanOrEqualTo(Integer value) {
            addCriterion("FSecUnitDecimal >=", value, "fsecunitdecimal");
            return (Criteria) this;
        }

        public Criteria andFsecunitdecimalLessThan(Integer value) {
            addCriterion("FSecUnitDecimal <", value, "fsecunitdecimal");
            return (Criteria) this;
        }

        public Criteria andFsecunitdecimalLessThanOrEqualTo(Integer value) {
            addCriterion("FSecUnitDecimal <=", value, "fsecunitdecimal");
            return (Criteria) this;
        }

        public Criteria andFsecunitdecimalIn(List<Integer> values) {
            addCriterion("FSecUnitDecimal in", values, "fsecunitdecimal");
            return (Criteria) this;
        }

        public Criteria andFsecunitdecimalNotIn(List<Integer> values) {
            addCriterion("FSecUnitDecimal not in", values, "fsecunitdecimal");
            return (Criteria) this;
        }

        public Criteria andFsecunitdecimalBetween(Integer value1, Integer value2) {
            addCriterion("FSecUnitDecimal between", value1, value2, "fsecunitdecimal");
            return (Criteria) this;
        }

        public Criteria andFsecunitdecimalNotBetween(Integer value1, Integer value2) {
            addCriterion("FSecUnitDecimal not between", value1, value2, "fsecunitdecimal");
            return (Criteria) this;
        }

        public Criteria andFaliasIsNull() {
            addCriterion("FAlias is null");
            return (Criteria) this;
        }

        public Criteria andFaliasIsNotNull() {
            addCriterion("FAlias is not null");
            return (Criteria) this;
        }

        public Criteria andFaliasEqualTo(String value) {
            addCriterion("FAlias =", value, "falias");
            return (Criteria) this;
        }

        public Criteria andFaliasNotEqualTo(String value) {
            addCriterion("FAlias <>", value, "falias");
            return (Criteria) this;
        }

        public Criteria andFaliasGreaterThan(String value) {
            addCriterion("FAlias >", value, "falias");
            return (Criteria) this;
        }

        public Criteria andFaliasGreaterThanOrEqualTo(String value) {
            addCriterion("FAlias >=", value, "falias");
            return (Criteria) this;
        }

        public Criteria andFaliasLessThan(String value) {
            addCriterion("FAlias <", value, "falias");
            return (Criteria) this;
        }

        public Criteria andFaliasLessThanOrEqualTo(String value) {
            addCriterion("FAlias <=", value, "falias");
            return (Criteria) this;
        }

        public Criteria andFaliasLike(String value) {
            addCriterion("FAlias like", value, "falias");
            return (Criteria) this;
        }

        public Criteria andFaliasNotLike(String value) {
            addCriterion("FAlias not like", value, "falias");
            return (Criteria) this;
        }

        public Criteria andFaliasIn(List<String> values) {
            addCriterion("FAlias in", values, "falias");
            return (Criteria) this;
        }

        public Criteria andFaliasNotIn(List<String> values) {
            addCriterion("FAlias not in", values, "falias");
            return (Criteria) this;
        }

        public Criteria andFaliasBetween(String value1, String value2) {
            addCriterion("FAlias between", value1, value2, "falias");
            return (Criteria) this;
        }

        public Criteria andFaliasNotBetween(String value1, String value2) {
            addCriterion("FAlias not between", value1, value2, "falias");
            return (Criteria) this;
        }

        public Criteria andForderunitidIsNull() {
            addCriterion("FOrderUnitID is null");
            return (Criteria) this;
        }

        public Criteria andForderunitidIsNotNull() {
            addCriterion("FOrderUnitID is not null");
            return (Criteria) this;
        }

        public Criteria andForderunitidEqualTo(Integer value) {
            addCriterion("FOrderUnitID =", value, "forderunitid");
            return (Criteria) this;
        }

        public Criteria andForderunitidNotEqualTo(Integer value) {
            addCriterion("FOrderUnitID <>", value, "forderunitid");
            return (Criteria) this;
        }

        public Criteria andForderunitidGreaterThan(Integer value) {
            addCriterion("FOrderUnitID >", value, "forderunitid");
            return (Criteria) this;
        }

        public Criteria andForderunitidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FOrderUnitID >=", value, "forderunitid");
            return (Criteria) this;
        }

        public Criteria andForderunitidLessThan(Integer value) {
            addCriterion("FOrderUnitID <", value, "forderunitid");
            return (Criteria) this;
        }

        public Criteria andForderunitidLessThanOrEqualTo(Integer value) {
            addCriterion("FOrderUnitID <=", value, "forderunitid");
            return (Criteria) this;
        }

        public Criteria andForderunitidIn(List<Integer> values) {
            addCriterion("FOrderUnitID in", values, "forderunitid");
            return (Criteria) this;
        }

        public Criteria andForderunitidNotIn(List<Integer> values) {
            addCriterion("FOrderUnitID not in", values, "forderunitid");
            return (Criteria) this;
        }

        public Criteria andForderunitidBetween(Integer value1, Integer value2) {
            addCriterion("FOrderUnitID between", value1, value2, "forderunitid");
            return (Criteria) this;
        }

        public Criteria andForderunitidNotBetween(Integer value1, Integer value2) {
            addCriterion("FOrderUnitID not between", value1, value2, "forderunitid");
            return (Criteria) this;
        }

        public Criteria andFsaleunitidIsNull() {
            addCriterion("FSaleUnitID is null");
            return (Criteria) this;
        }

        public Criteria andFsaleunitidIsNotNull() {
            addCriterion("FSaleUnitID is not null");
            return (Criteria) this;
        }

        public Criteria andFsaleunitidEqualTo(Integer value) {
            addCriterion("FSaleUnitID =", value, "fsaleunitid");
            return (Criteria) this;
        }

        public Criteria andFsaleunitidNotEqualTo(Integer value) {
            addCriterion("FSaleUnitID <>", value, "fsaleunitid");
            return (Criteria) this;
        }

        public Criteria andFsaleunitidGreaterThan(Integer value) {
            addCriterion("FSaleUnitID >", value, "fsaleunitid");
            return (Criteria) this;
        }

        public Criteria andFsaleunitidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FSaleUnitID >=", value, "fsaleunitid");
            return (Criteria) this;
        }

        public Criteria andFsaleunitidLessThan(Integer value) {
            addCriterion("FSaleUnitID <", value, "fsaleunitid");
            return (Criteria) this;
        }

        public Criteria andFsaleunitidLessThanOrEqualTo(Integer value) {
            addCriterion("FSaleUnitID <=", value, "fsaleunitid");
            return (Criteria) this;
        }

        public Criteria andFsaleunitidIn(List<Integer> values) {
            addCriterion("FSaleUnitID in", values, "fsaleunitid");
            return (Criteria) this;
        }

        public Criteria andFsaleunitidNotIn(List<Integer> values) {
            addCriterion("FSaleUnitID not in", values, "fsaleunitid");
            return (Criteria) this;
        }

        public Criteria andFsaleunitidBetween(Integer value1, Integer value2) {
            addCriterion("FSaleUnitID between", value1, value2, "fsaleunitid");
            return (Criteria) this;
        }

        public Criteria andFsaleunitidNotBetween(Integer value1, Integer value2) {
            addCriterion("FSaleUnitID not between", value1, value2, "fsaleunitid");
            return (Criteria) this;
        }

        public Criteria andFstoreunitidIsNull() {
            addCriterion("FStoreUnitID is null");
            return (Criteria) this;
        }

        public Criteria andFstoreunitidIsNotNull() {
            addCriterion("FStoreUnitID is not null");
            return (Criteria) this;
        }

        public Criteria andFstoreunitidEqualTo(Integer value) {
            addCriterion("FStoreUnitID =", value, "fstoreunitid");
            return (Criteria) this;
        }

        public Criteria andFstoreunitidNotEqualTo(Integer value) {
            addCriterion("FStoreUnitID <>", value, "fstoreunitid");
            return (Criteria) this;
        }

        public Criteria andFstoreunitidGreaterThan(Integer value) {
            addCriterion("FStoreUnitID >", value, "fstoreunitid");
            return (Criteria) this;
        }

        public Criteria andFstoreunitidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FStoreUnitID >=", value, "fstoreunitid");
            return (Criteria) this;
        }

        public Criteria andFstoreunitidLessThan(Integer value) {
            addCriterion("FStoreUnitID <", value, "fstoreunitid");
            return (Criteria) this;
        }

        public Criteria andFstoreunitidLessThanOrEqualTo(Integer value) {
            addCriterion("FStoreUnitID <=", value, "fstoreunitid");
            return (Criteria) this;
        }

        public Criteria andFstoreunitidIn(List<Integer> values) {
            addCriterion("FStoreUnitID in", values, "fstoreunitid");
            return (Criteria) this;
        }

        public Criteria andFstoreunitidNotIn(List<Integer> values) {
            addCriterion("FStoreUnitID not in", values, "fstoreunitid");
            return (Criteria) this;
        }

        public Criteria andFstoreunitidBetween(Integer value1, Integer value2) {
            addCriterion("FStoreUnitID between", value1, value2, "fstoreunitid");
            return (Criteria) this;
        }

        public Criteria andFstoreunitidNotBetween(Integer value1, Integer value2) {
            addCriterion("FStoreUnitID not between", value1, value2, "fstoreunitid");
            return (Criteria) this;
        }

        public Criteria andFproductunitidIsNull() {
            addCriterion("FProductUnitID is null");
            return (Criteria) this;
        }

        public Criteria andFproductunitidIsNotNull() {
            addCriterion("FProductUnitID is not null");
            return (Criteria) this;
        }

        public Criteria andFproductunitidEqualTo(Integer value) {
            addCriterion("FProductUnitID =", value, "fproductunitid");
            return (Criteria) this;
        }

        public Criteria andFproductunitidNotEqualTo(Integer value) {
            addCriterion("FProductUnitID <>", value, "fproductunitid");
            return (Criteria) this;
        }

        public Criteria andFproductunitidGreaterThan(Integer value) {
            addCriterion("FProductUnitID >", value, "fproductunitid");
            return (Criteria) this;
        }

        public Criteria andFproductunitidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FProductUnitID >=", value, "fproductunitid");
            return (Criteria) this;
        }

        public Criteria andFproductunitidLessThan(Integer value) {
            addCriterion("FProductUnitID <", value, "fproductunitid");
            return (Criteria) this;
        }

        public Criteria andFproductunitidLessThanOrEqualTo(Integer value) {
            addCriterion("FProductUnitID <=", value, "fproductunitid");
            return (Criteria) this;
        }

        public Criteria andFproductunitidIn(List<Integer> values) {
            addCriterion("FProductUnitID in", values, "fproductunitid");
            return (Criteria) this;
        }

        public Criteria andFproductunitidNotIn(List<Integer> values) {
            addCriterion("FProductUnitID not in", values, "fproductunitid");
            return (Criteria) this;
        }

        public Criteria andFproductunitidBetween(Integer value1, Integer value2) {
            addCriterion("FProductUnitID between", value1, value2, "fproductunitid");
            return (Criteria) this;
        }

        public Criteria andFproductunitidNotBetween(Integer value1, Integer value2) {
            addCriterion("FProductUnitID not between", value1, value2, "fproductunitid");
            return (Criteria) this;
        }

        public Criteria andFapprovenoIsNull() {
            addCriterion("FApproveNo is null");
            return (Criteria) this;
        }

        public Criteria andFapprovenoIsNotNull() {
            addCriterion("FApproveNo is not null");
            return (Criteria) this;
        }

        public Criteria andFapprovenoEqualTo(String value) {
            addCriterion("FApproveNo =", value, "fapproveno");
            return (Criteria) this;
        }

        public Criteria andFapprovenoNotEqualTo(String value) {
            addCriterion("FApproveNo <>", value, "fapproveno");
            return (Criteria) this;
        }

        public Criteria andFapprovenoGreaterThan(String value) {
            addCriterion("FApproveNo >", value, "fapproveno");
            return (Criteria) this;
        }

        public Criteria andFapprovenoGreaterThanOrEqualTo(String value) {
            addCriterion("FApproveNo >=", value, "fapproveno");
            return (Criteria) this;
        }

        public Criteria andFapprovenoLessThan(String value) {
            addCriterion("FApproveNo <", value, "fapproveno");
            return (Criteria) this;
        }

        public Criteria andFapprovenoLessThanOrEqualTo(String value) {
            addCriterion("FApproveNo <=", value, "fapproveno");
            return (Criteria) this;
        }

        public Criteria andFapprovenoLike(String value) {
            addCriterion("FApproveNo like", value, "fapproveno");
            return (Criteria) this;
        }

        public Criteria andFapprovenoNotLike(String value) {
            addCriterion("FApproveNo not like", value, "fapproveno");
            return (Criteria) this;
        }

        public Criteria andFapprovenoIn(List<String> values) {
            addCriterion("FApproveNo in", values, "fapproveno");
            return (Criteria) this;
        }

        public Criteria andFapprovenoNotIn(List<String> values) {
            addCriterion("FApproveNo not in", values, "fapproveno");
            return (Criteria) this;
        }

        public Criteria andFapprovenoBetween(String value1, String value2) {
            addCriterion("FApproveNo between", value1, value2, "fapproveno");
            return (Criteria) this;
        }

        public Criteria andFapprovenoNotBetween(String value1, String value2) {
            addCriterion("FApproveNo not between", value1, value2, "fapproveno");
            return (Criteria) this;
        }

        public Criteria andFauxclassidIsNull() {
            addCriterion("FAuxClassID is null");
            return (Criteria) this;
        }

        public Criteria andFauxclassidIsNotNull() {
            addCriterion("FAuxClassID is not null");
            return (Criteria) this;
        }

        public Criteria andFauxclassidEqualTo(Integer value) {
            addCriterion("FAuxClassID =", value, "fauxclassid");
            return (Criteria) this;
        }

        public Criteria andFauxclassidNotEqualTo(Integer value) {
            addCriterion("FAuxClassID <>", value, "fauxclassid");
            return (Criteria) this;
        }

        public Criteria andFauxclassidGreaterThan(Integer value) {
            addCriterion("FAuxClassID >", value, "fauxclassid");
            return (Criteria) this;
        }

        public Criteria andFauxclassidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FAuxClassID >=", value, "fauxclassid");
            return (Criteria) this;
        }

        public Criteria andFauxclassidLessThan(Integer value) {
            addCriterion("FAuxClassID <", value, "fauxclassid");
            return (Criteria) this;
        }

        public Criteria andFauxclassidLessThanOrEqualTo(Integer value) {
            addCriterion("FAuxClassID <=", value, "fauxclassid");
            return (Criteria) this;
        }

        public Criteria andFauxclassidIn(List<Integer> values) {
            addCriterion("FAuxClassID in", values, "fauxclassid");
            return (Criteria) this;
        }

        public Criteria andFauxclassidNotIn(List<Integer> values) {
            addCriterion("FAuxClassID not in", values, "fauxclassid");
            return (Criteria) this;
        }

        public Criteria andFauxclassidBetween(Integer value1, Integer value2) {
            addCriterion("FAuxClassID between", value1, value2, "fauxclassid");
            return (Criteria) this;
        }

        public Criteria andFauxclassidNotBetween(Integer value1, Integer value2) {
            addCriterion("FAuxClassID not between", value1, value2, "fauxclassid");
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

        public Criteria andFpredeadlineIsNull() {
            addCriterion("FPreDeadLine is null");
            return (Criteria) this;
        }

        public Criteria andFpredeadlineIsNotNull() {
            addCriterion("FPreDeadLine is not null");
            return (Criteria) this;
        }

        public Criteria andFpredeadlineEqualTo(Integer value) {
            addCriterion("FPreDeadLine =", value, "fpredeadline");
            return (Criteria) this;
        }

        public Criteria andFpredeadlineNotEqualTo(Integer value) {
            addCriterion("FPreDeadLine <>", value, "fpredeadline");
            return (Criteria) this;
        }

        public Criteria andFpredeadlineGreaterThan(Integer value) {
            addCriterion("FPreDeadLine >", value, "fpredeadline");
            return (Criteria) this;
        }

        public Criteria andFpredeadlineGreaterThanOrEqualTo(Integer value) {
            addCriterion("FPreDeadLine >=", value, "fpredeadline");
            return (Criteria) this;
        }

        public Criteria andFpredeadlineLessThan(Integer value) {
            addCriterion("FPreDeadLine <", value, "fpredeadline");
            return (Criteria) this;
        }

        public Criteria andFpredeadlineLessThanOrEqualTo(Integer value) {
            addCriterion("FPreDeadLine <=", value, "fpredeadline");
            return (Criteria) this;
        }

        public Criteria andFpredeadlineIn(List<Integer> values) {
            addCriterion("FPreDeadLine in", values, "fpredeadline");
            return (Criteria) this;
        }

        public Criteria andFpredeadlineNotIn(List<Integer> values) {
            addCriterion("FPreDeadLine not in", values, "fpredeadline");
            return (Criteria) this;
        }

        public Criteria andFpredeadlineBetween(Integer value1, Integer value2) {
            addCriterion("FPreDeadLine between", value1, value2, "fpredeadline");
            return (Criteria) this;
        }

        public Criteria andFpredeadlineNotBetween(Integer value1, Integer value2) {
            addCriterion("FPreDeadLine not between", value1, value2, "fpredeadline");
            return (Criteria) this;
        }

        public Criteria andFserialclassidIsNull() {
            addCriterion("FSerialClassID is null");
            return (Criteria) this;
        }

        public Criteria andFserialclassidIsNotNull() {
            addCriterion("FSerialClassID is not null");
            return (Criteria) this;
        }

        public Criteria andFserialclassidEqualTo(Integer value) {
            addCriterion("FSerialClassID =", value, "fserialclassid");
            return (Criteria) this;
        }

        public Criteria andFserialclassidNotEqualTo(Integer value) {
            addCriterion("FSerialClassID <>", value, "fserialclassid");
            return (Criteria) this;
        }

        public Criteria andFserialclassidGreaterThan(Integer value) {
            addCriterion("FSerialClassID >", value, "fserialclassid");
            return (Criteria) this;
        }

        public Criteria andFserialclassidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FSerialClassID >=", value, "fserialclassid");
            return (Criteria) this;
        }

        public Criteria andFserialclassidLessThan(Integer value) {
            addCriterion("FSerialClassID <", value, "fserialclassid");
            return (Criteria) this;
        }

        public Criteria andFserialclassidLessThanOrEqualTo(Integer value) {
            addCriterion("FSerialClassID <=", value, "fserialclassid");
            return (Criteria) this;
        }

        public Criteria andFserialclassidIn(List<Integer> values) {
            addCriterion("FSerialClassID in", values, "fserialclassid");
            return (Criteria) this;
        }

        public Criteria andFserialclassidNotIn(List<Integer> values) {
            addCriterion("FSerialClassID not in", values, "fserialclassid");
            return (Criteria) this;
        }

        public Criteria andFserialclassidBetween(Integer value1, Integer value2) {
            addCriterion("FSerialClassID between", value1, value2, "fserialclassid");
            return (Criteria) this;
        }

        public Criteria andFserialclassidNotBetween(Integer value1, Integer value2) {
            addCriterion("FSerialClassID not between", value1, value2, "fserialclassid");
            return (Criteria) this;
        }

        public Criteria andFcomcategoryidIsNull() {
            addCriterion("FComCategoryID is null");
            return (Criteria) this;
        }

        public Criteria andFcomcategoryidIsNotNull() {
            addCriterion("FComCategoryID is not null");
            return (Criteria) this;
        }

        public Criteria andFcomcategoryidEqualTo(Integer value) {
            addCriterion("FComCategoryID =", value, "fcomcategoryid");
            return (Criteria) this;
        }

        public Criteria andFcomcategoryidNotEqualTo(Integer value) {
            addCriterion("FComCategoryID <>", value, "fcomcategoryid");
            return (Criteria) this;
        }

        public Criteria andFcomcategoryidGreaterThan(Integer value) {
            addCriterion("FComCategoryID >", value, "fcomcategoryid");
            return (Criteria) this;
        }

        public Criteria andFcomcategoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FComCategoryID >=", value, "fcomcategoryid");
            return (Criteria) this;
        }

        public Criteria andFcomcategoryidLessThan(Integer value) {
            addCriterion("FComCategoryID <", value, "fcomcategoryid");
            return (Criteria) this;
        }

        public Criteria andFcomcategoryidLessThanOrEqualTo(Integer value) {
            addCriterion("FComCategoryID <=", value, "fcomcategoryid");
            return (Criteria) this;
        }

        public Criteria andFcomcategoryidIn(List<Integer> values) {
            addCriterion("FComCategoryID in", values, "fcomcategoryid");
            return (Criteria) this;
        }

        public Criteria andFcomcategoryidNotIn(List<Integer> values) {
            addCriterion("FComCategoryID not in", values, "fcomcategoryid");
            return (Criteria) this;
        }

        public Criteria andFcomcategoryidBetween(Integer value1, Integer value2) {
            addCriterion("FComCategoryID between", value1, value2, "fcomcategoryid");
            return (Criteria) this;
        }

        public Criteria andFcomcategoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("FComCategoryID not between", value1, value2, "fcomcategoryid");
            return (Criteria) this;
        }

        public Criteria andFcomtypeidIsNull() {
            addCriterion("FComTypeID is null");
            return (Criteria) this;
        }

        public Criteria andFcomtypeidIsNotNull() {
            addCriterion("FComTypeID is not null");
            return (Criteria) this;
        }

        public Criteria andFcomtypeidEqualTo(Integer value) {
            addCriterion("FComTypeID =", value, "fcomtypeid");
            return (Criteria) this;
        }

        public Criteria andFcomtypeidNotEqualTo(Integer value) {
            addCriterion("FComTypeID <>", value, "fcomtypeid");
            return (Criteria) this;
        }

        public Criteria andFcomtypeidGreaterThan(Integer value) {
            addCriterion("FComTypeID >", value, "fcomtypeid");
            return (Criteria) this;
        }

        public Criteria andFcomtypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FComTypeID >=", value, "fcomtypeid");
            return (Criteria) this;
        }

        public Criteria andFcomtypeidLessThan(Integer value) {
            addCriterion("FComTypeID <", value, "fcomtypeid");
            return (Criteria) this;
        }

        public Criteria andFcomtypeidLessThanOrEqualTo(Integer value) {
            addCriterion("FComTypeID <=", value, "fcomtypeid");
            return (Criteria) this;
        }

        public Criteria andFcomtypeidIn(List<Integer> values) {
            addCriterion("FComTypeID in", values, "fcomtypeid");
            return (Criteria) this;
        }

        public Criteria andFcomtypeidNotIn(List<Integer> values) {
            addCriterion("FComTypeID not in", values, "fcomtypeid");
            return (Criteria) this;
        }

        public Criteria andFcomtypeidBetween(Integer value1, Integer value2) {
            addCriterion("FComTypeID between", value1, value2, "fcomtypeid");
            return (Criteria) this;
        }

        public Criteria andFcomtypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("FComTypeID not between", value1, value2, "fcomtypeid");
            return (Criteria) this;
        }

        public Criteria andFsellmethodIsNull() {
            addCriterion("FSellMethod is null");
            return (Criteria) this;
        }

        public Criteria andFsellmethodIsNotNull() {
            addCriterion("FSellMethod is not null");
            return (Criteria) this;
        }

        public Criteria andFsellmethodEqualTo(Integer value) {
            addCriterion("FSellMethod =", value, "fsellmethod");
            return (Criteria) this;
        }

        public Criteria andFsellmethodNotEqualTo(Integer value) {
            addCriterion("FSellMethod <>", value, "fsellmethod");
            return (Criteria) this;
        }

        public Criteria andFsellmethodGreaterThan(Integer value) {
            addCriterion("FSellMethod >", value, "fsellmethod");
            return (Criteria) this;
        }

        public Criteria andFsellmethodGreaterThanOrEqualTo(Integer value) {
            addCriterion("FSellMethod >=", value, "fsellmethod");
            return (Criteria) this;
        }

        public Criteria andFsellmethodLessThan(Integer value) {
            addCriterion("FSellMethod <", value, "fsellmethod");
            return (Criteria) this;
        }

        public Criteria andFsellmethodLessThanOrEqualTo(Integer value) {
            addCriterion("FSellMethod <=", value, "fsellmethod");
            return (Criteria) this;
        }

        public Criteria andFsellmethodIn(List<Integer> values) {
            addCriterion("FSellMethod in", values, "fsellmethod");
            return (Criteria) this;
        }

        public Criteria andFsellmethodNotIn(List<Integer> values) {
            addCriterion("FSellMethod not in", values, "fsellmethod");
            return (Criteria) this;
        }

        public Criteria andFsellmethodBetween(Integer value1, Integer value2) {
            addCriterion("FSellMethod between", value1, value2, "fsellmethod");
            return (Criteria) this;
        }

        public Criteria andFsellmethodNotBetween(Integer value1, Integer value2) {
            addCriterion("FSellMethod not between", value1, value2, "fsellmethod");
            return (Criteria) this;
        }

        public Criteria andFproducingareaIsNull() {
            addCriterion("FProducingArea is null");
            return (Criteria) this;
        }

        public Criteria andFproducingareaIsNotNull() {
            addCriterion("FProducingArea is not null");
            return (Criteria) this;
        }

        public Criteria andFproducingareaEqualTo(String value) {
            addCriterion("FProducingArea =", value, "fproducingarea");
            return (Criteria) this;
        }

        public Criteria andFproducingareaNotEqualTo(String value) {
            addCriterion("FProducingArea <>", value, "fproducingarea");
            return (Criteria) this;
        }

        public Criteria andFproducingareaGreaterThan(String value) {
            addCriterion("FProducingArea >", value, "fproducingarea");
            return (Criteria) this;
        }

        public Criteria andFproducingareaGreaterThanOrEqualTo(String value) {
            addCriterion("FProducingArea >=", value, "fproducingarea");
            return (Criteria) this;
        }

        public Criteria andFproducingareaLessThan(String value) {
            addCriterion("FProducingArea <", value, "fproducingarea");
            return (Criteria) this;
        }

        public Criteria andFproducingareaLessThanOrEqualTo(String value) {
            addCriterion("FProducingArea <=", value, "fproducingarea");
            return (Criteria) this;
        }

        public Criteria andFproducingareaLike(String value) {
            addCriterion("FProducingArea like", value, "fproducingarea");
            return (Criteria) this;
        }

        public Criteria andFproducingareaNotLike(String value) {
            addCriterion("FProducingArea not like", value, "fproducingarea");
            return (Criteria) this;
        }

        public Criteria andFproducingareaIn(List<String> values) {
            addCriterion("FProducingArea in", values, "fproducingarea");
            return (Criteria) this;
        }

        public Criteria andFproducingareaNotIn(List<String> values) {
            addCriterion("FProducingArea not in", values, "fproducingarea");
            return (Criteria) this;
        }

        public Criteria andFproducingareaBetween(String value1, String value2) {
            addCriterion("FProducingArea between", value1, value2, "fproducingarea");
            return (Criteria) this;
        }

        public Criteria andFproducingareaNotBetween(String value1, String value2) {
            addCriterion("FProducingArea not between", value1, value2, "fproducingarea");
            return (Criteria) this;
        }

        public Criteria andFcombrandidIsNull() {
            addCriterion("FComBrandID is null");
            return (Criteria) this;
        }

        public Criteria andFcombrandidIsNotNull() {
            addCriterion("FComBrandID is not null");
            return (Criteria) this;
        }

        public Criteria andFcombrandidEqualTo(Integer value) {
            addCriterion("FComBrandID =", value, "fcombrandid");
            return (Criteria) this;
        }

        public Criteria andFcombrandidNotEqualTo(Integer value) {
            addCriterion("FComBrandID <>", value, "fcombrandid");
            return (Criteria) this;
        }

        public Criteria andFcombrandidGreaterThan(Integer value) {
            addCriterion("FComBrandID >", value, "fcombrandid");
            return (Criteria) this;
        }

        public Criteria andFcombrandidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FComBrandID >=", value, "fcombrandid");
            return (Criteria) this;
        }

        public Criteria andFcombrandidLessThan(Integer value) {
            addCriterion("FComBrandID <", value, "fcombrandid");
            return (Criteria) this;
        }

        public Criteria andFcombrandidLessThanOrEqualTo(Integer value) {
            addCriterion("FComBrandID <=", value, "fcombrandid");
            return (Criteria) this;
        }

        public Criteria andFcombrandidIn(List<Integer> values) {
            addCriterion("FComBrandID in", values, "fcombrandid");
            return (Criteria) this;
        }

        public Criteria andFcombrandidNotIn(List<Integer> values) {
            addCriterion("FComBrandID not in", values, "fcombrandid");
            return (Criteria) this;
        }

        public Criteria andFcombrandidBetween(Integer value1, Integer value2) {
            addCriterion("FComBrandID between", value1, value2, "fcombrandid");
            return (Criteria) this;
        }

        public Criteria andFcombrandidNotBetween(Integer value1, Integer value2) {
            addCriterion("FComBrandID not between", value1, value2, "fcombrandid");
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

        public Criteria andFcomponentsIsNull() {
            addCriterion("FComponents is null");
            return (Criteria) this;
        }

        public Criteria andFcomponentsIsNotNull() {
            addCriterion("FComponents is not null");
            return (Criteria) this;
        }

        public Criteria andFcomponentsEqualTo(String value) {
            addCriterion("FComponents =", value, "fcomponents");
            return (Criteria) this;
        }

        public Criteria andFcomponentsNotEqualTo(String value) {
            addCriterion("FComponents <>", value, "fcomponents");
            return (Criteria) this;
        }

        public Criteria andFcomponentsGreaterThan(String value) {
            addCriterion("FComponents >", value, "fcomponents");
            return (Criteria) this;
        }

        public Criteria andFcomponentsGreaterThanOrEqualTo(String value) {
            addCriterion("FComponents >=", value, "fcomponents");
            return (Criteria) this;
        }

        public Criteria andFcomponentsLessThan(String value) {
            addCriterion("FComponents <", value, "fcomponents");
            return (Criteria) this;
        }

        public Criteria andFcomponentsLessThanOrEqualTo(String value) {
            addCriterion("FComponents <=", value, "fcomponents");
            return (Criteria) this;
        }

        public Criteria andFcomponentsLike(String value) {
            addCriterion("FComponents like", value, "fcomponents");
            return (Criteria) this;
        }

        public Criteria andFcomponentsNotLike(String value) {
            addCriterion("FComponents not like", value, "fcomponents");
            return (Criteria) this;
        }

        public Criteria andFcomponentsIn(List<String> values) {
            addCriterion("FComponents in", values, "fcomponents");
            return (Criteria) this;
        }

        public Criteria andFcomponentsNotIn(List<String> values) {
            addCriterion("FComponents not in", values, "fcomponents");
            return (Criteria) this;
        }

        public Criteria andFcomponentsBetween(String value1, String value2) {
            addCriterion("FComponents between", value1, value2, "fcomponents");
            return (Criteria) this;
        }

        public Criteria andFcomponentsNotBetween(String value1, String value2) {
            addCriterion("FComponents not between", value1, value2, "fcomponents");
            return (Criteria) this;
        }

        public Criteria andFgoodsnumberIsNull() {
            addCriterion("FGoodsNumber is null");
            return (Criteria) this;
        }

        public Criteria andFgoodsnumberIsNotNull() {
            addCriterion("FGoodsNumber is not null");
            return (Criteria) this;
        }

        public Criteria andFgoodsnumberEqualTo(String value) {
            addCriterion("FGoodsNumber =", value, "fgoodsnumber");
            return (Criteria) this;
        }

        public Criteria andFgoodsnumberNotEqualTo(String value) {
            addCriterion("FGoodsNumber <>", value, "fgoodsnumber");
            return (Criteria) this;
        }

        public Criteria andFgoodsnumberGreaterThan(String value) {
            addCriterion("FGoodsNumber >", value, "fgoodsnumber");
            return (Criteria) this;
        }

        public Criteria andFgoodsnumberGreaterThanOrEqualTo(String value) {
            addCriterion("FGoodsNumber >=", value, "fgoodsnumber");
            return (Criteria) this;
        }

        public Criteria andFgoodsnumberLessThan(String value) {
            addCriterion("FGoodsNumber <", value, "fgoodsnumber");
            return (Criteria) this;
        }

        public Criteria andFgoodsnumberLessThanOrEqualTo(String value) {
            addCriterion("FGoodsNumber <=", value, "fgoodsnumber");
            return (Criteria) this;
        }

        public Criteria andFgoodsnumberLike(String value) {
            addCriterion("FGoodsNumber like", value, "fgoodsnumber");
            return (Criteria) this;
        }

        public Criteria andFgoodsnumberNotLike(String value) {
            addCriterion("FGoodsNumber not like", value, "fgoodsnumber");
            return (Criteria) this;
        }

        public Criteria andFgoodsnumberIn(List<String> values) {
            addCriterion("FGoodsNumber in", values, "fgoodsnumber");
            return (Criteria) this;
        }

        public Criteria andFgoodsnumberNotIn(List<String> values) {
            addCriterion("FGoodsNumber not in", values, "fgoodsnumber");
            return (Criteria) this;
        }

        public Criteria andFgoodsnumberBetween(String value1, String value2) {
            addCriterion("FGoodsNumber between", value1, value2, "fgoodsnumber");
            return (Criteria) this;
        }

        public Criteria andFgoodsnumberNotBetween(String value1, String value2) {
            addCriterion("FGoodsNumber not between", value1, value2, "fgoodsnumber");
            return (Criteria) this;
        }

        public Criteria andFpacktypeidIsNull() {
            addCriterion("FPackTypeID is null");
            return (Criteria) this;
        }

        public Criteria andFpacktypeidIsNotNull() {
            addCriterion("FPackTypeID is not null");
            return (Criteria) this;
        }

        public Criteria andFpacktypeidEqualTo(Integer value) {
            addCriterion("FPackTypeID =", value, "fpacktypeid");
            return (Criteria) this;
        }

        public Criteria andFpacktypeidNotEqualTo(Integer value) {
            addCriterion("FPackTypeID <>", value, "fpacktypeid");
            return (Criteria) this;
        }

        public Criteria andFpacktypeidGreaterThan(Integer value) {
            addCriterion("FPackTypeID >", value, "fpacktypeid");
            return (Criteria) this;
        }

        public Criteria andFpacktypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FPackTypeID >=", value, "fpacktypeid");
            return (Criteria) this;
        }

        public Criteria andFpacktypeidLessThan(Integer value) {
            addCriterion("FPackTypeID <", value, "fpacktypeid");
            return (Criteria) this;
        }

        public Criteria andFpacktypeidLessThanOrEqualTo(Integer value) {
            addCriterion("FPackTypeID <=", value, "fpacktypeid");
            return (Criteria) this;
        }

        public Criteria andFpacktypeidIn(List<Integer> values) {
            addCriterion("FPackTypeID in", values, "fpacktypeid");
            return (Criteria) this;
        }

        public Criteria andFpacktypeidNotIn(List<Integer> values) {
            addCriterion("FPackTypeID not in", values, "fpacktypeid");
            return (Criteria) this;
        }

        public Criteria andFpacktypeidBetween(Integer value1, Integer value2) {
            addCriterion("FPackTypeID between", value1, value2, "fpacktypeid");
            return (Criteria) this;
        }

        public Criteria andFpacktypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("FPackTypeID not between", value1, value2, "fpacktypeid");
            return (Criteria) this;
        }

        public Criteria andFvippriceIsNull() {
            addCriterion("FVIPPrice is null");
            return (Criteria) this;
        }

        public Criteria andFvippriceIsNotNull() {
            addCriterion("FVIPPrice is not null");
            return (Criteria) this;
        }

        public Criteria andFvippriceEqualTo(BigDecimal value) {
            addCriterion("FVIPPrice =", value, "fvipprice");
            return (Criteria) this;
        }

        public Criteria andFvippriceNotEqualTo(BigDecimal value) {
            addCriterion("FVIPPrice <>", value, "fvipprice");
            return (Criteria) this;
        }

        public Criteria andFvippriceGreaterThan(BigDecimal value) {
            addCriterion("FVIPPrice >", value, "fvipprice");
            return (Criteria) this;
        }

        public Criteria andFvippriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FVIPPrice >=", value, "fvipprice");
            return (Criteria) this;
        }

        public Criteria andFvippriceLessThan(BigDecimal value) {
            addCriterion("FVIPPrice <", value, "fvipprice");
            return (Criteria) this;
        }

        public Criteria andFvippriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FVIPPrice <=", value, "fvipprice");
            return (Criteria) this;
        }

        public Criteria andFvippriceIn(List<BigDecimal> values) {
            addCriterion("FVIPPrice in", values, "fvipprice");
            return (Criteria) this;
        }

        public Criteria andFvippriceNotIn(List<BigDecimal> values) {
            addCriterion("FVIPPrice not in", values, "fvipprice");
            return (Criteria) this;
        }

        public Criteria andFvippriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FVIPPrice between", value1, value2, "fvipprice");
            return (Criteria) this;
        }

        public Criteria andFvippriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FVIPPrice not between", value1, value2, "fvipprice");
            return (Criteria) this;
        }

        public Criteria andFsilvervippriceIsNull() {
            addCriterion("FSilverVIPPrice is null");
            return (Criteria) this;
        }

        public Criteria andFsilvervippriceIsNotNull() {
            addCriterion("FSilverVIPPrice is not null");
            return (Criteria) this;
        }

        public Criteria andFsilvervippriceEqualTo(BigDecimal value) {
            addCriterion("FSilverVIPPrice =", value, "fsilvervipprice");
            return (Criteria) this;
        }

        public Criteria andFsilvervippriceNotEqualTo(BigDecimal value) {
            addCriterion("FSilverVIPPrice <>", value, "fsilvervipprice");
            return (Criteria) this;
        }

        public Criteria andFsilvervippriceGreaterThan(BigDecimal value) {
            addCriterion("FSilverVIPPrice >", value, "fsilvervipprice");
            return (Criteria) this;
        }

        public Criteria andFsilvervippriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FSilverVIPPrice >=", value, "fsilvervipprice");
            return (Criteria) this;
        }

        public Criteria andFsilvervippriceLessThan(BigDecimal value) {
            addCriterion("FSilverVIPPrice <", value, "fsilvervipprice");
            return (Criteria) this;
        }

        public Criteria andFsilvervippriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FSilverVIPPrice <=", value, "fsilvervipprice");
            return (Criteria) this;
        }

        public Criteria andFsilvervippriceIn(List<BigDecimal> values) {
            addCriterion("FSilverVIPPrice in", values, "fsilvervipprice");
            return (Criteria) this;
        }

        public Criteria andFsilvervippriceNotIn(List<BigDecimal> values) {
            addCriterion("FSilverVIPPrice not in", values, "fsilvervipprice");
            return (Criteria) this;
        }

        public Criteria andFsilvervippriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FSilverVIPPrice between", value1, value2, "fsilvervipprice");
            return (Criteria) this;
        }

        public Criteria andFsilvervippriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FSilverVIPPrice not between", value1, value2, "fsilvervipprice");
            return (Criteria) this;
        }

        public Criteria andFgoldvippriceIsNull() {
            addCriterion("FGoldVIPPrice is null");
            return (Criteria) this;
        }

        public Criteria andFgoldvippriceIsNotNull() {
            addCriterion("FGoldVIPPrice is not null");
            return (Criteria) this;
        }

        public Criteria andFgoldvippriceEqualTo(BigDecimal value) {
            addCriterion("FGoldVIPPrice =", value, "fgoldvipprice");
            return (Criteria) this;
        }

        public Criteria andFgoldvippriceNotEqualTo(BigDecimal value) {
            addCriterion("FGoldVIPPrice <>", value, "fgoldvipprice");
            return (Criteria) this;
        }

        public Criteria andFgoldvippriceGreaterThan(BigDecimal value) {
            addCriterion("FGoldVIPPrice >", value, "fgoldvipprice");
            return (Criteria) this;
        }

        public Criteria andFgoldvippriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FGoldVIPPrice >=", value, "fgoldvipprice");
            return (Criteria) this;
        }

        public Criteria andFgoldvippriceLessThan(BigDecimal value) {
            addCriterion("FGoldVIPPrice <", value, "fgoldvipprice");
            return (Criteria) this;
        }

        public Criteria andFgoldvippriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FGoldVIPPrice <=", value, "fgoldvipprice");
            return (Criteria) this;
        }

        public Criteria andFgoldvippriceIn(List<BigDecimal> values) {
            addCriterion("FGoldVIPPrice in", values, "fgoldvipprice");
            return (Criteria) this;
        }

        public Criteria andFgoldvippriceNotIn(List<BigDecimal> values) {
            addCriterion("FGoldVIPPrice not in", values, "fgoldvipprice");
            return (Criteria) this;
        }

        public Criteria andFgoldvippriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FGoldVIPPrice between", value1, value2, "fgoldvipprice");
            return (Criteria) this;
        }

        public Criteria andFgoldvippriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FGoldVIPPrice not between", value1, value2, "fgoldvipprice");
            return (Criteria) this;
        }

        public Criteria andFgoodsbarcodeIsNull() {
            addCriterion("FGoodsBarCode is null");
            return (Criteria) this;
        }

        public Criteria andFgoodsbarcodeIsNotNull() {
            addCriterion("FGoodsBarCode is not null");
            return (Criteria) this;
        }

        public Criteria andFgoodsbarcodeEqualTo(String value) {
            addCriterion("FGoodsBarCode =", value, "fgoodsbarcode");
            return (Criteria) this;
        }

        public Criteria andFgoodsbarcodeNotEqualTo(String value) {
            addCriterion("FGoodsBarCode <>", value, "fgoodsbarcode");
            return (Criteria) this;
        }

        public Criteria andFgoodsbarcodeGreaterThan(String value) {
            addCriterion("FGoodsBarCode >", value, "fgoodsbarcode");
            return (Criteria) this;
        }

        public Criteria andFgoodsbarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("FGoodsBarCode >=", value, "fgoodsbarcode");
            return (Criteria) this;
        }

        public Criteria andFgoodsbarcodeLessThan(String value) {
            addCriterion("FGoodsBarCode <", value, "fgoodsbarcode");
            return (Criteria) this;
        }

        public Criteria andFgoodsbarcodeLessThanOrEqualTo(String value) {
            addCriterion("FGoodsBarCode <=", value, "fgoodsbarcode");
            return (Criteria) this;
        }

        public Criteria andFgoodsbarcodeLike(String value) {
            addCriterion("FGoodsBarCode like", value, "fgoodsbarcode");
            return (Criteria) this;
        }

        public Criteria andFgoodsbarcodeNotLike(String value) {
            addCriterion("FGoodsBarCode not like", value, "fgoodsbarcode");
            return (Criteria) this;
        }

        public Criteria andFgoodsbarcodeIn(List<String> values) {
            addCriterion("FGoodsBarCode in", values, "fgoodsbarcode");
            return (Criteria) this;
        }

        public Criteria andFgoodsbarcodeNotIn(List<String> values) {
            addCriterion("FGoodsBarCode not in", values, "fgoodsbarcode");
            return (Criteria) this;
        }

        public Criteria andFgoodsbarcodeBetween(String value1, String value2) {
            addCriterion("FGoodsBarCode between", value1, value2, "fgoodsbarcode");
            return (Criteria) this;
        }

        public Criteria andFgoodsbarcodeNotBetween(String value1, String value2) {
            addCriterion("FGoodsBarCode not between", value1, value2, "fgoodsbarcode");
            return (Criteria) this;
        }

        public Criteria andFoperatorIsNull() {
            addCriterion("FOperator is null");
            return (Criteria) this;
        }

        public Criteria andFoperatorIsNotNull() {
            addCriterion("FOperator is not null");
            return (Criteria) this;
        }

        public Criteria andFoperatorEqualTo(String value) {
            addCriterion("FOperator =", value, "foperator");
            return (Criteria) this;
        }

        public Criteria andFoperatorNotEqualTo(String value) {
            addCriterion("FOperator <>", value, "foperator");
            return (Criteria) this;
        }

        public Criteria andFoperatorGreaterThan(String value) {
            addCriterion("FOperator >", value, "foperator");
            return (Criteria) this;
        }

        public Criteria andFoperatorGreaterThanOrEqualTo(String value) {
            addCriterion("FOperator >=", value, "foperator");
            return (Criteria) this;
        }

        public Criteria andFoperatorLessThan(String value) {
            addCriterion("FOperator <", value, "foperator");
            return (Criteria) this;
        }

        public Criteria andFoperatorLessThanOrEqualTo(String value) {
            addCriterion("FOperator <=", value, "foperator");
            return (Criteria) this;
        }

        public Criteria andFoperatorLike(String value) {
            addCriterion("FOperator like", value, "foperator");
            return (Criteria) this;
        }

        public Criteria andFoperatorNotLike(String value) {
            addCriterion("FOperator not like", value, "foperator");
            return (Criteria) this;
        }

        public Criteria andFoperatorIn(List<String> values) {
            addCriterion("FOperator in", values, "foperator");
            return (Criteria) this;
        }

        public Criteria andFoperatorNotIn(List<String> values) {
            addCriterion("FOperator not in", values, "foperator");
            return (Criteria) this;
        }

        public Criteria andFoperatorBetween(String value1, String value2) {
            addCriterion("FOperator between", value1, value2, "foperator");
            return (Criteria) this;
        }

        public Criteria andFoperatorNotBetween(String value1, String value2) {
            addCriterion("FOperator not between", value1, value2, "foperator");
            return (Criteria) this;
        }

        public Criteria andFoperatingtimeIsNull() {
            addCriterion("FOperatingTime is null");
            return (Criteria) this;
        }

        public Criteria andFoperatingtimeIsNotNull() {
            addCriterion("FOperatingTime is not null");
            return (Criteria) this;
        }

        public Criteria andFoperatingtimeEqualTo(Date value) {
            addCriterion("FOperatingTime =", value, "foperatingtime");
            return (Criteria) this;
        }

        public Criteria andFoperatingtimeNotEqualTo(Date value) {
            addCriterion("FOperatingTime <>", value, "foperatingtime");
            return (Criteria) this;
        }

        public Criteria andFoperatingtimeGreaterThan(Date value) {
            addCriterion("FOperatingTime >", value, "foperatingtime");
            return (Criteria) this;
        }

        public Criteria andFoperatingtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FOperatingTime >=", value, "foperatingtime");
            return (Criteria) this;
        }

        public Criteria andFoperatingtimeLessThan(Date value) {
            addCriterion("FOperatingTime <", value, "foperatingtime");
            return (Criteria) this;
        }

        public Criteria andFoperatingtimeLessThanOrEqualTo(Date value) {
            addCriterion("FOperatingTime <=", value, "foperatingtime");
            return (Criteria) this;
        }

        public Criteria andFoperatingtimeIn(List<Date> values) {
            addCriterion("FOperatingTime in", values, "foperatingtime");
            return (Criteria) this;
        }

        public Criteria andFoperatingtimeNotIn(List<Date> values) {
            addCriterion("FOperatingTime not in", values, "foperatingtime");
            return (Criteria) this;
        }

        public Criteria andFoperatingtimeBetween(Date value1, Date value2) {
            addCriterion("FOperatingTime between", value1, value2, "foperatingtime");
            return (Criteria) this;
        }

        public Criteria andFoperatingtimeNotBetween(Date value1, Date value2) {
            addCriterion("FOperatingTime not between", value1, value2, "foperatingtime");
            return (Criteria) this;
        }

        public Criteria andFbusinesstypeIsNull() {
            addCriterion("FBusinessType is null");
            return (Criteria) this;
        }

        public Criteria andFbusinesstypeIsNotNull() {
            addCriterion("FBusinessType is not null");
            return (Criteria) this;
        }

        public Criteria andFbusinesstypeEqualTo(Integer value) {
            addCriterion("FBusinessType =", value, "fbusinesstype");
            return (Criteria) this;
        }

        public Criteria andFbusinesstypeNotEqualTo(Integer value) {
            addCriterion("FBusinessType <>", value, "fbusinesstype");
            return (Criteria) this;
        }

        public Criteria andFbusinesstypeGreaterThan(Integer value) {
            addCriterion("FBusinessType >", value, "fbusinesstype");
            return (Criteria) this;
        }

        public Criteria andFbusinesstypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("FBusinessType >=", value, "fbusinesstype");
            return (Criteria) this;
        }

        public Criteria andFbusinesstypeLessThan(Integer value) {
            addCriterion("FBusinessType <", value, "fbusinesstype");
            return (Criteria) this;
        }

        public Criteria andFbusinesstypeLessThanOrEqualTo(Integer value) {
            addCriterion("FBusinessType <=", value, "fbusinesstype");
            return (Criteria) this;
        }

        public Criteria andFbusinesstypeIn(List<Integer> values) {
            addCriterion("FBusinessType in", values, "fbusinesstype");
            return (Criteria) this;
        }

        public Criteria andFbusinesstypeNotIn(List<Integer> values) {
            addCriterion("FBusinessType not in", values, "fbusinesstype");
            return (Criteria) this;
        }

        public Criteria andFbusinesstypeBetween(Integer value1, Integer value2) {
            addCriterion("FBusinessType between", value1, value2, "fbusinesstype");
            return (Criteria) this;
        }

        public Criteria andFbusinesstypeNotBetween(Integer value1, Integer value2) {
            addCriterion("FBusinessType not between", value1, value2, "fbusinesstype");
            return (Criteria) this;
        }

        public Criteria andFbarcodeunitidIsNull() {
            addCriterion("FBarCodeUnitID is null");
            return (Criteria) this;
        }

        public Criteria andFbarcodeunitidIsNotNull() {
            addCriterion("FBarCodeUnitID is not null");
            return (Criteria) this;
        }

        public Criteria andFbarcodeunitidEqualTo(Integer value) {
            addCriterion("FBarCodeUnitID =", value, "fbarcodeunitid");
            return (Criteria) this;
        }

        public Criteria andFbarcodeunitidNotEqualTo(Integer value) {
            addCriterion("FBarCodeUnitID <>", value, "fbarcodeunitid");
            return (Criteria) this;
        }

        public Criteria andFbarcodeunitidGreaterThan(Integer value) {
            addCriterion("FBarCodeUnitID >", value, "fbarcodeunitid");
            return (Criteria) this;
        }

        public Criteria andFbarcodeunitidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FBarCodeUnitID >=", value, "fbarcodeunitid");
            return (Criteria) this;
        }

        public Criteria andFbarcodeunitidLessThan(Integer value) {
            addCriterion("FBarCodeUnitID <", value, "fbarcodeunitid");
            return (Criteria) this;
        }

        public Criteria andFbarcodeunitidLessThanOrEqualTo(Integer value) {
            addCriterion("FBarCodeUnitID <=", value, "fbarcodeunitid");
            return (Criteria) this;
        }

        public Criteria andFbarcodeunitidIn(List<Integer> values) {
            addCriterion("FBarCodeUnitID in", values, "fbarcodeunitid");
            return (Criteria) this;
        }

        public Criteria andFbarcodeunitidNotIn(List<Integer> values) {
            addCriterion("FBarCodeUnitID not in", values, "fbarcodeunitid");
            return (Criteria) this;
        }

        public Criteria andFbarcodeunitidBetween(Integer value1, Integer value2) {
            addCriterion("FBarCodeUnitID between", value1, value2, "fbarcodeunitid");
            return (Criteria) this;
        }

        public Criteria andFbarcodeunitidNotBetween(Integer value1, Integer value2) {
            addCriterion("FBarCodeUnitID not between", value1, value2, "fbarcodeunitid");
            return (Criteria) this;
        }

        public Criteria andFkccunitidIsNull() {
            addCriterion("FKCCUnitID is null");
            return (Criteria) this;
        }

        public Criteria andFkccunitidIsNotNull() {
            addCriterion("FKCCUnitID is not null");
            return (Criteria) this;
        }

        public Criteria andFkccunitidEqualTo(Integer value) {
            addCriterion("FKCCUnitID =", value, "fkccunitid");
            return (Criteria) this;
        }

        public Criteria andFkccunitidNotEqualTo(Integer value) {
            addCriterion("FKCCUnitID <>", value, "fkccunitid");
            return (Criteria) this;
        }

        public Criteria andFkccunitidGreaterThan(Integer value) {
            addCriterion("FKCCUnitID >", value, "fkccunitid");
            return (Criteria) this;
        }

        public Criteria andFkccunitidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FKCCUnitID >=", value, "fkccunitid");
            return (Criteria) this;
        }

        public Criteria andFkccunitidLessThan(Integer value) {
            addCriterion("FKCCUnitID <", value, "fkccunitid");
            return (Criteria) this;
        }

        public Criteria andFkccunitidLessThanOrEqualTo(Integer value) {
            addCriterion("FKCCUnitID <=", value, "fkccunitid");
            return (Criteria) this;
        }

        public Criteria andFkccunitidIn(List<Integer> values) {
            addCriterion("FKCCUnitID in", values, "fkccunitid");
            return (Criteria) this;
        }

        public Criteria andFkccunitidNotIn(List<Integer> values) {
            addCriterion("FKCCUnitID not in", values, "fkccunitid");
            return (Criteria) this;
        }

        public Criteria andFkccunitidBetween(Integer value1, Integer value2) {
            addCriterion("FKCCUnitID between", value1, value2, "fkccunitid");
            return (Criteria) this;
        }

        public Criteria andFkccunitidNotBetween(Integer value1, Integer value2) {
            addCriterion("FKCCUnitID not between", value1, value2, "fkccunitid");
            return (Criteria) this;
        }

        public Criteria andFlastupdatetimeIsNull() {
            addCriterion("FLastUpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andFlastupdatetimeIsNotNull() {
            addCriterion("FLastUpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andFlastupdatetimeEqualTo(Date value) {
            addCriterion("FLastUpdateTime =", value, "flastupdatetime");
            return (Criteria) this;
        }

        public Criteria andFlastupdatetimeNotEqualTo(Date value) {
            addCriterion("FLastUpdateTime <>", value, "flastupdatetime");
            return (Criteria) this;
        }

        public Criteria andFlastupdatetimeGreaterThan(Date value) {
            addCriterion("FLastUpdateTime >", value, "flastupdatetime");
            return (Criteria) this;
        }

        public Criteria andFlastupdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FLastUpdateTime >=", value, "flastupdatetime");
            return (Criteria) this;
        }

        public Criteria andFlastupdatetimeLessThan(Date value) {
            addCriterion("FLastUpdateTime <", value, "flastupdatetime");
            return (Criteria) this;
        }

        public Criteria andFlastupdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("FLastUpdateTime <=", value, "flastupdatetime");
            return (Criteria) this;
        }

        public Criteria andFlastupdatetimeIn(List<Date> values) {
            addCriterion("FLastUpdateTime in", values, "flastupdatetime");
            return (Criteria) this;
        }

        public Criteria andFlastupdatetimeNotIn(List<Date> values) {
            addCriterion("FLastUpdateTime not in", values, "flastupdatetime");
            return (Criteria) this;
        }

        public Criteria andFlastupdatetimeBetween(Date value1, Date value2) {
            addCriterion("FLastUpdateTime between", value1, value2, "flastupdatetime");
            return (Criteria) this;
        }

        public Criteria andFlastupdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("FLastUpdateTime not between", value1, value2, "flastupdatetime");
            return (Criteria) this;
        }

        public Criteria andForderrectorIsNull() {
            addCriterion("FOrderRector is null");
            return (Criteria) this;
        }

        public Criteria andForderrectorIsNotNull() {
            addCriterion("FOrderRector is not null");
            return (Criteria) this;
        }

        public Criteria andForderrectorEqualTo(Integer value) {
            addCriterion("FOrderRector =", value, "forderrector");
            return (Criteria) this;
        }

        public Criteria andForderrectorNotEqualTo(Integer value) {
            addCriterion("FOrderRector <>", value, "forderrector");
            return (Criteria) this;
        }

        public Criteria andForderrectorGreaterThan(Integer value) {
            addCriterion("FOrderRector >", value, "forderrector");
            return (Criteria) this;
        }

        public Criteria andForderrectorGreaterThanOrEqualTo(Integer value) {
            addCriterion("FOrderRector >=", value, "forderrector");
            return (Criteria) this;
        }

        public Criteria andForderrectorLessThan(Integer value) {
            addCriterion("FOrderRector <", value, "forderrector");
            return (Criteria) this;
        }

        public Criteria andForderrectorLessThanOrEqualTo(Integer value) {
            addCriterion("FOrderRector <=", value, "forderrector");
            return (Criteria) this;
        }

        public Criteria andForderrectorIn(List<Integer> values) {
            addCriterion("FOrderRector in", values, "forderrector");
            return (Criteria) this;
        }

        public Criteria andForderrectorNotIn(List<Integer> values) {
            addCriterion("FOrderRector not in", values, "forderrector");
            return (Criteria) this;
        }

        public Criteria andForderrectorBetween(Integer value1, Integer value2) {
            addCriterion("FOrderRector between", value1, value2, "forderrector");
            return (Criteria) this;
        }

        public Criteria andForderrectorNotBetween(Integer value1, Integer value2) {
            addCriterion("FOrderRector not between", value1, value2, "forderrector");
            return (Criteria) this;
        }

        public Criteria andFpohghprcmnytypeIsNull() {
            addCriterion("FPOHghPrcMnyType is null");
            return (Criteria) this;
        }

        public Criteria andFpohghprcmnytypeIsNotNull() {
            addCriterion("FPOHghPrcMnyType is not null");
            return (Criteria) this;
        }

        public Criteria andFpohghprcmnytypeEqualTo(Integer value) {
            addCriterion("FPOHghPrcMnyType =", value, "fpohghprcmnytype");
            return (Criteria) this;
        }

        public Criteria andFpohghprcmnytypeNotEqualTo(Integer value) {
            addCriterion("FPOHghPrcMnyType <>", value, "fpohghprcmnytype");
            return (Criteria) this;
        }

        public Criteria andFpohghprcmnytypeGreaterThan(Integer value) {
            addCriterion("FPOHghPrcMnyType >", value, "fpohghprcmnytype");
            return (Criteria) this;
        }

        public Criteria andFpohghprcmnytypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("FPOHghPrcMnyType >=", value, "fpohghprcmnytype");
            return (Criteria) this;
        }

        public Criteria andFpohghprcmnytypeLessThan(Integer value) {
            addCriterion("FPOHghPrcMnyType <", value, "fpohghprcmnytype");
            return (Criteria) this;
        }

        public Criteria andFpohghprcmnytypeLessThanOrEqualTo(Integer value) {
            addCriterion("FPOHghPrcMnyType <=", value, "fpohghprcmnytype");
            return (Criteria) this;
        }

        public Criteria andFpohghprcmnytypeIn(List<Integer> values) {
            addCriterion("FPOHghPrcMnyType in", values, "fpohghprcmnytype");
            return (Criteria) this;
        }

        public Criteria andFpohghprcmnytypeNotIn(List<Integer> values) {
            addCriterion("FPOHghPrcMnyType not in", values, "fpohghprcmnytype");
            return (Criteria) this;
        }

        public Criteria andFpohghprcmnytypeBetween(Integer value1, Integer value2) {
            addCriterion("FPOHghPrcMnyType between", value1, value2, "fpohghprcmnytype");
            return (Criteria) this;
        }

        public Criteria andFpohghprcmnytypeNotBetween(Integer value1, Integer value2) {
            addCriterion("FPOHghPrcMnyType not between", value1, value2, "fpohghprcmnytype");
            return (Criteria) this;
        }

        public Criteria andFpohighpriceIsNull() {
            addCriterion("FPOHighPrice is null");
            return (Criteria) this;
        }

        public Criteria andFpohighpriceIsNotNull() {
            addCriterion("FPOHighPrice is not null");
            return (Criteria) this;
        }

        public Criteria andFpohighpriceEqualTo(BigDecimal value) {
            addCriterion("FPOHighPrice =", value, "fpohighprice");
            return (Criteria) this;
        }

        public Criteria andFpohighpriceNotEqualTo(BigDecimal value) {
            addCriterion("FPOHighPrice <>", value, "fpohighprice");
            return (Criteria) this;
        }

        public Criteria andFpohighpriceGreaterThan(BigDecimal value) {
            addCriterion("FPOHighPrice >", value, "fpohighprice");
            return (Criteria) this;
        }

        public Criteria andFpohighpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FPOHighPrice >=", value, "fpohighprice");
            return (Criteria) this;
        }

        public Criteria andFpohighpriceLessThan(BigDecimal value) {
            addCriterion("FPOHighPrice <", value, "fpohighprice");
            return (Criteria) this;
        }

        public Criteria andFpohighpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FPOHighPrice <=", value, "fpohighprice");
            return (Criteria) this;
        }

        public Criteria andFpohighpriceIn(List<BigDecimal> values) {
            addCriterion("FPOHighPrice in", values, "fpohighprice");
            return (Criteria) this;
        }

        public Criteria andFpohighpriceNotIn(List<BigDecimal> values) {
            addCriterion("FPOHighPrice not in", values, "fpohighprice");
            return (Criteria) this;
        }

        public Criteria andFpohighpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FPOHighPrice between", value1, value2, "fpohighprice");
            return (Criteria) this;
        }

        public Criteria andFpohighpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FPOHighPrice not between", value1, value2, "fpohighprice");
            return (Criteria) this;
        }

        public Criteria andFwwhghprcIsNull() {
            addCriterion("FWWHghPrc is null");
            return (Criteria) this;
        }

        public Criteria andFwwhghprcIsNotNull() {
            addCriterion("FWWHghPrc is not null");
            return (Criteria) this;
        }

        public Criteria andFwwhghprcEqualTo(BigDecimal value) {
            addCriterion("FWWHghPrc =", value, "fwwhghprc");
            return (Criteria) this;
        }

        public Criteria andFwwhghprcNotEqualTo(BigDecimal value) {
            addCriterion("FWWHghPrc <>", value, "fwwhghprc");
            return (Criteria) this;
        }

        public Criteria andFwwhghprcGreaterThan(BigDecimal value) {
            addCriterion("FWWHghPrc >", value, "fwwhghprc");
            return (Criteria) this;
        }

        public Criteria andFwwhghprcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FWWHghPrc >=", value, "fwwhghprc");
            return (Criteria) this;
        }

        public Criteria andFwwhghprcLessThan(BigDecimal value) {
            addCriterion("FWWHghPrc <", value, "fwwhghprc");
            return (Criteria) this;
        }

        public Criteria andFwwhghprcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FWWHghPrc <=", value, "fwwhghprc");
            return (Criteria) this;
        }

        public Criteria andFwwhghprcIn(List<BigDecimal> values) {
            addCriterion("FWWHghPrc in", values, "fwwhghprc");
            return (Criteria) this;
        }

        public Criteria andFwwhghprcNotIn(List<BigDecimal> values) {
            addCriterion("FWWHghPrc not in", values, "fwwhghprc");
            return (Criteria) this;
        }

        public Criteria andFwwhghprcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FWWHghPrc between", value1, value2, "fwwhghprc");
            return (Criteria) this;
        }

        public Criteria andFwwhghprcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FWWHghPrc not between", value1, value2, "fwwhghprc");
            return (Criteria) this;
        }

        public Criteria andFwwhghprcmnytypeIsNull() {
            addCriterion("FWWHghPrcMnyType is null");
            return (Criteria) this;
        }

        public Criteria andFwwhghprcmnytypeIsNotNull() {
            addCriterion("FWWHghPrcMnyType is not null");
            return (Criteria) this;
        }

        public Criteria andFwwhghprcmnytypeEqualTo(Integer value) {
            addCriterion("FWWHghPrcMnyType =", value, "fwwhghprcmnytype");
            return (Criteria) this;
        }

        public Criteria andFwwhghprcmnytypeNotEqualTo(Integer value) {
            addCriterion("FWWHghPrcMnyType <>", value, "fwwhghprcmnytype");
            return (Criteria) this;
        }

        public Criteria andFwwhghprcmnytypeGreaterThan(Integer value) {
            addCriterion("FWWHghPrcMnyType >", value, "fwwhghprcmnytype");
            return (Criteria) this;
        }

        public Criteria andFwwhghprcmnytypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("FWWHghPrcMnyType >=", value, "fwwhghprcmnytype");
            return (Criteria) this;
        }

        public Criteria andFwwhghprcmnytypeLessThan(Integer value) {
            addCriterion("FWWHghPrcMnyType <", value, "fwwhghprcmnytype");
            return (Criteria) this;
        }

        public Criteria andFwwhghprcmnytypeLessThanOrEqualTo(Integer value) {
            addCriterion("FWWHghPrcMnyType <=", value, "fwwhghprcmnytype");
            return (Criteria) this;
        }

        public Criteria andFwwhghprcmnytypeIn(List<Integer> values) {
            addCriterion("FWWHghPrcMnyType in", values, "fwwhghprcmnytype");
            return (Criteria) this;
        }

        public Criteria andFwwhghprcmnytypeNotIn(List<Integer> values) {
            addCriterion("FWWHghPrcMnyType not in", values, "fwwhghprcmnytype");
            return (Criteria) this;
        }

        public Criteria andFwwhghprcmnytypeBetween(Integer value1, Integer value2) {
            addCriterion("FWWHghPrcMnyType between", value1, value2, "fwwhghprcmnytype");
            return (Criteria) this;
        }

        public Criteria andFwwhghprcmnytypeNotBetween(Integer value1, Integer value2) {
            addCriterion("FWWHghPrcMnyType not between", value1, value2, "fwwhghprcmnytype");
            return (Criteria) this;
        }

        public Criteria andFsolowprcIsNull() {
            addCriterion("FSOLowPrc is null");
            return (Criteria) this;
        }

        public Criteria andFsolowprcIsNotNull() {
            addCriterion("FSOLowPrc is not null");
            return (Criteria) this;
        }

        public Criteria andFsolowprcEqualTo(BigDecimal value) {
            addCriterion("FSOLowPrc =", value, "fsolowprc");
            return (Criteria) this;
        }

        public Criteria andFsolowprcNotEqualTo(BigDecimal value) {
            addCriterion("FSOLowPrc <>", value, "fsolowprc");
            return (Criteria) this;
        }

        public Criteria andFsolowprcGreaterThan(BigDecimal value) {
            addCriterion("FSOLowPrc >", value, "fsolowprc");
            return (Criteria) this;
        }

        public Criteria andFsolowprcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FSOLowPrc >=", value, "fsolowprc");
            return (Criteria) this;
        }

        public Criteria andFsolowprcLessThan(BigDecimal value) {
            addCriterion("FSOLowPrc <", value, "fsolowprc");
            return (Criteria) this;
        }

        public Criteria andFsolowprcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FSOLowPrc <=", value, "fsolowprc");
            return (Criteria) this;
        }

        public Criteria andFsolowprcIn(List<BigDecimal> values) {
            addCriterion("FSOLowPrc in", values, "fsolowprc");
            return (Criteria) this;
        }

        public Criteria andFsolowprcNotIn(List<BigDecimal> values) {
            addCriterion("FSOLowPrc not in", values, "fsolowprc");
            return (Criteria) this;
        }

        public Criteria andFsolowprcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FSOLowPrc between", value1, value2, "fsolowprc");
            return (Criteria) this;
        }

        public Criteria andFsolowprcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FSOLowPrc not between", value1, value2, "fsolowprc");
            return (Criteria) this;
        }

        public Criteria andFsolowprcmnytypeIsNull() {
            addCriterion("FSOLowPrcMnyType is null");
            return (Criteria) this;
        }

        public Criteria andFsolowprcmnytypeIsNotNull() {
            addCriterion("FSOLowPrcMnyType is not null");
            return (Criteria) this;
        }

        public Criteria andFsolowprcmnytypeEqualTo(Integer value) {
            addCriterion("FSOLowPrcMnyType =", value, "fsolowprcmnytype");
            return (Criteria) this;
        }

        public Criteria andFsolowprcmnytypeNotEqualTo(Integer value) {
            addCriterion("FSOLowPrcMnyType <>", value, "fsolowprcmnytype");
            return (Criteria) this;
        }

        public Criteria andFsolowprcmnytypeGreaterThan(Integer value) {
            addCriterion("FSOLowPrcMnyType >", value, "fsolowprcmnytype");
            return (Criteria) this;
        }

        public Criteria andFsolowprcmnytypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("FSOLowPrcMnyType >=", value, "fsolowprcmnytype");
            return (Criteria) this;
        }

        public Criteria andFsolowprcmnytypeLessThan(Integer value) {
            addCriterion("FSOLowPrcMnyType <", value, "fsolowprcmnytype");
            return (Criteria) this;
        }

        public Criteria andFsolowprcmnytypeLessThanOrEqualTo(Integer value) {
            addCriterion("FSOLowPrcMnyType <=", value, "fsolowprcmnytype");
            return (Criteria) this;
        }

        public Criteria andFsolowprcmnytypeIn(List<Integer> values) {
            addCriterion("FSOLowPrcMnyType in", values, "fsolowprcmnytype");
            return (Criteria) this;
        }

        public Criteria andFsolowprcmnytypeNotIn(List<Integer> values) {
            addCriterion("FSOLowPrcMnyType not in", values, "fsolowprcmnytype");
            return (Criteria) this;
        }

        public Criteria andFsolowprcmnytypeBetween(Integer value1, Integer value2) {
            addCriterion("FSOLowPrcMnyType between", value1, value2, "fsolowprcmnytype");
            return (Criteria) this;
        }

        public Criteria andFsolowprcmnytypeNotBetween(Integer value1, Integer value2) {
            addCriterion("FSOLowPrcMnyType not between", value1, value2, "fsolowprcmnytype");
            return (Criteria) this;
        }

        public Criteria andFissaleIsNull() {
            addCriterion("FIsSale is null");
            return (Criteria) this;
        }

        public Criteria andFissaleIsNotNull() {
            addCriterion("FIsSale is not null");
            return (Criteria) this;
        }

        public Criteria andFissaleEqualTo(Boolean value) {
            addCriterion("FIsSale =", value, "fissale");
            return (Criteria) this;
        }

        public Criteria andFissaleNotEqualTo(Boolean value) {
            addCriterion("FIsSale <>", value, "fissale");
            return (Criteria) this;
        }

        public Criteria andFissaleGreaterThan(Boolean value) {
            addCriterion("FIsSale >", value, "fissale");
            return (Criteria) this;
        }

        public Criteria andFissaleGreaterThanOrEqualTo(Boolean value) {
            addCriterion("FIsSale >=", value, "fissale");
            return (Criteria) this;
        }

        public Criteria andFissaleLessThan(Boolean value) {
            addCriterion("FIsSale <", value, "fissale");
            return (Criteria) this;
        }

        public Criteria andFissaleLessThanOrEqualTo(Boolean value) {
            addCriterion("FIsSale <=", value, "fissale");
            return (Criteria) this;
        }

        public Criteria andFissaleIn(List<Boolean> values) {
            addCriterion("FIsSale in", values, "fissale");
            return (Criteria) this;
        }

        public Criteria andFissaleNotIn(List<Boolean> values) {
            addCriterion("FIsSale not in", values, "fissale");
            return (Criteria) this;
        }

        public Criteria andFissaleBetween(Boolean value1, Boolean value2) {
            addCriterion("FIsSale between", value1, value2, "fissale");
            return (Criteria) this;
        }

        public Criteria andFissaleNotBetween(Boolean value1, Boolean value2) {
            addCriterion("FIsSale not between", value1, value2, "fissale");
            return (Criteria) this;
        }

        public Criteria andFprofitrateIsNull() {
            addCriterion("FProfitRate is null");
            return (Criteria) this;
        }

        public Criteria andFprofitrateIsNotNull() {
            addCriterion("FProfitRate is not null");
            return (Criteria) this;
        }

        public Criteria andFprofitrateEqualTo(BigDecimal value) {
            addCriterion("FProfitRate =", value, "fprofitrate");
            return (Criteria) this;
        }

        public Criteria andFprofitrateNotEqualTo(BigDecimal value) {
            addCriterion("FProfitRate <>", value, "fprofitrate");
            return (Criteria) this;
        }

        public Criteria andFprofitrateGreaterThan(BigDecimal value) {
            addCriterion("FProfitRate >", value, "fprofitrate");
            return (Criteria) this;
        }

        public Criteria andFprofitrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FProfitRate >=", value, "fprofitrate");
            return (Criteria) this;
        }

        public Criteria andFprofitrateLessThan(BigDecimal value) {
            addCriterion("FProfitRate <", value, "fprofitrate");
            return (Criteria) this;
        }

        public Criteria andFprofitrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FProfitRate <=", value, "fprofitrate");
            return (Criteria) this;
        }

        public Criteria andFprofitrateIn(List<BigDecimal> values) {
            addCriterion("FProfitRate in", values, "fprofitrate");
            return (Criteria) this;
        }

        public Criteria andFprofitrateNotIn(List<BigDecimal> values) {
            addCriterion("FProfitRate not in", values, "fprofitrate");
            return (Criteria) this;
        }

        public Criteria andFprofitrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FProfitRate between", value1, value2, "fprofitrate");
            return (Criteria) this;
        }

        public Criteria andFprofitrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FProfitRate not between", value1, value2, "fprofitrate");
            return (Criteria) this;
        }

        public Criteria andFsalepriceIsNull() {
            addCriterion("FSalePrice is null");
            return (Criteria) this;
        }

        public Criteria andFsalepriceIsNotNull() {
            addCriterion("FSalePrice is not null");
            return (Criteria) this;
        }

        public Criteria andFsalepriceEqualTo(BigDecimal value) {
            addCriterion("FSalePrice =", value, "fsaleprice");
            return (Criteria) this;
        }

        public Criteria andFsalepriceNotEqualTo(BigDecimal value) {
            addCriterion("FSalePrice <>", value, "fsaleprice");
            return (Criteria) this;
        }

        public Criteria andFsalepriceGreaterThan(BigDecimal value) {
            addCriterion("FSalePrice >", value, "fsaleprice");
            return (Criteria) this;
        }

        public Criteria andFsalepriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FSalePrice >=", value, "fsaleprice");
            return (Criteria) this;
        }

        public Criteria andFsalepriceLessThan(BigDecimal value) {
            addCriterion("FSalePrice <", value, "fsaleprice");
            return (Criteria) this;
        }

        public Criteria andFsalepriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FSalePrice <=", value, "fsaleprice");
            return (Criteria) this;
        }

        public Criteria andFsalepriceIn(List<BigDecimal> values) {
            addCriterion("FSalePrice in", values, "fsaleprice");
            return (Criteria) this;
        }

        public Criteria andFsalepriceNotIn(List<BigDecimal> values) {
            addCriterion("FSalePrice not in", values, "fsaleprice");
            return (Criteria) this;
        }

        public Criteria andFsalepriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FSalePrice between", value1, value2, "fsaleprice");
            return (Criteria) this;
        }

        public Criteria andFsalepriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FSalePrice not between", value1, value2, "fsaleprice");
            return (Criteria) this;
        }

        public Criteria andFbatchmanagerIsNull() {
            addCriterion("FBatchManager is null");
            return (Criteria) this;
        }

        public Criteria andFbatchmanagerIsNotNull() {
            addCriterion("FBatchManager is not null");
            return (Criteria) this;
        }

        public Criteria andFbatchmanagerEqualTo(Boolean value) {
            addCriterion("FBatchManager =", value, "fbatchmanager");
            return (Criteria) this;
        }

        public Criteria andFbatchmanagerNotEqualTo(Boolean value) {
            addCriterion("FBatchManager <>", value, "fbatchmanager");
            return (Criteria) this;
        }

        public Criteria andFbatchmanagerGreaterThan(Boolean value) {
            addCriterion("FBatchManager >", value, "fbatchmanager");
            return (Criteria) this;
        }

        public Criteria andFbatchmanagerGreaterThanOrEqualTo(Boolean value) {
            addCriterion("FBatchManager >=", value, "fbatchmanager");
            return (Criteria) this;
        }

        public Criteria andFbatchmanagerLessThan(Boolean value) {
            addCriterion("FBatchManager <", value, "fbatchmanager");
            return (Criteria) this;
        }

        public Criteria andFbatchmanagerLessThanOrEqualTo(Boolean value) {
            addCriterion("FBatchManager <=", value, "fbatchmanager");
            return (Criteria) this;
        }

        public Criteria andFbatchmanagerIn(List<Boolean> values) {
            addCriterion("FBatchManager in", values, "fbatchmanager");
            return (Criteria) this;
        }

        public Criteria andFbatchmanagerNotIn(List<Boolean> values) {
            addCriterion("FBatchManager not in", values, "fbatchmanager");
            return (Criteria) this;
        }

        public Criteria andFbatchmanagerBetween(Boolean value1, Boolean value2) {
            addCriterion("FBatchManager between", value1, value2, "fbatchmanager");
            return (Criteria) this;
        }

        public Criteria andFbatchmanagerNotBetween(Boolean value1, Boolean value2) {
            addCriterion("FBatchManager not between", value1, value2, "fbatchmanager");
            return (Criteria) this;
        }

        public Criteria andFiskfperiodIsNull() {
            addCriterion("FISKFPeriod is null");
            return (Criteria) this;
        }

        public Criteria andFiskfperiodIsNotNull() {
            addCriterion("FISKFPeriod is not null");
            return (Criteria) this;
        }

        public Criteria andFiskfperiodEqualTo(Boolean value) {
            addCriterion("FISKFPeriod =", value, "fiskfperiod");
            return (Criteria) this;
        }

        public Criteria andFiskfperiodNotEqualTo(Boolean value) {
            addCriterion("FISKFPeriod <>", value, "fiskfperiod");
            return (Criteria) this;
        }

        public Criteria andFiskfperiodGreaterThan(Boolean value) {
            addCriterion("FISKFPeriod >", value, "fiskfperiod");
            return (Criteria) this;
        }

        public Criteria andFiskfperiodGreaterThanOrEqualTo(Boolean value) {
            addCriterion("FISKFPeriod >=", value, "fiskfperiod");
            return (Criteria) this;
        }

        public Criteria andFiskfperiodLessThan(Boolean value) {
            addCriterion("FISKFPeriod <", value, "fiskfperiod");
            return (Criteria) this;
        }

        public Criteria andFiskfperiodLessThanOrEqualTo(Boolean value) {
            addCriterion("FISKFPeriod <=", value, "fiskfperiod");
            return (Criteria) this;
        }

        public Criteria andFiskfperiodIn(List<Boolean> values) {
            addCriterion("FISKFPeriod in", values, "fiskfperiod");
            return (Criteria) this;
        }

        public Criteria andFiskfperiodNotIn(List<Boolean> values) {
            addCriterion("FISKFPeriod not in", values, "fiskfperiod");
            return (Criteria) this;
        }

        public Criteria andFiskfperiodBetween(Boolean value1, Boolean value2) {
            addCriterion("FISKFPeriod between", value1, value2, "fiskfperiod");
            return (Criteria) this;
        }

        public Criteria andFiskfperiodNotBetween(Boolean value1, Boolean value2) {
            addCriterion("FISKFPeriod not between", value1, value2, "fiskfperiod");
            return (Criteria) this;
        }

        public Criteria andFkfperiodIsNull() {
            addCriterion("FKFPeriod is null");
            return (Criteria) this;
        }

        public Criteria andFkfperiodIsNotNull() {
            addCriterion("FKFPeriod is not null");
            return (Criteria) this;
        }

        public Criteria andFkfperiodEqualTo(BigDecimal value) {
            addCriterion("FKFPeriod =", value, "fkfperiod");
            return (Criteria) this;
        }

        public Criteria andFkfperiodNotEqualTo(BigDecimal value) {
            addCriterion("FKFPeriod <>", value, "fkfperiod");
            return (Criteria) this;
        }

        public Criteria andFkfperiodGreaterThan(BigDecimal value) {
            addCriterion("FKFPeriod >", value, "fkfperiod");
            return (Criteria) this;
        }

        public Criteria andFkfperiodGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FKFPeriod >=", value, "fkfperiod");
            return (Criteria) this;
        }

        public Criteria andFkfperiodLessThan(BigDecimal value) {
            addCriterion("FKFPeriod <", value, "fkfperiod");
            return (Criteria) this;
        }

        public Criteria andFkfperiodLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FKFPeriod <=", value, "fkfperiod");
            return (Criteria) this;
        }

        public Criteria andFkfperiodIn(List<BigDecimal> values) {
            addCriterion("FKFPeriod in", values, "fkfperiod");
            return (Criteria) this;
        }

        public Criteria andFkfperiodNotIn(List<BigDecimal> values) {
            addCriterion("FKFPeriod not in", values, "fkfperiod");
            return (Criteria) this;
        }

        public Criteria andFkfperiodBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FKFPeriod between", value1, value2, "fkfperiod");
            return (Criteria) this;
        }

        public Criteria andFkfperiodNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FKFPeriod not between", value1, value2, "fkfperiod");
            return (Criteria) this;
        }

        public Criteria andFtrackIsNull() {
            addCriterion("FTrack is null");
            return (Criteria) this;
        }

        public Criteria andFtrackIsNotNull() {
            addCriterion("FTrack is not null");
            return (Criteria) this;
        }

        public Criteria andFtrackEqualTo(Integer value) {
            addCriterion("FTrack =", value, "ftrack");
            return (Criteria) this;
        }

        public Criteria andFtrackNotEqualTo(Integer value) {
            addCriterion("FTrack <>", value, "ftrack");
            return (Criteria) this;
        }

        public Criteria andFtrackGreaterThan(Integer value) {
            addCriterion("FTrack >", value, "ftrack");
            return (Criteria) this;
        }

        public Criteria andFtrackGreaterThanOrEqualTo(Integer value) {
            addCriterion("FTrack >=", value, "ftrack");
            return (Criteria) this;
        }

        public Criteria andFtrackLessThan(Integer value) {
            addCriterion("FTrack <", value, "ftrack");
            return (Criteria) this;
        }

        public Criteria andFtrackLessThanOrEqualTo(Integer value) {
            addCriterion("FTrack <=", value, "ftrack");
            return (Criteria) this;
        }

        public Criteria andFtrackIn(List<Integer> values) {
            addCriterion("FTrack in", values, "ftrack");
            return (Criteria) this;
        }

        public Criteria andFtrackNotIn(List<Integer> values) {
            addCriterion("FTrack not in", values, "ftrack");
            return (Criteria) this;
        }

        public Criteria andFtrackBetween(Integer value1, Integer value2) {
            addCriterion("FTrack between", value1, value2, "ftrack");
            return (Criteria) this;
        }

        public Criteria andFtrackNotBetween(Integer value1, Integer value2) {
            addCriterion("FTrack not between", value1, value2, "ftrack");
            return (Criteria) this;
        }

        public Criteria andFplanpriceIsNull() {
            addCriterion("FPlanPrice is null");
            return (Criteria) this;
        }

        public Criteria andFplanpriceIsNotNull() {
            addCriterion("FPlanPrice is not null");
            return (Criteria) this;
        }

        public Criteria andFplanpriceEqualTo(BigDecimal value) {
            addCriterion("FPlanPrice =", value, "fplanprice");
            return (Criteria) this;
        }

        public Criteria andFplanpriceNotEqualTo(BigDecimal value) {
            addCriterion("FPlanPrice <>", value, "fplanprice");
            return (Criteria) this;
        }

        public Criteria andFplanpriceGreaterThan(BigDecimal value) {
            addCriterion("FPlanPrice >", value, "fplanprice");
            return (Criteria) this;
        }

        public Criteria andFplanpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FPlanPrice >=", value, "fplanprice");
            return (Criteria) this;
        }

        public Criteria andFplanpriceLessThan(BigDecimal value) {
            addCriterion("FPlanPrice <", value, "fplanprice");
            return (Criteria) this;
        }

        public Criteria andFplanpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FPlanPrice <=", value, "fplanprice");
            return (Criteria) this;
        }

        public Criteria andFplanpriceIn(List<BigDecimal> values) {
            addCriterion("FPlanPrice in", values, "fplanprice");
            return (Criteria) this;
        }

        public Criteria andFplanpriceNotIn(List<BigDecimal> values) {
            addCriterion("FPlanPrice not in", values, "fplanprice");
            return (Criteria) this;
        }

        public Criteria andFplanpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FPlanPrice between", value1, value2, "fplanprice");
            return (Criteria) this;
        }

        public Criteria andFplanpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FPlanPrice not between", value1, value2, "fplanprice");
            return (Criteria) this;
        }

        public Criteria andFpricedecimalIsNull() {
            addCriterion("FPriceDecimal is null");
            return (Criteria) this;
        }

        public Criteria andFpricedecimalIsNotNull() {
            addCriterion("FPriceDecimal is not null");
            return (Criteria) this;
        }

        public Criteria andFpricedecimalEqualTo(Short value) {
            addCriterion("FPriceDecimal =", value, "fpricedecimal");
            return (Criteria) this;
        }

        public Criteria andFpricedecimalNotEqualTo(Short value) {
            addCriterion("FPriceDecimal <>", value, "fpricedecimal");
            return (Criteria) this;
        }

        public Criteria andFpricedecimalGreaterThan(Short value) {
            addCriterion("FPriceDecimal >", value, "fpricedecimal");
            return (Criteria) this;
        }

        public Criteria andFpricedecimalGreaterThanOrEqualTo(Short value) {
            addCriterion("FPriceDecimal >=", value, "fpricedecimal");
            return (Criteria) this;
        }

        public Criteria andFpricedecimalLessThan(Short value) {
            addCriterion("FPriceDecimal <", value, "fpricedecimal");
            return (Criteria) this;
        }

        public Criteria andFpricedecimalLessThanOrEqualTo(Short value) {
            addCriterion("FPriceDecimal <=", value, "fpricedecimal");
            return (Criteria) this;
        }

        public Criteria andFpricedecimalIn(List<Short> values) {
            addCriterion("FPriceDecimal in", values, "fpricedecimal");
            return (Criteria) this;
        }

        public Criteria andFpricedecimalNotIn(List<Short> values) {
            addCriterion("FPriceDecimal not in", values, "fpricedecimal");
            return (Criteria) this;
        }

        public Criteria andFpricedecimalBetween(Short value1, Short value2) {
            addCriterion("FPriceDecimal between", value1, value2, "fpricedecimal");
            return (Criteria) this;
        }

        public Criteria andFpricedecimalNotBetween(Short value1, Short value2) {
            addCriterion("FPriceDecimal not between", value1, value2, "fpricedecimal");
            return (Criteria) this;
        }

        public Criteria andFacctidIsNull() {
            addCriterion("FAcctID is null");
            return (Criteria) this;
        }

        public Criteria andFacctidIsNotNull() {
            addCriterion("FAcctID is not null");
            return (Criteria) this;
        }

        public Criteria andFacctidEqualTo(Integer value) {
            addCriterion("FAcctID =", value, "facctid");
            return (Criteria) this;
        }

        public Criteria andFacctidNotEqualTo(Integer value) {
            addCriterion("FAcctID <>", value, "facctid");
            return (Criteria) this;
        }

        public Criteria andFacctidGreaterThan(Integer value) {
            addCriterion("FAcctID >", value, "facctid");
            return (Criteria) this;
        }

        public Criteria andFacctidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FAcctID >=", value, "facctid");
            return (Criteria) this;
        }

        public Criteria andFacctidLessThan(Integer value) {
            addCriterion("FAcctID <", value, "facctid");
            return (Criteria) this;
        }

        public Criteria andFacctidLessThanOrEqualTo(Integer value) {
            addCriterion("FAcctID <=", value, "facctid");
            return (Criteria) this;
        }

        public Criteria andFacctidIn(List<Integer> values) {
            addCriterion("FAcctID in", values, "facctid");
            return (Criteria) this;
        }

        public Criteria andFacctidNotIn(List<Integer> values) {
            addCriterion("FAcctID not in", values, "facctid");
            return (Criteria) this;
        }

        public Criteria andFacctidBetween(Integer value1, Integer value2) {
            addCriterion("FAcctID between", value1, value2, "facctid");
            return (Criteria) this;
        }

        public Criteria andFacctidNotBetween(Integer value1, Integer value2) {
            addCriterion("FAcctID not between", value1, value2, "facctid");
            return (Criteria) this;
        }

        public Criteria andFsaleacctidIsNull() {
            addCriterion("FSaleAcctID is null");
            return (Criteria) this;
        }

        public Criteria andFsaleacctidIsNotNull() {
            addCriterion("FSaleAcctID is not null");
            return (Criteria) this;
        }

        public Criteria andFsaleacctidEqualTo(Integer value) {
            addCriterion("FSaleAcctID =", value, "fsaleacctid");
            return (Criteria) this;
        }

        public Criteria andFsaleacctidNotEqualTo(Integer value) {
            addCriterion("FSaleAcctID <>", value, "fsaleacctid");
            return (Criteria) this;
        }

        public Criteria andFsaleacctidGreaterThan(Integer value) {
            addCriterion("FSaleAcctID >", value, "fsaleacctid");
            return (Criteria) this;
        }

        public Criteria andFsaleacctidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FSaleAcctID >=", value, "fsaleacctid");
            return (Criteria) this;
        }

        public Criteria andFsaleacctidLessThan(Integer value) {
            addCriterion("FSaleAcctID <", value, "fsaleacctid");
            return (Criteria) this;
        }

        public Criteria andFsaleacctidLessThanOrEqualTo(Integer value) {
            addCriterion("FSaleAcctID <=", value, "fsaleacctid");
            return (Criteria) this;
        }

        public Criteria andFsaleacctidIn(List<Integer> values) {
            addCriterion("FSaleAcctID in", values, "fsaleacctid");
            return (Criteria) this;
        }

        public Criteria andFsaleacctidNotIn(List<Integer> values) {
            addCriterion("FSaleAcctID not in", values, "fsaleacctid");
            return (Criteria) this;
        }

        public Criteria andFsaleacctidBetween(Integer value1, Integer value2) {
            addCriterion("FSaleAcctID between", value1, value2, "fsaleacctid");
            return (Criteria) this;
        }

        public Criteria andFsaleacctidNotBetween(Integer value1, Integer value2) {
            addCriterion("FSaleAcctID not between", value1, value2, "fsaleacctid");
            return (Criteria) this;
        }

        public Criteria andFcostacctidIsNull() {
            addCriterion("FCostAcctID is null");
            return (Criteria) this;
        }

        public Criteria andFcostacctidIsNotNull() {
            addCriterion("FCostAcctID is not null");
            return (Criteria) this;
        }

        public Criteria andFcostacctidEqualTo(Integer value) {
            addCriterion("FCostAcctID =", value, "fcostacctid");
            return (Criteria) this;
        }

        public Criteria andFcostacctidNotEqualTo(Integer value) {
            addCriterion("FCostAcctID <>", value, "fcostacctid");
            return (Criteria) this;
        }

        public Criteria andFcostacctidGreaterThan(Integer value) {
            addCriterion("FCostAcctID >", value, "fcostacctid");
            return (Criteria) this;
        }

        public Criteria andFcostacctidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FCostAcctID >=", value, "fcostacctid");
            return (Criteria) this;
        }

        public Criteria andFcostacctidLessThan(Integer value) {
            addCriterion("FCostAcctID <", value, "fcostacctid");
            return (Criteria) this;
        }

        public Criteria andFcostacctidLessThanOrEqualTo(Integer value) {
            addCriterion("FCostAcctID <=", value, "fcostacctid");
            return (Criteria) this;
        }

        public Criteria andFcostacctidIn(List<Integer> values) {
            addCriterion("FCostAcctID in", values, "fcostacctid");
            return (Criteria) this;
        }

        public Criteria andFcostacctidNotIn(List<Integer> values) {
            addCriterion("FCostAcctID not in", values, "fcostacctid");
            return (Criteria) this;
        }

        public Criteria andFcostacctidBetween(Integer value1, Integer value2) {
            addCriterion("FCostAcctID between", value1, value2, "fcostacctid");
            return (Criteria) this;
        }

        public Criteria andFcostacctidNotBetween(Integer value1, Integer value2) {
            addCriterion("FCostAcctID not between", value1, value2, "fcostacctid");
            return (Criteria) this;
        }

        public Criteria andFapacctidIsNull() {
            addCriterion("FAPAcctID is null");
            return (Criteria) this;
        }

        public Criteria andFapacctidIsNotNull() {
            addCriterion("FAPAcctID is not null");
            return (Criteria) this;
        }

        public Criteria andFapacctidEqualTo(Integer value) {
            addCriterion("FAPAcctID =", value, "fapacctid");
            return (Criteria) this;
        }

        public Criteria andFapacctidNotEqualTo(Integer value) {
            addCriterion("FAPAcctID <>", value, "fapacctid");
            return (Criteria) this;
        }

        public Criteria andFapacctidGreaterThan(Integer value) {
            addCriterion("FAPAcctID >", value, "fapacctid");
            return (Criteria) this;
        }

        public Criteria andFapacctidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FAPAcctID >=", value, "fapacctid");
            return (Criteria) this;
        }

        public Criteria andFapacctidLessThan(Integer value) {
            addCriterion("FAPAcctID <", value, "fapacctid");
            return (Criteria) this;
        }

        public Criteria andFapacctidLessThanOrEqualTo(Integer value) {
            addCriterion("FAPAcctID <=", value, "fapacctid");
            return (Criteria) this;
        }

        public Criteria andFapacctidIn(List<Integer> values) {
            addCriterion("FAPAcctID in", values, "fapacctid");
            return (Criteria) this;
        }

        public Criteria andFapacctidNotIn(List<Integer> values) {
            addCriterion("FAPAcctID not in", values, "fapacctid");
            return (Criteria) this;
        }

        public Criteria andFapacctidBetween(Integer value1, Integer value2) {
            addCriterion("FAPAcctID between", value1, value2, "fapacctid");
            return (Criteria) this;
        }

        public Criteria andFapacctidNotBetween(Integer value1, Integer value2) {
            addCriterion("FAPAcctID not between", value1, value2, "fapacctid");
            return (Criteria) this;
        }

        public Criteria andFgoodspecIsNull() {
            addCriterion("FGoodSpec is null");
            return (Criteria) this;
        }

        public Criteria andFgoodspecIsNotNull() {
            addCriterion("FGoodSpec is not null");
            return (Criteria) this;
        }

        public Criteria andFgoodspecEqualTo(Integer value) {
            addCriterion("FGoodSpec =", value, "fgoodspec");
            return (Criteria) this;
        }

        public Criteria andFgoodspecNotEqualTo(Integer value) {
            addCriterion("FGoodSpec <>", value, "fgoodspec");
            return (Criteria) this;
        }

        public Criteria andFgoodspecGreaterThan(Integer value) {
            addCriterion("FGoodSpec >", value, "fgoodspec");
            return (Criteria) this;
        }

        public Criteria andFgoodspecGreaterThanOrEqualTo(Integer value) {
            addCriterion("FGoodSpec >=", value, "fgoodspec");
            return (Criteria) this;
        }

        public Criteria andFgoodspecLessThan(Integer value) {
            addCriterion("FGoodSpec <", value, "fgoodspec");
            return (Criteria) this;
        }

        public Criteria andFgoodspecLessThanOrEqualTo(Integer value) {
            addCriterion("FGoodSpec <=", value, "fgoodspec");
            return (Criteria) this;
        }

        public Criteria andFgoodspecIn(List<Integer> values) {
            addCriterion("FGoodSpec in", values, "fgoodspec");
            return (Criteria) this;
        }

        public Criteria andFgoodspecNotIn(List<Integer> values) {
            addCriterion("FGoodSpec not in", values, "fgoodspec");
            return (Criteria) this;
        }

        public Criteria andFgoodspecBetween(Integer value1, Integer value2) {
            addCriterion("FGoodSpec between", value1, value2, "fgoodspec");
            return (Criteria) this;
        }

        public Criteria andFgoodspecNotBetween(Integer value1, Integer value2) {
            addCriterion("FGoodSpec not between", value1, value2, "fgoodspec");
            return (Criteria) this;
        }

        public Criteria andFcostprojectIsNull() {
            addCriterion("FCostProject is null");
            return (Criteria) this;
        }

        public Criteria andFcostprojectIsNotNull() {
            addCriterion("FCostProject is not null");
            return (Criteria) this;
        }

        public Criteria andFcostprojectEqualTo(Integer value) {
            addCriterion("FCostProject =", value, "fcostproject");
            return (Criteria) this;
        }

        public Criteria andFcostprojectNotEqualTo(Integer value) {
            addCriterion("FCostProject <>", value, "fcostproject");
            return (Criteria) this;
        }

        public Criteria andFcostprojectGreaterThan(Integer value) {
            addCriterion("FCostProject >", value, "fcostproject");
            return (Criteria) this;
        }

        public Criteria andFcostprojectGreaterThanOrEqualTo(Integer value) {
            addCriterion("FCostProject >=", value, "fcostproject");
            return (Criteria) this;
        }

        public Criteria andFcostprojectLessThan(Integer value) {
            addCriterion("FCostProject <", value, "fcostproject");
            return (Criteria) this;
        }

        public Criteria andFcostprojectLessThanOrEqualTo(Integer value) {
            addCriterion("FCostProject <=", value, "fcostproject");
            return (Criteria) this;
        }

        public Criteria andFcostprojectIn(List<Integer> values) {
            addCriterion("FCostProject in", values, "fcostproject");
            return (Criteria) this;
        }

        public Criteria andFcostprojectNotIn(List<Integer> values) {
            addCriterion("FCostProject not in", values, "fcostproject");
            return (Criteria) this;
        }

        public Criteria andFcostprojectBetween(Integer value1, Integer value2) {
            addCriterion("FCostProject between", value1, value2, "fcostproject");
            return (Criteria) this;
        }

        public Criteria andFcostprojectNotBetween(Integer value1, Integer value2) {
            addCriterion("FCostProject not between", value1, value2, "fcostproject");
            return (Criteria) this;
        }

        public Criteria andFissnmanageIsNull() {
            addCriterion("FIsSnManage is null");
            return (Criteria) this;
        }

        public Criteria andFissnmanageIsNotNull() {
            addCriterion("FIsSnManage is not null");
            return (Criteria) this;
        }

        public Criteria andFissnmanageEqualTo(Boolean value) {
            addCriterion("FIsSnManage =", value, "fissnmanage");
            return (Criteria) this;
        }

        public Criteria andFissnmanageNotEqualTo(Boolean value) {
            addCriterion("FIsSnManage <>", value, "fissnmanage");
            return (Criteria) this;
        }

        public Criteria andFissnmanageGreaterThan(Boolean value) {
            addCriterion("FIsSnManage >", value, "fissnmanage");
            return (Criteria) this;
        }

        public Criteria andFissnmanageGreaterThanOrEqualTo(Boolean value) {
            addCriterion("FIsSnManage >=", value, "fissnmanage");
            return (Criteria) this;
        }

        public Criteria andFissnmanageLessThan(Boolean value) {
            addCriterion("FIsSnManage <", value, "fissnmanage");
            return (Criteria) this;
        }

        public Criteria andFissnmanageLessThanOrEqualTo(Boolean value) {
            addCriterion("FIsSnManage <=", value, "fissnmanage");
            return (Criteria) this;
        }

        public Criteria andFissnmanageIn(List<Boolean> values) {
            addCriterion("FIsSnManage in", values, "fissnmanage");
            return (Criteria) this;
        }

        public Criteria andFissnmanageNotIn(List<Boolean> values) {
            addCriterion("FIsSnManage not in", values, "fissnmanage");
            return (Criteria) this;
        }

        public Criteria andFissnmanageBetween(Boolean value1, Boolean value2) {
            addCriterion("FIsSnManage between", value1, value2, "fissnmanage");
            return (Criteria) this;
        }

        public Criteria andFissnmanageNotBetween(Boolean value1, Boolean value2) {
            addCriterion("FIsSnManage not between", value1, value2, "fissnmanage");
            return (Criteria) this;
        }

        public Criteria andFstocktimeIsNull() {
            addCriterion("FStockTime is null");
            return (Criteria) this;
        }

        public Criteria andFstocktimeIsNotNull() {
            addCriterion("FStockTime is not null");
            return (Criteria) this;
        }

        public Criteria andFstocktimeEqualTo(Boolean value) {
            addCriterion("FStockTime =", value, "fstocktime");
            return (Criteria) this;
        }

        public Criteria andFstocktimeNotEqualTo(Boolean value) {
            addCriterion("FStockTime <>", value, "fstocktime");
            return (Criteria) this;
        }

        public Criteria andFstocktimeGreaterThan(Boolean value) {
            addCriterion("FStockTime >", value, "fstocktime");
            return (Criteria) this;
        }

        public Criteria andFstocktimeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("FStockTime >=", value, "fstocktime");
            return (Criteria) this;
        }

        public Criteria andFstocktimeLessThan(Boolean value) {
            addCriterion("FStockTime <", value, "fstocktime");
            return (Criteria) this;
        }

        public Criteria andFstocktimeLessThanOrEqualTo(Boolean value) {
            addCriterion("FStockTime <=", value, "fstocktime");
            return (Criteria) this;
        }

        public Criteria andFstocktimeIn(List<Boolean> values) {
            addCriterion("FStockTime in", values, "fstocktime");
            return (Criteria) this;
        }

        public Criteria andFstocktimeNotIn(List<Boolean> values) {
            addCriterion("FStockTime not in", values, "fstocktime");
            return (Criteria) this;
        }

        public Criteria andFstocktimeBetween(Boolean value1, Boolean value2) {
            addCriterion("FStockTime between", value1, value2, "fstocktime");
            return (Criteria) this;
        }

        public Criteria andFstocktimeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("FStockTime not between", value1, value2, "fstocktime");
            return (Criteria) this;
        }

        public Criteria andFbookplanIsNull() {
            addCriterion("FBookPlan is null");
            return (Criteria) this;
        }

        public Criteria andFbookplanIsNotNull() {
            addCriterion("FBookPlan is not null");
            return (Criteria) this;
        }

        public Criteria andFbookplanEqualTo(Boolean value) {
            addCriterion("FBookPlan =", value, "fbookplan");
            return (Criteria) this;
        }

        public Criteria andFbookplanNotEqualTo(Boolean value) {
            addCriterion("FBookPlan <>", value, "fbookplan");
            return (Criteria) this;
        }

        public Criteria andFbookplanGreaterThan(Boolean value) {
            addCriterion("FBookPlan >", value, "fbookplan");
            return (Criteria) this;
        }

        public Criteria andFbookplanGreaterThanOrEqualTo(Boolean value) {
            addCriterion("FBookPlan >=", value, "fbookplan");
            return (Criteria) this;
        }

        public Criteria andFbookplanLessThan(Boolean value) {
            addCriterion("FBookPlan <", value, "fbookplan");
            return (Criteria) this;
        }

        public Criteria andFbookplanLessThanOrEqualTo(Boolean value) {
            addCriterion("FBookPlan <=", value, "fbookplan");
            return (Criteria) this;
        }

        public Criteria andFbookplanIn(List<Boolean> values) {
            addCriterion("FBookPlan in", values, "fbookplan");
            return (Criteria) this;
        }

        public Criteria andFbookplanNotIn(List<Boolean> values) {
            addCriterion("FBookPlan not in", values, "fbookplan");
            return (Criteria) this;
        }

        public Criteria andFbookplanBetween(Boolean value1, Boolean value2) {
            addCriterion("FBookPlan between", value1, value2, "fbookplan");
            return (Criteria) this;
        }

        public Criteria andFbookplanNotBetween(Boolean value1, Boolean value2) {
            addCriterion("FBookPlan not between", value1, value2, "fbookplan");
            return (Criteria) this;
        }

        public Criteria andFbeforeexpireIsNull() {
            addCriterion("FBeforeExpire is null");
            return (Criteria) this;
        }

        public Criteria andFbeforeexpireIsNotNull() {
            addCriterion("FBeforeExpire is not null");
            return (Criteria) this;
        }

        public Criteria andFbeforeexpireEqualTo(Integer value) {
            addCriterion("FBeforeExpire =", value, "fbeforeexpire");
            return (Criteria) this;
        }

        public Criteria andFbeforeexpireNotEqualTo(Integer value) {
            addCriterion("FBeforeExpire <>", value, "fbeforeexpire");
            return (Criteria) this;
        }

        public Criteria andFbeforeexpireGreaterThan(Integer value) {
            addCriterion("FBeforeExpire >", value, "fbeforeexpire");
            return (Criteria) this;
        }

        public Criteria andFbeforeexpireGreaterThanOrEqualTo(Integer value) {
            addCriterion("FBeforeExpire >=", value, "fbeforeexpire");
            return (Criteria) this;
        }

        public Criteria andFbeforeexpireLessThan(Integer value) {
            addCriterion("FBeforeExpire <", value, "fbeforeexpire");
            return (Criteria) this;
        }

        public Criteria andFbeforeexpireLessThanOrEqualTo(Integer value) {
            addCriterion("FBeforeExpire <=", value, "fbeforeexpire");
            return (Criteria) this;
        }

        public Criteria andFbeforeexpireIn(List<Integer> values) {
            addCriterion("FBeforeExpire in", values, "fbeforeexpire");
            return (Criteria) this;
        }

        public Criteria andFbeforeexpireNotIn(List<Integer> values) {
            addCriterion("FBeforeExpire not in", values, "fbeforeexpire");
            return (Criteria) this;
        }

        public Criteria andFbeforeexpireBetween(Integer value1, Integer value2) {
            addCriterion("FBeforeExpire between", value1, value2, "fbeforeexpire");
            return (Criteria) this;
        }

        public Criteria andFbeforeexpireNotBetween(Integer value1, Integer value2) {
            addCriterion("FBeforeExpire not between", value1, value2, "fbeforeexpire");
            return (Criteria) this;
        }

        public Criteria andFtaxrateIsNull() {
            addCriterion("FTaxRate is null");
            return (Criteria) this;
        }

        public Criteria andFtaxrateIsNotNull() {
            addCriterion("FTaxRate is not null");
            return (Criteria) this;
        }

        public Criteria andFtaxrateEqualTo(Integer value) {
            addCriterion("FTaxRate =", value, "ftaxrate");
            return (Criteria) this;
        }

        public Criteria andFtaxrateNotEqualTo(Integer value) {
            addCriterion("FTaxRate <>", value, "ftaxrate");
            return (Criteria) this;
        }

        public Criteria andFtaxrateGreaterThan(Integer value) {
            addCriterion("FTaxRate >", value, "ftaxrate");
            return (Criteria) this;
        }

        public Criteria andFtaxrateGreaterThanOrEqualTo(Integer value) {
            addCriterion("FTaxRate >=", value, "ftaxrate");
            return (Criteria) this;
        }

        public Criteria andFtaxrateLessThan(Integer value) {
            addCriterion("FTaxRate <", value, "ftaxrate");
            return (Criteria) this;
        }

        public Criteria andFtaxrateLessThanOrEqualTo(Integer value) {
            addCriterion("FTaxRate <=", value, "ftaxrate");
            return (Criteria) this;
        }

        public Criteria andFtaxrateIn(List<Integer> values) {
            addCriterion("FTaxRate in", values, "ftaxrate");
            return (Criteria) this;
        }

        public Criteria andFtaxrateNotIn(List<Integer> values) {
            addCriterion("FTaxRate not in", values, "ftaxrate");
            return (Criteria) this;
        }

        public Criteria andFtaxrateBetween(Integer value1, Integer value2) {
            addCriterion("FTaxRate between", value1, value2, "ftaxrate");
            return (Criteria) this;
        }

        public Criteria andFtaxrateNotBetween(Integer value1, Integer value2) {
            addCriterion("FTaxRate not between", value1, value2, "ftaxrate");
            return (Criteria) this;
        }

        public Criteria andFadminacctidIsNull() {
            addCriterion("FAdminAcctID is null");
            return (Criteria) this;
        }

        public Criteria andFadminacctidIsNotNull() {
            addCriterion("FAdminAcctID is not null");
            return (Criteria) this;
        }

        public Criteria andFadminacctidEqualTo(Integer value) {
            addCriterion("FAdminAcctID =", value, "fadminacctid");
            return (Criteria) this;
        }

        public Criteria andFadminacctidNotEqualTo(Integer value) {
            addCriterion("FAdminAcctID <>", value, "fadminacctid");
            return (Criteria) this;
        }

        public Criteria andFadminacctidGreaterThan(Integer value) {
            addCriterion("FAdminAcctID >", value, "fadminacctid");
            return (Criteria) this;
        }

        public Criteria andFadminacctidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FAdminAcctID >=", value, "fadminacctid");
            return (Criteria) this;
        }

        public Criteria andFadminacctidLessThan(Integer value) {
            addCriterion("FAdminAcctID <", value, "fadminacctid");
            return (Criteria) this;
        }

        public Criteria andFadminacctidLessThanOrEqualTo(Integer value) {
            addCriterion("FAdminAcctID <=", value, "fadminacctid");
            return (Criteria) this;
        }

        public Criteria andFadminacctidIn(List<Integer> values) {
            addCriterion("FAdminAcctID in", values, "fadminacctid");
            return (Criteria) this;
        }

        public Criteria andFadminacctidNotIn(List<Integer> values) {
            addCriterion("FAdminAcctID not in", values, "fadminacctid");
            return (Criteria) this;
        }

        public Criteria andFadminacctidBetween(Integer value1, Integer value2) {
            addCriterion("FAdminAcctID between", value1, value2, "fadminacctid");
            return (Criteria) this;
        }

        public Criteria andFadminacctidNotBetween(Integer value1, Integer value2) {
            addCriterion("FAdminAcctID not between", value1, value2, "fadminacctid");
            return (Criteria) this;
        }

        public Criteria andFnoteIsNull() {
            addCriterion("FNote is null");
            return (Criteria) this;
        }

        public Criteria andFnoteIsNotNull() {
            addCriterion("FNote is not null");
            return (Criteria) this;
        }

        public Criteria andFnoteEqualTo(String value) {
            addCriterion("FNote =", value, "fnote");
            return (Criteria) this;
        }

        public Criteria andFnoteNotEqualTo(String value) {
            addCriterion("FNote <>", value, "fnote");
            return (Criteria) this;
        }

        public Criteria andFnoteGreaterThan(String value) {
            addCriterion("FNote >", value, "fnote");
            return (Criteria) this;
        }

        public Criteria andFnoteGreaterThanOrEqualTo(String value) {
            addCriterion("FNote >=", value, "fnote");
            return (Criteria) this;
        }

        public Criteria andFnoteLessThan(String value) {
            addCriterion("FNote <", value, "fnote");
            return (Criteria) this;
        }

        public Criteria andFnoteLessThanOrEqualTo(String value) {
            addCriterion("FNote <=", value, "fnote");
            return (Criteria) this;
        }

        public Criteria andFnoteLike(String value) {
            addCriterion("FNote like", value, "fnote");
            return (Criteria) this;
        }

        public Criteria andFnoteNotLike(String value) {
            addCriterion("FNote not like", value, "fnote");
            return (Criteria) this;
        }

        public Criteria andFnoteIn(List<String> values) {
            addCriterion("FNote in", values, "fnote");
            return (Criteria) this;
        }

        public Criteria andFnoteNotIn(List<String> values) {
            addCriterion("FNote not in", values, "fnote");
            return (Criteria) this;
        }

        public Criteria andFnoteBetween(String value1, String value2) {
            addCriterion("FNote between", value1, value2, "fnote");
            return (Criteria) this;
        }

        public Criteria andFnoteNotBetween(String value1, String value2) {
            addCriterion("FNote not between", value1, value2, "fnote");
            return (Criteria) this;
        }

        public Criteria andFisspecialtaxIsNull() {
            addCriterion("FIsSpecialTax is null");
            return (Criteria) this;
        }

        public Criteria andFisspecialtaxIsNotNull() {
            addCriterion("FIsSpecialTax is not null");
            return (Criteria) this;
        }

        public Criteria andFisspecialtaxEqualTo(Boolean value) {
            addCriterion("FIsSpecialTax =", value, "fisspecialtax");
            return (Criteria) this;
        }

        public Criteria andFisspecialtaxNotEqualTo(Boolean value) {
            addCriterion("FIsSpecialTax <>", value, "fisspecialtax");
            return (Criteria) this;
        }

        public Criteria andFisspecialtaxGreaterThan(Boolean value) {
            addCriterion("FIsSpecialTax >", value, "fisspecialtax");
            return (Criteria) this;
        }

        public Criteria andFisspecialtaxGreaterThanOrEqualTo(Boolean value) {
            addCriterion("FIsSpecialTax >=", value, "fisspecialtax");
            return (Criteria) this;
        }

        public Criteria andFisspecialtaxLessThan(Boolean value) {
            addCriterion("FIsSpecialTax <", value, "fisspecialtax");
            return (Criteria) this;
        }

        public Criteria andFisspecialtaxLessThanOrEqualTo(Boolean value) {
            addCriterion("FIsSpecialTax <=", value, "fisspecialtax");
            return (Criteria) this;
        }

        public Criteria andFisspecialtaxIn(List<Boolean> values) {
            addCriterion("FIsSpecialTax in", values, "fisspecialtax");
            return (Criteria) this;
        }

        public Criteria andFisspecialtaxNotIn(List<Boolean> values) {
            addCriterion("FIsSpecialTax not in", values, "fisspecialtax");
            return (Criteria) this;
        }

        public Criteria andFisspecialtaxBetween(Boolean value1, Boolean value2) {
            addCriterion("FIsSpecialTax between", value1, value2, "fisspecialtax");
            return (Criteria) this;
        }

        public Criteria andFisspecialtaxNotBetween(Boolean value1, Boolean value2) {
            addCriterion("FIsSpecialTax not between", value1, value2, "fisspecialtax");
            return (Criteria) this;
        }

        public Criteria andFsohighlimitIsNull() {
            addCriterion("FSOHighLimit is null");
            return (Criteria) this;
        }

        public Criteria andFsohighlimitIsNotNull() {
            addCriterion("FSOHighLimit is not null");
            return (Criteria) this;
        }

        public Criteria andFsohighlimitEqualTo(BigDecimal value) {
            addCriterion("FSOHighLimit =", value, "fsohighlimit");
            return (Criteria) this;
        }

        public Criteria andFsohighlimitNotEqualTo(BigDecimal value) {
            addCriterion("FSOHighLimit <>", value, "fsohighlimit");
            return (Criteria) this;
        }

        public Criteria andFsohighlimitGreaterThan(BigDecimal value) {
            addCriterion("FSOHighLimit >", value, "fsohighlimit");
            return (Criteria) this;
        }

        public Criteria andFsohighlimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FSOHighLimit >=", value, "fsohighlimit");
            return (Criteria) this;
        }

        public Criteria andFsohighlimitLessThan(BigDecimal value) {
            addCriterion("FSOHighLimit <", value, "fsohighlimit");
            return (Criteria) this;
        }

        public Criteria andFsohighlimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FSOHighLimit <=", value, "fsohighlimit");
            return (Criteria) this;
        }

        public Criteria andFsohighlimitIn(List<BigDecimal> values) {
            addCriterion("FSOHighLimit in", values, "fsohighlimit");
            return (Criteria) this;
        }

        public Criteria andFsohighlimitNotIn(List<BigDecimal> values) {
            addCriterion("FSOHighLimit not in", values, "fsohighlimit");
            return (Criteria) this;
        }

        public Criteria andFsohighlimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FSOHighLimit between", value1, value2, "fsohighlimit");
            return (Criteria) this;
        }

        public Criteria andFsohighlimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FSOHighLimit not between", value1, value2, "fsohighlimit");
            return (Criteria) this;
        }

        public Criteria andFsolowlimitIsNull() {
            addCriterion("FSOLowLimit is null");
            return (Criteria) this;
        }

        public Criteria andFsolowlimitIsNotNull() {
            addCriterion("FSOLowLimit is not null");
            return (Criteria) this;
        }

        public Criteria andFsolowlimitEqualTo(BigDecimal value) {
            addCriterion("FSOLowLimit =", value, "fsolowlimit");
            return (Criteria) this;
        }

        public Criteria andFsolowlimitNotEqualTo(BigDecimal value) {
            addCriterion("FSOLowLimit <>", value, "fsolowlimit");
            return (Criteria) this;
        }

        public Criteria andFsolowlimitGreaterThan(BigDecimal value) {
            addCriterion("FSOLowLimit >", value, "fsolowlimit");
            return (Criteria) this;
        }

        public Criteria andFsolowlimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FSOLowLimit >=", value, "fsolowlimit");
            return (Criteria) this;
        }

        public Criteria andFsolowlimitLessThan(BigDecimal value) {
            addCriterion("FSOLowLimit <", value, "fsolowlimit");
            return (Criteria) this;
        }

        public Criteria andFsolowlimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FSOLowLimit <=", value, "fsolowlimit");
            return (Criteria) this;
        }

        public Criteria andFsolowlimitIn(List<BigDecimal> values) {
            addCriterion("FSOLowLimit in", values, "fsolowlimit");
            return (Criteria) this;
        }

        public Criteria andFsolowlimitNotIn(List<BigDecimal> values) {
            addCriterion("FSOLowLimit not in", values, "fsolowlimit");
            return (Criteria) this;
        }

        public Criteria andFsolowlimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FSOLowLimit between", value1, value2, "fsolowlimit");
            return (Criteria) this;
        }

        public Criteria andFsolowlimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FSOLowLimit not between", value1, value2, "fsolowlimit");
            return (Criteria) this;
        }

        public Criteria andFoihighlimitIsNull() {
            addCriterion("FOIHighLimit is null");
            return (Criteria) this;
        }

        public Criteria andFoihighlimitIsNotNull() {
            addCriterion("FOIHighLimit is not null");
            return (Criteria) this;
        }

        public Criteria andFoihighlimitEqualTo(BigDecimal value) {
            addCriterion("FOIHighLimit =", value, "foihighlimit");
            return (Criteria) this;
        }

        public Criteria andFoihighlimitNotEqualTo(BigDecimal value) {
            addCriterion("FOIHighLimit <>", value, "foihighlimit");
            return (Criteria) this;
        }

        public Criteria andFoihighlimitGreaterThan(BigDecimal value) {
            addCriterion("FOIHighLimit >", value, "foihighlimit");
            return (Criteria) this;
        }

        public Criteria andFoihighlimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FOIHighLimit >=", value, "foihighlimit");
            return (Criteria) this;
        }

        public Criteria andFoihighlimitLessThan(BigDecimal value) {
            addCriterion("FOIHighLimit <", value, "foihighlimit");
            return (Criteria) this;
        }

        public Criteria andFoihighlimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FOIHighLimit <=", value, "foihighlimit");
            return (Criteria) this;
        }

        public Criteria andFoihighlimitIn(List<BigDecimal> values) {
            addCriterion("FOIHighLimit in", values, "foihighlimit");
            return (Criteria) this;
        }

        public Criteria andFoihighlimitNotIn(List<BigDecimal> values) {
            addCriterion("FOIHighLimit not in", values, "foihighlimit");
            return (Criteria) this;
        }

        public Criteria andFoihighlimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FOIHighLimit between", value1, value2, "foihighlimit");
            return (Criteria) this;
        }

        public Criteria andFoihighlimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FOIHighLimit not between", value1, value2, "foihighlimit");
            return (Criteria) this;
        }

        public Criteria andFoilowlimitIsNull() {
            addCriterion("FOILowLimit is null");
            return (Criteria) this;
        }

        public Criteria andFoilowlimitIsNotNull() {
            addCriterion("FOILowLimit is not null");
            return (Criteria) this;
        }

        public Criteria andFoilowlimitEqualTo(BigDecimal value) {
            addCriterion("FOILowLimit =", value, "foilowlimit");
            return (Criteria) this;
        }

        public Criteria andFoilowlimitNotEqualTo(BigDecimal value) {
            addCriterion("FOILowLimit <>", value, "foilowlimit");
            return (Criteria) this;
        }

        public Criteria andFoilowlimitGreaterThan(BigDecimal value) {
            addCriterion("FOILowLimit >", value, "foilowlimit");
            return (Criteria) this;
        }

        public Criteria andFoilowlimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FOILowLimit >=", value, "foilowlimit");
            return (Criteria) this;
        }

        public Criteria andFoilowlimitLessThan(BigDecimal value) {
            addCriterion("FOILowLimit <", value, "foilowlimit");
            return (Criteria) this;
        }

        public Criteria andFoilowlimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FOILowLimit <=", value, "foilowlimit");
            return (Criteria) this;
        }

        public Criteria andFoilowlimitIn(List<BigDecimal> values) {
            addCriterion("FOILowLimit in", values, "foilowlimit");
            return (Criteria) this;
        }

        public Criteria andFoilowlimitNotIn(List<BigDecimal> values) {
            addCriterion("FOILowLimit not in", values, "foilowlimit");
            return (Criteria) this;
        }

        public Criteria andFoilowlimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FOILowLimit between", value1, value2, "foilowlimit");
            return (Criteria) this;
        }

        public Criteria andFoilowlimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FOILowLimit not between", value1, value2, "foilowlimit");
            return (Criteria) this;
        }

        public Criteria andFdaysperIsNull() {
            addCriterion("FDaysPer is null");
            return (Criteria) this;
        }

        public Criteria andFdaysperIsNotNull() {
            addCriterion("FDaysPer is not null");
            return (Criteria) this;
        }

        public Criteria andFdaysperEqualTo(Integer value) {
            addCriterion("FDaysPer =", value, "fdaysper");
            return (Criteria) this;
        }

        public Criteria andFdaysperNotEqualTo(Integer value) {
            addCriterion("FDaysPer <>", value, "fdaysper");
            return (Criteria) this;
        }

        public Criteria andFdaysperGreaterThan(Integer value) {
            addCriterion("FDaysPer >", value, "fdaysper");
            return (Criteria) this;
        }

        public Criteria andFdaysperGreaterThanOrEqualTo(Integer value) {
            addCriterion("FDaysPer >=", value, "fdaysper");
            return (Criteria) this;
        }

        public Criteria andFdaysperLessThan(Integer value) {
            addCriterion("FDaysPer <", value, "fdaysper");
            return (Criteria) this;
        }

        public Criteria andFdaysperLessThanOrEqualTo(Integer value) {
            addCriterion("FDaysPer <=", value, "fdaysper");
            return (Criteria) this;
        }

        public Criteria andFdaysperIn(List<Integer> values) {
            addCriterion("FDaysPer in", values, "fdaysper");
            return (Criteria) this;
        }

        public Criteria andFdaysperNotIn(List<Integer> values) {
            addCriterion("FDaysPer not in", values, "fdaysper");
            return (Criteria) this;
        }

        public Criteria andFdaysperBetween(Integer value1, Integer value2) {
            addCriterion("FDaysPer between", value1, value2, "fdaysper");
            return (Criteria) this;
        }

        public Criteria andFdaysperNotBetween(Integer value1, Integer value2) {
            addCriterion("FDaysPer not between", value1, value2, "fdaysper");
            return (Criteria) this;
        }

        public Criteria andFlastcheckdateIsNull() {
            addCriterion("FLastCheckDate is null");
            return (Criteria) this;
        }

        public Criteria andFlastcheckdateIsNotNull() {
            addCriterion("FLastCheckDate is not null");
            return (Criteria) this;
        }

        public Criteria andFlastcheckdateEqualTo(Date value) {
            addCriterion("FLastCheckDate =", value, "flastcheckdate");
            return (Criteria) this;
        }

        public Criteria andFlastcheckdateNotEqualTo(Date value) {
            addCriterion("FLastCheckDate <>", value, "flastcheckdate");
            return (Criteria) this;
        }

        public Criteria andFlastcheckdateGreaterThan(Date value) {
            addCriterion("FLastCheckDate >", value, "flastcheckdate");
            return (Criteria) this;
        }

        public Criteria andFlastcheckdateGreaterThanOrEqualTo(Date value) {
            addCriterion("FLastCheckDate >=", value, "flastcheckdate");
            return (Criteria) this;
        }

        public Criteria andFlastcheckdateLessThan(Date value) {
            addCriterion("FLastCheckDate <", value, "flastcheckdate");
            return (Criteria) this;
        }

        public Criteria andFlastcheckdateLessThanOrEqualTo(Date value) {
            addCriterion("FLastCheckDate <=", value, "flastcheckdate");
            return (Criteria) this;
        }

        public Criteria andFlastcheckdateIn(List<Date> values) {
            addCriterion("FLastCheckDate in", values, "flastcheckdate");
            return (Criteria) this;
        }

        public Criteria andFlastcheckdateNotIn(List<Date> values) {
            addCriterion("FLastCheckDate not in", values, "flastcheckdate");
            return (Criteria) this;
        }

        public Criteria andFlastcheckdateBetween(Date value1, Date value2) {
            addCriterion("FLastCheckDate between", value1, value2, "flastcheckdate");
            return (Criteria) this;
        }

        public Criteria andFlastcheckdateNotBetween(Date value1, Date value2) {
            addCriterion("FLastCheckDate not between", value1, value2, "flastcheckdate");
            return (Criteria) this;
        }

        public Criteria andFcheckcycleIsNull() {
            addCriterion("FCheckCycle is null");
            return (Criteria) this;
        }

        public Criteria andFcheckcycleIsNotNull() {
            addCriterion("FCheckCycle is not null");
            return (Criteria) this;
        }

        public Criteria andFcheckcycleEqualTo(Integer value) {
            addCriterion("FCheckCycle =", value, "fcheckcycle");
            return (Criteria) this;
        }

        public Criteria andFcheckcycleNotEqualTo(Integer value) {
            addCriterion("FCheckCycle <>", value, "fcheckcycle");
            return (Criteria) this;
        }

        public Criteria andFcheckcycleGreaterThan(Integer value) {
            addCriterion("FCheckCycle >", value, "fcheckcycle");
            return (Criteria) this;
        }

        public Criteria andFcheckcycleGreaterThanOrEqualTo(Integer value) {
            addCriterion("FCheckCycle >=", value, "fcheckcycle");
            return (Criteria) this;
        }

        public Criteria andFcheckcycleLessThan(Integer value) {
            addCriterion("FCheckCycle <", value, "fcheckcycle");
            return (Criteria) this;
        }

        public Criteria andFcheckcycleLessThanOrEqualTo(Integer value) {
            addCriterion("FCheckCycle <=", value, "fcheckcycle");
            return (Criteria) this;
        }

        public Criteria andFcheckcycleIn(List<Integer> values) {
            addCriterion("FCheckCycle in", values, "fcheckcycle");
            return (Criteria) this;
        }

        public Criteria andFcheckcycleNotIn(List<Integer> values) {
            addCriterion("FCheckCycle not in", values, "fcheckcycle");
            return (Criteria) this;
        }

        public Criteria andFcheckcycleBetween(Integer value1, Integer value2) {
            addCriterion("FCheckCycle between", value1, value2, "fcheckcycle");
            return (Criteria) this;
        }

        public Criteria andFcheckcycleNotBetween(Integer value1, Integer value2) {
            addCriterion("FCheckCycle not between", value1, value2, "fcheckcycle");
            return (Criteria) this;
        }

        public Criteria andFcheckcycunitIsNull() {
            addCriterion("FCheckCycUnit is null");
            return (Criteria) this;
        }

        public Criteria andFcheckcycunitIsNotNull() {
            addCriterion("FCheckCycUnit is not null");
            return (Criteria) this;
        }

        public Criteria andFcheckcycunitEqualTo(Integer value) {
            addCriterion("FCheckCycUnit =", value, "fcheckcycunit");
            return (Criteria) this;
        }

        public Criteria andFcheckcycunitNotEqualTo(Integer value) {
            addCriterion("FCheckCycUnit <>", value, "fcheckcycunit");
            return (Criteria) this;
        }

        public Criteria andFcheckcycunitGreaterThan(Integer value) {
            addCriterion("FCheckCycUnit >", value, "fcheckcycunit");
            return (Criteria) this;
        }

        public Criteria andFcheckcycunitGreaterThanOrEqualTo(Integer value) {
            addCriterion("FCheckCycUnit >=", value, "fcheckcycunit");
            return (Criteria) this;
        }

        public Criteria andFcheckcycunitLessThan(Integer value) {
            addCriterion("FCheckCycUnit <", value, "fcheckcycunit");
            return (Criteria) this;
        }

        public Criteria andFcheckcycunitLessThanOrEqualTo(Integer value) {
            addCriterion("FCheckCycUnit <=", value, "fcheckcycunit");
            return (Criteria) this;
        }

        public Criteria andFcheckcycunitIn(List<Integer> values) {
            addCriterion("FCheckCycUnit in", values, "fcheckcycunit");
            return (Criteria) this;
        }

        public Criteria andFcheckcycunitNotIn(List<Integer> values) {
            addCriterion("FCheckCycUnit not in", values, "fcheckcycunit");
            return (Criteria) this;
        }

        public Criteria andFcheckcycunitBetween(Integer value1, Integer value2) {
            addCriterion("FCheckCycUnit between", value1, value2, "fcheckcycunit");
            return (Criteria) this;
        }

        public Criteria andFcheckcycunitNotBetween(Integer value1, Integer value2) {
            addCriterion("FCheckCycUnit not between", value1, value2, "fcheckcycunit");
            return (Criteria) this;
        }

        public Criteria andFstockpriceIsNull() {
            addCriterion("FStockPrice is null");
            return (Criteria) this;
        }

        public Criteria andFstockpriceIsNotNull() {
            addCriterion("FStockPrice is not null");
            return (Criteria) this;
        }

        public Criteria andFstockpriceEqualTo(BigDecimal value) {
            addCriterion("FStockPrice =", value, "fstockprice");
            return (Criteria) this;
        }

        public Criteria andFstockpriceNotEqualTo(BigDecimal value) {
            addCriterion("FStockPrice <>", value, "fstockprice");
            return (Criteria) this;
        }

        public Criteria andFstockpriceGreaterThan(BigDecimal value) {
            addCriterion("FStockPrice >", value, "fstockprice");
            return (Criteria) this;
        }

        public Criteria andFstockpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FStockPrice >=", value, "fstockprice");
            return (Criteria) this;
        }

        public Criteria andFstockpriceLessThan(BigDecimal value) {
            addCriterion("FStockPrice <", value, "fstockprice");
            return (Criteria) this;
        }

        public Criteria andFstockpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FStockPrice <=", value, "fstockprice");
            return (Criteria) this;
        }

        public Criteria andFstockpriceIn(List<BigDecimal> values) {
            addCriterion("FStockPrice in", values, "fstockprice");
            return (Criteria) this;
        }

        public Criteria andFstockpriceNotIn(List<BigDecimal> values) {
            addCriterion("FStockPrice not in", values, "fstockprice");
            return (Criteria) this;
        }

        public Criteria andFstockpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FStockPrice between", value1, value2, "fstockprice");
            return (Criteria) this;
        }

        public Criteria andFstockpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FStockPrice not between", value1, value2, "fstockprice");
            return (Criteria) this;
        }

        public Criteria andFabcclsIsNull() {
            addCriterion("FABCCls is null");
            return (Criteria) this;
        }

        public Criteria andFabcclsIsNotNull() {
            addCriterion("FABCCls is not null");
            return (Criteria) this;
        }

        public Criteria andFabcclsEqualTo(String value) {
            addCriterion("FABCCls =", value, "fabccls");
            return (Criteria) this;
        }

        public Criteria andFabcclsNotEqualTo(String value) {
            addCriterion("FABCCls <>", value, "fabccls");
            return (Criteria) this;
        }

        public Criteria andFabcclsGreaterThan(String value) {
            addCriterion("FABCCls >", value, "fabccls");
            return (Criteria) this;
        }

        public Criteria andFabcclsGreaterThanOrEqualTo(String value) {
            addCriterion("FABCCls >=", value, "fabccls");
            return (Criteria) this;
        }

        public Criteria andFabcclsLessThan(String value) {
            addCriterion("FABCCls <", value, "fabccls");
            return (Criteria) this;
        }

        public Criteria andFabcclsLessThanOrEqualTo(String value) {
            addCriterion("FABCCls <=", value, "fabccls");
            return (Criteria) this;
        }

        public Criteria andFabcclsLike(String value) {
            addCriterion("FABCCls like", value, "fabccls");
            return (Criteria) this;
        }

        public Criteria andFabcclsNotLike(String value) {
            addCriterion("FABCCls not like", value, "fabccls");
            return (Criteria) this;
        }

        public Criteria andFabcclsIn(List<String> values) {
            addCriterion("FABCCls in", values, "fabccls");
            return (Criteria) this;
        }

        public Criteria andFabcclsNotIn(List<String> values) {
            addCriterion("FABCCls not in", values, "fabccls");
            return (Criteria) this;
        }

        public Criteria andFabcclsBetween(String value1, String value2) {
            addCriterion("FABCCls between", value1, value2, "fabccls");
            return (Criteria) this;
        }

        public Criteria andFabcclsNotBetween(String value1, String value2) {
            addCriterion("FABCCls not between", value1, value2, "fabccls");
            return (Criteria) this;
        }

        public Criteria andFbatchqtyIsNull() {
            addCriterion("FBatchQty is null");
            return (Criteria) this;
        }

        public Criteria andFbatchqtyIsNotNull() {
            addCriterion("FBatchQty is not null");
            return (Criteria) this;
        }

        public Criteria andFbatchqtyEqualTo(Double value) {
            addCriterion("FBatchQty =", value, "fbatchqty");
            return (Criteria) this;
        }

        public Criteria andFbatchqtyNotEqualTo(Double value) {
            addCriterion("FBatchQty <>", value, "fbatchqty");
            return (Criteria) this;
        }

        public Criteria andFbatchqtyGreaterThan(Double value) {
            addCriterion("FBatchQty >", value, "fbatchqty");
            return (Criteria) this;
        }

        public Criteria andFbatchqtyGreaterThanOrEqualTo(Double value) {
            addCriterion("FBatchQty >=", value, "fbatchqty");
            return (Criteria) this;
        }

        public Criteria andFbatchqtyLessThan(Double value) {
            addCriterion("FBatchQty <", value, "fbatchqty");
            return (Criteria) this;
        }

        public Criteria andFbatchqtyLessThanOrEqualTo(Double value) {
            addCriterion("FBatchQty <=", value, "fbatchqty");
            return (Criteria) this;
        }

        public Criteria andFbatchqtyIn(List<Double> values) {
            addCriterion("FBatchQty in", values, "fbatchqty");
            return (Criteria) this;
        }

        public Criteria andFbatchqtyNotIn(List<Double> values) {
            addCriterion("FBatchQty not in", values, "fbatchqty");
            return (Criteria) this;
        }

        public Criteria andFbatchqtyBetween(Double value1, Double value2) {
            addCriterion("FBatchQty between", value1, value2, "fbatchqty");
            return (Criteria) this;
        }

        public Criteria andFbatchqtyNotBetween(Double value1, Double value2) {
            addCriterion("FBatchQty not between", value1, value2, "fbatchqty");
            return (Criteria) this;
        }

        public Criteria andFclassIsNull() {
            addCriterion("FClass is null");
            return (Criteria) this;
        }

        public Criteria andFclassIsNotNull() {
            addCriterion("FClass is not null");
            return (Criteria) this;
        }

        public Criteria andFclassEqualTo(Boolean value) {
            addCriterion("FClass =", value, "fclass");
            return (Criteria) this;
        }

        public Criteria andFclassNotEqualTo(Boolean value) {
            addCriterion("FClass <>", value, "fclass");
            return (Criteria) this;
        }

        public Criteria andFclassGreaterThan(Boolean value) {
            addCriterion("FClass >", value, "fclass");
            return (Criteria) this;
        }

        public Criteria andFclassGreaterThanOrEqualTo(Boolean value) {
            addCriterion("FClass >=", value, "fclass");
            return (Criteria) this;
        }

        public Criteria andFclassLessThan(Boolean value) {
            addCriterion("FClass <", value, "fclass");
            return (Criteria) this;
        }

        public Criteria andFclassLessThanOrEqualTo(Boolean value) {
            addCriterion("FClass <=", value, "fclass");
            return (Criteria) this;
        }

        public Criteria andFclassIn(List<Boolean> values) {
            addCriterion("FClass in", values, "fclass");
            return (Criteria) this;
        }

        public Criteria andFclassNotIn(List<Boolean> values) {
            addCriterion("FClass not in", values, "fclass");
            return (Criteria) this;
        }

        public Criteria andFclassBetween(Boolean value1, Boolean value2) {
            addCriterion("FClass between", value1, value2, "fclass");
            return (Criteria) this;
        }

        public Criteria andFclassNotBetween(Boolean value1, Boolean value2) {
            addCriterion("FClass not between", value1, value2, "fclass");
            return (Criteria) this;
        }

        public Criteria andFcostdiffrateIsNull() {
            addCriterion("FCostDiffRate is null");
            return (Criteria) this;
        }

        public Criteria andFcostdiffrateIsNotNull() {
            addCriterion("FCostDiffRate is not null");
            return (Criteria) this;
        }

        public Criteria andFcostdiffrateEqualTo(Double value) {
            addCriterion("FCostDiffRate =", value, "fcostdiffrate");
            return (Criteria) this;
        }

        public Criteria andFcostdiffrateNotEqualTo(Double value) {
            addCriterion("FCostDiffRate <>", value, "fcostdiffrate");
            return (Criteria) this;
        }

        public Criteria andFcostdiffrateGreaterThan(Double value) {
            addCriterion("FCostDiffRate >", value, "fcostdiffrate");
            return (Criteria) this;
        }

        public Criteria andFcostdiffrateGreaterThanOrEqualTo(Double value) {
            addCriterion("FCostDiffRate >=", value, "fcostdiffrate");
            return (Criteria) this;
        }

        public Criteria andFcostdiffrateLessThan(Double value) {
            addCriterion("FCostDiffRate <", value, "fcostdiffrate");
            return (Criteria) this;
        }

        public Criteria andFcostdiffrateLessThanOrEqualTo(Double value) {
            addCriterion("FCostDiffRate <=", value, "fcostdiffrate");
            return (Criteria) this;
        }

        public Criteria andFcostdiffrateIn(List<Double> values) {
            addCriterion("FCostDiffRate in", values, "fcostdiffrate");
            return (Criteria) this;
        }

        public Criteria andFcostdiffrateNotIn(List<Double> values) {
            addCriterion("FCostDiffRate not in", values, "fcostdiffrate");
            return (Criteria) this;
        }

        public Criteria andFcostdiffrateBetween(Double value1, Double value2) {
            addCriterion("FCostDiffRate between", value1, value2, "fcostdiffrate");
            return (Criteria) this;
        }

        public Criteria andFcostdiffrateNotBetween(Double value1, Double value2) {
            addCriterion("FCostDiffRate not between", value1, value2, "fcostdiffrate");
            return (Criteria) this;
        }

        public Criteria andFdepartmentIsNull() {
            addCriterion("FDepartment is null");
            return (Criteria) this;
        }

        public Criteria andFdepartmentIsNotNull() {
            addCriterion("FDepartment is not null");
            return (Criteria) this;
        }

        public Criteria andFdepartmentEqualTo(Integer value) {
            addCriterion("FDepartment =", value, "fdepartment");
            return (Criteria) this;
        }

        public Criteria andFdepartmentNotEqualTo(Integer value) {
            addCriterion("FDepartment <>", value, "fdepartment");
            return (Criteria) this;
        }

        public Criteria andFdepartmentGreaterThan(Integer value) {
            addCriterion("FDepartment >", value, "fdepartment");
            return (Criteria) this;
        }

        public Criteria andFdepartmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("FDepartment >=", value, "fdepartment");
            return (Criteria) this;
        }

        public Criteria andFdepartmentLessThan(Integer value) {
            addCriterion("FDepartment <", value, "fdepartment");
            return (Criteria) this;
        }

        public Criteria andFdepartmentLessThanOrEqualTo(Integer value) {
            addCriterion("FDepartment <=", value, "fdepartment");
            return (Criteria) this;
        }

        public Criteria andFdepartmentIn(List<Integer> values) {
            addCriterion("FDepartment in", values, "fdepartment");
            return (Criteria) this;
        }

        public Criteria andFdepartmentNotIn(List<Integer> values) {
            addCriterion("FDepartment not in", values, "fdepartment");
            return (Criteria) this;
        }

        public Criteria andFdepartmentBetween(Integer value1, Integer value2) {
            addCriterion("FDepartment between", value1, value2, "fdepartment");
            return (Criteria) this;
        }

        public Criteria andFdepartmentNotBetween(Integer value1, Integer value2) {
            addCriterion("FDepartment not between", value1, value2, "fdepartment");
            return (Criteria) this;
        }

        public Criteria andFsaletaxacctidIsNull() {
            addCriterion("FSaleTaxAcctID is null");
            return (Criteria) this;
        }

        public Criteria andFsaletaxacctidIsNotNull() {
            addCriterion("FSaleTaxAcctID is not null");
            return (Criteria) this;
        }

        public Criteria andFsaletaxacctidEqualTo(Integer value) {
            addCriterion("FSaleTaxAcctID =", value, "fsaletaxacctid");
            return (Criteria) this;
        }

        public Criteria andFsaletaxacctidNotEqualTo(Integer value) {
            addCriterion("FSaleTaxAcctID <>", value, "fsaletaxacctid");
            return (Criteria) this;
        }

        public Criteria andFsaletaxacctidGreaterThan(Integer value) {
            addCriterion("FSaleTaxAcctID >", value, "fsaletaxacctid");
            return (Criteria) this;
        }

        public Criteria andFsaletaxacctidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FSaleTaxAcctID >=", value, "fsaletaxacctid");
            return (Criteria) this;
        }

        public Criteria andFsaletaxacctidLessThan(Integer value) {
            addCriterion("FSaleTaxAcctID <", value, "fsaletaxacctid");
            return (Criteria) this;
        }

        public Criteria andFsaletaxacctidLessThanOrEqualTo(Integer value) {
            addCriterion("FSaleTaxAcctID <=", value, "fsaletaxacctid");
            return (Criteria) this;
        }

        public Criteria andFsaletaxacctidIn(List<Integer> values) {
            addCriterion("FSaleTaxAcctID in", values, "fsaletaxacctid");
            return (Criteria) this;
        }

        public Criteria andFsaletaxacctidNotIn(List<Integer> values) {
            addCriterion("FSaleTaxAcctID not in", values, "fsaletaxacctid");
            return (Criteria) this;
        }

        public Criteria andFsaletaxacctidBetween(Integer value1, Integer value2) {
            addCriterion("FSaleTaxAcctID between", value1, value2, "fsaletaxacctid");
            return (Criteria) this;
        }

        public Criteria andFsaletaxacctidNotBetween(Integer value1, Integer value2) {
            addCriterion("FSaleTaxAcctID not between", value1, value2, "fsaletaxacctid");
            return (Criteria) this;
        }

        public Criteria andFcbbmstandardidIsNull() {
            addCriterion("FCBBmStandardID is null");
            return (Criteria) this;
        }

        public Criteria andFcbbmstandardidIsNotNull() {
            addCriterion("FCBBmStandardID is not null");
            return (Criteria) this;
        }

        public Criteria andFcbbmstandardidEqualTo(Integer value) {
            addCriterion("FCBBmStandardID =", value, "fcbbmstandardid");
            return (Criteria) this;
        }

        public Criteria andFcbbmstandardidNotEqualTo(Integer value) {
            addCriterion("FCBBmStandardID <>", value, "fcbbmstandardid");
            return (Criteria) this;
        }

        public Criteria andFcbbmstandardidGreaterThan(Integer value) {
            addCriterion("FCBBmStandardID >", value, "fcbbmstandardid");
            return (Criteria) this;
        }

        public Criteria andFcbbmstandardidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FCBBmStandardID >=", value, "fcbbmstandardid");
            return (Criteria) this;
        }

        public Criteria andFcbbmstandardidLessThan(Integer value) {
            addCriterion("FCBBmStandardID <", value, "fcbbmstandardid");
            return (Criteria) this;
        }

        public Criteria andFcbbmstandardidLessThanOrEqualTo(Integer value) {
            addCriterion("FCBBmStandardID <=", value, "fcbbmstandardid");
            return (Criteria) this;
        }

        public Criteria andFcbbmstandardidIn(List<Integer> values) {
            addCriterion("FCBBmStandardID in", values, "fcbbmstandardid");
            return (Criteria) this;
        }

        public Criteria andFcbbmstandardidNotIn(List<Integer> values) {
            addCriterion("FCBBmStandardID not in", values, "fcbbmstandardid");
            return (Criteria) this;
        }

        public Criteria andFcbbmstandardidBetween(Integer value1, Integer value2) {
            addCriterion("FCBBmStandardID between", value1, value2, "fcbbmstandardid");
            return (Criteria) this;
        }

        public Criteria andFcbbmstandardidNotBetween(Integer value1, Integer value2) {
            addCriterion("FCBBmStandardID not between", value1, value2, "fcbbmstandardid");
            return (Criteria) this;
        }

        public Criteria andFcbrestoreIsNull() {
            addCriterion("FCBRestore is null");
            return (Criteria) this;
        }

        public Criteria andFcbrestoreIsNotNull() {
            addCriterion("FCBRestore is not null");
            return (Criteria) this;
        }

        public Criteria andFcbrestoreEqualTo(Integer value) {
            addCriterion("FCBRestore =", value, "fcbrestore");
            return (Criteria) this;
        }

        public Criteria andFcbrestoreNotEqualTo(Integer value) {
            addCriterion("FCBRestore <>", value, "fcbrestore");
            return (Criteria) this;
        }

        public Criteria andFcbrestoreGreaterThan(Integer value) {
            addCriterion("FCBRestore >", value, "fcbrestore");
            return (Criteria) this;
        }

        public Criteria andFcbrestoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("FCBRestore >=", value, "fcbrestore");
            return (Criteria) this;
        }

        public Criteria andFcbrestoreLessThan(Integer value) {
            addCriterion("FCBRestore <", value, "fcbrestore");
            return (Criteria) this;
        }

        public Criteria andFcbrestoreLessThanOrEqualTo(Integer value) {
            addCriterion("FCBRestore <=", value, "fcbrestore");
            return (Criteria) this;
        }

        public Criteria andFcbrestoreIn(List<Integer> values) {
            addCriterion("FCBRestore in", values, "fcbrestore");
            return (Criteria) this;
        }

        public Criteria andFcbrestoreNotIn(List<Integer> values) {
            addCriterion("FCBRestore not in", values, "fcbrestore");
            return (Criteria) this;
        }

        public Criteria andFcbrestoreBetween(Integer value1, Integer value2) {
            addCriterion("FCBRestore between", value1, value2, "fcbrestore");
            return (Criteria) this;
        }

        public Criteria andFcbrestoreNotBetween(Integer value1, Integer value2) {
            addCriterion("FCBRestore not between", value1, value2, "fcbrestore");
            return (Criteria) this;
        }

        public Criteria andFonlineshoppnameIsNull() {
            addCriterion("FOnlineShopPName is null");
            return (Criteria) this;
        }

        public Criteria andFonlineshoppnameIsNotNull() {
            addCriterion("FOnlineShopPName is not null");
            return (Criteria) this;
        }

        public Criteria andFonlineshoppnameEqualTo(String value) {
            addCriterion("FOnlineShopPName =", value, "fonlineshoppname");
            return (Criteria) this;
        }

        public Criteria andFonlineshoppnameNotEqualTo(String value) {
            addCriterion("FOnlineShopPName <>", value, "fonlineshoppname");
            return (Criteria) this;
        }

        public Criteria andFonlineshoppnameGreaterThan(String value) {
            addCriterion("FOnlineShopPName >", value, "fonlineshoppname");
            return (Criteria) this;
        }

        public Criteria andFonlineshoppnameGreaterThanOrEqualTo(String value) {
            addCriterion("FOnlineShopPName >=", value, "fonlineshoppname");
            return (Criteria) this;
        }

        public Criteria andFonlineshoppnameLessThan(String value) {
            addCriterion("FOnlineShopPName <", value, "fonlineshoppname");
            return (Criteria) this;
        }

        public Criteria andFonlineshoppnameLessThanOrEqualTo(String value) {
            addCriterion("FOnlineShopPName <=", value, "fonlineshoppname");
            return (Criteria) this;
        }

        public Criteria andFonlineshoppnameLike(String value) {
            addCriterion("FOnlineShopPName like", value, "fonlineshoppname");
            return (Criteria) this;
        }

        public Criteria andFonlineshoppnameNotLike(String value) {
            addCriterion("FOnlineShopPName not like", value, "fonlineshoppname");
            return (Criteria) this;
        }

        public Criteria andFonlineshoppnameIn(List<String> values) {
            addCriterion("FOnlineShopPName in", values, "fonlineshoppname");
            return (Criteria) this;
        }

        public Criteria andFonlineshoppnameNotIn(List<String> values) {
            addCriterion("FOnlineShopPName not in", values, "fonlineshoppname");
            return (Criteria) this;
        }

        public Criteria andFonlineshoppnameBetween(String value1, String value2) {
            addCriterion("FOnlineShopPName between", value1, value2, "fonlineshoppname");
            return (Criteria) this;
        }

        public Criteria andFonlineshoppnameNotBetween(String value1, String value2) {
            addCriterion("FOnlineShopPName not between", value1, value2, "fonlineshoppname");
            return (Criteria) this;
        }

        public Criteria andFonlineshoppnoIsNull() {
            addCriterion("FOnlineShopPNo is null");
            return (Criteria) this;
        }

        public Criteria andFonlineshoppnoIsNotNull() {
            addCriterion("FOnlineShopPNo is not null");
            return (Criteria) this;
        }

        public Criteria andFonlineshoppnoEqualTo(String value) {
            addCriterion("FOnlineShopPNo =", value, "fonlineshoppno");
            return (Criteria) this;
        }

        public Criteria andFonlineshoppnoNotEqualTo(String value) {
            addCriterion("FOnlineShopPNo <>", value, "fonlineshoppno");
            return (Criteria) this;
        }

        public Criteria andFonlineshoppnoGreaterThan(String value) {
            addCriterion("FOnlineShopPNo >", value, "fonlineshoppno");
            return (Criteria) this;
        }

        public Criteria andFonlineshoppnoGreaterThanOrEqualTo(String value) {
            addCriterion("FOnlineShopPNo >=", value, "fonlineshoppno");
            return (Criteria) this;
        }

        public Criteria andFonlineshoppnoLessThan(String value) {
            addCriterion("FOnlineShopPNo <", value, "fonlineshoppno");
            return (Criteria) this;
        }

        public Criteria andFonlineshoppnoLessThanOrEqualTo(String value) {
            addCriterion("FOnlineShopPNo <=", value, "fonlineshoppno");
            return (Criteria) this;
        }

        public Criteria andFonlineshoppnoLike(String value) {
            addCriterion("FOnlineShopPNo like", value, "fonlineshoppno");
            return (Criteria) this;
        }

        public Criteria andFonlineshoppnoNotLike(String value) {
            addCriterion("FOnlineShopPNo not like", value, "fonlineshoppno");
            return (Criteria) this;
        }

        public Criteria andFonlineshoppnoIn(List<String> values) {
            addCriterion("FOnlineShopPNo in", values, "fonlineshoppno");
            return (Criteria) this;
        }

        public Criteria andFonlineshoppnoNotIn(List<String> values) {
            addCriterion("FOnlineShopPNo not in", values, "fonlineshoppno");
            return (Criteria) this;
        }

        public Criteria andFonlineshoppnoBetween(String value1, String value2) {
            addCriterion("FOnlineShopPNo between", value1, value2, "fonlineshoppno");
            return (Criteria) this;
        }

        public Criteria andFonlineshoppnoNotBetween(String value1, String value2) {
            addCriterion("FOnlineShopPNo not between", value1, value2, "fonlineshoppno");
            return (Criteria) this;
        }

        public Criteria andFispdasnmanageIsNull() {
            addCriterion("FIsPDASnManage is null");
            return (Criteria) this;
        }

        public Criteria andFispdasnmanageIsNotNull() {
            addCriterion("FIsPDASnManage is not null");
            return (Criteria) this;
        }

        public Criteria andFispdasnmanageEqualTo(Boolean value) {
            addCriterion("FIsPDASnManage =", value, "fispdasnmanage");
            return (Criteria) this;
        }

        public Criteria andFispdasnmanageNotEqualTo(Boolean value) {
            addCriterion("FIsPDASnManage <>", value, "fispdasnmanage");
            return (Criteria) this;
        }

        public Criteria andFispdasnmanageGreaterThan(Boolean value) {
            addCriterion("FIsPDASnManage >", value, "fispdasnmanage");
            return (Criteria) this;
        }

        public Criteria andFispdasnmanageGreaterThanOrEqualTo(Boolean value) {
            addCriterion("FIsPDASnManage >=", value, "fispdasnmanage");
            return (Criteria) this;
        }

        public Criteria andFispdasnmanageLessThan(Boolean value) {
            addCriterion("FIsPDASnManage <", value, "fispdasnmanage");
            return (Criteria) this;
        }

        public Criteria andFispdasnmanageLessThanOrEqualTo(Boolean value) {
            addCriterion("FIsPDASnManage <=", value, "fispdasnmanage");
            return (Criteria) this;
        }

        public Criteria andFispdasnmanageIn(List<Boolean> values) {
            addCriterion("FIsPDASnManage in", values, "fispdasnmanage");
            return (Criteria) this;
        }

        public Criteria andFispdasnmanageNotIn(List<Boolean> values) {
            addCriterion("FIsPDASnManage not in", values, "fispdasnmanage");
            return (Criteria) this;
        }

        public Criteria andFispdasnmanageBetween(Boolean value1, Boolean value2) {
            addCriterion("FIsPDASnManage between", value1, value2, "fispdasnmanage");
            return (Criteria) this;
        }

        public Criteria andFispdasnmanageNotBetween(Boolean value1, Boolean value2) {
            addCriterion("FIsPDASnManage not between", value1, value2, "fispdasnmanage");
            return (Criteria) this;
        }

        public Criteria andFplantrategyIsNull() {
            addCriterion("FPlanTrategy is null");
            return (Criteria) this;
        }

        public Criteria andFplantrategyIsNotNull() {
            addCriterion("FPlanTrategy is not null");
            return (Criteria) this;
        }

        public Criteria andFplantrategyEqualTo(Integer value) {
            addCriterion("FPlanTrategy =", value, "fplantrategy");
            return (Criteria) this;
        }

        public Criteria andFplantrategyNotEqualTo(Integer value) {
            addCriterion("FPlanTrategy <>", value, "fplantrategy");
            return (Criteria) this;
        }

        public Criteria andFplantrategyGreaterThan(Integer value) {
            addCriterion("FPlanTrategy >", value, "fplantrategy");
            return (Criteria) this;
        }

        public Criteria andFplantrategyGreaterThanOrEqualTo(Integer value) {
            addCriterion("FPlanTrategy >=", value, "fplantrategy");
            return (Criteria) this;
        }

        public Criteria andFplantrategyLessThan(Integer value) {
            addCriterion("FPlanTrategy <", value, "fplantrategy");
            return (Criteria) this;
        }

        public Criteria andFplantrategyLessThanOrEqualTo(Integer value) {
            addCriterion("FPlanTrategy <=", value, "fplantrategy");
            return (Criteria) this;
        }

        public Criteria andFplantrategyIn(List<Integer> values) {
            addCriterion("FPlanTrategy in", values, "fplantrategy");
            return (Criteria) this;
        }

        public Criteria andFplantrategyNotIn(List<Integer> values) {
            addCriterion("FPlanTrategy not in", values, "fplantrategy");
            return (Criteria) this;
        }

        public Criteria andFplantrategyBetween(Integer value1, Integer value2) {
            addCriterion("FPlanTrategy between", value1, value2, "fplantrategy");
            return (Criteria) this;
        }

        public Criteria andFplantrategyNotBetween(Integer value1, Integer value2) {
            addCriterion("FPlanTrategy not between", value1, value2, "fplantrategy");
            return (Criteria) this;
        }

        public Criteria andFordertrategyIsNull() {
            addCriterion("FOrderTrategy is null");
            return (Criteria) this;
        }

        public Criteria andFordertrategyIsNotNull() {
            addCriterion("FOrderTrategy is not null");
            return (Criteria) this;
        }

        public Criteria andFordertrategyEqualTo(Integer value) {
            addCriterion("FOrderTrategy =", value, "fordertrategy");
            return (Criteria) this;
        }

        public Criteria andFordertrategyNotEqualTo(Integer value) {
            addCriterion("FOrderTrategy <>", value, "fordertrategy");
            return (Criteria) this;
        }

        public Criteria andFordertrategyGreaterThan(Integer value) {
            addCriterion("FOrderTrategy >", value, "fordertrategy");
            return (Criteria) this;
        }

        public Criteria andFordertrategyGreaterThanOrEqualTo(Integer value) {
            addCriterion("FOrderTrategy >=", value, "fordertrategy");
            return (Criteria) this;
        }

        public Criteria andFordertrategyLessThan(Integer value) {
            addCriterion("FOrderTrategy <", value, "fordertrategy");
            return (Criteria) this;
        }

        public Criteria andFordertrategyLessThanOrEqualTo(Integer value) {
            addCriterion("FOrderTrategy <=", value, "fordertrategy");
            return (Criteria) this;
        }

        public Criteria andFordertrategyIn(List<Integer> values) {
            addCriterion("FOrderTrategy in", values, "fordertrategy");
            return (Criteria) this;
        }

        public Criteria andFordertrategyNotIn(List<Integer> values) {
            addCriterion("FOrderTrategy not in", values, "fordertrategy");
            return (Criteria) this;
        }

        public Criteria andFordertrategyBetween(Integer value1, Integer value2) {
            addCriterion("FOrderTrategy between", value1, value2, "fordertrategy");
            return (Criteria) this;
        }

        public Criteria andFordertrategyNotBetween(Integer value1, Integer value2) {
            addCriterion("FOrderTrategy not between", value1, value2, "fordertrategy");
            return (Criteria) this;
        }

        public Criteria andFleadtimeIsNull() {
            addCriterion("FLeadTime is null");
            return (Criteria) this;
        }

        public Criteria andFleadtimeIsNotNull() {
            addCriterion("FLeadTime is not null");
            return (Criteria) this;
        }

        public Criteria andFleadtimeEqualTo(Float value) {
            addCriterion("FLeadTime =", value, "fleadtime");
            return (Criteria) this;
        }

        public Criteria andFleadtimeNotEqualTo(Float value) {
            addCriterion("FLeadTime <>", value, "fleadtime");
            return (Criteria) this;
        }

        public Criteria andFleadtimeGreaterThan(Float value) {
            addCriterion("FLeadTime >", value, "fleadtime");
            return (Criteria) this;
        }

        public Criteria andFleadtimeGreaterThanOrEqualTo(Float value) {
            addCriterion("FLeadTime >=", value, "fleadtime");
            return (Criteria) this;
        }

        public Criteria andFleadtimeLessThan(Float value) {
            addCriterion("FLeadTime <", value, "fleadtime");
            return (Criteria) this;
        }

        public Criteria andFleadtimeLessThanOrEqualTo(Float value) {
            addCriterion("FLeadTime <=", value, "fleadtime");
            return (Criteria) this;
        }

        public Criteria andFleadtimeIn(List<Float> values) {
            addCriterion("FLeadTime in", values, "fleadtime");
            return (Criteria) this;
        }

        public Criteria andFleadtimeNotIn(List<Float> values) {
            addCriterion("FLeadTime not in", values, "fleadtime");
            return (Criteria) this;
        }

        public Criteria andFleadtimeBetween(Float value1, Float value2) {
            addCriterion("FLeadTime between", value1, value2, "fleadtime");
            return (Criteria) this;
        }

        public Criteria andFleadtimeNotBetween(Float value1, Float value2) {
            addCriterion("FLeadTime not between", value1, value2, "fleadtime");
            return (Criteria) this;
        }

        public Criteria andFfixleadtimeIsNull() {
            addCriterion("FFixLeadTime is null");
            return (Criteria) this;
        }

        public Criteria andFfixleadtimeIsNotNull() {
            addCriterion("FFixLeadTime is not null");
            return (Criteria) this;
        }

        public Criteria andFfixleadtimeEqualTo(Float value) {
            addCriterion("FFixLeadTime =", value, "ffixleadtime");
            return (Criteria) this;
        }

        public Criteria andFfixleadtimeNotEqualTo(Float value) {
            addCriterion("FFixLeadTime <>", value, "ffixleadtime");
            return (Criteria) this;
        }

        public Criteria andFfixleadtimeGreaterThan(Float value) {
            addCriterion("FFixLeadTime >", value, "ffixleadtime");
            return (Criteria) this;
        }

        public Criteria andFfixleadtimeGreaterThanOrEqualTo(Float value) {
            addCriterion("FFixLeadTime >=", value, "ffixleadtime");
            return (Criteria) this;
        }

        public Criteria andFfixleadtimeLessThan(Float value) {
            addCriterion("FFixLeadTime <", value, "ffixleadtime");
            return (Criteria) this;
        }

        public Criteria andFfixleadtimeLessThanOrEqualTo(Float value) {
            addCriterion("FFixLeadTime <=", value, "ffixleadtime");
            return (Criteria) this;
        }

        public Criteria andFfixleadtimeIn(List<Float> values) {
            addCriterion("FFixLeadTime in", values, "ffixleadtime");
            return (Criteria) this;
        }

        public Criteria andFfixleadtimeNotIn(List<Float> values) {
            addCriterion("FFixLeadTime not in", values, "ffixleadtime");
            return (Criteria) this;
        }

        public Criteria andFfixleadtimeBetween(Float value1, Float value2) {
            addCriterion("FFixLeadTime between", value1, value2, "ffixleadtime");
            return (Criteria) this;
        }

        public Criteria andFfixleadtimeNotBetween(Float value1, Float value2) {
            addCriterion("FFixLeadTime not between", value1, value2, "ffixleadtime");
            return (Criteria) this;
        }

        public Criteria andFtotaltqqIsNull() {
            addCriterion("FTotalTQQ is null");
            return (Criteria) this;
        }

        public Criteria andFtotaltqqIsNotNull() {
            addCriterion("FTotalTQQ is not null");
            return (Criteria) this;
        }

        public Criteria andFtotaltqqEqualTo(Integer value) {
            addCriterion("FTotalTQQ =", value, "ftotaltqq");
            return (Criteria) this;
        }

        public Criteria andFtotaltqqNotEqualTo(Integer value) {
            addCriterion("FTotalTQQ <>", value, "ftotaltqq");
            return (Criteria) this;
        }

        public Criteria andFtotaltqqGreaterThan(Integer value) {
            addCriterion("FTotalTQQ >", value, "ftotaltqq");
            return (Criteria) this;
        }

        public Criteria andFtotaltqqGreaterThanOrEqualTo(Integer value) {
            addCriterion("FTotalTQQ >=", value, "ftotaltqq");
            return (Criteria) this;
        }

        public Criteria andFtotaltqqLessThan(Integer value) {
            addCriterion("FTotalTQQ <", value, "ftotaltqq");
            return (Criteria) this;
        }

        public Criteria andFtotaltqqLessThanOrEqualTo(Integer value) {
            addCriterion("FTotalTQQ <=", value, "ftotaltqq");
            return (Criteria) this;
        }

        public Criteria andFtotaltqqIn(List<Integer> values) {
            addCriterion("FTotalTQQ in", values, "ftotaltqq");
            return (Criteria) this;
        }

        public Criteria andFtotaltqqNotIn(List<Integer> values) {
            addCriterion("FTotalTQQ not in", values, "ftotaltqq");
            return (Criteria) this;
        }

        public Criteria andFtotaltqqBetween(Integer value1, Integer value2) {
            addCriterion("FTotalTQQ between", value1, value2, "ftotaltqq");
            return (Criteria) this;
        }

        public Criteria andFtotaltqqNotBetween(Integer value1, Integer value2) {
            addCriterion("FTotalTQQ not between", value1, value2, "ftotaltqq");
            return (Criteria) this;
        }

        public Criteria andFqtyminIsNull() {
            addCriterion("FQtyMin is null");
            return (Criteria) this;
        }

        public Criteria andFqtyminIsNotNull() {
            addCriterion("FQtyMin is not null");
            return (Criteria) this;
        }

        public Criteria andFqtyminEqualTo(BigDecimal value) {
            addCriterion("FQtyMin =", value, "fqtymin");
            return (Criteria) this;
        }

        public Criteria andFqtyminNotEqualTo(BigDecimal value) {
            addCriterion("FQtyMin <>", value, "fqtymin");
            return (Criteria) this;
        }

        public Criteria andFqtyminGreaterThan(BigDecimal value) {
            addCriterion("FQtyMin >", value, "fqtymin");
            return (Criteria) this;
        }

        public Criteria andFqtyminGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FQtyMin >=", value, "fqtymin");
            return (Criteria) this;
        }

        public Criteria andFqtyminLessThan(BigDecimal value) {
            addCriterion("FQtyMin <", value, "fqtymin");
            return (Criteria) this;
        }

        public Criteria andFqtyminLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FQtyMin <=", value, "fqtymin");
            return (Criteria) this;
        }

        public Criteria andFqtyminIn(List<BigDecimal> values) {
            addCriterion("FQtyMin in", values, "fqtymin");
            return (Criteria) this;
        }

        public Criteria andFqtyminNotIn(List<BigDecimal> values) {
            addCriterion("FQtyMin not in", values, "fqtymin");
            return (Criteria) this;
        }

        public Criteria andFqtyminBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FQtyMin between", value1, value2, "fqtymin");
            return (Criteria) this;
        }

        public Criteria andFqtyminNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FQtyMin not between", value1, value2, "fqtymin");
            return (Criteria) this;
        }

        public Criteria andFqtymaxIsNull() {
            addCriterion("FQtyMax is null");
            return (Criteria) this;
        }

        public Criteria andFqtymaxIsNotNull() {
            addCriterion("FQtyMax is not null");
            return (Criteria) this;
        }

        public Criteria andFqtymaxEqualTo(BigDecimal value) {
            addCriterion("FQtyMax =", value, "fqtymax");
            return (Criteria) this;
        }

        public Criteria andFqtymaxNotEqualTo(BigDecimal value) {
            addCriterion("FQtyMax <>", value, "fqtymax");
            return (Criteria) this;
        }

        public Criteria andFqtymaxGreaterThan(BigDecimal value) {
            addCriterion("FQtyMax >", value, "fqtymax");
            return (Criteria) this;
        }

        public Criteria andFqtymaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FQtyMax >=", value, "fqtymax");
            return (Criteria) this;
        }

        public Criteria andFqtymaxLessThan(BigDecimal value) {
            addCriterion("FQtyMax <", value, "fqtymax");
            return (Criteria) this;
        }

        public Criteria andFqtymaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FQtyMax <=", value, "fqtymax");
            return (Criteria) this;
        }

        public Criteria andFqtymaxIn(List<BigDecimal> values) {
            addCriterion("FQtyMax in", values, "fqtymax");
            return (Criteria) this;
        }

        public Criteria andFqtymaxNotIn(List<BigDecimal> values) {
            addCriterion("FQtyMax not in", values, "fqtymax");
            return (Criteria) this;
        }

        public Criteria andFqtymaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FQtyMax between", value1, value2, "fqtymax");
            return (Criteria) this;
        }

        public Criteria andFqtymaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FQtyMax not between", value1, value2, "fqtymax");
            return (Criteria) this;
        }

        public Criteria andFcuunitidIsNull() {
            addCriterion("FCUUnitID is null");
            return (Criteria) this;
        }

        public Criteria andFcuunitidIsNotNull() {
            addCriterion("FCUUnitID is not null");
            return (Criteria) this;
        }

        public Criteria andFcuunitidEqualTo(Integer value) {
            addCriterion("FCUUnitID =", value, "fcuunitid");
            return (Criteria) this;
        }

        public Criteria andFcuunitidNotEqualTo(Integer value) {
            addCriterion("FCUUnitID <>", value, "fcuunitid");
            return (Criteria) this;
        }

        public Criteria andFcuunitidGreaterThan(Integer value) {
            addCriterion("FCUUnitID >", value, "fcuunitid");
            return (Criteria) this;
        }

        public Criteria andFcuunitidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FCUUnitID >=", value, "fcuunitid");
            return (Criteria) this;
        }

        public Criteria andFcuunitidLessThan(Integer value) {
            addCriterion("FCUUnitID <", value, "fcuunitid");
            return (Criteria) this;
        }

        public Criteria andFcuunitidLessThanOrEqualTo(Integer value) {
            addCriterion("FCUUnitID <=", value, "fcuunitid");
            return (Criteria) this;
        }

        public Criteria andFcuunitidIn(List<Integer> values) {
            addCriterion("FCUUnitID in", values, "fcuunitid");
            return (Criteria) this;
        }

        public Criteria andFcuunitidNotIn(List<Integer> values) {
            addCriterion("FCUUnitID not in", values, "fcuunitid");
            return (Criteria) this;
        }

        public Criteria andFcuunitidBetween(Integer value1, Integer value2) {
            addCriterion("FCUUnitID between", value1, value2, "fcuunitid");
            return (Criteria) this;
        }

        public Criteria andFcuunitidNotBetween(Integer value1, Integer value2) {
            addCriterion("FCUUnitID not between", value1, value2, "fcuunitid");
            return (Criteria) this;
        }

        public Criteria andForderintervalIsNull() {
            addCriterion("FOrderInterVal is null");
            return (Criteria) this;
        }

        public Criteria andForderintervalIsNotNull() {
            addCriterion("FOrderInterVal is not null");
            return (Criteria) this;
        }

        public Criteria andForderintervalEqualTo(Integer value) {
            addCriterion("FOrderInterVal =", value, "forderinterval");
            return (Criteria) this;
        }

        public Criteria andForderintervalNotEqualTo(Integer value) {
            addCriterion("FOrderInterVal <>", value, "forderinterval");
            return (Criteria) this;
        }

        public Criteria andForderintervalGreaterThan(Integer value) {
            addCriterion("FOrderInterVal >", value, "forderinterval");
            return (Criteria) this;
        }

        public Criteria andForderintervalGreaterThanOrEqualTo(Integer value) {
            addCriterion("FOrderInterVal >=", value, "forderinterval");
            return (Criteria) this;
        }

        public Criteria andForderintervalLessThan(Integer value) {
            addCriterion("FOrderInterVal <", value, "forderinterval");
            return (Criteria) this;
        }

        public Criteria andForderintervalLessThanOrEqualTo(Integer value) {
            addCriterion("FOrderInterVal <=", value, "forderinterval");
            return (Criteria) this;
        }

        public Criteria andForderintervalIn(List<Integer> values) {
            addCriterion("FOrderInterVal in", values, "forderinterval");
            return (Criteria) this;
        }

        public Criteria andForderintervalNotIn(List<Integer> values) {
            addCriterion("FOrderInterVal not in", values, "forderinterval");
            return (Criteria) this;
        }

        public Criteria andForderintervalBetween(Integer value1, Integer value2) {
            addCriterion("FOrderInterVal between", value1, value2, "forderinterval");
            return (Criteria) this;
        }

        public Criteria andForderintervalNotBetween(Integer value1, Integer value2) {
            addCriterion("FOrderInterVal not between", value1, value2, "forderinterval");
            return (Criteria) this;
        }

        public Criteria andFbatchappendqtyIsNull() {
            addCriterion("FBatchAppendQty is null");
            return (Criteria) this;
        }

        public Criteria andFbatchappendqtyIsNotNull() {
            addCriterion("FBatchAppendQty is not null");
            return (Criteria) this;
        }

        public Criteria andFbatchappendqtyEqualTo(BigDecimal value) {
            addCriterion("FBatchAppendQty =", value, "fbatchappendqty");
            return (Criteria) this;
        }

        public Criteria andFbatchappendqtyNotEqualTo(BigDecimal value) {
            addCriterion("FBatchAppendQty <>", value, "fbatchappendqty");
            return (Criteria) this;
        }

        public Criteria andFbatchappendqtyGreaterThan(BigDecimal value) {
            addCriterion("FBatchAppendQty >", value, "fbatchappendqty");
            return (Criteria) this;
        }

        public Criteria andFbatchappendqtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FBatchAppendQty >=", value, "fbatchappendqty");
            return (Criteria) this;
        }

        public Criteria andFbatchappendqtyLessThan(BigDecimal value) {
            addCriterion("FBatchAppendQty <", value, "fbatchappendqty");
            return (Criteria) this;
        }

        public Criteria andFbatchappendqtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FBatchAppendQty <=", value, "fbatchappendqty");
            return (Criteria) this;
        }

        public Criteria andFbatchappendqtyIn(List<BigDecimal> values) {
            addCriterion("FBatchAppendQty in", values, "fbatchappendqty");
            return (Criteria) this;
        }

        public Criteria andFbatchappendqtyNotIn(List<BigDecimal> values) {
            addCriterion("FBatchAppendQty not in", values, "fbatchappendqty");
            return (Criteria) this;
        }

        public Criteria andFbatchappendqtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FBatchAppendQty between", value1, value2, "fbatchappendqty");
            return (Criteria) this;
        }

        public Criteria andFbatchappendqtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FBatchAppendQty not between", value1, value2, "fbatchappendqty");
            return (Criteria) this;
        }

        public Criteria andForderpointIsNull() {
            addCriterion("FOrderPoint is null");
            return (Criteria) this;
        }

        public Criteria andForderpointIsNotNull() {
            addCriterion("FOrderPoint is not null");
            return (Criteria) this;
        }

        public Criteria andForderpointEqualTo(BigDecimal value) {
            addCriterion("FOrderPoint =", value, "forderpoint");
            return (Criteria) this;
        }

        public Criteria andForderpointNotEqualTo(BigDecimal value) {
            addCriterion("FOrderPoint <>", value, "forderpoint");
            return (Criteria) this;
        }

        public Criteria andForderpointGreaterThan(BigDecimal value) {
            addCriterion("FOrderPoint >", value, "forderpoint");
            return (Criteria) this;
        }

        public Criteria andForderpointGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FOrderPoint >=", value, "forderpoint");
            return (Criteria) this;
        }

        public Criteria andForderpointLessThan(BigDecimal value) {
            addCriterion("FOrderPoint <", value, "forderpoint");
            return (Criteria) this;
        }

        public Criteria andForderpointLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FOrderPoint <=", value, "forderpoint");
            return (Criteria) this;
        }

        public Criteria andForderpointIn(List<BigDecimal> values) {
            addCriterion("FOrderPoint in", values, "forderpoint");
            return (Criteria) this;
        }

        public Criteria andForderpointNotIn(List<BigDecimal> values) {
            addCriterion("FOrderPoint not in", values, "forderpoint");
            return (Criteria) this;
        }

        public Criteria andForderpointBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FOrderPoint between", value1, value2, "forderpoint");
            return (Criteria) this;
        }

        public Criteria andForderpointNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FOrderPoint not between", value1, value2, "forderpoint");
            return (Criteria) this;
        }

        public Criteria andFbatfixeconomyIsNull() {
            addCriterion("FBatFixEconomy is null");
            return (Criteria) this;
        }

        public Criteria andFbatfixeconomyIsNotNull() {
            addCriterion("FBatFixEconomy is not null");
            return (Criteria) this;
        }

        public Criteria andFbatfixeconomyEqualTo(BigDecimal value) {
            addCriterion("FBatFixEconomy =", value, "fbatfixeconomy");
            return (Criteria) this;
        }

        public Criteria andFbatfixeconomyNotEqualTo(BigDecimal value) {
            addCriterion("FBatFixEconomy <>", value, "fbatfixeconomy");
            return (Criteria) this;
        }

        public Criteria andFbatfixeconomyGreaterThan(BigDecimal value) {
            addCriterion("FBatFixEconomy >", value, "fbatfixeconomy");
            return (Criteria) this;
        }

        public Criteria andFbatfixeconomyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FBatFixEconomy >=", value, "fbatfixeconomy");
            return (Criteria) this;
        }

        public Criteria andFbatfixeconomyLessThan(BigDecimal value) {
            addCriterion("FBatFixEconomy <", value, "fbatfixeconomy");
            return (Criteria) this;
        }

        public Criteria andFbatfixeconomyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FBatFixEconomy <=", value, "fbatfixeconomy");
            return (Criteria) this;
        }

        public Criteria andFbatfixeconomyIn(List<BigDecimal> values) {
            addCriterion("FBatFixEconomy in", values, "fbatfixeconomy");
            return (Criteria) this;
        }

        public Criteria andFbatfixeconomyNotIn(List<BigDecimal> values) {
            addCriterion("FBatFixEconomy not in", values, "fbatfixeconomy");
            return (Criteria) this;
        }

        public Criteria andFbatfixeconomyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FBatFixEconomy between", value1, value2, "fbatfixeconomy");
            return (Criteria) this;
        }

        public Criteria andFbatfixeconomyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FBatFixEconomy not between", value1, value2, "fbatfixeconomy");
            return (Criteria) this;
        }

        public Criteria andFbatchangeeconomyIsNull() {
            addCriterion("FBatChangeEconomy is null");
            return (Criteria) this;
        }

        public Criteria andFbatchangeeconomyIsNotNull() {
            addCriterion("FBatChangeEconomy is not null");
            return (Criteria) this;
        }

        public Criteria andFbatchangeeconomyEqualTo(BigDecimal value) {
            addCriterion("FBatChangeEconomy =", value, "fbatchangeeconomy");
            return (Criteria) this;
        }

        public Criteria andFbatchangeeconomyNotEqualTo(BigDecimal value) {
            addCriterion("FBatChangeEconomy <>", value, "fbatchangeeconomy");
            return (Criteria) this;
        }

        public Criteria andFbatchangeeconomyGreaterThan(BigDecimal value) {
            addCriterion("FBatChangeEconomy >", value, "fbatchangeeconomy");
            return (Criteria) this;
        }

        public Criteria andFbatchangeeconomyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FBatChangeEconomy >=", value, "fbatchangeeconomy");
            return (Criteria) this;
        }

        public Criteria andFbatchangeeconomyLessThan(BigDecimal value) {
            addCriterion("FBatChangeEconomy <", value, "fbatchangeeconomy");
            return (Criteria) this;
        }

        public Criteria andFbatchangeeconomyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FBatChangeEconomy <=", value, "fbatchangeeconomy");
            return (Criteria) this;
        }

        public Criteria andFbatchangeeconomyIn(List<BigDecimal> values) {
            addCriterion("FBatChangeEconomy in", values, "fbatchangeeconomy");
            return (Criteria) this;
        }

        public Criteria andFbatchangeeconomyNotIn(List<BigDecimal> values) {
            addCriterion("FBatChangeEconomy not in", values, "fbatchangeeconomy");
            return (Criteria) this;
        }

        public Criteria andFbatchangeeconomyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FBatChangeEconomy between", value1, value2, "fbatchangeeconomy");
            return (Criteria) this;
        }

        public Criteria andFbatchangeeconomyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FBatChangeEconomy not between", value1, value2, "fbatchangeeconomy");
            return (Criteria) this;
        }

        public Criteria andFrequirepointIsNull() {
            addCriterion("FRequirePoint is null");
            return (Criteria) this;
        }

        public Criteria andFrequirepointIsNotNull() {
            addCriterion("FRequirePoint is not null");
            return (Criteria) this;
        }

        public Criteria andFrequirepointEqualTo(Integer value) {
            addCriterion("FRequirePoint =", value, "frequirepoint");
            return (Criteria) this;
        }

        public Criteria andFrequirepointNotEqualTo(Integer value) {
            addCriterion("FRequirePoint <>", value, "frequirepoint");
            return (Criteria) this;
        }

        public Criteria andFrequirepointGreaterThan(Integer value) {
            addCriterion("FRequirePoint >", value, "frequirepoint");
            return (Criteria) this;
        }

        public Criteria andFrequirepointGreaterThanOrEqualTo(Integer value) {
            addCriterion("FRequirePoint >=", value, "frequirepoint");
            return (Criteria) this;
        }

        public Criteria andFrequirepointLessThan(Integer value) {
            addCriterion("FRequirePoint <", value, "frequirepoint");
            return (Criteria) this;
        }

        public Criteria andFrequirepointLessThanOrEqualTo(Integer value) {
            addCriterion("FRequirePoint <=", value, "frequirepoint");
            return (Criteria) this;
        }

        public Criteria andFrequirepointIn(List<Integer> values) {
            addCriterion("FRequirePoint in", values, "frequirepoint");
            return (Criteria) this;
        }

        public Criteria andFrequirepointNotIn(List<Integer> values) {
            addCriterion("FRequirePoint not in", values, "frequirepoint");
            return (Criteria) this;
        }

        public Criteria andFrequirepointBetween(Integer value1, Integer value2) {
            addCriterion("FRequirePoint between", value1, value2, "frequirepoint");
            return (Criteria) this;
        }

        public Criteria andFrequirepointNotBetween(Integer value1, Integer value2) {
            addCriterion("FRequirePoint not between", value1, value2, "frequirepoint");
            return (Criteria) this;
        }

        public Criteria andFplanpointIsNull() {
            addCriterion("FPlanPoint is null");
            return (Criteria) this;
        }

        public Criteria andFplanpointIsNotNull() {
            addCriterion("FPlanPoint is not null");
            return (Criteria) this;
        }

        public Criteria andFplanpointEqualTo(Integer value) {
            addCriterion("FPlanPoint =", value, "fplanpoint");
            return (Criteria) this;
        }

        public Criteria andFplanpointNotEqualTo(Integer value) {
            addCriterion("FPlanPoint <>", value, "fplanpoint");
            return (Criteria) this;
        }

        public Criteria andFplanpointGreaterThan(Integer value) {
            addCriterion("FPlanPoint >", value, "fplanpoint");
            return (Criteria) this;
        }

        public Criteria andFplanpointGreaterThanOrEqualTo(Integer value) {
            addCriterion("FPlanPoint >=", value, "fplanpoint");
            return (Criteria) this;
        }

        public Criteria andFplanpointLessThan(Integer value) {
            addCriterion("FPlanPoint <", value, "fplanpoint");
            return (Criteria) this;
        }

        public Criteria andFplanpointLessThanOrEqualTo(Integer value) {
            addCriterion("FPlanPoint <=", value, "fplanpoint");
            return (Criteria) this;
        }

        public Criteria andFplanpointIn(List<Integer> values) {
            addCriterion("FPlanPoint in", values, "fplanpoint");
            return (Criteria) this;
        }

        public Criteria andFplanpointNotIn(List<Integer> values) {
            addCriterion("FPlanPoint not in", values, "fplanpoint");
            return (Criteria) this;
        }

        public Criteria andFplanpointBetween(Integer value1, Integer value2) {
            addCriterion("FPlanPoint between", value1, value2, "fplanpoint");
            return (Criteria) this;
        }

        public Criteria andFplanpointNotBetween(Integer value1, Integer value2) {
            addCriterion("FPlanPoint not between", value1, value2, "fplanpoint");
            return (Criteria) this;
        }

        public Criteria andFdefaultroutingidIsNull() {
            addCriterion("FDefaultRoutingID is null");
            return (Criteria) this;
        }

        public Criteria andFdefaultroutingidIsNotNull() {
            addCriterion("FDefaultRoutingID is not null");
            return (Criteria) this;
        }

        public Criteria andFdefaultroutingidEqualTo(Integer value) {
            addCriterion("FDefaultRoutingID =", value, "fdefaultroutingid");
            return (Criteria) this;
        }

        public Criteria andFdefaultroutingidNotEqualTo(Integer value) {
            addCriterion("FDefaultRoutingID <>", value, "fdefaultroutingid");
            return (Criteria) this;
        }

        public Criteria andFdefaultroutingidGreaterThan(Integer value) {
            addCriterion("FDefaultRoutingID >", value, "fdefaultroutingid");
            return (Criteria) this;
        }

        public Criteria andFdefaultroutingidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FDefaultRoutingID >=", value, "fdefaultroutingid");
            return (Criteria) this;
        }

        public Criteria andFdefaultroutingidLessThan(Integer value) {
            addCriterion("FDefaultRoutingID <", value, "fdefaultroutingid");
            return (Criteria) this;
        }

        public Criteria andFdefaultroutingidLessThanOrEqualTo(Integer value) {
            addCriterion("FDefaultRoutingID <=", value, "fdefaultroutingid");
            return (Criteria) this;
        }

        public Criteria andFdefaultroutingidIn(List<Integer> values) {
            addCriterion("FDefaultRoutingID in", values, "fdefaultroutingid");
            return (Criteria) this;
        }

        public Criteria andFdefaultroutingidNotIn(List<Integer> values) {
            addCriterion("FDefaultRoutingID not in", values, "fdefaultroutingid");
            return (Criteria) this;
        }

        public Criteria andFdefaultroutingidBetween(Integer value1, Integer value2) {
            addCriterion("FDefaultRoutingID between", value1, value2, "fdefaultroutingid");
            return (Criteria) this;
        }

        public Criteria andFdefaultroutingidNotBetween(Integer value1, Integer value2) {
            addCriterion("FDefaultRoutingID not between", value1, value2, "fdefaultroutingid");
            return (Criteria) this;
        }

        public Criteria andFdefaultworktypeidIsNull() {
            addCriterion("FDefaultWorkTypeID is null");
            return (Criteria) this;
        }

        public Criteria andFdefaultworktypeidIsNotNull() {
            addCriterion("FDefaultWorkTypeID is not null");
            return (Criteria) this;
        }

        public Criteria andFdefaultworktypeidEqualTo(Integer value) {
            addCriterion("FDefaultWorkTypeID =", value, "fdefaultworktypeid");
            return (Criteria) this;
        }

        public Criteria andFdefaultworktypeidNotEqualTo(Integer value) {
            addCriterion("FDefaultWorkTypeID <>", value, "fdefaultworktypeid");
            return (Criteria) this;
        }

        public Criteria andFdefaultworktypeidGreaterThan(Integer value) {
            addCriterion("FDefaultWorkTypeID >", value, "fdefaultworktypeid");
            return (Criteria) this;
        }

        public Criteria andFdefaultworktypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FDefaultWorkTypeID >=", value, "fdefaultworktypeid");
            return (Criteria) this;
        }

        public Criteria andFdefaultworktypeidLessThan(Integer value) {
            addCriterion("FDefaultWorkTypeID <", value, "fdefaultworktypeid");
            return (Criteria) this;
        }

        public Criteria andFdefaultworktypeidLessThanOrEqualTo(Integer value) {
            addCriterion("FDefaultWorkTypeID <=", value, "fdefaultworktypeid");
            return (Criteria) this;
        }

        public Criteria andFdefaultworktypeidIn(List<Integer> values) {
            addCriterion("FDefaultWorkTypeID in", values, "fdefaultworktypeid");
            return (Criteria) this;
        }

        public Criteria andFdefaultworktypeidNotIn(List<Integer> values) {
            addCriterion("FDefaultWorkTypeID not in", values, "fdefaultworktypeid");
            return (Criteria) this;
        }

        public Criteria andFdefaultworktypeidBetween(Integer value1, Integer value2) {
            addCriterion("FDefaultWorkTypeID between", value1, value2, "fdefaultworktypeid");
            return (Criteria) this;
        }

        public Criteria andFdefaultworktypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("FDefaultWorkTypeID not between", value1, value2, "fdefaultworktypeid");
            return (Criteria) this;
        }

        public Criteria andFproductprincipalIsNull() {
            addCriterion("FProductPrincipal is null");
            return (Criteria) this;
        }

        public Criteria andFproductprincipalIsNotNull() {
            addCriterion("FProductPrincipal is not null");
            return (Criteria) this;
        }

        public Criteria andFproductprincipalEqualTo(Integer value) {
            addCriterion("FProductPrincipal =", value, "fproductprincipal");
            return (Criteria) this;
        }

        public Criteria andFproductprincipalNotEqualTo(Integer value) {
            addCriterion("FProductPrincipal <>", value, "fproductprincipal");
            return (Criteria) this;
        }

        public Criteria andFproductprincipalGreaterThan(Integer value) {
            addCriterion("FProductPrincipal >", value, "fproductprincipal");
            return (Criteria) this;
        }

        public Criteria andFproductprincipalGreaterThanOrEqualTo(Integer value) {
            addCriterion("FProductPrincipal >=", value, "fproductprincipal");
            return (Criteria) this;
        }

        public Criteria andFproductprincipalLessThan(Integer value) {
            addCriterion("FProductPrincipal <", value, "fproductprincipal");
            return (Criteria) this;
        }

        public Criteria andFproductprincipalLessThanOrEqualTo(Integer value) {
            addCriterion("FProductPrincipal <=", value, "fproductprincipal");
            return (Criteria) this;
        }

        public Criteria andFproductprincipalIn(List<Integer> values) {
            addCriterion("FProductPrincipal in", values, "fproductprincipal");
            return (Criteria) this;
        }

        public Criteria andFproductprincipalNotIn(List<Integer> values) {
            addCriterion("FProductPrincipal not in", values, "fproductprincipal");
            return (Criteria) this;
        }

        public Criteria andFproductprincipalBetween(Integer value1, Integer value2) {
            addCriterion("FProductPrincipal between", value1, value2, "fproductprincipal");
            return (Criteria) this;
        }

        public Criteria andFproductprincipalNotBetween(Integer value1, Integer value2) {
            addCriterion("FProductPrincipal not between", value1, value2, "fproductprincipal");
            return (Criteria) this;
        }

        public Criteria andFdailyconsumeIsNull() {
            addCriterion("FDailyConsume is null");
            return (Criteria) this;
        }

        public Criteria andFdailyconsumeIsNotNull() {
            addCriterion("FDailyConsume is not null");
            return (Criteria) this;
        }

        public Criteria andFdailyconsumeEqualTo(BigDecimal value) {
            addCriterion("FDailyConsume =", value, "fdailyconsume");
            return (Criteria) this;
        }

        public Criteria andFdailyconsumeNotEqualTo(BigDecimal value) {
            addCriterion("FDailyConsume <>", value, "fdailyconsume");
            return (Criteria) this;
        }

        public Criteria andFdailyconsumeGreaterThan(BigDecimal value) {
            addCriterion("FDailyConsume >", value, "fdailyconsume");
            return (Criteria) this;
        }

        public Criteria andFdailyconsumeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FDailyConsume >=", value, "fdailyconsume");
            return (Criteria) this;
        }

        public Criteria andFdailyconsumeLessThan(BigDecimal value) {
            addCriterion("FDailyConsume <", value, "fdailyconsume");
            return (Criteria) this;
        }

        public Criteria andFdailyconsumeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FDailyConsume <=", value, "fdailyconsume");
            return (Criteria) this;
        }

        public Criteria andFdailyconsumeIn(List<BigDecimal> values) {
            addCriterion("FDailyConsume in", values, "fdailyconsume");
            return (Criteria) this;
        }

        public Criteria andFdailyconsumeNotIn(List<BigDecimal> values) {
            addCriterion("FDailyConsume not in", values, "fdailyconsume");
            return (Criteria) this;
        }

        public Criteria andFdailyconsumeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FDailyConsume between", value1, value2, "fdailyconsume");
            return (Criteria) this;
        }

        public Criteria andFdailyconsumeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FDailyConsume not between", value1, value2, "fdailyconsume");
            return (Criteria) this;
        }

        public Criteria andFmrpconIsNull() {
            addCriterion("FMRPCon is null");
            return (Criteria) this;
        }

        public Criteria andFmrpconIsNotNull() {
            addCriterion("FMRPCon is not null");
            return (Criteria) this;
        }

        public Criteria andFmrpconEqualTo(Boolean value) {
            addCriterion("FMRPCon =", value, "fmrpcon");
            return (Criteria) this;
        }

        public Criteria andFmrpconNotEqualTo(Boolean value) {
            addCriterion("FMRPCon <>", value, "fmrpcon");
            return (Criteria) this;
        }

        public Criteria andFmrpconGreaterThan(Boolean value) {
            addCriterion("FMRPCon >", value, "fmrpcon");
            return (Criteria) this;
        }

        public Criteria andFmrpconGreaterThanOrEqualTo(Boolean value) {
            addCriterion("FMRPCon >=", value, "fmrpcon");
            return (Criteria) this;
        }

        public Criteria andFmrpconLessThan(Boolean value) {
            addCriterion("FMRPCon <", value, "fmrpcon");
            return (Criteria) this;
        }

        public Criteria andFmrpconLessThanOrEqualTo(Boolean value) {
            addCriterion("FMRPCon <=", value, "fmrpcon");
            return (Criteria) this;
        }

        public Criteria andFmrpconIn(List<Boolean> values) {
            addCriterion("FMRPCon in", values, "fmrpcon");
            return (Criteria) this;
        }

        public Criteria andFmrpconNotIn(List<Boolean> values) {
            addCriterion("FMRPCon not in", values, "fmrpcon");
            return (Criteria) this;
        }

        public Criteria andFmrpconBetween(Boolean value1, Boolean value2) {
            addCriterion("FMRPCon between", value1, value2, "fmrpcon");
            return (Criteria) this;
        }

        public Criteria andFmrpconNotBetween(Boolean value1, Boolean value2) {
            addCriterion("FMRPCon not between", value1, value2, "fmrpcon");
            return (Criteria) this;
        }

        public Criteria andFplannerIsNull() {
            addCriterion("FPlanner is null");
            return (Criteria) this;
        }

        public Criteria andFplannerIsNotNull() {
            addCriterion("FPlanner is not null");
            return (Criteria) this;
        }

        public Criteria andFplannerEqualTo(Integer value) {
            addCriterion("FPlanner =", value, "fplanner");
            return (Criteria) this;
        }

        public Criteria andFplannerNotEqualTo(Integer value) {
            addCriterion("FPlanner <>", value, "fplanner");
            return (Criteria) this;
        }

        public Criteria andFplannerGreaterThan(Integer value) {
            addCriterion("FPlanner >", value, "fplanner");
            return (Criteria) this;
        }

        public Criteria andFplannerGreaterThanOrEqualTo(Integer value) {
            addCriterion("FPlanner >=", value, "fplanner");
            return (Criteria) this;
        }

        public Criteria andFplannerLessThan(Integer value) {
            addCriterion("FPlanner <", value, "fplanner");
            return (Criteria) this;
        }

        public Criteria andFplannerLessThanOrEqualTo(Integer value) {
            addCriterion("FPlanner <=", value, "fplanner");
            return (Criteria) this;
        }

        public Criteria andFplannerIn(List<Integer> values) {
            addCriterion("FPlanner in", values, "fplanner");
            return (Criteria) this;
        }

        public Criteria andFplannerNotIn(List<Integer> values) {
            addCriterion("FPlanner not in", values, "fplanner");
            return (Criteria) this;
        }

        public Criteria andFplannerBetween(Integer value1, Integer value2) {
            addCriterion("FPlanner between", value1, value2, "fplanner");
            return (Criteria) this;
        }

        public Criteria andFplannerNotBetween(Integer value1, Integer value2) {
            addCriterion("FPlanner not between", value1, value2, "fplanner");
            return (Criteria) this;
        }

        public Criteria andFputintegerIsNull() {
            addCriterion("FPutInteger is null");
            return (Criteria) this;
        }

        public Criteria andFputintegerIsNotNull() {
            addCriterion("FPutInteger is not null");
            return (Criteria) this;
        }

        public Criteria andFputintegerEqualTo(Boolean value) {
            addCriterion("FPutInteger =", value, "fputinteger");
            return (Criteria) this;
        }

        public Criteria andFputintegerNotEqualTo(Boolean value) {
            addCriterion("FPutInteger <>", value, "fputinteger");
            return (Criteria) this;
        }

        public Criteria andFputintegerGreaterThan(Boolean value) {
            addCriterion("FPutInteger >", value, "fputinteger");
            return (Criteria) this;
        }

        public Criteria andFputintegerGreaterThanOrEqualTo(Boolean value) {
            addCriterion("FPutInteger >=", value, "fputinteger");
            return (Criteria) this;
        }

        public Criteria andFputintegerLessThan(Boolean value) {
            addCriterion("FPutInteger <", value, "fputinteger");
            return (Criteria) this;
        }

        public Criteria andFputintegerLessThanOrEqualTo(Boolean value) {
            addCriterion("FPutInteger <=", value, "fputinteger");
            return (Criteria) this;
        }

        public Criteria andFputintegerIn(List<Boolean> values) {
            addCriterion("FPutInteger in", values, "fputinteger");
            return (Criteria) this;
        }

        public Criteria andFputintegerNotIn(List<Boolean> values) {
            addCriterion("FPutInteger not in", values, "fputinteger");
            return (Criteria) this;
        }

        public Criteria andFputintegerBetween(Boolean value1, Boolean value2) {
            addCriterion("FPutInteger between", value1, value2, "fputinteger");
            return (Criteria) this;
        }

        public Criteria andFputintegerNotBetween(Boolean value1, Boolean value2) {
            addCriterion("FPutInteger not between", value1, value2, "fputinteger");
            return (Criteria) this;
        }

        public Criteria andFinhighlimitIsNull() {
            addCriterion("FInHighLimit is null");
            return (Criteria) this;
        }

        public Criteria andFinhighlimitIsNotNull() {
            addCriterion("FInHighLimit is not null");
            return (Criteria) this;
        }

        public Criteria andFinhighlimitEqualTo(BigDecimal value) {
            addCriterion("FInHighLimit =", value, "finhighlimit");
            return (Criteria) this;
        }

        public Criteria andFinhighlimitNotEqualTo(BigDecimal value) {
            addCriterion("FInHighLimit <>", value, "finhighlimit");
            return (Criteria) this;
        }

        public Criteria andFinhighlimitGreaterThan(BigDecimal value) {
            addCriterion("FInHighLimit >", value, "finhighlimit");
            return (Criteria) this;
        }

        public Criteria andFinhighlimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FInHighLimit >=", value, "finhighlimit");
            return (Criteria) this;
        }

        public Criteria andFinhighlimitLessThan(BigDecimal value) {
            addCriterion("FInHighLimit <", value, "finhighlimit");
            return (Criteria) this;
        }

        public Criteria andFinhighlimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FInHighLimit <=", value, "finhighlimit");
            return (Criteria) this;
        }

        public Criteria andFinhighlimitIn(List<BigDecimal> values) {
            addCriterion("FInHighLimit in", values, "finhighlimit");
            return (Criteria) this;
        }

        public Criteria andFinhighlimitNotIn(List<BigDecimal> values) {
            addCriterion("FInHighLimit not in", values, "finhighlimit");
            return (Criteria) this;
        }

        public Criteria andFinhighlimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FInHighLimit between", value1, value2, "finhighlimit");
            return (Criteria) this;
        }

        public Criteria andFinhighlimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FInHighLimit not between", value1, value2, "finhighlimit");
            return (Criteria) this;
        }

        public Criteria andFinlowlimitIsNull() {
            addCriterion("FInLowLimit is null");
            return (Criteria) this;
        }

        public Criteria andFinlowlimitIsNotNull() {
            addCriterion("FInLowLimit is not null");
            return (Criteria) this;
        }

        public Criteria andFinlowlimitEqualTo(BigDecimal value) {
            addCriterion("FInLowLimit =", value, "finlowlimit");
            return (Criteria) this;
        }

        public Criteria andFinlowlimitNotEqualTo(BigDecimal value) {
            addCriterion("FInLowLimit <>", value, "finlowlimit");
            return (Criteria) this;
        }

        public Criteria andFinlowlimitGreaterThan(BigDecimal value) {
            addCriterion("FInLowLimit >", value, "finlowlimit");
            return (Criteria) this;
        }

        public Criteria andFinlowlimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FInLowLimit >=", value, "finlowlimit");
            return (Criteria) this;
        }

        public Criteria andFinlowlimitLessThan(BigDecimal value) {
            addCriterion("FInLowLimit <", value, "finlowlimit");
            return (Criteria) this;
        }

        public Criteria andFinlowlimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FInLowLimit <=", value, "finlowlimit");
            return (Criteria) this;
        }

        public Criteria andFinlowlimitIn(List<BigDecimal> values) {
            addCriterion("FInLowLimit in", values, "finlowlimit");
            return (Criteria) this;
        }

        public Criteria andFinlowlimitNotIn(List<BigDecimal> values) {
            addCriterion("FInLowLimit not in", values, "finlowlimit");
            return (Criteria) this;
        }

        public Criteria andFinlowlimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FInLowLimit between", value1, value2, "finlowlimit");
            return (Criteria) this;
        }

        public Criteria andFinlowlimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FInLowLimit not between", value1, value2, "finlowlimit");
            return (Criteria) this;
        }

        public Criteria andFlowestbomcodeIsNull() {
            addCriterion("FLowestBomCode is null");
            return (Criteria) this;
        }

        public Criteria andFlowestbomcodeIsNotNull() {
            addCriterion("FLowestBomCode is not null");
            return (Criteria) this;
        }

        public Criteria andFlowestbomcodeEqualTo(Integer value) {
            addCriterion("FLowestBomCode =", value, "flowestbomcode");
            return (Criteria) this;
        }

        public Criteria andFlowestbomcodeNotEqualTo(Integer value) {
            addCriterion("FLowestBomCode <>", value, "flowestbomcode");
            return (Criteria) this;
        }

        public Criteria andFlowestbomcodeGreaterThan(Integer value) {
            addCriterion("FLowestBomCode >", value, "flowestbomcode");
            return (Criteria) this;
        }

        public Criteria andFlowestbomcodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("FLowestBomCode >=", value, "flowestbomcode");
            return (Criteria) this;
        }

        public Criteria andFlowestbomcodeLessThan(Integer value) {
            addCriterion("FLowestBomCode <", value, "flowestbomcode");
            return (Criteria) this;
        }

        public Criteria andFlowestbomcodeLessThanOrEqualTo(Integer value) {
            addCriterion("FLowestBomCode <=", value, "flowestbomcode");
            return (Criteria) this;
        }

        public Criteria andFlowestbomcodeIn(List<Integer> values) {
            addCriterion("FLowestBomCode in", values, "flowestbomcode");
            return (Criteria) this;
        }

        public Criteria andFlowestbomcodeNotIn(List<Integer> values) {
            addCriterion("FLowestBomCode not in", values, "flowestbomcode");
            return (Criteria) this;
        }

        public Criteria andFlowestbomcodeBetween(Integer value1, Integer value2) {
            addCriterion("FLowestBomCode between", value1, value2, "flowestbomcode");
            return (Criteria) this;
        }

        public Criteria andFlowestbomcodeNotBetween(Integer value1, Integer value2) {
            addCriterion("FLowestBomCode not between", value1, value2, "flowestbomcode");
            return (Criteria) this;
        }

        public Criteria andFmrporderIsNull() {
            addCriterion("FMRPOrder is null");
            return (Criteria) this;
        }

        public Criteria andFmrporderIsNotNull() {
            addCriterion("FMRPOrder is not null");
            return (Criteria) this;
        }

        public Criteria andFmrporderEqualTo(Boolean value) {
            addCriterion("FMRPOrder =", value, "fmrporder");
            return (Criteria) this;
        }

        public Criteria andFmrporderNotEqualTo(Boolean value) {
            addCriterion("FMRPOrder <>", value, "fmrporder");
            return (Criteria) this;
        }

        public Criteria andFmrporderGreaterThan(Boolean value) {
            addCriterion("FMRPOrder >", value, "fmrporder");
            return (Criteria) this;
        }

        public Criteria andFmrporderGreaterThanOrEqualTo(Boolean value) {
            addCriterion("FMRPOrder >=", value, "fmrporder");
            return (Criteria) this;
        }

        public Criteria andFmrporderLessThan(Boolean value) {
            addCriterion("FMRPOrder <", value, "fmrporder");
            return (Criteria) this;
        }

        public Criteria andFmrporderLessThanOrEqualTo(Boolean value) {
            addCriterion("FMRPOrder <=", value, "fmrporder");
            return (Criteria) this;
        }

        public Criteria andFmrporderIn(List<Boolean> values) {
            addCriterion("FMRPOrder in", values, "fmrporder");
            return (Criteria) this;
        }

        public Criteria andFmrporderNotIn(List<Boolean> values) {
            addCriterion("FMRPOrder not in", values, "fmrporder");
            return (Criteria) this;
        }

        public Criteria andFmrporderBetween(Boolean value1, Boolean value2) {
            addCriterion("FMRPOrder between", value1, value2, "fmrporder");
            return (Criteria) this;
        }

        public Criteria andFmrporderNotBetween(Boolean value1, Boolean value2) {
            addCriterion("FMRPOrder not between", value1, value2, "fmrporder");
            return (Criteria) this;
        }

        public Criteria andFischarsourceitemIsNull() {
            addCriterion("FIsCharSourceItem is null");
            return (Criteria) this;
        }

        public Criteria andFischarsourceitemIsNotNull() {
            addCriterion("FIsCharSourceItem is not null");
            return (Criteria) this;
        }

        public Criteria andFischarsourceitemEqualTo(Integer value) {
            addCriterion("FIsCharSourceItem =", value, "fischarsourceitem");
            return (Criteria) this;
        }

        public Criteria andFischarsourceitemNotEqualTo(Integer value) {
            addCriterion("FIsCharSourceItem <>", value, "fischarsourceitem");
            return (Criteria) this;
        }

        public Criteria andFischarsourceitemGreaterThan(Integer value) {
            addCriterion("FIsCharSourceItem >", value, "fischarsourceitem");
            return (Criteria) this;
        }

        public Criteria andFischarsourceitemGreaterThanOrEqualTo(Integer value) {
            addCriterion("FIsCharSourceItem >=", value, "fischarsourceitem");
            return (Criteria) this;
        }

        public Criteria andFischarsourceitemLessThan(Integer value) {
            addCriterion("FIsCharSourceItem <", value, "fischarsourceitem");
            return (Criteria) this;
        }

        public Criteria andFischarsourceitemLessThanOrEqualTo(Integer value) {
            addCriterion("FIsCharSourceItem <=", value, "fischarsourceitem");
            return (Criteria) this;
        }

        public Criteria andFischarsourceitemIn(List<Integer> values) {
            addCriterion("FIsCharSourceItem in", values, "fischarsourceitem");
            return (Criteria) this;
        }

        public Criteria andFischarsourceitemNotIn(List<Integer> values) {
            addCriterion("FIsCharSourceItem not in", values, "fischarsourceitem");
            return (Criteria) this;
        }

        public Criteria andFischarsourceitemBetween(Integer value1, Integer value2) {
            addCriterion("FIsCharSourceItem between", value1, value2, "fischarsourceitem");
            return (Criteria) this;
        }

        public Criteria andFischarsourceitemNotBetween(Integer value1, Integer value2) {
            addCriterion("FIsCharSourceItem not between", value1, value2, "fischarsourceitem");
            return (Criteria) this;
        }

        public Criteria andFcharsourceitemidIsNull() {
            addCriterion("FCharSourceItemID is null");
            return (Criteria) this;
        }

        public Criteria andFcharsourceitemidIsNotNull() {
            addCriterion("FCharSourceItemID is not null");
            return (Criteria) this;
        }

        public Criteria andFcharsourceitemidEqualTo(Integer value) {
            addCriterion("FCharSourceItemID =", value, "fcharsourceitemid");
            return (Criteria) this;
        }

        public Criteria andFcharsourceitemidNotEqualTo(Integer value) {
            addCriterion("FCharSourceItemID <>", value, "fcharsourceitemid");
            return (Criteria) this;
        }

        public Criteria andFcharsourceitemidGreaterThan(Integer value) {
            addCriterion("FCharSourceItemID >", value, "fcharsourceitemid");
            return (Criteria) this;
        }

        public Criteria andFcharsourceitemidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FCharSourceItemID >=", value, "fcharsourceitemid");
            return (Criteria) this;
        }

        public Criteria andFcharsourceitemidLessThan(Integer value) {
            addCriterion("FCharSourceItemID <", value, "fcharsourceitemid");
            return (Criteria) this;
        }

        public Criteria andFcharsourceitemidLessThanOrEqualTo(Integer value) {
            addCriterion("FCharSourceItemID <=", value, "fcharsourceitemid");
            return (Criteria) this;
        }

        public Criteria andFcharsourceitemidIn(List<Integer> values) {
            addCriterion("FCharSourceItemID in", values, "fcharsourceitemid");
            return (Criteria) this;
        }

        public Criteria andFcharsourceitemidNotIn(List<Integer> values) {
            addCriterion("FCharSourceItemID not in", values, "fcharsourceitemid");
            return (Criteria) this;
        }

        public Criteria andFcharsourceitemidBetween(Integer value1, Integer value2) {
            addCriterion("FCharSourceItemID between", value1, value2, "fcharsourceitemid");
            return (Criteria) this;
        }

        public Criteria andFcharsourceitemidNotBetween(Integer value1, Integer value2) {
            addCriterion("FCharSourceItemID not between", value1, value2, "fcharsourceitemid");
            return (Criteria) this;
        }

        public Criteria andFplanmodeIsNull() {
            addCriterion("FPlanMode is null");
            return (Criteria) this;
        }

        public Criteria andFplanmodeIsNotNull() {
            addCriterion("FPlanMode is not null");
            return (Criteria) this;
        }

        public Criteria andFplanmodeEqualTo(Integer value) {
            addCriterion("FPlanMode =", value, "fplanmode");
            return (Criteria) this;
        }

        public Criteria andFplanmodeNotEqualTo(Integer value) {
            addCriterion("FPlanMode <>", value, "fplanmode");
            return (Criteria) this;
        }

        public Criteria andFplanmodeGreaterThan(Integer value) {
            addCriterion("FPlanMode >", value, "fplanmode");
            return (Criteria) this;
        }

        public Criteria andFplanmodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("FPlanMode >=", value, "fplanmode");
            return (Criteria) this;
        }

        public Criteria andFplanmodeLessThan(Integer value) {
            addCriterion("FPlanMode <", value, "fplanmode");
            return (Criteria) this;
        }

        public Criteria andFplanmodeLessThanOrEqualTo(Integer value) {
            addCriterion("FPlanMode <=", value, "fplanmode");
            return (Criteria) this;
        }

        public Criteria andFplanmodeIn(List<Integer> values) {
            addCriterion("FPlanMode in", values, "fplanmode");
            return (Criteria) this;
        }

        public Criteria andFplanmodeNotIn(List<Integer> values) {
            addCriterion("FPlanMode not in", values, "fplanmode");
            return (Criteria) this;
        }

        public Criteria andFplanmodeBetween(Integer value1, Integer value2) {
            addCriterion("FPlanMode between", value1, value2, "fplanmode");
            return (Criteria) this;
        }

        public Criteria andFplanmodeNotBetween(Integer value1, Integer value2) {
            addCriterion("FPlanMode not between", value1, value2, "fplanmode");
            return (Criteria) this;
        }

        public Criteria andFctrltypeIsNull() {
            addCriterion("FCtrlType is null");
            return (Criteria) this;
        }

        public Criteria andFctrltypeIsNotNull() {
            addCriterion("FCtrlType is not null");
            return (Criteria) this;
        }

        public Criteria andFctrltypeEqualTo(Integer value) {
            addCriterion("FCtrlType =", value, "fctrltype");
            return (Criteria) this;
        }

        public Criteria andFctrltypeNotEqualTo(Integer value) {
            addCriterion("FCtrlType <>", value, "fctrltype");
            return (Criteria) this;
        }

        public Criteria andFctrltypeGreaterThan(Integer value) {
            addCriterion("FCtrlType >", value, "fctrltype");
            return (Criteria) this;
        }

        public Criteria andFctrltypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("FCtrlType >=", value, "fctrltype");
            return (Criteria) this;
        }

        public Criteria andFctrltypeLessThan(Integer value) {
            addCriterion("FCtrlType <", value, "fctrltype");
            return (Criteria) this;
        }

        public Criteria andFctrltypeLessThanOrEqualTo(Integer value) {
            addCriterion("FCtrlType <=", value, "fctrltype");
            return (Criteria) this;
        }

        public Criteria andFctrltypeIn(List<Integer> values) {
            addCriterion("FCtrlType in", values, "fctrltype");
            return (Criteria) this;
        }

        public Criteria andFctrltypeNotIn(List<Integer> values) {
            addCriterion("FCtrlType not in", values, "fctrltype");
            return (Criteria) this;
        }

        public Criteria andFctrltypeBetween(Integer value1, Integer value2) {
            addCriterion("FCtrlType between", value1, value2, "fctrltype");
            return (Criteria) this;
        }

        public Criteria andFctrltypeNotBetween(Integer value1, Integer value2) {
            addCriterion("FCtrlType not between", value1, value2, "fctrltype");
            return (Criteria) this;
        }

        public Criteria andFctrlstraregyIsNull() {
            addCriterion("FCtrlStraregy is null");
            return (Criteria) this;
        }

        public Criteria andFctrlstraregyIsNotNull() {
            addCriterion("FCtrlStraregy is not null");
            return (Criteria) this;
        }

        public Criteria andFctrlstraregyEqualTo(Integer value) {
            addCriterion("FCtrlStraregy =", value, "fctrlstraregy");
            return (Criteria) this;
        }

        public Criteria andFctrlstraregyNotEqualTo(Integer value) {
            addCriterion("FCtrlStraregy <>", value, "fctrlstraregy");
            return (Criteria) this;
        }

        public Criteria andFctrlstraregyGreaterThan(Integer value) {
            addCriterion("FCtrlStraregy >", value, "fctrlstraregy");
            return (Criteria) this;
        }

        public Criteria andFctrlstraregyGreaterThanOrEqualTo(Integer value) {
            addCriterion("FCtrlStraregy >=", value, "fctrlstraregy");
            return (Criteria) this;
        }

        public Criteria andFctrlstraregyLessThan(Integer value) {
            addCriterion("FCtrlStraregy <", value, "fctrlstraregy");
            return (Criteria) this;
        }

        public Criteria andFctrlstraregyLessThanOrEqualTo(Integer value) {
            addCriterion("FCtrlStraregy <=", value, "fctrlstraregy");
            return (Criteria) this;
        }

        public Criteria andFctrlstraregyIn(List<Integer> values) {
            addCriterion("FCtrlStraregy in", values, "fctrlstraregy");
            return (Criteria) this;
        }

        public Criteria andFctrlstraregyNotIn(List<Integer> values) {
            addCriterion("FCtrlStraregy not in", values, "fctrlstraregy");
            return (Criteria) this;
        }

        public Criteria andFctrlstraregyBetween(Integer value1, Integer value2) {
            addCriterion("FCtrlStraregy between", value1, value2, "fctrlstraregy");
            return (Criteria) this;
        }

        public Criteria andFctrlstraregyNotBetween(Integer value1, Integer value2) {
            addCriterion("FCtrlStraregy not between", value1, value2, "fctrlstraregy");
            return (Criteria) this;
        }

        public Criteria andFcontainernameIsNull() {
            addCriterion("FContainerName is null");
            return (Criteria) this;
        }

        public Criteria andFcontainernameIsNotNull() {
            addCriterion("FContainerName is not null");
            return (Criteria) this;
        }

        public Criteria andFcontainernameEqualTo(String value) {
            addCriterion("FContainerName =", value, "fcontainername");
            return (Criteria) this;
        }

        public Criteria andFcontainernameNotEqualTo(String value) {
            addCriterion("FContainerName <>", value, "fcontainername");
            return (Criteria) this;
        }

        public Criteria andFcontainernameGreaterThan(String value) {
            addCriterion("FContainerName >", value, "fcontainername");
            return (Criteria) this;
        }

        public Criteria andFcontainernameGreaterThanOrEqualTo(String value) {
            addCriterion("FContainerName >=", value, "fcontainername");
            return (Criteria) this;
        }

        public Criteria andFcontainernameLessThan(String value) {
            addCriterion("FContainerName <", value, "fcontainername");
            return (Criteria) this;
        }

        public Criteria andFcontainernameLessThanOrEqualTo(String value) {
            addCriterion("FContainerName <=", value, "fcontainername");
            return (Criteria) this;
        }

        public Criteria andFcontainernameLike(String value) {
            addCriterion("FContainerName like", value, "fcontainername");
            return (Criteria) this;
        }

        public Criteria andFcontainernameNotLike(String value) {
            addCriterion("FContainerName not like", value, "fcontainername");
            return (Criteria) this;
        }

        public Criteria andFcontainernameIn(List<String> values) {
            addCriterion("FContainerName in", values, "fcontainername");
            return (Criteria) this;
        }

        public Criteria andFcontainernameNotIn(List<String> values) {
            addCriterion("FContainerName not in", values, "fcontainername");
            return (Criteria) this;
        }

        public Criteria andFcontainernameBetween(String value1, String value2) {
            addCriterion("FContainerName between", value1, value2, "fcontainername");
            return (Criteria) this;
        }

        public Criteria andFcontainernameNotBetween(String value1, String value2) {
            addCriterion("FContainerName not between", value1, value2, "fcontainername");
            return (Criteria) this;
        }

        public Criteria andFkanbancapabilityIsNull() {
            addCriterion("FKanBanCapability is null");
            return (Criteria) this;
        }

        public Criteria andFkanbancapabilityIsNotNull() {
            addCriterion("FKanBanCapability is not null");
            return (Criteria) this;
        }

        public Criteria andFkanbancapabilityEqualTo(Integer value) {
            addCriterion("FKanBanCapability =", value, "fkanbancapability");
            return (Criteria) this;
        }

        public Criteria andFkanbancapabilityNotEqualTo(Integer value) {
            addCriterion("FKanBanCapability <>", value, "fkanbancapability");
            return (Criteria) this;
        }

        public Criteria andFkanbancapabilityGreaterThan(Integer value) {
            addCriterion("FKanBanCapability >", value, "fkanbancapability");
            return (Criteria) this;
        }

        public Criteria andFkanbancapabilityGreaterThanOrEqualTo(Integer value) {
            addCriterion("FKanBanCapability >=", value, "fkanbancapability");
            return (Criteria) this;
        }

        public Criteria andFkanbancapabilityLessThan(Integer value) {
            addCriterion("FKanBanCapability <", value, "fkanbancapability");
            return (Criteria) this;
        }

        public Criteria andFkanbancapabilityLessThanOrEqualTo(Integer value) {
            addCriterion("FKanBanCapability <=", value, "fkanbancapability");
            return (Criteria) this;
        }

        public Criteria andFkanbancapabilityIn(List<Integer> values) {
            addCriterion("FKanBanCapability in", values, "fkanbancapability");
            return (Criteria) this;
        }

        public Criteria andFkanbancapabilityNotIn(List<Integer> values) {
            addCriterion("FKanBanCapability not in", values, "fkanbancapability");
            return (Criteria) this;
        }

        public Criteria andFkanbancapabilityBetween(Integer value1, Integer value2) {
            addCriterion("FKanBanCapability between", value1, value2, "fkanbancapability");
            return (Criteria) this;
        }

        public Criteria andFkanbancapabilityNotBetween(Integer value1, Integer value2) {
            addCriterion("FKanBanCapability not between", value1, value2, "fkanbancapability");
            return (Criteria) this;
        }

        public Criteria andFisbackflushIsNull() {
            addCriterion("FIsBackFlush is null");
            return (Criteria) this;
        }

        public Criteria andFisbackflushIsNotNull() {
            addCriterion("FIsBackFlush is not null");
            return (Criteria) this;
        }

        public Criteria andFisbackflushEqualTo(Integer value) {
            addCriterion("FIsBackFlush =", value, "fisbackflush");
            return (Criteria) this;
        }

        public Criteria andFisbackflushNotEqualTo(Integer value) {
            addCriterion("FIsBackFlush <>", value, "fisbackflush");
            return (Criteria) this;
        }

        public Criteria andFisbackflushGreaterThan(Integer value) {
            addCriterion("FIsBackFlush >", value, "fisbackflush");
            return (Criteria) this;
        }

        public Criteria andFisbackflushGreaterThanOrEqualTo(Integer value) {
            addCriterion("FIsBackFlush >=", value, "fisbackflush");
            return (Criteria) this;
        }

        public Criteria andFisbackflushLessThan(Integer value) {
            addCriterion("FIsBackFlush <", value, "fisbackflush");
            return (Criteria) this;
        }

        public Criteria andFisbackflushLessThanOrEqualTo(Integer value) {
            addCriterion("FIsBackFlush <=", value, "fisbackflush");
            return (Criteria) this;
        }

        public Criteria andFisbackflushIn(List<Integer> values) {
            addCriterion("FIsBackFlush in", values, "fisbackflush");
            return (Criteria) this;
        }

        public Criteria andFisbackflushNotIn(List<Integer> values) {
            addCriterion("FIsBackFlush not in", values, "fisbackflush");
            return (Criteria) this;
        }

        public Criteria andFisbackflushBetween(Integer value1, Integer value2) {
            addCriterion("FIsBackFlush between", value1, value2, "fisbackflush");
            return (Criteria) this;
        }

        public Criteria andFisbackflushNotBetween(Integer value1, Integer value2) {
            addCriterion("FIsBackFlush not between", value1, value2, "fisbackflush");
            return (Criteria) this;
        }

        public Criteria andFbackflushstockidIsNull() {
            addCriterion("FBackFlushStockID is null");
            return (Criteria) this;
        }

        public Criteria andFbackflushstockidIsNotNull() {
            addCriterion("FBackFlushStockID is not null");
            return (Criteria) this;
        }

        public Criteria andFbackflushstockidEqualTo(Integer value) {
            addCriterion("FBackFlushStockID =", value, "fbackflushstockid");
            return (Criteria) this;
        }

        public Criteria andFbackflushstockidNotEqualTo(Integer value) {
            addCriterion("FBackFlushStockID <>", value, "fbackflushstockid");
            return (Criteria) this;
        }

        public Criteria andFbackflushstockidGreaterThan(Integer value) {
            addCriterion("FBackFlushStockID >", value, "fbackflushstockid");
            return (Criteria) this;
        }

        public Criteria andFbackflushstockidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FBackFlushStockID >=", value, "fbackflushstockid");
            return (Criteria) this;
        }

        public Criteria andFbackflushstockidLessThan(Integer value) {
            addCriterion("FBackFlushStockID <", value, "fbackflushstockid");
            return (Criteria) this;
        }

        public Criteria andFbackflushstockidLessThanOrEqualTo(Integer value) {
            addCriterion("FBackFlushStockID <=", value, "fbackflushstockid");
            return (Criteria) this;
        }

        public Criteria andFbackflushstockidIn(List<Integer> values) {
            addCriterion("FBackFlushStockID in", values, "fbackflushstockid");
            return (Criteria) this;
        }

        public Criteria andFbackflushstockidNotIn(List<Integer> values) {
            addCriterion("FBackFlushStockID not in", values, "fbackflushstockid");
            return (Criteria) this;
        }

        public Criteria andFbackflushstockidBetween(Integer value1, Integer value2) {
            addCriterion("FBackFlushStockID between", value1, value2, "fbackflushstockid");
            return (Criteria) this;
        }

        public Criteria andFbackflushstockidNotBetween(Integer value1, Integer value2) {
            addCriterion("FBackFlushStockID not between", value1, value2, "fbackflushstockid");
            return (Criteria) this;
        }

        public Criteria andFbackflushspidIsNull() {
            addCriterion("FBackFlushSPID is null");
            return (Criteria) this;
        }

        public Criteria andFbackflushspidIsNotNull() {
            addCriterion("FBackFlushSPID is not null");
            return (Criteria) this;
        }

        public Criteria andFbackflushspidEqualTo(Integer value) {
            addCriterion("FBackFlushSPID =", value, "fbackflushspid");
            return (Criteria) this;
        }

        public Criteria andFbackflushspidNotEqualTo(Integer value) {
            addCriterion("FBackFlushSPID <>", value, "fbackflushspid");
            return (Criteria) this;
        }

        public Criteria andFbackflushspidGreaterThan(Integer value) {
            addCriterion("FBackFlushSPID >", value, "fbackflushspid");
            return (Criteria) this;
        }

        public Criteria andFbackflushspidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FBackFlushSPID >=", value, "fbackflushspid");
            return (Criteria) this;
        }

        public Criteria andFbackflushspidLessThan(Integer value) {
            addCriterion("FBackFlushSPID <", value, "fbackflushspid");
            return (Criteria) this;
        }

        public Criteria andFbackflushspidLessThanOrEqualTo(Integer value) {
            addCriterion("FBackFlushSPID <=", value, "fbackflushspid");
            return (Criteria) this;
        }

        public Criteria andFbackflushspidIn(List<Integer> values) {
            addCriterion("FBackFlushSPID in", values, "fbackflushspid");
            return (Criteria) this;
        }

        public Criteria andFbackflushspidNotIn(List<Integer> values) {
            addCriterion("FBackFlushSPID not in", values, "fbackflushspid");
            return (Criteria) this;
        }

        public Criteria andFbackflushspidBetween(Integer value1, Integer value2) {
            addCriterion("FBackFlushSPID between", value1, value2, "fbackflushspid");
            return (Criteria) this;
        }

        public Criteria andFbackflushspidNotBetween(Integer value1, Integer value2) {
            addCriterion("FBackFlushSPID not between", value1, value2, "fbackflushspid");
            return (Criteria) this;
        }

        public Criteria andF102IsNull() {
            addCriterion("F_102 is null");
            return (Criteria) this;
        }

        public Criteria andF102IsNotNull() {
            addCriterion("F_102 is not null");
            return (Criteria) this;
        }

        public Criteria andF102EqualTo(String value) {
            addCriterion("F_102 =", value, "f102");
            return (Criteria) this;
        }

        public Criteria andF102NotEqualTo(String value) {
            addCriterion("F_102 <>", value, "f102");
            return (Criteria) this;
        }

        public Criteria andF102GreaterThan(String value) {
            addCriterion("F_102 >", value, "f102");
            return (Criteria) this;
        }

        public Criteria andF102GreaterThanOrEqualTo(String value) {
            addCriterion("F_102 >=", value, "f102");
            return (Criteria) this;
        }

        public Criteria andF102LessThan(String value) {
            addCriterion("F_102 <", value, "f102");
            return (Criteria) this;
        }

        public Criteria andF102LessThanOrEqualTo(String value) {
            addCriterion("F_102 <=", value, "f102");
            return (Criteria) this;
        }

        public Criteria andF102Like(String value) {
            addCriterion("F_102 like", value, "f102");
            return (Criteria) this;
        }

        public Criteria andF102NotLike(String value) {
            addCriterion("F_102 not like", value, "f102");
            return (Criteria) this;
        }

        public Criteria andF102In(List<String> values) {
            addCriterion("F_102 in", values, "f102");
            return (Criteria) this;
        }

        public Criteria andF102NotIn(List<String> values) {
            addCriterion("F_102 not in", values, "f102");
            return (Criteria) this;
        }

        public Criteria andF102Between(String value1, String value2) {
            addCriterion("F_102 between", value1, value2, "f102");
            return (Criteria) this;
        }

        public Criteria andF102NotBetween(String value1, String value2) {
            addCriterion("F_102 not between", value1, value2, "f102");
            return (Criteria) this;
        }

        public Criteria andF103IsNull() {
            addCriterion("F_103 is null");
            return (Criteria) this;
        }

        public Criteria andF103IsNotNull() {
            addCriterion("F_103 is not null");
            return (Criteria) this;
        }

        public Criteria andF103EqualTo(Integer value) {
            addCriterion("F_103 =", value, "f103");
            return (Criteria) this;
        }

        public Criteria andF103NotEqualTo(Integer value) {
            addCriterion("F_103 <>", value, "f103");
            return (Criteria) this;
        }

        public Criteria andF103GreaterThan(Integer value) {
            addCriterion("F_103 >", value, "f103");
            return (Criteria) this;
        }

        public Criteria andF103GreaterThanOrEqualTo(Integer value) {
            addCriterion("F_103 >=", value, "f103");
            return (Criteria) this;
        }

        public Criteria andF103LessThan(Integer value) {
            addCriterion("F_103 <", value, "f103");
            return (Criteria) this;
        }

        public Criteria andF103LessThanOrEqualTo(Integer value) {
            addCriterion("F_103 <=", value, "f103");
            return (Criteria) this;
        }

        public Criteria andF103In(List<Integer> values) {
            addCriterion("F_103 in", values, "f103");
            return (Criteria) this;
        }

        public Criteria andF103NotIn(List<Integer> values) {
            addCriterion("F_103 not in", values, "f103");
            return (Criteria) this;
        }

        public Criteria andF103Between(Integer value1, Integer value2) {
            addCriterion("F_103 between", value1, value2, "f103");
            return (Criteria) this;
        }

        public Criteria andF103NotBetween(Integer value1, Integer value2) {
            addCriterion("F_103 not between", value1, value2, "f103");
            return (Criteria) this;
        }

        public Criteria andF104IsNull() {
            addCriterion("F_104 is null");
            return (Criteria) this;
        }

        public Criteria andF104IsNotNull() {
            addCriterion("F_104 is not null");
            return (Criteria) this;
        }

        public Criteria andF104EqualTo(String value) {
            addCriterion("F_104 =", value, "f104");
            return (Criteria) this;
        }

        public Criteria andF104NotEqualTo(String value) {
            addCriterion("F_104 <>", value, "f104");
            return (Criteria) this;
        }

        public Criteria andF104GreaterThan(String value) {
            addCriterion("F_104 >", value, "f104");
            return (Criteria) this;
        }

        public Criteria andF104GreaterThanOrEqualTo(String value) {
            addCriterion("F_104 >=", value, "f104");
            return (Criteria) this;
        }

        public Criteria andF104LessThan(String value) {
            addCriterion("F_104 <", value, "f104");
            return (Criteria) this;
        }

        public Criteria andF104LessThanOrEqualTo(String value) {
            addCriterion("F_104 <=", value, "f104");
            return (Criteria) this;
        }

        public Criteria andF104Like(String value) {
            addCriterion("F_104 like", value, "f104");
            return (Criteria) this;
        }

        public Criteria andF104NotLike(String value) {
            addCriterion("F_104 not like", value, "f104");
            return (Criteria) this;
        }

        public Criteria andF104In(List<String> values) {
            addCriterion("F_104 in", values, "f104");
            return (Criteria) this;
        }

        public Criteria andF104NotIn(List<String> values) {
            addCriterion("F_104 not in", values, "f104");
            return (Criteria) this;
        }

        public Criteria andF104Between(String value1, String value2) {
            addCriterion("F_104 between", value1, value2, "f104");
            return (Criteria) this;
        }

        public Criteria andF104NotBetween(String value1, String value2) {
            addCriterion("F_104 not between", value1, value2, "f104");
            return (Criteria) this;
        }

        public Criteria andFchartnumberIsNull() {
            addCriterion("FChartNumber is null");
            return (Criteria) this;
        }

        public Criteria andFchartnumberIsNotNull() {
            addCriterion("FChartNumber is not null");
            return (Criteria) this;
        }

        public Criteria andFchartnumberEqualTo(String value) {
            addCriterion("FChartNumber =", value, "fchartnumber");
            return (Criteria) this;
        }

        public Criteria andFchartnumberNotEqualTo(String value) {
            addCriterion("FChartNumber <>", value, "fchartnumber");
            return (Criteria) this;
        }

        public Criteria andFchartnumberGreaterThan(String value) {
            addCriterion("FChartNumber >", value, "fchartnumber");
            return (Criteria) this;
        }

        public Criteria andFchartnumberGreaterThanOrEqualTo(String value) {
            addCriterion("FChartNumber >=", value, "fchartnumber");
            return (Criteria) this;
        }

        public Criteria andFchartnumberLessThan(String value) {
            addCriterion("FChartNumber <", value, "fchartnumber");
            return (Criteria) this;
        }

        public Criteria andFchartnumberLessThanOrEqualTo(String value) {
            addCriterion("FChartNumber <=", value, "fchartnumber");
            return (Criteria) this;
        }

        public Criteria andFchartnumberLike(String value) {
            addCriterion("FChartNumber like", value, "fchartnumber");
            return (Criteria) this;
        }

        public Criteria andFchartnumberNotLike(String value) {
            addCriterion("FChartNumber not like", value, "fchartnumber");
            return (Criteria) this;
        }

        public Criteria andFchartnumberIn(List<String> values) {
            addCriterion("FChartNumber in", values, "fchartnumber");
            return (Criteria) this;
        }

        public Criteria andFchartnumberNotIn(List<String> values) {
            addCriterion("FChartNumber not in", values, "fchartnumber");
            return (Criteria) this;
        }

        public Criteria andFchartnumberBetween(String value1, String value2) {
            addCriterion("FChartNumber between", value1, value2, "fchartnumber");
            return (Criteria) this;
        }

        public Criteria andFchartnumberNotBetween(String value1, String value2) {
            addCriterion("FChartNumber not between", value1, value2, "fchartnumber");
            return (Criteria) this;
        }

        public Criteria andFiskeyitemIsNull() {
            addCriterion("FIsKeyItem is null");
            return (Criteria) this;
        }

        public Criteria andFiskeyitemIsNotNull() {
            addCriterion("FIsKeyItem is not null");
            return (Criteria) this;
        }

        public Criteria andFiskeyitemEqualTo(Boolean value) {
            addCriterion("FIsKeyItem =", value, "fiskeyitem");
            return (Criteria) this;
        }

        public Criteria andFiskeyitemNotEqualTo(Boolean value) {
            addCriterion("FIsKeyItem <>", value, "fiskeyitem");
            return (Criteria) this;
        }

        public Criteria andFiskeyitemGreaterThan(Boolean value) {
            addCriterion("FIsKeyItem >", value, "fiskeyitem");
            return (Criteria) this;
        }

        public Criteria andFiskeyitemGreaterThanOrEqualTo(Boolean value) {
            addCriterion("FIsKeyItem >=", value, "fiskeyitem");
            return (Criteria) this;
        }

        public Criteria andFiskeyitemLessThan(Boolean value) {
            addCriterion("FIsKeyItem <", value, "fiskeyitem");
            return (Criteria) this;
        }

        public Criteria andFiskeyitemLessThanOrEqualTo(Boolean value) {
            addCriterion("FIsKeyItem <=", value, "fiskeyitem");
            return (Criteria) this;
        }

        public Criteria andFiskeyitemIn(List<Boolean> values) {
            addCriterion("FIsKeyItem in", values, "fiskeyitem");
            return (Criteria) this;
        }

        public Criteria andFiskeyitemNotIn(List<Boolean> values) {
            addCriterion("FIsKeyItem not in", values, "fiskeyitem");
            return (Criteria) this;
        }

        public Criteria andFiskeyitemBetween(Boolean value1, Boolean value2) {
            addCriterion("FIsKeyItem between", value1, value2, "fiskeyitem");
            return (Criteria) this;
        }

        public Criteria andFiskeyitemNotBetween(Boolean value1, Boolean value2) {
            addCriterion("FIsKeyItem not between", value1, value2, "fiskeyitem");
            return (Criteria) this;
        }

        public Criteria andFmaundIsNull() {
            addCriterion("FMaund is null");
            return (Criteria) this;
        }

        public Criteria andFmaundIsNotNull() {
            addCriterion("FMaund is not null");
            return (Criteria) this;
        }

        public Criteria andFmaundEqualTo(Integer value) {
            addCriterion("FMaund =", value, "fmaund");
            return (Criteria) this;
        }

        public Criteria andFmaundNotEqualTo(Integer value) {
            addCriterion("FMaund <>", value, "fmaund");
            return (Criteria) this;
        }

        public Criteria andFmaundGreaterThan(Integer value) {
            addCriterion("FMaund >", value, "fmaund");
            return (Criteria) this;
        }

        public Criteria andFmaundGreaterThanOrEqualTo(Integer value) {
            addCriterion("FMaund >=", value, "fmaund");
            return (Criteria) this;
        }

        public Criteria andFmaundLessThan(Integer value) {
            addCriterion("FMaund <", value, "fmaund");
            return (Criteria) this;
        }

        public Criteria andFmaundLessThanOrEqualTo(Integer value) {
            addCriterion("FMaund <=", value, "fmaund");
            return (Criteria) this;
        }

        public Criteria andFmaundIn(List<Integer> values) {
            addCriterion("FMaund in", values, "fmaund");
            return (Criteria) this;
        }

        public Criteria andFmaundNotIn(List<Integer> values) {
            addCriterion("FMaund not in", values, "fmaund");
            return (Criteria) this;
        }

        public Criteria andFmaundBetween(Integer value1, Integer value2) {
            addCriterion("FMaund between", value1, value2, "fmaund");
            return (Criteria) this;
        }

        public Criteria andFmaundNotBetween(Integer value1, Integer value2) {
            addCriterion("FMaund not between", value1, value2, "fmaund");
            return (Criteria) this;
        }

        public Criteria andFgrossweightIsNull() {
            addCriterion("FGrossWeight is null");
            return (Criteria) this;
        }

        public Criteria andFgrossweightIsNotNull() {
            addCriterion("FGrossWeight is not null");
            return (Criteria) this;
        }

        public Criteria andFgrossweightEqualTo(BigDecimal value) {
            addCriterion("FGrossWeight =", value, "fgrossweight");
            return (Criteria) this;
        }

        public Criteria andFgrossweightNotEqualTo(BigDecimal value) {
            addCriterion("FGrossWeight <>", value, "fgrossweight");
            return (Criteria) this;
        }

        public Criteria andFgrossweightGreaterThan(BigDecimal value) {
            addCriterion("FGrossWeight >", value, "fgrossweight");
            return (Criteria) this;
        }

        public Criteria andFgrossweightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FGrossWeight >=", value, "fgrossweight");
            return (Criteria) this;
        }

        public Criteria andFgrossweightLessThan(BigDecimal value) {
            addCriterion("FGrossWeight <", value, "fgrossweight");
            return (Criteria) this;
        }

        public Criteria andFgrossweightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FGrossWeight <=", value, "fgrossweight");
            return (Criteria) this;
        }

        public Criteria andFgrossweightIn(List<BigDecimal> values) {
            addCriterion("FGrossWeight in", values, "fgrossweight");
            return (Criteria) this;
        }

        public Criteria andFgrossweightNotIn(List<BigDecimal> values) {
            addCriterion("FGrossWeight not in", values, "fgrossweight");
            return (Criteria) this;
        }

        public Criteria andFgrossweightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FGrossWeight between", value1, value2, "fgrossweight");
            return (Criteria) this;
        }

        public Criteria andFgrossweightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FGrossWeight not between", value1, value2, "fgrossweight");
            return (Criteria) this;
        }

        public Criteria andFnetweightIsNull() {
            addCriterion("FNetWeight is null");
            return (Criteria) this;
        }

        public Criteria andFnetweightIsNotNull() {
            addCriterion("FNetWeight is not null");
            return (Criteria) this;
        }

        public Criteria andFnetweightEqualTo(BigDecimal value) {
            addCriterion("FNetWeight =", value, "fnetweight");
            return (Criteria) this;
        }

        public Criteria andFnetweightNotEqualTo(BigDecimal value) {
            addCriterion("FNetWeight <>", value, "fnetweight");
            return (Criteria) this;
        }

        public Criteria andFnetweightGreaterThan(BigDecimal value) {
            addCriterion("FNetWeight >", value, "fnetweight");
            return (Criteria) this;
        }

        public Criteria andFnetweightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FNetWeight >=", value, "fnetweight");
            return (Criteria) this;
        }

        public Criteria andFnetweightLessThan(BigDecimal value) {
            addCriterion("FNetWeight <", value, "fnetweight");
            return (Criteria) this;
        }

        public Criteria andFnetweightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FNetWeight <=", value, "fnetweight");
            return (Criteria) this;
        }

        public Criteria andFnetweightIn(List<BigDecimal> values) {
            addCriterion("FNetWeight in", values, "fnetweight");
            return (Criteria) this;
        }

        public Criteria andFnetweightNotIn(List<BigDecimal> values) {
            addCriterion("FNetWeight not in", values, "fnetweight");
            return (Criteria) this;
        }

        public Criteria andFnetweightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FNetWeight between", value1, value2, "fnetweight");
            return (Criteria) this;
        }

        public Criteria andFnetweightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FNetWeight not between", value1, value2, "fnetweight");
            return (Criteria) this;
        }

        public Criteria andFcubicmeasureIsNull() {
            addCriterion("FCubicMeasure is null");
            return (Criteria) this;
        }

        public Criteria andFcubicmeasureIsNotNull() {
            addCriterion("FCubicMeasure is not null");
            return (Criteria) this;
        }

        public Criteria andFcubicmeasureEqualTo(Integer value) {
            addCriterion("FCubicMeasure =", value, "fcubicmeasure");
            return (Criteria) this;
        }

        public Criteria andFcubicmeasureNotEqualTo(Integer value) {
            addCriterion("FCubicMeasure <>", value, "fcubicmeasure");
            return (Criteria) this;
        }

        public Criteria andFcubicmeasureGreaterThan(Integer value) {
            addCriterion("FCubicMeasure >", value, "fcubicmeasure");
            return (Criteria) this;
        }

        public Criteria andFcubicmeasureGreaterThanOrEqualTo(Integer value) {
            addCriterion("FCubicMeasure >=", value, "fcubicmeasure");
            return (Criteria) this;
        }

        public Criteria andFcubicmeasureLessThan(Integer value) {
            addCriterion("FCubicMeasure <", value, "fcubicmeasure");
            return (Criteria) this;
        }

        public Criteria andFcubicmeasureLessThanOrEqualTo(Integer value) {
            addCriterion("FCubicMeasure <=", value, "fcubicmeasure");
            return (Criteria) this;
        }

        public Criteria andFcubicmeasureIn(List<Integer> values) {
            addCriterion("FCubicMeasure in", values, "fcubicmeasure");
            return (Criteria) this;
        }

        public Criteria andFcubicmeasureNotIn(List<Integer> values) {
            addCriterion("FCubicMeasure not in", values, "fcubicmeasure");
            return (Criteria) this;
        }

        public Criteria andFcubicmeasureBetween(Integer value1, Integer value2) {
            addCriterion("FCubicMeasure between", value1, value2, "fcubicmeasure");
            return (Criteria) this;
        }

        public Criteria andFcubicmeasureNotBetween(Integer value1, Integer value2) {
            addCriterion("FCubicMeasure not between", value1, value2, "fcubicmeasure");
            return (Criteria) this;
        }

        public Criteria andFlengthIsNull() {
            addCriterion("FLength is null");
            return (Criteria) this;
        }

        public Criteria andFlengthIsNotNull() {
            addCriterion("FLength is not null");
            return (Criteria) this;
        }

        public Criteria andFlengthEqualTo(BigDecimal value) {
            addCriterion("FLength =", value, "flength");
            return (Criteria) this;
        }

        public Criteria andFlengthNotEqualTo(BigDecimal value) {
            addCriterion("FLength <>", value, "flength");
            return (Criteria) this;
        }

        public Criteria andFlengthGreaterThan(BigDecimal value) {
            addCriterion("FLength >", value, "flength");
            return (Criteria) this;
        }

        public Criteria andFlengthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FLength >=", value, "flength");
            return (Criteria) this;
        }

        public Criteria andFlengthLessThan(BigDecimal value) {
            addCriterion("FLength <", value, "flength");
            return (Criteria) this;
        }

        public Criteria andFlengthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FLength <=", value, "flength");
            return (Criteria) this;
        }

        public Criteria andFlengthIn(List<BigDecimal> values) {
            addCriterion("FLength in", values, "flength");
            return (Criteria) this;
        }

        public Criteria andFlengthNotIn(List<BigDecimal> values) {
            addCriterion("FLength not in", values, "flength");
            return (Criteria) this;
        }

        public Criteria andFlengthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FLength between", value1, value2, "flength");
            return (Criteria) this;
        }

        public Criteria andFlengthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FLength not between", value1, value2, "flength");
            return (Criteria) this;
        }

        public Criteria andFwidthIsNull() {
            addCriterion("FWidth is null");
            return (Criteria) this;
        }

        public Criteria andFwidthIsNotNull() {
            addCriterion("FWidth is not null");
            return (Criteria) this;
        }

        public Criteria andFwidthEqualTo(BigDecimal value) {
            addCriterion("FWidth =", value, "fwidth");
            return (Criteria) this;
        }

        public Criteria andFwidthNotEqualTo(BigDecimal value) {
            addCriterion("FWidth <>", value, "fwidth");
            return (Criteria) this;
        }

        public Criteria andFwidthGreaterThan(BigDecimal value) {
            addCriterion("FWidth >", value, "fwidth");
            return (Criteria) this;
        }

        public Criteria andFwidthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FWidth >=", value, "fwidth");
            return (Criteria) this;
        }

        public Criteria andFwidthLessThan(BigDecimal value) {
            addCriterion("FWidth <", value, "fwidth");
            return (Criteria) this;
        }

        public Criteria andFwidthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FWidth <=", value, "fwidth");
            return (Criteria) this;
        }

        public Criteria andFwidthIn(List<BigDecimal> values) {
            addCriterion("FWidth in", values, "fwidth");
            return (Criteria) this;
        }

        public Criteria andFwidthNotIn(List<BigDecimal> values) {
            addCriterion("FWidth not in", values, "fwidth");
            return (Criteria) this;
        }

        public Criteria andFwidthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FWidth between", value1, value2, "fwidth");
            return (Criteria) this;
        }

        public Criteria andFwidthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FWidth not between", value1, value2, "fwidth");
            return (Criteria) this;
        }

        public Criteria andFheightIsNull() {
            addCriterion("FHeight is null");
            return (Criteria) this;
        }

        public Criteria andFheightIsNotNull() {
            addCriterion("FHeight is not null");
            return (Criteria) this;
        }

        public Criteria andFheightEqualTo(BigDecimal value) {
            addCriterion("FHeight =", value, "fheight");
            return (Criteria) this;
        }

        public Criteria andFheightNotEqualTo(BigDecimal value) {
            addCriterion("FHeight <>", value, "fheight");
            return (Criteria) this;
        }

        public Criteria andFheightGreaterThan(BigDecimal value) {
            addCriterion("FHeight >", value, "fheight");
            return (Criteria) this;
        }

        public Criteria andFheightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FHeight >=", value, "fheight");
            return (Criteria) this;
        }

        public Criteria andFheightLessThan(BigDecimal value) {
            addCriterion("FHeight <", value, "fheight");
            return (Criteria) this;
        }

        public Criteria andFheightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FHeight <=", value, "fheight");
            return (Criteria) this;
        }

        public Criteria andFheightIn(List<BigDecimal> values) {
            addCriterion("FHeight in", values, "fheight");
            return (Criteria) this;
        }

        public Criteria andFheightNotIn(List<BigDecimal> values) {
            addCriterion("FHeight not in", values, "fheight");
            return (Criteria) this;
        }

        public Criteria andFheightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FHeight between", value1, value2, "fheight");
            return (Criteria) this;
        }

        public Criteria andFheightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FHeight not between", value1, value2, "fheight");
            return (Criteria) this;
        }

        public Criteria andFsizeIsNull() {
            addCriterion("FSize is null");
            return (Criteria) this;
        }

        public Criteria andFsizeIsNotNull() {
            addCriterion("FSize is not null");
            return (Criteria) this;
        }

        public Criteria andFsizeEqualTo(BigDecimal value) {
            addCriterion("FSize =", value, "fsize");
            return (Criteria) this;
        }

        public Criteria andFsizeNotEqualTo(BigDecimal value) {
            addCriterion("FSize <>", value, "fsize");
            return (Criteria) this;
        }

        public Criteria andFsizeGreaterThan(BigDecimal value) {
            addCriterion("FSize >", value, "fsize");
            return (Criteria) this;
        }

        public Criteria andFsizeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FSize >=", value, "fsize");
            return (Criteria) this;
        }

        public Criteria andFsizeLessThan(BigDecimal value) {
            addCriterion("FSize <", value, "fsize");
            return (Criteria) this;
        }

        public Criteria andFsizeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FSize <=", value, "fsize");
            return (Criteria) this;
        }

        public Criteria andFsizeIn(List<BigDecimal> values) {
            addCriterion("FSize in", values, "fsize");
            return (Criteria) this;
        }

        public Criteria andFsizeNotIn(List<BigDecimal> values) {
            addCriterion("FSize not in", values, "fsize");
            return (Criteria) this;
        }

        public Criteria andFsizeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FSize between", value1, value2, "fsize");
            return (Criteria) this;
        }

        public Criteria andFsizeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FSize not between", value1, value2, "fsize");
            return (Criteria) this;
        }

        public Criteria andFversionIsNull() {
            addCriterion("FVersion is null");
            return (Criteria) this;
        }

        public Criteria andFversionIsNotNull() {
            addCriterion("FVersion is not null");
            return (Criteria) this;
        }

        public Criteria andFversionEqualTo(String value) {
            addCriterion("FVersion =", value, "fversion");
            return (Criteria) this;
        }

        public Criteria andFversionNotEqualTo(String value) {
            addCriterion("FVersion <>", value, "fversion");
            return (Criteria) this;
        }

        public Criteria andFversionGreaterThan(String value) {
            addCriterion("FVersion >", value, "fversion");
            return (Criteria) this;
        }

        public Criteria andFversionGreaterThanOrEqualTo(String value) {
            addCriterion("FVersion >=", value, "fversion");
            return (Criteria) this;
        }

        public Criteria andFversionLessThan(String value) {
            addCriterion("FVersion <", value, "fversion");
            return (Criteria) this;
        }

        public Criteria andFversionLessThanOrEqualTo(String value) {
            addCriterion("FVersion <=", value, "fversion");
            return (Criteria) this;
        }

        public Criteria andFversionLike(String value) {
            addCriterion("FVersion like", value, "fversion");
            return (Criteria) this;
        }

        public Criteria andFversionNotLike(String value) {
            addCriterion("FVersion not like", value, "fversion");
            return (Criteria) this;
        }

        public Criteria andFversionIn(List<String> values) {
            addCriterion("FVersion in", values, "fversion");
            return (Criteria) this;
        }

        public Criteria andFversionNotIn(List<String> values) {
            addCriterion("FVersion not in", values, "fversion");
            return (Criteria) this;
        }

        public Criteria andFversionBetween(String value1, String value2) {
            addCriterion("FVersion between", value1, value2, "fversion");
            return (Criteria) this;
        }

        public Criteria andFversionNotBetween(String value1, String value2) {
            addCriterion("FVersion not between", value1, value2, "fversion");
            return (Criteria) this;
        }

        public Criteria andFzjnumIsNull() {
            addCriterion("FZJNum is null");
            return (Criteria) this;
        }

        public Criteria andFzjnumIsNotNull() {
            addCriterion("FZJNum is not null");
            return (Criteria) this;
        }

        public Criteria andFzjnumEqualTo(BigDecimal value) {
            addCriterion("FZJNum =", value, "fzjnum");
            return (Criteria) this;
        }

        public Criteria andFzjnumNotEqualTo(BigDecimal value) {
            addCriterion("FZJNum <>", value, "fzjnum");
            return (Criteria) this;
        }

        public Criteria andFzjnumGreaterThan(BigDecimal value) {
            addCriterion("FZJNum >", value, "fzjnum");
            return (Criteria) this;
        }

        public Criteria andFzjnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FZJNum >=", value, "fzjnum");
            return (Criteria) this;
        }

        public Criteria andFzjnumLessThan(BigDecimal value) {
            addCriterion("FZJNum <", value, "fzjnum");
            return (Criteria) this;
        }

        public Criteria andFzjnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FZJNum <=", value, "fzjnum");
            return (Criteria) this;
        }

        public Criteria andFzjnumIn(List<BigDecimal> values) {
            addCriterion("FZJNum in", values, "fzjnum");
            return (Criteria) this;
        }

        public Criteria andFzjnumNotIn(List<BigDecimal> values) {
            addCriterion("FZJNum not in", values, "fzjnum");
            return (Criteria) this;
        }

        public Criteria andFzjnumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FZJNum between", value1, value2, "fzjnum");
            return (Criteria) this;
        }

        public Criteria andFzjnumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FZJNum not between", value1, value2, "fzjnum");
            return (Criteria) this;
        }

        public Criteria andFstandardcostIsNull() {
            addCriterion("FStandardCost is null");
            return (Criteria) this;
        }

        public Criteria andFstandardcostIsNotNull() {
            addCriterion("FStandardCost is not null");
            return (Criteria) this;
        }

        public Criteria andFstandardcostEqualTo(BigDecimal value) {
            addCriterion("FStandardCost =", value, "fstandardcost");
            return (Criteria) this;
        }

        public Criteria andFstandardcostNotEqualTo(BigDecimal value) {
            addCriterion("FStandardCost <>", value, "fstandardcost");
            return (Criteria) this;
        }

        public Criteria andFstandardcostGreaterThan(BigDecimal value) {
            addCriterion("FStandardCost >", value, "fstandardcost");
            return (Criteria) this;
        }

        public Criteria andFstandardcostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FStandardCost >=", value, "fstandardcost");
            return (Criteria) this;
        }

        public Criteria andFstandardcostLessThan(BigDecimal value) {
            addCriterion("FStandardCost <", value, "fstandardcost");
            return (Criteria) this;
        }

        public Criteria andFstandardcostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FStandardCost <=", value, "fstandardcost");
            return (Criteria) this;
        }

        public Criteria andFstandardcostIn(List<BigDecimal> values) {
            addCriterion("FStandardCost in", values, "fstandardcost");
            return (Criteria) this;
        }

        public Criteria andFstandardcostNotIn(List<BigDecimal> values) {
            addCriterion("FStandardCost not in", values, "fstandardcost");
            return (Criteria) this;
        }

        public Criteria andFstandardcostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FStandardCost between", value1, value2, "fstandardcost");
            return (Criteria) this;
        }

        public Criteria andFstandardcostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FStandardCost not between", value1, value2, "fstandardcost");
            return (Criteria) this;
        }

        public Criteria andFstandardmanhourIsNull() {
            addCriterion("FStandardManHour is null");
            return (Criteria) this;
        }

        public Criteria andFstandardmanhourIsNotNull() {
            addCriterion("FStandardManHour is not null");
            return (Criteria) this;
        }

        public Criteria andFstandardmanhourEqualTo(BigDecimal value) {
            addCriterion("FStandardManHour =", value, "fstandardmanhour");
            return (Criteria) this;
        }

        public Criteria andFstandardmanhourNotEqualTo(BigDecimal value) {
            addCriterion("FStandardManHour <>", value, "fstandardmanhour");
            return (Criteria) this;
        }

        public Criteria andFstandardmanhourGreaterThan(BigDecimal value) {
            addCriterion("FStandardManHour >", value, "fstandardmanhour");
            return (Criteria) this;
        }

        public Criteria andFstandardmanhourGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FStandardManHour >=", value, "fstandardmanhour");
            return (Criteria) this;
        }

        public Criteria andFstandardmanhourLessThan(BigDecimal value) {
            addCriterion("FStandardManHour <", value, "fstandardmanhour");
            return (Criteria) this;
        }

        public Criteria andFstandardmanhourLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FStandardManHour <=", value, "fstandardmanhour");
            return (Criteria) this;
        }

        public Criteria andFstandardmanhourIn(List<BigDecimal> values) {
            addCriterion("FStandardManHour in", values, "fstandardmanhour");
            return (Criteria) this;
        }

        public Criteria andFstandardmanhourNotIn(List<BigDecimal> values) {
            addCriterion("FStandardManHour not in", values, "fstandardmanhour");
            return (Criteria) this;
        }

        public Criteria andFstandardmanhourBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FStandardManHour between", value1, value2, "fstandardmanhour");
            return (Criteria) this;
        }

        public Criteria andFstandardmanhourNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FStandardManHour not between", value1, value2, "fstandardmanhour");
            return (Criteria) this;
        }

        public Criteria andFstdpayrateIsNull() {
            addCriterion("FStdPayRate is null");
            return (Criteria) this;
        }

        public Criteria andFstdpayrateIsNotNull() {
            addCriterion("FStdPayRate is not null");
            return (Criteria) this;
        }

        public Criteria andFstdpayrateEqualTo(BigDecimal value) {
            addCriterion("FStdPayRate =", value, "fstdpayrate");
            return (Criteria) this;
        }

        public Criteria andFstdpayrateNotEqualTo(BigDecimal value) {
            addCriterion("FStdPayRate <>", value, "fstdpayrate");
            return (Criteria) this;
        }

        public Criteria andFstdpayrateGreaterThan(BigDecimal value) {
            addCriterion("FStdPayRate >", value, "fstdpayrate");
            return (Criteria) this;
        }

        public Criteria andFstdpayrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FStdPayRate >=", value, "fstdpayrate");
            return (Criteria) this;
        }

        public Criteria andFstdpayrateLessThan(BigDecimal value) {
            addCriterion("FStdPayRate <", value, "fstdpayrate");
            return (Criteria) this;
        }

        public Criteria andFstdpayrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FStdPayRate <=", value, "fstdpayrate");
            return (Criteria) this;
        }

        public Criteria andFstdpayrateIn(List<BigDecimal> values) {
            addCriterion("FStdPayRate in", values, "fstdpayrate");
            return (Criteria) this;
        }

        public Criteria andFstdpayrateNotIn(List<BigDecimal> values) {
            addCriterion("FStdPayRate not in", values, "fstdpayrate");
            return (Criteria) this;
        }

        public Criteria andFstdpayrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FStdPayRate between", value1, value2, "fstdpayrate");
            return (Criteria) this;
        }

        public Criteria andFstdpayrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FStdPayRate not between", value1, value2, "fstdpayrate");
            return (Criteria) this;
        }

        public Criteria andFchgfeerateIsNull() {
            addCriterion("FChgFeeRate is null");
            return (Criteria) this;
        }

        public Criteria andFchgfeerateIsNotNull() {
            addCriterion("FChgFeeRate is not null");
            return (Criteria) this;
        }

        public Criteria andFchgfeerateEqualTo(BigDecimal value) {
            addCriterion("FChgFeeRate =", value, "fchgfeerate");
            return (Criteria) this;
        }

        public Criteria andFchgfeerateNotEqualTo(BigDecimal value) {
            addCriterion("FChgFeeRate <>", value, "fchgfeerate");
            return (Criteria) this;
        }

        public Criteria andFchgfeerateGreaterThan(BigDecimal value) {
            addCriterion("FChgFeeRate >", value, "fchgfeerate");
            return (Criteria) this;
        }

        public Criteria andFchgfeerateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FChgFeeRate >=", value, "fchgfeerate");
            return (Criteria) this;
        }

        public Criteria andFchgfeerateLessThan(BigDecimal value) {
            addCriterion("FChgFeeRate <", value, "fchgfeerate");
            return (Criteria) this;
        }

        public Criteria andFchgfeerateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FChgFeeRate <=", value, "fchgfeerate");
            return (Criteria) this;
        }

        public Criteria andFchgfeerateIn(List<BigDecimal> values) {
            addCriterion("FChgFeeRate in", values, "fchgfeerate");
            return (Criteria) this;
        }

        public Criteria andFchgfeerateNotIn(List<BigDecimal> values) {
            addCriterion("FChgFeeRate not in", values, "fchgfeerate");
            return (Criteria) this;
        }

        public Criteria andFchgfeerateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FChgFeeRate between", value1, value2, "fchgfeerate");
            return (Criteria) this;
        }

        public Criteria andFchgfeerateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FChgFeeRate not between", value1, value2, "fchgfeerate");
            return (Criteria) this;
        }

        public Criteria andFstdfixfeerateIsNull() {
            addCriterion("FStdFixFeeRate is null");
            return (Criteria) this;
        }

        public Criteria andFstdfixfeerateIsNotNull() {
            addCriterion("FStdFixFeeRate is not null");
            return (Criteria) this;
        }

        public Criteria andFstdfixfeerateEqualTo(BigDecimal value) {
            addCriterion("FStdFixFeeRate =", value, "fstdfixfeerate");
            return (Criteria) this;
        }

        public Criteria andFstdfixfeerateNotEqualTo(BigDecimal value) {
            addCriterion("FStdFixFeeRate <>", value, "fstdfixfeerate");
            return (Criteria) this;
        }

        public Criteria andFstdfixfeerateGreaterThan(BigDecimal value) {
            addCriterion("FStdFixFeeRate >", value, "fstdfixfeerate");
            return (Criteria) this;
        }

        public Criteria andFstdfixfeerateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FStdFixFeeRate >=", value, "fstdfixfeerate");
            return (Criteria) this;
        }

        public Criteria andFstdfixfeerateLessThan(BigDecimal value) {
            addCriterion("FStdFixFeeRate <", value, "fstdfixfeerate");
            return (Criteria) this;
        }

        public Criteria andFstdfixfeerateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FStdFixFeeRate <=", value, "fstdfixfeerate");
            return (Criteria) this;
        }

        public Criteria andFstdfixfeerateIn(List<BigDecimal> values) {
            addCriterion("FStdFixFeeRate in", values, "fstdfixfeerate");
            return (Criteria) this;
        }

        public Criteria andFstdfixfeerateNotIn(List<BigDecimal> values) {
            addCriterion("FStdFixFeeRate not in", values, "fstdfixfeerate");
            return (Criteria) this;
        }

        public Criteria andFstdfixfeerateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FStdFixFeeRate between", value1, value2, "fstdfixfeerate");
            return (Criteria) this;
        }

        public Criteria andFstdfixfeerateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FStdFixFeeRate not between", value1, value2, "fstdfixfeerate");
            return (Criteria) this;
        }

        public Criteria andFoutmachfeeIsNull() {
            addCriterion("FOutMachFee is null");
            return (Criteria) this;
        }

        public Criteria andFoutmachfeeIsNotNull() {
            addCriterion("FOutMachFee is not null");
            return (Criteria) this;
        }

        public Criteria andFoutmachfeeEqualTo(BigDecimal value) {
            addCriterion("FOutMachFee =", value, "foutmachfee");
            return (Criteria) this;
        }

        public Criteria andFoutmachfeeNotEqualTo(BigDecimal value) {
            addCriterion("FOutMachFee <>", value, "foutmachfee");
            return (Criteria) this;
        }

        public Criteria andFoutmachfeeGreaterThan(BigDecimal value) {
            addCriterion("FOutMachFee >", value, "foutmachfee");
            return (Criteria) this;
        }

        public Criteria andFoutmachfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FOutMachFee >=", value, "foutmachfee");
            return (Criteria) this;
        }

        public Criteria andFoutmachfeeLessThan(BigDecimal value) {
            addCriterion("FOutMachFee <", value, "foutmachfee");
            return (Criteria) this;
        }

        public Criteria andFoutmachfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FOutMachFee <=", value, "foutmachfee");
            return (Criteria) this;
        }

        public Criteria andFoutmachfeeIn(List<BigDecimal> values) {
            addCriterion("FOutMachFee in", values, "foutmachfee");
            return (Criteria) this;
        }

        public Criteria andFoutmachfeeNotIn(List<BigDecimal> values) {
            addCriterion("FOutMachFee not in", values, "foutmachfee");
            return (Criteria) this;
        }

        public Criteria andFoutmachfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FOutMachFee between", value1, value2, "foutmachfee");
            return (Criteria) this;
        }

        public Criteria andFoutmachfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FOutMachFee not between", value1, value2, "foutmachfee");
            return (Criteria) this;
        }

        public Criteria andFpiecerateIsNull() {
            addCriterion("FPieceRate is null");
            return (Criteria) this;
        }

        public Criteria andFpiecerateIsNotNull() {
            addCriterion("FPieceRate is not null");
            return (Criteria) this;
        }

        public Criteria andFpiecerateEqualTo(BigDecimal value) {
            addCriterion("FPieceRate =", value, "fpiecerate");
            return (Criteria) this;
        }

        public Criteria andFpiecerateNotEqualTo(BigDecimal value) {
            addCriterion("FPieceRate <>", value, "fpiecerate");
            return (Criteria) this;
        }

        public Criteria andFpiecerateGreaterThan(BigDecimal value) {
            addCriterion("FPieceRate >", value, "fpiecerate");
            return (Criteria) this;
        }

        public Criteria andFpiecerateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FPieceRate >=", value, "fpiecerate");
            return (Criteria) this;
        }

        public Criteria andFpiecerateLessThan(BigDecimal value) {
            addCriterion("FPieceRate <", value, "fpiecerate");
            return (Criteria) this;
        }

        public Criteria andFpiecerateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FPieceRate <=", value, "fpiecerate");
            return (Criteria) this;
        }

        public Criteria andFpiecerateIn(List<BigDecimal> values) {
            addCriterion("FPieceRate in", values, "fpiecerate");
            return (Criteria) this;
        }

        public Criteria andFpiecerateNotIn(List<BigDecimal> values) {
            addCriterion("FPieceRate not in", values, "fpiecerate");
            return (Criteria) this;
        }

        public Criteria andFpiecerateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FPieceRate between", value1, value2, "fpiecerate");
            return (Criteria) this;
        }

        public Criteria andFpiecerateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FPieceRate not between", value1, value2, "fpiecerate");
            return (Criteria) this;
        }

        public Criteria andFstdbatchqtyIsNull() {
            addCriterion("FStdBatchQty is null");
            return (Criteria) this;
        }

        public Criteria andFstdbatchqtyIsNotNull() {
            addCriterion("FStdBatchQty is not null");
            return (Criteria) this;
        }

        public Criteria andFstdbatchqtyEqualTo(BigDecimal value) {
            addCriterion("FStdBatchQty =", value, "fstdbatchqty");
            return (Criteria) this;
        }

        public Criteria andFstdbatchqtyNotEqualTo(BigDecimal value) {
            addCriterion("FStdBatchQty <>", value, "fstdbatchqty");
            return (Criteria) this;
        }

        public Criteria andFstdbatchqtyGreaterThan(BigDecimal value) {
            addCriterion("FStdBatchQty >", value, "fstdbatchqty");
            return (Criteria) this;
        }

        public Criteria andFstdbatchqtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FStdBatchQty >=", value, "fstdbatchqty");
            return (Criteria) this;
        }

        public Criteria andFstdbatchqtyLessThan(BigDecimal value) {
            addCriterion("FStdBatchQty <", value, "fstdbatchqty");
            return (Criteria) this;
        }

        public Criteria andFstdbatchqtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FStdBatchQty <=", value, "fstdbatchqty");
            return (Criteria) this;
        }

        public Criteria andFstdbatchqtyIn(List<BigDecimal> values) {
            addCriterion("FStdBatchQty in", values, "fstdbatchqty");
            return (Criteria) this;
        }

        public Criteria andFstdbatchqtyNotIn(List<BigDecimal> values) {
            addCriterion("FStdBatchQty not in", values, "fstdbatchqty");
            return (Criteria) this;
        }

        public Criteria andFstdbatchqtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FStdBatchQty between", value1, value2, "fstdbatchqty");
            return (Criteria) this;
        }

        public Criteria andFstdbatchqtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FStdBatchQty not between", value1, value2, "fstdbatchqty");
            return (Criteria) this;
        }

        public Criteria andFpovacctidIsNull() {
            addCriterion("FPOVAcctID is null");
            return (Criteria) this;
        }

        public Criteria andFpovacctidIsNotNull() {
            addCriterion("FPOVAcctID is not null");
            return (Criteria) this;
        }

        public Criteria andFpovacctidEqualTo(Integer value) {
            addCriterion("FPOVAcctID =", value, "fpovacctid");
            return (Criteria) this;
        }

        public Criteria andFpovacctidNotEqualTo(Integer value) {
            addCriterion("FPOVAcctID <>", value, "fpovacctid");
            return (Criteria) this;
        }

        public Criteria andFpovacctidGreaterThan(Integer value) {
            addCriterion("FPOVAcctID >", value, "fpovacctid");
            return (Criteria) this;
        }

        public Criteria andFpovacctidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FPOVAcctID >=", value, "fpovacctid");
            return (Criteria) this;
        }

        public Criteria andFpovacctidLessThan(Integer value) {
            addCriterion("FPOVAcctID <", value, "fpovacctid");
            return (Criteria) this;
        }

        public Criteria andFpovacctidLessThanOrEqualTo(Integer value) {
            addCriterion("FPOVAcctID <=", value, "fpovacctid");
            return (Criteria) this;
        }

        public Criteria andFpovacctidIn(List<Integer> values) {
            addCriterion("FPOVAcctID in", values, "fpovacctid");
            return (Criteria) this;
        }

        public Criteria andFpovacctidNotIn(List<Integer> values) {
            addCriterion("FPOVAcctID not in", values, "fpovacctid");
            return (Criteria) this;
        }

        public Criteria andFpovacctidBetween(Integer value1, Integer value2) {
            addCriterion("FPOVAcctID between", value1, value2, "fpovacctid");
            return (Criteria) this;
        }

        public Criteria andFpovacctidNotBetween(Integer value1, Integer value2) {
            addCriterion("FPOVAcctID not between", value1, value2, "fpovacctid");
            return (Criteria) this;
        }

        public Criteria andFpivacctidIsNull() {
            addCriterion("FPIVAcctID is null");
            return (Criteria) this;
        }

        public Criteria andFpivacctidIsNotNull() {
            addCriterion("FPIVAcctID is not null");
            return (Criteria) this;
        }

        public Criteria andFpivacctidEqualTo(Integer value) {
            addCriterion("FPIVAcctID =", value, "fpivacctid");
            return (Criteria) this;
        }

        public Criteria andFpivacctidNotEqualTo(Integer value) {
            addCriterion("FPIVAcctID <>", value, "fpivacctid");
            return (Criteria) this;
        }

        public Criteria andFpivacctidGreaterThan(Integer value) {
            addCriterion("FPIVAcctID >", value, "fpivacctid");
            return (Criteria) this;
        }

        public Criteria andFpivacctidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FPIVAcctID >=", value, "fpivacctid");
            return (Criteria) this;
        }

        public Criteria andFpivacctidLessThan(Integer value) {
            addCriterion("FPIVAcctID <", value, "fpivacctid");
            return (Criteria) this;
        }

        public Criteria andFpivacctidLessThanOrEqualTo(Integer value) {
            addCriterion("FPIVAcctID <=", value, "fpivacctid");
            return (Criteria) this;
        }

        public Criteria andFpivacctidIn(List<Integer> values) {
            addCriterion("FPIVAcctID in", values, "fpivacctid");
            return (Criteria) this;
        }

        public Criteria andFpivacctidNotIn(List<Integer> values) {
            addCriterion("FPIVAcctID not in", values, "fpivacctid");
            return (Criteria) this;
        }

        public Criteria andFpivacctidBetween(Integer value1, Integer value2) {
            addCriterion("FPIVAcctID between", value1, value2, "fpivacctid");
            return (Criteria) this;
        }

        public Criteria andFpivacctidNotBetween(Integer value1, Integer value2) {
            addCriterion("FPIVAcctID not between", value1, value2, "fpivacctid");
            return (Criteria) this;
        }

        public Criteria andFmcvacctidIsNull() {
            addCriterion("FMCVAcctID is null");
            return (Criteria) this;
        }

        public Criteria andFmcvacctidIsNotNull() {
            addCriterion("FMCVAcctID is not null");
            return (Criteria) this;
        }

        public Criteria andFmcvacctidEqualTo(Integer value) {
            addCriterion("FMCVAcctID =", value, "fmcvacctid");
            return (Criteria) this;
        }

        public Criteria andFmcvacctidNotEqualTo(Integer value) {
            addCriterion("FMCVAcctID <>", value, "fmcvacctid");
            return (Criteria) this;
        }

        public Criteria andFmcvacctidGreaterThan(Integer value) {
            addCriterion("FMCVAcctID >", value, "fmcvacctid");
            return (Criteria) this;
        }

        public Criteria andFmcvacctidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FMCVAcctID >=", value, "fmcvacctid");
            return (Criteria) this;
        }

        public Criteria andFmcvacctidLessThan(Integer value) {
            addCriterion("FMCVAcctID <", value, "fmcvacctid");
            return (Criteria) this;
        }

        public Criteria andFmcvacctidLessThanOrEqualTo(Integer value) {
            addCriterion("FMCVAcctID <=", value, "fmcvacctid");
            return (Criteria) this;
        }

        public Criteria andFmcvacctidIn(List<Integer> values) {
            addCriterion("FMCVAcctID in", values, "fmcvacctid");
            return (Criteria) this;
        }

        public Criteria andFmcvacctidNotIn(List<Integer> values) {
            addCriterion("FMCVAcctID not in", values, "fmcvacctid");
            return (Criteria) this;
        }

        public Criteria andFmcvacctidBetween(Integer value1, Integer value2) {
            addCriterion("FMCVAcctID between", value1, value2, "fmcvacctid");
            return (Criteria) this;
        }

        public Criteria andFmcvacctidNotBetween(Integer value1, Integer value2) {
            addCriterion("FMCVAcctID not between", value1, value2, "fmcvacctid");
            return (Criteria) this;
        }

        public Criteria andFpcvacctidIsNull() {
            addCriterion("FPCVAcctID is null");
            return (Criteria) this;
        }

        public Criteria andFpcvacctidIsNotNull() {
            addCriterion("FPCVAcctID is not null");
            return (Criteria) this;
        }

        public Criteria andFpcvacctidEqualTo(Integer value) {
            addCriterion("FPCVAcctID =", value, "fpcvacctid");
            return (Criteria) this;
        }

        public Criteria andFpcvacctidNotEqualTo(Integer value) {
            addCriterion("FPCVAcctID <>", value, "fpcvacctid");
            return (Criteria) this;
        }

        public Criteria andFpcvacctidGreaterThan(Integer value) {
            addCriterion("FPCVAcctID >", value, "fpcvacctid");
            return (Criteria) this;
        }

        public Criteria andFpcvacctidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FPCVAcctID >=", value, "fpcvacctid");
            return (Criteria) this;
        }

        public Criteria andFpcvacctidLessThan(Integer value) {
            addCriterion("FPCVAcctID <", value, "fpcvacctid");
            return (Criteria) this;
        }

        public Criteria andFpcvacctidLessThanOrEqualTo(Integer value) {
            addCriterion("FPCVAcctID <=", value, "fpcvacctid");
            return (Criteria) this;
        }

        public Criteria andFpcvacctidIn(List<Integer> values) {
            addCriterion("FPCVAcctID in", values, "fpcvacctid");
            return (Criteria) this;
        }

        public Criteria andFpcvacctidNotIn(List<Integer> values) {
            addCriterion("FPCVAcctID not in", values, "fpcvacctid");
            return (Criteria) this;
        }

        public Criteria andFpcvacctidBetween(Integer value1, Integer value2) {
            addCriterion("FPCVAcctID between", value1, value2, "fpcvacctid");
            return (Criteria) this;
        }

        public Criteria andFpcvacctidNotBetween(Integer value1, Integer value2) {
            addCriterion("FPCVAcctID not between", value1, value2, "fpcvacctid");
            return (Criteria) this;
        }

        public Criteria andFslacctidIsNull() {
            addCriterion("FSLAcctID is null");
            return (Criteria) this;
        }

        public Criteria andFslacctidIsNotNull() {
            addCriterion("FSLAcctID is not null");
            return (Criteria) this;
        }

        public Criteria andFslacctidEqualTo(Integer value) {
            addCriterion("FSLAcctID =", value, "fslacctid");
            return (Criteria) this;
        }

        public Criteria andFslacctidNotEqualTo(Integer value) {
            addCriterion("FSLAcctID <>", value, "fslacctid");
            return (Criteria) this;
        }

        public Criteria andFslacctidGreaterThan(Integer value) {
            addCriterion("FSLAcctID >", value, "fslacctid");
            return (Criteria) this;
        }

        public Criteria andFslacctidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FSLAcctID >=", value, "fslacctid");
            return (Criteria) this;
        }

        public Criteria andFslacctidLessThan(Integer value) {
            addCriterion("FSLAcctID <", value, "fslacctid");
            return (Criteria) this;
        }

        public Criteria andFslacctidLessThanOrEqualTo(Integer value) {
            addCriterion("FSLAcctID <=", value, "fslacctid");
            return (Criteria) this;
        }

        public Criteria andFslacctidIn(List<Integer> values) {
            addCriterion("FSLAcctID in", values, "fslacctid");
            return (Criteria) this;
        }

        public Criteria andFslacctidNotIn(List<Integer> values) {
            addCriterion("FSLAcctID not in", values, "fslacctid");
            return (Criteria) this;
        }

        public Criteria andFslacctidBetween(Integer value1, Integer value2) {
            addCriterion("FSLAcctID between", value1, value2, "fslacctid");
            return (Criteria) this;
        }

        public Criteria andFslacctidNotBetween(Integer value1, Integer value2) {
            addCriterion("FSLAcctID not between", value1, value2, "fslacctid");
            return (Criteria) this;
        }

        public Criteria andFcavacctidIsNull() {
            addCriterion("FCAVAcctID is null");
            return (Criteria) this;
        }

        public Criteria andFcavacctidIsNotNull() {
            addCriterion("FCAVAcctID is not null");
            return (Criteria) this;
        }

        public Criteria andFcavacctidEqualTo(Integer value) {
            addCriterion("FCAVAcctID =", value, "fcavacctid");
            return (Criteria) this;
        }

        public Criteria andFcavacctidNotEqualTo(Integer value) {
            addCriterion("FCAVAcctID <>", value, "fcavacctid");
            return (Criteria) this;
        }

        public Criteria andFcavacctidGreaterThan(Integer value) {
            addCriterion("FCAVAcctID >", value, "fcavacctid");
            return (Criteria) this;
        }

        public Criteria andFcavacctidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FCAVAcctID >=", value, "fcavacctid");
            return (Criteria) this;
        }

        public Criteria andFcavacctidLessThan(Integer value) {
            addCriterion("FCAVAcctID <", value, "fcavacctid");
            return (Criteria) this;
        }

        public Criteria andFcavacctidLessThanOrEqualTo(Integer value) {
            addCriterion("FCAVAcctID <=", value, "fcavacctid");
            return (Criteria) this;
        }

        public Criteria andFcavacctidIn(List<Integer> values) {
            addCriterion("FCAVAcctID in", values, "fcavacctid");
            return (Criteria) this;
        }

        public Criteria andFcavacctidNotIn(List<Integer> values) {
            addCriterion("FCAVAcctID not in", values, "fcavacctid");
            return (Criteria) this;
        }

        public Criteria andFcavacctidBetween(Integer value1, Integer value2) {
            addCriterion("FCAVAcctID between", value1, value2, "fcavacctid");
            return (Criteria) this;
        }

        public Criteria andFcavacctidNotBetween(Integer value1, Integer value2) {
            addCriterion("FCAVAcctID not between", value1, value2, "fcavacctid");
            return (Criteria) this;
        }

        public Criteria andFcbappendrateIsNull() {
            addCriterion("FCBAppendRate is null");
            return (Criteria) this;
        }

        public Criteria andFcbappendrateIsNotNull() {
            addCriterion("FCBAppendRate is not null");
            return (Criteria) this;
        }

        public Criteria andFcbappendrateEqualTo(BigDecimal value) {
            addCriterion("FCBAppendRate =", value, "fcbappendrate");
            return (Criteria) this;
        }

        public Criteria andFcbappendrateNotEqualTo(BigDecimal value) {
            addCriterion("FCBAppendRate <>", value, "fcbappendrate");
            return (Criteria) this;
        }

        public Criteria andFcbappendrateGreaterThan(BigDecimal value) {
            addCriterion("FCBAppendRate >", value, "fcbappendrate");
            return (Criteria) this;
        }

        public Criteria andFcbappendrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FCBAppendRate >=", value, "fcbappendrate");
            return (Criteria) this;
        }

        public Criteria andFcbappendrateLessThan(BigDecimal value) {
            addCriterion("FCBAppendRate <", value, "fcbappendrate");
            return (Criteria) this;
        }

        public Criteria andFcbappendrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FCBAppendRate <=", value, "fcbappendrate");
            return (Criteria) this;
        }

        public Criteria andFcbappendrateIn(List<BigDecimal> values) {
            addCriterion("FCBAppendRate in", values, "fcbappendrate");
            return (Criteria) this;
        }

        public Criteria andFcbappendrateNotIn(List<BigDecimal> values) {
            addCriterion("FCBAppendRate not in", values, "fcbappendrate");
            return (Criteria) this;
        }

        public Criteria andFcbappendrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FCBAppendRate between", value1, value2, "fcbappendrate");
            return (Criteria) this;
        }

        public Criteria andFcbappendrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FCBAppendRate not between", value1, value2, "fcbappendrate");
            return (Criteria) this;
        }

        public Criteria andFcbappendprojectIsNull() {
            addCriterion("FCBAppendProject is null");
            return (Criteria) this;
        }

        public Criteria andFcbappendprojectIsNotNull() {
            addCriterion("FCBAppendProject is not null");
            return (Criteria) this;
        }

        public Criteria andFcbappendprojectEqualTo(Integer value) {
            addCriterion("FCBAppendProject =", value, "fcbappendproject");
            return (Criteria) this;
        }

        public Criteria andFcbappendprojectNotEqualTo(Integer value) {
            addCriterion("FCBAppendProject <>", value, "fcbappendproject");
            return (Criteria) this;
        }

        public Criteria andFcbappendprojectGreaterThan(Integer value) {
            addCriterion("FCBAppendProject >", value, "fcbappendproject");
            return (Criteria) this;
        }

        public Criteria andFcbappendprojectGreaterThanOrEqualTo(Integer value) {
            addCriterion("FCBAppendProject >=", value, "fcbappendproject");
            return (Criteria) this;
        }

        public Criteria andFcbappendprojectLessThan(Integer value) {
            addCriterion("FCBAppendProject <", value, "fcbappendproject");
            return (Criteria) this;
        }

        public Criteria andFcbappendprojectLessThanOrEqualTo(Integer value) {
            addCriterion("FCBAppendProject <=", value, "fcbappendproject");
            return (Criteria) this;
        }

        public Criteria andFcbappendprojectIn(List<Integer> values) {
            addCriterion("FCBAppendProject in", values, "fcbappendproject");
            return (Criteria) this;
        }

        public Criteria andFcbappendprojectNotIn(List<Integer> values) {
            addCriterion("FCBAppendProject not in", values, "fcbappendproject");
            return (Criteria) this;
        }

        public Criteria andFcbappendprojectBetween(Integer value1, Integer value2) {
            addCriterion("FCBAppendProject between", value1, value2, "fcbappendproject");
            return (Criteria) this;
        }

        public Criteria andFcbappendprojectNotBetween(Integer value1, Integer value2) {
            addCriterion("FCBAppendProject not between", value1, value2, "fcbappendproject");
            return (Criteria) this;
        }

        public Criteria andFcostbomidIsNull() {
            addCriterion("FCostBomID is null");
            return (Criteria) this;
        }

        public Criteria andFcostbomidIsNotNull() {
            addCriterion("FCostBomID is not null");
            return (Criteria) this;
        }

        public Criteria andFcostbomidEqualTo(Integer value) {
            addCriterion("FCostBomID =", value, "fcostbomid");
            return (Criteria) this;
        }

        public Criteria andFcostbomidNotEqualTo(Integer value) {
            addCriterion("FCostBomID <>", value, "fcostbomid");
            return (Criteria) this;
        }

        public Criteria andFcostbomidGreaterThan(Integer value) {
            addCriterion("FCostBomID >", value, "fcostbomid");
            return (Criteria) this;
        }

        public Criteria andFcostbomidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FCostBomID >=", value, "fcostbomid");
            return (Criteria) this;
        }

        public Criteria andFcostbomidLessThan(Integer value) {
            addCriterion("FCostBomID <", value, "fcostbomid");
            return (Criteria) this;
        }

        public Criteria andFcostbomidLessThanOrEqualTo(Integer value) {
            addCriterion("FCostBomID <=", value, "fcostbomid");
            return (Criteria) this;
        }

        public Criteria andFcostbomidIn(List<Integer> values) {
            addCriterion("FCostBomID in", values, "fcostbomid");
            return (Criteria) this;
        }

        public Criteria andFcostbomidNotIn(List<Integer> values) {
            addCriterion("FCostBomID not in", values, "fcostbomid");
            return (Criteria) this;
        }

        public Criteria andFcostbomidBetween(Integer value1, Integer value2) {
            addCriterion("FCostBomID between", value1, value2, "fcostbomid");
            return (Criteria) this;
        }

        public Criteria andFcostbomidNotBetween(Integer value1, Integer value2) {
            addCriterion("FCostBomID not between", value1, value2, "fcostbomid");
            return (Criteria) this;
        }

        public Criteria andFcbroutingIsNull() {
            addCriterion("FCBRouting is null");
            return (Criteria) this;
        }

        public Criteria andFcbroutingIsNotNull() {
            addCriterion("FCBRouting is not null");
            return (Criteria) this;
        }

        public Criteria andFcbroutingEqualTo(Integer value) {
            addCriterion("FCBRouting =", value, "fcbrouting");
            return (Criteria) this;
        }

        public Criteria andFcbroutingNotEqualTo(Integer value) {
            addCriterion("FCBRouting <>", value, "fcbrouting");
            return (Criteria) this;
        }

        public Criteria andFcbroutingGreaterThan(Integer value) {
            addCriterion("FCBRouting >", value, "fcbrouting");
            return (Criteria) this;
        }

        public Criteria andFcbroutingGreaterThanOrEqualTo(Integer value) {
            addCriterion("FCBRouting >=", value, "fcbrouting");
            return (Criteria) this;
        }

        public Criteria andFcbroutingLessThan(Integer value) {
            addCriterion("FCBRouting <", value, "fcbrouting");
            return (Criteria) this;
        }

        public Criteria andFcbroutingLessThanOrEqualTo(Integer value) {
            addCriterion("FCBRouting <=", value, "fcbrouting");
            return (Criteria) this;
        }

        public Criteria andFcbroutingIn(List<Integer> values) {
            addCriterion("FCBRouting in", values, "fcbrouting");
            return (Criteria) this;
        }

        public Criteria andFcbroutingNotIn(List<Integer> values) {
            addCriterion("FCBRouting not in", values, "fcbrouting");
            return (Criteria) this;
        }

        public Criteria andFcbroutingBetween(Integer value1, Integer value2) {
            addCriterion("FCBRouting between", value1, value2, "fcbrouting");
            return (Criteria) this;
        }

        public Criteria andFcbroutingNotBetween(Integer value1, Integer value2) {
            addCriterion("FCBRouting not between", value1, value2, "fcbrouting");
            return (Criteria) this;
        }

        public Criteria andFinspectionlevelIsNull() {
            addCriterion("FInspectionLevel is null");
            return (Criteria) this;
        }

        public Criteria andFinspectionlevelIsNotNull() {
            addCriterion("FInspectionLevel is not null");
            return (Criteria) this;
        }

        public Criteria andFinspectionlevelEqualTo(Integer value) {
            addCriterion("FInspectionLevel =", value, "finspectionlevel");
            return (Criteria) this;
        }

        public Criteria andFinspectionlevelNotEqualTo(Integer value) {
            addCriterion("FInspectionLevel <>", value, "finspectionlevel");
            return (Criteria) this;
        }

        public Criteria andFinspectionlevelGreaterThan(Integer value) {
            addCriterion("FInspectionLevel >", value, "finspectionlevel");
            return (Criteria) this;
        }

        public Criteria andFinspectionlevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("FInspectionLevel >=", value, "finspectionlevel");
            return (Criteria) this;
        }

        public Criteria andFinspectionlevelLessThan(Integer value) {
            addCriterion("FInspectionLevel <", value, "finspectionlevel");
            return (Criteria) this;
        }

        public Criteria andFinspectionlevelLessThanOrEqualTo(Integer value) {
            addCriterion("FInspectionLevel <=", value, "finspectionlevel");
            return (Criteria) this;
        }

        public Criteria andFinspectionlevelIn(List<Integer> values) {
            addCriterion("FInspectionLevel in", values, "finspectionlevel");
            return (Criteria) this;
        }

        public Criteria andFinspectionlevelNotIn(List<Integer> values) {
            addCriterion("FInspectionLevel not in", values, "finspectionlevel");
            return (Criteria) this;
        }

        public Criteria andFinspectionlevelBetween(Integer value1, Integer value2) {
            addCriterion("FInspectionLevel between", value1, value2, "finspectionlevel");
            return (Criteria) this;
        }

        public Criteria andFinspectionlevelNotBetween(Integer value1, Integer value2) {
            addCriterion("FInspectionLevel not between", value1, value2, "finspectionlevel");
            return (Criteria) this;
        }

        public Criteria andFinspectionprojectIsNull() {
            addCriterion("FInspectionProject is null");
            return (Criteria) this;
        }

        public Criteria andFinspectionprojectIsNotNull() {
            addCriterion("FInspectionProject is not null");
            return (Criteria) this;
        }

        public Criteria andFinspectionprojectEqualTo(Integer value) {
            addCriterion("FInspectionProject =", value, "finspectionproject");
            return (Criteria) this;
        }

        public Criteria andFinspectionprojectNotEqualTo(Integer value) {
            addCriterion("FInspectionProject <>", value, "finspectionproject");
            return (Criteria) this;
        }

        public Criteria andFinspectionprojectGreaterThan(Integer value) {
            addCriterion("FInspectionProject >", value, "finspectionproject");
            return (Criteria) this;
        }

        public Criteria andFinspectionprojectGreaterThanOrEqualTo(Integer value) {
            addCriterion("FInspectionProject >=", value, "finspectionproject");
            return (Criteria) this;
        }

        public Criteria andFinspectionprojectLessThan(Integer value) {
            addCriterion("FInspectionProject <", value, "finspectionproject");
            return (Criteria) this;
        }

        public Criteria andFinspectionprojectLessThanOrEqualTo(Integer value) {
            addCriterion("FInspectionProject <=", value, "finspectionproject");
            return (Criteria) this;
        }

        public Criteria andFinspectionprojectIn(List<Integer> values) {
            addCriterion("FInspectionProject in", values, "finspectionproject");
            return (Criteria) this;
        }

        public Criteria andFinspectionprojectNotIn(List<Integer> values) {
            addCriterion("FInspectionProject not in", values, "finspectionproject");
            return (Criteria) this;
        }

        public Criteria andFinspectionprojectBetween(Integer value1, Integer value2) {
            addCriterion("FInspectionProject between", value1, value2, "finspectionproject");
            return (Criteria) this;
        }

        public Criteria andFinspectionprojectNotBetween(Integer value1, Integer value2) {
            addCriterion("FInspectionProject not between", value1, value2, "finspectionproject");
            return (Criteria) this;
        }

        public Criteria andFislistcontrolIsNull() {
            addCriterion("FIsListControl is null");
            return (Criteria) this;
        }

        public Criteria andFislistcontrolIsNotNull() {
            addCriterion("FIsListControl is not null");
            return (Criteria) this;
        }

        public Criteria andFislistcontrolEqualTo(Integer value) {
            addCriterion("FIsListControl =", value, "fislistcontrol");
            return (Criteria) this;
        }

        public Criteria andFislistcontrolNotEqualTo(Integer value) {
            addCriterion("FIsListControl <>", value, "fislistcontrol");
            return (Criteria) this;
        }

        public Criteria andFislistcontrolGreaterThan(Integer value) {
            addCriterion("FIsListControl >", value, "fislistcontrol");
            return (Criteria) this;
        }

        public Criteria andFislistcontrolGreaterThanOrEqualTo(Integer value) {
            addCriterion("FIsListControl >=", value, "fislistcontrol");
            return (Criteria) this;
        }

        public Criteria andFislistcontrolLessThan(Integer value) {
            addCriterion("FIsListControl <", value, "fislistcontrol");
            return (Criteria) this;
        }

        public Criteria andFislistcontrolLessThanOrEqualTo(Integer value) {
            addCriterion("FIsListControl <=", value, "fislistcontrol");
            return (Criteria) this;
        }

        public Criteria andFislistcontrolIn(List<Integer> values) {
            addCriterion("FIsListControl in", values, "fislistcontrol");
            return (Criteria) this;
        }

        public Criteria andFislistcontrolNotIn(List<Integer> values) {
            addCriterion("FIsListControl not in", values, "fislistcontrol");
            return (Criteria) this;
        }

        public Criteria andFislistcontrolBetween(Integer value1, Integer value2) {
            addCriterion("FIsListControl between", value1, value2, "fislistcontrol");
            return (Criteria) this;
        }

        public Criteria andFislistcontrolNotBetween(Integer value1, Integer value2) {
            addCriterion("FIsListControl not between", value1, value2, "fislistcontrol");
            return (Criteria) this;
        }

        public Criteria andFprochkmdeIsNull() {
            addCriterion("FProChkMde is null");
            return (Criteria) this;
        }

        public Criteria andFprochkmdeIsNotNull() {
            addCriterion("FProChkMde is not null");
            return (Criteria) this;
        }

        public Criteria andFprochkmdeEqualTo(Integer value) {
            addCriterion("FProChkMde =", value, "fprochkmde");
            return (Criteria) this;
        }

        public Criteria andFprochkmdeNotEqualTo(Integer value) {
            addCriterion("FProChkMde <>", value, "fprochkmde");
            return (Criteria) this;
        }

        public Criteria andFprochkmdeGreaterThan(Integer value) {
            addCriterion("FProChkMde >", value, "fprochkmde");
            return (Criteria) this;
        }

        public Criteria andFprochkmdeGreaterThanOrEqualTo(Integer value) {
            addCriterion("FProChkMde >=", value, "fprochkmde");
            return (Criteria) this;
        }

        public Criteria andFprochkmdeLessThan(Integer value) {
            addCriterion("FProChkMde <", value, "fprochkmde");
            return (Criteria) this;
        }

        public Criteria andFprochkmdeLessThanOrEqualTo(Integer value) {
            addCriterion("FProChkMde <=", value, "fprochkmde");
            return (Criteria) this;
        }

        public Criteria andFprochkmdeIn(List<Integer> values) {
            addCriterion("FProChkMde in", values, "fprochkmde");
            return (Criteria) this;
        }

        public Criteria andFprochkmdeNotIn(List<Integer> values) {
            addCriterion("FProChkMde not in", values, "fprochkmde");
            return (Criteria) this;
        }

        public Criteria andFprochkmdeBetween(Integer value1, Integer value2) {
            addCriterion("FProChkMde between", value1, value2, "fprochkmde");
            return (Criteria) this;
        }

        public Criteria andFprochkmdeNotBetween(Integer value1, Integer value2) {
            addCriterion("FProChkMde not between", value1, value2, "fprochkmde");
            return (Criteria) this;
        }

        public Criteria andFwwchkmdeIsNull() {
            addCriterion("FWWChkMde is null");
            return (Criteria) this;
        }

        public Criteria andFwwchkmdeIsNotNull() {
            addCriterion("FWWChkMde is not null");
            return (Criteria) this;
        }

        public Criteria andFwwchkmdeEqualTo(Integer value) {
            addCriterion("FWWChkMde =", value, "fwwchkmde");
            return (Criteria) this;
        }

        public Criteria andFwwchkmdeNotEqualTo(Integer value) {
            addCriterion("FWWChkMde <>", value, "fwwchkmde");
            return (Criteria) this;
        }

        public Criteria andFwwchkmdeGreaterThan(Integer value) {
            addCriterion("FWWChkMde >", value, "fwwchkmde");
            return (Criteria) this;
        }

        public Criteria andFwwchkmdeGreaterThanOrEqualTo(Integer value) {
            addCriterion("FWWChkMde >=", value, "fwwchkmde");
            return (Criteria) this;
        }

        public Criteria andFwwchkmdeLessThan(Integer value) {
            addCriterion("FWWChkMde <", value, "fwwchkmde");
            return (Criteria) this;
        }

        public Criteria andFwwchkmdeLessThanOrEqualTo(Integer value) {
            addCriterion("FWWChkMde <=", value, "fwwchkmde");
            return (Criteria) this;
        }

        public Criteria andFwwchkmdeIn(List<Integer> values) {
            addCriterion("FWWChkMde in", values, "fwwchkmde");
            return (Criteria) this;
        }

        public Criteria andFwwchkmdeNotIn(List<Integer> values) {
            addCriterion("FWWChkMde not in", values, "fwwchkmde");
            return (Criteria) this;
        }

        public Criteria andFwwchkmdeBetween(Integer value1, Integer value2) {
            addCriterion("FWWChkMde between", value1, value2, "fwwchkmde");
            return (Criteria) this;
        }

        public Criteria andFwwchkmdeNotBetween(Integer value1, Integer value2) {
            addCriterion("FWWChkMde not between", value1, value2, "fwwchkmde");
            return (Criteria) this;
        }

        public Criteria andFsochkmdeIsNull() {
            addCriterion("FSOChkMde is null");
            return (Criteria) this;
        }

        public Criteria andFsochkmdeIsNotNull() {
            addCriterion("FSOChkMde is not null");
            return (Criteria) this;
        }

        public Criteria andFsochkmdeEqualTo(Integer value) {
            addCriterion("FSOChkMde =", value, "fsochkmde");
            return (Criteria) this;
        }

        public Criteria andFsochkmdeNotEqualTo(Integer value) {
            addCriterion("FSOChkMde <>", value, "fsochkmde");
            return (Criteria) this;
        }

        public Criteria andFsochkmdeGreaterThan(Integer value) {
            addCriterion("FSOChkMde >", value, "fsochkmde");
            return (Criteria) this;
        }

        public Criteria andFsochkmdeGreaterThanOrEqualTo(Integer value) {
            addCriterion("FSOChkMde >=", value, "fsochkmde");
            return (Criteria) this;
        }

        public Criteria andFsochkmdeLessThan(Integer value) {
            addCriterion("FSOChkMde <", value, "fsochkmde");
            return (Criteria) this;
        }

        public Criteria andFsochkmdeLessThanOrEqualTo(Integer value) {
            addCriterion("FSOChkMde <=", value, "fsochkmde");
            return (Criteria) this;
        }

        public Criteria andFsochkmdeIn(List<Integer> values) {
            addCriterion("FSOChkMde in", values, "fsochkmde");
            return (Criteria) this;
        }

        public Criteria andFsochkmdeNotIn(List<Integer> values) {
            addCriterion("FSOChkMde not in", values, "fsochkmde");
            return (Criteria) this;
        }

        public Criteria andFsochkmdeBetween(Integer value1, Integer value2) {
            addCriterion("FSOChkMde between", value1, value2, "fsochkmde");
            return (Criteria) this;
        }

        public Criteria andFsochkmdeNotBetween(Integer value1, Integer value2) {
            addCriterion("FSOChkMde not between", value1, value2, "fsochkmde");
            return (Criteria) this;
        }

        public Criteria andFwthdrwchkmdeIsNull() {
            addCriterion("FWthDrwChkMde is null");
            return (Criteria) this;
        }

        public Criteria andFwthdrwchkmdeIsNotNull() {
            addCriterion("FWthDrwChkMde is not null");
            return (Criteria) this;
        }

        public Criteria andFwthdrwchkmdeEqualTo(Integer value) {
            addCriterion("FWthDrwChkMde =", value, "fwthdrwchkmde");
            return (Criteria) this;
        }

        public Criteria andFwthdrwchkmdeNotEqualTo(Integer value) {
            addCriterion("FWthDrwChkMde <>", value, "fwthdrwchkmde");
            return (Criteria) this;
        }

        public Criteria andFwthdrwchkmdeGreaterThan(Integer value) {
            addCriterion("FWthDrwChkMde >", value, "fwthdrwchkmde");
            return (Criteria) this;
        }

        public Criteria andFwthdrwchkmdeGreaterThanOrEqualTo(Integer value) {
            addCriterion("FWthDrwChkMde >=", value, "fwthdrwchkmde");
            return (Criteria) this;
        }

        public Criteria andFwthdrwchkmdeLessThan(Integer value) {
            addCriterion("FWthDrwChkMde <", value, "fwthdrwchkmde");
            return (Criteria) this;
        }

        public Criteria andFwthdrwchkmdeLessThanOrEqualTo(Integer value) {
            addCriterion("FWthDrwChkMde <=", value, "fwthdrwchkmde");
            return (Criteria) this;
        }

        public Criteria andFwthdrwchkmdeIn(List<Integer> values) {
            addCriterion("FWthDrwChkMde in", values, "fwthdrwchkmde");
            return (Criteria) this;
        }

        public Criteria andFwthdrwchkmdeNotIn(List<Integer> values) {
            addCriterion("FWthDrwChkMde not in", values, "fwthdrwchkmde");
            return (Criteria) this;
        }

        public Criteria andFwthdrwchkmdeBetween(Integer value1, Integer value2) {
            addCriterion("FWthDrwChkMde between", value1, value2, "fwthdrwchkmde");
            return (Criteria) this;
        }

        public Criteria andFwthdrwchkmdeNotBetween(Integer value1, Integer value2) {
            addCriterion("FWthDrwChkMde not between", value1, value2, "fwthdrwchkmde");
            return (Criteria) this;
        }

        public Criteria andFstkchkmdeIsNull() {
            addCriterion("FStkChkMde is null");
            return (Criteria) this;
        }

        public Criteria andFstkchkmdeIsNotNull() {
            addCriterion("FStkChkMde is not null");
            return (Criteria) this;
        }

        public Criteria andFstkchkmdeEqualTo(Integer value) {
            addCriterion("FStkChkMde =", value, "fstkchkmde");
            return (Criteria) this;
        }

        public Criteria andFstkchkmdeNotEqualTo(Integer value) {
            addCriterion("FStkChkMde <>", value, "fstkchkmde");
            return (Criteria) this;
        }

        public Criteria andFstkchkmdeGreaterThan(Integer value) {
            addCriterion("FStkChkMde >", value, "fstkchkmde");
            return (Criteria) this;
        }

        public Criteria andFstkchkmdeGreaterThanOrEqualTo(Integer value) {
            addCriterion("FStkChkMde >=", value, "fstkchkmde");
            return (Criteria) this;
        }

        public Criteria andFstkchkmdeLessThan(Integer value) {
            addCriterion("FStkChkMde <", value, "fstkchkmde");
            return (Criteria) this;
        }

        public Criteria andFstkchkmdeLessThanOrEqualTo(Integer value) {
            addCriterion("FStkChkMde <=", value, "fstkchkmde");
            return (Criteria) this;
        }

        public Criteria andFstkchkmdeIn(List<Integer> values) {
            addCriterion("FStkChkMde in", values, "fstkchkmde");
            return (Criteria) this;
        }

        public Criteria andFstkchkmdeNotIn(List<Integer> values) {
            addCriterion("FStkChkMde not in", values, "fstkchkmde");
            return (Criteria) this;
        }

        public Criteria andFstkchkmdeBetween(Integer value1, Integer value2) {
            addCriterion("FStkChkMde between", value1, value2, "fstkchkmde");
            return (Criteria) this;
        }

        public Criteria andFstkchkmdeNotBetween(Integer value1, Integer value2) {
            addCriterion("FStkChkMde not between", value1, value2, "fstkchkmde");
            return (Criteria) this;
        }

        public Criteria andFotherchkmdeIsNull() {
            addCriterion("FOtherChkMde is null");
            return (Criteria) this;
        }

        public Criteria andFotherchkmdeIsNotNull() {
            addCriterion("FOtherChkMde is not null");
            return (Criteria) this;
        }

        public Criteria andFotherchkmdeEqualTo(Integer value) {
            addCriterion("FOtherChkMde =", value, "fotherchkmde");
            return (Criteria) this;
        }

        public Criteria andFotherchkmdeNotEqualTo(Integer value) {
            addCriterion("FOtherChkMde <>", value, "fotherchkmde");
            return (Criteria) this;
        }

        public Criteria andFotherchkmdeGreaterThan(Integer value) {
            addCriterion("FOtherChkMde >", value, "fotherchkmde");
            return (Criteria) this;
        }

        public Criteria andFotherchkmdeGreaterThanOrEqualTo(Integer value) {
            addCriterion("FOtherChkMde >=", value, "fotherchkmde");
            return (Criteria) this;
        }

        public Criteria andFotherchkmdeLessThan(Integer value) {
            addCriterion("FOtherChkMde <", value, "fotherchkmde");
            return (Criteria) this;
        }

        public Criteria andFotherchkmdeLessThanOrEqualTo(Integer value) {
            addCriterion("FOtherChkMde <=", value, "fotherchkmde");
            return (Criteria) this;
        }

        public Criteria andFotherchkmdeIn(List<Integer> values) {
            addCriterion("FOtherChkMde in", values, "fotherchkmde");
            return (Criteria) this;
        }

        public Criteria andFotherchkmdeNotIn(List<Integer> values) {
            addCriterion("FOtherChkMde not in", values, "fotherchkmde");
            return (Criteria) this;
        }

        public Criteria andFotherchkmdeBetween(Integer value1, Integer value2) {
            addCriterion("FOtherChkMde between", value1, value2, "fotherchkmde");
            return (Criteria) this;
        }

        public Criteria andFotherchkmdeNotBetween(Integer value1, Integer value2) {
            addCriterion("FOtherChkMde not between", value1, value2, "fotherchkmde");
            return (Criteria) this;
        }

        public Criteria andFstkchkprdIsNull() {
            addCriterion("FStkChkPrd is null");
            return (Criteria) this;
        }

        public Criteria andFstkchkprdIsNotNull() {
            addCriterion("FStkChkPrd is not null");
            return (Criteria) this;
        }

        public Criteria andFstkchkprdEqualTo(Integer value) {
            addCriterion("FStkChkPrd =", value, "fstkchkprd");
            return (Criteria) this;
        }

        public Criteria andFstkchkprdNotEqualTo(Integer value) {
            addCriterion("FStkChkPrd <>", value, "fstkchkprd");
            return (Criteria) this;
        }

        public Criteria andFstkchkprdGreaterThan(Integer value) {
            addCriterion("FStkChkPrd >", value, "fstkchkprd");
            return (Criteria) this;
        }

        public Criteria andFstkchkprdGreaterThanOrEqualTo(Integer value) {
            addCriterion("FStkChkPrd >=", value, "fstkchkprd");
            return (Criteria) this;
        }

        public Criteria andFstkchkprdLessThan(Integer value) {
            addCriterion("FStkChkPrd <", value, "fstkchkprd");
            return (Criteria) this;
        }

        public Criteria andFstkchkprdLessThanOrEqualTo(Integer value) {
            addCriterion("FStkChkPrd <=", value, "fstkchkprd");
            return (Criteria) this;
        }

        public Criteria andFstkchkprdIn(List<Integer> values) {
            addCriterion("FStkChkPrd in", values, "fstkchkprd");
            return (Criteria) this;
        }

        public Criteria andFstkchkprdNotIn(List<Integer> values) {
            addCriterion("FStkChkPrd not in", values, "fstkchkprd");
            return (Criteria) this;
        }

        public Criteria andFstkchkprdBetween(Integer value1, Integer value2) {
            addCriterion("FStkChkPrd between", value1, value2, "fstkchkprd");
            return (Criteria) this;
        }

        public Criteria andFstkchkprdNotBetween(Integer value1, Integer value2) {
            addCriterion("FStkChkPrd not between", value1, value2, "fstkchkprd");
            return (Criteria) this;
        }

        public Criteria andFstkchkalrmIsNull() {
            addCriterion("FStkChkAlrm is null");
            return (Criteria) this;
        }

        public Criteria andFstkchkalrmIsNotNull() {
            addCriterion("FStkChkAlrm is not null");
            return (Criteria) this;
        }

        public Criteria andFstkchkalrmEqualTo(Integer value) {
            addCriterion("FStkChkAlrm =", value, "fstkchkalrm");
            return (Criteria) this;
        }

        public Criteria andFstkchkalrmNotEqualTo(Integer value) {
            addCriterion("FStkChkAlrm <>", value, "fstkchkalrm");
            return (Criteria) this;
        }

        public Criteria andFstkchkalrmGreaterThan(Integer value) {
            addCriterion("FStkChkAlrm >", value, "fstkchkalrm");
            return (Criteria) this;
        }

        public Criteria andFstkchkalrmGreaterThanOrEqualTo(Integer value) {
            addCriterion("FStkChkAlrm >=", value, "fstkchkalrm");
            return (Criteria) this;
        }

        public Criteria andFstkchkalrmLessThan(Integer value) {
            addCriterion("FStkChkAlrm <", value, "fstkchkalrm");
            return (Criteria) this;
        }

        public Criteria andFstkchkalrmLessThanOrEqualTo(Integer value) {
            addCriterion("FStkChkAlrm <=", value, "fstkchkalrm");
            return (Criteria) this;
        }

        public Criteria andFstkchkalrmIn(List<Integer> values) {
            addCriterion("FStkChkAlrm in", values, "fstkchkalrm");
            return (Criteria) this;
        }

        public Criteria andFstkchkalrmNotIn(List<Integer> values) {
            addCriterion("FStkChkAlrm not in", values, "fstkchkalrm");
            return (Criteria) this;
        }

        public Criteria andFstkchkalrmBetween(Integer value1, Integer value2) {
            addCriterion("FStkChkAlrm between", value1, value2, "fstkchkalrm");
            return (Criteria) this;
        }

        public Criteria andFstkchkalrmNotBetween(Integer value1, Integer value2) {
            addCriterion("FStkChkAlrm not between", value1, value2, "fstkchkalrm");
            return (Criteria) this;
        }

        public Criteria andFidentifierIsNull() {
            addCriterion("FIdentifier is null");
            return (Criteria) this;
        }

        public Criteria andFidentifierIsNotNull() {
            addCriterion("FIdentifier is not null");
            return (Criteria) this;
        }

        public Criteria andFidentifierEqualTo(Integer value) {
            addCriterion("FIdentifier =", value, "fidentifier");
            return (Criteria) this;
        }

        public Criteria andFidentifierNotEqualTo(Integer value) {
            addCriterion("FIdentifier <>", value, "fidentifier");
            return (Criteria) this;
        }

        public Criteria andFidentifierGreaterThan(Integer value) {
            addCriterion("FIdentifier >", value, "fidentifier");
            return (Criteria) this;
        }

        public Criteria andFidentifierGreaterThanOrEqualTo(Integer value) {
            addCriterion("FIdentifier >=", value, "fidentifier");
            return (Criteria) this;
        }

        public Criteria andFidentifierLessThan(Integer value) {
            addCriterion("FIdentifier <", value, "fidentifier");
            return (Criteria) this;
        }

        public Criteria andFidentifierLessThanOrEqualTo(Integer value) {
            addCriterion("FIdentifier <=", value, "fidentifier");
            return (Criteria) this;
        }

        public Criteria andFidentifierIn(List<Integer> values) {
            addCriterion("FIdentifier in", values, "fidentifier");
            return (Criteria) this;
        }

        public Criteria andFidentifierNotIn(List<Integer> values) {
            addCriterion("FIdentifier not in", values, "fidentifier");
            return (Criteria) this;
        }

        public Criteria andFidentifierBetween(Integer value1, Integer value2) {
            addCriterion("FIdentifier between", value1, value2, "fidentifier");
            return (Criteria) this;
        }

        public Criteria andFidentifierNotBetween(Integer value1, Integer value2) {
            addCriterion("FIdentifier not between", value1, value2, "fidentifier");
            return (Criteria) this;
        }

        public Criteria andFnameenIsNull() {
            addCriterion("FNameEn is null");
            return (Criteria) this;
        }

        public Criteria andFnameenIsNotNull() {
            addCriterion("FNameEn is not null");
            return (Criteria) this;
        }

        public Criteria andFnameenEqualTo(String value) {
            addCriterion("FNameEn =", value, "fnameen");
            return (Criteria) this;
        }

        public Criteria andFnameenNotEqualTo(String value) {
            addCriterion("FNameEn <>", value, "fnameen");
            return (Criteria) this;
        }

        public Criteria andFnameenGreaterThan(String value) {
            addCriterion("FNameEn >", value, "fnameen");
            return (Criteria) this;
        }

        public Criteria andFnameenGreaterThanOrEqualTo(String value) {
            addCriterion("FNameEn >=", value, "fnameen");
            return (Criteria) this;
        }

        public Criteria andFnameenLessThan(String value) {
            addCriterion("FNameEn <", value, "fnameen");
            return (Criteria) this;
        }

        public Criteria andFnameenLessThanOrEqualTo(String value) {
            addCriterion("FNameEn <=", value, "fnameen");
            return (Criteria) this;
        }

        public Criteria andFnameenLike(String value) {
            addCriterion("FNameEn like", value, "fnameen");
            return (Criteria) this;
        }

        public Criteria andFnameenNotLike(String value) {
            addCriterion("FNameEn not like", value, "fnameen");
            return (Criteria) this;
        }

        public Criteria andFnameenIn(List<String> values) {
            addCriterion("FNameEn in", values, "fnameen");
            return (Criteria) this;
        }

        public Criteria andFnameenNotIn(List<String> values) {
            addCriterion("FNameEn not in", values, "fnameen");
            return (Criteria) this;
        }

        public Criteria andFnameenBetween(String value1, String value2) {
            addCriterion("FNameEn between", value1, value2, "fnameen");
            return (Criteria) this;
        }

        public Criteria andFnameenNotBetween(String value1, String value2) {
            addCriterion("FNameEn not between", value1, value2, "fnameen");
            return (Criteria) this;
        }

        public Criteria andFmodelenIsNull() {
            addCriterion("FModelEn is null");
            return (Criteria) this;
        }

        public Criteria andFmodelenIsNotNull() {
            addCriterion("FModelEn is not null");
            return (Criteria) this;
        }

        public Criteria andFmodelenEqualTo(String value) {
            addCriterion("FModelEn =", value, "fmodelen");
            return (Criteria) this;
        }

        public Criteria andFmodelenNotEqualTo(String value) {
            addCriterion("FModelEn <>", value, "fmodelen");
            return (Criteria) this;
        }

        public Criteria andFmodelenGreaterThan(String value) {
            addCriterion("FModelEn >", value, "fmodelen");
            return (Criteria) this;
        }

        public Criteria andFmodelenGreaterThanOrEqualTo(String value) {
            addCriterion("FModelEn >=", value, "fmodelen");
            return (Criteria) this;
        }

        public Criteria andFmodelenLessThan(String value) {
            addCriterion("FModelEn <", value, "fmodelen");
            return (Criteria) this;
        }

        public Criteria andFmodelenLessThanOrEqualTo(String value) {
            addCriterion("FModelEn <=", value, "fmodelen");
            return (Criteria) this;
        }

        public Criteria andFmodelenLike(String value) {
            addCriterion("FModelEn like", value, "fmodelen");
            return (Criteria) this;
        }

        public Criteria andFmodelenNotLike(String value) {
            addCriterion("FModelEn not like", value, "fmodelen");
            return (Criteria) this;
        }

        public Criteria andFmodelenIn(List<String> values) {
            addCriterion("FModelEn in", values, "fmodelen");
            return (Criteria) this;
        }

        public Criteria andFmodelenNotIn(List<String> values) {
            addCriterion("FModelEn not in", values, "fmodelen");
            return (Criteria) this;
        }

        public Criteria andFmodelenBetween(String value1, String value2) {
            addCriterion("FModelEn between", value1, value2, "fmodelen");
            return (Criteria) this;
        }

        public Criteria andFmodelenNotBetween(String value1, String value2) {
            addCriterion("FModelEn not between", value1, value2, "fmodelen");
            return (Criteria) this;
        }

        public Criteria andFhsnumberIsNull() {
            addCriterion("FHSNumber is null");
            return (Criteria) this;
        }

        public Criteria andFhsnumberIsNotNull() {
            addCriterion("FHSNumber is not null");
            return (Criteria) this;
        }

        public Criteria andFhsnumberEqualTo(Integer value) {
            addCriterion("FHSNumber =", value, "fhsnumber");
            return (Criteria) this;
        }

        public Criteria andFhsnumberNotEqualTo(Integer value) {
            addCriterion("FHSNumber <>", value, "fhsnumber");
            return (Criteria) this;
        }

        public Criteria andFhsnumberGreaterThan(Integer value) {
            addCriterion("FHSNumber >", value, "fhsnumber");
            return (Criteria) this;
        }

        public Criteria andFhsnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("FHSNumber >=", value, "fhsnumber");
            return (Criteria) this;
        }

        public Criteria andFhsnumberLessThan(Integer value) {
            addCriterion("FHSNumber <", value, "fhsnumber");
            return (Criteria) this;
        }

        public Criteria andFhsnumberLessThanOrEqualTo(Integer value) {
            addCriterion("FHSNumber <=", value, "fhsnumber");
            return (Criteria) this;
        }

        public Criteria andFhsnumberIn(List<Integer> values) {
            addCriterion("FHSNumber in", values, "fhsnumber");
            return (Criteria) this;
        }

        public Criteria andFhsnumberNotIn(List<Integer> values) {
            addCriterion("FHSNumber not in", values, "fhsnumber");
            return (Criteria) this;
        }

        public Criteria andFhsnumberBetween(Integer value1, Integer value2) {
            addCriterion("FHSNumber between", value1, value2, "fhsnumber");
            return (Criteria) this;
        }

        public Criteria andFhsnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("FHSNumber not between", value1, value2, "fhsnumber");
            return (Criteria) this;
        }

        public Criteria andFfirstunitIsNull() {
            addCriterion("FFirstUnit is null");
            return (Criteria) this;
        }

        public Criteria andFfirstunitIsNotNull() {
            addCriterion("FFirstUnit is not null");
            return (Criteria) this;
        }

        public Criteria andFfirstunitEqualTo(String value) {
            addCriterion("FFirstUnit =", value, "ffirstunit");
            return (Criteria) this;
        }

        public Criteria andFfirstunitNotEqualTo(String value) {
            addCriterion("FFirstUnit <>", value, "ffirstunit");
            return (Criteria) this;
        }

        public Criteria andFfirstunitGreaterThan(String value) {
            addCriterion("FFirstUnit >", value, "ffirstunit");
            return (Criteria) this;
        }

        public Criteria andFfirstunitGreaterThanOrEqualTo(String value) {
            addCriterion("FFirstUnit >=", value, "ffirstunit");
            return (Criteria) this;
        }

        public Criteria andFfirstunitLessThan(String value) {
            addCriterion("FFirstUnit <", value, "ffirstunit");
            return (Criteria) this;
        }

        public Criteria andFfirstunitLessThanOrEqualTo(String value) {
            addCriterion("FFirstUnit <=", value, "ffirstunit");
            return (Criteria) this;
        }

        public Criteria andFfirstunitLike(String value) {
            addCriterion("FFirstUnit like", value, "ffirstunit");
            return (Criteria) this;
        }

        public Criteria andFfirstunitNotLike(String value) {
            addCriterion("FFirstUnit not like", value, "ffirstunit");
            return (Criteria) this;
        }

        public Criteria andFfirstunitIn(List<String> values) {
            addCriterion("FFirstUnit in", values, "ffirstunit");
            return (Criteria) this;
        }

        public Criteria andFfirstunitNotIn(List<String> values) {
            addCriterion("FFirstUnit not in", values, "ffirstunit");
            return (Criteria) this;
        }

        public Criteria andFfirstunitBetween(String value1, String value2) {
            addCriterion("FFirstUnit between", value1, value2, "ffirstunit");
            return (Criteria) this;
        }

        public Criteria andFfirstunitNotBetween(String value1, String value2) {
            addCriterion("FFirstUnit not between", value1, value2, "ffirstunit");
            return (Criteria) this;
        }

        public Criteria andFsecondunitIsNull() {
            addCriterion("FSecondUnit is null");
            return (Criteria) this;
        }

        public Criteria andFsecondunitIsNotNull() {
            addCriterion("FSecondUnit is not null");
            return (Criteria) this;
        }

        public Criteria andFsecondunitEqualTo(String value) {
            addCriterion("FSecondUnit =", value, "fsecondunit");
            return (Criteria) this;
        }

        public Criteria andFsecondunitNotEqualTo(String value) {
            addCriterion("FSecondUnit <>", value, "fsecondunit");
            return (Criteria) this;
        }

        public Criteria andFsecondunitGreaterThan(String value) {
            addCriterion("FSecondUnit >", value, "fsecondunit");
            return (Criteria) this;
        }

        public Criteria andFsecondunitGreaterThanOrEqualTo(String value) {
            addCriterion("FSecondUnit >=", value, "fsecondunit");
            return (Criteria) this;
        }

        public Criteria andFsecondunitLessThan(String value) {
            addCriterion("FSecondUnit <", value, "fsecondunit");
            return (Criteria) this;
        }

        public Criteria andFsecondunitLessThanOrEqualTo(String value) {
            addCriterion("FSecondUnit <=", value, "fsecondunit");
            return (Criteria) this;
        }

        public Criteria andFsecondunitLike(String value) {
            addCriterion("FSecondUnit like", value, "fsecondunit");
            return (Criteria) this;
        }

        public Criteria andFsecondunitNotLike(String value) {
            addCriterion("FSecondUnit not like", value, "fsecondunit");
            return (Criteria) this;
        }

        public Criteria andFsecondunitIn(List<String> values) {
            addCriterion("FSecondUnit in", values, "fsecondunit");
            return (Criteria) this;
        }

        public Criteria andFsecondunitNotIn(List<String> values) {
            addCriterion("FSecondUnit not in", values, "fsecondunit");
            return (Criteria) this;
        }

        public Criteria andFsecondunitBetween(String value1, String value2) {
            addCriterion("FSecondUnit between", value1, value2, "fsecondunit");
            return (Criteria) this;
        }

        public Criteria andFsecondunitNotBetween(String value1, String value2) {
            addCriterion("FSecondUnit not between", value1, value2, "fsecondunit");
            return (Criteria) this;
        }

        public Criteria andFfirstunitrateIsNull() {
            addCriterion("FFirstUnitRate is null");
            return (Criteria) this;
        }

        public Criteria andFfirstunitrateIsNotNull() {
            addCriterion("FFirstUnitRate is not null");
            return (Criteria) this;
        }

        public Criteria andFfirstunitrateEqualTo(BigDecimal value) {
            addCriterion("FFirstUnitRate =", value, "ffirstunitrate");
            return (Criteria) this;
        }

        public Criteria andFfirstunitrateNotEqualTo(BigDecimal value) {
            addCriterion("FFirstUnitRate <>", value, "ffirstunitrate");
            return (Criteria) this;
        }

        public Criteria andFfirstunitrateGreaterThan(BigDecimal value) {
            addCriterion("FFirstUnitRate >", value, "ffirstunitrate");
            return (Criteria) this;
        }

        public Criteria andFfirstunitrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FFirstUnitRate >=", value, "ffirstunitrate");
            return (Criteria) this;
        }

        public Criteria andFfirstunitrateLessThan(BigDecimal value) {
            addCriterion("FFirstUnitRate <", value, "ffirstunitrate");
            return (Criteria) this;
        }

        public Criteria andFfirstunitrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FFirstUnitRate <=", value, "ffirstunitrate");
            return (Criteria) this;
        }

        public Criteria andFfirstunitrateIn(List<BigDecimal> values) {
            addCriterion("FFirstUnitRate in", values, "ffirstunitrate");
            return (Criteria) this;
        }

        public Criteria andFfirstunitrateNotIn(List<BigDecimal> values) {
            addCriterion("FFirstUnitRate not in", values, "ffirstunitrate");
            return (Criteria) this;
        }

        public Criteria andFfirstunitrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FFirstUnitRate between", value1, value2, "ffirstunitrate");
            return (Criteria) this;
        }

        public Criteria andFfirstunitrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FFirstUnitRate not between", value1, value2, "ffirstunitrate");
            return (Criteria) this;
        }

        public Criteria andFsecondunitrateIsNull() {
            addCriterion("FSecondUnitRate is null");
            return (Criteria) this;
        }

        public Criteria andFsecondunitrateIsNotNull() {
            addCriterion("FSecondUnitRate is not null");
            return (Criteria) this;
        }

        public Criteria andFsecondunitrateEqualTo(BigDecimal value) {
            addCriterion("FSecondUnitRate =", value, "fsecondunitrate");
            return (Criteria) this;
        }

        public Criteria andFsecondunitrateNotEqualTo(BigDecimal value) {
            addCriterion("FSecondUnitRate <>", value, "fsecondunitrate");
            return (Criteria) this;
        }

        public Criteria andFsecondunitrateGreaterThan(BigDecimal value) {
            addCriterion("FSecondUnitRate >", value, "fsecondunitrate");
            return (Criteria) this;
        }

        public Criteria andFsecondunitrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FSecondUnitRate >=", value, "fsecondunitrate");
            return (Criteria) this;
        }

        public Criteria andFsecondunitrateLessThan(BigDecimal value) {
            addCriterion("FSecondUnitRate <", value, "fsecondunitrate");
            return (Criteria) this;
        }

        public Criteria andFsecondunitrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FSecondUnitRate <=", value, "fsecondunitrate");
            return (Criteria) this;
        }

        public Criteria andFsecondunitrateIn(List<BigDecimal> values) {
            addCriterion("FSecondUnitRate in", values, "fsecondunitrate");
            return (Criteria) this;
        }

        public Criteria andFsecondunitrateNotIn(List<BigDecimal> values) {
            addCriterion("FSecondUnitRate not in", values, "fsecondunitrate");
            return (Criteria) this;
        }

        public Criteria andFsecondunitrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FSecondUnitRate between", value1, value2, "fsecondunitrate");
            return (Criteria) this;
        }

        public Criteria andFsecondunitrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FSecondUnitRate not between", value1, value2, "fsecondunitrate");
            return (Criteria) this;
        }

        public Criteria andFismanageIsNull() {
            addCriterion("FIsManage is null");
            return (Criteria) this;
        }

        public Criteria andFismanageIsNotNull() {
            addCriterion("FIsManage is not null");
            return (Criteria) this;
        }

        public Criteria andFismanageEqualTo(Boolean value) {
            addCriterion("FIsManage =", value, "fismanage");
            return (Criteria) this;
        }

        public Criteria andFismanageNotEqualTo(Boolean value) {
            addCriterion("FIsManage <>", value, "fismanage");
            return (Criteria) this;
        }

        public Criteria andFismanageGreaterThan(Boolean value) {
            addCriterion("FIsManage >", value, "fismanage");
            return (Criteria) this;
        }

        public Criteria andFismanageGreaterThanOrEqualTo(Boolean value) {
            addCriterion("FIsManage >=", value, "fismanage");
            return (Criteria) this;
        }

        public Criteria andFismanageLessThan(Boolean value) {
            addCriterion("FIsManage <", value, "fismanage");
            return (Criteria) this;
        }

        public Criteria andFismanageLessThanOrEqualTo(Boolean value) {
            addCriterion("FIsManage <=", value, "fismanage");
            return (Criteria) this;
        }

        public Criteria andFismanageIn(List<Boolean> values) {
            addCriterion("FIsManage in", values, "fismanage");
            return (Criteria) this;
        }

        public Criteria andFismanageNotIn(List<Boolean> values) {
            addCriterion("FIsManage not in", values, "fismanage");
            return (Criteria) this;
        }

        public Criteria andFismanageBetween(Boolean value1, Boolean value2) {
            addCriterion("FIsManage between", value1, value2, "fismanage");
            return (Criteria) this;
        }

        public Criteria andFismanageNotBetween(Boolean value1, Boolean value2) {
            addCriterion("FIsManage not between", value1, value2, "fismanage");
            return (Criteria) this;
        }

        public Criteria andFpacktypeIsNull() {
            addCriterion("FPackType is null");
            return (Criteria) this;
        }

        public Criteria andFpacktypeIsNotNull() {
            addCriterion("FPackType is not null");
            return (Criteria) this;
        }

        public Criteria andFpacktypeEqualTo(Integer value) {
            addCriterion("FPackType =", value, "fpacktype");
            return (Criteria) this;
        }

        public Criteria andFpacktypeNotEqualTo(Integer value) {
            addCriterion("FPackType <>", value, "fpacktype");
            return (Criteria) this;
        }

        public Criteria andFpacktypeGreaterThan(Integer value) {
            addCriterion("FPackType >", value, "fpacktype");
            return (Criteria) this;
        }

        public Criteria andFpacktypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("FPackType >=", value, "fpacktype");
            return (Criteria) this;
        }

        public Criteria andFpacktypeLessThan(Integer value) {
            addCriterion("FPackType <", value, "fpacktype");
            return (Criteria) this;
        }

        public Criteria andFpacktypeLessThanOrEqualTo(Integer value) {
            addCriterion("FPackType <=", value, "fpacktype");
            return (Criteria) this;
        }

        public Criteria andFpacktypeIn(List<Integer> values) {
            addCriterion("FPackType in", values, "fpacktype");
            return (Criteria) this;
        }

        public Criteria andFpacktypeNotIn(List<Integer> values) {
            addCriterion("FPackType not in", values, "fpacktype");
            return (Criteria) this;
        }

        public Criteria andFpacktypeBetween(Integer value1, Integer value2) {
            addCriterion("FPackType between", value1, value2, "fpacktype");
            return (Criteria) this;
        }

        public Criteria andFpacktypeNotBetween(Integer value1, Integer value2) {
            addCriterion("FPackType not between", value1, value2, "fpacktype");
            return (Criteria) this;
        }

        public Criteria andFlendecimalIsNull() {
            addCriterion("FLenDecimal is null");
            return (Criteria) this;
        }

        public Criteria andFlendecimalIsNotNull() {
            addCriterion("FLenDecimal is not null");
            return (Criteria) this;
        }

        public Criteria andFlendecimalEqualTo(Integer value) {
            addCriterion("FLenDecimal =", value, "flendecimal");
            return (Criteria) this;
        }

        public Criteria andFlendecimalNotEqualTo(Integer value) {
            addCriterion("FLenDecimal <>", value, "flendecimal");
            return (Criteria) this;
        }

        public Criteria andFlendecimalGreaterThan(Integer value) {
            addCriterion("FLenDecimal >", value, "flendecimal");
            return (Criteria) this;
        }

        public Criteria andFlendecimalGreaterThanOrEqualTo(Integer value) {
            addCriterion("FLenDecimal >=", value, "flendecimal");
            return (Criteria) this;
        }

        public Criteria andFlendecimalLessThan(Integer value) {
            addCriterion("FLenDecimal <", value, "flendecimal");
            return (Criteria) this;
        }

        public Criteria andFlendecimalLessThanOrEqualTo(Integer value) {
            addCriterion("FLenDecimal <=", value, "flendecimal");
            return (Criteria) this;
        }

        public Criteria andFlendecimalIn(List<Integer> values) {
            addCriterion("FLenDecimal in", values, "flendecimal");
            return (Criteria) this;
        }

        public Criteria andFlendecimalNotIn(List<Integer> values) {
            addCriterion("FLenDecimal not in", values, "flendecimal");
            return (Criteria) this;
        }

        public Criteria andFlendecimalBetween(Integer value1, Integer value2) {
            addCriterion("FLenDecimal between", value1, value2, "flendecimal");
            return (Criteria) this;
        }

        public Criteria andFlendecimalNotBetween(Integer value1, Integer value2) {
            addCriterion("FLenDecimal not between", value1, value2, "flendecimal");
            return (Criteria) this;
        }

        public Criteria andFcubagedecimalIsNull() {
            addCriterion("FCubageDecimal is null");
            return (Criteria) this;
        }

        public Criteria andFcubagedecimalIsNotNull() {
            addCriterion("FCubageDecimal is not null");
            return (Criteria) this;
        }

        public Criteria andFcubagedecimalEqualTo(Integer value) {
            addCriterion("FCubageDecimal =", value, "fcubagedecimal");
            return (Criteria) this;
        }

        public Criteria andFcubagedecimalNotEqualTo(Integer value) {
            addCriterion("FCubageDecimal <>", value, "fcubagedecimal");
            return (Criteria) this;
        }

        public Criteria andFcubagedecimalGreaterThan(Integer value) {
            addCriterion("FCubageDecimal >", value, "fcubagedecimal");
            return (Criteria) this;
        }

        public Criteria andFcubagedecimalGreaterThanOrEqualTo(Integer value) {
            addCriterion("FCubageDecimal >=", value, "fcubagedecimal");
            return (Criteria) this;
        }

        public Criteria andFcubagedecimalLessThan(Integer value) {
            addCriterion("FCubageDecimal <", value, "fcubagedecimal");
            return (Criteria) this;
        }

        public Criteria andFcubagedecimalLessThanOrEqualTo(Integer value) {
            addCriterion("FCubageDecimal <=", value, "fcubagedecimal");
            return (Criteria) this;
        }

        public Criteria andFcubagedecimalIn(List<Integer> values) {
            addCriterion("FCubageDecimal in", values, "fcubagedecimal");
            return (Criteria) this;
        }

        public Criteria andFcubagedecimalNotIn(List<Integer> values) {
            addCriterion("FCubageDecimal not in", values, "fcubagedecimal");
            return (Criteria) this;
        }

        public Criteria andFcubagedecimalBetween(Integer value1, Integer value2) {
            addCriterion("FCubageDecimal between", value1, value2, "fcubagedecimal");
            return (Criteria) this;
        }

        public Criteria andFcubagedecimalNotBetween(Integer value1, Integer value2) {
            addCriterion("FCubageDecimal not between", value1, value2, "fcubagedecimal");
            return (Criteria) this;
        }

        public Criteria andFweightdecimalIsNull() {
            addCriterion("FWeightDecimal is null");
            return (Criteria) this;
        }

        public Criteria andFweightdecimalIsNotNull() {
            addCriterion("FWeightDecimal is not null");
            return (Criteria) this;
        }

        public Criteria andFweightdecimalEqualTo(Integer value) {
            addCriterion("FWeightDecimal =", value, "fweightdecimal");
            return (Criteria) this;
        }

        public Criteria andFweightdecimalNotEqualTo(Integer value) {
            addCriterion("FWeightDecimal <>", value, "fweightdecimal");
            return (Criteria) this;
        }

        public Criteria andFweightdecimalGreaterThan(Integer value) {
            addCriterion("FWeightDecimal >", value, "fweightdecimal");
            return (Criteria) this;
        }

        public Criteria andFweightdecimalGreaterThanOrEqualTo(Integer value) {
            addCriterion("FWeightDecimal >=", value, "fweightdecimal");
            return (Criteria) this;
        }

        public Criteria andFweightdecimalLessThan(Integer value) {
            addCriterion("FWeightDecimal <", value, "fweightdecimal");
            return (Criteria) this;
        }

        public Criteria andFweightdecimalLessThanOrEqualTo(Integer value) {
            addCriterion("FWeightDecimal <=", value, "fweightdecimal");
            return (Criteria) this;
        }

        public Criteria andFweightdecimalIn(List<Integer> values) {
            addCriterion("FWeightDecimal in", values, "fweightdecimal");
            return (Criteria) this;
        }

        public Criteria andFweightdecimalNotIn(List<Integer> values) {
            addCriterion("FWeightDecimal not in", values, "fweightdecimal");
            return (Criteria) this;
        }

        public Criteria andFweightdecimalBetween(Integer value1, Integer value2) {
            addCriterion("FWeightDecimal between", value1, value2, "fweightdecimal");
            return (Criteria) this;
        }

        public Criteria andFweightdecimalNotBetween(Integer value1, Integer value2) {
            addCriterion("FWeightDecimal not between", value1, value2, "fweightdecimal");
            return (Criteria) this;
        }

        public Criteria andFimposttaxrateIsNull() {
            addCriterion("FImpostTaxRate is null");
            return (Criteria) this;
        }

        public Criteria andFimposttaxrateIsNotNull() {
            addCriterion("FImpostTaxRate is not null");
            return (Criteria) this;
        }

        public Criteria andFimposttaxrateEqualTo(BigDecimal value) {
            addCriterion("FImpostTaxRate =", value, "fimposttaxrate");
            return (Criteria) this;
        }

        public Criteria andFimposttaxrateNotEqualTo(BigDecimal value) {
            addCriterion("FImpostTaxRate <>", value, "fimposttaxrate");
            return (Criteria) this;
        }

        public Criteria andFimposttaxrateGreaterThan(BigDecimal value) {
            addCriterion("FImpostTaxRate >", value, "fimposttaxrate");
            return (Criteria) this;
        }

        public Criteria andFimposttaxrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FImpostTaxRate >=", value, "fimposttaxrate");
            return (Criteria) this;
        }

        public Criteria andFimposttaxrateLessThan(BigDecimal value) {
            addCriterion("FImpostTaxRate <", value, "fimposttaxrate");
            return (Criteria) this;
        }

        public Criteria andFimposttaxrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FImpostTaxRate <=", value, "fimposttaxrate");
            return (Criteria) this;
        }

        public Criteria andFimposttaxrateIn(List<BigDecimal> values) {
            addCriterion("FImpostTaxRate in", values, "fimposttaxrate");
            return (Criteria) this;
        }

        public Criteria andFimposttaxrateNotIn(List<BigDecimal> values) {
            addCriterion("FImpostTaxRate not in", values, "fimposttaxrate");
            return (Criteria) this;
        }

        public Criteria andFimposttaxrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FImpostTaxRate between", value1, value2, "fimposttaxrate");
            return (Criteria) this;
        }

        public Criteria andFimposttaxrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FImpostTaxRate not between", value1, value2, "fimposttaxrate");
            return (Criteria) this;
        }

        public Criteria andFconsumetaxrateIsNull() {
            addCriterion("FConsumeTaxRate is null");
            return (Criteria) this;
        }

        public Criteria andFconsumetaxrateIsNotNull() {
            addCriterion("FConsumeTaxRate is not null");
            return (Criteria) this;
        }

        public Criteria andFconsumetaxrateEqualTo(BigDecimal value) {
            addCriterion("FConsumeTaxRate =", value, "fconsumetaxrate");
            return (Criteria) this;
        }

        public Criteria andFconsumetaxrateNotEqualTo(BigDecimal value) {
            addCriterion("FConsumeTaxRate <>", value, "fconsumetaxrate");
            return (Criteria) this;
        }

        public Criteria andFconsumetaxrateGreaterThan(BigDecimal value) {
            addCriterion("FConsumeTaxRate >", value, "fconsumetaxrate");
            return (Criteria) this;
        }

        public Criteria andFconsumetaxrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FConsumeTaxRate >=", value, "fconsumetaxrate");
            return (Criteria) this;
        }

        public Criteria andFconsumetaxrateLessThan(BigDecimal value) {
            addCriterion("FConsumeTaxRate <", value, "fconsumetaxrate");
            return (Criteria) this;
        }

        public Criteria andFconsumetaxrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FConsumeTaxRate <=", value, "fconsumetaxrate");
            return (Criteria) this;
        }

        public Criteria andFconsumetaxrateIn(List<BigDecimal> values) {
            addCriterion("FConsumeTaxRate in", values, "fconsumetaxrate");
            return (Criteria) this;
        }

        public Criteria andFconsumetaxrateNotIn(List<BigDecimal> values) {
            addCriterion("FConsumeTaxRate not in", values, "fconsumetaxrate");
            return (Criteria) this;
        }

        public Criteria andFconsumetaxrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FConsumeTaxRate between", value1, value2, "fconsumetaxrate");
            return (Criteria) this;
        }

        public Criteria andFconsumetaxrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FConsumeTaxRate not between", value1, value2, "fconsumetaxrate");
            return (Criteria) this;
        }

        public Criteria andFmanagetypeIsNull() {
            addCriterion("FManageType is null");
            return (Criteria) this;
        }

        public Criteria andFmanagetypeIsNotNull() {
            addCriterion("FManageType is not null");
            return (Criteria) this;
        }

        public Criteria andFmanagetypeEqualTo(Integer value) {
            addCriterion("FManageType =", value, "fmanagetype");
            return (Criteria) this;
        }

        public Criteria andFmanagetypeNotEqualTo(Integer value) {
            addCriterion("FManageType <>", value, "fmanagetype");
            return (Criteria) this;
        }

        public Criteria andFmanagetypeGreaterThan(Integer value) {
            addCriterion("FManageType >", value, "fmanagetype");
            return (Criteria) this;
        }

        public Criteria andFmanagetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("FManageType >=", value, "fmanagetype");
            return (Criteria) this;
        }

        public Criteria andFmanagetypeLessThan(Integer value) {
            addCriterion("FManageType <", value, "fmanagetype");
            return (Criteria) this;
        }

        public Criteria andFmanagetypeLessThanOrEqualTo(Integer value) {
            addCriterion("FManageType <=", value, "fmanagetype");
            return (Criteria) this;
        }

        public Criteria andFmanagetypeIn(List<Integer> values) {
            addCriterion("FManageType in", values, "fmanagetype");
            return (Criteria) this;
        }

        public Criteria andFmanagetypeNotIn(List<Integer> values) {
            addCriterion("FManageType not in", values, "fmanagetype");
            return (Criteria) this;
        }

        public Criteria andFmanagetypeBetween(Integer value1, Integer value2) {
            addCriterion("FManageType between", value1, value2, "fmanagetype");
            return (Criteria) this;
        }

        public Criteria andFmanagetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("FManageType not between", value1, value2, "fmanagetype");
            return (Criteria) this;
        }

        public Criteria andFbarcodeIsNull() {
            addCriterion("FBarcode is null");
            return (Criteria) this;
        }

        public Criteria andFbarcodeIsNotNull() {
            addCriterion("FBarcode is not null");
            return (Criteria) this;
        }

        public Criteria andFbarcodeEqualTo(String value) {
            addCriterion("FBarcode =", value, "fbarcode");
            return (Criteria) this;
        }

        public Criteria andFbarcodeNotEqualTo(String value) {
            addCriterion("FBarcode <>", value, "fbarcode");
            return (Criteria) this;
        }

        public Criteria andFbarcodeGreaterThan(String value) {
            addCriterion("FBarcode >", value, "fbarcode");
            return (Criteria) this;
        }

        public Criteria andFbarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("FBarcode >=", value, "fbarcode");
            return (Criteria) this;
        }

        public Criteria andFbarcodeLessThan(String value) {
            addCriterion("FBarcode <", value, "fbarcode");
            return (Criteria) this;
        }

        public Criteria andFbarcodeLessThanOrEqualTo(String value) {
            addCriterion("FBarcode <=", value, "fbarcode");
            return (Criteria) this;
        }

        public Criteria andFbarcodeLike(String value) {
            addCriterion("FBarcode like", value, "fbarcode");
            return (Criteria) this;
        }

        public Criteria andFbarcodeNotLike(String value) {
            addCriterion("FBarcode not like", value, "fbarcode");
            return (Criteria) this;
        }

        public Criteria andFbarcodeIn(List<String> values) {
            addCriterion("FBarcode in", values, "fbarcode");
            return (Criteria) this;
        }

        public Criteria andFbarcodeNotIn(List<String> values) {
            addCriterion("FBarcode not in", values, "fbarcode");
            return (Criteria) this;
        }

        public Criteria andFbarcodeBetween(String value1, String value2) {
            addCriterion("FBarcode between", value1, value2, "fbarcode");
            return (Criteria) this;
        }

        public Criteria andFbarcodeNotBetween(String value1, String value2) {
            addCriterion("FBarcode not between", value1, value2, "fbarcode");
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