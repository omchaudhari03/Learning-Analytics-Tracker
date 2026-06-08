public class Achievement {

    public static void checkAchievements(Skill skill) {

        if(skill.getProgress() >= 25) {
            System.out.println("Achievement Unlocked: Beginner Milestone");
        }

        if(skill.getProgress() >= 50) {
            System.out.println("Achievement Unlocked: Intermediate Learner");
        }

        if(skill.getProgress() >= 75) {
            System.out.println("Achievement Unlocked: Advanced Progress");
        }

        if(skill.getProgress() >= 100) {
            System.out.println("Achievement Unlocked: Skill Mastered");
        }
    }
}