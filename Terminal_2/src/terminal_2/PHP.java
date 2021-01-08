/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terminal_2;

/**
 *
 * @author Rabi Siddique
 */
public class PHP implements Platform {

	public PHP (){
		System.out.println("PHP-Platform object created");
	}




    @Override
    public void execute(Code code) {
       System.out.println("Compiling and executing PHP code.");
    }

}
