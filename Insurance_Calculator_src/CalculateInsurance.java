package Insurance_Calculator;

import java.util.Scanner;

public class CalculateInsurance {
       	public static void main(String[] args) {
       		Scanner sc = new Scanner(System.in);

            System.out.println("Choose Insurance Type:");
            System.out.println("1. Car Insurance");
            System.out.println("2. Health Insurance");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

            case 1:
                System.out.print("Enter Policy Holder Name: ");
                String name1 = sc.nextLine();

                System.out.print("Enter Base Premium: ");
                double base1 = sc.nextDouble();

                System.out.print("Enter Car Age (years): ");
                int carAge = sc.nextInt();

                System.out.print("Had Accident in last year? (true/false): ");
                boolean accident = sc.nextBoolean();

                System.out.print("Enter Car Value (Rs.): ");
                double value = sc.nextDouble();

                CarInsurance car = new CarInsurance(name1, base1, carAge, accident, value);
                car.printPolicyDetails();
                break;

            case 2:
                System.out.print("Enter Policy Holder Name: ");
                String name2 = sc.nextLine();

                System.out.print("Enter Base Premium: ");
                double base2 = sc.nextDouble();

                System.out.print("Enter Age: ");
                int age = sc.nextInt();

                System.out.print("Is Smoker? (true/false): ");
                boolean smoker = sc.nextBoolean();

                System.out.print("Has Pre-Existing Disease? (true/false): ");
                boolean disease = sc.nextBoolean();

                HealthInsurance health = new HealthInsurance(name2, base2, age, smoker, disease);
                health.printPolicyDetails();
                break;

            default:
                System.out.println("Invalid Choice!");
            }

            sc.close();
        }
    
}

