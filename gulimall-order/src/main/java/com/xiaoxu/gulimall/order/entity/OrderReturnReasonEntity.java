package com.xiaoxu.gulimall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ?˻?ԭ?
 * 
 * @author xiaoxu
 * @email xiaoxu@gmail.com
 * @date 2021-01-06 20:23:06
 */
@Data
@TableName("oms_order_return_reason")
public class OrderReturnReasonEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ?˻?ԭ?
	 */
	private String name;
	/**
	 * ???
	 */
	private Integer sort;
	/**
	 * ????״̬
	 */
	private Integer status;
	/**
	 * create_time
	 */
	private Date createTime;

}
