package mysolution.domain;

import java.util.*;
import lombok.*;
import mysolution.domain.*;
import mysolution.infra.AbstractEvent;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private Long productId;
    private Integer qty;
    private String productName;
    private String orderStatus;
    // keep

}
