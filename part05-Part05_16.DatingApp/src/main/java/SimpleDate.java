
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void advance() {
        if (this.day == 30 && this.month == 12) {
            this.year++;
            this.day = 1;
            this.month = 1;
        } else if (this.day == 30) {
            this.month++;
            this.day = 1;
        } else {
            this.day++;
        }
    }

    public void advance(int numberOfDays) {
        for (int i = 0 ; i < numberOfDays; i++) {
            this.advance();
        }
    }


    public SimpleDate afterNumberOfDays(int howManyDays) {
        int totalDays = (howManyDays + this.day) + (this.month * 30) + (this.year * 360);
        int totalYears = (int) Math.floor(totalDays / 360);
        totalDays -=(totalYears * 360);
        int totalMonths = (int) Math.floor(totalDays/30);
        totalDays -=(totalMonths * 30);
        return new SimpleDate (totalDays, totalMonths, totalYears);
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

}
