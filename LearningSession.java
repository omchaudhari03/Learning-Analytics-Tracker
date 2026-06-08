import java.time.LocalDate;

public class LearningSession {
    private String skillName;
    private int duration;
    private LocalDate date;

    public LearningSession(String skillName, int duration) {
        this.skillName = skillName;
        this.duration = duration;
        this.date = LocalDate.now();
    }

    public String getSkillName() {
        return skillName;
    }

    public int getDuration() {
        return duration;
    }

    public LocalDate getDate() {
        return date;
    }
}
