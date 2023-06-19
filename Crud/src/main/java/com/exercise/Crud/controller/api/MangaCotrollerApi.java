package com.exercise.Crud.controller.api;

import com.exercise.Crud.model.Manga;
import com.exercise.Crud.repository.iMangaRepo;
import com.exercise.Crud.service.DbMangaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
public class MangaCotrollerApi {

    @Autowired
    @Qualifier("mainMangaService")
    private DbMangaService dbMangaService;

   // final  static Logger logger = LoggerFactory.getLogger(MangaCotrollerApi.class);

    public MangaCotrollerApi() {

    }

    @Autowired
    private iMangaRepo iMangaRepo;


    @GetMapping("/getAllManga")
    public Iterable<Manga> getAllManga() {
       // logger.info("All manga method accessed");

        return dbMangaService.getAllManga();
    }


    @GetMapping("/getMangaById/{id}")
    public ResponseEntity<Manga> getMangaById(@PathVariable Integer id) {

       Optional<Manga> manga = dbMangaService.getMangaById(id);

       if (manga.isPresent()) {
           return new ResponseEntity<>(manga.get(), HttpStatus.OK);
       }
       // logger.info("Get manga by ID method accessed");
       return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


    @PostMapping("/addManga")
    public Manga addManga(@RequestBody Manga manga) {
       // logger.info("Add manga method accessed");
        return dbMangaService.addManga(manga);
    }


    @PostMapping("/updateMangaById/{id}")
    public Manga updateMangaById(@PathVariable Integer id, @RequestBody Manga newMangaData){

        Optional<Manga> mangaData = dbMangaService.updateMangaById(id, newMangaData);

        if (mangaData.isEmpty()) {

          throw  new ResponseStatusException(HttpStatus.NOT_FOUND);

        }
       // logger.info("Update  manga by ID  method accessed");
        return mangaData.get();

    }


    @DeleteMapping("/deleteMangaById/{id}")
    public ResponseEntity<HttpStatus> deleteMangaById(@PathVariable Integer id) {

        iMangaRepo.deleteById(id);
        //logger.info("Delete manga method accessed");
        return  new ResponseEntity<>(HttpStatus.OK);
    }

}
