package springDataJpa.Dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class CustomerDto {


    @NotNull
    @NotBlank
    private String name;

    @NotBlank
    @NotNull
    private String foodName;
}
