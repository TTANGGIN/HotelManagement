/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.source;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CHANG
 */
public class LoadBookingData {
    public LoadBookingData(DefaultTableModel model) {
        ArrayList<BookingInfo> bookingInfo = new ArrayList<>();
        try {
            FileMgmt fileMgmt = new FileMgmt();
            fileMgmt.readBookingFileData("C:\\DB\\BookingList.txt");
            fileMgmt.splitBookingFileData();
            bookingInfo = fileMgmt.returnBookingInfo();
            
            for (int i = 0; i < bookingInfo.size(); i++) {
                if (bookingInfo.get(i).getStatus().equals("N")) {
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
                        bookingInfo.get(i).getMoney()});
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(LoadBookingData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public LoadBookingData(DefaultTableModel model, int entrance, int exit) {
        ArrayList<BookingInfo> bookingInfo = new ArrayList<>();
        try {
            FileMgmt fileMgmt = new FileMgmt();
            fileMgmt.readBookingFileData("C:\\DB\\BookingList.txt");
            fileMgmt.splitBookingFileData();
            bookingInfo = fileMgmt.returnBookingInfo();
            int fileEntrance;
            int fileExit;
            String isCanceled;
            for (int i = 0; i < bookingInfo.size(); i++) {
                fileEntrance = Integer.parseInt(Arrays.toString(bookingInfo.get(i).getEntrance().split("-")).replaceAll("[^0-9]",""));
                fileExit = Integer.parseInt(Arrays.toString(bookingInfo.get(i).getExit().split("-")).replaceAll("[^0-9]",""));
                isCanceled = bookingInfo.get(i).getStatus();
                if (!isCanceled.equals("C")&& !isCanceled.equals("N") && (entrance <= fileEntrance) && (exit >= fileExit)) {
                    model.addRow(new Object[]{
                        bookingInfo.get(i).getIndex(),
                        bookingInfo.get(i).getName(),
                        bookingInfo.get(i).getRoom(),
                        bookingInfo.get(i).getPersonnel(),
                        bookingInfo.get(i).getEntrance(),
                        bookingInfo.get(i).getExit(),
                        bookingInfo.get(i).getStatus()});
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(LoadBookingData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
