package org.jcsoben.fake;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class DummyBox {

    private List<DummyBox> dummyBoxes;

    private List<DummyProduct> dummyProducts;

    public double calculatePrice(){
        double sum = dummyProducts.stream().mapToDouble(DummyProduct::getPrice).sum();

        for(DummyBox dummyBox : dummyBoxes){
            sum = sum + dummyBox.calculatePrice();
        }

        return sum;
    }
}
