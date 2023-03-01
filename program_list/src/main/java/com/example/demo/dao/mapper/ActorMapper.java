package com.example.demo.dao.mapper;

import com.example.demo.dao.pojo.Actor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ActorMapper {
    //演员id查演员信息
    Actor search (Integer id);

    //演员名称查演员信息
    Actor getActorByName(String name);

    //演员名称添加演员信息
    int addActorByName(String name);

    //演员id删除演员信息
    int deleteActorById(Integer id);
}
