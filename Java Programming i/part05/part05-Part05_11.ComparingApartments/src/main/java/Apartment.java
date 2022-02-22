
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared){
        if(this.squares > compared.squares){
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment compared, boolean absolute){
        int thisPrice = this.squares * this.pricePerSquare;
        int comparedPrice = compared.squares * compared.pricePerSquare;
        int difference = thisPrice - comparedPrice;
        if(difference < 0 && absolute == true){
            difference *= -1;
        }
        return difference;
    }
    public int priceDifference(Apartment compared){
        return this.priceDifference(compared, true);
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        if(this.priceDifference(compared, false) > 0){
            return true;
        }
        return false;
    }

}
