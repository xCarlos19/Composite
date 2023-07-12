package org.jcsoben.composite.service;

import lombok.NoArgsConstructor;
import org.jcsoben.composite.Box;
import org.jcsoben.composite.CompositeBox;

@NoArgsConstructor
public class DeliveryService {

    private Box box;

    public void setupOrder(Box... boxes){
        this.box = new CompositeBox(boxes);
    }

    public double calculateOrderPrice(){
        return box.calculatePrice();
    }

}
