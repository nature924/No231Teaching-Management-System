package com.dao;

import com.entity.QingjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.QingjiaView;

/**
 * 学生请假 Dao 接口
 *
 * @author 
 */
public interface QingjiaDao extends BaseMapper<QingjiaEntity> {

   List<QingjiaView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
