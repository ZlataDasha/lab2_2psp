import java.util.Objects;

public abstract class Disk implements Orderable {
    private String title;
    private String artist;
    private double price;

    public Disk(String title, String artist, double price) {
        this.title = title;
        this.artist = artist;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return title + " от " + artist;
    }

    @Override
    public String toString() {
        return "Диск{" +
                "название='" + title + '\'' +
                ", артист='" + artist + '\'' +
                ", цена=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Disk)) return false;
        Disk disk = (Disk) o;
        return Double.compare(disk.price, price) == 0 &&
                title.equals(disk.title) &&
                artist.equals(disk.artist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist, price);
    }
}