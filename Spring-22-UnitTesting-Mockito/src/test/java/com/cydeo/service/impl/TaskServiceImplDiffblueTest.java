package com.cydeo.service.impl;

import com.cydeo.dto.TaskDTO;
import com.cydeo.entity.Project;
import com.cydeo.entity.Role;
import com.cydeo.entity.Task;
import com.cydeo.entity.User;
import com.cydeo.enums.Gender;
import com.cydeo.enums.Status;
import com.cydeo.mapper.ProjectMapper;
import com.cydeo.mapper.TaskMapper;
import com.cydeo.repository.TaskRepository;
import com.cydeo.repository.UserRepository;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {TaskServiceImpl.class, TaskMapper.class, ProjectMapper.class, ModelMapper.class})
@ExtendWith(SpringExtension.class)
class TaskServiceImplDiffblueTest {
    @MockBean
    private TaskRepository taskRepository;

    @Autowired
    private TaskServiceImpl taskServiceImpl;

    @MockBean
    private UserRepository userRepository;

    /**
     * Method under test: {@link TaskServiceImpl#updateStatus(TaskDTO)}
     */
    @Test
    void testUpdateStatus() {
        // Arrange
        Role role = new Role();
        role.setDescription("The characteristics of someone or something");
        role.setId(1L);
        role.setInsertDateTime(LocalDate.of(1970, 1, 1).atStartOfDay());
        role.setInsertUserId(1L);
        role.setIsDeleted(true);
        role.setLastUpdateDateTime(LocalDate.of(1970, 1, 1).atStartOfDay());
        role.setLastUpdateUserId(1L);

        User assignedEmployee = new User();
        assignedEmployee.setEnabled(true);
        assignedEmployee.setFirstName("Jane");
        assignedEmployee.setGender(Gender.MALE);
        assignedEmployee.setId(1L);
        assignedEmployee.setInsertDateTime(LocalDate.of(1970, 1, 1).atStartOfDay());
        assignedEmployee.setInsertUserId(1L);
        assignedEmployee.setIsDeleted(true);
        assignedEmployee.setLastName("Doe");
        assignedEmployee.setLastUpdateDateTime(LocalDate.of(1970, 1, 1).atStartOfDay());
        assignedEmployee.setLastUpdateUserId(1L);
        assignedEmployee.setPassWord("Pass Word");
        assignedEmployee.setPhone("6625550144");
        assignedEmployee.setRole(role);
        assignedEmployee.setUserName("janedoe");

        Role role2 = new Role();
        role2.setDescription("The characteristics of someone or something");
        role2.setId(1L);
        role2.setInsertDateTime(LocalDate.of(1970, 1, 1).atStartOfDay());
        role2.setInsertUserId(1L);
        role2.setIsDeleted(true);
        role2.setLastUpdateDateTime(LocalDate.of(1970, 1, 1).atStartOfDay());
        role2.setLastUpdateUserId(1L);

        User assignedManager = new User();
        assignedManager.setEnabled(true);
        assignedManager.setFirstName("Jane");
        assignedManager.setGender(Gender.MALE);
        assignedManager.setId(1L);
        assignedManager.setInsertDateTime(LocalDate.of(1970, 1, 1).atStartOfDay());
        assignedManager.setInsertUserId(1L);
        assignedManager.setIsDeleted(true);
        assignedManager.setLastName("Doe");
        assignedManager.setLastUpdateDateTime(LocalDate.of(1970, 1, 1).atStartOfDay());
        assignedManager.setLastUpdateUserId(1L);
        assignedManager.setPassWord("Pass Word");
        assignedManager.setPhone("6625550144");
        assignedManager.setRole(role2);
        assignedManager.setUserName("janedoe");

        Project project = new Project();
        project.setAssignedManager(assignedManager);
        project.setEndDate(LocalDate.of(1970, 1, 1));
        project.setId(1L);
        project.setInsertDateTime(LocalDate.of(1970, 1, 1).atStartOfDay());
        project.setInsertUserId(1L);
        project.setIsDeleted(true);
        project.setLastUpdateDateTime(LocalDate.of(1970, 1, 1).atStartOfDay());
        project.setLastUpdateUserId(1L);
        project.setProjectCode("Project Code");
        project.setProjectDetail("Project Detail");
        project.setProjectName("Project Name");
        project.setProjectStatus(Status.OPEN);
        project.setStartDate(LocalDate.of(1970, 1, 1));

        Task task = new Task();
        task.setAssignedDate(LocalDate.of(1970, 1, 1));
        task.setAssignedEmployee(assignedEmployee);
        task.setId(1L);
        task.setInsertDateTime(LocalDate.of(1970, 1, 1).atStartOfDay());
        task.setInsertUserId(1L);
        task.setIsDeleted(true);
        task.setLastUpdateDateTime(LocalDate.of(1970, 1, 1).atStartOfDay());
        task.setLastUpdateUserId(1L);
        task.setProject(project);
        task.setTaskDetail("Task Detail");
        task.setTaskStatus(Status.OPEN);
        task.setTaskSubject("Hello from the Dreaming Spires");
        Optional<Task> ofResult = Optional.of(task);

        Role role3 = new Role();
        role3.setDescription("The characteristics of someone or something");
        role3.setId(1L);
        role3.setInsertDateTime(LocalDate.of(1970, 1, 1).atStartOfDay());
        role3.setInsertUserId(1L);
        role3.setIsDeleted(true);
        role3.setLastUpdateDateTime(LocalDate.of(1970, 1, 1).atStartOfDay());
        role3.setLastUpdateUserId(1L);

        User assignedEmployee2 = new User();
        assignedEmployee2.setEnabled(true);
        assignedEmployee2.setFirstName("Jane");
        assignedEmployee2.setGender(Gender.MALE);
        assignedEmployee2.setId(1L);
        assignedEmployee2.setInsertDateTime(LocalDate.of(1970, 1, 1).atStartOfDay());
        assignedEmployee2.setInsertUserId(1L);
        assignedEmployee2.setIsDeleted(true);
        assignedEmployee2.setLastName("Doe");
        assignedEmployee2.setLastUpdateDateTime(LocalDate.of(1970, 1, 1).atStartOfDay());
        assignedEmployee2.setLastUpdateUserId(1L);
        assignedEmployee2.setPassWord("Pass Word");
        assignedEmployee2.setPhone("6625550144");
        assignedEmployee2.setRole(role3);
        assignedEmployee2.setUserName("janedoe");

        Role role4 = new Role();
        role4.setDescription("The characteristics of someone or something");
        role4.setId(1L);
        role4.setInsertDateTime(LocalDate.of(1970, 1, 1).atStartOfDay());
        role4.setInsertUserId(1L);
        role4.setIsDeleted(true);
        role4.setLastUpdateDateTime(LocalDate.of(1970, 1, 1).atStartOfDay());
        role4.setLastUpdateUserId(1L);

        User assignedManager2 = new User();
        assignedManager2.setEnabled(true);
        assignedManager2.setFirstName("Jane");
        assignedManager2.setGender(Gender.MALE);
        assignedManager2.setId(1L);
        assignedManager2.setInsertDateTime(LocalDate.of(1970, 1, 1).atStartOfDay());
        assignedManager2.setInsertUserId(1L);
        assignedManager2.setIsDeleted(true);
        assignedManager2.setLastName("Doe");
        assignedManager2.setLastUpdateDateTime(LocalDate.of(1970, 1, 1).atStartOfDay());
        assignedManager2.setLastUpdateUserId(1L);
        assignedManager2.setPassWord("Pass Word");
        assignedManager2.setPhone("6625550144");
        assignedManager2.setRole(role4);
        assignedManager2.setUserName("janedoe");

        Project project2 = new Project();
        project2.setAssignedManager(assignedManager2);
        project2.setEndDate(LocalDate.of(1970, 1, 1));
        project2.setId(1L);
        project2.setInsertDateTime(LocalDate.of(1970, 1, 1).atStartOfDay());
        project2.setInsertUserId(1L);
        project2.setIsDeleted(true);
        project2.setLastUpdateDateTime(LocalDate.of(1970, 1, 1).atStartOfDay());
        project2.setLastUpdateUserId(1L);
        project2.setProjectCode("Project Code");
        project2.setProjectDetail("Project Detail");
        project2.setProjectName("Project Name");
        project2.setProjectStatus(Status.OPEN);
        project2.setStartDate(LocalDate.of(1970, 1, 1));

        Task task2 = new Task();
        task2.setAssignedDate(LocalDate.of(1970, 1, 1));
        task2.setAssignedEmployee(assignedEmployee2);
        task2.setId(1L);
        task2.setInsertDateTime(LocalDate.of(1970, 1, 1).atStartOfDay());
        task2.setInsertUserId(1L);
        task2.setIsDeleted(true);
        task2.setLastUpdateDateTime(LocalDate.of(1970, 1, 1).atStartOfDay());
        task2.setLastUpdateUserId(1L);
        task2.setProject(project2);
        task2.setTaskDetail("Task Detail");
        task2.setTaskStatus(Status.OPEN);
        task2.setTaskSubject("Hello from the Dreaming Spires");

        // Act
        taskServiceImpl.updateStatus(new TaskDTO());
    }
}
