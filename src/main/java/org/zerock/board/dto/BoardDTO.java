package org.zerock.board.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoardDTO {
    // Board
    private Long bno;
    private String title;
    private String content;
    private LocalDateTime regDate;
    private LocalDateTime modDate;
    // Member
    private String writerEmail;
    private String writerName;
    // Reply
    private int replyCount;
}
