package backendadventurexp.demo.controller;

import backendadventurexp.demo.model.Booking;
import backendadventurexp.demo.model.TicketSystem;
import backendadventurexp.demo.repository.TicketSystemRepository;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TicketSystemController {

    private final TicketSystemRepository ticketSystemRepository;

    public TicketSystemController(TicketSystemRepository ticketSystemRepository) {
        this.ticketSystemRepository = ticketSystemRepository;
    }

//    ==================================================== GET PROFILES ================================================

    @GetMapping("/select/ticket/system")
    public List<TicketSystem> findAllTickets(){
        List<TicketSystem> ticketSystems = ticketSystemRepository.findAll();
        return ticketSystems;
    }


//    ==================================================== POST PROFILES ================================================

    @PostMapping(value="/tickets", consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public TicketSystem postTicket(@RequestBody TicketSystem tickets){
        System.out.println(tickets);
        return ticketSystemRepository.save(tickets);
    }

    @PostMapping(value="/insert/ticket", consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public TicketSystem insertTicket(@RequestBody TicketSystem insertTicket){
        System.out.println(insertTicket);

        return ticketSystemRepository.save(insertTicket);
    }

//    ==================================================== DELETE PROFILES ================================================

    @ResponseStatus(code=HttpStatus.NO_CONTENT)
    @DeleteMapping("/delete/ticket/{ticket_id}")
    public void deleteTicket(@PathVariable int ticket_id){
        try {
            ticketSystemRepository.deleteById(ticket_id);
        } catch (EmptyResultDataAccessException ex) {
            System.out.println("FEJL i DELETE =" + ex.getMessage());
        }
    }
}
