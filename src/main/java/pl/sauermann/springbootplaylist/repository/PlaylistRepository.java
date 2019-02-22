package pl.sauermann.springbootplaylist.repository;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;
import pl.sauermann.springbootplaylist.model.PlayType;
import pl.sauermann.springbootplaylist.model.Playlist;
import pl.sauermann.springbootplaylist.model.Position;
import pl.sauermann.springbootplaylist.model.Truck;

import java.util.Arrays;

@Getter
@Setter
@AllArgsConstructor
@Repository
public class PlaylistRepository {

    private Playlist playlist;

    public PlaylistRepository() {
        buildPlaylist();
    }

    private void buildPlaylist() {
        Position firstPosition = new Position(Arrays.asList(
                new Truck("ACDC - Thuder Storm"),
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

        playlist = new Playlist(
                Arrays.asList(
                        firstPosition,
                        secondPosition,
                        thirdPosition)
        );
    }
}

