package br.com.alura.screensound;

import br.com.alura.screensound.cli.MainCli;
import br.com.alura.screensound.repository.ArtistRepository;
import br.com.alura.screensound.repository.MusicGenreRepository;
import br.com.alura.screensound.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenSoundApplication implements CommandLineRunner {
    @Autowired
    private ArtistRepository artistRepository;

    @Autowired
    private SongRepository songRepository;

    @Autowired
    private MusicGenreRepository musicGenreRepository;

    public static void main(String[] args) {
        SpringApplication.run(ScreenSoundApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        new MainCli(artistRepository, songRepository, musicGenreRepository).start();
    }
}
