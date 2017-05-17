package net.az.protocol;

import net.az.protocol.tlink.TReport;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * Created by Светлана on 17.05.2017.
 */
public class Deserializer {
    private final static Map<String, Function<String, TReport>> dictionary = new HashMap<>();

    /**
     * Every Reposnse child whould call it method
     * @param x
     * @param f
     */
    public static void registry(String x, Function<String, TReport> f) {
        dictionary.put(x, f);
    }

    public static Report fromProtocol(String x) {
        String prefix = x.split("\\s")[0];
        Function<String, TReport> f = dictionary.get(prefix);
        if (f != null) return f.apply(x); else throw new IllegalArgumentException("invalid command " + prefix);
    }
}
