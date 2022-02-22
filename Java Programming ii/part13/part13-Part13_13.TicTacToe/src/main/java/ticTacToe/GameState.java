/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticTacToe;

/**
 *
 * @author SHANE
 */
public class GameState {
    private String[][] state;
    
    public GameState(){
        state = new String[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                state[i][j] = "";
            }
        }
    }
    
    public void play(String player, int row, int column){
        state[column][row] = player;
    }
    
    public boolean isWinner(String player){
        for(int i = 0; i < 3; i++){   
            if(state[i][0].equals(player) && state[i][1].equals(player) && state[i][2].equals(player)){
                return true;
            }
            if(state[0][i].equals(player) && state[1][i].equals(player) && state[2][i].equals(player)){
                return true;
            }
        }
        if(state[0][0].equals(player) && state[1][1].equals(player) && state[2][2].equals(player)){
                return true;
        }
        if(state[2][0].equals(player) && state[1][1].equals(player) && state[0][2].equals(player)){
                return true;
        }
        return false;   
    }
    
    public void clear(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                state[i][j] = "";
            }
        }
    }
}
