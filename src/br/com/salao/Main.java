/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.salao;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author cristiano
 */
public class Main {

    public static void main(String[] args){
        
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach coach = ctx.getBean("myCoach", Coach.class);
        System.out.println(coach.getDailyWork());
        System.out.println(coach.getFortune());
    }
}
