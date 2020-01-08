package com.self.study_japanese.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemoryExample() {
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

        public Criteria andMemoryIdIsNull() {
            addCriterion("memory_id is null");
            return (Criteria) this;
        }

        public Criteria andMemoryIdIsNotNull() {
            addCriterion("memory_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemoryIdEqualTo(Integer value) {
            addCriterion("memory_id =", value, "memoryId");
            return (Criteria) this;
        }

        public Criteria andMemoryIdNotEqualTo(Integer value) {
            addCriterion("memory_id <>", value, "memoryId");
            return (Criteria) this;
        }

        public Criteria andMemoryIdGreaterThan(Integer value) {
            addCriterion("memory_id >", value, "memoryId");
            return (Criteria) this;
        }

        public Criteria andMemoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("memory_id >=", value, "memoryId");
            return (Criteria) this;
        }

        public Criteria andMemoryIdLessThan(Integer value) {
            addCriterion("memory_id <", value, "memoryId");
            return (Criteria) this;
        }

        public Criteria andMemoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("memory_id <=", value, "memoryId");
            return (Criteria) this;
        }

        public Criteria andMemoryIdIn(List<Integer> values) {
            addCriterion("memory_id in", values, "memoryId");
            return (Criteria) this;
        }

        public Criteria andMemoryIdNotIn(List<Integer> values) {
            addCriterion("memory_id not in", values, "memoryId");
            return (Criteria) this;
        }

        public Criteria andMemoryIdBetween(Integer value1, Integer value2) {
            addCriterion("memory_id between", value1, value2, "memoryId");
            return (Criteria) this;
        }

        public Criteria andMemoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("memory_id not between", value1, value2, "memoryId");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andMemoryDateIsNull() {
            addCriterion("memory_date is null");
            return (Criteria) this;
        }

        public Criteria andMemoryDateIsNotNull() {
            addCriterion("memory_date is not null");
            return (Criteria) this;
        }

        public Criteria andMemoryDateEqualTo(Date value) {
            addCriterion("memory_date =", value, "memoryDate");
            return (Criteria) this;
        }

        public Criteria andMemoryDateNotEqualTo(Date value) {
            addCriterion("memory_date <>", value, "memoryDate");
            return (Criteria) this;
        }

        public Criteria andMemoryDateGreaterThan(Date value) {
            addCriterion("memory_date >", value, "memoryDate");
            return (Criteria) this;
        }

        public Criteria andMemoryDateGreaterThanOrEqualTo(Date value) {
            addCriterion("memory_date >=", value, "memoryDate");
            return (Criteria) this;
        }

        public Criteria andMemoryDateLessThan(Date value) {
            addCriterion("memory_date <", value, "memoryDate");
            return (Criteria) this;
        }

        public Criteria andMemoryDateLessThanOrEqualTo(Date value) {
            addCriterion("memory_date <=", value, "memoryDate");
            return (Criteria) this;
        }

        public Criteria andMemoryDateIn(List<Date> values) {
            addCriterion("memory_date in", values, "memoryDate");
            return (Criteria) this;
        }

        public Criteria andMemoryDateNotIn(List<Date> values) {
            addCriterion("memory_date not in", values, "memoryDate");
            return (Criteria) this;
        }

        public Criteria andMemoryDateBetween(Date value1, Date value2) {
            addCriterion("memory_date between", value1, value2, "memoryDate");
            return (Criteria) this;
        }

        public Criteria andMemoryDateNotBetween(Date value1, Date value2) {
            addCriterion("memory_date not between", value1, value2, "memoryDate");
            return (Criteria) this;
        }

        public Criteria andCorrectKanaIdIsNull() {
            addCriterion("correct_kana_id is null");
            return (Criteria) this;
        }

        public Criteria andCorrectKanaIdIsNotNull() {
            addCriterion("correct_kana_id is not null");
            return (Criteria) this;
        }

        public Criteria andCorrectKanaIdEqualTo(Integer value) {
            addCriterion("correct_kana_id =", value, "correctKanaId");
            return (Criteria) this;
        }

        public Criteria andCorrectKanaIdNotEqualTo(Integer value) {
            addCriterion("correct_kana_id <>", value, "correctKanaId");
            return (Criteria) this;
        }

        public Criteria andCorrectKanaIdGreaterThan(Integer value) {
            addCriterion("correct_kana_id >", value, "correctKanaId");
            return (Criteria) this;
        }

        public Criteria andCorrectKanaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("correct_kana_id >=", value, "correctKanaId");
            return (Criteria) this;
        }

        public Criteria andCorrectKanaIdLessThan(Integer value) {
            addCriterion("correct_kana_id <", value, "correctKanaId");
            return (Criteria) this;
        }

        public Criteria andCorrectKanaIdLessThanOrEqualTo(Integer value) {
            addCriterion("correct_kana_id <=", value, "correctKanaId");
            return (Criteria) this;
        }

        public Criteria andCorrectKanaIdIn(List<Integer> values) {
            addCriterion("correct_kana_id in", values, "correctKanaId");
            return (Criteria) this;
        }

        public Criteria andCorrectKanaIdNotIn(List<Integer> values) {
            addCriterion("correct_kana_id not in", values, "correctKanaId");
            return (Criteria) this;
        }

        public Criteria andCorrectKanaIdBetween(Integer value1, Integer value2) {
            addCriterion("correct_kana_id between", value1, value2, "correctKanaId");
            return (Criteria) this;
        }

        public Criteria andCorrectKanaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("correct_kana_id not between", value1, value2, "correctKanaId");
            return (Criteria) this;
        }

        public Criteria andMistakeKanaIdIsNull() {
            addCriterion("mistake_kana_id is null");
            return (Criteria) this;
        }

        public Criteria andMistakeKanaIdIsNotNull() {
            addCriterion("mistake_kana_id is not null");
            return (Criteria) this;
        }

        public Criteria andMistakeKanaIdEqualTo(Integer value) {
            addCriterion("mistake_kana_id =", value, "mistakeKanaId");
            return (Criteria) this;
        }

        public Criteria andMistakeKanaIdNotEqualTo(Integer value) {
            addCriterion("mistake_kana_id <>", value, "mistakeKanaId");
            return (Criteria) this;
        }

        public Criteria andMistakeKanaIdGreaterThan(Integer value) {
            addCriterion("mistake_kana_id >", value, "mistakeKanaId");
            return (Criteria) this;
        }

        public Criteria andMistakeKanaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mistake_kana_id >=", value, "mistakeKanaId");
            return (Criteria) this;
        }

        public Criteria andMistakeKanaIdLessThan(Integer value) {
            addCriterion("mistake_kana_id <", value, "mistakeKanaId");
            return (Criteria) this;
        }

        public Criteria andMistakeKanaIdLessThanOrEqualTo(Integer value) {
            addCriterion("mistake_kana_id <=", value, "mistakeKanaId");
            return (Criteria) this;
        }

        public Criteria andMistakeKanaIdIn(List<Integer> values) {
            addCriterion("mistake_kana_id in", values, "mistakeKanaId");
            return (Criteria) this;
        }

        public Criteria andMistakeKanaIdNotIn(List<Integer> values) {
            addCriterion("mistake_kana_id not in", values, "mistakeKanaId");
            return (Criteria) this;
        }

        public Criteria andMistakeKanaIdBetween(Integer value1, Integer value2) {
            addCriterion("mistake_kana_id between", value1, value2, "mistakeKanaId");
            return (Criteria) this;
        }

        public Criteria andMistakeKanaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mistake_kana_id not between", value1, value2, "mistakeKanaId");
            return (Criteria) this;
        }

        public Criteria andObfuscatedPronunciationIsNull() {
            addCriterion("obfuscated_pronunciation is null");
            return (Criteria) this;
        }

        public Criteria andObfuscatedPronunciationIsNotNull() {
            addCriterion("obfuscated_pronunciation is not null");
            return (Criteria) this;
        }

        public Criteria andObfuscatedPronunciationEqualTo(String value) {
            addCriterion("obfuscated_pronunciation =", value, "obfuscatedPronunciation");
            return (Criteria) this;
        }

        public Criteria andObfuscatedPronunciationNotEqualTo(String value) {
            addCriterion("obfuscated_pronunciation <>", value, "obfuscatedPronunciation");
            return (Criteria) this;
        }

        public Criteria andObfuscatedPronunciationGreaterThan(String value) {
            addCriterion("obfuscated_pronunciation >", value, "obfuscatedPronunciation");
            return (Criteria) this;
        }

        public Criteria andObfuscatedPronunciationGreaterThanOrEqualTo(String value) {
            addCriterion("obfuscated_pronunciation >=", value, "obfuscatedPronunciation");
            return (Criteria) this;
        }

        public Criteria andObfuscatedPronunciationLessThan(String value) {
            addCriterion("obfuscated_pronunciation <", value, "obfuscatedPronunciation");
            return (Criteria) this;
        }

        public Criteria andObfuscatedPronunciationLessThanOrEqualTo(String value) {
            addCriterion("obfuscated_pronunciation <=", value, "obfuscatedPronunciation");
            return (Criteria) this;
        }

        public Criteria andObfuscatedPronunciationLike(String value) {
            addCriterion("obfuscated_pronunciation like", value, "obfuscatedPronunciation");
            return (Criteria) this;
        }

        public Criteria andObfuscatedPronunciationNotLike(String value) {
            addCriterion("obfuscated_pronunciation not like", value, "obfuscatedPronunciation");
            return (Criteria) this;
        }

        public Criteria andObfuscatedPronunciationIn(List<String> values) {
            addCriterion("obfuscated_pronunciation in", values, "obfuscatedPronunciation");
            return (Criteria) this;
        }

        public Criteria andObfuscatedPronunciationNotIn(List<String> values) {
            addCriterion("obfuscated_pronunciation not in", values, "obfuscatedPronunciation");
            return (Criteria) this;
        }

        public Criteria andObfuscatedPronunciationBetween(String value1, String value2) {
            addCriterion("obfuscated_pronunciation between", value1, value2, "obfuscatedPronunciation");
            return (Criteria) this;
        }

        public Criteria andObfuscatedPronunciationNotBetween(String value1, String value2) {
            addCriterion("obfuscated_pronunciation not between", value1, value2, "obfuscatedPronunciation");
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