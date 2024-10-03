package com.srt.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDto {
    @Schema(
            description = "Account Number of Eazy Bank account"
    )
    private Long accountNumber;
    @Schema(
            description = "Account type of Eazy Bank account",
            example = "Savings"
    )
    private String accountType;
    @Schema(
            description = "Eazy Bank branch address"
    )
    private String branchAddress;
}
