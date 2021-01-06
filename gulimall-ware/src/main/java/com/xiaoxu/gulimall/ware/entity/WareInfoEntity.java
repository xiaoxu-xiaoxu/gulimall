package com.xiaoxu.gulimall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ?ֿ???Ϣ
 * 
 * @author xiaoxu
 * @email xiaoxu@gmail.com
 * @date 2021-01-06 20:48:43
 */
@Data
@TableName("wms_ware_info")
public class WareInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ?ֿ???
	 */
	private String name;
	/**
	 * ?ֿ???ַ
	 */
	private String address;
	/**
	 * ???????
	 */
	private String areacode;

}
