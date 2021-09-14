/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
/**
 *
 * @author CHANG
 */
public class FileMgmt implements FileInterface {
    ArrayList<String> readinfo = new ArrayList();
    
    @Override
    public void FileRead(String path) {
        try {
            File Stext = new File(path);
            FileReader textRead = new FileReader(Stext);
            BufferedReader bfReader = new BufferedReader(textRead);
            String line = "";
            while ((line = bfReader.readLine()) != null) {
                readinfo.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("파일이 존재하지않습니다. 경로를 확인해주세요");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void FileWrite(String path, String data) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(path,true));
        PrintWriter pw = new PrintWriter(bw,true);
        pw.write(data+"\n");
        pw.flush();
        pw.close();
    }
    
    @Override
    public void FileDataSplit() {
        String line;

        for (int i = 0; i < readinfo.size(); i++) {
            line = readinfo.get(i);
            String[] str = line.split("\t");
            
        }
    }
    
}
