package net.az;

import lombok.AllArgsConstructor;
import net.az.protocol.Builder;
import net.az.protocol.Command;
import net.az.protocol.nlink.NBuilder;
import net.az.protocol.tlink.TBuilder;
import net.az.robots.Robot;
import net.az.tasks.WorkPlan;

import java.util.List;

/**
 * Created by Светлана on 17.05.2017.
 */
@AllArgsConstructor
public class Executor {
    private final Robot robot;

    public void execute(WorkPlan plan) {
        Builder b = null;
        switch (robot.getClass().getSimpleName()) {
            case "Ant":
            case "Spyder": {
                b = new NBuilder();
                plan.getTasks().forEach(b::withTask);
                break;
            }
            case "Grasshopper": {
                b = new TBuilder();
                plan.getTasks().forEach(b::withTask);
                break;
            }
            default: {
                throw new UnsupportedOperationException();
            }

        }
        List<Command> cmds =  b.build();
        robot.connect();
        if (robot.check(cmds))
            robot.submit(cmds);
        robot.disconnect();
    }
}
