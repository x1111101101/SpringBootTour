package io.github.x1111101101.service.posts;

import io.github.x1111101101.domain.posts.PostsRepository;
import io.github.x1111101101.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 */
@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {
        System.out.println("SAVED");
        return postsRepository.save(requestDto.toEntity()).getId();
    }
}
