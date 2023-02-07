package org.knowyourinfo.scraper;

import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LabelChanger {
    public String changeLabel() {
        return "Changed Label";
    }

    public void scrape() {
        // initializing the HTML Document page variable
        String userAgentString = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36";
        String headerLang = "Accept-Language";
        String headerValue = "*";
        Document doc;

        try {
            // fetching the target website
            doc = Jsoup.connect("https://scrapeme.live/shop").userAgent(userAgentString).header(headerLang, headerValue).get();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        List<PokemonProduct> pokemonProducts = new ArrayList<>();

        Elements products = doc.select("li.product");

        for (Element product : products) {
            PokemonProduct pokemonProduct = new PokemonProduct();

            pokemonProduct.setUrl(product.selectFirst("a").attr("href"));
            pokemonProduct.setImage(product.selectFirst("img").attr("src"));
            pokemonProduct.setName(product.selectFirst("h2").text());
            pokemonProduct.setPrice(product.selectFirst("span").text());

            pokemonProducts.add(pokemonProduct);
        }
    }
}
