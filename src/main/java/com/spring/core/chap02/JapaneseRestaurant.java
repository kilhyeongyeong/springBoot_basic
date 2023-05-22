package com.spring.core.chap02;

public class JapaneseRestaurant implements Restaurant {
    // 셰프도 레스토랑 소속
    private Chef chef;

    // 코스요리 메뉴도 레스토랑 소속
    private Course course;

    public JapaneseRestaurant(){
        this.chef = new JapaneseChef();
        this.course = new JapaneseCourse();
    }
    @Override
    public void order() {
        System.out.println("일식을 주문합니다.");
        course.combineMenu();
        chef.cook();
    }
}
