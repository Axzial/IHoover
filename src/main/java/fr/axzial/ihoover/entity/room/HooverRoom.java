package fr.axzial.ihoover.entity.room;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class HooverRoom implements IHooverRoom {

    private int x;

    private int y;

    @Override
    public boolean canMove(int x, int y){
        return (x <= this.x || x >= 0) && (y <= this.y || y >= 0);
    }

}
