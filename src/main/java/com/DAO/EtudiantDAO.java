package com.DAO;

import com.Beans.Etudiant;

import java.util.ArrayList;

public interface EtudiantDAO {
   void Ajouter(Etudiant etudiant);
  ArrayList<Etudiant> AfficherEtudiants();
     void Delete(String matricule);
    Etudiant RecupererEtudiantByMatricule(String matricule );
    Etudiant ModifyEtudiant(String matricule , Etudiant etudiant);
    ArrayList<Etudiant> SearchByName(String name);
}
