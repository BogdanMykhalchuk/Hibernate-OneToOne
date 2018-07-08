package onetoone.repository;

import onetoone.domain.uniderectional.ParentUni;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParentUniRepository extends JpaRepository<ParentUni, Long> {
}
