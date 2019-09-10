package io.renren.business.appimages.service.impl;

import io.renren.business.appimages.dao.AppImagesDao;
import io.renren.business.appimages.entity.AppImagesEntity;
import io.renren.business.appimages.service.AppImagesService;
import org.springframework.stereotype.Service;

import java.util.Map;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;


@Service("appImagesService")
public class AppImagesServiceImpl extends ServiceImpl<AppImagesDao, AppImagesEntity> implements AppImagesService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AppImagesEntity> page = this.page(
                new Query<AppImagesEntity>().getPage(params),
                new QueryWrapper<AppImagesEntity>()
        );

        return new PageUtils(page);
    }
}