package com.terzocloud.employeez.service.impl;

import com.terzocloud.employeez.dto.TeamDto;
import com.terzocloud.employeez.repository.TeamRepository;
import com.terzocloud.employeez.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.terzocloud.employeez.mapper.TeamMapper.mapToTeamDto;

@Service
public class TeamServiceImpl implements TeamService {
    TeamRepository teamRepository;
    @Autowired
    public TeamServiceImpl(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @Override
    public List<TeamDto> findAll() {
        List<TeamDto> teams = teamRepository.findAll().stream()
                .map(team -> mapToTeamDto(team))
                .collect(Collectors.toList());
        return teams;
    }
}
