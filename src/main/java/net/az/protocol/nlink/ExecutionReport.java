package net.az.protocol.nlink;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by Светлана on 17.05.2017.
 */
@AllArgsConstructor
@Getter
public class ExecutionReport extends NReport {
    private final String commandId;
}
