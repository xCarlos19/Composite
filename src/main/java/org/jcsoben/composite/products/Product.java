package org.jcsoben.composite.products;

import lombok.Data;
import org.jcsoben.composite.Box;

@Data
public abstract class Product implements Box {

    private final String title;

    private final double price;
}
