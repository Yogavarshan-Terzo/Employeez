package com.terzocloud.employeez.service;

import com.terzocloud.employeez.entity.Leave;

import java.util.List;

public interface LeaveService {
    List<Leave> findAll();

    Leave save(Leave leave);

    Leave findById(Long leaveId);
}
