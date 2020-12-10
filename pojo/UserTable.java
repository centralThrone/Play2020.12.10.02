package com.happy.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserTable {
    @TableId(value = "user_id",type = IdType.AUTO)//唯一标示
    private Long userId;
    //真实姓名
    private String userName;
    //手机号
    private String userPhone;
    //性别
    private String userSex;
    //生日
    private String userBirth;
    //密码
    private String userPassword;
    //头像
    private String userLogo;
    //权限
    private String userLevel;
    //那个用户添加的乘客
    private Long userTeam;

}
