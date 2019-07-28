package com.arkarmoe.springboot_lombok.entity;

import lombok.*;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private @NonNull String firstName;
    private @NonNull String lastName;
    private String email;
}
