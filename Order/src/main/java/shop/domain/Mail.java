package shop.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import shop.domain.*;
import shop.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Mail extends AbstractEvent {

    private Long id;

    public Mail(Order aggregate) {
        super(aggregate);
    }

    public Mail() {
        super();
    }
}
//>>> DDD / Domain Event
