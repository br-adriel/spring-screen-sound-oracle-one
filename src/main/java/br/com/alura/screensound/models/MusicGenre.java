package br.com.alura.screensound.models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "music_genres")
public class MusicGenre {
    @ManyToMany
    Set<Song> songs;

    @ManyToMany
    Set<Artist> artists;

    @Id
    @Column(unique = true, nullable = false)
    private String name;

    public MusicGenre() {
    }

    public MusicGenre(String name) {
        this.name = name.toLowerCase().trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Song> getSongs() {
        return songs;
    }

    public void setSongs(Set<Song> songs) {
        this.songs = songs;
    }

    public Set<Artist> getArtists() {
        return artists;
    }

    public void setArtists(Set<Artist> artists) {
        this.artists = artists;
    }
}
