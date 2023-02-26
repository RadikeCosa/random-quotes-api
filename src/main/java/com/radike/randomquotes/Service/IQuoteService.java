package com.radike.randomquotes.Service;

import com.radike.randomquotes.Model.Quote;

import java.util.List;

public interface IQuoteService {

    List<Quote> getAllQuotes();

    void saveQuote (Quote quote);

    void deleteQuote (Long id);

    Quote getRandomQuote();


}
