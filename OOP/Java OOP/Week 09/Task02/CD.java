package Task02;

public class CD extends Item {
    private String artist;
    private int numberOfTracks;

    CD(String title, String artist, String playingTime, int numberOfTracks) {
        super(title, playingTime);

        this.artist = artist;
        this.numberOfTracks = numberOfTracks;
    }

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getNumberOfTracks() {
        return this.numberOfTracks;
    }

    public void setNumberOfTracks(int numberOfTracks) {
        this.numberOfTracks = numberOfTracks;
    }

    public boolean getOwned() {
        return super.getOwned();
    }

    public void setOwned(boolean owned) {
        super.setOwned(owned);
    }

    public void info() {
        System.out.println("Artist: " + this.artist);
        super.info();
        System.out.println("Number of tracks: " + this.numberOfTracks);
    }
    
}
