import java.util.ArrayList;
import java.util.List;

class Department {
    private Female teamLead;
    private List<Person> personnelList;
    private List<String> assignmentList;

    Department(Female teamLead) {
        this.teamLead = teamLead;
        this.personnelList = new ArrayList<>();
        this.assignmentList = new ArrayList<>();
    }

    void changeTeamLead(Female newTeamLead) {
        this.teamLead = newTeamLead;
    }

    void addPersonnel(Person person) {
        personnelList.add(person);
    }

    void removePersonnel(Person person) {
        personnelList.remove(person);
    }

    void changePersonnel(Person oldPerson, Person newPerson) {
        int index = personnelList.indexOf(oldPerson);
        if (index != -1) {
            personnelList.set(index, newPerson);
        }
    }

    void addAssignment(String assignment) {
        assignmentList.add(assignment);
    }

    void markAssignmentComplete(String assignment) {
        assignmentList.remove(assignment);
    }
}
