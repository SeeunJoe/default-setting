package com.metacoding.restserver.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)  // read만하는 transaction이고 각각의 메서드에 transactional 걸어야한다.
@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;
}