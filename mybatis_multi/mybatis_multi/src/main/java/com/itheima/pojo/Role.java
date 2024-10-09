package com.itheima.pojo;

/**
 * ClassName:Role
 * Package:com.itheima.pojo
 * Description:
 *
 * @Author 张皓然
 * @Create 2024/10/8 23:41
 * @Version 1.0
 */
public class Role {
    private Integer id;
    private String roleName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}
