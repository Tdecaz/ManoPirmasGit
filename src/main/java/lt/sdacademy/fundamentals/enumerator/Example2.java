package lt.sdacademy.fundamentals.enumerator;

public enum Example2 {

    BMW(2, "AUDI", true);


    private final int engineSize;
    private final String carName;
    private final boolean runAndDrive;

    Example2(int engineSize, String carName, boolean runAndDrive) {

        this.engineSize = engineSize;
        this.carName = carName;
        this.runAndDrive = runAndDrive;
    }

    public int getEngineSize() {
        return this.engineSize;
    }

    public String getCarName() {
        return this.carName;
    }
}



