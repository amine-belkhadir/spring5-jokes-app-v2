package guru.springframework.chucknorrisjokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;


@Service
public class JokesService {
    ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();

    public String getAJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
