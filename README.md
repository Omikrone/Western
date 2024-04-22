P21 - P22
=========

Enseignants
-----------

- [Cyril Meyer](mailto:cymeyer@unistra.fr) : TD 12 + TP 1
- [Julian Bréant](mailto:jbreant@capcod.eu) : TP 2 
- [Ali Ayadi](mailto:ali.ayadi@unistra.fr) : TD/TP 34
- [Étienne Le Quentrec](mailto:elequentrec@unistra.fr) : Responsable du module + CMx + TD/TP 56
- [Adrien Krähenbühl](mailto:krahenbuhl@unistra.fr) : CMx + TD/TP 7

Mise en place du dépôt Git
--------------------------

1. Installer git sur votre ordinateur personnel (rien à faire sur les postes de l'IUT) :
```sh
$ sudo apt install git
```

2. Configurer vos informations d'utilisateur :
```sh
$ git config --global user.name "[Prenom] [Nom]"
$ git config --global user.email "[login]@unistra.fr"
```

3. Cloner ce dépôt sur votre ordinateur personnel :
```sh
$ git clone https://git.unistra.fr/p21/p21.git
```

Vous avez maintenant un répertoire `p21` sur votre ordinateur, qui est une copie exacte du dépôt présent sur Gitlab.

Mettre à jour votre clône
-------------------------

Pour mettre à jour votre clone local lorsque le prof ajoute des fichiers :
```sh
$ cd p21
$ git pull origin main
```

Jetbrains
---------

Pour utiliser la version IntelliJ Ultimate avec le serveur de licences de l'IUT, suivez les instructions en bas de cette page :

[https://ernest.unistra.fr/jcms/858807624_UDSPages/fr/4-referentiel-informatique-pedagogique](https://ernest.unistra.fr/jcms/858807624_UDSPages/fr/4-referentiel-informatique-pedagogique)
