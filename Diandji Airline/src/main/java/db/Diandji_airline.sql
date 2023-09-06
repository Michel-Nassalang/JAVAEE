-- --------------------------------------------------- --
--      Reconstruction de la bes de données   	       --
-- --------------------------------------------------- --
DROP DATABASE IF EXISTS Diandji_airline;
CREATE DATABASE Diandji_airline;
USE Diandji_airline;

-- --------------------------------------------------- --
--       Contruction de la table des utilisateurs      --
-- --------------------------------------------------- --
CREATE TABLE Users {
	idUser				int(4)		PRIMARY KEY AUTO_INCREMENT,
	pseudo				varchar(20)	NOT NULL,
	password			varchar(20)	NOT NULL,
	connectionNumber	int(4)		NOT NULL DEFAULT 0
} ENGINE = InnoDB;

INSERT INTO Users(idUser, Pseudo, Password) VALUES (1, 'Stan', 'Pika');
INSERT INTO Users(idUser, Pseudo, Password) VALUES (2, 'Lucas', 'Luk');
INSERT INTO Users(idUser, Pseudo, Password) VALUES (3, 'Friskette', 'Eva');
INSERT INTO Users(idUser, Pseudo, Password) VALUES (4, 'Jenny', 'Adj');
INSERT INTO Users(idUser, Pseudo, Password) VALUES (5, 'Steph', 'Antho');


SELECT * FROM Users;


-- --------------------------------------------------- --
--       Contruction de la table des administrateurs   --
-- --------------------------------------------------- --
CREATE TABLE Admin {
	idUser				int(4)		NOT NULL REFERENCES Users(idUser),
	rights				varchar(10)	NOT NULL 
} ENGINE = InnoDB;

INSERT INTO Admin VALUES (1, "-RWX------");
INSERT INTO Admin VALUES (1, "-RWX------");


-- --------------------------------------------------- --
--       Contruction de la table des vols			   --
-- --------------------------------------------------- --



