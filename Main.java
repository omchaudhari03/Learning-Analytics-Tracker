import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();

        User user = new User(name);

        int choice = 0;

        do {

            System.out.println("\n===== Learning Analytics Tracker =====");
            System.out.println("1. Add Skill");
            System.out.println("2. View Skills");
            System.out.println("3. Update Progress");
            System.out.println("4. Generate Dashboard");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");

            while (!sc.hasNextInt()) {
                System.out.print("Please enter a valid number: ");
                sc.next();
            }

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    sc.nextLine();

                    System.out.print("Skill Name: ");
                    String skillName = sc.nextLine();

                    System.out.print("Progress (0-100): ");

                    while (!sc.hasNextInt()) {
                        System.out.print("Enter numeric value only: ");
                        sc.next();
                    }

                    int progress = sc.nextInt();

                    if (progress < 0 || progress > 100) {
                        System.out.println("Progress must be between 0 and 100.");
                        break;
                    }

                    System.out.print("Hours Spent: ");

                    while (!sc.hasNextInt()) {
                        System.out.print("Enter numeric value only: ");
                        sc.next();
                    }

                    int hours = sc.nextInt();

                    Skill skill = new Skill(skillName, progress, hours);

                    user.addSkill(skill);

                    Achievement.checkAchievements(skill);

                    System.out.println("Skill Added Successfully.");

                    break;

                case 2:

                    if (user.getSkills().isEmpty()) {
                        System.out.println("No skills added yet.");
                    } else {
                        System.out.println("\n===== Your Skills =====");

                        for (Skill s : user.getSkills()) {
                            System.out.println(s);
                        }
                    }

                    break;

                case 3:

                    sc.nextLine();

                    System.out.print("Enter Skill Name: ");
                    String updateSkill = sc.nextLine();

                    boolean found = false;

                    for (Skill s : user.getSkills()) {

                        if (s.getName().equalsIgnoreCase(updateSkill)) {

                            System.out.print("New Progress (0-100): ");

                            while (!sc.hasNextInt()) {
                                System.out.print("Enter numeric value only: ");
                                sc.next();
                            }

                            int newProgress = sc.nextInt();

                            if (newProgress < 0 || newProgress > 100) {
                                System.out.println("Progress must be between 0 and 100.");
                                found = true;
                                break;
                            }

                            s.setProgress(newProgress);

                            Achievement.checkAchievements(s);

                            System.out.println("Progress Updated Successfully.");

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Skill Not Found.");
                    }

                    break;

                case 4:

                    AnalyticsEngine.generateDashboard(user);

                    break;

                case 5:

                    System.out.println("Thank You For Using Learning Analytics Tracker!");

                    break;

                default:

                    System.out.println("Invalid Choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}