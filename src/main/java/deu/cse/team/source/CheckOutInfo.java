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
public class CheckOutInfo {

    String index;
    String entrance;
    String exit;
    String name;
    String room;
    String personnel;
    String phonenumber;
    String adress;
    String totalmoney;

    public CheckOutInfo(String index, String entrance, String exit, String name, String room, String personnel, String phonenumber, String adress, String totalmoney) {
        this.entrance = entrance; // 입실
        this.exit = exit; // 퇴실
        this.name = name; // 이름
        this.room = room; // 호실
        this.personnel = personnel; // 인원
        this.phonenumber = phonenumber; // 전화번호
        this.adress = adress; // 주소
        this.totalmoney = totalmoney; // 금액

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

    public String getAdress() {
        return adress;
    }

    public String getMoney() {
        return totalmoney;
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

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setMoney(String totalmoney) {
        this.totalmoney = totalmoney;
    }
}
