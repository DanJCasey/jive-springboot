package rocks.zipcode.Jive.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rocks.zipcode.Jive.entities.DirectMessage;

@Repository
public interface DirectMessageRepository extends JpaRepository<DirectMessage, Long> {
}