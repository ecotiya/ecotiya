package com.app.ecotiya.domain.model;

import java.util.Date;

public class TCareer {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column t_career.career_id
     * @mbg.generated  Thu May 12 21:56:48 JST 2022
     */
    private Long careerId;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column t_career.datetime
     * @mbg.generated  Thu May 12 21:56:48 JST 2022
     */
    private Date datetime;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column t_career.title
     * @mbg.generated  Thu May 12 21:56:48 JST 2022
     */
    private String title;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column t_career.content
     * @mbg.generated  Thu May 12 21:56:48 JST 2022
     */
    private String content;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column t_career.created_at
     * @mbg.generated  Thu May 12 21:56:48 JST 2022
     */
    private Date createdAt;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column t_career.updated_at
     * @mbg.generated  Thu May 12 21:56:48 JST 2022
     */
    private Date updatedAt;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column t_career.career_id
     * @return  the value of t_career.career_id
     * @mbg.generated  Thu May 12 21:56:48 JST 2022
     */
    public Long getCareerId () {
        return careerId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column t_career.career_id
     * @param careerId  the value for t_career.career_id
     * @mbg.generated  Thu May 12 21:56:48 JST 2022
     */
    public void setCareerId (Long careerId) {
        this.careerId = careerId;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column t_career.datetime
     * @return  the value of t_career.datetime
     * @mbg.generated  Thu May 12 21:56:48 JST 2022
     */
    public Date getDatetime () {
        return datetime;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column t_career.datetime
     * @param datetime  the value for t_career.datetime
     * @mbg.generated  Thu May 12 21:56:48 JST 2022
     */
    public void setDatetime (Date datetime) {
        this.datetime = datetime;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column t_career.title
     * @return  the value of t_career.title
     * @mbg.generated  Thu May 12 21:56:48 JST 2022
     */
    public String getTitle () {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column t_career.title
     * @param title  the value for t_career.title
     * @mbg.generated  Thu May 12 21:56:48 JST 2022
     */
    public void setTitle (String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column t_career.content
     * @return  the value of t_career.content
     * @mbg.generated  Thu May 12 21:56:48 JST 2022
     */
    public String getContent () {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column t_career.content
     * @param content  the value for t_career.content
     * @mbg.generated  Thu May 12 21:56:48 JST 2022
     */
    public void setContent (String content) {
        this.content = content;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column t_career.created_at
     * @return  the value of t_career.created_at
     * @mbg.generated  Thu May 12 21:56:48 JST 2022
     */
    public Date getCreatedAt () {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column t_career.created_at
     * @param createdAt  the value for t_career.created_at
     * @mbg.generated  Thu May 12 21:56:48 JST 2022
     */
    public void setCreatedAt (Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column t_career.updated_at
     * @return  the value of t_career.updated_at
     * @mbg.generated  Thu May 12 21:56:48 JST 2022
     */
    public Date getUpdatedAt () {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column t_career.updated_at
     * @param updatedAt  the value for t_career.updated_at
     * @mbg.generated  Thu May 12 21:56:48 JST 2022
     */
    public void setUpdatedAt (Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_career
     * @mbg.generated  Thu May 12 21:56:48 JST 2022
     */
    @Override
    public boolean equals (Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass () != that.getClass ()) {
            return false;
        }
        TCareer other = (TCareer) that;
        return (this.getCareerId () == null ? other.getCareerId () == null
                : this.getCareerId ().equals (other.getCareerId ()))
                && (this.getDatetime () == null ? other.getDatetime () == null
                        : this.getDatetime ().equals (other.getDatetime ()))
                && (this.getTitle () == null ? other.getTitle () == null : this.getTitle ().equals (other.getTitle ()))
                && (this.getContent () == null ? other.getContent () == null
                        : this.getContent ().equals (other.getContent ()))
                && (this.getCreatedAt () == null ? other.getCreatedAt () == null
                        : this.getCreatedAt ().equals (other.getCreatedAt ()))
                && (this.getUpdatedAt () == null ? other.getUpdatedAt () == null
                        : this.getUpdatedAt ().equals (other.getUpdatedAt ()));
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_career
     * @mbg.generated  Thu May 12 21:56:48 JST 2022
     */
    @Override
    public int hashCode () {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCareerId () == null) ? 0 : getCareerId ().hashCode ());
        result = prime * result + ((getDatetime () == null) ? 0 : getDatetime ().hashCode ());
        result = prime * result + ((getTitle () == null) ? 0 : getTitle ().hashCode ());
        result = prime * result + ((getContent () == null) ? 0 : getContent ().hashCode ());
        result = prime * result + ((getCreatedAt () == null) ? 0 : getCreatedAt ().hashCode ());
        result = prime * result + ((getUpdatedAt () == null) ? 0 : getUpdatedAt ().hashCode ());
        return result;
    }
}