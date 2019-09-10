package io.renren.business.appimages.controller;

import java.util.Arrays;
import java.util.Map;

import io.renren.business.appimages.entity.AppImagesEntity;
import io.renren.business.appimages.service.AppImagesService;
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
 * @date 2019-07-10 21:25:11
 */
@RestController
@RequestMapping("/business/appimages")
public class AppImagesController {
    @Autowired
    private AppImagesService appImagesService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("appimages:appimages:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = appImagesService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{imageId}")
    @RequiresPermissions("appimages:appimages:info")
    public R info(@PathVariable("imageId") Integer imageId){
		AppImagesEntity appImages = appImagesService.getById(imageId);

        return R.ok().put("appImages", appImages);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("appimages:appimages:save")
    public R save(@RequestBody AppImagesEntity appImages){
		appImagesService.save(appImages);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("appimages:appimages:update")
    public R update(@RequestBody AppImagesEntity appImages){
		appImagesService.updateById(appImages);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("appimages:appimages:delete")
    public R delete(@RequestBody Integer[] imageIds){
		appImagesService.removeByIds(Arrays.asList(imageIds));

        return R.ok();
    }

}
