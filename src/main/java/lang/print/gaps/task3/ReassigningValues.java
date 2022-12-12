package lang.print.gaps.task3;

public class ReassigningValues {
    public static void main(String[] args) {
        // Declare another 3 variables: first, second, third (1,10,100).
        // Make console output of 3 initial vars (first, second, third) each on new line.
        // Initialize vars linkToFirst, linkToSecond, linkToThird with the variables first, second, third.
        // Reassign (first, second, third) with the : 15, 6, 4.
        // And write to console all the variables (in the order they were declared), each on a new line.
        // Pay attention to results. Implement the program inside of given code snippet:write code here

        int first = 1;
        int second = 10;
        int third = 100;
        System.out.println(first + "\n" + second + "\n" + third);
        var linkToFirst = first;
        var linkToSecond = second;
        var linkToThird = third;
        first = 15;
        second = 6;
        third = 4;
        System.out.println(first + "\n" + second + "\n" + third);
        System.out.println(linkToFirst + "\n" + linkToSecond + "\n" + linkToThird);
    }
}
