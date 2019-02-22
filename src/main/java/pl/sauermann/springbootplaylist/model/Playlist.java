package pl.sauermann.springbootplaylist.model;

import lombok.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
@Getter
@Setter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor
public class Playlist implements Playable {

    private List<Position> playList = new ArrayList<>();

    @Override
    public List<String> play() {
        List<String> result = new ArrayList<>();
        playlistPreparation(result);
        return result;
    }

    private void playlistPreparation(List<String> result) {
        for (Position position : playList) {
            if (position.getPlayType() == PlayType.SEQUENTIALLY) {
                position.getPositionList()
                        .forEach(item -> result.add(item.toString()));
            } else if (position.getPlayType() == PlayType.LOOP) {
                for (int i = 0; i < 5; i++) {
                    position.getPositionList()
                            .forEach(item -> result.add(item.toString()));
                }
            } else if (position.getPlayType() == PlayType.RANDOM) {
                List<SimplePosition> temporary = new ArrayList<>(position.getPositionList());
                Collections.shuffle(temporary);
                temporary.forEach(item -> result.add(item.toString()));
            }
            result.add("------");
        }
    }
}
