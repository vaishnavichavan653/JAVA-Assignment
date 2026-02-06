import java.util.Arrays;

class Names {
    public static void main(String[] args) {

        String names[] = {
            "vaishnavi", "sakshi", "neha", "anjali", "prakash",
            "aniket", "aditya", "pranav", "pooja", "sneha"
        };

        Arrays.sort(names);

        for (String name : names) {
            System.out.println(name);
        }
    }
}