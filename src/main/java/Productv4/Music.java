package Productv4;

public class Music extends Product {

    private String artist;

    public Music() {
        super();
        artist = "";
        count++;
    }

    public void setArtist(String Artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public String toString() {
        return super.toString() + " by " + artist;
    }
}

