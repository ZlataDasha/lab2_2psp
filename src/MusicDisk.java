public class MusicDisk extends Disk {
    private String genre;

    public MusicDisk(String title, String artist, double price, String genre) {
        super(title, artist, price);
        this.genre = genre;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " (Жанр: " + genre + ")";
    }
}