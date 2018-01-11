package cn.felord.authorization.config;

/**
 * @author dax.
 * @version v1.0
 * @since 2018/1/8 14:07
 */

public class Account {

    private String name;
    private String password;
    private String roles;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "{" +
                "name:" + name +
                ", password:" + password +
                ", roles:" + roles +
                '}';
    }
}
