package com.example.smStart.service;

import com.example.smStart.domain.UserInfo;
import com.example.smStart.mapper.UserInfoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserInfoServiceImpl implements UserInfoService{

    @Autowired
    UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> getAllUsers() {
        return userInfoMapper.findAll();
    }
}
