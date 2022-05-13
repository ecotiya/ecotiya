package com.app.ecotiya.domain.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

public class TSkillExample {
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table t_skill
     * @mbg.generated
     */
    protected String orderByClause;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table t_skill
     * @mbg.generated
     */
    protected boolean distinct;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table t_skill
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_skill
     * @mbg.generated
     */
    public TSkillExample () {
        oredCriteria = new ArrayList<> ();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_skill
     * @mbg.generated
     */
    public void setOrderByClause (String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_skill
     * @mbg.generated
     */
    public String getOrderByClause () {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_skill
     * @mbg.generated
     */
    public void setDistinct (boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_skill
     * @mbg.generated
     */
    public boolean isDistinct () {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_skill
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria () {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_skill
     * @mbg.generated
     */
    public void or (Criteria criteria) {
        oredCriteria.add (criteria);
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_skill
     * @mbg.generated
     */
    public Criteria or () {
        Criteria criteria = createCriteriaInternal ();
        oredCriteria.add (criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_skill
     * @mbg.generated
     */
    public Criteria createCriteria () {
        Criteria criteria = createCriteriaInternal ();
        if (oredCriteria.size () == 0) {
            oredCriteria.add (criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_skill
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal () {
        Criteria criteria = new Criteria ();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_skill
     * @mbg.generated
     */
    public void clear () {
        oredCriteria.clear ();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table t_skill
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;
        
        protected GeneratedCriteria () {
            super ();
            criteria = new ArrayList<> ();
        }
        
        public boolean isValid () {
            return criteria.size () > 0;
        }
        
        public List<Criterion> getAllCriteria () {
            return criteria;
        }
        
        public List<Criterion> getCriteria () {
            return criteria;
        }
        
        protected void addCriterion (String condition) {
            if (condition == null) {
                throw new RuntimeException ("Value for condition cannot be null");
            }
            criteria.add (new Criterion (condition));
        }
        
        protected void addCriterion (String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException ("Value for " + property + " cannot be null");
            }
            criteria.add (new Criterion (condition, value));
        }
        
        protected void addCriterion (String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException ("Between values for " + property + " cannot be null");
            }
            criteria.add (new Criterion (condition, value1, value2));
        }
        
        public Criteria andSkillIdIsNull () {
            addCriterion ("skill_id is null");
            return (Criteria) this;
        }
        
        public Criteria andSkillIdIsNotNull () {
            addCriterion ("skill_id is not null");
            return (Criteria) this;
        }
        
        public Criteria andSkillIdEqualTo (Long value) {
            addCriterion ("skill_id =", value, "skillId");
            return (Criteria) this;
        }
        
        public Criteria andSkillIdNotEqualTo (Long value) {
            addCriterion ("skill_id <>", value, "skillId");
            return (Criteria) this;
        }
        
        public Criteria andSkillIdGreaterThan (Long value) {
            addCriterion ("skill_id >", value, "skillId");
            return (Criteria) this;
        }
        
        public Criteria andSkillIdGreaterThanOrEqualTo (Long value) {
            addCriterion ("skill_id >=", value, "skillId");
            return (Criteria) this;
        }
        
        public Criteria andSkillIdLessThan (Long value) {
            addCriterion ("skill_id <", value, "skillId");
            return (Criteria) this;
        }
        
        public Criteria andSkillIdLessThanOrEqualTo (Long value) {
            addCriterion ("skill_id <=", value, "skillId");
            return (Criteria) this;
        }
        
        public Criteria andSkillIdIn (List<Long> values) {
            addCriterion ("skill_id in", values, "skillId");
            return (Criteria) this;
        }
        
        public Criteria andSkillIdNotIn (List<Long> values) {
            addCriterion ("skill_id not in", values, "skillId");
            return (Criteria) this;
        }
        
        public Criteria andSkillIdBetween (Long value1, Long value2) {
            addCriterion ("skill_id between", value1, value2, "skillId");
            return (Criteria) this;
        }
        
        public Criteria andSkillIdNotBetween (Long value1, Long value2) {
            addCriterion ("skill_id not between", value1, value2, "skillId");
            return (Criteria) this;
        }
        
        public Criteria andSkillFieldIdIsNull () {
            addCriterion ("skill_field_id is null");
            return (Criteria) this;
        }
        
        public Criteria andSkillFieldIdIsNotNull () {
            addCriterion ("skill_field_id is not null");
            return (Criteria) this;
        }
        
        public Criteria andSkillFieldIdEqualTo (Integer value) {
            addCriterion ("skill_field_id =", value, "skillFieldId");
            return (Criteria) this;
        }
        
        public Criteria andSkillFieldIdNotEqualTo (Integer value) {
            addCriterion ("skill_field_id <>", value, "skillFieldId");
            return (Criteria) this;
        }
        
        public Criteria andSkillFieldIdGreaterThan (Integer value) {
            addCriterion ("skill_field_id >", value, "skillFieldId");
            return (Criteria) this;
        }
        
        public Criteria andSkillFieldIdGreaterThanOrEqualTo (Integer value) {
            addCriterion ("skill_field_id >=", value, "skillFieldId");
            return (Criteria) this;
        }
        
        public Criteria andSkillFieldIdLessThan (Integer value) {
            addCriterion ("skill_field_id <", value, "skillFieldId");
            return (Criteria) this;
        }
        
        public Criteria andSkillFieldIdLessThanOrEqualTo (Integer value) {
            addCriterion ("skill_field_id <=", value, "skillFieldId");
            return (Criteria) this;
        }
        
        public Criteria andSkillFieldIdIn (List<Integer> values) {
            addCriterion ("skill_field_id in", values, "skillFieldId");
            return (Criteria) this;
        }
        
        public Criteria andSkillFieldIdNotIn (List<Integer> values) {
            addCriterion ("skill_field_id not in", values, "skillFieldId");
            return (Criteria) this;
        }
        
        public Criteria andSkillFieldIdBetween (Integer value1, Integer value2) {
            addCriterion ("skill_field_id between", value1, value2, "skillFieldId");
            return (Criteria) this;
        }
        
        public Criteria andSkillFieldIdNotBetween (Integer value1, Integer value2) {
            addCriterion ("skill_field_id not between", value1, value2, "skillFieldId");
            return (Criteria) this;
        }
        
        public Criteria andSkillDivisionIdIsNull () {
            addCriterion ("skill_division_id is null");
            return (Criteria) this;
        }
        
        public Criteria andSkillDivisionIdIsNotNull () {
            addCriterion ("skill_division_id is not null");
            return (Criteria) this;
        }
        
        public Criteria andSkillDivisionIdEqualTo (Integer value) {
            addCriterion ("skill_division_id =", value, "skillDivisionId");
            return (Criteria) this;
        }
        
        public Criteria andSkillDivisionIdNotEqualTo (Integer value) {
            addCriterion ("skill_division_id <>", value, "skillDivisionId");
            return (Criteria) this;
        }
        
        public Criteria andSkillDivisionIdGreaterThan (Integer value) {
            addCriterion ("skill_division_id >", value, "skillDivisionId");
            return (Criteria) this;
        }
        
        public Criteria andSkillDivisionIdGreaterThanOrEqualTo (Integer value) {
            addCriterion ("skill_division_id >=", value, "skillDivisionId");
            return (Criteria) this;
        }
        
        public Criteria andSkillDivisionIdLessThan (Integer value) {
            addCriterion ("skill_division_id <", value, "skillDivisionId");
            return (Criteria) this;
        }
        
        public Criteria andSkillDivisionIdLessThanOrEqualTo (Integer value) {
            addCriterion ("skill_division_id <=", value, "skillDivisionId");
            return (Criteria) this;
        }
        
        public Criteria andSkillDivisionIdIn (List<Integer> values) {
            addCriterion ("skill_division_id in", values, "skillDivisionId");
            return (Criteria) this;
        }
        
        public Criteria andSkillDivisionIdNotIn (List<Integer> values) {
            addCriterion ("skill_division_id not in", values, "skillDivisionId");
            return (Criteria) this;
        }
        
        public Criteria andSkillDivisionIdBetween (Integer value1, Integer value2) {
            addCriterion ("skill_division_id between", value1, value2, "skillDivisionId");
            return (Criteria) this;
        }
        
        public Criteria andSkillDivisionIdNotBetween (Integer value1, Integer value2) {
            addCriterion ("skill_division_id not between", value1, value2, "skillDivisionId");
            return (Criteria) this;
        }
        
        public Criteria andExperienceYmIsNull () {
            addCriterion ("experience_ym is null");
            return (Criteria) this;
        }
        
        public Criteria andExperienceYmIsNotNull () {
            addCriterion ("experience_ym is not null");
            return (Criteria) this;
        }
        
        public Criteria andExperienceYmEqualTo (BigDecimal value) {
            addCriterion ("experience_ym =", value, "experienceYm");
            return (Criteria) this;
        }
        
        public Criteria andExperienceYmNotEqualTo (BigDecimal value) {
            addCriterion ("experience_ym <>", value, "experienceYm");
            return (Criteria) this;
        }
        
        public Criteria andExperienceYmGreaterThan (BigDecimal value) {
            addCriterion ("experience_ym >", value, "experienceYm");
            return (Criteria) this;
        }
        
        public Criteria andExperienceYmGreaterThanOrEqualTo (BigDecimal value) {
            addCriterion ("experience_ym >=", value, "experienceYm");
            return (Criteria) this;
        }
        
        public Criteria andExperienceYmLessThan (BigDecimal value) {
            addCriterion ("experience_ym <", value, "experienceYm");
            return (Criteria) this;
        }
        
        public Criteria andExperienceYmLessThanOrEqualTo (BigDecimal value) {
            addCriterion ("experience_ym <=", value, "experienceYm");
            return (Criteria) this;
        }
        
        public Criteria andExperienceYmIn (List<BigDecimal> values) {
            addCriterion ("experience_ym in", values, "experienceYm");
            return (Criteria) this;
        }
        
        public Criteria andExperienceYmNotIn (List<BigDecimal> values) {
            addCriterion ("experience_ym not in", values, "experienceYm");
            return (Criteria) this;
        }
        
        public Criteria andExperienceYmBetween (BigDecimal value1, BigDecimal value2) {
            addCriterion ("experience_ym between", value1, value2, "experienceYm");
            return (Criteria) this;
        }
        
        public Criteria andExperienceYmNotBetween (BigDecimal value1, BigDecimal value2) {
            addCriterion ("experience_ym not between", value1, value2, "experienceYm");
            return (Criteria) this;
        }
        
        public Criteria andCreatedAtIsNull () {
            addCriterion ("created_at is null");
            return (Criteria) this;
        }
        
        public Criteria andCreatedAtIsNotNull () {
            addCriterion ("created_at is not null");
            return (Criteria) this;
        }
        
        public Criteria andCreatedAtEqualTo (LocalDateTime value) {
            addCriterion ("created_at =", value, "createdAt");
            return (Criteria) this;
        }
        
        public Criteria andCreatedAtNotEqualTo (LocalDateTime value) {
            addCriterion ("created_at <>", value, "createdAt");
            return (Criteria) this;
        }
        
        public Criteria andCreatedAtGreaterThan (LocalDateTime value) {
            addCriterion ("created_at >", value, "createdAt");
            return (Criteria) this;
        }
        
        public Criteria andCreatedAtGreaterThanOrEqualTo (LocalDateTime value) {
            addCriterion ("created_at >=", value, "createdAt");
            return (Criteria) this;
        }
        
        public Criteria andCreatedAtLessThan (LocalDateTime value) {
            addCriterion ("created_at <", value, "createdAt");
            return (Criteria) this;
        }
        
        public Criteria andCreatedAtLessThanOrEqualTo (LocalDateTime value) {
            addCriterion ("created_at <=", value, "createdAt");
            return (Criteria) this;
        }
        
        public Criteria andCreatedAtIn (List<LocalDateTime> values) {
            addCriterion ("created_at in", values, "createdAt");
            return (Criteria) this;
        }
        
        public Criteria andCreatedAtNotIn (List<LocalDateTime> values) {
            addCriterion ("created_at not in", values, "createdAt");
            return (Criteria) this;
        }
        
        public Criteria andCreatedAtBetween (LocalDateTime value1, LocalDateTime value2) {
            addCriterion ("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }
        
        public Criteria andCreatedAtNotBetween (LocalDateTime value1, LocalDateTime value2) {
            addCriterion ("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }
        
        public Criteria andUpdatedAtIsNull () {
            addCriterion ("updated_at is null");
            return (Criteria) this;
        }
        
        public Criteria andUpdatedAtIsNotNull () {
            addCriterion ("updated_at is not null");
            return (Criteria) this;
        }
        
        public Criteria andUpdatedAtEqualTo (LocalDateTime value) {
            addCriterion ("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }
        
        public Criteria andUpdatedAtNotEqualTo (LocalDateTime value) {
            addCriterion ("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }
        
        public Criteria andUpdatedAtGreaterThan (LocalDateTime value) {
            addCriterion ("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }
        
        public Criteria andUpdatedAtGreaterThanOrEqualTo (LocalDateTime value) {
            addCriterion ("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }
        
        public Criteria andUpdatedAtLessThan (LocalDateTime value) {
            addCriterion ("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }
        
        public Criteria andUpdatedAtLessThanOrEqualTo (LocalDateTime value) {
            addCriterion ("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }
        
        public Criteria andUpdatedAtIn (List<LocalDateTime> values) {
            addCriterion ("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }
        
        public Criteria andUpdatedAtNotIn (List<LocalDateTime> values) {
            addCriterion ("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }
        
        public Criteria andUpdatedAtBetween (LocalDateTime value1, LocalDateTime value2) {
            addCriterion ("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }
        
        public Criteria andUpdatedAtNotBetween (LocalDateTime value1, LocalDateTime value2) {
            addCriterion ("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table t_skill
     * @mbg.generated
     */
    public static class Criterion {
        private String condition;
        private Object value;
        private Object secondValue;
        private boolean noValue;
        private boolean singleValue;
        private boolean betweenValue;
        private boolean listValue;
        private String typeHandler;
        
        public String getCondition () {
            return condition;
        }
        
        public Object getValue () {
            return value;
        }
        
        public Object getSecondValue () {
            return secondValue;
        }
        
        public boolean isNoValue () {
            return noValue;
        }
        
        public boolean isSingleValue () {
            return singleValue;
        }
        
        public boolean isBetweenValue () {
            return betweenValue;
        }
        
        public boolean isListValue () {
            return listValue;
        }
        
        public String getTypeHandler () {
            return typeHandler;
        }
        
        protected Criterion (String condition) {
            super ();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }
        
        protected Criterion (String condition, Object value, String typeHandler) {
            super ();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }
        
        protected Criterion (String condition, Object value) {
            this (condition, value, null);
        }
        
        protected Criterion (String condition, Object value, Object secondValue, String typeHandler) {
            super ();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }
        
        protected Criterion (String condition, Object value, Object secondValue) {
            this (condition, value, secondValue, null);
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_skill
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}