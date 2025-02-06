package practice.example.entity;

import practice.example.entity.base.BaseEntity;

import java.util.Objects;

public class Seat extends BaseEntity {
    private static long counter = 0;

    private String description; // 설명

    public Seat(long id) {
        this.id = id;
        this.description = id + "번 좌석";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Seat seat = (Seat) o;
        return id == seat.id && Objects.equals(description, seat.description);
    }


    @Override
    public String toString() {
        return "Seat{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
