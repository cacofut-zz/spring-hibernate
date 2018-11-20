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
public class CrickedApp {
    
    public static void main(String[] args){
        
        //carregar o contexto do spring
        ClassPathXmlApplicationContext context = 
                new ClassPathXmlApplicationContext("applicationContext.xml");
        
        //retornar o bena do contexto
        CrickedCoach crickedCoach = context.getBean("myCrickedCoah", CrickedCoach.class);
        
        // chamar algum método
        System.out.println("Email: " + crickedCoach.getEmail());
        System.out.println("Telefone: " + crickedCoach.getTelefone());
        System.out.println("Fortuna: " + crickedCoach.getFortune());
        // fechar o contexto
        context.close();
    }
}
