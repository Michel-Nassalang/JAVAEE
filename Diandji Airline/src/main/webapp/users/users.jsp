<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bienvenue ${pseudo}</title>
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
	       	<li class="nav-item"><a href="#"><i class="fa-solid fa-user"></i> &nbsp; ${pseudo}</a>
	       	
	       	</li>
	      </ul>
	    </div>
	    
	    <!-- Section 1 -->	    
	    <section>
	    	<h1 class="descipt">Réservation de Billet d'Avion Diandji Airline</h1>
	    	<div class="desti">
	    		<h4 class="sub-title"><i class="fa-solid fa-plane"></i> &nbsp; Vols</h4>
	    		<div class="checkbox">
	    			<input type="checkbox" name="Aller - Retour" id="alrt"> &nbsp; Aller-Retour  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
	    			<input type="checkbox" name="Aller Simple" id="as">  &nbsp; Aller Simple  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
	    			<input type="checkbox" name="Vol Direct" id="vd">  &nbsp; Vol Direct
	    			<select name="classe" id="classe">
				        <option value="" id="eco">Economique</option>
				        <option value="">Eco Pro</option>
				        <option value="">Affaires</option>
				        <option value="">Première</option>
				    </select>	
	    		</div>
		        <form method="POST" action="login">
		            <div class="user-det">
						<div class="input1">
							<input type="text" name="pseudo" placeholder="D'où patez-vous" required="">
						</div>
						<div class="input2">
							<input type="password" name="mdp" placeholder="Où allez-vous" required="">
						</div>
						<div class="input3">
							<input type="date" name="dateDep" placeholder="Départ le" required="">
						</div>
						<div class="input4">
							<input type="date" name="dateArr" placeholder="Arriver le" required="">
						</div>
						<div class="input5">
							<input type="number" name="passager" placeholder="Passager" required="">
						</div>
					</div>
		        </form>
		        <div class="btn">
			        <div class="btn1">
						<input type="submit" name="valider" value="Rechercher Vol + Hôtel">
					</div>
					<div class="btn2">
						<input type="submit" name="valider1" value="Rechercher Vol">
					</div>
				</div>
	    	</div>
	    </section>
	    
	    <div>
	    	<div class="pk-ns">
	    		<h4 class="pk-title">Pourquoi réserver chez nous?</h4>
	    		<div class="succes">
	    			<ul>
	    				<i class="fa-solid fa-circle-check"></i></i><li>Meilleures combinaisons de vols</li>
						<i class="fa-solid fa-circle-check"></i><li>Réservation en toute sécurité</li>
						<i class="fa-solid fa-circle-check"></i><li>Guichet unique pour votre voyage</li>
	    			</ul>
	    		</div>
	    	</div>
	    </div>
	    
	    <div class="vide"></div>
	    
    </main>
    
    <!-- Section 2 -->
    <section>
    	
    </section>
    
    
    
</body>
</html>