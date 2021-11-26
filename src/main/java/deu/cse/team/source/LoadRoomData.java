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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CHANG
 */
public class LoadRoomData {
    public LoadRoomData(DefaultTableModel model) {
        ArrayList<RoomInfo> roomInfo = new ArrayList<>();
        try {
            FileMgmt fileMgmt = new FileMgmt();
            fileMgmt.readRoomFileData("C:\\DB\\RoomList.txt");
            fileMgmt.splitRoomListFileData();
            roomInfo = fileMgmt.returnRoomInfo();
            
            for (int i = 0; i < roomInfo.size(); i++) {
                model.addRow(new Object[]{
                    roomInfo.get(i).getRoomNum(),
                    roomInfo.get(i).getRoomRate(),
                    roomInfo.get(i).getRoomStatus()
                });
            }
        } catch (IOException ex) {
            Logger.getLogger(LoadRoomData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
