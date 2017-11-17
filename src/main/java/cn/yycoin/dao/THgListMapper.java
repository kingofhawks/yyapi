package cn.yycoin.dao;

import cn.yycoin.entity.THgList;
import cn.yycoin.entity.THgListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface THgListMapper {
    long countByExample(THgListExample example);

    int deleteByExample(THgListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(THgList record);

    int insertSelective(THgList record);

    List<THgList> selectByExample(THgListExample example);

    THgList selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") THgList record, @Param("example") THgListExample example);

    int updateByExample(@Param("record") THgList record, @Param("example") THgListExample example);

    int updateByPrimaryKeySelective(THgList record);

    int updateByPrimaryKey(THgList record);
}