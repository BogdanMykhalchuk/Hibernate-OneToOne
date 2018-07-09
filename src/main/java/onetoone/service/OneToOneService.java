package onetoone.service;

import lombok.RequiredArgsConstructor;
import onetoone.domain.biderectional.ChildBi1;
import onetoone.domain.biderectional.ChildBi2;
import onetoone.domain.biderectional.ChildBi3;
import onetoone.domain.biderectional.ParentBi1;
import onetoone.domain.biderectional.ParentBi2;
import onetoone.domain.biderectional.ParentBi3;
import onetoone.domain.uniderectional.ChildUni;
import onetoone.domain.uniderectional.ParentUni;
import onetoone.repository.ChildBi1Repository;
import onetoone.repository.ChildBi2Repository;
import onetoone.repository.ChildBi3Repository;
import onetoone.repository.ChildUniRepository;
import onetoone.repository.ParentBi3Repository;
import onetoone.repository.ParentBi1Repository;
import onetoone.repository.ParentBi2Repository;
import onetoone.repository.ParentUniRepository;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class OneToOneService {
    private final ChildBi1Repository childBi1Repository;
    private final ChildBi2Repository childBi2Repository;
    private final ChildBi3Repository childBi3Repository;
    private final ChildUniRepository childUniRepository;
    private final ParentBi1Repository parentBi1Repository;
    private final ParentBi2Repository parentBi2Repository;
    private final ParentBi3Repository parentBi3Repository;
    private final ParentUniRepository parentUniRepository;



    //              SAVE

    public ChildUni createChild(ChildUni child) {
        return childUniRepository.save(child);
    }
    public ChildBi1 createChild(ChildBi1 child) {
        return childBi1Repository.save(child);
    }
    public ChildBi2 createChild(ChildBi2 child) {
        return childBi2Repository.save(child);
    }
    public ChildBi3 createChild(ChildBi3 child) {
        return childBi3Repository.save(child);
    }
    public ParentUni createParent(ParentUni parent) {
        return parentUniRepository.save(parent);
    }
    public ParentBi1 createParent(ParentBi1 parent) {
        return parentBi1Repository.save(parent);
    }
    public ParentBi2 createParent(ParentBi2 parent) {
        return parentBi2Repository.save(parent);
    }
    public ParentBi3 createParent(ParentBi3 parent) {
        return parentBi3Repository.save(parent);
    }



    //              READ

    public ChildUni getChildUni(Long id) {
        return childUniRepository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
    }
    public ChildBi1 getChildBi1(Long id) {
        return childBi1Repository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
    }
    public ChildBi2 getChildBi2(Long id) {
        return childBi2Repository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
    }
    public ChildBi3 getChildBi3(Long id) {
        return childBi3Repository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
    }
    public ParentUni getParentUni(Long id) {
        return parentUniRepository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
    }
    public ParentBi1 getParentBi1(Long id) {
        return parentBi1Repository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
    }
    public ParentBi2 getParentBi2(Long id) {
        return parentBi2Repository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
    }
    public ParentBi3 getParentBi3(Long id) {
        return parentBi3Repository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
    }


    public List<ChildUni> getChildrenUni() {
        return childUniRepository.findAll();
    }
    public List<ChildBi1> getChildrenBi1() {
        return childBi1Repository.findAll();
    }
    public List<ChildBi2> getChildrenBi2() {
        return childBi2Repository.findAll();
    }
    public List<ChildBi3> getChildrenBi3() {
        return childBi3Repository.findAll();
    }
    public List<ParentUni> getParentsUni() {
        return parentUniRepository.findAll();
    }
    public List<ParentBi1> getParentsBi1() {
        return parentBi1Repository.findAll();
    }
    public List<ParentBi2> getParentsBi2() {
        return parentBi2Repository.findAll();
    }
    public List<ParentBi3> getParentsBi3() {
        return parentBi3Repository.findAll();
    }



    //              UPDATE

    public ChildUni updateChild(ChildUni child) {
        return childUniRepository.save(child);
    }
    public ChildBi1 updateChild(ChildBi1 child) {
        return childBi1Repository.save(child);
    }
    public ChildBi2 updateChild(ChildBi2 child) {
        return childBi2Repository.save(child);
    }
    public ChildBi3 updateChild(ChildBi3 child) {
        return childBi3Repository.save(child);
    }
    public ParentUni updateParent(ParentUni parent) {
        return parentUniRepository.save(parent);
    }
    public ParentBi1 updateParent(ParentBi1 parent) {
        return parentBi1Repository.save(parent);
    }
    public ParentBi2 updateParent(ParentBi2 parent) {
        return parentBi2Repository.save(parent);
    }
    public ParentBi3 updateParent(ParentBi3 parent) {
        return parentBi3Repository.save(parent);
    }



    //              DELETE

    public void deleteChildUni(Long id) {
        childUniRepository.deleteById(id);
    }
    public void deleteChildBi1(Long id) {childBi1Repository.deleteById(id); }
    public void deleteChildBi2(Long id) {
        childBi2Repository.deleteById(id);
    }
    public void deleteChildBi3(Long id) {
        childBi3Repository.deleteById(id);
    }
    public void deleteParentUni(Long id) {
        parentUniRepository.deleteById(id);
    }
    public void deleteParentBi1(Long id) {
        parentBi1Repository.deleteById(id);
    }
    public void deleteParentBi2(Long id) {parentBi2Repository.deleteById(id);}
    public void deleteParentBi3(Long id) {parentBi3Repository.deleteById(id);}


    //              Bidirectional - 1

    public void createBi1() {
        ParentBi1 parent =  new ParentBi1();
        parent.setName("Petro");
        ChildBi1 child  = new ChildBi1();
        child.setName("Petrovich");
        child.setParent(parent);
        parent.setChild(child);
        createParent(parent);
    }

    public void getChildByParentBi1(Long parentId) {
        ParentBi1 parent = getParentBi1(parentId);
        ChildBi1 child = parent.getChild();
    }
    
    public void getParentByChildBi1(Long childId) {
        ChildBi1 child = getChildBi1(childId);
        ParentBi1 parent = child.getParent();
        System.out.println(parent.getName());
    }

    public void updateChildrenBi1(Long id) {
        ChildBi1 child = getChildBi1(id);
        child.setName("Grigorovich");
        updateChild(child);
    }

    public void updateParentBi1(Long id) {
        ParentBi1 parent = getParentBi1(id);
        ChildBi1 child = new ChildBi1();
        child.setName("Vasyliovych");
        parent.setChild(child);
        child.setParent(parent);
        updateParent(parent);
    }
    
    public void correctUpdateParentBi1(Long id) {
        ParentBi1 parent = getParentBi1(id);
        ChildBi1 oldChild = parent.getChild();
        deleteChildBi1(oldChild.getId());
        ChildBi1 newChild = new ChildBi1();
        newChild.setName("Vasyliovych");
        parent.setChild(newChild);
        newChild.setParent(parent);
        updateParent(parent);
    }

    public void correctDeleteChildBi1(Long id) {
        ChildBi1 child = getChildBi1(id);
        ParentBi1 parent = child.getParent();
        parent.setChild(null);
        deleteChildBi1(id);
    }


    //              Bidirectional - 2

    public void createBi2() {
        ParentBi2 parent =  new ParentBi2();
        parent.setName("Petro");
        ChildBi2 child  = new ChildBi2();
        child.setName("Petrovich");
        child.setParent(parent);
        parent.setChild(child);
        createParent(parent);
    }

    public void getChildByParentBi2(Long parentId) {
        ParentBi2 parent = getParentBi2(parentId);
    }

    public void getParentByChildBi2(Long childId) {
        ChildBi2 child = getChildBi2(childId);
    }

    public void updateChildrenBi2(Long id) {
        ChildBi2 child = getChildBi2(id);
        child.setName("Grigorovich");
        updateChild(child);
    }

    public void updateParentBi2(Long id) {
        ParentBi2 parent = getParentBi2(id);
        ChildBi2 child = new ChildBi2();
        child.setName("Vasyliovych");
        parent.setChild(child);
        updateParent(parent);
    }

    public void deleteChildBeforeUpdateBi2(Long id) {
        childBi2Repository.deleteByParentId(id);
    }

    public void correctUpdateParentBi2(Long id) {
        ParentBi2 parent = getParentBi2(id);
        ChildBi2 newChild = new ChildBi2();
        newChild.setName("Vasyliovych");
        newChild.setParent(parent);
        createChild(newChild);
    }

    
    
    
    
    
    
    //              Bidirectional - 3

    public void createBi3() {
        ParentBi3 parent =  new ParentBi3();
        parent.setName("Petro");
        ChildBi3 child  = new ChildBi3();
        child.setName("Petrovich");
        child.setParent(parent);
        parent.setChild(child);
        createParent(parent);
    }

    public ParentBi3 createParentBi3() {
        ParentBi3 parent =  new ParentBi3();
        parent.setName("Petro");
        return createParent(parent);
    }

    public void createChildBi3(ParentBi3 parent) {
        ChildBi3 child  = new ChildBi3();
        child.setName("Petrovich");
        child.setParent(parent);
        parent.setChild(child);
        createChild(child);
        updateParent(parent);
    }

    public void getChildByParentBi3(Long parentId) {
        ParentBi3 parent = getParentBi3(parentId);
    }

    public void getParentByChildBi3(Long childId) {
        ChildBi3 child = getChildBi3(childId);
    }

    public void updateChildrenBi3(Long id) {
        ChildBi3 child = getChildBi3(id);
        child.setName("Grigorovich");
        updateChild(child);
    }

    public void updateParentBi3(Long id) {
        ParentBi3 parent = getParentBi3(id);
        ChildBi3 child = new ChildBi3();
        child.setName("Vasyliovych");
        parent.setChild(child);
        updateParent(parent);
    }

    public void deleteChildBeforeUpdateBi3(Long id) {
        childBi3Repository.deleteById(id);
    }

    public void correctUpdateParentBi3(Long id) {
        ParentBi3 parent = getParentBi3(id);
        ChildBi3 newChild = new ChildBi3();
        newChild.setName("Vasyliovych");
        newChild.setParent(parent);
        createChild(newChild);
    }






    //  Unidirectional

    public void createUni() {
        ChildUni child  = new ChildUni();
        child.setName("Wrong creation");
        createChild(child);
    }

    public void createCorrectUni() {
        ParentUni parent =  new ParentUni();
        parent.setName("Petro");
        ChildUni child  = new ChildUni();
        child.setName("Petrovich");
        child.setParent(parent);
        createChild(child);
    }

    public void getChildByParentUni(Long parentId) {
        ChildUni child = getChildUni(parentId);
    }

    public void getParentByChildUni(Long childId) {
        ParentUni parent = getParentUni(childId);
    }

    public void updateChildrenUni(Long id) {
        ChildUni child = getChildUni(id);
        child.setName("Grigorovich");
        updateChild(child);
    }

    public void updateParentUni(Long id) {
        ParentUni parent = getParentUni(id);
        ChildUni newChild = new ChildUni();
        newChild.setName("Vasyliovych");
        newChild.setParent(parent);
        createChild(newChild);
    }

    public void deleteChildBeforeUpdateUni(Long id) {
        deleteChildUni(id);
    }
}
