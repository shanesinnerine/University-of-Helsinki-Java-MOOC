
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public void advance(){
        if(this.day < 30){
            this.day++;
            return;
        }
        if(this.month < 12){
            this.day = 1;
            this.month++;
            return;
        }
        this.day = 1;
        this.month = 1;
        this.year++;
    }
    
    public void advance(int numberOfDays){
        for(int i = 0; i < numberOfDays; i++){
            this.advance();
        }
    }
    
    public SimpleDate afterNumberOfDays(int numberOfDays){
        SimpleDate afterNumberOfDays = new SimpleDate(this.day, this.month, this.year);
        afterNumberOfDays.advance(numberOfDays);
        return afterNumberOfDays;
    }
}
