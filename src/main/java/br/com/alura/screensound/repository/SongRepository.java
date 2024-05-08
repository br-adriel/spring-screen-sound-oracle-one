package br.com.alura.screensound.repository;

import br.com.alura.screensound.models.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.Duration;
import java.util.List;

public interface SongRepository extends JpaRepository<Song, Long> {
    List<Song> findAllByTitleContainingIgnoreCase(String title);

    List<Song> findAllByDurationBetween(Duration minDuration, Duration maxDuration);

    List<Song> findAllByReleaseYearBetween(int minYear, int maxYear);

    @Query("SELECT s" +
           " FROM Song s" +
           " LEFT JOIN FETCH s.genres g" +
           " WHERE g.name ILIKE %:genre%")
    List<Song> songsByGenre(String genre);

    @Query("SELECT s" +
           " FROM Song s" +
           " LEFT JOIN s.artist a" +
           " WHERE a.name ILIKE %:artistName%")
    List<Song> songsByArtistName(String artistName);
}
