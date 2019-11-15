package com.springbootReact.agileBoard.repo;

import com.springbootReact.agileBoard.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepo extends JpaRepository<Task, Long> {


}
