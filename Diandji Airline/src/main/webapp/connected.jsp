<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Connectez-Vous | sur votre Site de Réservation de Billet Airline Diandji</title>
    <!-- CSS only -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css">
    <link rel="stylesheet" href="styles.css">
<body>

	<main class="main">
		
		<!-- NavBar -->
	    <div class="navbar">
	    	<ul class="">
		      	<h1 class="logo"><a href="index.jsp">Diandji Airline</a></h1>
		        <li class="nav-item"><a href="#"><i class="fa-solid fa-plane"></i> &nbsp; Vols</a></li>
		        <li class="nav-item"><a href="#">Vol + Hôtel</a></li>
		        <li class="nav-item"><a href="#">Réservations</a></li>
		        <li class="nav-item"><a href="#">Horaires Vols</a></li>
		        <li class="nav-item"><a href="#">Contact Us</a></li>
		       	<li class="nav-item active1"><a href="connected.jsp">Se Connecter</a></li>
	    	</ul>
	    </div>
	    
    	<!-- Formulaire de Connection -->
    	
  		 <main>	
		   	 <div class="register1">
		     <h1 class="dash-title1">Se Connecter</h1>
		     	<form method="POST" action="login">
		            <div class="user-details1">
						<div class="input-box1">
							<span class="details1">Nom d'utilisateur</span>
							<input type="text" name="pseudo" placeholder="Entrez votre Nom d'utilisateur" required="">
						</div>
						<div class="input-box1">
							<span class="details1">Mot de Passe</span>
							<input type="password" name="mdp" placeholder="Entrez votre Mot de Passe" required="">
						</div>
					</div>
					<div class="button1">
						<input type="submit" name="valider" value="Connexion">
					</div>
					<p>Si vous n'est pas encore pas de compte, &nbsp;<a href="inscrit.jsp">S'Incrire Gratuitement</a></p>
		     	</form>
		     </div>
	    </main>
	   
	</main>
	    
    
</body>
</html>