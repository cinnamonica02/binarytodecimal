
public class Main {

    public static void printMenu(String[] options){
        for (String option : options){
            System.out.println(option);
        }
        System.out.print("Choose your option : ");
    }
    public static void main(String[] args) {
        String[] options = {"A- Convert from any system to decimal system..",
                "B- Convert from decimal system to another system....",
                "C- Summing up numbers from different systems...",
                "D- Multiplying up numbers from different systems...",
                "E- Exit..."
        };
        Scanner scanner = new Scanner(System.in);
        int option;
        while (true){
            printMenu(options);
            option = scanner.nextInt();
        }
    }
}