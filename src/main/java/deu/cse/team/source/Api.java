/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.source;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.io.BufferedReader;
import java.io.IOException;
/**
 *
 * @author CHANG
 */
public class Api {
    public String Api(String address) throws IOException {
        String size = "30";
        String page = "1";
        String format = "xml";
        String key = "2E7FAFA0-660C-33D8-845B-206BB87641E2";
        // 1. URL을 만들기 위한 StringBuilder.
        StringBuilder urlBuilder = new StringBuilder("http://api.vworld.kr/req/search"); /*URL*/
        // 2. 오픈 API의요청 규격에 맞는 파라미터 생성, 발급받은 인증키.
        urlBuilder.append("?" + URLEncoder.encode("service","UTF-8") + "=" + URLEncoder.encode("search", "UTF-8")); /*요청 서비스명*/
        urlBuilder.append("&" + URLEncoder.encode("request","UTF-8") + "=" + URLEncoder.encode("search", "UTF-8")); /*요청 서비스 오퍼레이션*/
        urlBuilder.append("&" + URLEncoder.encode("version","UTF-8") + "=" + URLEncoder.encode("2.0", "UTF-8")); /*요청 서비스 버전*/
        urlBuilder.append("&" + URLEncoder.encode("size","UTF-8") + "=" + URLEncoder.encode(size, "UTF-8")); /*한 페이지에 출력될 응답결과 건수*/
        urlBuilder.append("&" + URLEncoder.encode("page","UTF-8") + "=" + URLEncoder.encode(page, "UTF-8")); /*응답결과 페이지 번호*/
        urlBuilder.append("&" + URLEncoder.encode("query","UTF-8") + "=" + URLEncoder.encode(address, "UTF-8")); /*검색 키워드*/
        urlBuilder.append("&" + URLEncoder.encode("type","UTF-8") + "=" + URLEncoder.encode("address", "UTF-8")); /*검색 대상*/
        urlBuilder.append("&" + URLEncoder.encode("category","UTF-8") + "=" + URLEncoder.encode("road", "UTF-8")); /*검색 대상에 따른 하위 유형*/
        urlBuilder.append("&" + URLEncoder.encode("format","UTF-8") + "=" + URLEncoder.encode(format, "UTF-8")); /*응답결과 포맷*/
        urlBuilder.append("&" + URLEncoder.encode("key","UTF-8") + "=" + URLEncoder.encode(key, "UTF-8")); /*발급받은 api key*/
        
        // 3. URL 객체 생성.
        URL url = new URL(urlBuilder.toString());
        // 4. 요청하고자 하는 URL과 통신하기 위한 Connection 객체 생성.
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        // 5. 통신을 위한 메소드 SET.
        conn.setRequestMethod("GET");
        // 6. 통신을 위한 Content-type SET. 
        conn.setRequestProperty("Content-type", "application/xml");
        // 7. 통신 응답 코드 확인.
        System.out.println("Response code: " + conn.getResponseCode());
        // 8. 전달받은 데이터를 BufferedReader 객체로 저장.
        BufferedReader rd;
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream(), "utf-8"));
        }
        // 9. 저장된 데이터를 라인별로 읽어 StringBuilder 객체로 저장.
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        // 10. 객체 해제.
        rd.close();
        conn.disconnect();
        // 11. 전달받은 데이터 반환.
        return sb.toString();
    }
}
