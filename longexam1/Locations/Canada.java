package Locations;

import Tourists.Tourist;

public class Canada implements Locations {

    public int airFare = 200;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}