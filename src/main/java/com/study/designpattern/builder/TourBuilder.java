package com.study.designpattern.builder;

public class TourBuilder {

    private String title;
    private int days;
    private int nights;
    //순서 강제할 수 있음 만약 여기서 TourBuilder가 아니라 다른 builder를 반환한다면 순서를 만들 수 잇음
    public TourBuilder title(String title){
        this.title = title;
        return this;
    }

    public TourBuilder daysAndNights(int days,int nights){
        this.days = days;
        this.nights= nights;
        return this;
    }

    public TourPlan build(){
        return new TourPlan(title,nights,days);
    }

}
