
class Female extends Person {
    Female(String firstName, String lastName, String birthDate) {
        super(firstName, lastName, birthDate);
    }

    @Override
    int calculateRetirementAge() {
        return 60;
    }
}

