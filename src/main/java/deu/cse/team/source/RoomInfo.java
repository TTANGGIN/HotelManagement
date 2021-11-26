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
public class RoomInfo {
    private String roomNum;
    private String roomRate;
    private String roomStatus;
    
    public RoomInfo(String roomNum, String roomRate, String roomStatus) {
        this.roomNum = roomNum;
        this.roomRate = roomRate;
        this.roomStatus = roomStatus;
    }

    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }

    public void setRoomRate(String roomRate) {
        this.roomRate = roomRate;
    }

    public void setRoomStatus(String roomStatus) {
        this.roomStatus = roomStatus;
    }

    public String getRoomNum() {
        return roomNum;
    }

    public String getRoomRate() {
        return roomRate;
    }

    public String getRoomStatus() {
        return roomStatus;
    }
    
}
