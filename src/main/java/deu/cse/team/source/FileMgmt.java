/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.source;

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
    ArrayList<String> readInfo = new ArrayList();
    ArrayList<UserInfo> userInfo = new ArrayList<>();
    
    @Override
    public void readFileData(String path) {
        try {
            File text = new File(path);
            FileReader textRead = new FileReader(text);
            BufferedReader bfReader = new BufferedReader(textRead);
            String line = "";
            while ((line = bfReader.readLine()) != null) {
                readInfo.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("파일이 존재하지않습니다. 경로를 확인해주세요");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readCsrFileData(String path) {
        try {
            File text = new File(path);
            FileReader textRead = new FileReader(text);
            BufferedReader bfReader = new BufferedReader(textRead);
            String line = "";
            while ((line = bfReader.readLine()) != null) {
                readInfo.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("파일이 존재하지않습니다. 경로를 확인해주세요");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readManagerFileData(String path) {
        try {
            File text = new File(path);
            FileReader textRead = new FileReader(text);
            BufferedReader bfReader = new BufferedReader(textRead);
            String line = "";
            while ((line = bfReader.readLine()) != null) {
                readInfo.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("파일이 존재하지않습니다. 경로를 확인해주세요");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void writeFileData(String path, String data) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(path,true));
        PrintWriter pw = new PrintWriter(bw,true);
        pw.write(data+"\n");
        pw.flush();
        pw.close();
    }
    public void writeCsrFileData(String path, String data) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(path,true));
        PrintWriter pw = new PrintWriter(bw,true);
        pw.write(data+"\n");
        pw.flush();
        pw.close();
    }
    public void writeManagerFileData(String path, String data) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(path,true));
        PrintWriter pw = new PrintWriter(bw,true);
        pw.write(data+"\n");
        pw.flush();
        pw.close();
    }
    
    @Override
    public void splitFileData() {
        String line;

        for (int i = 0; i < readInfo.size(); i++) {
            line = readInfo.get(i);
            String[] str = line.split("\t");
            userInfo.add(new UserInfo(str[0],str[1],str[2],str[3],str[4],str[5]));
        }
    }
    
    public ArrayList<UserInfo> returnUserInfo() throws IOException {
        return userInfo;
    }
}
