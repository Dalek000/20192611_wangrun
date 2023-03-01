package com.example.demo.dao.mapper;

import com.example.demo.dao.pojo.Type;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TypeMapper {
    //typeid查询type信息
    Type getType(Integer id);
}
