package com.study.designpattern.mediator.after;


import com.study.designpattern.mediator.before.CleaningService;

//중재자 역할
public class FrontDesk {

    private CleaningService cleaningService = new CleaningService();

    public void getTowers(Guest guest,int numberOfTowers) {
        cleaningService.getTower(guest.getId(),numberOfTowers);
    }
}
