package cn.yycoin.service.impl;

import cn.yycoin.dao.THgEstimateMapper;
import cn.yycoin.entity.THgEstimate;
import cn.yycoin.service.EstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author SunQi
 * @Description: 商品信息添加接口
 * @date Create in 2017/10/18 14:01
 */
@Service
public class EstServiceImpl implements EstService{


    @Autowired
    private THgEstimateMapper tHgEstimateMapper;

    @Override
    public Integer addEst(THgEstimate est) throws Exception {
        return tHgEstimateMapper.insert(est);
    }
}
