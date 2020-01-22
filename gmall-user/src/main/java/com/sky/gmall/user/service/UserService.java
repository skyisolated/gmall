package com.sky.gmall.user.service;

import com.sky.gmall.user.bean.UmsMember;
import com.sky.gmall.user.bean.UmsMemberLevel;
import com.sky.gmall.user.bean.UmsMemberReceiveAddress;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    List<UmsMember> getAllUser();
    List<UmsMemberReceiveAddress> getAddressByMemberId(String memberId);
    List<UmsMemberReceiveAddress> getAllAddress();
    List<UmsMemberLevel> getAllLevel();

    UmsMember getUserById(String id);

    UmsMember updateUserById(String id);
}
