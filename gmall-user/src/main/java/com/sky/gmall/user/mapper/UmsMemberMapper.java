package com.sky.gmall.user.mapper;

import com.sky.gmall.user.bean.UmsMember;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;


import java.util.List;


public interface UmsMemberMapper extends Mapper<UmsMember>{
    List<UmsMember> selectAllUser();
}
