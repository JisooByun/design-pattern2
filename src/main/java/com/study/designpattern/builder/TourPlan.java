package com.study.designpattern.builder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TourPlan implements Cloneable {
    private String title;
    private int nights;
    private int days;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
