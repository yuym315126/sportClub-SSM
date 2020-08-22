package com.sportClub.common.dto.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    /**
     * 用户手机号
     */
    private String userPhone;

    /**
     * 密码
     */
    private String userPwd;

    /**
     * 昵称
     */
    private String userNickname;

}
