package com.fh.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ICInventoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ICInventoryExample() {
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

        public Criteria andFstockidIsNull() {
            addCriterion("FStockID is null");
            return (Criteria) this;
        }

        public Criteria andFstockidIsNotNull() {
            addCriterion("FStockID is not null");
            return (Criteria) this;
        }

        public Criteria andFstockidEqualTo(Integer value) {
            addCriterion("FStockID =", value, "fstockid");
            return (Criteria) this;
        }

        public Criteria andFstockidNotEqualTo(Integer value) {
            addCriterion("FStockID <>", value, "fstockid");
            return (Criteria) this;
        }

        public Criteria andFstockidGreaterThan(Integer value) {
            addCriterion("FStockID >", value, "fstockid");
            return (Criteria) this;
        }

        public Criteria andFstockidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FStockID >=", value, "fstockid");
            return (Criteria) this;
        }

        public Criteria andFstockidLessThan(Integer value) {
            addCriterion("FStockID <", value, "fstockid");
            return (Criteria) this;
        }

        public Criteria andFstockidLessThanOrEqualTo(Integer value) {
            addCriterion("FStockID <=", value, "fstockid");
            return (Criteria) this;
        }

        public Criteria andFstockidIn(List<Integer> values) {
            addCriterion("FStockID in", values, "fstockid");
            return (Criteria) this;
        }

        public Criteria andFstockidNotIn(List<Integer> values) {
            addCriterion("FStockID not in", values, "fstockid");
            return (Criteria) this;
        }

        public Criteria andFstockidBetween(Integer value1, Integer value2) {
            addCriterion("FStockID between", value1, value2, "fstockid");
            return (Criteria) this;
        }

        public Criteria andFstockidNotBetween(Integer value1, Integer value2) {
            addCriterion("FStockID not between", value1, value2, "fstockid");
            return (Criteria) this;
        }

        public Criteria andFauxpropidIsNull() {
            addCriterion("FAuxPropID is null");
            return (Criteria) this;
        }

        public Criteria andFauxpropidIsNotNull() {
            addCriterion("FAuxPropID is not null");
            return (Criteria) this;
        }

        public Criteria andFauxpropidEqualTo(Integer value) {
            addCriterion("FAuxPropID =", value, "fauxpropid");
            return (Criteria) this;
        }

        public Criteria andFauxpropidNotEqualTo(Integer value) {
            addCriterion("FAuxPropID <>", value, "fauxpropid");
            return (Criteria) this;
        }

        public Criteria andFauxpropidGreaterThan(Integer value) {
            addCriterion("FAuxPropID >", value, "fauxpropid");
            return (Criteria) this;
        }

        public Criteria andFauxpropidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FAuxPropID >=", value, "fauxpropid");
            return (Criteria) this;
        }

        public Criteria andFauxpropidLessThan(Integer value) {
            addCriterion("FAuxPropID <", value, "fauxpropid");
            return (Criteria) this;
        }

        public Criteria andFauxpropidLessThanOrEqualTo(Integer value) {
            addCriterion("FAuxPropID <=", value, "fauxpropid");
            return (Criteria) this;
        }

        public Criteria andFauxpropidIn(List<Integer> values) {
            addCriterion("FAuxPropID in", values, "fauxpropid");
            return (Criteria) this;
        }

        public Criteria andFauxpropidNotIn(List<Integer> values) {
            addCriterion("FAuxPropID not in", values, "fauxpropid");
            return (Criteria) this;
        }

        public Criteria andFauxpropidBetween(Integer value1, Integer value2) {
            addCriterion("FAuxPropID between", value1, value2, "fauxpropid");
            return (Criteria) this;
        }

        public Criteria andFauxpropidNotBetween(Integer value1, Integer value2) {
            addCriterion("FAuxPropID not between", value1, value2, "fauxpropid");
            return (Criteria) this;
        }

        public Criteria andFbatchnoIsNull() {
            addCriterion("FBatchNo is null");
            return (Criteria) this;
        }

        public Criteria andFbatchnoIsNotNull() {
            addCriterion("FBatchNo is not null");
            return (Criteria) this;
        }

        public Criteria andFbatchnoEqualTo(String value) {
            addCriterion("FBatchNo =", value, "fbatchno");
            return (Criteria) this;
        }

        public Criteria andFbatchnoNotEqualTo(String value) {
            addCriterion("FBatchNo <>", value, "fbatchno");
            return (Criteria) this;
        }

        public Criteria andFbatchnoGreaterThan(String value) {
            addCriterion("FBatchNo >", value, "fbatchno");
            return (Criteria) this;
        }

        public Criteria andFbatchnoGreaterThanOrEqualTo(String value) {
            addCriterion("FBatchNo >=", value, "fbatchno");
            return (Criteria) this;
        }

        public Criteria andFbatchnoLessThan(String value) {
            addCriterion("FBatchNo <", value, "fbatchno");
            return (Criteria) this;
        }

        public Criteria andFbatchnoLessThanOrEqualTo(String value) {
            addCriterion("FBatchNo <=", value, "fbatchno");
            return (Criteria) this;
        }

        public Criteria andFbatchnoLike(String value) {
            addCriterion("FBatchNo like", value, "fbatchno");
            return (Criteria) this;
        }

        public Criteria andFbatchnoNotLike(String value) {
            addCriterion("FBatchNo not like", value, "fbatchno");
            return (Criteria) this;
        }

        public Criteria andFbatchnoIn(List<String> values) {
            addCriterion("FBatchNo in", values, "fbatchno");
            return (Criteria) this;
        }

        public Criteria andFbatchnoNotIn(List<String> values) {
            addCriterion("FBatchNo not in", values, "fbatchno");
            return (Criteria) this;
        }

        public Criteria andFbatchnoBetween(String value1, String value2) {
            addCriterion("FBatchNo between", value1, value2, "fbatchno");
            return (Criteria) this;
        }

        public Criteria andFbatchnoNotBetween(String value1, String value2) {
            addCriterion("FBatchNo not between", value1, value2, "fbatchno");
            return (Criteria) this;
        }

        public Criteria andFstockplaceidIsNull() {
            addCriterion("FStockPlaceID is null");
            return (Criteria) this;
        }

        public Criteria andFstockplaceidIsNotNull() {
            addCriterion("FStockPlaceID is not null");
            return (Criteria) this;
        }

        public Criteria andFstockplaceidEqualTo(Integer value) {
            addCriterion("FStockPlaceID =", value, "fstockplaceid");
            return (Criteria) this;
        }

        public Criteria andFstockplaceidNotEqualTo(Integer value) {
            addCriterion("FStockPlaceID <>", value, "fstockplaceid");
            return (Criteria) this;
        }

        public Criteria andFstockplaceidGreaterThan(Integer value) {
            addCriterion("FStockPlaceID >", value, "fstockplaceid");
            return (Criteria) this;
        }

        public Criteria andFstockplaceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FStockPlaceID >=", value, "fstockplaceid");
            return (Criteria) this;
        }

        public Criteria andFstockplaceidLessThan(Integer value) {
            addCriterion("FStockPlaceID <", value, "fstockplaceid");
            return (Criteria) this;
        }

        public Criteria andFstockplaceidLessThanOrEqualTo(Integer value) {
            addCriterion("FStockPlaceID <=", value, "fstockplaceid");
            return (Criteria) this;
        }

        public Criteria andFstockplaceidIn(List<Integer> values) {
            addCriterion("FStockPlaceID in", values, "fstockplaceid");
            return (Criteria) this;
        }

        public Criteria andFstockplaceidNotIn(List<Integer> values) {
            addCriterion("FStockPlaceID not in", values, "fstockplaceid");
            return (Criteria) this;
        }

        public Criteria andFstockplaceidBetween(Integer value1, Integer value2) {
            addCriterion("FStockPlaceID between", value1, value2, "fstockplaceid");
            return (Criteria) this;
        }

        public Criteria andFstockplaceidNotBetween(Integer value1, Integer value2) {
            addCriterion("FStockPlaceID not between", value1, value2, "fstockplaceid");
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

        public Criteria andFkfperiodEqualTo(Integer value) {
            addCriterion("FKFPeriod =", value, "fkfperiod");
            return (Criteria) this;
        }

        public Criteria andFkfperiodNotEqualTo(Integer value) {
            addCriterion("FKFPeriod <>", value, "fkfperiod");
            return (Criteria) this;
        }

        public Criteria andFkfperiodGreaterThan(Integer value) {
            addCriterion("FKFPeriod >", value, "fkfperiod");
            return (Criteria) this;
        }

        public Criteria andFkfperiodGreaterThanOrEqualTo(Integer value) {
            addCriterion("FKFPeriod >=", value, "fkfperiod");
            return (Criteria) this;
        }

        public Criteria andFkfperiodLessThan(Integer value) {
            addCriterion("FKFPeriod <", value, "fkfperiod");
            return (Criteria) this;
        }

        public Criteria andFkfperiodLessThanOrEqualTo(Integer value) {
            addCriterion("FKFPeriod <=", value, "fkfperiod");
            return (Criteria) this;
        }

        public Criteria andFkfperiodIn(List<Integer> values) {
            addCriterion("FKFPeriod in", values, "fkfperiod");
            return (Criteria) this;
        }

        public Criteria andFkfperiodNotIn(List<Integer> values) {
            addCriterion("FKFPeriod not in", values, "fkfperiod");
            return (Criteria) this;
        }

        public Criteria andFkfperiodBetween(Integer value1, Integer value2) {
            addCriterion("FKFPeriod between", value1, value2, "fkfperiod");
            return (Criteria) this;
        }

        public Criteria andFkfperiodNotBetween(Integer value1, Integer value2) {
            addCriterion("FKFPeriod not between", value1, value2, "fkfperiod");
            return (Criteria) this;
        }

        public Criteria andFkfdateIsNull() {
            addCriterion("FKFDate is null");
            return (Criteria) this;
        }

        public Criteria andFkfdateIsNotNull() {
            addCriterion("FKFDate is not null");
            return (Criteria) this;
        }

        public Criteria andFkfdateEqualTo(String value) {
            addCriterion("FKFDate =", value, "fkfdate");
            return (Criteria) this;
        }

        public Criteria andFkfdateNotEqualTo(String value) {
            addCriterion("FKFDate <>", value, "fkfdate");
            return (Criteria) this;
        }

        public Criteria andFkfdateGreaterThan(String value) {
            addCriterion("FKFDate >", value, "fkfdate");
            return (Criteria) this;
        }

        public Criteria andFkfdateGreaterThanOrEqualTo(String value) {
            addCriterion("FKFDate >=", value, "fkfdate");
            return (Criteria) this;
        }

        public Criteria andFkfdateLessThan(String value) {
            addCriterion("FKFDate <", value, "fkfdate");
            return (Criteria) this;
        }

        public Criteria andFkfdateLessThanOrEqualTo(String value) {
            addCriterion("FKFDate <=", value, "fkfdate");
            return (Criteria) this;
        }

        public Criteria andFkfdateLike(String value) {
            addCriterion("FKFDate like", value, "fkfdate");
            return (Criteria) this;
        }

        public Criteria andFkfdateNotLike(String value) {
            addCriterion("FKFDate not like", value, "fkfdate");
            return (Criteria) this;
        }

        public Criteria andFkfdateIn(List<String> values) {
            addCriterion("FKFDate in", values, "fkfdate");
            return (Criteria) this;
        }

        public Criteria andFkfdateNotIn(List<String> values) {
            addCriterion("FKFDate not in", values, "fkfdate");
            return (Criteria) this;
        }

        public Criteria andFkfdateBetween(String value1, String value2) {
            addCriterion("FKFDate between", value1, value2, "fkfdate");
            return (Criteria) this;
        }

        public Criteria andFkfdateNotBetween(String value1, String value2) {
            addCriterion("FKFDate not between", value1, value2, "fkfdate");
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

        public Criteria andFmtonoIsNull() {
            addCriterion("FMTONo is null");
            return (Criteria) this;
        }

        public Criteria andFmtonoIsNotNull() {
            addCriterion("FMTONo is not null");
            return (Criteria) this;
        }

        public Criteria andFmtonoEqualTo(String value) {
            addCriterion("FMTONo =", value, "fmtono");
            return (Criteria) this;
        }

        public Criteria andFmtonoNotEqualTo(String value) {
            addCriterion("FMTONo <>", value, "fmtono");
            return (Criteria) this;
        }

        public Criteria andFmtonoGreaterThan(String value) {
            addCriterion("FMTONo >", value, "fmtono");
            return (Criteria) this;
        }

        public Criteria andFmtonoGreaterThanOrEqualTo(String value) {
            addCriterion("FMTONo >=", value, "fmtono");
            return (Criteria) this;
        }

        public Criteria andFmtonoLessThan(String value) {
            addCriterion("FMTONo <", value, "fmtono");
            return (Criteria) this;
        }

        public Criteria andFmtonoLessThanOrEqualTo(String value) {
            addCriterion("FMTONo <=", value, "fmtono");
            return (Criteria) this;
        }

        public Criteria andFmtonoLike(String value) {
            addCriterion("FMTONo like", value, "fmtono");
            return (Criteria) this;
        }

        public Criteria andFmtonoNotLike(String value) {
            addCriterion("FMTONo not like", value, "fmtono");
            return (Criteria) this;
        }

        public Criteria andFmtonoIn(List<String> values) {
            addCriterion("FMTONo in", values, "fmtono");
            return (Criteria) this;
        }

        public Criteria andFmtonoNotIn(List<String> values) {
            addCriterion("FMTONo not in", values, "fmtono");
            return (Criteria) this;
        }

        public Criteria andFmtonoBetween(String value1, String value2) {
            addCriterion("FMTONo between", value1, value2, "fmtono");
            return (Criteria) this;
        }

        public Criteria andFmtonoNotBetween(String value1, String value2) {
            addCriterion("FMTONo not between", value1, value2, "fmtono");
            return (Criteria) this;
        }

        public Criteria andFqtyIsNull() {
            addCriterion("FQty is null");
            return (Criteria) this;
        }

        public Criteria andFqtyIsNotNull() {
            addCriterion("FQty is not null");
            return (Criteria) this;
        }

        public Criteria andFqtyEqualTo(BigDecimal value) {
            addCriterion("FQty =", value, "fqty");
            return (Criteria) this;
        }

        public Criteria andFqtyNotEqualTo(BigDecimal value) {
            addCriterion("FQty <>", value, "fqty");
            return (Criteria) this;
        }

        public Criteria andFqtyGreaterThan(BigDecimal value) {
            addCriterion("FQty >", value, "fqty");
            return (Criteria) this;
        }

        public Criteria andFqtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FQty >=", value, "fqty");
            return (Criteria) this;
        }

        public Criteria andFqtyLessThan(BigDecimal value) {
            addCriterion("FQty <", value, "fqty");
            return (Criteria) this;
        }

        public Criteria andFqtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FQty <=", value, "fqty");
            return (Criteria) this;
        }

        public Criteria andFqtyIn(List<BigDecimal> values) {
            addCriterion("FQty in", values, "fqty");
            return (Criteria) this;
        }

        public Criteria andFqtyNotIn(List<BigDecimal> values) {
            addCriterion("FQty not in", values, "fqty");
            return (Criteria) this;
        }

        public Criteria andFqtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FQty between", value1, value2, "fqty");
            return (Criteria) this;
        }

        public Criteria andFqtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FQty not between", value1, value2, "fqty");
            return (Criteria) this;
        }

        public Criteria andFbalIsNull() {
            addCriterion("FBal is null");
            return (Criteria) this;
        }

        public Criteria andFbalIsNotNull() {
            addCriterion("FBal is not null");
            return (Criteria) this;
        }

        public Criteria andFbalEqualTo(BigDecimal value) {
            addCriterion("FBal =", value, "fbal");
            return (Criteria) this;
        }

        public Criteria andFbalNotEqualTo(BigDecimal value) {
            addCriterion("FBal <>", value, "fbal");
            return (Criteria) this;
        }

        public Criteria andFbalGreaterThan(BigDecimal value) {
            addCriterion("FBal >", value, "fbal");
            return (Criteria) this;
        }

        public Criteria andFbalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FBal >=", value, "fbal");
            return (Criteria) this;
        }

        public Criteria andFbalLessThan(BigDecimal value) {
            addCriterion("FBal <", value, "fbal");
            return (Criteria) this;
        }

        public Criteria andFbalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FBal <=", value, "fbal");
            return (Criteria) this;
        }

        public Criteria andFbalIn(List<BigDecimal> values) {
            addCriterion("FBal in", values, "fbal");
            return (Criteria) this;
        }

        public Criteria andFbalNotIn(List<BigDecimal> values) {
            addCriterion("FBal not in", values, "fbal");
            return (Criteria) this;
        }

        public Criteria andFbalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FBal between", value1, value2, "fbal");
            return (Criteria) this;
        }

        public Criteria andFbalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FBal not between", value1, value2, "fbal");
            return (Criteria) this;
        }

        public Criteria andFqtylockIsNull() {
            addCriterion("FQtyLock is null");
            return (Criteria) this;
        }

        public Criteria andFqtylockIsNotNull() {
            addCriterion("FQtyLock is not null");
            return (Criteria) this;
        }

        public Criteria andFqtylockEqualTo(BigDecimal value) {
            addCriterion("FQtyLock =", value, "fqtylock");
            return (Criteria) this;
        }

        public Criteria andFqtylockNotEqualTo(BigDecimal value) {
            addCriterion("FQtyLock <>", value, "fqtylock");
            return (Criteria) this;
        }

        public Criteria andFqtylockGreaterThan(BigDecimal value) {
            addCriterion("FQtyLock >", value, "fqtylock");
            return (Criteria) this;
        }

        public Criteria andFqtylockGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FQtyLock >=", value, "fqtylock");
            return (Criteria) this;
        }

        public Criteria andFqtylockLessThan(BigDecimal value) {
            addCriterion("FQtyLock <", value, "fqtylock");
            return (Criteria) this;
        }

        public Criteria andFqtylockLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FQtyLock <=", value, "fqtylock");
            return (Criteria) this;
        }

        public Criteria andFqtylockIn(List<BigDecimal> values) {
            addCriterion("FQtyLock in", values, "fqtylock");
            return (Criteria) this;
        }

        public Criteria andFqtylockNotIn(List<BigDecimal> values) {
            addCriterion("FQtyLock not in", values, "fqtylock");
            return (Criteria) this;
        }

        public Criteria andFqtylockBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FQtyLock between", value1, value2, "fqtylock");
            return (Criteria) this;
        }

        public Criteria andFqtylockNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FQtyLock not between", value1, value2, "fqtylock");
            return (Criteria) this;
        }

        public Criteria andFsecqtyIsNull() {
            addCriterion("FSecQty is null");
            return (Criteria) this;
        }

        public Criteria andFsecqtyIsNotNull() {
            addCriterion("FSecQty is not null");
            return (Criteria) this;
        }

        public Criteria andFsecqtyEqualTo(BigDecimal value) {
            addCriterion("FSecQty =", value, "fsecqty");
            return (Criteria) this;
        }

        public Criteria andFsecqtyNotEqualTo(BigDecimal value) {
            addCriterion("FSecQty <>", value, "fsecqty");
            return (Criteria) this;
        }

        public Criteria andFsecqtyGreaterThan(BigDecimal value) {
            addCriterion("FSecQty >", value, "fsecqty");
            return (Criteria) this;
        }

        public Criteria andFsecqtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FSecQty >=", value, "fsecqty");
            return (Criteria) this;
        }

        public Criteria andFsecqtyLessThan(BigDecimal value) {
            addCriterion("FSecQty <", value, "fsecqty");
            return (Criteria) this;
        }

        public Criteria andFsecqtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FSecQty <=", value, "fsecqty");
            return (Criteria) this;
        }

        public Criteria andFsecqtyIn(List<BigDecimal> values) {
            addCriterion("FSecQty in", values, "fsecqty");
            return (Criteria) this;
        }

        public Criteria andFsecqtyNotIn(List<BigDecimal> values) {
            addCriterion("FSecQty not in", values, "fsecqty");
            return (Criteria) this;
        }

        public Criteria andFsecqtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FSecQty between", value1, value2, "fsecqty");
            return (Criteria) this;
        }

        public Criteria andFsecqtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FSecQty not between", value1, value2, "fsecqty");
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