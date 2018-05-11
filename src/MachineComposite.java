import java.util.List;
import java.util.ArrayList;

public class MachineComposite extends MachineComponent {

    private List<MachineComponent> components = new ArrayList<>();

    public void addComponent(MachineComponent mc) {

        components.add(mc);

    }

    public boolean isBroken() {
        if (broken) { return true; }

        for(MachineComponent mc: components) {

            if (mc.isBroken()) { return true; }

        }
        return false;
    }
}

