package br.com.alura.screensound.models;

import br.com.alura.screensound.models.enums.ArtistType;

import java.time.LocalDate;
import java.util.ArrayList;

public class Artist {
    private long id;
    private String name;
    private String bio;
    private LocalDate birthDate;
    private ArrayList<String> genres;
    private String website;
    private ArtistType type;

    public Artist() {
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public ArrayList<String> getGenres() {
        return genres;
    }

    public void setGenres(ArrayList<String> genres) {
        this.genres = genres;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public ArtistType getType() {
        return type;
    }

    public void setType(ArtistType type) {
        this.type = type;
    }
}
