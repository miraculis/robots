package net.az.protocol.tlink;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by Светлана on 17.05.2017.
 */
@AllArgsConstructor
@Getter
public class Coords extends TReport {
    private final int lon;
    private final int lat;
}
