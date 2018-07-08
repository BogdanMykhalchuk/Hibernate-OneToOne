package onetoone.domain.biderectional;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "child_bi1")
public class ChildBi1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "SERIAL")
    private Long id;

    @Column(name = "_name")
    private String name;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private ParentBi1 parent;
}
