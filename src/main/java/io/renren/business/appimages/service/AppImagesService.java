package io.renren.business.appimages.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.business.appimages.entity.AppImagesEntity;
import io.renren.common.utils.PageUtils;

import java.util.Map;

/**
 * 
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2019-07-10 21:25:11
 */
public interface AppImagesService extends IService<AppImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

