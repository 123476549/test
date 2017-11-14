package com.tms.bean.manager;

import com.tms.bean.BaseBean;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;

import java.util.*;

/**
 * 管理员
 */
public class Manager extends BaseBean {

    private String managerId;//id
    public String getManagerId() {
        return managerId == null ? "" : managerId.trim();
    }
    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    @Length(min=3,max=20,message="{bean.min_max_length}")
    private String managerName;//账号
    public String getManagerName() {
        return managerName == null ? "" : managerName.trim();
    }
    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    private String managerRealName;//姓名
    public String getManagerRealName() {
        return managerRealName == null ? "" : managerRealName.trim();
    }
    public void setManagerRealName(String managerRealName) {
        this.managerRealName = managerRealName;
    }

    private String managerRoleId;//角色编号
    public String getManagerRoleId() {
        return managerRoleId == null ? "" : managerRoleId.trim();
    }
    public void setManagerRoleId(String managerRoleId) {
        this.managerRoleId = managerRoleId;
    }

    private String managerRoleName;//角色
    public String getManagerRoleName() {
        return managerRoleName == null ? "" : managerRoleName.trim();
    }
    public void setManagerRoleName(String managerRoleName) {
        this.managerRoleName = managerRoleName;
    }

    private String password;//密码
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Email(message = "请输入有效邮箱")
    private String email;//邮箱
    public String getEmail() {
        return email == null ? "" : email.trim();
    }
    public void setEmail(String email) {
        this.email = email;
    }

    private String mobile;//电话
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    private String zipCode;//邮编
    public String getZipCode() {
        return zipCode;
    }
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    private String address;//地址
    public String getAddress() {
        return address == null ? "" : address.trim();
    }
    public void setAddress(String address) {
        this.address = address;
    }

    @Length(min=3,max=20,message="{bean.min_max_length}")
    private String departmentId;//部门编号
    public String getDepartmentId() {
        return departmentId;
    }
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    @Length(min=1,max=1,message="{bean.min_max_length}")
    private String status;//状态 0:失效 1:正常
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    private Date createTime;//创建日期
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    //字段含义
    public static final Map<String,String> managerMap = new HashMap<>();
    static {
        managerMap.put("managerId","ID");
        managerMap.put("managerName","用户名");
        managerMap.put("managerRealName","姓名");
        managerMap.put("managerRoleId","角色ID");
        managerMap.put("managerRoleName","角色名称");
        managerMap.put("password","密码");
        managerMap.put("email","Email");
        managerMap.put("mobile","手机");
        managerMap.put("zipCode","邮编");
        managerMap.put("address","地址");
        managerMap.put("departmentId","部门编号");
        managerMap.put("status","状态");
        managerMap.put("createTime","创建日期");
    }

}
