package Productv4;

public class Music extends Product {

    private String artist;
    private String label;

    public Music() {
        super();
        artist = "";
        label = "";
        count++;
    }

    public void setArtist(String Artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setLabel(String Label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return super.toString() + " by " + artist + " / " + label;
    }
}



