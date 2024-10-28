package com.service.impl;

import com.utils.StringUtil;
import com.service.DictionaryService;
import com.utils.ClazzDiff;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import org.springframework.lang.Nullable;
import org.springframework.util.Assert;
import com.dao.XuejixinxiDao;
import com.entity.XuejixinxiEntity;
import com.service.XuejixinxiService;
import com.entity.view.XuejixinxiView;

/**
 * 学籍信息 服务实现类
 */
@Service("xuejixinxiService")
@Transactional
public class XuejixinxiServiceImpl extends ServiceImpl<XuejixinxiDao, XuejixinxiEntity> implements XuejixinxiService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        Page<XuejixinxiView> page =new Query<XuejixinxiView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
