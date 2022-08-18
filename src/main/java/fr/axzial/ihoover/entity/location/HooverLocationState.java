package fr.axzial.ihoover.entity.location;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class HooverLocationState {

    private int x;

    private int y;

    private CardinalState cardinalState;

}
