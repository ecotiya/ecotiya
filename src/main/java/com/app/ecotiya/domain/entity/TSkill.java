package com.app.ecotiya.domain.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.app.ecotiya.domain.entity.base.AppBaseEntity;

public class TSkill extends AppBaseEntity {

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column t_skill.skill_id
   * @mbg.generated
   */private Long skillId;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column t_skill.skill_field_id
   * @mbg.generated
   */private Integer skillFieldId;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column t_skill.skill_division_id
   * @mbg.generated
   */private Integer skillDivisionId;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column t_skill.experience_ym
   * @mbg.generated
   */private BigDecimal experienceYm;

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column t_skill.skill_id
   * @return  the value of t_skill.skill_id
   * @mbg.generated
   */public Long getSkillId(){return skillId;}

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column t_skill.skill_id
   * @param skillId  the value for t_skill.skill_id
   * @mbg.generated
   */public void setSkillId(Long skillId){this.skillId=skillId;}

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column t_skill.skill_field_id
   * @return  the value of t_skill.skill_field_id
   * @mbg.generated
   */public Integer getSkillFieldId(){return skillFieldId;}

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column t_skill.skill_field_id
   * @param skillFieldId  the value for t_skill.skill_field_id
   * @mbg.generated
   */public void setSkillFieldId(Integer skillFieldId){this.skillFieldId=skillFieldId;}

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column t_skill.skill_division_id
   * @return  the value of t_skill.skill_division_id
   * @mbg.generated
   */public Integer getSkillDivisionId(){return skillDivisionId;}

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column t_skill.skill_division_id
   * @param skillDivisionId  the value for t_skill.skill_division_id
   * @mbg.generated
   */public void setSkillDivisionId(Integer skillDivisionId){this.skillDivisionId=skillDivisionId;}

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column t_skill.experience_ym
   * @return  the value of t_skill.experience_ym
   * @mbg.generated
   */public BigDecimal getExperienceYm(){return experienceYm;}

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column t_skill.experience_ym
   * @param experienceYm  the value for t_skill.experience_ym
   * @mbg.generated
   */public void setExperienceYm(BigDecimal experienceYm){this.experienceYm=experienceYm;}

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table t_skill
   * @mbg.generated
   */@Override public boolean equals(Object that){if (this == that){return true;}if (that == null){return false;}if (getClass() != that.getClass()){return false;}TSkill other=(TSkill)that;return (this.getSkillId() == null?other.getSkillId() == null:this.getSkillId().equals(other.getSkillId())) && (this.getSkillFieldId() == null?other.getSkillFieldId() == null:this.getSkillFieldId().equals(other.getSkillFieldId())) && (this.getSkillDivisionId() == null?other.getSkillDivisionId() == null:this.getSkillDivisionId().equals(other.getSkillDivisionId())) && (this.getExperienceYm() == null?other.getExperienceYm() == null:this.getExperienceYm().equals(other.getExperienceYm())) && (this.getCreatedAt() == null?other.getCreatedAt() == null:this.getCreatedAt().equals(other.getCreatedAt())) && (this.getUpdatedAt() == null?other.getUpdatedAt() == null:this.getUpdatedAt().equals(other.getUpdatedAt()));}

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table t_skill
   * @mbg.generated
   */@Override public int hashCode(){final int prime=31;int result=1;result=prime * result + ((getSkillId() == null)?0:getSkillId().hashCode());result=prime * result + ((getSkillFieldId() == null)?0:getSkillFieldId().hashCode());result=prime * result + ((getSkillDivisionId() == null)?0:getSkillDivisionId().hashCode());result=prime * result + ((getExperienceYm() == null)?0:getExperienceYm().hashCode());result=prime * result + ((getCreatedAt() == null)?0:getCreatedAt().hashCode());result=prime * result + ((getUpdatedAt() == null)?0:getUpdatedAt().hashCode());return result;}
}