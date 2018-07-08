package onetoone.repository;

import onetoone.domain.uniderectional.ChildUni;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChildUniRepository extends JpaRepository<ChildUni, Long> {
}
