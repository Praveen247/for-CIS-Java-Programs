public class Demo {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            System.out.print("i");
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//import java.util.Scanner;
//
//public class MarriageBiodata {
//
//    private String name;
//    private int age;
//    private String gender;
//    private String occupation;
//    private String address;
//    private String[] hobbies;
//
//    // Constructor
//    public MarriageBiodata(String name, int age, String gender, String occupation, String address, String[] hobbies) {
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//        this.occupation = occupation;
//        this.address = address;
//        this.hobbies = hobbies;
//    }
//
//    // Method to input biodata
//    public static MarriageBiodata inputBiodata() {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter Name: ");
//        String name = scanner.nextLine();
//
//        System.out.print("Enter Age: ");
//        int age = scanner.nextInt();
//
//        scanner.nextLine();  // Consume the newline character
//
//        System.out.print("Enter Gender: ");
//        String gender = scanner.nextLine();
//
//        System.out.print("Enter Occupation: ");
//        String occupation = scanner.nextLine();
//
//        System.out.print("Enter Address: ");
//        String address = scanner.nextLine();
//
//        System.out.print("Enter Hobbies (comma-separated): ");
//        String[] hobbies = scanner.nextLine().split(",");
//
//        return new MarriageBiodata(name, age, gender, occupation, address, hobbies);
//    }
//
//    // Method to display biodata
//    public void displayBiodata() {
//        System.out.println("\nMarriage Biodata:");
//        System.out.println("Name: " + name);
//        System.out.println("Age: " + age);
//        System.out.println("Gender: " + gender);
//        System.out.println("Occupation: " + occupation);
//        System.out.println("Address: " + address);
//        System.out.print("Hobbies: ");
//        for (String hobby : hobbies) {
//            System.out.print(hobby.trim() + " ");
//        }
//        System.out.println("\n");
//    }
//
//    public static void main(String[] args) {
//        MarriageBiodata biodata = inputBiodata();
//        biodata.displayBiodata();
//    }
//}
