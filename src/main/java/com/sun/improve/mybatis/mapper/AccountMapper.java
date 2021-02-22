package com.sun.improve.mybatis.mapper;

import com.sun.improve.mybatis.entity.Account;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  account-dao 接口
 * </p>
 *
 * @author 2Mins_
 * @since 2021-01-29
 */
@Repository
@Mapper
public interface AccountMapper extends BaseMapper<Account> {

}
