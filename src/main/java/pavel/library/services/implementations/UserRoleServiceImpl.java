package pavel.library.services.implementations;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pavel.library.domain.UserRole;
import pavel.library.dto.UserRoleDto;
import pavel.library.services.interfaces.UserRoleService;

import javax.transaction.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class UserRoleServiceImpl implements UserRoleService {
    @Override
    public UserRoleDto toDto(UserRole object) {
        return null;
    }

    @Override
    public UserRole fromDto(UserRoleDto dto) {
        return null;
    }

    @Override
    public UserRole get(long id) {
        return null;
    }

    @Override
    public UserRole create(UserRoleDto dto) {
        return null;
    }

    @Override
    public UserRole update(UserRoleDto dto) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
