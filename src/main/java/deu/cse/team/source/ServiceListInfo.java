/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.source;

/**
 *
 * @author 915-34
 */
public class ServiceListInfo {

    private String service;
    private String productname;
    private String price;

    public ServiceListInfo(String service, String productname, String price) {
        this.service = service;
        this.productname = productname;
        this.price = price;
    }

    public String getService() {
        return service;
    }

    public String getProductname() {
        return productname;
    }

    public String getPrice() {
        return price;
    }

    public void setService(String service) {
        this.service = service;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
