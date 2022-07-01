package edu.neu.ecommerce.coupon.service;


import com.baomidou.mybatisplus.extension.service.IService;
import edu.neu.ecommerce.coupon.entity.CouponSpuRelationEntity;
import edu.neu.ecommerce.utils.PageUtils;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author WangY
 * @email 1178663139@qq.com
 * @date 2022-05-29 12:51:34
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

