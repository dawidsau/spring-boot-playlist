package pl.sauermann.springbootplaylist.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;
import pl.sauermann.springbootplaylist.model.Playlist;
import pl.sauermann.springbootplaylist.model.Position;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Service
public class PlaylistService<T extends Position> implements ListService<T> {

    private Playlist playlist;

    @Override
    public void addPositionToPlaylist(Position position) {
        playlist.getPlayList().add(position);
    }

    @Override
    public void removeObjectFromPlaylist(Position position) {
        playlist.getPlayList().removeIf(p -> p.equals(position));
    }
}
