package site.metacoding.blogv3.config.auth;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.blogv3.domain.user.User;
import site.metacoding.blogv3.domain.user.UserRepository;

@RequiredArgsConstructor
@Service // ioc container에 등록됐다! /login 호출하면 인증필터가 유저디테일서비스를 찾아서 아래 메소드를 때려준다. 그 토큰
         // 두개(username, password) 중에 username만 던져준다. password는 영속성콘텍스트에서 확인한다.
public class LoginService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
              Optional<User> userOp = userRepository.findByUsername(username);

        if (userOp.isPresent()) {
            return new LoginUser(userOp.get());
        }
        return null;
    }
}
