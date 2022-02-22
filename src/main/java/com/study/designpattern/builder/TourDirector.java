package com.study.designpattern.builder;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TourDirector {
    private final TourBuilder tourBuilder;

    public TourDirector() {
        tourBuilder = new TourBuilder();
    }


    public TourPlan freeTour() {
        return tourBuilder
                .title("자유 여행")
                .daysAndNights(2, 3)
                .build();
    }
}
