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
    String entrance;
    String exit;
    String name;
    String room;
    String personnel;
    String phonenumber;
    String adress;
    String money;
    
    public BookingInfo (String entrance, String exit, String name, String room, String personnel, String phonenumber, String adress, String money) {
        this.entrance = entrance;
        this.exit = exit;
        this.name = name;
        this.room = room;
        this.personnel = personnel;
        this.phonenumber = phonenumber;
        this.adress = adress;
        this.money = money;

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
        return money;
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

    public void setMoney(String money) {
        this.money = money;
    }
}
