/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.source;

/**
 *
 * @author CHANG
 */
public class UserInfoBuilder {
    private String name;
    private String id;
    private String pw;
    private String phone;
    private String email;
    private String address;
    
    public UserInfoBuilder setName(String name) {
        this.name = name;
        return this;
    }
    
    public UserInfoBuilder setId(String id) {
        this.id = id;
        return this;
    }
    
    public UserInfoBuilder setPw(String pw) {
        this.pw = pw;
        return this;
    }
    
    public UserInfoBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    
    public UserInfoBuilder setEmail(String email) {
        this.email = email;
        return this;
    }
    
    public UserInfoBuilder setAddress(String address) {
        this.address = address;
        return this;
    }
    
    public UserInfo build() {
        UserInfo userinfo = new UserInfo(name, id, pw, phone, email, address);
        return userinfo;
    }
}
