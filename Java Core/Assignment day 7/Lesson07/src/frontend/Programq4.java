package frontend;

import java.util.Scanner;

public class Programq4 {
	static int[] departments = {1,2,3};

    public static void getIndex(int index) {
        try {
            int department = departments[index];
            System.out.println("Department index " + index + ": " + department);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Cannot find department.");
        }
    }

    public static void main(String[] args) {
        getIndex(1); 
        getIndex(5); 
    }
}
