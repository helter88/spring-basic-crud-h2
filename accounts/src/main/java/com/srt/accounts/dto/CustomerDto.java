package com.srt.accounts.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class CustomerDto {
    @NotEmpty(message = "Name can not be a null or empty")
    private String name;
    @NotEmpty(message = "Email can not be a null or empty")
    private String email;
    private String mobileNumber;
    private AccountsDto accountsDto;
}
