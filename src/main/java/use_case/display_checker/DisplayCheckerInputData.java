package use_case.display_checker;

/**
 * This class represents the input data for the Checker use case.
 */
public class DisplayCheckerInputData {

    private final String location;
    private final String weatherConditionOptions;
    private final int startChecking;
    private final int stopChecking;

    public DisplayCheckerInputData(String location, String weatherConditionOptions, int startChecking, int stopChecking) {
        this.location = location;
        this.weatherConditionOptions = weatherConditionOptions;
        this.startChecking = startChecking;
        this.stopChecking = stopChecking;
    }

    String getLocation() {return location;}

    String getWeatherConditionOptions() {return weatherConditionOptions;}

    int getStartChecking() {return startChecking;}

    int getStopChecking() {return stopChecking;}
}