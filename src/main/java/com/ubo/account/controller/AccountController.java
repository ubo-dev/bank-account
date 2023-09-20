package com.ubo.account.controller;

import com.ubo.account.dto.AccountDto;
import com.ubo.account.dto.CreateAccountRequest;
import com.ubo.account.service.AccountService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/v1/account")
public class AccountController {

   private final AccountService accountService;

   public AccountController(AccountService accountService) {
       this.accountService = accountService;
   }

    @PostMapping()
    public ResponseEntity<AccountDto> createAccount(@RequestBody @Valid CreateAccountRequest createAccountRequest) {
        return ResponseEntity.ok(accountService.createAccount(createAccountRequest));
    }


}
