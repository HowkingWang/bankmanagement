/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;

import java.util.Date;

/**
 *
 * @author 1405152
 */
public class Customer
{
    String name;
    String user_name;
    String pass;
    Date dob;
    String occu;
    String email;
    int contact;
    int ad_id;
    int acc_no;

    public Customer(String name, String user_name, String pass, Date dob, String occu, String email, int contact, int ad_id) {
        setContact(contact);
        setDob(dob);
        setEmail(email);
        setName(name);
        setOccu(occu);
        setPass(pass);
        setUser_name(user_name);
        setAd_id(ad_id);
            }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private String getUser_name() {
        return user_name;
    }

    private void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    private String getPass() {
        return pass;
    }

    private void setPass(String pass) {
        this.pass = pass;
    }

    private Date getDob() {
        return dob;
    }

    private void setDob(Date dob) {
        this.dob = dob;
    }

    private String getOccu() {
        return occu;
    }

    private void setOccu(String occu) {
        this.occu = occu;
    }

    private String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    private int getContact() {
        return contact;
    }

    private void setContact(int contact) {
        this.contact = contact;
    }

    private int getAd_id() {
        return ad_id;
    }

    private void setAd_id(int ad_id) {
        this.ad_id = ad_id;
    }

   
    
    
    

}