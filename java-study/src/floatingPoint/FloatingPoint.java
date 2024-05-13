package floatingPoint;

public class FloatingPoint {
    public static String numToBits(Number number) {
        String strBits = "unknown";
        if (number instanceof Double) { // 8bit
            double d = (double) number;
            long bits = Double.doubleToLongBits(d);
            strBits = String.format("%64s", Long.toBinaryString(bits)).replace(' ', '0');
        } else if (number instanceof Float) { // 16bit
            float f = (float) number;
            int bits = Float.floatToIntBits(f);
            strBits = String.format("%32s", Integer.toBinaryString(bits)).replace(' ', '0');
        }
        return strBits;
    }

    public static String numToExponentBits(Number number) {
        String strBits = "unknown";
        if (number instanceof Double) { // 8bit
            double d = (double) number;
            long bits = Double.doubleToLongBits(d);
            strBits = String.format("%64s", Long.toBinaryString(bits)).replace(' ', '0');
        } else if (number instanceof Float) { // 16bit
            float f = (float) number;
            int bits = Float.floatToIntBits(f);
            strBits = String.format("%32s", Integer.toBinaryString(bits)).replace(' ', '0');
        }
        return strBits;
    }

    public static String numToMantissaBits(Number number) {
        String strBits = "unknown";
        if (number instanceof Double) { // 8bit
            double d = (double) number;
            long bits = Double.doubleToLongBits(d);
            strBits = String.format("%64s", Long.toBinaryString(bits)).replace(' ', '0');
        } else if (number instanceof Float) { // 16bit
            float f = (float) number;
            int bits = Float.floatToIntBits(f);
            strBits = String.format("%32s", Integer.toBinaryString(bits)).replace(' ', '0');
        }
        return strBits;
    }

    public static void main(String[] args) {
        float floatValue = -112.8125f;
        System.out.println(floatValue);

        int intValue = Float.floatToIntBits(floatValue);
        String binaryString = Integer.toBinaryString(intValue);
        System.out.println("binaryString: " + binaryString);
        binaryString = String.format("%32s", binaryString).replace(' ', '0');

        System.out.println("Float value: " + floatValue); // 1.4E-45
        System.out.println("Binary representation: " + binaryString); // 00000000000000000000000000000001

        float unsignFloatMinValue = Float.MIN_VALUE; // 1.4E-45 (1.4e-45f)
        float unsignFloatMaxValue = Float.MAX_VALUE; // 3.4028235E38
        System.out.println("Unsign Float Min Value: " + unsignFloatMinValue);
        System.out.println("Unsign Float Max Value: " + unsignFloatMaxValue);

        float signFloatMinValue = -Float.MIN_VALUE;
        float signFloatMaxValue = -Float.MAX_VALUE;
        System.out.println("Sign Float Min Value: " + signFloatMinValue);
        System.out.println("Sign Float Min Value: " + signFloatMaxValue);

        // 지수부 비트 추출
        float f = 0.8125f;
        int exponentBits = Float.floatToIntBits(f); // float 타입을 값을 int 타입의 값으로 해석하여 반환
        System.out.println("exponentBits " + exponentBits); // 0 01111110 01000000000000000000000 비트를 1063883029 정수로 출력
        int exponent = (exponentBits >>> 23) & 0xFF; // 8비트가 모두 1로 이루어진 값인, 0xFF와 AND 연산하여 지수부 비트 추출
        System.out.println("Float.MAX_VALUE의 지수부: " + (exponent - 127)); // 0.1101에서 1.101 x 2^-1으로 표현하여, 지수는 -1이다.

        // 가수부 비트 추출
        int mantissa = Float.floatToIntBits(Float.MAX_VALUE) & 0x7FFFFF; // 23비트가 모두 1로 이루어진 값인, 0x7FFFFF와 AND 연산하여 가수부 비트 추출
        String binaryMantissa = Integer.toBinaryString(mantissa); // 가수 부분을 이진수 문자열로 변환

        // 가수 부분을 23비트로 만들기 위해 공백을 0으로 대체
        binaryMantissa = String.format("%23s", binaryMantissa).replace(' ', '0');
        System.out.println("Float.MAX_VALUE의 가수부: " + binaryMantissa);
    }
}