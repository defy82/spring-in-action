package com.sia.tacocloud.data;


import com.sia.tacocloud.TacoOrder;

public interface OrderRepository {

    TacoOrder save(TacoOrder tacoOrder);

}
