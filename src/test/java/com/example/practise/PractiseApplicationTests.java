package com.example.practise;

import com.alibaba.fastjson.JSON;
import com.example.practise.dao.CarRelatedInfoJpaMapper;
import com.example.practise.dao.CarRelatedInfoMapper;
import com.example.practise.entity.CarRelatedInfoEntity;
import com.example.practise.entity.CarRelatedInfoExample;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class PractiseApplicationTests {

	@Autowired
	CarRelatedInfoMapper carRelatedInfoMapper;
	@Autowired
    CarRelatedInfoJpaMapper carRelatedInfoJpaMapper;

	@Test
	public void contextLoads() {
	}

	@Test
	public void getPage(){
		PageHelper.startPage(2,2);
		CarRelatedInfoExample carRelatedInfoExample = new CarRelatedInfoExample();
		CarRelatedInfoExample.Criteria criteria = carRelatedInfoExample.createCriteria();
		criteria.andCheckCarNumberIsNotNull();
		List list = carRelatedInfoMapper.selectByExample(carRelatedInfoExample);
		log.info("结果："+JSON.toJSONString(list));
	}

	@Test
    public void getResult(){
        PageHelper.startPage(2,2);
        List list = carRelatedInfoJpaMapper.findAll();
        log.info("结果："+JSON.toJSONString(list));
        CarRelatedInfoEntity carRelatedInfoEntity = carRelatedInfoJpaMapper.getOne("1");
        log.info("实体结果："+JSON.toJSONString(carRelatedInfoEntity));
//        Page<CarRelatedInfoEntity> page = carRelatedInfoJpaMapper.findAll(2,2);
//        log.info("分页结果："+JSON.toJSONString(page));
    }

}
