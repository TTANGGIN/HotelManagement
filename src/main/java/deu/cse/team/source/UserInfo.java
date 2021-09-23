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
public class UserInfo {
    private String name;
    private String id;
    private String pw;
    private String phone;
    private String email;
    private String address;
    
    public UserInfo (String name, String id, String pw, String phone, String email, String address) {
        this.name = name;
        this.id = id;
        this.pw = pw;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }
    
    public String getName() {
        return name;
    }
    
    public String getId() {
        return id;
    }
    
    public String getPw() {
        return pw;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getAddress() {
        return address;
    }
    
    public String getUserInfo() {
        String userinfo = String.format("%s\t%s\t%s\t%s\t%s\t%s", name, id, pw, phone, email, address);
        return userinfo;
    }
}
