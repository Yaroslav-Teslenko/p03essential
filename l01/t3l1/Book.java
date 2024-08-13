package l01.t3l1;

public class Book {
    private Author author;
    private Title title;
    private Content content;

    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book(new Author("Хорстман K."), new Title("Java 2. Библиотека профессионала"),new Content("Издание 11е"));
        Book book3 = new Book("Блинов И. Н.","Java from EPAM", "Издание 2е");

        book1.show();
        book2.show();
        book3.show();
    }

    public Book(){
        this("","","");
    }

    public Book(Author author, Title title, Content content) {
        this.author = author;
        this.title = title;
        this.content = content;
    }

    public Book(String author, String title, String content) {
        this.author = new Author(author);
        this.title =  new Title(title);
        this.content = new Content(content);
    }

    public void show(){
        this.author.show();
        this.title.show();
        this.content.show();
    }


}
