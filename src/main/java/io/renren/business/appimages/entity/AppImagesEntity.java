package io.renren.business.appimages.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2019-07-10 21:25:11
 */
@Data
@TableName("app_images")
public class AppImagesEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer imageId;
	/**
	 * 
	 */
	private String url;
	/**
	 * 
	 */
	private String message;
	/**
	 * 
	 */
	private String type;
	/**
	 * 
	 */
	private Date createTime;
	/**
	 * 
	 */
	private Date updateTime;

}
