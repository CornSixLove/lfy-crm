package com.neusoftwjj.crm.settings.model;

public class DicType {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_dic_type.code
     *
     * @mbggenerated Tue Nov 15 10:29:16 CST 2022
     */
    private String code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_dic_type.name
     *
     * @mbggenerated Tue Nov 15 10:29:16 CST 2022
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_dic_type.description
     *
     * @mbggenerated Tue Nov 15 10:29:16 CST 2022
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_dic_type.code
     *
     * @return the value of tbl_dic_type.code
     *
     * @mbggenerated Tue Nov 15 10:29:16 CST 2022
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_dic_type.code
     *
     * @param code the value for tbl_dic_type.code
     *
     * @mbggenerated Tue Nov 15 10:29:16 CST 2022
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_dic_type.name
     *
     * @return the value of tbl_dic_type.name
     *
     * @mbggenerated Tue Nov 15 10:29:16 CST 2022
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_dic_type.name
     *
     * @param name the value for tbl_dic_type.name
     *
     * @mbggenerated Tue Nov 15 10:29:16 CST 2022
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_dic_type.description
     *
     * @return the value of tbl_dic_type.description
     *
     * @mbggenerated Tue Nov 15 10:29:16 CST 2022
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_dic_type.description
     *
     * @param description the value for tbl_dic_type.description
     *
     * @mbggenerated Tue Nov 15 10:29:16 CST 2022
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}