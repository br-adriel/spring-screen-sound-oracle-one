package br.com.alura.screensound.repository;

import br.com.alura.screensound.models.Artist;
import br.com.alura.screensound.models.enums.ArtistType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
    Optional<Artist> findByName(String name);

    List<Artist> findAllByNameContainingIgnoreCase(String name);

    List<Artist> findAllByBirthDateGreaterThanEqualLessThanEqual(LocalDate minDate, LocalDate maxDate);

    List<Artist> findAllByGenresContainingIgnoreCase(String genres);

    List<Artist> findAllByType(ArtistType artistType);
}
