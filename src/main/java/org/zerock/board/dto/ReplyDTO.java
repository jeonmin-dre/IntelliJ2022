package org.zerock.board.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ReplyDTO {
    private Long rno;
    private String text;
    private String replyer;
    private LocalDateTime regDate, modDate;

    private Long bno;
}
