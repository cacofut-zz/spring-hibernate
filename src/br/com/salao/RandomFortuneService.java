/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.salao;

import java.security.SecureRandom;

/**
 *
 * @author cristiano
 */
public class RandomFortuneService implements FortuneService{

    public static final SecureRandom random = new SecureRandom();
    @Override
    public String getFortune() {
        String[] fortunes = {
            "Você teve sua fortuna",
            "Você não ganhou hoje",
            "Tente novamente mais tarde",
            "Foi um bom desafio"
        };
        
        int rand = random.nextInt(fortunes.length);
        System.out.println("indice " + rand);
        return fortunes[rand];
    }
    
}
