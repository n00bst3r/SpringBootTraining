package de.rajic.springboot.training.controller;

import de.rajic.springboot.training.domain.Link;
import de.rajic.springboot.training.repository.LinkRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/links")
@AllArgsConstructor
public class LinkController {

    private LinkRepository linkRepository;

    @GetMapping("/")
    public List<Link> list() {
        return linkRepository.findAll();
    }

    @PostMapping("/create")
    public Link create(@ModelAttribute Link link) {
        return linkRepository.save(link);
    }

    @GetMapping("/{linkId}")
    public Optional<Link> read(@PathVariable final Long linkId) {
        return linkRepository.findById(linkId);
    }

    @PutMapping("/{linkId}")
    public Link update(@ModelAttribute Link link) {
        return linkRepository.save(link);
    }

    @DeleteMapping("/{linkId}")
    public void delete(@PathVariable final Long linkId) {
        linkRepository.delete(linkId);

    }
}
