package fr.axzial.ihoover;

import fr.axzial.ihoover.entity.Hoover;
import fr.axzial.ihoover.entity.instruction.HooverInstruction;
import fr.axzial.ihoover.entity.location.CardinalState;
import fr.axzial.ihoover.entity.room.HooverRoom;
import fr.axzial.ihoover.entity.room.IHooverRoom;

import java.util.List;
import java.util.Optional;

public class IHooverLauncher {

    public IHooverLauncher(List<String> instructions) {
        System.out.println("Launching IHoover...");

        System.out.println("Creating Room...");
        IHooverRoom hooverRoom = new HooverRoom(10, 10);

        System.out.println("Instantiating Hoover...");
        Hoover hoover = new Hoover(5, 5, CardinalState.N, hooverRoom);

        System.out.println("Giving Instructions...");
        instructions.stream()
                .map(HooverInstruction::findByAlias)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .forEach(hoover::executeInstruction);

        System.out.println("Location Ready...");
        hoover.printLocation();
    }

}
