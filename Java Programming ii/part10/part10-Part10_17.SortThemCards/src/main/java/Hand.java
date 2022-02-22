
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHANE
 */
public class Hand implements Comparable<Hand>{
    private ArrayList<Card> cards;
    
    public Hand(){
        cards = new ArrayList<>();
    }
    
    public void add(Card card){
        cards.add(card);
    }
    
    public void print(){
        Iterator<Card> iterator = cards.iterator();
        while(iterator.hasNext()){
            Card card = iterator.next();
            System.out.println(card);
        }
    }
    
    public void sort(){
        Collections.sort(cards);
    }
    
    public int sum(){
        return cards.stream()
                .mapToInt(card -> card.getValue())
                .sum();
    }
    
    @Override
    public int compareTo(Hand otherHand){
        if(this.sum() > otherHand.sum()){
            return 1;
        } else if(this.sum() < otherHand.sum()){
            return -1;
        }
        return 0;
    }
    
    public void sortBySuit(){
        Collections.sort(cards, new BySuitInValueOrder());
    }
}
