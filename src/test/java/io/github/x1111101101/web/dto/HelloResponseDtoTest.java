package io.github.x1111101101.web.dto;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class HelloResponseDtoTest {
    @Test
    public void record_dto_test() {
        // given
        String name = "test";
        int amount = 1000;

        // when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        // then
        assertEquals(dto.getName(), name);
        assertEquals(dto.getAmount(), amount);
    }
}
