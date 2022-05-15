package com.app.ecotiya.domain.entity;

import com.app.ecotiya.domain.entity.base.AppBaseEntity;

public class MSiteCommentKinds extends AppBaseEntity {

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column m_site_comment_kinds.coment_kind_code
   * @mbg.generated
   */private String comentKindCode;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column m_site_comment_kinds.coment_kind_name
   * @mbg.generated
   */private String comentKindName;

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column m_site_comment_kinds.coment_kind_code
   * @return  the value of m_site_comment_kinds.coment_kind_code
   * @mbg.generated
   */public String getComentKindCode(){return comentKindCode;}

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column m_site_comment_kinds.coment_kind_code
   * @param comentKindCode  the value for m_site_comment_kinds.coment_kind_code
   * @mbg.generated
   */public void setComentKindCode(String comentKindCode){this.comentKindCode=comentKindCode == null?null:comentKindCode.trim();}

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column m_site_comment_kinds.coment_kind_name
   * @return  the value of m_site_comment_kinds.coment_kind_name
   * @mbg.generated
   */public String getComentKindName(){return comentKindName;}

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column m_site_comment_kinds.coment_kind_name
   * @param comentKindName  the value for m_site_comment_kinds.coment_kind_name
   * @mbg.generated
   */public void setComentKindName(String comentKindName){this.comentKindName=comentKindName == null?null:comentKindName.trim();}

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table m_site_comment_kinds
   * @mbg.generated
   */@Override public boolean equals(Object that){if (this == that){return true;}if (that == null){return false;}if (getClass() != that.getClass()){return false;}MSiteCommentKinds other=(MSiteCommentKinds)that;return (this.getComentKindCode() == null?other.getComentKindCode() == null:this.getComentKindCode().equals(other.getComentKindCode())) && (this.getComentKindName() == null?other.getComentKindName() == null:this.getComentKindName().equals(other.getComentKindName())) && (this.getCreatedAt() == null?other.getCreatedAt() == null:this.getCreatedAt().equals(other.getCreatedAt())) && (this.getUpdatedAt() == null?other.getUpdatedAt() == null:this.getUpdatedAt().equals(other.getUpdatedAt())) && (this.isDelflg() == other.isDelflg());}

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table m_site_comment_kinds
   * @mbg.generated
   */@Override public int hashCode(){final int prime=31;int result=1;result=prime * result + ((getComentKindCode() == null)?0:getComentKindCode().hashCode());result=prime * result + ((getComentKindName() == null)?0:getComentKindName().hashCode());result=prime * result + ((getCreatedAt() == null)?0:getCreatedAt().hashCode());result=prime * result + ((getUpdatedAt() == null)?0:getUpdatedAt().hashCode());result=prime * result + (isDelflg()?1231:1237);return result;}
}