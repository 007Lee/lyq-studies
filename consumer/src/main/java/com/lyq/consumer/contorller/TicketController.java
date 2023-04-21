package com.lyq.consumer.contorller;

import com.lyq.consumer.service.TicketConsumer;
import com.lyq.pojo.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {

    @Autowired
    TicketConsumer ticketConsumer;

    @RequestMapping("/ticket")
    public Ticket getTicket() {
        return ticketConsumer.consumeTicket();
    }
}
