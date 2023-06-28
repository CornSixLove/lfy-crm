package com.neusoftwjj.crm.workbench.clue.mapper;

import com.neusoftwjj.crm.workbench.clue.model.ClueActivityRelation;

import java.util.List;

public interface ClueActivityRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_clue_activity_relation
     *
     * @mbggenerated Wed Sep 14 23:41:43 CST 2022
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_clue_activity_relation
     *
     * @mbggenerated Wed Sep 14 23:41:43 CST 2022
     */
    int insert(ClueActivityRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_clue_activity_relation
     *
     * @mbggenerated Wed Sep 14 23:41:43 CST 2022
     */
    int insertSelective(ClueActivityRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_clue_activity_relation
     *
     * @mbggenerated Wed Sep 14 23:41:43 CST 2022
     */
    ClueActivityRelation selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_clue_activity_relation
     *
     * @mbggenerated Wed Sep 14 23:41:43 CST 2022
     */
    int updateByPrimaryKeySelective(ClueActivityRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_clue_activity_relation
     *
     * @mbggenerated Wed Sep 14 23:41:43 CST 2022
     */
    int updateByPrimaryKey(ClueActivityRelation record);
    /**
     *批量保存创建的线索和市场活动的关联关系
     */
    int insertClueActivityRelationByList(List<ClueActivityRelation> relationList);
    /**
     *删除线索和市场活动的关联关系
     */
    int deleteClueActivityRelationByClueActivityId(ClueActivityRelation relation);

    /**
     *根据clueId查询市场活动和线索的关联关系
     *
     */
    List<ClueActivityRelation> selectClueActivityRelationByClueId(String ClueId);

    /**
     * 根据clueId删除市场活动和线索的关联关系
     *
     */
    int deleteClueActivityRelationByClueId(String clueId);


}