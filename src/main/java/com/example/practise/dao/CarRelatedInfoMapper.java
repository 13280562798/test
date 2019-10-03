package com.example.practise.dao;

import com.example.practise.entity.CarRelatedInfo;
import com.example.practise.entity.CarRelatedInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRelatedInfoMapper {
    int countByExample(CarRelatedInfoExample example);

    int deleteByExample(CarRelatedInfoExample example);

    int deleteByPrimaryKey(String checkCarNumber);

    int insert(CarRelatedInfo record);

    int insertSelective(CarRelatedInfo record);

    List<CarRelatedInfo> selectByExample(CarRelatedInfoExample example);

    CarRelatedInfo selectByPrimaryKey(String checkCarNumber);

    int updateByExampleSelective(@Param("record") CarRelatedInfo record, @Param("example") CarRelatedInfoExample example);

    int updateByExample(@Param("record") CarRelatedInfo record, @Param("example") CarRelatedInfoExample example);

    int updateByPrimaryKeySelective(CarRelatedInfo record);

    int updateByPrimaryKey(CarRelatedInfo record);
}