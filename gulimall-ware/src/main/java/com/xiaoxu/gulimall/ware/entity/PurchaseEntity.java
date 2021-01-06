package com.xiaoxu.gulimall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ?ɹ???Ϣ
 * 
 * @author xiaoxu
 * @email xiaoxu@gmail.com
 * @date 2021-01-06 20:48:43
 */
@Data
@TableName("wms_purchase")
public class PurchaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ?ɹ???id
	 */
	@TableId
	private Long id;
	/**
	 * ?ɹ???id
	 */
	private Long assigneeId;
	/**
	 * ?ɹ?????
	 */
	private String assigneeName;
	/**
	 * ??ϵ??ʽ
	 */
	private String phone;
	/**
	 * ???ȼ?
	 */
	private Integer priority;
	/**
	 * ״̬
	 */
	private Integer status;
	/**
	 * ?ֿ?id
	 */
	private Long wareId;
	/**
	 * ?ܽ
	 */
	private BigDecimal amount;
	/**
	 * ???????
	 */
	private Date createTime;
	/**
	 * ???????
	 */
	private Date updateTime;

}
