package com.lyq.consumer.service;

import com.lyq.pojo.Ticket;
import com.lyq.service.TicketService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

@Service
public class TicketConsumer {

    @DubboReference
    TicketService ticketService;

    public Ticket consumeTicket() {
        Ticket ticket = ticketService.getTicket();
        System.out.println("====consume ticket: " + ticket);
        return ticket;
    }

}
