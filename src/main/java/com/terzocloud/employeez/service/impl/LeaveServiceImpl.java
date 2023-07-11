package com.terzocloud.employeez.service.impl;

import com.terzocloud.employeez.entity.Leave;
import com.terzocloud.employeez.exception.LeaveNotFoundException;
import com.terzocloud.employeez.repository.LeaveRepository;
import com.terzocloud.employeez.service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.terzocloud.employeez.mapper.EmployeeMapper.mapToEmployeeDto;

@Service
public class LeaveServiceImpl implements LeaveService {
    LeaveRepository leaveRepository;
    @Autowired
    public LeaveServiceImpl(LeaveRepository leaveRepository) {
        this.leaveRepository = leaveRepository;
    }

    @Override
    public List<Leave> findAll() {
        List<Leave> leaves =  leaveRepository.findAll();
        return leaves;
    }

    @Override
    public Leave save(Leave leave) {
        return leaveRepository.save(leave);
    }

    @Override
    public Leave findById(Long leaveId) {
        Optional<Leave> leave = leaveRepository.findById(leaveId);
        if(leave.isPresent()){
            return leave.get();
        }else {
            throw new LeaveNotFoundException("Leave not found");
        }
    }
}
