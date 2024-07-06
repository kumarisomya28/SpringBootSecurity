package com.movieflix.MovieAPI.DTO;

import java.util.List;

public record MoviePageResponse(List<MovieDto> movieDtos,
                                Integer Pagenumber,
                                Integer PageSize,
                                long totalElements,
                                int totalPages,
                                boolean isLast) {
}
