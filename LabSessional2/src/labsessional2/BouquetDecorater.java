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
public abstract class BouquetDecorater implements Bouquet {
    
    protected Bouquet decoratedBouquet;

    public BouquetDecorater(Bouquet decoratedBouquet) {
        this.decoratedBouquet = decoratedBouquet;
    }
    
    public void bouquetType(){
    
        decoratedBouquet.bouquetType();
    
    }
    
    public double cost(){
        
        return decoratedBouquet.cost();
    
    }
    
    
}
