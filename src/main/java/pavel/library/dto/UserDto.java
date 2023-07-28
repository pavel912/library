package pavel.library.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.Instant;
import java.util.Date;
import java.util.List;

@Data
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDto {
    private long id;

    private Instant createdAt;

    @Email(message = "Email is in incorrect format")
    @NotBlank
    private String email;

    @Size(min = 5, message = "Password should be not shorter than 5 characters")
    private String password;

    @NotBlank(message = "First name can't be empty")
    private String firstName;

    @NotBlank(message = "Last name can't be empty")
    private String lastName;

    @NotNull(message = "Date of birth can't be empty")
    private Date dateOfBirth;

    @NotBlank(message = "Phone number can't be empty")
    private String phoneNumber;

    private String passportRef;

    private UserRoleDto userRole;

    private Long userRoleId;

    private List<OrderDto> orders;
}
