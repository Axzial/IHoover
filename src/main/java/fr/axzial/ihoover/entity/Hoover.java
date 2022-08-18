package fr.axzial.ihoover.entity;

import fr.axzial.ihoover.entity.instruction.HooverInstruction;
import fr.axzial.ihoover.entity.location.CardinalState;
import fr.axzial.ihoover.entity.location.HooverLocationState;
import fr.axzial.ihoover.entity.room.IHooverRoom;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Hoover {

    private HooverLocationState location;
    private IHooverRoom hooverRoom;

    public Hoover(int defaultX, int defaultY, CardinalState cardinalDefault, IHooverRoom room) {
        this.location = new HooverLocationState(defaultX, defaultY, cardinalDefault);
        this.hooverRoom = room;
    }

    public void executeInstruction(HooverInstruction hooverInstruction){
        switch (hooverInstruction){
            case A -> forward();
            case D -> rotatePlus90();
            case G -> rotateMinus90();
        }
    }

    public void forward() {
        int newX = location.getX() + location.getCardinalState().getX();
        int newY = location.getY() + location.getCardinalState().getY();
        if (hooverRoom.canMove(newX, newY)){
            location.setX(newX);
            location.setY(newY);
        }
    }

    public void rotatePlus90(){
        location.setCardinalState(location.getCardinalState().plus90());
    }

    public void rotateMinus90(){
        location.setCardinalState(location.getCardinalState().minus90());
    }

    public void printLocation() {
        System.out.println(location.toString());
    }

}
