package com.xiaoxu.gulimall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ?˿???Ϣ
 * 
 * @author xiaoxu
 * @email xiaoxu@gmail.com
 * @date 2021-01-06 20:23:06
 */
@Data
@TableName("oms_refund_info")
public class RefundInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ?˿??Ķ???
	 */
	private Long orderReturnId;
	/**
	 * ?˿??
	 */
	private BigDecimal refund;
	/**
	 * ?˿????ˮ?
	 */
	private String refundSn;
	/**
	 * ?˿?״̬
	 */
	private Integer refundStatus;
	/**
	 * ?˿?????[1-֧??????2-΢?ţ?3-??????4-???
	 */
	private Integer refundChannel;
	/**
	 * 
	 */
	private String refundContent;

}
