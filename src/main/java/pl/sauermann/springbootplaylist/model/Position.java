package pl.sauermann.springbootplaylist.model;

import lombok.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor
@Repository
public class Position {

    private List<SimplePosition> positionList = new ArrayList<>();
    private PlayType playType;

    public Position(List<SimplePosition> positionList) {
        this.positionList = positionList;
        playType = PlayType.SEQUENTIALLY;
    }

}
