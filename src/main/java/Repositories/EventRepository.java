package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Entities.Event;
@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

}
