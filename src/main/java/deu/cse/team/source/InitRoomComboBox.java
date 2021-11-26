/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.source;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author CHANG
 */
public class InitRoomComboBox {
    public InitRoomComboBox(DefaultComboBoxModel model) {
        try (FileReader r = new FileReader("C:\\DB\\CheckInList.txt")) {
            BufferedReader reader = new BufferedReader(r);
            String array;
            String[] Arr;
            while ((array = reader.readLine()) != null) {
                Arr = array.split("\t");
                model.addElement(Arr[4]);
            }
        } catch (IOException e) {
        }
    }
}
