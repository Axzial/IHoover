package fr.axzial.ihoover.entity.instruction;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Getter
public enum HooverInstruction {

    D(List.of("D")),
    G(List.of("G")),
    A(List.of("A"));

    private final List<String> aliases;

    HooverInstruction(List<String> aliases) {
        this.aliases = aliases;
    }

    public static Optional<HooverInstruction> findByAlias(String alias){
        return Arrays.stream(values()).filter(x -> x.getAliases().stream().anyMatch(z -> z.equalsIgnoreCase(alias))).findFirst();
    }
}
