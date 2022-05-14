package com.app.ecotiya.domain.repository;

import org.apache.ibatis.annotations.Mapper;

import com.app.ecotiya.domain.entity.TSiteComment;

@Mapper
public interface TSiteCommentMapper {

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table t_site_comment
   * @mbg.generated
   */int deleteByPrimaryKey(Long commentId);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table t_site_comment
   * @mbg.generated
   */int insert(TSiteComment row);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table t_site_comment
   * @mbg.generated
   */int insertSelective(TSiteComment row);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table t_site_comment
   * @mbg.generated
   */TSiteComment selectByPrimaryKey(Long commentId);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table t_site_comment
   * @mbg.generated
   */int updateByPrimaryKeySelective(TSiteComment row);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table t_site_comment
   * @mbg.generated
   */int updateByPrimaryKeyWithBLOBs(TSiteComment row);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table t_site_comment
   * @mbg.generated
   */int updateByPrimaryKey(TSiteComment row);
}