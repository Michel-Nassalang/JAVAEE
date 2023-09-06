<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Incrivez-Vous | sur votre Site de Réservation de Billet Airline Diandji</title>
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
			<div class="register">
			<h1 class="dash-title">Incrivez-Vous</h1>
				<form method="POST" action="">
					<div class="user-details">
						<div class="input-box">
							<span class="details">Prénom</span>
							<input type="text" name="prenom" placeholder="Entrez votre Prénom" required="">
						</div>
						<div class="input-box">
							<span class="details">Nom</span>
							<input type="text" name="nom" placeholder="Entrez votre Nom" required="">
						</div>
						<div class="input-box">
							<span class="details">Mail</span>
							<input type="email" name="mail" placeholder="Entrez votre Mail" required="">
						</div>
						<div class="input-box">
							<span class="details">Téléphone</span>
							<input type="tel" name="tel" placeholder="Entrez votre Numéro" required="">
						</div>
						<div class="input-box">
							<span class="details">Mot de passe</span>
							<input type="passwors" name="mdp" placeholder="Entrez votre Mot de passe" required="">
						</div>
						<div class="input-box">
							<span class="details">Confirmation du mot de passe</span>
							<input type="password" name="cmdp" placeholder="Entrez votre Confirmation" required="">
						</div>
					</div>
					<div class="button">
						<input type="submit" name="valider" value="S'incrire">
					</div>
				</form>
			</div>
		</main>
		
		<div class="">
		</div>
	
	</main>
    
    
    
</body>
</html>