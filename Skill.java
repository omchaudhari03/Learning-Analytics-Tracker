public class Skill {
    private String name;
    private int progress;
    private int hoursSpent;

    public Skill(String name, int progress, int hoursSpent) {
        this.name = name;
        this.progress = progress;
        this.hoursSpent = hoursSpent;
    }

    public String getName() {
        return name;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public int getHoursSpent() {
        return hoursSpent;
    }

    public void addHours(int hours) {
        this.hoursSpent += hours;
    }

    @Override
    public String toString() {
        return name + " | Progress: " + progress + "% | Hours: " + hoursSpent;
    }
}
