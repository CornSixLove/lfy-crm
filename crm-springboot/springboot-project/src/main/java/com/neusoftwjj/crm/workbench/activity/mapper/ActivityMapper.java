package com.neusoftwjj.crm.workbench.activity.mapper;


import com.neusoftwjj.crm.workbench.activity.model.Activity;

import java.util.List;
import java.util.Map;

public interface ActivityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity
     *
     * @mbggenerated Wed Aug 31 21:53:49 CST 2022
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity
     *
     * @mbggenerated Wed Aug 31 21:53:49 CST 2022
     */
    int insert(Activity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity
     *
     * @mbggenerated Wed Aug 31 21:53:49 CST 2022
     */
    int insertSelective(Activity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity
     *
     * @mbggenerated Wed Aug 31 21:53:49 CST 2022
     */
    Activity selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity
     *
     * @mbggenerated Wed Aug 31 21:53:49 CST 2022
     */
    int updateByPrimaryKeySelective(Activity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity
     *
     * @mbggenerated Wed Aug 31 21:53:49 CST 2022
     */
    int updateByPrimaryKey(Activity record);

    /**
     * 添加市场活动信息
     */
    int insertActivity(Activity activity);

    /**
     * 根据条件分页查询市场活动的列表
     */
    List<Activity> selectActivityByConditionForPage(Map<String, Object> map);

    /**
     * 根据条件分页查询市场活动的总条数
     */
    int selectCountOfActivityByCondition(Map<String, Object> map);

    /**
     * 根据id批量删除市场活动
     */
    int deleteActivityByIds(String[] ids);

    /**
     * 根据id查询要修改的市场活动
     */
    Activity selectActivityById(String id);

    /**
     * 保存修改的市场活动
     */
    int updateActivity(Activity activity);

    /**
     * 查询所有的市场活动
     */
    List<Activity> selectAllActivitys();
    /**
     * 根据id查询要选择导出的市场活动
     */
    List<Activity> selectActivityByIdList(String[] ids);
    /**
     * 导入市场活动
     */
    int insertActivityByList(List<Activity> activityList);
    /**
     * 根据id查询市场活动的明细信息
     */
    Activity selectActivityForDetailById(String id);
    /**
     * 根据clueId查询相关联的市场活动信息
     */
    List<Activity> selectActivityForDetailByClueId(String clueId);
    /**
     *根据条件查询市场活动
     */
    List<Activity> selectActivityForDetailByNameClueId(Map<String, Object> map);
    /**
     * 根据ids查询有关关联线索的市场活动的信息
     */
    List<Activity> selectActivityForDetailByIds(String[] ids);
    /**
     * 根据转换map查询关联过的市场活动信息
     */
    List<Activity> selectActivityForConvertByNameClueId(Map<String ,Object> map);
}