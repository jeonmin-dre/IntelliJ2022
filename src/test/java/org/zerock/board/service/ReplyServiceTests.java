package org.zerock.board.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.board.dto.ReplyDTO;

import java.util.List;

@SpringBootTest
public class ReplyServiceTests {
    @Autowired
    private ReplyService service;

    @Test
    public void testGetList() {
        Long bno = 100L;

        List<ReplyDTO> replyDTOList = service.getList(bno);

        replyDTOList.forEach(replyDTO -> System.out.println(replyDTO));
    }
    // Hibernate:
    //    select
    //        reply0_.rno as rno1_2_,
    //        reply0_.moddate as moddate2_2_,
    //        reply0_.regdate as regdate3_2_,
    //        reply0_.board_bno as board_bn6_2_,
    //        reply0_.replyer as replyer4_2_,
    //        reply0_.text as text5_2_
    //    from
    //        reply reply0_
    //    where
    //        reply0_.board_bno=?
    //    order by
    //        reply0_.rno asc
}
