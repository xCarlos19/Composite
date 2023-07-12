package org.jcsoben;

import org.jcsoben.composite.CompositeBox;
import org.jcsoben.composite.products.Book;
import org.jcsoben.composite.products.VideoGame;
import org.jcsoben.composite.service.DeliveryService;

public class Main {
    public static void main(String[] args) {
//        DummyBox dummyBox = new DummyBox(
//                List.of(
//                        new DummyBox(List.of(new DummyBox(List.of(), List.of(new DummyProduct("1", 100),
//                                new DummyProduct("2", 200),
//                                new DummyProduct("3", 300)))),
//                                Arrays.asList(
//                                        new DummyProduct("1", 100),
//                                        new DummyProduct("2", 200),
//                                        new DummyProduct("3", 300)))),
//                List.of(
//                        new DummyProduct("4", 400),
//                        new DummyProduct("5", 600),
//                        new DummyProduct("6", 600)));
//
//        System.out.println(dummyBox.calculatePrice());

        DeliveryService deliveryService = new DeliveryService();

        deliveryService.setupOrder(
                new CompositeBox(
                        new VideoGame("1", 100)
                ),
                new CompositeBox(
                        new CompositeBox(
                                new Book("2", 200)
                        ),
                        new VideoGame("3", 300)
                ),
                new VideoGame("4", 500),
                new Book("5", 1000));

        System.out.println("Delivery Price -> " + deliveryService.calculateOrderPrice());
    }
}
