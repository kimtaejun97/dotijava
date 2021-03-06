package ObjectEX;

class Book{
    String title;
    String author;
    Book(String title, String author){
        this.title = title;
        this.author = author;
    }
    public boolean equals(Object obj){
        if(obj instanceof Book){
            Book book = (Book)obj;
            if(this.title == book.title && this.author == book.author)
                return true;
        }
        return false;
    }
}

public class ToStringEX {
    public static void main(String[] args){
        Book book = new Book("자바","kim");
        Book book2 = new Book("자바", "kim");

        System.out.println(book==book2);
        System.out.println(book.equals(book2));
    }

}
