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
public class CrickedCoach implements Coach{

    private FortuneService fortuneService;
    
    private String email;
    private String telefone;

    public CrickedCoach() {
        System.out.println("chamando o construtor FortuneService");
    }        
    
    @Override
    public String getDailyWork() {
        return "Sua sorte de cricked";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("chamando o método setFortuneService");
        this.fortuneService = fortuneService;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
    
}
