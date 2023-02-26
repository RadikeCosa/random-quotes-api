package com.radike.randomquotes.Controller;

import com.radike.randomquotes.Model.Quote;
import com.radike.randomquotes.Service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuoteController {

    @Autowired
    private QuoteService quoteService;

    @GetMapping("api/quotes")
    public List<Quote> getAllQuotes(){
        return quoteService.getAllQuotes();
    }
    @PostMapping("/api/quotes")
    public String saveQuote(@RequestBody Quote quote){
        quoteService.saveQuote(quote);
        return "La cita fue agregada exitosamente";
    }
    @DeleteMapping("/api/quotes/{id}")
    public String deleteQuote (@PathVariable Long id){
        quoteService.deleteQuote(id);
        return "La cita fue exitosamente eliminada";
    }

    @GetMapping("api/random")
    public ResponseEntity<Quote> getRandomQuote() {
        Quote randomQuote = quoteService.getRandomQuote();
        if (randomQuote == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(randomQuote);
    }
}
