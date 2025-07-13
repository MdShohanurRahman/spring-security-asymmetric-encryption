package com.alibou.app.user.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProfileUpdateRequest {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
}
