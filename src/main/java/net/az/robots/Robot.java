package net.az.robots;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.az.log.Logger;
import net.az.protocol.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by miraculis on 16.05.2017.
 */
@AllArgsConstructor
@Getter
public abstract class Robot {
    private ReportsListener listener;
    private final Logger log = new Logger();

    public int getTotalResource() {throw new UnsupportedOperationException();}
    public int getResourceLeft() {throw new UnsupportedOperationException();}

    public void connect() {}
    public void disconnect() {}

    public boolean check(List<Command> cmds) {
        throw new UnsupportedOperationException();
    }

    public void submit(List<Command> commands) {
        commands.forEach(log::log);
        toRobot(commands.stream().map(Command::toProtocol).collect(Collectors.joining("\n")));
    }

    private void fromRobot(String report) {
        List<Report> x = Arrays.stream(report.split("\\n")).map(Deserializer::fromProtocol).collect(Collectors.toList());
        x.forEach(log::log);
        listener.reports(x);
    }

    private void toRobot(String x) {

    }
}
