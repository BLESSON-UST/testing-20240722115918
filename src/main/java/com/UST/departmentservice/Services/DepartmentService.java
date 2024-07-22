The current version of the code is written in Spring Framework version 4.x.

Upgraded code compatible with Spring Framework version 5.x:

```java
package com.UST.departmentservice.Services;

import com.UST.departmentservice.Model.Department;
import com.UST.departmentservice.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    private final DepartmentRepository repo;

    @Autowired
    public DepartmentService(DepartmentRepository repo) {
        this.repo = repo;
    }

    public Department saveDepartment(Department department) {
        return repo.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        return repo.findByDepartmentId(departmentId);
    }
}
```

Changes Made:
1. Removed field injection of `DepartmentRepository` and added constructor injection by autowiring it in the constructor.
2. Added `final` modifier to the `repo` field in `DepartmentService` class.
3. Removed unnecessary import statements.

The above code follows the recommended best practices for constructor injection in Spring 5.x.