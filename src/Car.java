class Car {
    private static Car instance;
    private DrivingMode drivingMode;

    private Car() {
        drivingMode = new EcoMode();
    }

    public static Car getInstance() {
        if (instance == null) {
            instance = new Car();
        }
        return instance;
    }

    public void setDrivingMode(DrivingMode drivingMode) {
        this.drivingMode = drivingMode;
    }

    public void drive() {
        System.out.println("Car is in:");
        drivingMode.applyMode();
    }
}