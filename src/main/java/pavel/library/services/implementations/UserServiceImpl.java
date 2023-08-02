package pavel.library.services.implementations;

import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pavel.library.domain.User;
import pavel.library.dto.UserDto;
import pavel.library.services.interfaces.UserService;

import javax.transaction.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class UserServiceImpl implements UserService, UserDetailsService {
    @Override
    public UserDto toDto(User object) {
        return null;
    }

    @Override
    public User fromDto(UserDto dto) {
        return null;
    }

    @Override
    public User get(long id) {
        return null;
    }

    @Override
    public User create(UserDto dto) {
        return null;
    }

    @Override
    public User update(UserDto dto) {
        return null;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
