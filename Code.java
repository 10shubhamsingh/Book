package Book;

import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        Book[] books =new Book[n];
        if (n==0)
            System.out.println("N/A");
        else
            for(int i = 0; i<n; i++) {
                String bookName = sc.nextLine().trim();
                String authorName = sc.nextLine().trim();
                int isbn = sc.nextInt();
                books[i] = new Book(bookName, authorName, isbn);
            }
        for (int j=0; j<books.length;j++)
            System.out.println(books[j]);
    }
}


