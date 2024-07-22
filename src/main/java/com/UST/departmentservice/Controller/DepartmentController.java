The code is written in Java and is compatible with Java 8. 

Here is the modified code for compatibility with Java 15:

```java
package com.UST.departmentservice.Controller;

import com.UST.departmentservice.Model.Department;
import com.UST.departmentservice.Services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    
    private final DepartmentService departmentService;

    @Autowired
    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("/")
    public Department saveDepById(@RequestBody Department department)
    {
        return departmentService.saveDepartment(department);
    }


    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId){
        return departmentService.findDepartmentById(departmentId);
    }

}
```

Changes made in the upgraded version:
- Added the `final` modifier to the `departmentService` field to ensure immutability.
- Added a constructor to inject the `DepartmentService` dependency using constructor-based dependency injection.
- Removed the `@Autowired` annotation from the `departmentService` field since it is now injected through the constructor.