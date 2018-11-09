package com.bobby.weatherapi.pojos;

public class Channel {
    private Item item;

    public Channel() {
    }

    public Channel(Item item) {
        this.item = item;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "item=" + item +
                '}';
    }
}
