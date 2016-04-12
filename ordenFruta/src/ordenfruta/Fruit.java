/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenfruta;

/**
 *
 * @author usu21
 */
public class Fruit implements Comparable <Fruit>{
    
    private String fruitName; 
    private String fruitDesc;   
    private int quantity;

    public Fruit(String fruitName, String fruitDesc, int quantity) {
        this.fruitName = fruitName;
        this.fruitDesc = fruitDesc;
        this.quantity = quantity;
    }
    
    
    
    
    
    
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getFruitDesc() {
        return fruitDesc;
    }

    
    public void setFruitDesc(String fruitDesc) {
        this.fruitDesc = fruitDesc;
    }

    
    

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    
     @Override
    public int compareTo(Fruit o) {
        if(o.getQuantity()< this.getQuantity())
            return -1;
        
        if (o.getQuantity()> this.getQuantity())
            return 1;
        

            return 0;
        
            
    }
    
    
    
    
    
}
