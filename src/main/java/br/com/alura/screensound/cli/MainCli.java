package br.com.alura.screensound.cli;

import br.com.alura.screensound.repository.ArtistRepository;
import br.com.alura.screensound.repository.SongRepository;

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
                    listArtists();
                    break;
                case 4:
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
    }

    private void registerSong() {
    }

    private void listArtists() {
    }

    private void listSongs() {
    }

    private void searchArtist() {
    }

    private void searchSong() {
    }
}
