package com.xiaoxu.gulimall.member.feign;

import com.xiaoxu.gulimall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("gulimall-coupon")
public interface CouponService {

    @RequestMapping("/coupon/coupon/member/coupons")
    R memberCoupon();
}
