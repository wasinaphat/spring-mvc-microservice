package com.mvc.userapi.request;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Getter
@Setter
@NoArgsConstructor
public class UserRequest {

    @NotEmpty
    @Size(min = 2,max = 100)
    private String username;
    private String password;
    private String email;
}
