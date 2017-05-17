package net.az.protocol.tlink;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.az.protocol.Direction;
import net.az.protocol.nlink.NCommand;

/**
 * Created by Светлана on 17.05.2017.
 */
@AllArgsConstructor
@Getter
public class Jump extends NCommand {
    private final Direction d;
}