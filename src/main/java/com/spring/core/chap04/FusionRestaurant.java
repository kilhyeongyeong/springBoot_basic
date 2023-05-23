package com.spring.core.chap04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fs")
public class FusionRestaurant implements Restaurant {
    // 셰프
//    @Autowired // 컨테이너의 든 자료중 chef에 대입할 수 있는 걸 자동으로 집어넣음
    // @Qualifier를 필드주입에서 사용하는 경우는 @Autowired 다음줄에 Qualifier를 작성해주시면 됩니다.
    private Chef chef;
    // 요리코스
//    @Autowired
    private Course course;

    // 세터 주입은 세터 위에 @Autowired 어노테이션을 붙여서 설정
    // @Qualifier를 파라미터 왼쪽에 붙이면 지정된 이름의 객체를 주입할 수 있습니다.
    @Autowired
    public void setChef(@Qualifier("jc") Chef chef){
        this.chef = chef;
    }

    @Autowired
    public void setCourse(@Qualifier("jco") Course course){
        this.course = course;
    }

    // FusionRestaurant 내부에서 무슨 Chef와 Course가 들어올지 결정하지 않음
//    @Autowired
//    // 주입받을 파라미터 왼쪽에 @Qualifier("Bean이름")을 입력하면, 지정 주입이 가능
    public FusionRestaurant(/*@Qualifier("cc")*/ Chef chef,/*@Qualifier("cco")*/ Course course){
        this.chef = chef;
        this.course = course;
    }

    // setter 주입시 @Qualifier를 사용하는 경우, 디폴트 생성자가 오버로딩 되어있어야 함
    public FusionRestaurant(){}

    @Override
    public void order() {
        System.out.println("여기는 퓨전 레스토랑입니다.");
        course.combineMenu();
        chef.cook();
    }
}
