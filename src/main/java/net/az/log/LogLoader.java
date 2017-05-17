package net.az.log;

import java.io.*;

/**
 * Created by Светлана on 17.05.2017.
 */
public class LogLoader implements Closeable {
    private final BufferedReader in;

    public LogLoader(InputStream in) {
        this.in = new BufferedReader(new InputStreamReader(in));
    }

    Displayable getNext() throws IOException {
        return toD(in.readLine());
    }

    private Displayable toD(String x) {throw new UnsupportedOperationException();}

    @Override
    public void close() throws IOException {
        in.close();
    }
}
