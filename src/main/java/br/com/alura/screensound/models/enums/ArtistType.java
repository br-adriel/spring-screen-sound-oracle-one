package br.com.alura.screensound.models.enums;

public enum ArtistType {
    SOLO("Solo"),
    DUO("Dupla"),
    BAND("Banda");

    private String portugueseTranslation;

    ArtistType(String portugueseTranslation) {
        this.portugueseTranslation = portugueseTranslation;
    }
}
