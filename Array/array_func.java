public class array_func {

    public static void update(int marks[]) {

        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = { 97, 98, 92 };

        update(marks);

        //to print our marks

        for (int i = 0; i <marks.length; i++) {

            System.out.println(marks[i] + " ");
    }
    System.out.println();
}
}