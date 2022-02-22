
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition){
        int newEuros = this.euros + addition.euros;
        int newCents = this.cents + addition.cents;
        Money newMoney = new Money(newEuros, newCents);
        return newMoney;
    }
    
    public Money minus(Money subtraction){
        if(this.lessThan(subtraction)){
            Money zero = new Money(0, 0);
            return zero;
        }
        int newEuros = this.euros - subtraction.euros;
        int newCents = this.cents - subtraction.cents;
        if(newCents < 0){
            newEuros--;
            newCents = 100 + newCents;
        }
        Money newMoney = new Money(newEuros, newCents);
        return newMoney;
    }
    
    public boolean lessThan(Money compared){
        if(this.euros < compared.euros){
            return true;
        }
        if(this.euros == compared.euros && this.cents < compared.cents){
            return true;
        }
        return false;
    }
}
