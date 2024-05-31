package io.github.x1111101101.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public class HelloResponseDto {
    final String name;
    final int amount;
}