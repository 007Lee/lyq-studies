package com.lyq.provider.service;

import com.lyq.pojo.Ticket;
import com.lyq.service.TicketService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class TicketServiceImpl implements TicketService {

    @Override
    public Ticket getTicket() {
        return new Ticket("员工票", "故宫门票", 100);
    }
}
