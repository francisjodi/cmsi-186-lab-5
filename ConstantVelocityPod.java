public class ConstantVelocityPod extends Pod {
    public ConstantVelocityPod(String name, double velocity) {
        super(name, t -> velocity);
    }
    public double distancedTraveled(double startTime, double endTime) {
      return (endTime - startTime) * (v(startTime) + v(endTime));
}
}
