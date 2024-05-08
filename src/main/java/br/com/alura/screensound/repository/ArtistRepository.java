package br.com.alura.screensound.repository;

import br.com.alura.screensound.models.Artist;
import br.com.alura.screensound.models.enums.ArtistType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
    Optional<Artist> findByName(String name);

    List<Artist> findAllByNameContainingIgnoreCase(String name);

    List<Artist> findAllByBirthDateBetween(LocalDate minDate, LocalDate maxDate);

    List<Artist> findAllByType(ArtistType artistType);

    @Query("SELECT a" +
           " FROM Artist a" +
           " LEFT JOIN FETCH a.genres g" +
           " WHERE g.name ILIKE %:genre%")
    List<Artist> artistsByGenre(String genre);
}
