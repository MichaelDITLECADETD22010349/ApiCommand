package fr.univamu.iut.apicommand.repository;
import fr.univamu.iut.apicommand.entity.Command;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CommandRepository  extends CrudRepository<Command, Integer>{

}