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
public class BeanLifeCycleDemoApp {
    
    public static void main(String[] args){
                        
        // carregar o contexto do spring
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-life-cycle-applicationContext.xml");
                
        // retornar o bean do contexto
        Coach theCoach = context.getBean("myCoach", Coach.class);
                        
        System.out.println(theCoach.getDailyWork());
       
        // fechar o contexto
        context.close();
    }
}
