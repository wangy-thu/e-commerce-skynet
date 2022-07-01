package edu.neu.ecommerce.coupon.service;


import com.baomidou.mybatisplus.extension.service.IService;
import edu.neu.ecommerce.coupon.entity.SeckillSkuNoticeEntity;
import edu.neu.ecommerce.utils.PageUtils;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author WangY
 * @email 1178663139@qq.com
 * @date 2022-05-29 12:51:34
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

