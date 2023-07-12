package org.jcsoben.fake;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DummyProduct {

    private String title;

    private double price;
}
