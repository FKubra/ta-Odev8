class Male extends Person {
    Male(String firstName, String lastName, String birthDate) {
        super(firstName, lastName, birthDate);
    }

    @Override
    int calculateRetirementAge() {
        return 65;
    }
}


