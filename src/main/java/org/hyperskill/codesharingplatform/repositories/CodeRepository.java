package org.hyperskill.codesharingplatform.repositories;

import org.hyperskill.codesharingplatform.entities.Code;
import org.springframework.data.repository.CrudRepository;

public interface CodeRepository extends CrudRepository<Code, Long> {
}
