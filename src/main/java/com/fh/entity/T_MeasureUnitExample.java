package com.fh.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class T_MeasureUnitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public T_MeasureUnitExample() {
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

        public Criteria andFmeasureunitidIsNull() {
            addCriterion("FMeasureUnitID is null");
            return (Criteria) this;
        }

        public Criteria andFmeasureunitidIsNotNull() {
            addCriterion("FMeasureUnitID is not null");
            return (Criteria) this;
        }

        public Criteria andFmeasureunitidEqualTo(Integer value) {
            addCriterion("FMeasureUnitID =", value, "fmeasureunitid");
            return (Criteria) this;
        }

        public Criteria andFmeasureunitidNotEqualTo(Integer value) {
            addCriterion("FMeasureUnitID <>", value, "fmeasureunitid");
            return (Criteria) this;
        }

        public Criteria andFmeasureunitidGreaterThan(Integer value) {
            addCriterion("FMeasureUnitID >", value, "fmeasureunitid");
            return (Criteria) this;
        }

        public Criteria andFmeasureunitidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FMeasureUnitID >=", value, "fmeasureunitid");
            return (Criteria) this;
        }

        public Criteria andFmeasureunitidLessThan(Integer value) {
            addCriterion("FMeasureUnitID <", value, "fmeasureunitid");
            return (Criteria) this;
        }

        public Criteria andFmeasureunitidLessThanOrEqualTo(Integer value) {
            addCriterion("FMeasureUnitID <=", value, "fmeasureunitid");
            return (Criteria) this;
        }

        public Criteria andFmeasureunitidIn(List<Integer> values) {
            addCriterion("FMeasureUnitID in", values, "fmeasureunitid");
            return (Criteria) this;
        }

        public Criteria andFmeasureunitidNotIn(List<Integer> values) {
            addCriterion("FMeasureUnitID not in", values, "fmeasureunitid");
            return (Criteria) this;
        }

        public Criteria andFmeasureunitidBetween(Integer value1, Integer value2) {
            addCriterion("FMeasureUnitID between", value1, value2, "fmeasureunitid");
            return (Criteria) this;
        }

        public Criteria andFmeasureunitidNotBetween(Integer value1, Integer value2) {
            addCriterion("FMeasureUnitID not between", value1, value2, "fmeasureunitid");
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

        public Criteria andFauxclassIsNull() {
            addCriterion("FAuxClass is null");
            return (Criteria) this;
        }

        public Criteria andFauxclassIsNotNull() {
            addCriterion("FAuxClass is not null");
            return (Criteria) this;
        }

        public Criteria andFauxclassEqualTo(String value) {
            addCriterion("FAuxClass =", value, "fauxclass");
            return (Criteria) this;
        }

        public Criteria andFauxclassNotEqualTo(String value) {
            addCriterion("FAuxClass <>", value, "fauxclass");
            return (Criteria) this;
        }

        public Criteria andFauxclassGreaterThan(String value) {
            addCriterion("FAuxClass >", value, "fauxclass");
            return (Criteria) this;
        }

        public Criteria andFauxclassGreaterThanOrEqualTo(String value) {
            addCriterion("FAuxClass >=", value, "fauxclass");
            return (Criteria) this;
        }

        public Criteria andFauxclassLessThan(String value) {
            addCriterion("FAuxClass <", value, "fauxclass");
            return (Criteria) this;
        }

        public Criteria andFauxclassLessThanOrEqualTo(String value) {
            addCriterion("FAuxClass <=", value, "fauxclass");
            return (Criteria) this;
        }

        public Criteria andFauxclassLike(String value) {
            addCriterion("FAuxClass like", value, "fauxclass");
            return (Criteria) this;
        }

        public Criteria andFauxclassNotLike(String value) {
            addCriterion("FAuxClass not like", value, "fauxclass");
            return (Criteria) this;
        }

        public Criteria andFauxclassIn(List<String> values) {
            addCriterion("FAuxClass in", values, "fauxclass");
            return (Criteria) this;
        }

        public Criteria andFauxclassNotIn(List<String> values) {
            addCriterion("FAuxClass not in", values, "fauxclass");
            return (Criteria) this;
        }

        public Criteria andFauxclassBetween(String value1, String value2) {
            addCriterion("FAuxClass between", value1, value2, "fauxclass");
            return (Criteria) this;
        }

        public Criteria andFauxclassNotBetween(String value1, String value2) {
            addCriterion("FAuxClass not between", value1, value2, "fauxclass");
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

        public Criteria andFconversationIsNull() {
            addCriterion("FConversation is null");
            return (Criteria) this;
        }

        public Criteria andFconversationIsNotNull() {
            addCriterion("FConversation is not null");
            return (Criteria) this;
        }

        public Criteria andFconversationEqualTo(Integer value) {
            addCriterion("FConversation =", value, "fconversation");
            return (Criteria) this;
        }

        public Criteria andFconversationNotEqualTo(Integer value) {
            addCriterion("FConversation <>", value, "fconversation");
            return (Criteria) this;
        }

        public Criteria andFconversationGreaterThan(Integer value) {
            addCriterion("FConversation >", value, "fconversation");
            return (Criteria) this;
        }

        public Criteria andFconversationGreaterThanOrEqualTo(Integer value) {
            addCriterion("FConversation >=", value, "fconversation");
            return (Criteria) this;
        }

        public Criteria andFconversationLessThan(Integer value) {
            addCriterion("FConversation <", value, "fconversation");
            return (Criteria) this;
        }

        public Criteria andFconversationLessThanOrEqualTo(Integer value) {
            addCriterion("FConversation <=", value, "fconversation");
            return (Criteria) this;
        }

        public Criteria andFconversationIn(List<Integer> values) {
            addCriterion("FConversation in", values, "fconversation");
            return (Criteria) this;
        }

        public Criteria andFconversationNotIn(List<Integer> values) {
            addCriterion("FConversation not in", values, "fconversation");
            return (Criteria) this;
        }

        public Criteria andFconversationBetween(Integer value1, Integer value2) {
            addCriterion("FConversation between", value1, value2, "fconversation");
            return (Criteria) this;
        }

        public Criteria andFconversationNotBetween(Integer value1, Integer value2) {
            addCriterion("FConversation not between", value1, value2, "fconversation");
            return (Criteria) this;
        }

        public Criteria andFcoefficientIsNull() {
            addCriterion("FCoefficient is null");
            return (Criteria) this;
        }

        public Criteria andFcoefficientIsNotNull() {
            addCriterion("FCoefficient is not null");
            return (Criteria) this;
        }

        public Criteria andFcoefficientEqualTo(BigDecimal value) {
            addCriterion("FCoefficient =", value, "fcoefficient");
            return (Criteria) this;
        }

        public Criteria andFcoefficientNotEqualTo(BigDecimal value) {
            addCriterion("FCoefficient <>", value, "fcoefficient");
            return (Criteria) this;
        }

        public Criteria andFcoefficientGreaterThan(BigDecimal value) {
            addCriterion("FCoefficient >", value, "fcoefficient");
            return (Criteria) this;
        }

        public Criteria andFcoefficientGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FCoefficient >=", value, "fcoefficient");
            return (Criteria) this;
        }

        public Criteria andFcoefficientLessThan(BigDecimal value) {
            addCriterion("FCoefficient <", value, "fcoefficient");
            return (Criteria) this;
        }

        public Criteria andFcoefficientLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FCoefficient <=", value, "fcoefficient");
            return (Criteria) this;
        }

        public Criteria andFcoefficientIn(List<BigDecimal> values) {
            addCriterion("FCoefficient in", values, "fcoefficient");
            return (Criteria) this;
        }

        public Criteria andFcoefficientNotIn(List<BigDecimal> values) {
            addCriterion("FCoefficient not in", values, "fcoefficient");
            return (Criteria) this;
        }

        public Criteria andFcoefficientBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FCoefficient between", value1, value2, "fcoefficient");
            return (Criteria) this;
        }

        public Criteria andFcoefficientNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FCoefficient not between", value1, value2, "fcoefficient");
            return (Criteria) this;
        }

        public Criteria andFprecisionIsNull() {
            addCriterion("FPrecision is null");
            return (Criteria) this;
        }

        public Criteria andFprecisionIsNotNull() {
            addCriterion("FPrecision is not null");
            return (Criteria) this;
        }

        public Criteria andFprecisionEqualTo(Integer value) {
            addCriterion("FPrecision =", value, "fprecision");
            return (Criteria) this;
        }

        public Criteria andFprecisionNotEqualTo(Integer value) {
            addCriterion("FPrecision <>", value, "fprecision");
            return (Criteria) this;
        }

        public Criteria andFprecisionGreaterThan(Integer value) {
            addCriterion("FPrecision >", value, "fprecision");
            return (Criteria) this;
        }

        public Criteria andFprecisionGreaterThanOrEqualTo(Integer value) {
            addCriterion("FPrecision >=", value, "fprecision");
            return (Criteria) this;
        }

        public Criteria andFprecisionLessThan(Integer value) {
            addCriterion("FPrecision <", value, "fprecision");
            return (Criteria) this;
        }

        public Criteria andFprecisionLessThanOrEqualTo(Integer value) {
            addCriterion("FPrecision <=", value, "fprecision");
            return (Criteria) this;
        }

        public Criteria andFprecisionIn(List<Integer> values) {
            addCriterion("FPrecision in", values, "fprecision");
            return (Criteria) this;
        }

        public Criteria andFprecisionNotIn(List<Integer> values) {
            addCriterion("FPrecision not in", values, "fprecision");
            return (Criteria) this;
        }

        public Criteria andFprecisionBetween(Integer value1, Integer value2) {
            addCriterion("FPrecision between", value1, value2, "fprecision");
            return (Criteria) this;
        }

        public Criteria andFprecisionNotBetween(Integer value1, Integer value2) {
            addCriterion("FPrecision not between", value1, value2, "fprecision");
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

        public Criteria andFoperdateIsNull() {
            addCriterion("FOperDate is null");
            return (Criteria) this;
        }

        public Criteria andFoperdateIsNotNull() {
            addCriterion("FOperDate is not null");
            return (Criteria) this;
        }

        public Criteria andFoperdateEqualTo(String value) {
            addCriterion("FOperDate =", value, "foperdate");
            return (Criteria) this;
        }

        public Criteria andFoperdateNotEqualTo(String value) {
            addCriterion("FOperDate <>", value, "foperdate");
            return (Criteria) this;
        }

        public Criteria andFoperdateGreaterThan(String value) {
            addCriterion("FOperDate >", value, "foperdate");
            return (Criteria) this;
        }

        public Criteria andFoperdateGreaterThanOrEqualTo(String value) {
            addCriterion("FOperDate >=", value, "foperdate");
            return (Criteria) this;
        }

        public Criteria andFoperdateLessThan(String value) {
            addCriterion("FOperDate <", value, "foperdate");
            return (Criteria) this;
        }

        public Criteria andFoperdateLessThanOrEqualTo(String value) {
            addCriterion("FOperDate <=", value, "foperdate");
            return (Criteria) this;
        }

        public Criteria andFoperdateLike(String value) {
            addCriterion("FOperDate like", value, "foperdate");
            return (Criteria) this;
        }

        public Criteria andFoperdateNotLike(String value) {
            addCriterion("FOperDate not like", value, "foperdate");
            return (Criteria) this;
        }

        public Criteria andFoperdateIn(List<String> values) {
            addCriterion("FOperDate in", values, "foperdate");
            return (Criteria) this;
        }

        public Criteria andFoperdateNotIn(List<String> values) {
            addCriterion("FOperDate not in", values, "foperdate");
            return (Criteria) this;
        }

        public Criteria andFoperdateBetween(String value1, String value2) {
            addCriterion("FOperDate between", value1, value2, "foperdate");
            return (Criteria) this;
        }

        public Criteria andFoperdateNotBetween(String value1, String value2) {
            addCriterion("FOperDate not between", value1, value2, "foperdate");
            return (Criteria) this;
        }

        public Criteria andFscaleIsNull() {
            addCriterion("FScale is null");
            return (Criteria) this;
        }

        public Criteria andFscaleIsNotNull() {
            addCriterion("FScale is not null");
            return (Criteria) this;
        }

        public Criteria andFscaleEqualTo(BigDecimal value) {
            addCriterion("FScale =", value, "fscale");
            return (Criteria) this;
        }

        public Criteria andFscaleNotEqualTo(BigDecimal value) {
            addCriterion("FScale <>", value, "fscale");
            return (Criteria) this;
        }

        public Criteria andFscaleGreaterThan(BigDecimal value) {
            addCriterion("FScale >", value, "fscale");
            return (Criteria) this;
        }

        public Criteria andFscaleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FScale >=", value, "fscale");
            return (Criteria) this;
        }

        public Criteria andFscaleLessThan(BigDecimal value) {
            addCriterion("FScale <", value, "fscale");
            return (Criteria) this;
        }

        public Criteria andFscaleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FScale <=", value, "fscale");
            return (Criteria) this;
        }

        public Criteria andFscaleIn(List<BigDecimal> values) {
            addCriterion("FScale in", values, "fscale");
            return (Criteria) this;
        }

        public Criteria andFscaleNotIn(List<BigDecimal> values) {
            addCriterion("FScale not in", values, "fscale");
            return (Criteria) this;
        }

        public Criteria andFscaleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FScale between", value1, value2, "fscale");
            return (Criteria) this;
        }

        public Criteria andFscaleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FScale not between", value1, value2, "fscale");
            return (Criteria) this;
        }

        public Criteria andFstandardIsNull() {
            addCriterion("FStandard is null");
            return (Criteria) this;
        }

        public Criteria andFstandardIsNotNull() {
            addCriterion("FStandard is not null");
            return (Criteria) this;
        }

        public Criteria andFstandardEqualTo(Short value) {
            addCriterion("FStandard =", value, "fstandard");
            return (Criteria) this;
        }

        public Criteria andFstandardNotEqualTo(Short value) {
            addCriterion("FStandard <>", value, "fstandard");
            return (Criteria) this;
        }

        public Criteria andFstandardGreaterThan(Short value) {
            addCriterion("FStandard >", value, "fstandard");
            return (Criteria) this;
        }

        public Criteria andFstandardGreaterThanOrEqualTo(Short value) {
            addCriterion("FStandard >=", value, "fstandard");
            return (Criteria) this;
        }

        public Criteria andFstandardLessThan(Short value) {
            addCriterion("FStandard <", value, "fstandard");
            return (Criteria) this;
        }

        public Criteria andFstandardLessThanOrEqualTo(Short value) {
            addCriterion("FStandard <=", value, "fstandard");
            return (Criteria) this;
        }

        public Criteria andFstandardIn(List<Short> values) {
            addCriterion("FStandard in", values, "fstandard");
            return (Criteria) this;
        }

        public Criteria andFstandardNotIn(List<Short> values) {
            addCriterion("FStandard not in", values, "fstandard");
            return (Criteria) this;
        }

        public Criteria andFstandardBetween(Short value1, Short value2) {
            addCriterion("FStandard between", value1, value2, "fstandard");
            return (Criteria) this;
        }

        public Criteria andFstandardNotBetween(Short value1, Short value2) {
            addCriterion("FStandard not between", value1, value2, "fstandard");
            return (Criteria) this;
        }

        public Criteria andFcontrolIsNull() {
            addCriterion("FControl is null");
            return (Criteria) this;
        }

        public Criteria andFcontrolIsNotNull() {
            addCriterion("FControl is not null");
            return (Criteria) this;
        }

        public Criteria andFcontrolEqualTo(Short value) {
            addCriterion("FControl =", value, "fcontrol");
            return (Criteria) this;
        }

        public Criteria andFcontrolNotEqualTo(Short value) {
            addCriterion("FControl <>", value, "fcontrol");
            return (Criteria) this;
        }

        public Criteria andFcontrolGreaterThan(Short value) {
            addCriterion("FControl >", value, "fcontrol");
            return (Criteria) this;
        }

        public Criteria andFcontrolGreaterThanOrEqualTo(Short value) {
            addCriterion("FControl >=", value, "fcontrol");
            return (Criteria) this;
        }

        public Criteria andFcontrolLessThan(Short value) {
            addCriterion("FControl <", value, "fcontrol");
            return (Criteria) this;
        }

        public Criteria andFcontrolLessThanOrEqualTo(Short value) {
            addCriterion("FControl <=", value, "fcontrol");
            return (Criteria) this;
        }

        public Criteria andFcontrolIn(List<Short> values) {
            addCriterion("FControl in", values, "fcontrol");
            return (Criteria) this;
        }

        public Criteria andFcontrolNotIn(List<Short> values) {
            addCriterion("FControl not in", values, "fcontrol");
            return (Criteria) this;
        }

        public Criteria andFcontrolBetween(Short value1, Short value2) {
            addCriterion("FControl between", value1, value2, "fcontrol");
            return (Criteria) this;
        }

        public Criteria andFcontrolNotBetween(Short value1, Short value2) {
            addCriterion("FControl not between", value1, value2, "fcontrol");
            return (Criteria) this;
        }

        public Criteria andFsystemtypeIsNull() {
            addCriterion("FSystemType is null");
            return (Criteria) this;
        }

        public Criteria andFsystemtypeIsNotNull() {
            addCriterion("FSystemType is not null");
            return (Criteria) this;
        }

        public Criteria andFsystemtypeEqualTo(Integer value) {
            addCriterion("FSystemType =", value, "fsystemtype");
            return (Criteria) this;
        }

        public Criteria andFsystemtypeNotEqualTo(Integer value) {
            addCriterion("FSystemType <>", value, "fsystemtype");
            return (Criteria) this;
        }

        public Criteria andFsystemtypeGreaterThan(Integer value) {
            addCriterion("FSystemType >", value, "fsystemtype");
            return (Criteria) this;
        }

        public Criteria andFsystemtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("FSystemType >=", value, "fsystemtype");
            return (Criteria) this;
        }

        public Criteria andFsystemtypeLessThan(Integer value) {
            addCriterion("FSystemType <", value, "fsystemtype");
            return (Criteria) this;
        }

        public Criteria andFsystemtypeLessThanOrEqualTo(Integer value) {
            addCriterion("FSystemType <=", value, "fsystemtype");
            return (Criteria) this;
        }

        public Criteria andFsystemtypeIn(List<Integer> values) {
            addCriterion("FSystemType in", values, "fsystemtype");
            return (Criteria) this;
        }

        public Criteria andFsystemtypeNotIn(List<Integer> values) {
            addCriterion("FSystemType not in", values, "fsystemtype");
            return (Criteria) this;
        }

        public Criteria andFsystemtypeBetween(Integer value1, Integer value2) {
            addCriterion("FSystemType between", value1, value2, "fsystemtype");
            return (Criteria) this;
        }

        public Criteria andFsystemtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("FSystemType not between", value1, value2, "fsystemtype");
            return (Criteria) this;
        }

        public Criteria andUuidIsNull() {
            addCriterion("UUID is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("UUID is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("UUID =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("UUID <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("UUID >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("UUID >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("UUID <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("UUID <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("UUID like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("UUID not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("UUID in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("UUID not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("UUID between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("UUID not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andFnameenIsNull() {
            addCriterion("FNameEN is null");
            return (Criteria) this;
        }

        public Criteria andFnameenIsNotNull() {
            addCriterion("FNameEN is not null");
            return (Criteria) this;
        }

        public Criteria andFnameenEqualTo(String value) {
            addCriterion("FNameEN =", value, "fnameen");
            return (Criteria) this;
        }

        public Criteria andFnameenNotEqualTo(String value) {
            addCriterion("FNameEN <>", value, "fnameen");
            return (Criteria) this;
        }

        public Criteria andFnameenGreaterThan(String value) {
            addCriterion("FNameEN >", value, "fnameen");
            return (Criteria) this;
        }

        public Criteria andFnameenGreaterThanOrEqualTo(String value) {
            addCriterion("FNameEN >=", value, "fnameen");
            return (Criteria) this;
        }

        public Criteria andFnameenLessThan(String value) {
            addCriterion("FNameEN <", value, "fnameen");
            return (Criteria) this;
        }

        public Criteria andFnameenLessThanOrEqualTo(String value) {
            addCriterion("FNameEN <=", value, "fnameen");
            return (Criteria) this;
        }

        public Criteria andFnameenLike(String value) {
            addCriterion("FNameEN like", value, "fnameen");
            return (Criteria) this;
        }

        public Criteria andFnameenNotLike(String value) {
            addCriterion("FNameEN not like", value, "fnameen");
            return (Criteria) this;
        }

        public Criteria andFnameenIn(List<String> values) {
            addCriterion("FNameEN in", values, "fnameen");
            return (Criteria) this;
        }

        public Criteria andFnameenNotIn(List<String> values) {
            addCriterion("FNameEN not in", values, "fnameen");
            return (Criteria) this;
        }

        public Criteria andFnameenBetween(String value1, String value2) {
            addCriterion("FNameEN between", value1, value2, "fnameen");
            return (Criteria) this;
        }

        public Criteria andFnameenNotBetween(String value1, String value2) {
            addCriterion("FNameEN not between", value1, value2, "fnameen");
            return (Criteria) this;
        }

        public Criteria andFnameenpluIsNull() {
            addCriterion("FNameEnPlu is null");
            return (Criteria) this;
        }

        public Criteria andFnameenpluIsNotNull() {
            addCriterion("FNameEnPlu is not null");
            return (Criteria) this;
        }

        public Criteria andFnameenpluEqualTo(String value) {
            addCriterion("FNameEnPlu =", value, "fnameenplu");
            return (Criteria) this;
        }

        public Criteria andFnameenpluNotEqualTo(String value) {
            addCriterion("FNameEnPlu <>", value, "fnameenplu");
            return (Criteria) this;
        }

        public Criteria andFnameenpluGreaterThan(String value) {
            addCriterion("FNameEnPlu >", value, "fnameenplu");
            return (Criteria) this;
        }

        public Criteria andFnameenpluGreaterThanOrEqualTo(String value) {
            addCriterion("FNameEnPlu >=", value, "fnameenplu");
            return (Criteria) this;
        }

        public Criteria andFnameenpluLessThan(String value) {
            addCriterion("FNameEnPlu <", value, "fnameenplu");
            return (Criteria) this;
        }

        public Criteria andFnameenpluLessThanOrEqualTo(String value) {
            addCriterion("FNameEnPlu <=", value, "fnameenplu");
            return (Criteria) this;
        }

        public Criteria andFnameenpluLike(String value) {
            addCriterion("FNameEnPlu like", value, "fnameenplu");
            return (Criteria) this;
        }

        public Criteria andFnameenpluNotLike(String value) {
            addCriterion("FNameEnPlu not like", value, "fnameenplu");
            return (Criteria) this;
        }

        public Criteria andFnameenpluIn(List<String> values) {
            addCriterion("FNameEnPlu in", values, "fnameenplu");
            return (Criteria) this;
        }

        public Criteria andFnameenpluNotIn(List<String> values) {
            addCriterion("FNameEnPlu not in", values, "fnameenplu");
            return (Criteria) this;
        }

        public Criteria andFnameenpluBetween(String value1, String value2) {
            addCriterion("FNameEnPlu between", value1, value2, "fnameenplu");
            return (Criteria) this;
        }

        public Criteria andFnameenpluNotBetween(String value1, String value2) {
            addCriterion("FNameEnPlu not between", value1, value2, "fnameenplu");
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