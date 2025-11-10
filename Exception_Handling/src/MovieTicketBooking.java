import java.util.*;

class InvalidSeatException extends Exception {
    public InvalidSeatException(String message) {
        super(message);
    }
}

class SeatAlreadyBookedException extends Exception {
    public SeatAlreadyBookedException(String message) {
        super(message);
    }
}

class MovieBooking {
    private Map<Integer, Boolean> seats = new HashMap<>();

    public MovieBooking(int totalSeats) {
        for (int i = 1; i <= totalSeats; i++) {
            seats.put(i, false);
        }
    }

    public void bookSeat(int seatNo) throws InvalidSeatException, SeatAlreadyBookedException {
        if (!seats.containsKey(seatNo)) {
            throw new InvalidSeatException("Seat number " + seatNo + " does not exist!");
        }
        if (seats.get(seatNo)) {
            throw new SeatAlreadyBookedException("Seat number " + seatNo + " is already booked!");
        }


        seats.put(seatNo, true);
        System.out.println("Seat " + seatNo + " booked successfully!");
    }
}

public class MovieTicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieBooking movie = new MovieBooking(5);

        try {
            System.out.print("Enter seat number to book (1–5): ");
            int seat = sc.nextInt();

            movie.bookSeat(seat);
        } catch (InvalidSeatException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (SeatAlreadyBookedException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a number.");
        } finally {
            sc.close();
        }
    }
}
