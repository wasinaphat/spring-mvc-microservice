package com.mvc.userapi.request;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Getter
@Setter
@NoArgsConstructor
public class UserRequest {

    @NotNull(message = "username has to be present")
    @Min(value = 1,message = "at least 1 chars")
    private String username;
    private String password;
    private String email;
}
