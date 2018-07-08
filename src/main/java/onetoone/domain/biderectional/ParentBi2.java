package onetoone.domain.biderectional;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "parent_bi2")
public class ParentBi2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "SERIAL")
    private Long id;

    @Column(name = "_name")
    private String name;

    @OneToOne(mappedBy = "parent", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private ChildBi2 child;
}
