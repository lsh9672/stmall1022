package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private String orderId;
    private String productName;
    private String productId;
    private Integer qty;
    private String address;
    private String status;

    public DeliveryStarted() {
        super();
    }
}
//>>> DDD / Domain Event
