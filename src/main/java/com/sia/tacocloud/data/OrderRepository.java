package com.sia.tacocloud.data;


import com.sia.tacocloud.TacoOrder;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface OrderRepository extends CrudRepository<TacoOrder, String> {

//    TacoOrder save(TacoOrder tacoOrder);

    List<TacoOrder> findTacoOrderByDeliveryZipAndPlacedAtBetween(String zip, Date from, Date to);

}
