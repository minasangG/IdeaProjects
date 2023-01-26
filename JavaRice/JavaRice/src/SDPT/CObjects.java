package SDPT;

public class CObjects {

    public static void main(String[] args) {
        CStudent one = new CStudent("Kamot", "Betlog",
                "69", "Kamote", "Rutherford",
                90, 95);

        CStudent two = new CStudent("Kamot", "Itlog",
                "69", "Kamote", "Rutherford",
                69, 150);

        one.introduceSelf();
        one.evaluateGrade();
        two.introduceSelf();
        two.evaluateGrade();
    }
}
