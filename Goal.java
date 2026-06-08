public class Goal {

    private String skillName;
    private int targetProgress;

    public Goal(String skillName, int targetProgress) {
        this.skillName = skillName;
        this.targetProgress = targetProgress;
    }

    public String getSkillName() {
        return skillName;
    }

    public int getTargetProgress() {
        return targetProgress;
    }
}