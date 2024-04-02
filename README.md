<h3>Compte Rendu Tp3</h3>
<p>
Spring MVC Architecture<br>


1-Afficher les patients:<br>
Entity Patient:
<center><img src="assets/EntityPatient.PNG"></center>

Patient Repository:
<center><img src="assets/PatientRepository.PNG"></center>

Patient Controller:
<center><img src="assets/PatientController.PNG"></center>

Application:
<center><img src="assets/Application.PNG"></center>

Affichage des patients dans une template Thymeleaf:
<center><img src="assets/aff_thymleaf.PNG"></center>

2-Faire la pagination:
Affichage:
Ajouter 'size' et 'page' dans le Controlleur
<center><img src="assets/Faire_Pagination_Size_Page.PNG"></center>
la barre de pagination dans html
<center><img src="assets/barre_pagination_html.PNG"></center>

3-Chercher les patients:
Ajouter le formulaire de recherche
<center><img src="assets/Chercher_Patient.PNG"></center>

Ajouter la methode "findByNomContains" dans Patient Repository
<center><img src="assets/methode_findByNomContains.PNG"></center>

Ajouter le mot keyword dans la barre de pagination
<center><img src="assets/ajouter_keyword.PNG"></center>

Ajouter le parametre keyword dans Patient Controller
<center><img src="assets/ajouter_keyword_a_patientController.PNG"></center>

Resultat:
<center><img src="assets/Resultat3.PNG"></center>

4-Supprimer un patient:
Ajouter un boutton delete dans "patients.html" avec une confirmation Onclick
<center><img src="assets/supp_patient.PNG"></center>

Creer la methode delete dans le controller et faire une redirection vers index
<center><img src="assets/methode_supp_patient.PNG"></center>
Resultat:
<center><img src="assets/Resultat4_1.PNG"></center>
<center><img src="assets/resultat4_2.PNG"></center>
