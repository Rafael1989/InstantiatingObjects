/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instantiatingobjects;

/**
 *
 * @author oracle
 */
public class Customer {
    public String name = "";
    public int    custID;
    public String address = "";
    public int    orderNum;
    public int    age;

    public void displayCustomer(){
        System.out.println("Name: " + name + ", Age: " + age);
    }     
}
