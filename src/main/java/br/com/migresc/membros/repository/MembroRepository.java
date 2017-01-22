package br.com.migresc.membros.repository;

import br.com.migresc.membros.model.Membro;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by bruno on 22/01/17.
 */
@Repository
public interface MembroRepository extends MongoRepository<Membro, Integer> {
}
