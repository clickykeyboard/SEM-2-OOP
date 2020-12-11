package Task02;

public class Main {
    public static void main(String args[]) {
        CD cd = new CD("Title", "Artist", "100", 12);
        DVD dvd = new DVD("Title", "Director", "200");

        System.out.println(dvd.getDirector());
        System.out.println(cd.getArtist());
    }
}
