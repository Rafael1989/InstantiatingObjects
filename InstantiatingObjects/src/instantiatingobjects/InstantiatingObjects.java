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
public class InstantiatingObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Customer alice = new Customer();
        Customer bob = new Customer();
        
        alice.name = "Alice";
        alice.age = 27;
        
        bob.name = "Bob";
        bob.age = 40;
        
        alice.displayCustomer();
        bob.displayCustomer();
    }
    
}
