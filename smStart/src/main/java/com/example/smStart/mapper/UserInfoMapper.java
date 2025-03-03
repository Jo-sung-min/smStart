package com.example.smStart.mapper;


import com.example.smStart.domain.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserInfoMapper {

    List<UserInfo> findAll();
}
