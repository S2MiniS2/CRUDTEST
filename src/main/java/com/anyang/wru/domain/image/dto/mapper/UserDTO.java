package com.anyang.wru.domain.image.dto.mapper;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class UserDTO {

    @NotNull
    private String user_id;
    @NotNull
    private String user_name;
    @NotNull
    private String email;
   //

}