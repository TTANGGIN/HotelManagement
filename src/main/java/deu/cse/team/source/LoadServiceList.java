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
public class LoadServiceList {
    public LoadServiceList(DefaultTableModel model) {
        ArrayList<ServiceListInfo> serviceListInfo = new ArrayList<>(); //리스트 작성
        try {
            FileMgmt fileMgmt = new FileMgmt();
            fileMgmt.readServiceListFileData("C:\\DB\\ServiceList.txt");
            fileMgmt.splitServiceListFileData();
            serviceListInfo = fileMgmt.returnServiceListInfo();
            for (int i = 0; i < serviceListInfo.size(); i++) {
                model.addRow(new Object[]{
                    serviceListInfo.get(i).getService(),
                    serviceListInfo.get(i).getProductname(),
                    serviceListInfo.get(i).getPrice()
                 });
            }
        } catch (IOException ex) {
            Logger.getLogger(LoadServiceList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public LoadServiceList(DefaultTableModel model, String type) {
        ArrayList<ServiceListInfo> serviceListInfo = new ArrayList<>(); //리스트 작성
        try {
            FileMgmt fileMgmt = new FileMgmt();
            fileMgmt.readServiceListFileData("C:\\DB\\ServiceList.txt");
            fileMgmt.splitServiceListFileData();
            serviceListInfo = fileMgmt.returnServiceListInfo();
            for (int i = 0; i < serviceListInfo.size(); i++) {
                if (serviceListInfo.get(i).getService().equals(type)) {
                   model.addRow(new Object[]{
                       serviceListInfo.get(i).getService(),
                       serviceListInfo.get(i).getProductname(),
                       serviceListInfo.get(i).getPrice()
                    }); 
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(LoadServiceList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
