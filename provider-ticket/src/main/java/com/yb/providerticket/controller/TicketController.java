package com.yb.providerticket.controller;

import com.yb.providerticket.entity.UserInfo;
import com.yb.providerticket.server.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TicketController {
    @Autowired
    TicketService ticketService;
    @GetMapping("/test")
    public String getTicket(){
        return ticketService.getTicet();
    }

    @GetMapping("/tess")
    public String test(){

        return ticketService.test();
    }

    @GetMapping("/find")
    public List<UserInfo> find(){
        return ticketService.findUser();
    }


}
