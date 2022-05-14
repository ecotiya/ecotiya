package com.app.ecotiya.domain.repository;

import org.apache.ibatis.annotations.Mapper;

import com.app.ecotiya.domain.entity.TSkill;

@Mapper
public interface TSkillMapper {

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table t_skill
   * @mbg.generated
   */int deleteByPrimaryKey(Long skillId);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table t_skill
   * @mbg.generated
   */int insert(TSkill row);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table t_skill
   * @mbg.generated
   */int insertSelective(TSkill row);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table t_skill
   * @mbg.generated
   */TSkill selectByPrimaryKey(Long skillId);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table t_skill
   * @mbg.generated
   */int updateByPrimaryKeySelective(TSkill row);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table t_skill
   * @mbg.generated
   */int updateByPrimaryKey(TSkill row);
}