package com.devrezaur.main.controller;

import com.devrezaur.main.model.Candidate;
import com.devrezaur.main.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    private CandidateService candidateService;

    @GetMapping("/")
    public String homePage() {
        return "home-page.html";
    }

    @PostMapping("/find-by-id")
    public String findById(@RequestParam Integer id, Model model) {
        model.addAttribute("candidate", candidateService.findById(id));
        return "candidate-page.html";
    }

    @GetMapping("/add-candidate")
    public String addCandidate() {
        return "add-candidate-page.html";
    }

    @PostMapping("/add-candidate")
    public String addCandidate(@ModelAttribute Candidate candidate) {
        candidateService.addCandidate(candidate);
        return "home-page.html";
    }

    @GetMapping("/list-all-candidates")
    public String listAllCandidates(Model model) {
        model.addAttribute("candidateList", candidateService.getAllCandidate());
        return "all-candidates-page.html";
    }

}
