import java.lang.management.ManagementFactory;

public class StartupTimeMs {
  public static void main(String[] args) {
    System.out.println("Welcome to Java "+ Runtime.version().feature());
    long startTime = ManagementFactory.getRuntimeMXBean().getStartTime();
    long currentTime = System.currentTimeMillis();
    System.out.println("JVM Startup time (ms): " + (currentTime - startTime));
  }
}
