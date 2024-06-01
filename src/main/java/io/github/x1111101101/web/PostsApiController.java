package io.github.x1111101101.web;

import io.github.x1111101101.service.posts.PostsService;
import io.github.x1111101101.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@Controller
public class PostsApiController {
    private final PostsService postsService;

    @ResponseBody
    @PostMapping(value = "/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto dto) {
        return postsService.save(dto);
    }
}
