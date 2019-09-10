package io.renren.business.news.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.renren.business.news.entity.AppNewsEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2019-07-17 13:01:31
 */
@Mapper
public interface AppNewsDao extends BaseMapper<AppNewsEntity> {
	
}
