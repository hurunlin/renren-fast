package io.renren.business.news.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.business.news.entity.AppNewsEntity;
import io.renren.common.utils.PageUtils;

import java.util.Map;

/**
 * 
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2019-07-17 13:01:31
 */
public interface AppNewsService extends IService<AppNewsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

