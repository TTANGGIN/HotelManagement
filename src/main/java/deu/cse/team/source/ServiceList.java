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
public class ServiceList {
    private String productname;
    private String price;
    
    public ServiceList (String productname, String price) {
        this.productname = productname;
        this.price = price;
    }

    public String getProductname() {
        return productname;
    }

    public String getPrice() {
        return price;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }
    
    public void setPrice(String price) {
        this.price = price;
    }
}
