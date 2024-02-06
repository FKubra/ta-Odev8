public class Main {
    public static void main(String[] args) {
        // Team Lead oluşturma
        Female teamLead = new Female("Jennifer", "Doe", "01/01/1960");

        // Departman oluşturma
        Department department = new Department(teamLead);

        // Personel ekleme
        Person person1 = new Male("Michael", "Smith", "05/10/1985");
        Person person2 = new Female("Emily", "Johnson", "08/15/1990");

        department.addPersonnel(person1);
        department.addPersonnel(person2);

        // Görev ekleme
        department.addAssignment("Project A");
        department.addAssignment("Project B");

        // Görev tamamlama
        department.markAssignmentComplete("Project A");

        // Takım liderini değiştirme
        Female newTeamLead = new Female("Daisy", "Brown", "03/20/1975");
        department.changeTeamLead(newTeamLead);
    }
}
