package com.terzocloud.employeez.mapper;

import com.terzocloud.employeez.dto.AppliedLeaveDto;
import com.terzocloud.employeez.entity.Leave;

import static com.terzocloud.employeez.mapper.EmployeeMapper.mapToEmployeeDto;

public class LeaveMapper {
    public static AppliedLeaveDto mapToAppliedLeaveDto(Leave leave){
        AppliedLeaveDto leaveDto = AppliedLeaveDto.builder()
                .employeeDto(mapToEmployeeDto(leave.getEmployee()))
                .applyOn(leave.getApplyOn())
                .note(leave.getNote())
                .type(leave.getType())
                .isApproved(leave.getIsApproved())
                .id(leave.getId())
                .build();
        return leaveDto;

    }
}
