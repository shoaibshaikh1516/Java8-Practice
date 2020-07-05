package LogicalAndOrXor;

public class LogicalAndOrXorMain {

    public static void main(String[] args) {
        final int MAX_INT = 50;
        final int sInt7 = 7;
        final int mInt16 = 16;

        // if (sInt7 > mInt16 && mInt16 < 50)
        if (Boolean.logicalAnd(sInt7 > mInt16, mInt16 < MAX_INT)) {
            System.out.println("Boolean.logicalAnd returned true");
        } else {
            System.out.println("Boolean.logicalAnd returned false");
        }

        // if (sInt7 > mInt16 || mInt16 < 50)
        if (Boolean.logicalOr(sInt7 > mInt16, mInt16 < MAX_INT)) {
            System.out.println("Boolean.logicalOr returned true");
        } else {
            System.out.println("Boolean.logicalOr returned false");
        }

        // if (sInt7 > mInt16 ^ mInt16 < 50)
        if (Boolean.logicalXor(sInt7 > mInt16, mInt16 < MAX_INT)) {
            System.out.println("Boolean.logicalXor returned true");
        } else {
            System.out.println("Boolean.logicalXor returned false");
        }

        if (Boolean.logicalAnd(
                Boolean.logicalOr(sInt7 > mInt16, mInt16 < MAX_INT),
                Boolean.logicalOr(sInt7 <= mInt16, mInt16 > MAX_INT))) {
            System.out.println("Combination returned true");
        } else {
            System.out.println("Combination returned false");
        }
    }

}