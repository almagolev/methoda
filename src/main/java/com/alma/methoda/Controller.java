package com.alma.methoda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private StatusRepository statusRepository;

    @Autowired
    private TransactionRepository transactionRepository;

    @Autowired
    @GetMapping("/statuses")
    public ResponseEntity<List<Status>> getAllStatuses() {
        ArrayList<Status> statuses=new ArrayList(statusRepository.findAll());
        if (!statuses.isEmpty())
            return new ResponseEntity(statuses, HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/statuses")
    public ResponseEntity<Status> addStatus(@RequestBody Status status){
        try {
            statusRepository.save(status);
            return new ResponseEntity<>(status,HttpStatus.OK);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    @Autowired
    @GetMapping("/transactions")
    public ResponseEntity<List<Transaction>> getAllTransactions() {
        ArrayList<Transaction> transactions=new ArrayList(transactionRepository.findAll());
        if (!transactions.isEmpty())
            return new ResponseEntity(transactions, HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}