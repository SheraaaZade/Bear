public class NotSleepingState extends State{
    @Override
    public void attack(Bear b) {
        System.out.println("GroaaR");
    }

    @Override
    public void wakeup(Bear bear) {
        throw new RuntimeException("already not sleeping");
    }
}
