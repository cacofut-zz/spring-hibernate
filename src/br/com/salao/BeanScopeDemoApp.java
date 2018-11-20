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
public class BeanScopeDemoApp {
    
    public static void main(String[] args){
                        
        // carregar o contexto do spring
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-scope-applicationContext.xml");
                
        // retornar o bean do contexto
        Coach theCoach   = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);
        
        // chamar algum método
        boolean result = theCoach == alphaCoach;
        
        System.out.println(result);
       
        // fechar o contexto
        context.close();
    }
}
