/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.source;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CHANG
 */
public class DefaultRoomRate {
    // TODO 기본 객실 요금 클래스
    private int defaultRate = 0;    // 게터, 세터를 생성하여 관리자가 객실 요금을 설정할 수 있도록 변경 필요
    
    public String DefaultRoomRate(String room, int data) {
        ArrayList<RoomInfo> roomInfo = new ArrayList<>();
        try {
            FileMgmt fileMgmt = new FileMgmt();
            fileMgmt.readRoomFileData("C:\\DB\\RoomList.txt");
            fileMgmt.splitRoomListFileData();
            roomInfo = fileMgmt.returnRoomInfo();
            for (int i = 0; i < roomInfo.size(); i++) {
                if (roomInfo.get(i).getRoomNum().equals(room)) {
                    this.defaultRate = Integer.parseInt(roomInfo.get(i).getRoomRate());
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(DefaultRoomRate.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Integer.toString(defaultRate * data);
    }
}
