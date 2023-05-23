package com.spring.core.chap03;

import com.spring.core.chap03.config.HotelConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HotelConfigTest {
    
    // 스프링 컨테이너에 등록된 빈 가져오기
    // HotelConfig 클래스에 정의된 자료를 활용하겠다는 의미
    // = ApplicationContext ac = new AnnotationConfigApplicationContext(HotelConfig.class);
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(HotelConfig.class);

    @Test
    void springDITest(){
//        Hotel hotel = ac.getBean(Hotel.class);
//        hotel.inform();
//
        Chef koreanChef = ac.getBean(KoreanChef.class);
        koreanChef.cook();

        // 모든 빈 조회 -- 개인공부
//        String[] beanDefinitionnames = ac.getBeanDefinitionNames();
//        for(String s : beanDefinitionnames){
//            Object bean = ac.getBean(s);
//            System.out.println("name : " + s);
//            System.out.println("object : " + bean);
//        }
    }
}