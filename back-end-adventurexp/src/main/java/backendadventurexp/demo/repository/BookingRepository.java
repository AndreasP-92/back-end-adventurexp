package backendadventurexp.demo.repository;

import backendadventurexp.demo.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Integer> {
    List<Booking> findByMail(String mail);
    List<Booking> findAllByBookingClosed(int bookingClosed);
    List<Booking> findAllByMail(String mail);
    List<Booking> findAllByActivity(String activity);
    List<Booking> findAllByActivityAndMail(String activity, String mail);
    List<Booking> findAllByBookingActive(int bookingActive);
    Booking findByBookingId(int id);
    List<Booking> findAllByMailAndActivity(String mail, String activity);
//    List<Booking> findAllByActivity(String mail);
}