package com.dao;

import com.entity.XuejixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XuejixinxiView;

/**
 * 学籍信息 Dao 接口
 *
 * @author 
 */
public interface XuejixinxiDao extends BaseMapper<XuejixinxiEntity> {

   List<XuejixinxiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
