/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHANE
 */
public class Team {
    private String name;
    private int gamesPlayed;
    private int wins;
    private int losses;
    
    public Team(String name) {
        this.name = name;
        this.gamesPlayed = 0;
        this.wins = 0;
        this.losses = 0;
    }
    
    public void addWin(){
        this.wins++;
        this.gamesPlayed++;
    }
    
    public void addLoss(){
        this.losses++;
        this.gamesPlayed++;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getWins() {
        return this.wins;
    }
    
    public int getLosses() {
        return this.losses;
    }
    
    public int getGamesPlayed() {
        return this.gamesPlayed;
    }
    
    public void printTeamStats(){
        System.out.println("Games: " + this.gamesPlayed);
        System.out.println("Wins: " + this.wins);
        System.out.println("Losses: " + this.losses);
    }   
}
