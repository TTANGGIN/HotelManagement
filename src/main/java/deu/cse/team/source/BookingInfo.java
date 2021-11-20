/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.source;

/**
 *
 * @author 915-35
 */
public class BookingInfo {
    String index;
    String entrance;
    String exit;
    String name;
    String room;
    String personnel;
    String phonenumber;
    String address;
    String money;
    String status;
    
    public BookingInfo (String index, String entrance, String exit, String name, String room, String personnel, String phonenumber, String address, String money, String status) {
        this.index = index;  // 고유번호
        this.entrance = entrance; // 입실
        this.exit = exit; // 퇴실
        this.name = name; // 이름
        this.room = room; // 호실
        this.personnel = personnel; // 인원
        this.phonenumber = phonenumber; // 전화번호
        this.address = address; // 주소
        this.money = money; // 금액
        this.status = status; // 예약상태 
    }
    
    public String getIndex() {
        return index;
    }

    public String getEntrance() {
        return entrance;
    }

    public String getExit() {
        return exit;
    }

    public String getName() {
        return name;
    }

    public String getRoom() {
        return room;
    }

    public String getPersonnel() {
        return personnel;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getAddress() {
        return address;
    }

    public String getMoney() {
        return money;
    }
    
    public String getStatus() {
        return status;
    }

    public void setIndex(String index) {
        this.index = index;
    }
    
    public void setEntrance(String entrance) {
        this.entrance = entrance;
    }

    public void setExit(String exit) {
        this.exit = exit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void setPersonnel(String personnel) {
        this.personnel = personnel;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void setAdress(String address) {
        this.address = address;
    }

    public void setMoney(String money) {
        this.money = money;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
}
