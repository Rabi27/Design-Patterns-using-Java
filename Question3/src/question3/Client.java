/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author Rabi Siddique
 */
public class Client {
    
    public static void main(String[] args){
    
        SQL SQL = new PDFFormat();
        SQL.Start();
        System.out.println();
        SQL = new ExcelFormat();
        SQL.Start();
    }
    
}
