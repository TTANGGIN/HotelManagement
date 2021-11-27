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
import java.io.LineNumberReader;
import java.io.PrintWriter;
import java.util.ArrayList;
/**
 *
 * @author CHANG
 */
public class FileMgmt implements FileInterface {
    ArrayList<String> readUserInfo = new ArrayList();
    ArrayList<String> readAdminInfo = new ArrayList();
    ArrayList<String> readBookingInfo = new ArrayList();
    ArrayList<String> readServiceListInfo = new ArrayList();
    ArrayList<String> readServiceOrderListInfo = new ArrayList();
    ArrayList<String> readRoomInfo = new ArrayList();
    ArrayList<UserInfo> userInfo = new ArrayList<>();
    ArrayList<AdminInfo> adminInfo = new ArrayList<>();
    ArrayList<BookingInfo> bookingInfo = new ArrayList<>();
    ArrayList<ServiceListInfo> serviceListInfo = new ArrayList<>();
    ArrayList<ServiceOrderListInfo> serviceOrderListInfo = new ArrayList<>();
    ArrayList<RoomInfo> roomInfo = new ArrayList<>();
    
    @Override
    public void readFileData(String path) {
        try {
            BufferedReader bfReader = new BufferedReader(new FileReader(new File(path)));
            String line = "";
            while ((line = bfReader.readLine()) != null) {
                readUserInfo.add(line);
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
            BufferedReader bfReader = new BufferedReader(new FileReader(new File(path)));
            String line = "";
            while ((line = bfReader.readLine()) != null) {
                readUserInfo.add(line);
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
            BufferedReader bfReader = new BufferedReader(new FileReader(new File(path)));
            String line = "";
            while ((line = bfReader.readLine()) != null) {
                readAdminInfo.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("파일이 존재하지않습니다. 경로를 확인해주세요");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readBookingFileData(String path) {
        try {
            BufferedReader bfReader = new BufferedReader(new FileReader(new File(path)));
            String line = "";
            while ((line = bfReader.readLine()) != null) {
                readBookingInfo.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("파일이 존재하지않습니다. 경로를 확인해주세요");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readServiceListFileData(String path) {
        try {
            BufferedReader bfReader = new BufferedReader(new FileReader(new File(path)));
            String line = "";
            while ((line = bfReader.readLine()) != null) {
                readServiceListInfo.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("파일이 존재하지않습니다. 경로를 확인해주세요");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readServiceOrderListFileData(String path) {
        try {
            BufferedReader bfReader = new BufferedReader(new FileReader(new File(path)));
            String line = "";
            while ((line = bfReader.readLine()) != null) {
                readServiceOrderListInfo.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("파일이 존재하지않습니다. 경로를 확인해주세요");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void readRoomFileData(String path) {
        try {
            BufferedReader bfReader = new BufferedReader(new FileReader(new File(path)));
            String line = "";
            while ((line = bfReader.readLine()) != null) {
                readRoomInfo.add(line);
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
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path,true)),true);
        pw.write(data+"\n");
        pw.flush();
        pw.close();
    }
    public void writeCsrFileData(String path, String data) throws IOException {
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path,true)),true);
        pw.write(data+"\n");
        pw.flush();
        pw.close();
    }
    public void writeManagerFileData(String path, String data) throws IOException {
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path,true)),true);
        pw.write(data+"\n");
        pw.flush();
        pw.close();
    }
    public void writeBookingFileData(String path, String data) throws IOException {
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path,true)),true);
        LineNumberReader reader = new LineNumberReader(new FileReader(path));
        while (reader.readLine() != null);
        pw.write(Integer.toString(reader.getLineNumber()) + "\t" + data + "\n");
        pw.flush();
        pw.close();
    }
    public void writeServiceListFileData(String path, String data) throws IOException {
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path,true)),true);
        pw.write(data+"\n");
        pw.flush();
        pw.close();
    }
    public void writeServiceOrderListFileData(String path, String data) throws IOException {
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path,true)),true);
        pw.write(data+"\n");
        pw.flush();
        pw.close();
    }
    
    @Override
    public void splitFileData() {
        String line;

        for (int i = 0; i < readUserInfo.size(); i++) {
            line = readUserInfo.get(i);
            String[] str = line.split("\t");
            userInfo.add(new UserInfo(str[0], str[1], str[2]));
        }
    }
    public void splitManagerFileData() {
        String line;

        for (int i = 0; i < readAdminInfo.size(); i++) {
            line = readAdminInfo.get(i);
            String[] str = line.split("\t");
            adminInfo.add(new AdminInfo(str[0],str[1]));
        }
    }
    public void splitBookingFileData() {
        String line;

        for (int i = 0; i < readBookingInfo.size(); i++) {
            line = readBookingInfo.get(i);
            String[] str = line.split("\t");
            bookingInfo.add(new BookingInfo(str[0],str[1],str[2],str[3],str[4],str[5],str[6],str[7],str[8],str[9]));
        }
    }
    public void splitServiceListFileData() {
        String line;

        for (int i = 0; i < readServiceListInfo.size(); i++) {
            line = readServiceListInfo.get(i);
            String[] str = line.split("\t");
            serviceListInfo.add(new ServiceListInfo(str[0],str[1],str[2]));
        }
    }
    public void splitServiceOrderListFileData() {
        String line;

        for (int i = 0; i < readServiceOrderListInfo.size(); i++) {
            line = readServiceOrderListInfo.get(i);
            String[] str = line.split("\t");
            serviceOrderListInfo.add(new ServiceOrderListInfo(str[0],str[1],str[2],str[3],str[4],str[5]));
        }
    }
    
    public void splitRoomListFileData() {
        String line;

        for (int i = 0; i < readRoomInfo.size(); i++) {
            line = readRoomInfo.get(i);
            String[] str = line.split("\t");
            roomInfo.add(new RoomInfo(str[0],str[1],str[2]));
        }
    }
    
    public ArrayList<UserInfo> returnUserInfo() throws IOException {
        return userInfo;
    }
    public ArrayList<UserInfo> returnCsrInfo() throws IOException {
        return userInfo;
    }
    public ArrayList<AdminInfo> returnManagerInfo() throws IOException {
        return adminInfo;
    }
    public ArrayList<BookingInfo> returnBookingInfo() throws IOException {
        return bookingInfo;
    }
    public ArrayList<ServiceListInfo> returnServiceListInfo() throws IOException {
        return serviceListInfo;
    }
    public ArrayList<ServiceOrderListInfo> returnServiceOrderListInfo() throws IOException {
        return serviceOrderListInfo;
    }
    public ArrayList<RoomInfo> returnRoomInfo() throws IOException {
        return roomInfo;
    }
}
