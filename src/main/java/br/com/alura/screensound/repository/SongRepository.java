package br.com.alura.screensound.repository;

import br.com.alura.screensound.models.Song;
import org.springframework.data.repository.Repository;

public interface SongRepository extends Repository<Song, Long> {
}
