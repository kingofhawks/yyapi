package cn.yycoin.service.impl;

import cn.yycoin.dao.THgListMapper;
import cn.yycoin.entity.THgList;
import cn.yycoin.service.ListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author SunQi
 * @Description:    回购发货信息接口
 * @date Create in 2017/10/19 13:50
 */
@Service
public class ListServiceImpl implements ListService {

    @Autowired
    private THgListMapper tHgListMapper;

    //添加发货信息
    @Override
    public Integer addList(THgList tHgList) throws Exception {
        return tHgListMapper.insert(tHgList);
    }


}
