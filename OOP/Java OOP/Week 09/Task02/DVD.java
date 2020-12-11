package Task02;

public class DVD extends Item {


    private String director;

    DVD(String title, String director, String playingTime) {
        super(title, playingTime);
        this.director = director;
    }

    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public boolean getOwned() {
        return super.getOwned();
    }

    public void setOwned(boolean owned) {
        super.setOwned(owned);
    }

    public void info() {
        System.out.println("Director: " + this.director);
        super.info();
    }

}