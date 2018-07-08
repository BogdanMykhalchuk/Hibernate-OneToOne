package onetoone.repository;

import onetoone.domain.biderectional.ChildBi2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by Dreawalker on 15.06.2018.
 */
public interface ChildBi2Repository extends JpaRepository<ChildBi2, Long> {
    @Modifying
    @Query(value = "delete from ChildBi2 p where p.parent.id = :parentId")
    void deleteByParentId(@Param("parentId") Long parentId);
}
