import java.util.ArrayList;

public class AnalyticsEngine {

    public static void generateDashboard(User user) {

        ArrayList<Skill> skills = user.getSkills();

        if(skills.isEmpty()) {
            System.out.println("No skills found.");
            return;
        }

        int totalProgress = 0;

        Skill strongest = skills.get(0);
        Skill weakest = skills.get(0);

        for(Skill skill : skills) {

            totalProgress += skill.getProgress();

            if(skill.getProgress() > strongest.getProgress()) {
                strongest = skill;
            }

            if(skill.getProgress() < weakest.getProgress()) {
                weakest = skill;
            }
        }

        double average = (double) totalProgress / skills.size();

        System.out.println("\n===== LEARNING DASHBOARD =====");

        System.out.println("Total Skills: " + skills.size());

        System.out.println("Average Progress: "
                + String.format("%.2f", average) + "%");

        System.out.println("Strongest Skill: "
                + strongest.getName()
                + " (" + strongest.getProgress() + "%)");

        System.out.println("Weakest Skill: "
                + weakest.getName()
                + " (" + weakest.getProgress() + "%)");

        if(average >= 75) {
            System.out.println("Learning Health: Excellent");
        }
        else if(average >= 50) {
            System.out.println("Learning Health: Good");
        }
        else {
            System.out.println("Learning Health: Needs Improvement");
        }
    }
}