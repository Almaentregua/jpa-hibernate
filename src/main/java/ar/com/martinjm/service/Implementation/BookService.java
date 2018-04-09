package ar.com.martinjm.service.Implementation;

import ar.com.martinjm.entities.AutorEntity;
import ar.com.martinjm.entities.BookEntity;
import ar.com.martinjm.repositories.BookRepository;
import ar.com.martinjm.service.Interfaces.BookInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements BookInterface {
    @Autowired
    BookRepository bookRepository;

    @Override
    public List<AutorEntity> getAllAutors() {
        List<AutorEntity> autors = bookRepository.findAll();

        /**
         * Only for test
         */
        if (autors.size() > 0){
            List<BookEntity> books = autors.get(0).getListBookEntities();
            System.out.print(books.get(0).getName());
        }


        return autors;
    }
}
