package br.com.alura.screensound.cli;

import br.com.alura.screensound.models.Artist;
import br.com.alura.screensound.models.Song;
import br.com.alura.screensound.models.enums.ArtistType;
import br.com.alura.screensound.repository.ArtistRepository;
import br.com.alura.screensound.repository.SongRepository;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class MainCli {
    private final Scanner sc = new Scanner(System.in);
    private ArtistRepository artistRepository;
    private SongRepository songRepository;

    public MainCli(ArtistRepository artistRepository, SongRepository songRepository) {
        this.artistRepository = artistRepository;
        this.songRepository = songRepository;
    }

    public void start() {
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\nScreen Sound ============================");
            System.out.println("Bem vindo ao programa, escolha uma opção:");
            System.out.println("1 - Cadastrar artista");
            System.out.println("2 - Cadastrar música");
            System.out.println("3 - Listar artistas");
            System.out.println("4 - Listar músicas");
            System.out.println("5 - Buscar artista");
            System.out.println("6 - Buscar músicas");
            System.out.println("0 - Sair");
            System.out.print(">> ");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1:
                    registerArtist();
                    break;
                case 2:
                    registerSong();
                    break;
                case 3:
                    System.out.println("\nListagem de artistas ====================");
                    listArtists();
                    break;
                case 4:
                    System.out.println("\nListagem de músicas =====================");
                    listSongs();
                    break;
                case 5:
                    searchArtist();
                case 6:
                    searchSong();
                case 0:
                    System.out.println("Até mais!");
                    break;
                default:
                    System.out.println("[!] - Opção inválida");
            }
        }
    }

    private void registerArtist() {
        var opcao = -1;
        while (opcao != 0) {
            System.out.println("\nCadastro de artista =====================");

            var artist = new Artist();
            System.out.print("Nome: ");
            artist.setName(sc.nextLine());

            System.out.print("Biografia: ");
            artist.setBio(sc.nextLine());

            System.out.print("Tipo (Solo, Dupla ou Banda): ");
            artist.setType(ArtistType.fromPortugueseTranslation(sc.nextLine()));

            System.out.print("Gêneros (separe com espaço e vírgula): ");
            var genres = Arrays.asList(sc.nextLine().split(", "));
            artist.setGenres(genres);

            if (artist.getType() == ArtistType.SOLO) {
                System.out.print("Data de nascimento: ");
                artist.setBirthDate(LocalDate.parse(sc.nextLine()));
            }

            System.out.print("Website: ");
            artist.setBio(sc.nextLine());

            System.out.println("\n[i] - Salvando...");
            artistRepository.save(artist);
            System.out.println("[i] - Artista salvo!\n");

            var validOption = false;
            while (!validOption) {
                System.out.println("Deseja cadastrar outro artista?");
                System.out.println("0 - Não");
                System.out.println("1 - Sim");
                System.out.print(">> ");
                opcao = sc.nextInt();

                switch (opcao) {
                    case 0:
                    case 1:
                        validOption = true;
                        break;
                    default:
                        System.out.println("\n[!] - Opção inválida\n");
                }
            }
        }
    }

    private void registerSong() {
        var opcao = -1;
        while (opcao != 0) {
            System.out.println("\nCadastro de música ======================");

            var song = new Song();
            listArtists();
            System.out.print("Nome do artista: ");
            var artistName = sc.nextLine();
            var artist = artistRepository.findByName(artistName);
            if (artist.isEmpty()) {
                System.out.println("\n[!] - Artista não encontrado\n");
                break;
            }
            song.setArtist(artist.get());

            System.out.print("Nome: ");
            song.setTitle(sc.nextLine());

            System.out.print("Ano de lançamento: ");
            song.setAno(sc.nextInt());
            sc.nextLine();

            System.out.print("Duração em segundos: ");
            song.setDuration(Duration.ofSeconds(sc.nextInt()));
            sc.nextLine();

            System.out.print("Gêneros (separe com espaço e vírgula): ");
            var genres = Arrays.asList(sc.nextLine().split(", "));
            song.setGenres(genres);

            System.out.println("\n[i] - Salvando...");
            songRepository.save(song);
            System.out.println("[i] - Música salva!\n");

            var validOption = false;
            while (!validOption) {
                System.out.println("Deseja cadastrar outra música?");
                System.out.println("0 - Não");
                System.out.println("1 - Sim");
                System.out.print(">> ");
                opcao = sc.nextInt();

                switch (opcao) {
                    case 0:
                    case 1:
                        validOption = true;
                        break;
                    default:
                        System.out.println("\n[!] - Opção inválida\n");
                }
            }
        }
    }

    private void listArtists() {
        var artists = artistRepository.findAll();
        if (artists.isEmpty()) System.out.println("Nenhum artista cadastrado");
        artists.forEach(System.out::println);
    }

    private void listSongs() {
        var songs = songRepository.findAll();
        if (songs.isEmpty()) System.out.println("Nenhuma música cadastrada");
        songs.forEach(System.out::println);
    }

    private void searchArtist() {
    }

    private void searchSong() {
    }
}
