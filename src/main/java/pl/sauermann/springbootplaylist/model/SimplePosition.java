package pl.sauermann.springbootplaylist.model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor
public abstract class SimplePosition {

    private String name;

    @Override
    public String toString() {
        return name;
    }
}
