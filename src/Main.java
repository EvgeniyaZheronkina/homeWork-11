public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Иван", "Тургенев");

        Book tolstoy = new Book("Война и мир", author1, 1861);
        System.out.println("Название книги = " + tolstoy.getTitle());
        System.out.println("Автор = " + author1.getName() + " " + author1.getSurname());
        System.out.println("Год издания = " + tolstoy.getYear());
        tolstoy.setYear(1863);
        System.out.println("Исправленный год издания = " + tolstoy.getYear());

        System.out.println();

        Book tyrgenev = new Book("Отцы и дети", author2, 1862);
        System.out.println("Название книги = " + tyrgenev.getTitle());
        System.out.println("Автор = " + author2.getName() + " " + author2.getSurname());
        System.out.println("Год издания = " + tyrgenev.getYear());

        System.out.println(tolstoy);
        System.out.println(tyrgenev);
        System.out.println(author1.equals(author2));
        System.out.println(tolstoy.equals(tyrgenev));

    }
}