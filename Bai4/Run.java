package OOP.Bai4;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager();
        while (true){
            System.out.println("===== Application Manager Officer ====");
            System.out.println("1. Add officer");
            System.out.println("2. Search an officer by name ");
            System.out.println("3. Show all officer");
            System.out.println("4. Exit");
            System.out.println("Your choice: ");
            int choose = scanner.nextInt();
            switch (choose){
                case 1:
                    System.out.println("Select your officer type");
                    System.out.println("1. Engineer");
                    System.out.println("2. Worker");
                    System.out.println("3. Staff");
                    System.out.println("Your choice: ");
                    int choice = scanner.nextInt();
                    switch (choice){
                        case 1:
                            System.out.print("Enter name: ");
                            String name = scanner.next();
                            System.out.print("Enter age: ");
                            int age = scanner.nextInt();
                            System.out.print("Enter gender: ");
                            String gender = scanner.next();
                            System.out.print("Enter address: ");
                            String address = scanner.next();
                            System.out.print("Enter branch: ");
                            String branch = scanner.next();
                            Office engineer = new Engineer(name, age, gender, address, branch);
                            manager.add(engineer);
                            break;
                        case 2:
                            System.out.print("Enter name: ");
                            String name1 = scanner.next();
                            System.out.print("Enter age: ");
                            int age1 = scanner.nextInt();
                            System.out.print("Enter gender: ");
                            String gender1 = scanner.next();
                            System.out.print("Enter address: ");
                            String address1 = scanner.next();
                            System.out.print("Enter level: ");
                            int level = scanner.nextInt();
                            Office worker = new Worker(name1, age1, gender1, address1, level);
                            manager.add(worker);
                            break;
                        case 3:
                            System.out.print("Enter name: ");
                            String name2 = scanner.next();
                            System.out.print("Enter age: ");
                            int age2 = scanner.nextInt();
                            System.out.print("Enter gender: ");
                            String gender2 = scanner.next();
                            System.out.print("Enter address: ");
                            String address2 = scanner.next();
                            System.out.print("Enter task: ");
                            String task = scanner.next();
                            Office staff = new Staff(name2, age2, gender2, address2, task);
                            manager.add(staff);
                            break;
                        default:
                            System.out.println("Invalid choice !");
                            break;
                    }
                    break;
                case 2:
                    System.out.print("Enter the officer name: ");
                    String name = scanner.next();
                    manager.search(name).forEach(officer -> {
                        System.out.println(officer.toString());
                    });
                    break;
                case 3:
                    manager.show();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice !");
                    continue;
            }
        }
    }
}
