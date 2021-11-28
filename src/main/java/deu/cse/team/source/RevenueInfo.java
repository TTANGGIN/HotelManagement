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
public class RevenueInfo {
    private String index;
    private String stay;
    private String additionalDate;
    private String basicRate;
    private String serviceRate;
    private String additionalRate;
    
    public RevenueInfo(String index, String stay, String additionalDate, String basicRate, String serviceRate, String additionalRate) {
        this.index = index;
        this.stay = stay;
        this.additionalDate = additionalDate;
        this.basicRate = basicRate;
        this.serviceRate = serviceRate;
        this.additionalRate = additionalRate;
    }

    public String getIndex() {
        return index;
    }

    public String getStay() {
        return stay;
    }

    public String getAdditionalDate() {
        return additionalDate;
    }

    public String getBasicRate() {
        return basicRate;
    }

    public String getServiceRate() {
        return serviceRate;
    }

    public String getAdditionalRate() {
        return additionalRate;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public void setStay(String stay) {
        this.stay = stay;
    }

    public void setAdditionalDate(String additionalDate) {
        this.additionalDate = additionalDate;
    }

    public void setBasicRate(String basicRate) {
        this.basicRate = basicRate;
    }

    public void setServiceRate(String serviceRate) {
        this.serviceRate = serviceRate;
    }

    public void setAdditionalRate(String additionalRate) {
        this.additionalRate = additionalRate;
    }
    
}
