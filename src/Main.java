import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter movie name: ");
        String movie = read.nextLine();
        System.out.print("Enter row number: ");
        int row = read.nextInt();
        System.out.print("Enter seat number: ");
        int seat = read.nextInt();
        Ticket ticket = new Ticket(movie, row, seat);
        System.out.println("Movie: " + ticket.getMovie());
        System.out.println("Row: " + ticket.getRow());
        System.out.println("Seat: " + ticket.getSeat());
    }
}

class Ticket {
    private String movie;
    private int row;
    private int seat;

    //USING "this" keyboard if the variable of the instances are the same as the parameters of the functions, below I will do the same snippets of code without the "this" keyword and it will also work
    public Ticket(String movie, int row, int seat) {
        this.movie = movie;
        this.row = row;
        this.seat = seat;
    }
    //WITHOUT USING "this" keyword
/*    public Ticket(String film, int rang, int chaise) {
        movie = film;
        row = rang;
        seat = chaise;
    }*/
    public String getMovie() {
        return movie;
    }

    public int getRow() {
        return row;
    }

    public int getSeat() {
        return seat;
    }
}