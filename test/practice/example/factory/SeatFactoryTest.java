package practice.example.factory;

// import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import practice.example.entity.Seat;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class SeatFactoryTest {

    @Test
    void from() {
        List<Seat> seatList = SeatFactory.getSeats();

        seatList.clear(); // 유저 리스트 초기화

        int countBefore = seatList.size(); // 길이 0

        // 사용자 2명을 추가하였으나 중복 데이터로 1개만 추가가 돼야함
        Seat user1 = SeatFactory.from(6);
        Seat user2 = SeatFactory.from(6);

        int countAfter = seatList.size(); // 길이 1이 돼야함

        assertThat(countAfter).isEqualTo(countBefore + 1);
        assertThat(user1).isSameAs(user2);
    }
}