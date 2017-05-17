package net.az.protocol.tlink;

import net.az.protocol.Deserializer;

/**
 * Created by Светлана on 17.05.2017.
 */
public class Did extends ExecutionReport {
    private final static String prefix = "did";

    static {
        Deserializer.registry(prefix, Did::fromString);
    }

    public Did(String commandId) {
        super(commandId);
    }

    public static Did fromString(String x) {
        //todo:
        return new Did(x);
    }
}
