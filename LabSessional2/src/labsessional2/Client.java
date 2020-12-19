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
public class Client {
    
    public static void main(String[] args){
    
       System.out.println("Rabi Siddique - Roll no FA17-BSE-027");
       System.out.println("I'm using the Decorater Pattern");
        
        Bouquet roseBouquet = new RoseBouquet();
        Bouquet lilyBouquet = new LilyBouquet();
        Bouquet orchidBouquet = new OrchidBouquet();
        
        System.out.println("Undecorated Bouquets");
        roseBouquet.bouquetType();
        lilyBouquet.bouquetType();
        orchidBouquet.bouquetType();
           
        
        Bouquet decoratedRoseBouquet_a = new PaperWrapper(new RoseBouquet());
        Bouquet decoratedRoseBouquet_b = new RibbonBow(new RoseBouquet());
        Bouquet decoratedRoseBouquet_c = new Glitter(new RoseBouquet());
        Bouquet decoratedRoseBouquet_d = new OrnamentalLeaves(new RoseBouquet());
        
       System.out.println("");
       System.out.println("Decorated Rose Bouqets");
       decoratedRoseBouquet_a.bouquetType();
       decoratedRoseBouquet_b.bouquetType();
       decoratedRoseBouquet_c.bouquetType();
       decoratedRoseBouquet_d.bouquetType();
        
        Bouquet decoratedlilyBouquet_a = new PaperWrapper(new LilyBouquet());
        Bouquet decoratedlilyBouquet_b = new RibbonBow(new LilyBouquet());
        Bouquet decoratedlilyBouquet_c = new Glitter(new LilyBouquet());
        Bouquet decoratedlilyBouquet_d = new OrnamentalLeaves(new LilyBouquet());
        
        System.out.println("");
       System.out.println("Decorated Lily Bouqets");
       decoratedlilyBouquet_a.bouquetType();
       decoratedlilyBouquet_b.bouquetType();
       decoratedlilyBouquet_c.bouquetType();
       decoratedlilyBouquet_d.bouquetType();
        
        Bouquet decoratedorchidBouque_a = new PaperWrapper(new OrchidBouquet());
        Bouquet decoratedorchidBouque_b = new RibbonBow(new OrchidBouquet());
        Bouquet decoratedorchidBouque_c = new Glitter(new OrchidBouquet());
        Bouquet decoratedorchidBouque_d = new OrnamentalLeaves(new OrchidBouquet());
        
       System.out.println("");
       System.out.println("Decorated OrchidBouque Bouqets");
       decoratedorchidBouque_a.bouquetType();
       decoratedorchidBouque_b.bouquetType();
       decoratedorchidBouque_c.bouquetType();
       decoratedorchidBouque_d.bouquetType();
        
        
    
    
    }
    
}
