package fr.axzial.ihoover;

import fr.axzial.ihoover.exception.InstructionNotPresentException;

import java.util.List;
import java.util.Optional;

public class IHooverApp {

    public static void main(String[] args) {
        String rawInstructions = Optional.ofNullable(args[0]).orElseThrow(InstructionNotPresentException::new);
        List<String> instructionsList = rawInstructions
                .chars()
                .mapToObj(c -> (char) c)
                .toList()
                .stream()
                .map(Object::toString)
                .toList();
        new IHooverLauncher(instructionsList);
    }

}
