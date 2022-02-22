package com.study.designpattern.builder;

public class App {
    private static String djfsf;

    //1. setter은 객체가 불안정하게 만들어질 수도 있음
    //2. 필드가 많을 경우 생성자가 장황해질 수 있음.
    public static void main(String[] args) {

        TourPlan tourPlan = new TourPlan();

        tourPlan.setTitle("칸쿤 여행");
        tourPlan.setNights(2);

        TourBuilder tourBuilder = new TourBuilder();
        TourPlan tour = tourBuilder
                .title("여행")
                .daysAndNights(2, 3)
                .build();

        TourDirector tourDirector = new TourDirector(new TourBuilder());// 다른 builder를 넣을 수도 있음 예를들어 vip용 tourbuilder가 있다면 VipTourBuilder를 넣어주면됨,
        TourPlan tourPlan1 = tourDirector.freeTour();
        System.out.println(tourPlan1.getTitle());
    }
}
