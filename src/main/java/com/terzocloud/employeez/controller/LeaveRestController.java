package com.terzocloud.employeez.controller;

import com.terzocloud.employeez.dto.AppliedLeaveDto;
import com.terzocloud.employeez.dto.ApplyLeaveDto;
import com.terzocloud.employeez.entity.Leave;
import com.terzocloud.employeez.entity.LeaveInfo;
import com.terzocloud.employeez.service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class LeaveRestController {
    LeaveService leaveService;
    @Autowired
    public LeaveRestController(LeaveService leaveService) {
        this.leaveService = leaveService;
    }
    @GetMapping("/leave")
    public List<Leave> findAll(){
       return leaveService.findAll();
    }

    @PostMapping("/leave")
    public Leave applyLeave(@RequestBody Leave leave){
      Leave appliedLeave = leaveService.save(leave);
      return appliedLeave;
    }

    @GetMapping("/leave/{leaveId}")
    public Leave getLeave(@PathVariable Long leaveId){
        Leave leave = leaveService.findById(leaveId);
        return leave;
    }

    @GetMapping("/employees/leave-info/{leaveInfoId}")
    public LeaveInfo getLeaveInfo(@PathVariable Long leaveInfoId){
        LeaveInfo leaveInfo = leaveService.findLeaveInfoById(leaveInfoId);
        return leaveInfo;
    }

    @PostMapping("/employees/apply-leave")
    public String applyLeave(@RequestBody ApplyLeaveDto applyLeaveDto){
        return leaveService.applyLeave(applyLeaveDto);
    }

    //Leaves for admin
    @GetMapping("/employees/applied-leaves")
    public List<AppliedLeaveDto> getAppliedLeavesForAdmin(){
        return leaveService.getAppliedLeavesForAdmin();
    }

    //approve leaves
    @GetMapping("/employees/leave/approve/{leaveId}")
    public String approveLeave(@PathVariable Long leaveId){
        leaveService.approveLeave(leaveId);
        return "Leave approved successfully";
    }
}
