package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Brontosaurus {
    @JsonProperty // Forteller Jackson at dette skal serialiseres
    private String food = "Eats leaves from a tree.";

    public String getFood() {
        return food;
    }
}
