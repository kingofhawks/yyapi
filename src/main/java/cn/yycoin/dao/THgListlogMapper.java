package cn.yycoin.dao;

import cn.yycoin.entity.THgListlog;
import cn.yycoin.entity.THgListlogExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface THgListlogMapper {
    long countByExample(THgListlogExample example);

    int deleteByExample(THgListlogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(THgListlog record);

    int insertSelective(THgListlog record);

    List<THgListlog> selectByExample(THgListlogExample example);

    THgListlog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") THgListlog record, @Param("example") THgListlogExample example);

    int updateByExample(@Param("record") THgListlog record, @Param("example") THgListlogExample example);

    int updateByPrimaryKeySelective(THgListlog record);

    int updateByPrimaryKey(THgListlog record);

    //根据手机号查询单号、收货时间
    List<String> findBy(String phone);

    //根据单号查询信息
    List<String> findByNoId(String NoId);

    void updateListLogStatus(@Param("backid") String backid, @Param("status") String status);
}