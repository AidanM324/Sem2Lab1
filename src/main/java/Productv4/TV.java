package Productv4;

public class TV extends Product {

    private String screensize ;
    private String manufacture;

    public TV() {
        super();
        screensize = "";
        manufacture = "";
        count++;
    }

    public void setScreensize(String Screensize) {
        this.screensize = screensize;
    }

    public String getScreensize() {
        return screensize;
    }

    public void setManufacture(String Manufacture) {
        this.manufacture = manufacture;
    }

    public String getManufacture() {
        return manufacture;
    }

    @Override
    public String toString() {
        return super.toString() + " / " + screensize + " | " + " by " + manufacture; }
}

