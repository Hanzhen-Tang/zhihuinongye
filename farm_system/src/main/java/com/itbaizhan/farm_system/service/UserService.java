package com.itbaizhan.farm_system.service;

import com.itbaizhan.farm_common.exception.BusException;
import com.itbaizhan.farm_common.result.CodeEnum;
import com.itbaizhan.farm_system.entity.User;
import com.itbaizhan.farm_system.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional  // 开启事务
public class UserService {
    @Autowired
    private UserMapper userMapper;
    /**
     * 根据id查询用户
     * @param id
     * @return 用户
     */
    public User findById(Long id) {
        if (id == 0){
            int i = 1/0;// 模拟系统异常
        }else if (id == -1){
            throw new BusException(CodeEnum.TEST_ERROR);// 模拟业务异常
        }
        return userMapper.selectById(id);
    }
}
