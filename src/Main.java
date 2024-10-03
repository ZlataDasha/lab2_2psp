public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        MusicDisk musicDisk = new MusicDisk("БелыЙ вечер", "Комбинация", 19.99, "Поп");
        MovieDisk movieDisk = new MovieDisk("Майор Гром", "Bubble Studio", 14.99, "Олег Трофим");

        order.addItem(musicDisk);
        order.addItem(movieDisk);

        order.printOrderDetails();
    }
}