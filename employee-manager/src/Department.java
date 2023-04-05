public enum Department {
    MARKETING("Marketing"),
    HR("Human Resources"),
    DEVELOPMENT("Development");

    private String meaning;

    Department(String meaning){ this.meaning=meaning;}

    String getMeaning(){ return meaning;}
}
