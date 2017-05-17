package net.az.protocol;

import net.az.tasks.Task;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Светлана on 17.05.2017.
 */
public abstract class Builder {
    private final List<Command> cmds = new LinkedList<>();

    public Builder withTask(Task t) {
        cmds.addAll(toCmds(t));
        return this;
    }

    public List<Command> build() {
        return cmds;
    }

    protected abstract List<Command> toCmds(Task t);
}
