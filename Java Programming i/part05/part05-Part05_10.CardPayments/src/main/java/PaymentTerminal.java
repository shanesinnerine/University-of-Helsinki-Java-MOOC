
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        money = 1000;
    }

    public double eatAffordably(double payment) {
        if(payment >= 2.50){
            money += 2.50;
            this.affordableMeals++;
            return payment - 2.50;
        }
        return payment;
    }
    public boolean eatAffordably(PaymentCard card){
        if(card.balance() >= 2.50){
            card.takeMoney(2.50);
            this.affordableMeals++;
            return true;
        }
        return false;
    }

    public double eatHeartily(double payment) {
        if(payment >= 4.30){
            money += 4.30;
            this.heartyMeals++;
            return payment - 4.30;
        }
        return payment;
    }
    public boolean eatHeartily(PaymentCard card){
        if(card.balance() >= 4.30){
            card.takeMoney(4.30);
            this.heartyMeals++;
            return true;
        }
        return false;
    }
    public void addMoneyToCard(PaymentCard card, double sum){
        if(sum >= 0){
            this.money += sum;
            card.addMoney(sum);
        }
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
