package com.sun.improve.mybatis.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sun.improve.mybatis.entity.Account;
import com.sun.improve.mybatis.mapper.AccountMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 2Mins_
 * @since 2021-01-29
 */
@Service
public class AccountService {
    private final AccountMapper accountMapper;

    public AccountService(AccountMapper accountMapper) {
        this.accountMapper = accountMapper;
    }

    public void add(Account account) {
        accountMapper.insert(account);
    }

    public Account get(String id) {
        return accountMapper.selectById(id);
    }

    public void update(Account account) {
        accountMapper.updateById(account);
    }

}
