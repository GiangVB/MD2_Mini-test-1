public class Main {
    public static void main(String[] args) {
        Book book[] = new Book[5];
        book[0] = new Book("Thanh gươm diệt quỷ", "Koyoharu Gotouge", 25000, 23, 125);
        book[1] = new Book("Học viện siêu anh hùng", "Kohei Horikoshi", 20000, 27, 130);
        book[2] = new Book("One-punch man", "Yusuke Murata, One", 20000, 22, 165);
        book[3] = new Book("Dragon Ball Full color", "Akira Toriyama", 77000, 17,280 );
        book[4] = new Book("Slam Dunk - Duluxe Edition", "Takehiko Inoue", 60000, 6, 265);

        int price = getSumPrice(book);
        System.out.println("Tổng số tiền của 5 tựa sách là: " + price);
        int weight = getSumWeight(book);
        System.out.println("Tổng trọng lượng của 5 tựa sách là: " + weight);


    }

    public static int getSumPrice(Book[] books) {
        int sum = 0;
        for (int i = 0; i < books.length; i++) {
            sum += books[i].getTotalPrice();
        }
        return sum;
    }

    public static int getSumWeight(Book[] books) {
        int sum = 0;
        for (int i = 0; i < books.length; i++) {
            sum += books[i].getTotalWeight();
        }
        return sum;
    }
}
