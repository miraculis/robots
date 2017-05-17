package net.az.protocol.tlink;

import net.az.protocol.Builder;
import net.az.protocol.Command;
import net.az.tasks.Task;

import java.util.List;

/**
 * Created by Светлана on 17.05.2017.
 */
public class TBuilder extends Builder {
    @Override
    protected List<Command> toCmds(Task t) {
        throw new UnsupportedOperationException();
    }
}
