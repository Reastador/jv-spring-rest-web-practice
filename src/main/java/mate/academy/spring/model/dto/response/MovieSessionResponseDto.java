package mate.academy.spring.model.dto.response;

import lombok.Data;

@Data
public class MovieSessionResponseDto {
    private Long id;
    private String movieTitle;
    private String showTime;
    private int cinemaHallCapacity;
}
