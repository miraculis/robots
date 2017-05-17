package net.az.protocol.nlink;

import net.az.protocol.Builder;
import net.az.protocol.Command;
import net.az.tasks.Task;

import java.util.List;

/**
 * Created by Светлана on 17.05.2017.
 */
public class NBuilder extends Builder {
    @Override
    protected List<Command> toCmds(Task t) {
        throw new UnsupportedOperationException();
    }
}
