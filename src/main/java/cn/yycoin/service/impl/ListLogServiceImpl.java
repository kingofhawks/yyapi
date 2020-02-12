package cn.yycoin.service.impl;

import cn.yycoin.dao.THgListlogMapper;
import cn.yycoin.entity.THgListlog;
import cn.yycoin.service.ListLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author SunQi
 * @Description:
 * @date Create in 2017/10/23 11:20
 */
@Service
public class ListLogServiceImpl  implements ListLogService{

    @Autowired
    private THgListlogMapper tHgListlogMapper;

    //根据手机号查询
    @Override
    public List<String> findByPhone(String phone) throws Exception {
        return tHgListlogMapper.findBy(phone);
    }

    //根据单号查询信息
    @Override
    public List<String> findByNoId(String NoId) throws Exception {
        return tHgListlogMapper.findByNoId(NoId);
    }


    @Override
    public void updateListLogStatus(String backId, String status) throws Exception {
        tHgListlogMapper.updateListLogStatus(backId, status);
    }
}
