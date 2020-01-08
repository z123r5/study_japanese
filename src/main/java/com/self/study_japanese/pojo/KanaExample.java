package com.self.study_japanese.pojo;

import java.util.ArrayList;
import java.util.List;

public class KanaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KanaExample() {
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

        public Criteria andKidIsNull() {
            addCriterion("kid is null");
            return (Criteria) this;
        }

        public Criteria andKidIsNotNull() {
            addCriterion("kid is not null");
            return (Criteria) this;
        }

        public Criteria andKidEqualTo(Integer value) {
            addCriterion("kid =", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidNotEqualTo(Integer value) {
            addCriterion("kid <>", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidGreaterThan(Integer value) {
            addCriterion("kid >", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidGreaterThanOrEqualTo(Integer value) {
            addCriterion("kid >=", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidLessThan(Integer value) {
            addCriterion("kid <", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidLessThanOrEqualTo(Integer value) {
            addCriterion("kid <=", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidIn(List<Integer> values) {
            addCriterion("kid in", values, "kid");
            return (Criteria) this;
        }

        public Criteria andKidNotIn(List<Integer> values) {
            addCriterion("kid not in", values, "kid");
            return (Criteria) this;
        }

        public Criteria andKidBetween(Integer value1, Integer value2) {
            addCriterion("kid between", value1, value2, "kid");
            return (Criteria) this;
        }

        public Criteria andKidNotBetween(Integer value1, Integer value2) {
            addCriterion("kid not between", value1, value2, "kid");
            return (Criteria) this;
        }

        public Criteria andKanaIsNull() {
            addCriterion("kana is null");
            return (Criteria) this;
        }

        public Criteria andKanaIsNotNull() {
            addCriterion("kana is not null");
            return (Criteria) this;
        }

        public Criteria andKanaEqualTo(String value) {
            addCriterion("kana =", value, "kana");
            return (Criteria) this;
        }

        public Criteria andKanaNotEqualTo(String value) {
            addCriterion("kana <>", value, "kana");
            return (Criteria) this;
        }

        public Criteria andKanaGreaterThan(String value) {
            addCriterion("kana >", value, "kana");
            return (Criteria) this;
        }

        public Criteria andKanaGreaterThanOrEqualTo(String value) {
            addCriterion("kana >=", value, "kana");
            return (Criteria) this;
        }

        public Criteria andKanaLessThan(String value) {
            addCriterion("kana <", value, "kana");
            return (Criteria) this;
        }

        public Criteria andKanaLessThanOrEqualTo(String value) {
            addCriterion("kana <=", value, "kana");
            return (Criteria) this;
        }

        public Criteria andKanaLike(String value) {
            addCriterion("kana like", value, "kana");
            return (Criteria) this;
        }

        public Criteria andKanaNotLike(String value) {
            addCriterion("kana not like", value, "kana");
            return (Criteria) this;
        }

        public Criteria andKanaIn(List<String> values) {
            addCriterion("kana in", values, "kana");
            return (Criteria) this;
        }

        public Criteria andKanaNotIn(List<String> values) {
            addCriterion("kana not in", values, "kana");
            return (Criteria) this;
        }

        public Criteria andKanaBetween(String value1, String value2) {
            addCriterion("kana between", value1, value2, "kana");
            return (Criteria) this;
        }

        public Criteria andKanaNotBetween(String value1, String value2) {
            addCriterion("kana not between", value1, value2, "kana");
            return (Criteria) this;
        }

        public Criteria andRomanIsNull() {
            addCriterion("roman is null");
            return (Criteria) this;
        }

        public Criteria andRomanIsNotNull() {
            addCriterion("roman is not null");
            return (Criteria) this;
        }

        public Criteria andRomanEqualTo(String value) {
            addCriterion("roman =", value, "roman");
            return (Criteria) this;
        }

        public Criteria andRomanNotEqualTo(String value) {
            addCriterion("roman <>", value, "roman");
            return (Criteria) this;
        }

        public Criteria andRomanGreaterThan(String value) {
            addCriterion("roman >", value, "roman");
            return (Criteria) this;
        }

        public Criteria andRomanGreaterThanOrEqualTo(String value) {
            addCriterion("roman >=", value, "roman");
            return (Criteria) this;
        }

        public Criteria andRomanLessThan(String value) {
            addCriterion("roman <", value, "roman");
            return (Criteria) this;
        }

        public Criteria andRomanLessThanOrEqualTo(String value) {
            addCriterion("roman <=", value, "roman");
            return (Criteria) this;
        }

        public Criteria andRomanLike(String value) {
            addCriterion("roman like", value, "roman");
            return (Criteria) this;
        }

        public Criteria andRomanNotLike(String value) {
            addCriterion("roman not like", value, "roman");
            return (Criteria) this;
        }

        public Criteria andRomanIn(List<String> values) {
            addCriterion("roman in", values, "roman");
            return (Criteria) this;
        }

        public Criteria andRomanNotIn(List<String> values) {
            addCriterion("roman not in", values, "roman");
            return (Criteria) this;
        }

        public Criteria andRomanBetween(String value1, String value2) {
            addCriterion("roman between", value1, value2, "roman");
            return (Criteria) this;
        }

        public Criteria andRomanNotBetween(String value1, String value2) {
            addCriterion("roman not between", value1, value2, "roman");
            return (Criteria) this;
        }

        public Criteria andKatakanaIsNull() {
            addCriterion("katakana is null");
            return (Criteria) this;
        }

        public Criteria andKatakanaIsNotNull() {
            addCriterion("katakana is not null");
            return (Criteria) this;
        }

        public Criteria andKatakanaEqualTo(String value) {
            addCriterion("katakana =", value, "katakana");
            return (Criteria) this;
        }

        public Criteria andKatakanaNotEqualTo(String value) {
            addCriterion("katakana <>", value, "katakana");
            return (Criteria) this;
        }

        public Criteria andKatakanaGreaterThan(String value) {
            addCriterion("katakana >", value, "katakana");
            return (Criteria) this;
        }

        public Criteria andKatakanaGreaterThanOrEqualTo(String value) {
            addCriterion("katakana >=", value, "katakana");
            return (Criteria) this;
        }

        public Criteria andKatakanaLessThan(String value) {
            addCriterion("katakana <", value, "katakana");
            return (Criteria) this;
        }

        public Criteria andKatakanaLessThanOrEqualTo(String value) {
            addCriterion("katakana <=", value, "katakana");
            return (Criteria) this;
        }

        public Criteria andKatakanaLike(String value) {
            addCriterion("katakana like", value, "katakana");
            return (Criteria) this;
        }

        public Criteria andKatakanaNotLike(String value) {
            addCriterion("katakana not like", value, "katakana");
            return (Criteria) this;
        }

        public Criteria andKatakanaIn(List<String> values) {
            addCriterion("katakana in", values, "katakana");
            return (Criteria) this;
        }

        public Criteria andKatakanaNotIn(List<String> values) {
            addCriterion("katakana not in", values, "katakana");
            return (Criteria) this;
        }

        public Criteria andKatakanaBetween(String value1, String value2) {
            addCriterion("katakana between", value1, value2, "katakana");
            return (Criteria) this;
        }

        public Criteria andKatakanaNotBetween(String value1, String value2) {
            addCriterion("katakana not between", value1, value2, "katakana");
            return (Criteria) this;
        }

        public Criteria andTipsIsNull() {
            addCriterion("tips is null");
            return (Criteria) this;
        }

        public Criteria andTipsIsNotNull() {
            addCriterion("tips is not null");
            return (Criteria) this;
        }

        public Criteria andTipsEqualTo(String value) {
            addCriterion("tips =", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsNotEqualTo(String value) {
            addCriterion("tips <>", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsGreaterThan(String value) {
            addCriterion("tips >", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsGreaterThanOrEqualTo(String value) {
            addCriterion("tips >=", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsLessThan(String value) {
            addCriterion("tips <", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsLessThanOrEqualTo(String value) {
            addCriterion("tips <=", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsLike(String value) {
            addCriterion("tips like", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsNotLike(String value) {
            addCriterion("tips not like", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsIn(List<String> values) {
            addCriterion("tips in", values, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsNotIn(List<String> values) {
            addCriterion("tips not in", values, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsBetween(String value1, String value2) {
            addCriterion("tips between", value1, value2, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsNotBetween(String value1, String value2) {
            addCriterion("tips not between", value1, value2, "tips");
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