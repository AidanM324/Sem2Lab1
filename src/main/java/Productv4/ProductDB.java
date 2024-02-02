package Productv4;


public class ProductDB {


    public static Product getProduct(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or database
        // For now, this code just uses if/else statements
        // to return the correct product data

        Product p = null;
        if (productCode.equalsIgnoreCase("java")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            p = myBook;
        } else if (productCode.equalsIgnoreCase("jsp")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
            p = myBook;
        } else if (productCode.equalsIgnoreCase("mysql")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
            p = myBook;
        }

        if (productCode.equalsIgnoreCase("studios")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            p = mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
            p = mySoftware;
        } else if (productCode.equalsIgnoreCase("oracle")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            p = mySoftware;
        }

        if (productCode.equalsIgnoreCase("2003")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("College Dropout");
            myMusic.setPrice(27.50);
            myMusic.setArtist("Kanye West");
            myMusic.setLabel("Deathrow Records");
            p = myMusic;
        } else if (productCode.equalsIgnoreCase("2013")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("1989");
            myMusic.setPrice(20.50);
            myMusic.setArtist("Taylor Swift");
            myMusic.setLabel("Spin Records");
            p = myMusic;
        } else if (productCode.equalsIgnoreCase("2002")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Scorpian");
            myMusic.setPrice(18.50);
            myMusic.setArtist("Drake");
            myMusic.setLabel("OVO Sounds");
            p = myMusic;
        }

        if (productCode.equalsIgnoreCase("4k")) {
            TV myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("Panasonic 4K Oled Display");
            myTV.setPrice(2700.50);
            myTV.setScreensize("52");
            myTV.setManufacture("Panasonic");
            p = myTV;
        } else if (productCode.equalsIgnoreCase("Portable")) {
            TV myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("Small screen, portable tv.");
            myTV.setPrice(200.50);
            myTV.setScreensize("14");
            myTV.setManufacture("Samsung");
            p = myTV;
        } else if (productCode.equalsIgnoreCase("3D")) {
            TV myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("3D TV.");
            myTV.setPrice(2000.50);
            myTV.setScreensize("40");
            myTV.setManufacture("Sony");
            p = myTV;
        }
        return p;
    }
    //  public static Book or Software getProduct(String productCode) {
    // In a more realistic application, this code would get the data for the product from a file or database
    // For now, this code just uses if/else statements to return the correct product data

    //We need all the book and software objects, but what kind of object do we return?
    //}
}

