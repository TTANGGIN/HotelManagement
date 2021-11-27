/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.source;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CHANG
 */
public class ModifyBookingData {
    public ModifyBookingData(DefaultTableModel model) {
        try (PrintWriter pw = new PrintWriter("C:\\DB\\BookingList.txt");) {  
            for (int i = 0; i < model.getRowCount(); i++) {
                String data = String.format("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s", 
                        model.getValueAt(i, 0), model.getValueAt(i, 2),
                        model.getValueAt(i, 3), model.getValueAt(i, 1),
                        model.getValueAt(i, 4), model.getValueAt(i, 5),
                        model.getValueAt(i, 6), model.getValueAt(i, 8),
                        model.getValueAt(i, 9), model.getValueAt(i, 7));
                pw.println(data);
            }
        } catch (IOException ex) {
            Logger.getLogger(ModifyBookingData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ModifyBookingData(DefaultTableModel model, int num) {
        try (PrintWriter pw = new PrintWriter("C:\\DB\\BookingList.txt");) {  
            for (int i = 0; i < model.getRowCount(); i++) {
                pw.println(formatCheckInRowData(model, i));
            }
        } catch (IOException ex) {
            Logger.getLogger(ModifyBookingData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private String formatCheckInRowData(DefaultTableModel model, int i) {
        String data = String.format("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s", 
                        model.getValueAt(i, 0), model.getValueAt(i, 5),
                        model.getValueAt(i, 6), model.getValueAt(i, 1),
                        model.getValueAt(i, 2), model.getValueAt(i, 3),
                        model.getValueAt(i, 4), model.getValueAt(i, 8),
                        model.getValueAt(i, 9), model.getValueAt(i, 7));
        return data;
    }
}
