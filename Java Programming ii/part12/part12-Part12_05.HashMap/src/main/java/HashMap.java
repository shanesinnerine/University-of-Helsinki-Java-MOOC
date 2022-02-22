
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHANE
 */
public class HashMap<K,V> {
    private ArrayList<Pair<K,V>>[] map;
    private int spaceUsed;
    
    public HashMap(){
        map = new ArrayList[32];
        spaceUsed = 0;
    }
    
    public V get(K key){
        int hashValue = key.hashCode() % this.map.length;
        if(map[hashValue] == null){
            return null;
        }
        V value = getValueFromList(map[hashValue], key);
        return value;
    }
    
    public void add(K key, V value){
        Pair newPair = new Pair<K,V>(key, value);
        int hashValue = key.hashCode() % this.map.length;
        if(map[hashValue] == null){
            ArrayList<Pair<K,V>> newList = new ArrayList<>();
            map[hashValue] = newList;
            spaceUsed++;
        }
        map[hashValue].add(newPair);
        if(1.0 * (spaceUsed / map.length) > 0.75){
            grow();
        }
        
    }
    
    public V remove(K key){
        int hashValue = key.hashCode() % this.map.length;
        Pair<K,V> tempPair = getPairFromList(map[hashValue], key);
        map[hashValue].remove(tempPair);
        return tempPair.getValue();
    }
    
    private Pair<K,V> getPairFromList(ArrayList<Pair<K, V>> arrayList, K key) {
        for(int i = 0; i < arrayList.size(); i++){
            if(arrayList.get(i).getKey().equals(key)){
                return arrayList.get(i);
            }
        }
        return null;
    }

    private V getValueFromList(ArrayList<Pair<K, V>> arrayList, K key) {
        for(int i = 0; i < arrayList.size(); i++){
            if(arrayList.get(i).getKey().equals(key)){
                return arrayList.get(i).getValue();
            }
        }
        return null;
    }
    
    public void print(){
        for(int i = 0; i < map.length; i++){
            System.out.println("------------------Index " + i);
            if(map[i] == null){
                continue;
            }
            for(int j = 0; j < map[i].size(); j++){
                System.out.println(map[i].get(j));
            }
        }
    }

    private void grow() {
        int newLength = this.map.length * 2;
        ArrayList<Pair<K,V>>[] newMap = new ArrayList[newLength];
        for(int i = 0; i < this.map.length; i++){
            copy(map[i], newMap);
        }
        this.map = newMap;
    }

    private void copy(ArrayList<Pair<K, V>> arrayList, ArrayList<Pair<K, V>>[] newMap) {
        for(int i = 0; i < arrayList.size(); i++){
            int hashValue = arrayList.get(i).getKey().hashCode() % newMap.length;
            if(newMap[hashValue] == null){
                ArrayList<Pair<K,V>> newList = new ArrayList<>();
                newMap[hashValue] = newList;
            }
            newMap[hashValue].add(arrayList.get(i));
        }
    }
}
