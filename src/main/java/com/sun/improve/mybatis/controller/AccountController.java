package com.sun.improve.mybatis.controller;


import com.sun.improve.common.CommonResponse;
import com.sun.improve.mybatis.entity.Account;
import com.sun.improve.mybatis.service.AccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * account 接口层
 * </p>
 *
 * @author 2Mins_
 * @since 2021-01-29
 */
@RestController
public class AccountController {
    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/account")
    public ResponseEntity<?> account() {
        Account account = new Account();
        account.setName("do ra mi fa so");
        account.setMoney(1000d);
        accountService.add(account);
        return CommonResponse.success("ok");
    }

    @PostMapping("/update_account")
    public ResponseEntity<?> updateAccount(@RequestBody Account account) {
        if (accountService.get(account.getId().toString()) != null) {
            accountService.update(account);
        }
        else{
            accountService.add(account);
        }
        return CommonResponse.success("ok");

    }
}

