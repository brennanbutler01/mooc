
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

        public boolean largerThan(Apartment apartment){
            if (this.squares > apartment.squares) {
                return true;
            }
            return false;
        }

        public int priceDifference(Apartment compared) {
            return Math.abs((compared.princePerSquare * compared.squares) - (this.princePerSquare * this.squares));
        }

        public boolean moreExpensiveThan(Apartment compared) {
            return (this.princePerSquare * this.squares) > (compared.princePerSquare * compared.squares);
        }

    }
