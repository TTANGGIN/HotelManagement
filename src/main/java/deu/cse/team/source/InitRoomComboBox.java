/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.source;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author CHANG
 */
public class InitRoomComboBox {
    public InitRoomComboBox(DefaultComboBoxModel model) {
        ArrayList<BookingInfo> bookingInfo = new ArrayList<>();
        try {
            FileMgmt fileMgmt = new FileMgmt();
            fileMgmt.readBookingFileData("C:\\DB\\BookingList.txt");
            fileMgmt.splitBookingFileData();
            bookingInfo = fileMgmt.returnBookingInfo();            
            for (int i = 0; i < bookingInfo.size(); i++) {
                if (bookingInfo.get(i).getStatus().equals("Y")) {
                    model.addElement(bookingInfo.get(i).getRoom());
                }
            }
        } catch (IOException e) {
        }
    }
}
