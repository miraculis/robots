package net.az.protocol.tlink;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by Светлана on 17.05.2017.
 */
@AllArgsConstructor
@Getter
public abstract class ExecutionReport extends TReport {
    private final String commandId;
}
