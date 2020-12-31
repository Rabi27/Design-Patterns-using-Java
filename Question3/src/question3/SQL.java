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
public abstract class SQL {

    abstract void ReadData();

    abstract void FormatData();

    abstract void ExportData();

    //template method
    public final void Start() {

        ReadData();
        FormatData();
        ExportData();
    }

}
