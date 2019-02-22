package pl.sauermann.springbootplaylist.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.sauermann.springbootplaylist.model.PlayType;
import pl.sauermann.springbootplaylist.model.Playlist;
import pl.sauermann.springbootplaylist.model.Position;
import pl.sauermann.springbootplaylist.model.Truck;

import java.util.Arrays;

class PlaylistServiceTest {

    private Playlist playlist;
    private PlaylistService playlistService;

    @BeforeEach
    void setUp() {
        buildingPlaylist();
    }

    private void buildingPlaylist() {
        Position firstPosition = new Position(Arrays.asList(
                new Truck("ACDC - Thuder Strom"),
                new Truck("SOAD - Lonely Day")
        ));
        Position secondPosition = new Position(Arrays.asList(
                new Truck("Metalica - Nothing Else Matters1"),
                new Truck("Metalica - Nothing Else Matters2"),
                new Truck("Metalica - Nothing Else Matters3"),
                new Truck("Metalica - Nothing Else Matters4"),
                new Truck("Metalica - Nothing Else Matters5"),
                new Truck("Metalica - Nothing Else Matters6"),
                new Truck("Metalica - Nothing Else Matters7"),
                new Truck("Metalica - Nothing Else Matters8"),
                new Truck("Metalica - Nothing Else Matters9"),
                new Truck("AC Drinker - Cos tam, cos tam"))
                , PlayType.RANDOM);
        Position thirdPosition = new Position(Arrays.asList(
                new Truck("Chlopaki nie placza"))
                , PlayType.LOOP);

        playlist = new Playlist();
        playlistService = new PlaylistService();
        playlistService.setPlaylist(playlist);
        playlistService.addPositionToPlaylist(firstPosition);
        playlistService.addPositionToPlaylist(secondPosition);
        playlistService.addPositionToPlaylist(thirdPosition);
    }

    @Test
    void shouldPrintPlaylistInCorrectOrder() {
        playlist.play().forEach(System.out::println);
    }

}