package pl.sauermann.springbootplaylist.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;
import pl.sauermann.springbootplaylist.model.Position;
import pl.sauermann.springbootplaylist.model.SimplePosition;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Service
public class PositionListService<T extends SimplePosition> implements ListService<T> {

    private Position position;

    @Override
    public void addPositionToPlaylist(SimplePosition simplePosition) {
        position.getPositionList().add(simplePosition);
    }

    @Override
    public void removeObjectFromPlaylist(SimplePosition simplePosition) {
        position.getPositionList().removeIf(o -> o.equals(simplePosition));
    }

}
