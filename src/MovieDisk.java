public class MovieDisk extends Disk {
    private String director;

    public MovieDisk(String title, String artist, double price, String director) {
        super(title, artist, price);
        this.director = director;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " (Режиссёр: " + director + ")";
    }
}
