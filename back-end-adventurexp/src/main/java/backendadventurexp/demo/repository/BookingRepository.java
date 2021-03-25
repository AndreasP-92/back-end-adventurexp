package backendadventurexp.demo.repository;

import backendadventurexp.demo.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Integer> {
    List<Booking> findByMail(String mail);
    List<Booking> findAllByBookingClosed(int bookingClosed);
    List<Booking> findAllByBookingActive(int bookingActive);
}