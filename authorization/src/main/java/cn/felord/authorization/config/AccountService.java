package cn.felord.authorization.config;

import org.springframework.stereotype.Component;

/**
 * @author dax.
 * @version v1.0
 * @since 2018/1/8 14:09
 */
@Component
public class AccountService {

    public Account  findByName(String name){
        Account account=new Account();
           account.setName("jack");
           account.setPassword("aaaa");
           account.setRoles("ROLE_TRUSTED_CLIENT");
        return account;
    }
}
