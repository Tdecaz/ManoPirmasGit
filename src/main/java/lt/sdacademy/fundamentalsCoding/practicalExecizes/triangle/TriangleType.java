package lt.sdacademy.fundamentalsCoding.practicalExecizes.triangle;

public enum TriangleType {

    EQUILATERAL("lygiakrastis"),
    EQUAL_SIDE("lygiasonis"),
    OBTUSE("bukas");

    private String triangleDescription;

    TriangleType(String triangleDescription) {
        this.triangleDescription = triangleDescription;
    }

    public String getTriangleDescription() {
        return triangleDescription;
    }

}
