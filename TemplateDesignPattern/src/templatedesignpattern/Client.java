/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatedesignpattern;

/**
 *
 * @author Rabi Siddique
 */
public class Client {
    
    public static void main(String[] args) {
        
        System.out.println("Rabi Siddique - FA17-BSE-027-S2 - Exam Solution");
        System.out.println("-----------");
        Report salesReport = new SalesReport();
        salesReport.generateReport();
        
        System.out.println("-----------");
        Report purchaseReport = new PurchaseReport();
        purchaseReport.generateReport();
        
        System.out.println("-----------");
        Report stockReport = new StockReport();
        stockReport.generateReport();
        
    }
    
    
}
