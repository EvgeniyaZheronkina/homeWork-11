public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String toString() {
        return "Автор = " + this.name + " " + this.surname;
    }

    public boolean equals (Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || this.getClass() != other.getClass()){
            return false;
        }
        Author author = (Author) other;
        return name.equals(author.name) && surname.equals(author.surname);
    }

    public int hasCode() {
        return java.util.Objects.hash(name, surname);
    }

}
