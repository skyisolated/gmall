package com.sky.gmall.user.service.impl;

import com.sky.gmall.user.bean.UmsMember;
import com.sky.gmall.user.bean.UmsMemberLevel;
import com.sky.gmall.user.bean.UmsMemberReceiveAddress;
import com.sky.gmall.user.mapper.UmsMemberLevelMapper;
import com.sky.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.sky.gmall.user.mapper.UmsMemberMapper;
import com.sky.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UmsMemberMapper umsMemberMapper;

    @Autowired
    UmsMemberReceiveAddressMapper addressMapper;

    @Autowired
    UmsMemberLevelMapper levelMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> members = umsMemberMapper.selectAll();
        return members;
    }

    @Override
    public List<UmsMemberReceiveAddress> getAddressByMemberId(String memberId) {
        UmsMemberReceiveAddress address = new UmsMemberReceiveAddress();
        address.setMember_id(memberId);
        List<UmsMemberReceiveAddress> addresses = addressMapper.select(address);
        return addresses;
    }

    @Override
    public List<UmsMemberReceiveAddress> getAllAddress() {
        List<UmsMemberReceiveAddress> addresses = addressMapper.selectAll();
        return addresses;
    }

    @Override
    public List<UmsMemberLevel> getAllLevel() {
        List<UmsMemberLevel> levels = levelMapper.selectAll();
        return levels;
    }

    @Override
    public UmsMember getUserById(String id) {
       /* UmsMember user = new UmsMember();
        user.setId(id);
        UmsMember member = umsMemberMapper.selectOne(user);
        return member;*/
        Example e = new Example(UmsMember.class);
        e.createCriteria().andEqualTo("id",id);
        UmsMember member = umsMemberMapper.selectOneByExample(e);
        return member;
    }

    @Override
    public UmsMember updateUserById(String id) {
        UmsMember user = new UmsMember();
        user.setId(id);
        user.setNickname("skyisolated");
        user.setPhone("11111");
        umsMemberMapper.updateByPrimaryKeySelective(user);
        return user;
    }


}
