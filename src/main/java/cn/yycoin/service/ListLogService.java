package cn.yycoin.service;



import java.util.List;

/**
 * @author SunQi
 * @Description:
 * @date Create in 2017/10/23 11:20
 */
public interface ListLogService {

    //根据手机号查询
    public List<String> findByPhone(String phone) throws Exception;

    //根据单号查询信息
    public List<String> findByNoId(String NoId) throws Exception;


}
