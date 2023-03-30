/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

/**
 *
 * @author casta
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BankAccount user = new BankAccount("Hever Andres", 1200);
        System.out.println(user.displayAmmon());
    }
    
}
