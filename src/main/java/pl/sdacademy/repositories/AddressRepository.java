package pl.sdacademy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sdacademy.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
