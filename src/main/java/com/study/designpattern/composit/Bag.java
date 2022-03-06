package com.study.designpattern.composit;

import java.util.ArrayList;
import java.util.List;

public class Bag implements Component {

    private final List<Component> components;

    public Bag() {
        this.components = new ArrayList<>();
    }

    public void add(Component item) {
        components.add(item);
    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public int getPrice() {
        return components.stream().mapToInt(Component::getPrice).sum();
    }
}
