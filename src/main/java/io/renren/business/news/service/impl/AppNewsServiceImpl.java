package io.renren.business.news.service.impl;

import io.renren.business.news.dao.AppNewsDao;
import io.renren.business.news.entity.AppNewsEntity;
import io.renren.business.news.service.AppNewsService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;



@Service("appNewsService")
public class AppNewsServiceImpl extends ServiceImpl<AppNewsDao, AppNewsEntity> implements AppNewsService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AppNewsEntity> page = this.page(
                new Query<AppNewsEntity>().getPage(params),
                new QueryWrapper<AppNewsEntity>()
        );

        return new PageUtils(page);
    }

}