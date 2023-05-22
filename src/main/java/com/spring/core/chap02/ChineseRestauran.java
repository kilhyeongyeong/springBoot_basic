package com.spring.core.chap02;

public class ChineseRestauran implements Restaurant {
    // 셰프도 레스토랑 소속
    private Chef chef;

    // 코스요리 메뉴도 레스토랑 소속
    private Course course;

    public ChineseRestauran(ChineseChef chef, ChineseCourse course){
        this.chef = chef;
        this.course = course;
    }

    @Override
    public void order() {
        System.out.println("중식을 주문합니다.");
        course.combineMenu();
        chef.cook();
    }
}
