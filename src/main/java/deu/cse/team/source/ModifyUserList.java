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
public class ModifyUserList {
    public void modifyData(DefaultTableModel model) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter("C:\\DB\\UserList.txt");
            for (int i = 0; i < model.getRowCount(); i++) {
                String data = String.format("%s\t%s\t%s", 
                        model.getValueAt(i, 0), 
                        model.getValueAt(i, 1),
                        model.getValueAt(i, 2));
                pw.println(data);
            }
        } catch (IOException ex) {
            Logger.getLogger(ModifyUserList.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            pw.close();
        }
    }
}
