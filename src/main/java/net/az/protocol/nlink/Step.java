package net.az.protocol.nlink;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.az.protocol.Direction;

/**
 * Created by Светлана on 17.05.2017.
 */
@AllArgsConstructor
@Getter
public class Step extends NCommand {

    private final Direction d;
}
