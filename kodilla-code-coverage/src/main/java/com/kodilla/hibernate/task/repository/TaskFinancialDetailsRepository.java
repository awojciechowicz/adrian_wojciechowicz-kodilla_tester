package com.kodilla.hibernate.task.repository;

import com.kodilla.hibernate.task.TaskFinancialDetails;
import org.springframework.data.repository.CrudRepository;

public interface TaskFinancialDetailsRepository extends CrudRepository<TaskFinancialDetails, Integer> {
}
