package homeworkChapter_8;

public class Exercise10TrafficLightTest {

    public static void main(String[] args) {
        System.out.println("Traffic Light:");

        //iterate over the values of the TrafficLight enum
        for (Exercise10TrafficLight light : Exercise10TrafficLight.values()) {
            System.out.printf("%-6s %d%n", light, light.getDuration());
        }
    }
}

//output
//Traffic Light:
//RED    100
//GREEN  60
//YELLOW 10