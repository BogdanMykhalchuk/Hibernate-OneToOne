package onetoone.controller;

import lombok.RequiredArgsConstructor;
import onetoone.domain.biderectional.ChildBi1;
import onetoone.domain.biderectional.ChildBi2;
import onetoone.domain.biderectional.ChildBi3;
import onetoone.domain.biderectional.ParentBi1;
import onetoone.domain.biderectional.ParentBi2;
import onetoone.domain.biderectional.ParentBi3;
import onetoone.domain.uniderectional.ChildUni;
import onetoone.domain.uniderectional.ParentUni;
import onetoone.service.OneToOneService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RestController
public class OneToOneController {
    private final OneToOneService service;

    //              Bidirectional - 1

    @GetMapping("/create-bi-1")
    public void createBi1()  {
        service.createBi1();
    }

    @GetMapping("/get-child-by-parent-bi-1/{parentId}")
    public void getChildByParentBi1(@PathVariable Long parentId) {
        service.getChildByParentBi1(parentId);
    }

    @GetMapping("/get-parent-by-child-bi-1/{childId}")
    public void getParentByChildBi1(@PathVariable Long childId) {
        service.getParentByChildBi1(childId);
    }

    @GetMapping("/get-all-parents-bi-1")
    public void getParentsBi1() {
        List<ParentBi1> parents = service.getParentsBi1();
        parents.forEach(a -> System.out.println(a.getName()));
    }

    @GetMapping("/get-all-children-bi-1")
    public void getChildrenBi1() {
        List<ChildBi1> parents = service.getChildrenBi1();
        parents.forEach(a -> System.out.println(a.getName()));
    }

    @GetMapping("/update-child-bi-1/{childId}")
    public void updateChildrenBi1(@PathVariable Long childId) {
        service.updateChildrenBi1(childId);
    }

    @GetMapping("/update-correct-parent-bi-1/{parentId}")
    public void correctUpdateParentBi1(@PathVariable Long parentId) {
        service.correctUpdateParentBi1(parentId);
    }

    @GetMapping("/update-parent-bi-1/{parentId}")
    public void updateParentBi1(@PathVariable Long parentId) {
        service.updateParentBi1(parentId);
    }

    @GetMapping("/delete-child-bi-1/{childId}")
    public void deleteChildrenBi1(@PathVariable Long childId) {
        service.deleteChildBi1(childId);
    }

    @GetMapping("/delete-correct-child-bi-1/{childId}")
    public void correctDeleteChildrenBi1(@PathVariable Long childId) {
        service.correctDeleteChildBi1(childId);
    }

    @GetMapping("/delete-parent-bi-1/{parentId}")
    public void deleteParentBi1(@PathVariable Long parentId) {
        service.deleteParentBi1(parentId);
    }



    //              Bidirectional - 2

    @GetMapping("/create-bi-2")
    private void createBi2()  {
        service.createBi2();
    }

    @GetMapping("/get-child-by-parent-bi-2/{parentId}")
    public void getChildByParentBi2(@PathVariable Long parentId) {
        service.getChildByParentBi2(parentId);
    }

    @GetMapping("/get-parent-by-child-bi-2/{childId}")
    public void getParentByChildBi2(@PathVariable Long childId) {
        service.getParentByChildBi2(childId);
    }

    @GetMapping("/get-all-parents-bi-2")
    public void getParentsBi2() {
        List<ParentBi2> parents = service.getParentsBi2();
        parents.forEach(a -> System.out.println(a.getName()));
    }

    @GetMapping("/get-all-children-bi-2")
    public void getChildrenBi2() {
        List<ChildBi2> parents = service.getChildrenBi2();
        parents.forEach(a -> System.out.println(a.getName()));
    }

    @GetMapping("/update-child-bi-2/{childId}")
    public void updateChildrenBi2(@PathVariable Long childId) {
        service.updateChildrenBi2(childId);
    }

    @GetMapping("/update-parent-bi-2/{parentId}")
    public void updateParentBi2(@PathVariable Long parentId) {
        service.updateParentBi2(parentId);
    }

    @GetMapping("/update-correct-parent-bi-2/{parentId}")
    public void correctUpdateParentBi2(@PathVariable Long parentId) {
        service.deleteChildBeforeUpdateBi2(parentId);
        service.correctUpdateParentBi2(parentId);
    }

    @GetMapping("/delete-child-bi-2/{childId}")
    public void deleteChildrenBi2(@PathVariable Long childId) {
        service.deleteChildBi2(childId);
    }

    @GetMapping("/delete-parent-bi-2/{parentId}")
    public void deleteParentBi2(@PathVariable Long parentId) {
        service.deleteParentBi2(parentId);
    }






    //              Bidirectional - 3

    @GetMapping("/create-bi-3")
    private void createBi3()  {
        service.createBi3();
    }

    @GetMapping("/create-parent-bi-3")
    private void createParentBi3()  {
        ParentBi3 parentBi3 = service.createParentBi3();
        service.createChildBi3(parentBi3);
    }

    @GetMapping("/get-child-by-parent-bi-3/{parentId}")
    public void getChildByParentBi3(@PathVariable Long parentId) {
        service.getChildByParentBi3(parentId);
    }

    @GetMapping("/get-parent-by-child-bi-3/{childId}")
    public void getParentByChildBi3(@PathVariable Long childId) {
        service.getParentByChildBi3(childId);
    }

    @GetMapping("/get-all-parents-bi-3")
    public void getParentsBi3() {
        List<ParentBi3> parents = service.getParentsBi3();
        parents.forEach(a -> System.out.println(a.getName()));
    }

    @GetMapping("/get-all-children-bi-3")
    public void getChildrenBi3() {
        List<ChildBi3> parents = service.getChildrenBi3();
        parents.forEach(a -> System.out.println(a.getName()));
    }

    @GetMapping("/update-child-bi-3/{childId}")
    public void updateChildrenBi3(@PathVariable Long childId) {
        service.updateChildrenBi3(childId);
    }

    @GetMapping("/update-parent-bi-3/{parentId}")
    public void updateParentBi3(@PathVariable Long parentId) {
        service.updateParentBi3(parentId);
    }

    @GetMapping("/update-correct-parent-bi-3/{parentId}")
    public void correctUpdateParentBi3(@PathVariable Long parentId) {
        service.deleteChildBeforeUpdateBi3(parentId);
        service.correctUpdateParentBi3(parentId);
    }

    @GetMapping("/delete-child-bi-3/{childId}")
    public void deleteChildrenBi3(@PathVariable Long childId) {
        service.deleteChildBi3(childId);
    }

    @GetMapping("/delete-parent-bi-3/{parentId}")
    public void deleteParentBi3(@PathVariable Long parentId) {
        service.deleteParentBi3(parentId);
    }






    //              Unidirectional

    @GetMapping("/create-uni")
    private void createUni()  {
        service.createUni();
    }

    @GetMapping("/create-correct-uni")
    private void createCorrectUni()  {
        service.createCorrectUni();
    }

    @GetMapping("/get-child-by-parent-uni/{parentId}")
    public void getChildByParentUni(@PathVariable Long parentId) {
        service.getChildByParentUni(parentId);
    }

    @GetMapping("/get-parent-by-child-uni/{childId}")
    public void getParentByChildUni(@PathVariable Long childId) {
        service.getParentByChildUni(childId);
    }

    @GetMapping("/get-all-parents-uni")
    public void getParentsUni() {
        List<ParentUni> parents = service.getParentsUni();
        parents.forEach(a -> System.out.println(a.getName()));
    }

    @GetMapping("/get-all-children-uni")
    public void getChildrenUni() {
        List<ChildUni> parents = service.getChildrenUni();
        parents.forEach(a -> System.out.println(a.getName()));
    }

    @GetMapping("/update-child-uni/{childId}")
    public void updateChildrenUni(@PathVariable Long childId) {
        service.updateChildrenUni(childId);
    }

    @GetMapping("/update-parent-uni/{parentId}")
    public void updateParentUni(@PathVariable Long parentId) {
        service.deleteChildBeforeUpdateUni(parentId);
        service.updateParentUni(parentId);
    }

    @GetMapping("/delete-child-uni/{childId}")
    public void deleteChildrenUni(@PathVariable Long childId) {
        service.deleteChildUni(childId);
    }

    @GetMapping("/delete-parent-uni/{parentId}")
    public void deleteParentUni(@PathVariable Long parentId) {
        service.deleteParentUni(parentId);
    }
}
