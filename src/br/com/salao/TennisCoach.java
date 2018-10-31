/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.salao;

/**
 *
 * @author cristiano
 */
public class TennisCoach implements Coach{
    
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println("constructor TennisCoach");
    }        

    @Override
    public String getDailyWork() {
        return "Treinar muitas raquetadas";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
        System.out.println("método setter TennisCoach");
    }
    
    
    
}
