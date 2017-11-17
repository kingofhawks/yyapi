package cn.yycoin.mapper;

import cn.yycoin.entity.THgListlog;
import cn.yycoin.entity.THgListlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

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


}