package T5;

public class Book {
    private int pages; // number of pages in the book
    Book(int pages) {
        this.pages = pages;
    }
    public String toString() {
        return ""+pages; // convert pages to String before returning
    }
}

class Dictionary extends Book {
    private int words; // number of words in the dictionary
    Dictionary(int words, int pages) {
        super(pages);
        this.words = words;
    }
    public String toString() {
        String s = "Number of pages: " + super.toString();
        s = s + ", Number of words: " + words;
        return s;
    }
}

