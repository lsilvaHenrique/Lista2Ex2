package view;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static List<Integer> findIntersection(List<Integer> A, List<Integer> B) {
        List<Integer> I = new ArrayList<>();
        for (int num : A) {
            if (B.contains(num)) {
                I.add(num);
            }
        }
        return I;
    }

    public static List<Integer> findUnion(List<Integer> A, List<Integer> B) {
        List<Integer> U = new ArrayList<>(A);
        for (int num : B) {
            if (!U.contains(num)) {
                U.add(num);
            }
        }
        return U;
    }

    public static void main(String[] args) {
        List<Integer> A = List.of(3, 5, 8, 12, 9, 7, 16);
        List<Integer> B = List.of(9, 6, 2, 3, 7);

        List<Integer> I = findIntersection(A, B);
        List<Integer> U = findUnion(A, B);

        System.out.println("Interseção (I): " + I);
        System.out.println("União (U): " + U);
    }
}

