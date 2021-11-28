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
public class LoadRevenueData {
    public LoadRevenueData(DefaultTableModel model) {
        ArrayList<RevenueInfo> revenueInfo = new ArrayList<>();
        try {
            FileMgmt fileMgmt = new FileMgmt();
            fileMgmt.readRevenueFileData("C:\\DB\\RevenueList.txt");
            fileMgmt.splitRevenueListFileData();
            revenueInfo = fileMgmt.returnRevenueInfo();
            
            for (int i = 0; i < revenueInfo.size(); i++) {
                model.addRow(new Object[]{
                    revenueInfo.get(i).getIndex(),
                    revenueInfo.get(i).getStay(),
                    revenueInfo.get(i).getAdditionalDate(),
                    revenueInfo.get(i).getBasicRate(),
                    revenueInfo.get(i).getServiceRate(),
                    revenueInfo.get(i).getAdditionalRate()
                });
            }
        } catch (IOException ex) {
            Logger.getLogger(LoadRevenueData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
