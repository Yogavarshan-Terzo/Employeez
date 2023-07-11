package com.terzocloud.employeez.controller;

import com.terzocloud.employeez.entity.Leave;
import com.terzocloud.employeez.service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
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
}
