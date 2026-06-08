import java.util.ArrayList;

public class User {

    private String name;
    private ArrayList<Skill> skills;
    private ArrayList<LearningSession> sessions;

    public User(String name) {
        this.name = name;
        skills = new ArrayList<>();
        sessions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addSkill(Skill skill) {
        skills.add(skill);
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public void addSession(LearningSession session) {
        sessions.add(session);
    }

    public ArrayList<LearningSession> getSessions() {
        return sessions;
    }
}