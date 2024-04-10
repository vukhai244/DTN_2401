package frontend;

import backend.MyMath;

public class ProgramQ4 {
	public static void main(String[] args) {
        int intResult = (int) MyMath.sum(5, 3);
        System.out.println("Tổng 2 số nguyên: " + intResult);

        byte byteResult = (byte) MyMath.sum((byte) 10, (byte) 20);
        System.out.println("Tổng 2 byte: " + byteResult);

        float floatResult = (float) MyMath.sum(2.5f, 3.7f);
        System.out.println("Tổng 2 số thực: " + floatResult);
    }
}
