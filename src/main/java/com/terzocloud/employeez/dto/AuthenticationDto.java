package com.terzocloud.employeez.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthenticationDto {
    private String jwt;
}
