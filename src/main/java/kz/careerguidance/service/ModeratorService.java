package kz.careerguidance.service;

import kz.careerguidance.repository.ModeratorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ModeratorService {
    private final ModeratorRepository moderatorRepository;

}
