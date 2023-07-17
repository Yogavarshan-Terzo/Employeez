package com.terzocloud.employeez.service;

import com.terzocloud.employeez.dto.AppliedLeaveDto;
import com.terzocloud.employeez.dto.ApplyLeaveDto;
import com.terzocloud.employeez.entity.Leave;
import com.terzocloud.employeez.entity.LeaveInfo;

import java.util.List;

public interface LeaveService {
    List<Leave> findAll();

    Leave save(Leave leave);

    Leave findById(Long leaveId);

    LeaveInfo findLeaveInfoById(Long leaveInfoId);

    String applyLeave(ApplyLeaveDto applyLeaveDto);

    List<AppliedLeaveDto> getAppliedLeavesForAdmin();
    String approveLeave(Long leaveId);
}
