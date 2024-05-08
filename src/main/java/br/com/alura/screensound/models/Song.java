package br.com.alura.screensound.models;

import jakarta.persistence.*;

import java.time.Duration;
import java.util.Set;

@Entity
@Table(name = "songs")
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private Duration duration;
    private Integer releaseYear;

    @ManyToOne
    private Artist artist;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<MusicGenre> genres;

    public Song() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Set<MusicGenre> getGenres() {
        return genres;
    }

    public void setGenres(Set<MusicGenre> genres) {
        this.genres = genres;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        int minutes = (int) duration.getSeconds() / 60;
        int seconds = (int) (duration.getSeconds() - minutes * 60);

        return title + " - " + artist.getName() + " (" + minutes + ":" +
               String.format("%02d", seconds) + ")";
    }
}
