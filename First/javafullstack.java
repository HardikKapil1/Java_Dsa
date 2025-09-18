public class javafullstack {
        public static class Book{
            private int price;
            private String author,title;
            // Constructor
            public Book(String t, String a, int p) {
                this.title = t;
                this.author = a;
                this.price = p;
            }
            public void displayBook(){
                System.out.println("Title: " + title);
                System.out.println("Author: " + author);
                System.out.println("Price: " + price);
            }
        }
        public static void main(String[] args) {
            Book book1 = new Book("Java Programming", "John Doe", 500);
            book1.displayBook();
            
            Book book2 = new Book("Python Programming", "Jane Doe", 600);
            book2.displayBook();
        }
    }

