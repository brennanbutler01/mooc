public class Container {
    private int currentVolume;

    public Container() {
        this.currentVolume = 0;
    }

    public int contains() {
        return this.currentVolume;
    }

    public void add (int amount) {
        if (amount < 0) {
            this.currentVolume = this.currentVolume;
        } else if (amount + this.currentVolume > 100) {
            this.currentVolume = 100;
        } else {
            this.currentVolume += amount;
        }
    }

    public void remove (int amount) {
        if (amount < 0 ) {
            this.currentVolume = this.currentVolume;
        } else if (this.currentVolume - amount < 0) {
            this.currentVolume = 0 ;
        } else {
            this.currentVolume -=amount;
        }
    }

    @Override
    public String toString() {
        return this.currentVolume + "/100";
    }
}
