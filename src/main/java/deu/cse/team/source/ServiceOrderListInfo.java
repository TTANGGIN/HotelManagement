/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.source;

/**
 *
 * @author PC
 */
public class ServiceOrderListInfo {

    private String index; //고유번호
    private String service;
    private String room;
    private String time; //주문시간
    private String productname; //상품명
    private String money; //상품금액
    
    public ServiceOrderListInfo(String index, String service, String room, String time, String productname, String money) {
        this.index = index;
        this.service = service;
        this.room = room;
        this.time = time;
        this.productname = productname;
        this.money = money;
    }

    public String getIndex() {
        return index;
    }
    
    public String getService() {
        return service;
    }

    public String getRoom() {
        return room;
    }
    
    public String getTime() {
        return time;
    }

    public String getProductname() {
        return productname;
    }

    public String getMoney() {
        return money;
    }

    public void setIndex(String index) {
        this.index = index;
    }
    
    public void setService(String service) {
        this.service = service;
    }
    
    public void setRoom(String room) {
        this.room = room;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public void setMoney(String money) {
        this.money = money;
    }
    
}
