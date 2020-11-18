public class CD implements Packable {
    private String artist;
    private String title;
    private int publicationYear;
    private double weight;

    public CD(String artist, String title, int publicationYear) {
        this.artist = artist;
        this.title = title;
        this.publicationYear = publicationYear;
        this.weight = 0.1;
    }
    @Override
    public double weight() {
        return 0.0;
    }
    @Override
    public String toString() {
        return this.artist + ": " + this.title +" (" + this.publicationYear + ")";
    }
}
