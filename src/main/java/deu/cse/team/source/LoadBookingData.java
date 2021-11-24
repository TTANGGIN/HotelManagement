/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.source;

import deu.cse.team.booking.Booking;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CHANG
 */
public class LoadBookingData {
    public void loadData(DefaultTableModel model) {
        ArrayList<BookingInfo> bookingInfo = new ArrayList<>();
        try {
            FileMgmt fileMgmt = new FileMgmt();
            fileMgmt.readBookingFileData("C:\\DB\\BookingList.txt");
            fileMgmt.splitBookingFileData();
            bookingInfo = fileMgmt.returnBookingInfo();
            
            for (int i = 0; i < bookingInfo.size(); i++) {
                model.addRow(new Object[]{
                    bookingInfo.get(i).getIndex(),
                    bookingInfo.get(i).getName(),
                    bookingInfo.get(i).getEntrance(),
                    bookingInfo.get(i).getExit(),
                    bookingInfo.get(i).getRoom(),
                    bookingInfo.get(i).getPersonnel(),
                    bookingInfo.get(i).getPhonenumber(),
                    bookingInfo.get(i).getStatus(),
                    bookingInfo.get(i).getAddress(),
                    bookingInfo.get(i).getMoney()
                });
            }
        } catch (IOException ex) {
            Logger.getLogger(Booking.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
