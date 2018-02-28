/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bill_of_sale;

/**
 *This program finds the bill of sale and creates of receipt.
 * author Andrew Archer
 * created February 26, 2018    
 */ 
public class Bill_of_Sale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //price of the shirt 
        double shirt = 12.49;
       // amount played for the shirt
       double billPayed = 20;
       // taxes on the purchase 
       double HST = 1.13;
       // the amount you must pay 
       double totalBill;
       // the change you will recive 
       double change;
       
       totalBill = (shirt)* HST;
       
       change = billPayed - totalBill;
       // creates the recipt 
       System.out.println("Purchased Price = " + shirt + "$\nTaxes = 13%" +
               "$\n" + "Total Bill = " + totalBill + 
                        "$\n" +  "Change " + change + "$" );
      
      
    }
    
}

