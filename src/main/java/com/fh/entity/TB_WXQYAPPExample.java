package com.fh.entity;

import java.util.ArrayList;
import java.util.List;

public class TB_WXQYAPPExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TB_WXQYAPPExample() {
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

        public Criteria andWxqyappIdIsNull() {
            addCriterion("WXQYAPP_ID is null");
            return (Criteria) this;
        }

        public Criteria andWxqyappIdIsNotNull() {
            addCriterion("WXQYAPP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWxqyappIdEqualTo(String value) {
            addCriterion("WXQYAPP_ID =", value, "wxqyappId");
            return (Criteria) this;
        }

        public Criteria andWxqyappIdNotEqualTo(String value) {
            addCriterion("WXQYAPP_ID <>", value, "wxqyappId");
            return (Criteria) this;
        }

        public Criteria andWxqyappIdGreaterThan(String value) {
            addCriterion("WXQYAPP_ID >", value, "wxqyappId");
            return (Criteria) this;
        }

        public Criteria andWxqyappIdGreaterThanOrEqualTo(String value) {
            addCriterion("WXQYAPP_ID >=", value, "wxqyappId");
            return (Criteria) this;
        }

        public Criteria andWxqyappIdLessThan(String value) {
            addCriterion("WXQYAPP_ID <", value, "wxqyappId");
            return (Criteria) this;
        }

        public Criteria andWxqyappIdLessThanOrEqualTo(String value) {
            addCriterion("WXQYAPP_ID <=", value, "wxqyappId");
            return (Criteria) this;
        }

        public Criteria andWxqyappIdLike(String value) {
            addCriterion("WXQYAPP_ID like", value, "wxqyappId");
            return (Criteria) this;
        }

        public Criteria andWxqyappIdNotLike(String value) {
            addCriterion("WXQYAPP_ID not like", value, "wxqyappId");
            return (Criteria) this;
        }

        public Criteria andWxqyappIdIn(List<String> values) {
            addCriterion("WXQYAPP_ID in", values, "wxqyappId");
            return (Criteria) this;
        }

        public Criteria andWxqyappIdNotIn(List<String> values) {
            addCriterion("WXQYAPP_ID not in", values, "wxqyappId");
            return (Criteria) this;
        }

        public Criteria andWxqyappIdBetween(String value1, String value2) {
            addCriterion("WXQYAPP_ID between", value1, value2, "wxqyappId");
            return (Criteria) this;
        }

        public Criteria andWxqyappIdNotBetween(String value1, String value2) {
            addCriterion("WXQYAPP_ID not between", value1, value2, "wxqyappId");
            return (Criteria) this;
        }

        public Criteria andAppnameIsNull() {
            addCriterion("APPNAME is null");
            return (Criteria) this;
        }

        public Criteria andAppnameIsNotNull() {
            addCriterion("APPNAME is not null");
            return (Criteria) this;
        }

        public Criteria andAppnameEqualTo(String value) {
            addCriterion("APPNAME =", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameNotEqualTo(String value) {
            addCriterion("APPNAME <>", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameGreaterThan(String value) {
            addCriterion("APPNAME >", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameGreaterThanOrEqualTo(String value) {
            addCriterion("APPNAME >=", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameLessThan(String value) {
            addCriterion("APPNAME <", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameLessThanOrEqualTo(String value) {
            addCriterion("APPNAME <=", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameLike(String value) {
            addCriterion("APPNAME like", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameNotLike(String value) {
            addCriterion("APPNAME not like", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameIn(List<String> values) {
            addCriterion("APPNAME in", values, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameNotIn(List<String> values) {
            addCriterion("APPNAME not in", values, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameBetween(String value1, String value2) {
            addCriterion("APPNAME between", value1, value2, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameNotBetween(String value1, String value2) {
            addCriterion("APPNAME not between", value1, value2, "appname");
            return (Criteria) this;
        }

        public Criteria andAppsecretIsNull() {
            addCriterion("APPSECRET is null");
            return (Criteria) this;
        }

        public Criteria andAppsecretIsNotNull() {
            addCriterion("APPSECRET is not null");
            return (Criteria) this;
        }

        public Criteria andAppsecretEqualTo(String value) {
            addCriterion("APPSECRET =", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretNotEqualTo(String value) {
            addCriterion("APPSECRET <>", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretGreaterThan(String value) {
            addCriterion("APPSECRET >", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretGreaterThanOrEqualTo(String value) {
            addCriterion("APPSECRET >=", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretLessThan(String value) {
            addCriterion("APPSECRET <", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretLessThanOrEqualTo(String value) {
            addCriterion("APPSECRET <=", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretLike(String value) {
            addCriterion("APPSECRET like", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretNotLike(String value) {
            addCriterion("APPSECRET not like", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretIn(List<String> values) {
            addCriterion("APPSECRET in", values, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretNotIn(List<String> values) {
            addCriterion("APPSECRET not in", values, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretBetween(String value1, String value2) {
            addCriterion("APPSECRET between", value1, value2, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretNotBetween(String value1, String value2) {
            addCriterion("APPSECRET not between", value1, value2, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppagentidIsNull() {
            addCriterion("APPAGENTID is null");
            return (Criteria) this;
        }

        public Criteria andAppagentidIsNotNull() {
            addCriterion("APPAGENTID is not null");
            return (Criteria) this;
        }

        public Criteria andAppagentidEqualTo(String value) {
            addCriterion("APPAGENTID =", value, "appagentid");
            return (Criteria) this;
        }

        public Criteria andAppagentidNotEqualTo(String value) {
            addCriterion("APPAGENTID <>", value, "appagentid");
            return (Criteria) this;
        }

        public Criteria andAppagentidGreaterThan(String value) {
            addCriterion("APPAGENTID >", value, "appagentid");
            return (Criteria) this;
        }

        public Criteria andAppagentidGreaterThanOrEqualTo(String value) {
            addCriterion("APPAGENTID >=", value, "appagentid");
            return (Criteria) this;
        }

        public Criteria andAppagentidLessThan(String value) {
            addCriterion("APPAGENTID <", value, "appagentid");
            return (Criteria) this;
        }

        public Criteria andAppagentidLessThanOrEqualTo(String value) {
            addCriterion("APPAGENTID <=", value, "appagentid");
            return (Criteria) this;
        }

        public Criteria andAppagentidLike(String value) {
            addCriterion("APPAGENTID like", value, "appagentid");
            return (Criteria) this;
        }

        public Criteria andAppagentidNotLike(String value) {
            addCriterion("APPAGENTID not like", value, "appagentid");
            return (Criteria) this;
        }

        public Criteria andAppagentidIn(List<String> values) {
            addCriterion("APPAGENTID in", values, "appagentid");
            return (Criteria) this;
        }

        public Criteria andAppagentidNotIn(List<String> values) {
            addCriterion("APPAGENTID not in", values, "appagentid");
            return (Criteria) this;
        }

        public Criteria andAppagentidBetween(String value1, String value2) {
            addCriterion("APPAGENTID between", value1, value2, "appagentid");
            return (Criteria) this;
        }

        public Criteria andAppagentidNotBetween(String value1, String value2) {
            addCriterion("APPAGENTID not between", value1, value2, "appagentid");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(String value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(String value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(String value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(String value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLike(String value) {
            addCriterion("CREATETIME like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotLike(String value) {
            addCriterion("CREATETIME not like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<String> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<String> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(String value1, String value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(String value1, String value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UPDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UPDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(String value) {
            addCriterion("UPDATETIME =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(String value) {
            addCriterion("UPDATETIME <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(String value) {
            addCriterion("UPDATETIME >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATETIME >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(String value) {
            addCriterion("UPDATETIME <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(String value) {
            addCriterion("UPDATETIME <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLike(String value) {
            addCriterion("UPDATETIME like", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotLike(String value) {
            addCriterion("UPDATETIME not like", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<String> values) {
            addCriterion("UPDATETIME in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<String> values) {
            addCriterion("UPDATETIME not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(String value1, String value2) {
            addCriterion("UPDATETIME between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(String value1, String value2) {
            addCriterion("UPDATETIME not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andCreatemanIsNull() {
            addCriterion("CREATEMAN is null");
            return (Criteria) this;
        }

        public Criteria andCreatemanIsNotNull() {
            addCriterion("CREATEMAN is not null");
            return (Criteria) this;
        }

        public Criteria andCreatemanEqualTo(String value) {
            addCriterion("CREATEMAN =", value, "createman");
            return (Criteria) this;
        }

        public Criteria andCreatemanNotEqualTo(String value) {
            addCriterion("CREATEMAN <>", value, "createman");
            return (Criteria) this;
        }

        public Criteria andCreatemanGreaterThan(String value) {
            addCriterion("CREATEMAN >", value, "createman");
            return (Criteria) this;
        }

        public Criteria andCreatemanGreaterThanOrEqualTo(String value) {
            addCriterion("CREATEMAN >=", value, "createman");
            return (Criteria) this;
        }

        public Criteria andCreatemanLessThan(String value) {
            addCriterion("CREATEMAN <", value, "createman");
            return (Criteria) this;
        }

        public Criteria andCreatemanLessThanOrEqualTo(String value) {
            addCriterion("CREATEMAN <=", value, "createman");
            return (Criteria) this;
        }

        public Criteria andCreatemanLike(String value) {
            addCriterion("CREATEMAN like", value, "createman");
            return (Criteria) this;
        }

        public Criteria andCreatemanNotLike(String value) {
            addCriterion("CREATEMAN not like", value, "createman");
            return (Criteria) this;
        }

        public Criteria andCreatemanIn(List<String> values) {
            addCriterion("CREATEMAN in", values, "createman");
            return (Criteria) this;
        }

        public Criteria andCreatemanNotIn(List<String> values) {
            addCriterion("CREATEMAN not in", values, "createman");
            return (Criteria) this;
        }

        public Criteria andCreatemanBetween(String value1, String value2) {
            addCriterion("CREATEMAN between", value1, value2, "createman");
            return (Criteria) this;
        }

        public Criteria andCreatemanNotBetween(String value1, String value2) {
            addCriterion("CREATEMAN not between", value1, value2, "createman");
            return (Criteria) this;
        }

        public Criteria andAppurlIsNull() {
            addCriterion("APPURL is null");
            return (Criteria) this;
        }

        public Criteria andAppurlIsNotNull() {
            addCriterion("APPURL is not null");
            return (Criteria) this;
        }

        public Criteria andAppurlEqualTo(String value) {
            addCriterion("APPURL =", value, "appurl");
            return (Criteria) this;
        }

        public Criteria andAppurlNotEqualTo(String value) {
            addCriterion("APPURL <>", value, "appurl");
            return (Criteria) this;
        }

        public Criteria andAppurlGreaterThan(String value) {
            addCriterion("APPURL >", value, "appurl");
            return (Criteria) this;
        }

        public Criteria andAppurlGreaterThanOrEqualTo(String value) {
            addCriterion("APPURL >=", value, "appurl");
            return (Criteria) this;
        }

        public Criteria andAppurlLessThan(String value) {
            addCriterion("APPURL <", value, "appurl");
            return (Criteria) this;
        }

        public Criteria andAppurlLessThanOrEqualTo(String value) {
            addCriterion("APPURL <=", value, "appurl");
            return (Criteria) this;
        }

        public Criteria andAppurlLike(String value) {
            addCriterion("APPURL like", value, "appurl");
            return (Criteria) this;
        }

        public Criteria andAppurlNotLike(String value) {
            addCriterion("APPURL not like", value, "appurl");
            return (Criteria) this;
        }

        public Criteria andAppurlIn(List<String> values) {
            addCriterion("APPURL in", values, "appurl");
            return (Criteria) this;
        }

        public Criteria andAppurlNotIn(List<String> values) {
            addCriterion("APPURL not in", values, "appurl");
            return (Criteria) this;
        }

        public Criteria andAppurlBetween(String value1, String value2) {
            addCriterion("APPURL between", value1, value2, "appurl");
            return (Criteria) this;
        }

        public Criteria andAppurlNotBetween(String value1, String value2) {
            addCriterion("APPURL not between", value1, value2, "appurl");
            return (Criteria) this;
        }

        public Criteria andTokenIsNull() {
            addCriterion("TOKEN is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("TOKEN is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("TOKEN =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("TOKEN <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("TOKEN >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("TOKEN >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("TOKEN <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("TOKEN <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("TOKEN like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("TOKEN not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("TOKEN in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("TOKEN not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("TOKEN between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("TOKEN not between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andEncodingaeskeyIsNull() {
            addCriterion("ENCODINGAESKEY is null");
            return (Criteria) this;
        }

        public Criteria andEncodingaeskeyIsNotNull() {
            addCriterion("ENCODINGAESKEY is not null");
            return (Criteria) this;
        }

        public Criteria andEncodingaeskeyEqualTo(String value) {
            addCriterion("ENCODINGAESKEY =", value, "encodingaeskey");
            return (Criteria) this;
        }

        public Criteria andEncodingaeskeyNotEqualTo(String value) {
            addCriterion("ENCODINGAESKEY <>", value, "encodingaeskey");
            return (Criteria) this;
        }

        public Criteria andEncodingaeskeyGreaterThan(String value) {
            addCriterion("ENCODINGAESKEY >", value, "encodingaeskey");
            return (Criteria) this;
        }

        public Criteria andEncodingaeskeyGreaterThanOrEqualTo(String value) {
            addCriterion("ENCODINGAESKEY >=", value, "encodingaeskey");
            return (Criteria) this;
        }

        public Criteria andEncodingaeskeyLessThan(String value) {
            addCriterion("ENCODINGAESKEY <", value, "encodingaeskey");
            return (Criteria) this;
        }

        public Criteria andEncodingaeskeyLessThanOrEqualTo(String value) {
            addCriterion("ENCODINGAESKEY <=", value, "encodingaeskey");
            return (Criteria) this;
        }

        public Criteria andEncodingaeskeyLike(String value) {
            addCriterion("ENCODINGAESKEY like", value, "encodingaeskey");
            return (Criteria) this;
        }

        public Criteria andEncodingaeskeyNotLike(String value) {
            addCriterion("ENCODINGAESKEY not like", value, "encodingaeskey");
            return (Criteria) this;
        }

        public Criteria andEncodingaeskeyIn(List<String> values) {
            addCriterion("ENCODINGAESKEY in", values, "encodingaeskey");
            return (Criteria) this;
        }

        public Criteria andEncodingaeskeyNotIn(List<String> values) {
            addCriterion("ENCODINGAESKEY not in", values, "encodingaeskey");
            return (Criteria) this;
        }

        public Criteria andEncodingaeskeyBetween(String value1, String value2) {
            addCriterion("ENCODINGAESKEY between", value1, value2, "encodingaeskey");
            return (Criteria) this;
        }

        public Criteria andEncodingaeskeyNotBetween(String value1, String value2) {
            addCriterion("ENCODINGAESKEY not between", value1, value2, "encodingaeskey");
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