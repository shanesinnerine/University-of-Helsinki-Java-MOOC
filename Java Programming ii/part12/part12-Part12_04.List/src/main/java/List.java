/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHANE
 */
public class List<T> {
    private T[] list;
    private int firstFreeIndex;
    
    public List(){
        this.list = (T[]) new Object[10];
        firstFreeIndex = 0;
    }
    
    public void add(T value){
        if(this.firstFreeIndex == this.list.length){
            grow();
        }
        this.list[firstFreeIndex] = value;
        this.firstFreeIndex++;
    }
    
    private void grow(){
        int newSize = this.list.length + this.list.length/2;
        T[] newList = (T[]) new Object[newSize];
        for(int i = 0; i < this.list.length; i++){
            newList[i] = this.list[i];
        }
        this.list = newList;
    }
    
    public void remove(T value) {
        int index = indexOf(value);
        if(index < 0){
            return;
        }
        list[index] = null;
        moveLeftFrom(index);
        this.firstFreeIndex--;
    }
    
    public int indexOf(T value){
        for(int i = 0; i < size(); i++){
            if(list[i].equals(value)){
                return i;
            }
        }
        return -1;
    }

    private void moveLeftFrom(int index) {
        for(int i = index; i < firstFreeIndex - 1; i++){
            list[i] = list[i + 1];
        }
    }
    
    public T value(int index){
        if(index >= this.firstFreeIndex){
            throw new ArrayIndexOutOfBoundsException("Index " + index + "is not in range 0 --> " + (this.firstFreeIndex - 1));
        }
        return list[index];
    }
    
    public int size(){
        return this.firstFreeIndex;
    }
    
    public void print(){
        for(int i = 0; i < this.firstFreeIndex; i++){
            System.out.println("list[" + i + "] = " + list[i]);
        }
        System.out.println("First Free Index = " + this.firstFreeIndex);
        System.out.println("Size = " + this.size());
    }
    
}
