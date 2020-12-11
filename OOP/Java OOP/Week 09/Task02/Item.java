package Task02;

public class Item {
    protected String title;
    protected String playingTime;
    protected String comment;
    protected boolean gotIt;

    Item(String title, String playingTime) {
        this.title = title;
        this.playingTime = playingTime;
        this.comment = "";
        this.gotIt = false;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return this.comment;
    }

    public void setOwned(boolean owned) {
        this.gotIt = owned;
    }

    public boolean getOwned() {
        return this.gotIt;
    }

    public void info() {
        System.out.println("Title: " + this.title);
        System.out.println("Playing time: " + this.playingTime);
        System.out.println("Comment: " + this.comment);
        System.out.println("Owned: " + this.gotIt);
    }
}
