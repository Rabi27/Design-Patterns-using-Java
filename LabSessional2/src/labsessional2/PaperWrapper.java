/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labsessional2;

/**
 *
 * @author Rabi Siddique
 */
public class PaperWrapper extends BouquetDecorater {

    public PaperWrapper(Bouquet decoratedBouquet) {
        super(decoratedBouquet);
    }
    
    public void bouquetType(){
    
        decoratedBouquet.bouquetType();
        System.out.println("Cost:"+cost());
        decoratedBouquetType(decoratedBouquet);
    
    }
    
    public void decoratedBouquetType(Bouquet decoratedBouquet){
    
    
        System.out.println("Decorated Bouqted Type:Papper Wrapper");
    }
    
    public double cost(){
    
        return 30+decoratedBouquet.cost();
    
    }
    
}
