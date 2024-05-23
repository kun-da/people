package org.example.people.controller;

import org.example.people.pojo.Personnel;
import org.example.people.service.PersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PersonnelController {

    @Autowired
    private PersonnelService personnelService;

    @GetMapping("/personnel")
    public String listPersonnel(Model model) {
        List<Personnel> personnelList = personnelService.getAllPersonnel();
        model.addAttribute("personnel", personnelList);
        return "personnel_list";
    }

    @GetMapping("/personnel/{id}")
    public String getPersonnel(@PathVariable int id, Model model) {
        Personnel personnel = personnelService.getPersonnelById(id);
        model.addAttribute("personnel", personnel);
        return "personnel_detail";
    }

    @GetMapping("/personnel/new")
    public String createPersonnelForm(Model model) {
        model.addAttribute("personnel", new Personnel());
        return "personnel_form";
    }

    @PostMapping("/personnel")
    public String savePersonnel(@ModelAttribute Personnel personnel) {
        personnelService.savePersonnel(personnel);
        return "redirect:/personnel";
    }

    @GetMapping("/personnel/delete/{id}")
    public String deletePersonnel(@PathVariable int id) {
        personnelService.deletePersonnel(id);
        return "redirect:/personnel";
    }
}
