package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public void isFirstAliquot(int first, int second) {
        boolean notSpecialNumber = false;

        if (first % second == 0) {
            notSpecialNumber = true;
        }
        if (notSpecialNumber) {
            System.out.println("Not aliquot");
        } else {
            System.out.println("Aliquot");
        }
    }
}
