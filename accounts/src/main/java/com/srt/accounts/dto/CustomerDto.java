package com.srt.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold Customer and Account information"
)
public class CustomerDto {
    @Schema(
            description = "Name of the customer",
            example = "Tomasz"
    )
    @NotEmpty(message = "Name can not be a null or empty")
    private String name;
    @Schema(
            description = "Email of the customer",
            example = "tomasz@gmail.com"
    )
    @NotEmpty(message = "Email can not be a null or empty")
    private String email;
    @Schema(
            description = "Mobile Number of the customer",
            example = "9435672184"
    )
    private String mobileNumber;
    @Schema(
            description = "Account details of the customer"
    )
    private AccountsDto accountsDto;
}
