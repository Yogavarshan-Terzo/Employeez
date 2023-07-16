package com.terzocloud.employeez.mapper;

import com.terzocloud.employeez.dto.TeamDto;
import com.terzocloud.employeez.entity.Team;
import com.terzocloud.employeez.service.TeamService;

public class TeamMapper {
    public static TeamDto mapToTeamDto(Team team){
        TeamDto teamDto = TeamDto.builder()
                .id(team.getId())
                .name(team.getName())
                .build();
        return teamDto;
    }
}
