package com.DAO;

import com.Beans.Etudiant;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class EtudiantDAOImpl implements EtudiantDAO{
    private static ArrayList<Etudiant> etudiants = new ArrayList<>();

    @Override
    public void Ajouter(Etudiant etudiant) {
        etudiants.add(etudiant);

    }

    @Override
    public ArrayList<Etudiant> AfficherEtudiants() {
        System.out.println(etudiants);
      return etudiants;
    }

    @Override
    public void Delete(String matricule) {
        etudiants.removeIf(etudiant -> etudiant.getMatricule().equals(matricule));

    }

    @Override
    public Etudiant RecupererEtudiantByMatricule(String matricule ) {
       for (Etudiant etudiant:etudiants){
           if (etudiant.getMatricule().equals(matricule)){
               return etudiant;
           }
       }
       return null;
    }

    @Override
    public Etudiant ModifyEtudiant(String matricule , Etudiant etudiant) {
        for (Etudiant etudiant1:etudiants){
            if(etudiant1.getMatricule().equals(matricule)){
                etudiant1.setNom(etudiant.getNom());
                etudiant1.setNumero(etudiant.getNumero());
                etudiant1.setEmail(etudiant.getEmail());

            }
        }
        return null;
    }

    @Override
    public ArrayList<Etudiant> SearchByName(String name) {
        ArrayList<Etudiant> etudiantsSearch = new ArrayList<>();
        for (Etudiant etudiant:etudiants){
            if (etudiant.getNom().equals(name)){
                etudiantsSearch.add(etudiant);
            }
        }
        return etudiantsSearch;
    }
}
