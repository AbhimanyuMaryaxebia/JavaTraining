package com.xebia.JavaTraining.rest;

import com.xebia.JavaTraining.model.Book;
import com.xebia.JavaTraining.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class XebiaController {
    @Autowired
    private BookRepo bookRepo;

    @GetMapping("/data")
    public List<Book> GetData() {
        return bookRepo.findAll();
    }

    @PostMapping("/data")
    @ResponseStatus(HttpStatus.OK)
    public void SendData(Book book)
    {
        bookRepo.save(book);
    }

    @GetMapping("/data/{id}")
    public Optional<Book> GetSpecificData(@PathVariable("id") int id)
    {
        return bookRepo.findById(id);
    }

    @DeleteMapping("/data/{IdToDelete}")
    public String DeleteRecord(@PathVariable("IdToDelete") int IdToDelete)
    {
        bookRepo.deleteById(IdToDelete);
        return "Record Deleted Successfully";
    }


}
