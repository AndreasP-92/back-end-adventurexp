package backendadventurexp.demo.repository;

import backendadventurexp.demo.model.Auth;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthRepository extends JpaRepository<Auth, Long> {
    Auth findByMail(String mail);
}
