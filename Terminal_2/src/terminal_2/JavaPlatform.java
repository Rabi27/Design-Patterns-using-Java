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
public class JavaPlatform implements Platform {

	public JavaPlatform(){
		System.out.println("JavaPlatform object created");
	}
	

    @Override
    public void execute(Code code) {
        System.out.println("Compiling and executing Java  code.");
    }

}