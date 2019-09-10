package io.renren.business.news.controller;

import java.util.Arrays;
import java.util.Map;

import io.renren.business.news.entity.AppNewsEntity;
import io.renren.business.news.service.AppNewsService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2019-07-17 13:01:31
 */
@RestController
@RequestMapping("/business/appnews")
public class AppNewsController {
    @Autowired
    private AppNewsService appNewsService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("business:appnews:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = appNewsService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("business:appnews:info")
    public R info(@PathVariable("id") Integer id){
		AppNewsEntity appNews = appNewsService.getById(id);

        return R.ok().put("appNews", appNews);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("business:appnews:save")
    public R save(@RequestBody AppNewsEntity appNews){
		appNewsService.save(appNews);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("business:appnews:update")
    public R update(@RequestBody AppNewsEntity appNews){
		appNewsService.updateById(appNews);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("business:appnews:delete")
    public R delete(@RequestBody Integer[] ids){
		appNewsService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
