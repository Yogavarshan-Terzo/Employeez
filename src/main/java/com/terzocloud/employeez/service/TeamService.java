package com.terzocloud.employeez.service;

import com.terzocloud.employeez.dto.TeamDto;

import java.util.List;

public interface TeamService {
    List<TeamDto> findAll();
}
