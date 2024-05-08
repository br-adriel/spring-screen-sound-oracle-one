package br.com.alura.screensound.repository;

import br.com.alura.screensound.models.MusicGenre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicGenreRepository extends JpaRepository<MusicGenre, String> {
}
