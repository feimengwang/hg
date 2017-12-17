package cn.true123.hg.dto.user;


import cn.true123.hg.dto.EntityDto;

import java.io.Serializable;

public class UserDto extends EntityDto implements Serializable {


    private static final long serialVersionUID = 36208481294865235L;
    /**
     * user_name
     */
    private String userName;

    /**
     * user_pw
     */
    private String userPw;

    /**
     * email
     */
    private String email;

    /**
     * phone
     */
    private String phone;
    
    /**
     * getuser_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * setuser_name
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    /**
     * getuser_pw
     */
    public String getUserPw() {
        return userPw;
    }

    /**
     * setuser_pw
     */
    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }
    /**
     * getemail
     */
    public String getEmail() {
        return email;
    }

    /**
     * setemail
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * getphone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * setphone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
}