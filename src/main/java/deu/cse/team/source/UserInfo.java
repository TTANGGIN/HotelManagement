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
    
    public UserInfo (String name, String id, String pw) {
        this.name = name;
        this.id = id;
        this.pw = pw;
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

    public String getUserInfo() {
        String userInfo = String.format("%s\t%s\t%s", name, id, pw);
        return userInfo;
    }
}
