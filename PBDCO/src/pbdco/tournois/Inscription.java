/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbdco.tournois;
/**
 *
 * @author milcenan
 */
public class Inscription extends Organisation{

    public Inscription(String tour){
        super(tour);
    }
    
    public void inscrit(String nom, String prenom, String adresse){
        Joueur nouvJoueur;
        this.nouvJoueur = new Joueur(nom, prenom, adresse);
    }
}
