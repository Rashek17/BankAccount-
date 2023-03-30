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
public class BankAccount {
    
    public String nameClient;
    public double totalAcount;

    public BankAccount() {
    }

    public BankAccount(String nameClient, double totalAcount) {
        this.nameClient = nameClient;
        this.totalAcount = totalAcount;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public double getTotalAcount() {
        return totalAcount;
    }

    public void setTotalAcount(double totalAcount) {
        this.totalAcount = totalAcount;
    }
    
    public String  displayAmmon(){
        return "\n" +"Name: " + getNameClient() + "\n" + "Account: " + getTotalAcount();
    }
}
