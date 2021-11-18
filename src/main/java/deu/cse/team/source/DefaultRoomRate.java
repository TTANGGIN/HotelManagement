/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.source;

/**
 *
 * @author CHANG
 */
public class DefaultRoomRate {
    // TODO 기본 객실 요금 클래스
    
    private int defaultRate = 10000;    // 게터, 세터를 생성하여 관리자가 객실 요금을 설정할 수 있도록 변경 필요
    public String DefaultRoomRate(int date) {
        int rate = defaultRate * date;
        
        return Integer.toString(rate);
    }
}
