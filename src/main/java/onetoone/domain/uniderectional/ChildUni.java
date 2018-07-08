package onetoone.domain.uniderectional;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "child_oto_uni")
public class ChildUni {
    @Id
    private Long id;

    @Column(name = "_name")
    private String name;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private ParentUni parent;
}
