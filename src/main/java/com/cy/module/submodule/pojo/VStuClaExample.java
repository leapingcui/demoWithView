package com.cy.module.submodule.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class VStuClaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VStuClaExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andStuIdIsNull() {
            addCriterion("stu_id is null");
            return (Criteria) this;
        }

        public Criteria andStuIdIsNotNull() {
            addCriterion("stu_id is not null");
            return (Criteria) this;
        }

        public Criteria andStuIdEqualTo(Integer value) {
            addCriterion("stu_id =", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotEqualTo(Integer value) {
            addCriterion("stu_id <>", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThan(Integer value) {
            addCriterion("stu_id >", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_id >=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThan(Integer value) {
            addCriterion("stu_id <", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThanOrEqualTo(Integer value) {
            addCriterion("stu_id <=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdIn(List<Integer> values) {
            addCriterion("stu_id in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotIn(List<Integer> values) {
            addCriterion("stu_id not in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdBetween(Integer value1, Integer value2) {
            addCriterion("stu_id between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_id not between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuPwdIsNull() {
            addCriterion("stu_pwd is null");
            return (Criteria) this;
        }

        public Criteria andStuPwdIsNotNull() {
            addCriterion("stu_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andStuPwdEqualTo(String value) {
            addCriterion("stu_pwd =", value, "stuPwd");
            return (Criteria) this;
        }

        public Criteria andStuPwdNotEqualTo(String value) {
            addCriterion("stu_pwd <>", value, "stuPwd");
            return (Criteria) this;
        }

        public Criteria andStuPwdGreaterThan(String value) {
            addCriterion("stu_pwd >", value, "stuPwd");
            return (Criteria) this;
        }

        public Criteria andStuPwdGreaterThanOrEqualTo(String value) {
            addCriterion("stu_pwd >=", value, "stuPwd");
            return (Criteria) this;
        }

        public Criteria andStuPwdLessThan(String value) {
            addCriterion("stu_pwd <", value, "stuPwd");
            return (Criteria) this;
        }

        public Criteria andStuPwdLessThanOrEqualTo(String value) {
            addCriterion("stu_pwd <=", value, "stuPwd");
            return (Criteria) this;
        }

        public Criteria andStuPwdLike(String value) {
            addCriterion("stu_pwd like", value, "stuPwd");
            return (Criteria) this;
        }

        public Criteria andStuPwdNotLike(String value) {
            addCriterion("stu_pwd not like", value, "stuPwd");
            return (Criteria) this;
        }

        public Criteria andStuPwdIn(List<String> values) {
            addCriterion("stu_pwd in", values, "stuPwd");
            return (Criteria) this;
        }

        public Criteria andStuPwdNotIn(List<String> values) {
            addCriterion("stu_pwd not in", values, "stuPwd");
            return (Criteria) this;
        }

        public Criteria andStuPwdBetween(String value1, String value2) {
            addCriterion("stu_pwd between", value1, value2, "stuPwd");
            return (Criteria) this;
        }

        public Criteria andStuPwdNotBetween(String value1, String value2) {
            addCriterion("stu_pwd not between", value1, value2, "stuPwd");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNull() {
            addCriterion("stu_name is null");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNotNull() {
            addCriterion("stu_name is not null");
            return (Criteria) this;
        }

        public Criteria andStuNameEqualTo(String value) {
            addCriterion("stu_name =", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotEqualTo(String value) {
            addCriterion("stu_name <>", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThan(String value) {
            addCriterion("stu_name >", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThanOrEqualTo(String value) {
            addCriterion("stu_name >=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThan(String value) {
            addCriterion("stu_name <", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThanOrEqualTo(String value) {
            addCriterion("stu_name <=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLike(String value) {
            addCriterion("stu_name like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotLike(String value) {
            addCriterion("stu_name not like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameIn(List<String> values) {
            addCriterion("stu_name in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotIn(List<String> values) {
            addCriterion("stu_name not in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameBetween(String value1, String value2) {
            addCriterion("stu_name between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotBetween(String value1, String value2) {
            addCriterion("stu_name not between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuPicIsNull() {
            addCriterion("stu_pic is null");
            return (Criteria) this;
        }

        public Criteria andStuPicIsNotNull() {
            addCriterion("stu_pic is not null");
            return (Criteria) this;
        }

        public Criteria andStuPicEqualTo(String value) {
            addCriterion("stu_pic =", value, "stuPic");
            return (Criteria) this;
        }

        public Criteria andStuPicNotEqualTo(String value) {
            addCriterion("stu_pic <>", value, "stuPic");
            return (Criteria) this;
        }

        public Criteria andStuPicGreaterThan(String value) {
            addCriterion("stu_pic >", value, "stuPic");
            return (Criteria) this;
        }

        public Criteria andStuPicGreaterThanOrEqualTo(String value) {
            addCriterion("stu_pic >=", value, "stuPic");
            return (Criteria) this;
        }

        public Criteria andStuPicLessThan(String value) {
            addCriterion("stu_pic <", value, "stuPic");
            return (Criteria) this;
        }

        public Criteria andStuPicLessThanOrEqualTo(String value) {
            addCriterion("stu_pic <=", value, "stuPic");
            return (Criteria) this;
        }

        public Criteria andStuPicLike(String value) {
            addCriterion("stu_pic like", value, "stuPic");
            return (Criteria) this;
        }

        public Criteria andStuPicNotLike(String value) {
            addCriterion("stu_pic not like", value, "stuPic");
            return (Criteria) this;
        }

        public Criteria andStuPicIn(List<String> values) {
            addCriterion("stu_pic in", values, "stuPic");
            return (Criteria) this;
        }

        public Criteria andStuPicNotIn(List<String> values) {
            addCriterion("stu_pic not in", values, "stuPic");
            return (Criteria) this;
        }

        public Criteria andStuPicBetween(String value1, String value2) {
            addCriterion("stu_pic between", value1, value2, "stuPic");
            return (Criteria) this;
        }

        public Criteria andStuPicNotBetween(String value1, String value2) {
            addCriterion("stu_pic not between", value1, value2, "stuPic");
            return (Criteria) this;
        }

        public Criteria andStuSexIsNull() {
            addCriterion("stu_sex is null");
            return (Criteria) this;
        }

        public Criteria andStuSexIsNotNull() {
            addCriterion("stu_sex is not null");
            return (Criteria) this;
        }

        public Criteria andStuSexEqualTo(String value) {
            addCriterion("stu_sex =", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotEqualTo(String value) {
            addCriterion("stu_sex <>", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexGreaterThan(String value) {
            addCriterion("stu_sex >", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexGreaterThanOrEqualTo(String value) {
            addCriterion("stu_sex >=", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLessThan(String value) {
            addCriterion("stu_sex <", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLessThanOrEqualTo(String value) {
            addCriterion("stu_sex <=", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLike(String value) {
            addCriterion("stu_sex like", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotLike(String value) {
            addCriterion("stu_sex not like", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexIn(List<String> values) {
            addCriterion("stu_sex in", values, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotIn(List<String> values) {
            addCriterion("stu_sex not in", values, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexBetween(String value1, String value2) {
            addCriterion("stu_sex between", value1, value2, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotBetween(String value1, String value2) {
            addCriterion("stu_sex not between", value1, value2, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuBirthIsNull() {
            addCriterion("stu_birth is null");
            return (Criteria) this;
        }

        public Criteria andStuBirthIsNotNull() {
            addCriterion("stu_birth is not null");
            return (Criteria) this;
        }

        public Criteria andStuBirthEqualTo(Date value) {
            addCriterionForJDBCDate("stu_birth =", value, "stuBirth");
            return (Criteria) this;
        }

        public Criteria andStuBirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("stu_birth <>", value, "stuBirth");
            return (Criteria) this;
        }

        public Criteria andStuBirthGreaterThan(Date value) {
            addCriterionForJDBCDate("stu_birth >", value, "stuBirth");
            return (Criteria) this;
        }

        public Criteria andStuBirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("stu_birth >=", value, "stuBirth");
            return (Criteria) this;
        }

        public Criteria andStuBirthLessThan(Date value) {
            addCriterionForJDBCDate("stu_birth <", value, "stuBirth");
            return (Criteria) this;
        }

        public Criteria andStuBirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("stu_birth <=", value, "stuBirth");
            return (Criteria) this;
        }

        public Criteria andStuBirthIn(List<Date> values) {
            addCriterionForJDBCDate("stu_birth in", values, "stuBirth");
            return (Criteria) this;
        }

        public Criteria andStuBirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("stu_birth not in", values, "stuBirth");
            return (Criteria) this;
        }

        public Criteria andStuBirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("stu_birth between", value1, value2, "stuBirth");
            return (Criteria) this;
        }

        public Criteria andStuBirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("stu_birth not between", value1, value2, "stuBirth");
            return (Criteria) this;
        }

        public Criteria andStuClaIdIsNull() {
            addCriterion("stu_cla_id is null");
            return (Criteria) this;
        }

        public Criteria andStuClaIdIsNotNull() {
            addCriterion("stu_cla_id is not null");
            return (Criteria) this;
        }

        public Criteria andStuClaIdEqualTo(String value) {
            addCriterion("stu_cla_id =", value, "stuClaId");
            return (Criteria) this;
        }

        public Criteria andStuClaIdNotEqualTo(String value) {
            addCriterion("stu_cla_id <>", value, "stuClaId");
            return (Criteria) this;
        }

        public Criteria andStuClaIdGreaterThan(String value) {
            addCriterion("stu_cla_id >", value, "stuClaId");
            return (Criteria) this;
        }

        public Criteria andStuClaIdGreaterThanOrEqualTo(String value) {
            addCriterion("stu_cla_id >=", value, "stuClaId");
            return (Criteria) this;
        }

        public Criteria andStuClaIdLessThan(String value) {
            addCriterion("stu_cla_id <", value, "stuClaId");
            return (Criteria) this;
        }

        public Criteria andStuClaIdLessThanOrEqualTo(String value) {
            addCriterion("stu_cla_id <=", value, "stuClaId");
            return (Criteria) this;
        }

        public Criteria andStuClaIdLike(String value) {
            addCriterion("stu_cla_id like", value, "stuClaId");
            return (Criteria) this;
        }

        public Criteria andStuClaIdNotLike(String value) {
            addCriterion("stu_cla_id not like", value, "stuClaId");
            return (Criteria) this;
        }

        public Criteria andStuClaIdIn(List<String> values) {
            addCriterion("stu_cla_id in", values, "stuClaId");
            return (Criteria) this;
        }

        public Criteria andStuClaIdNotIn(List<String> values) {
            addCriterion("stu_cla_id not in", values, "stuClaId");
            return (Criteria) this;
        }

        public Criteria andStuClaIdBetween(String value1, String value2) {
            addCriterion("stu_cla_id between", value1, value2, "stuClaId");
            return (Criteria) this;
        }

        public Criteria andStuClaIdNotBetween(String value1, String value2) {
            addCriterion("stu_cla_id not between", value1, value2, "stuClaId");
            return (Criteria) this;
        }

        public Criteria andClaNameIsNull() {
            addCriterion("cla_name is null");
            return (Criteria) this;
        }

        public Criteria andClaNameIsNotNull() {
            addCriterion("cla_name is not null");
            return (Criteria) this;
        }

        public Criteria andClaNameEqualTo(String value) {
            addCriterion("cla_name =", value, "claName");
            return (Criteria) this;
        }

        public Criteria andClaNameNotEqualTo(String value) {
            addCriterion("cla_name <>", value, "claName");
            return (Criteria) this;
        }

        public Criteria andClaNameGreaterThan(String value) {
            addCriterion("cla_name >", value, "claName");
            return (Criteria) this;
        }

        public Criteria andClaNameGreaterThanOrEqualTo(String value) {
            addCriterion("cla_name >=", value, "claName");
            return (Criteria) this;
        }

        public Criteria andClaNameLessThan(String value) {
            addCriterion("cla_name <", value, "claName");
            return (Criteria) this;
        }

        public Criteria andClaNameLessThanOrEqualTo(String value) {
            addCriterion("cla_name <=", value, "claName");
            return (Criteria) this;
        }

        public Criteria andClaNameLike(String value) {
            addCriterion("cla_name like", value, "claName");
            return (Criteria) this;
        }

        public Criteria andClaNameNotLike(String value) {
            addCriterion("cla_name not like", value, "claName");
            return (Criteria) this;
        }

        public Criteria andClaNameIn(List<String> values) {
            addCriterion("cla_name in", values, "claName");
            return (Criteria) this;
        }

        public Criteria andClaNameNotIn(List<String> values) {
            addCriterion("cla_name not in", values, "claName");
            return (Criteria) this;
        }

        public Criteria andClaNameBetween(String value1, String value2) {
            addCriterion("cla_name between", value1, value2, "claName");
            return (Criteria) this;
        }

        public Criteria andClaNameNotBetween(String value1, String value2) {
            addCriterion("cla_name not between", value1, value2, "claName");
            return (Criteria) this;
        }

        public Criteria andClaTotalNumIsNull() {
            addCriterion("cla_total_num is null");
            return (Criteria) this;
        }

        public Criteria andClaTotalNumIsNotNull() {
            addCriterion("cla_total_num is not null");
            return (Criteria) this;
        }

        public Criteria andClaTotalNumEqualTo(Integer value) {
            addCriterion("cla_total_num =", value, "claTotalNum");
            return (Criteria) this;
        }

        public Criteria andClaTotalNumNotEqualTo(Integer value) {
            addCriterion("cla_total_num <>", value, "claTotalNum");
            return (Criteria) this;
        }

        public Criteria andClaTotalNumGreaterThan(Integer value) {
            addCriterion("cla_total_num >", value, "claTotalNum");
            return (Criteria) this;
        }

        public Criteria andClaTotalNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("cla_total_num >=", value, "claTotalNum");
            return (Criteria) this;
        }

        public Criteria andClaTotalNumLessThan(Integer value) {
            addCriterion("cla_total_num <", value, "claTotalNum");
            return (Criteria) this;
        }

        public Criteria andClaTotalNumLessThanOrEqualTo(Integer value) {
            addCriterion("cla_total_num <=", value, "claTotalNum");
            return (Criteria) this;
        }

        public Criteria andClaTotalNumIn(List<Integer> values) {
            addCriterion("cla_total_num in", values, "claTotalNum");
            return (Criteria) this;
        }

        public Criteria andClaTotalNumNotIn(List<Integer> values) {
            addCriterion("cla_total_num not in", values, "claTotalNum");
            return (Criteria) this;
        }

        public Criteria andClaTotalNumBetween(Integer value1, Integer value2) {
            addCriterion("cla_total_num between", value1, value2, "claTotalNum");
            return (Criteria) this;
        }

        public Criteria andClaTotalNumNotBetween(Integer value1, Integer value2) {
            addCriterion("cla_total_num not between", value1, value2, "claTotalNum");
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