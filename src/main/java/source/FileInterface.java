/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

import java.io.IOException;

/**
 * 파일 쓰기, 읽기 인터페이스
 * @author CHANG
 */
public interface FileInterface {
    void FileRead();
    void FileWrite(String a) throws IOException;
    void FileDataSplit();
}
