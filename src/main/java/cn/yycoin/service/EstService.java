package cn.yycoin.service;

import cn.yycoin.entity.THgEstimate;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author SunQi
 * @Description:
 * @date Create in 2017/10/18 14:00
 */
public interface EstService {

    //商品添加
    @Transactional
    public Integer addEst(THgEstimate est) throws Exception;
}
