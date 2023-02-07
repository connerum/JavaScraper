package org.knowyourinfo.scraper;

public class PokemonProduct {
    private String url;
    private String image;
    private String name;
    private String price;

    public void setUrl(String attr) {
    }

    public void setImage(String attr) {
    }

    public void setName(String h2) {
    }

    public void setPrice(String span) {
    }

    @Override
    public String toString() {
        return "{ \"url\":\"" + url + "\", "
                + " \"image\": \"" + image + "\", "
                + "\"name\":\"" + name + "\", "
                + "\"price\": \"" + price + "\" }";
    }

}
