package com.radike.randomquotes.Service;

import com.radike.randomquotes.Model.Quote;
import com.radike.randomquotes.Repository.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuoteService  implements IQuoteService{

    @Autowired
    private QuoteRepository quoteRepository;

    @Override
    public List<Quote> getAllQuotes() {
        return quoteRepository.findAll();
    }

    @Override
    public void saveQuote(Quote quote) {
        quoteRepository.save(quote);
    }

    @Override
    public void deleteQuote(Long id) {
        quoteRepository.deleteById(id);
    }

    @Override
    public Quote getRandomQuote() {
        return quoteRepository.findRandomQuote();
    }
}
