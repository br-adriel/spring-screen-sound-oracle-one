package br.com.alura.screensound.models.enums;

public enum ArtistType {
    SOLO("Solo"),
    DUO("Dupla"),
    BAND("Banda");

    private String portugueseTranslation;

    ArtistType(String portugueseTranslation) {
        this.portugueseTranslation = portugueseTranslation;
    }

    public static ArtistType fromPortugueseTranslation(String text) {
        for (ArtistType artistType : ArtistType.values()) {
            if (artistType.portugueseTranslation.equalsIgnoreCase(text)) {
                return artistType;
            }
        }
        throw new IllegalArgumentException("Unknown ArtistType value");
    }

    public String getPortugueseTranslation() {
        return portugueseTranslation;
    }
}
