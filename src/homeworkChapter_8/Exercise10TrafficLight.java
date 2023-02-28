package homeworkChapter_8;

// enum class named TrafficLight wich declare the values of the enum and their respective durations
public enum Exercise10TrafficLight {
    RED(100), GREEN(60), YELLOW(10);

    //declare an instance variable to hold the duration of each traffic light
    private int duration;

    //define a constructor for the TrafficLight enum and initialize the duration instance variable
    Exercise10TrafficLight(int duration) {
        this.duration = duration;
    }

    //define a public method to get the duration of each traffic light
    //and return the duration instance variable
    public int getDuration() {
        return duration;
    }
}

