package cn.felord.authorization.controller;

import cn.felord.authorization.config.Account;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dax.
 * @version v1.0
 * @since 2018/1/8 14:55
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

     @RequestMapping(value = "/get",method = RequestMethod.GET)
     @PreAuthorize("hasRole('ROLE_TRUSTED_CLIENT')")
    public Account  get(){
        Account account=new Account();
        account.setPassword("aaaa");
         account.setRoles("aaafff");
         account.setName("dfffff");
        return account;
    }
}
