package com.panchalprogrammingacademy;


import com.Beans.Etudiant;

import com.DAO.EtudiantDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.*;




@Controller
 class EtudiantController {

    @Autowired
    private EtudiantDAO etudiantDAO;


    @RequestMapping(value = "/")
    public String showEtudiantForm(Model model) {
        model.addAttribute("Etudiant", new Etudiant());
        return "Etudiant";
    }

    @RequestMapping(value = "/saveEtudiant")
    public String saveEtudiant(Etudiant etudiant) {

        etudiantDAO.Ajouter(etudiant);
        return "redirect:/etudiants";
    }


    @RequestMapping("/etudiants")
    public String showEtudiants(Model model) {
        model.addAttribute("Etudiants",  etudiantDAO.AfficherEtudiants());

        return "Etudiants";
    }



    @RequestMapping(value = "/deleteEtudiant/{matricule}")
    public String DeleteEtudiant(@PathVariable("matricule") String matricule) {
        etudiantDAO.Delete(matricule);
        return "redirect:/etudiants";
    }




    @RequestMapping(value = "/modifyEtudiant/{matricule}")
    public String ModifyEtudiant(@PathVariable("matricule") String matricule,Model model) {
      model.addAttribute("etudiant",etudiantDAO.RecupererEtudiantByMatricule(matricule));

        return "FormeModify";

    }

    @RequestMapping("/saveNewEtudiant")

    public String saveNewEtudiant(@ModelAttribute("matricule") String matricule, Etudiant etudiant) {

        etudiantDAO.ModifyEtudiant(matricule, etudiant);

        return "redirect:/etudiants";
    }




    @RequestMapping(value = "/Search")
    public String Search(@RequestParam("nom") String nom, Model model) {
        model.addAttribute("Etudiants", etudiantDAO.SearchByName(nom));
        return "Etudiants";
    }


}




