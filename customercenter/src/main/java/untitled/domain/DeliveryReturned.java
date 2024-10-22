package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import untitled.infra.AbstractEvent;

@Data
public class DeliveryReturned extends AbstractEvent {

    private Long id;
    private String orderId;
    private String productName;
    private String productId;
    private Integer qty;
    private String address;
    private String status;
}
