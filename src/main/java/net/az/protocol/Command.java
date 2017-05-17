package net.az.protocol;

import lombok.Getter;

import java.io.Serializable;
import java.util.UUID;

/**
 * Created by Светлана on 17.05.2017.
 */
@Getter
public abstract class Command implements Serializable {
    private final String id;

    public Command() {
        id = UUID.randomUUID().toString();
    }

    public abstract String toProtocol();
}