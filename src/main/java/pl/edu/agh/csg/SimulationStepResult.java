package pl.edu.agh.csg;

import java.util.Arrays;

public class SimulationStepResult {

    private final boolean done;
    private final double[] obs;
    private final double reward;
    private final long[] vmCounts;

    public SimulationStepResult(boolean done, double[] obs, double reward, long[] vmCounts) {
        this.done = done;
        this.obs = obs;
        this.reward = reward;
        this.vmCounts = vmCounts;
    }

    public boolean isDone() {
        return done;
    }

    public double[] getObs() {
        return obs;
    }

    public double getReward() {
        return reward;
    }

    public long[] getVmCounts() {
        return vmCounts;
    }

    @Override
    public String toString() {
        return "SimulationStepResult{" +
                "done=" + done +
                ", obs=" + Arrays.toString(obs) +
                ", reward=" + reward +
                ", vms=" + Arrays.toString(vmCounts) +
                '}';
    }
}
