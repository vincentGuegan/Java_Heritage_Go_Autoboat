# Java_Heritage_Go_Autoboat


# Challenge

#### Go Autoboat !

Afin de t'exercer à l'héritage, tu vas créer les classes suivantes :

1.  Crée une classe abstraite  `Vehicle`
2.  Ajoute les attributs  `String  brand`  et  `int  kilometers`
3.  Crée un constructeur permettant d'initialiser  `brand`  et  `kilometers`
4.  Ajoute des  _getters_  et  _setters_  pour tous les attributs, en respectant les conventions
5.  Crée une classe  `Car`  qui étend la classe  `Vehicle`
6.  Crée une classe  `Boat`  qui étend la classe  `Vehicle`
7.  Ajoute dans  `Vehicle`  la méthode abstraite  `public  String  doStuff()`
8.  Ajoute dans  `Car`  et  `Boat`  une implémentation du corps de la méthode  `doStuff()`. Pour  `Car`, tu devras retourner "Je suis {brand} et je fais vroum vroum !" et pour  `Boat`  : "Je suis {brand} et je fais glou glou !"
9.  Crée une classe  `Hangar`  qui possédera une méthode  _main()_
10.  Ajoute des références vers des instances des classes  `Car`  et  `Boat`  dans la méthode  _main()_  de  `Hangar`
11.  Pour chacune des références, affiche dans le terminal le résultat de l'appel de la méthode  `doStuff()`
12.  Compile et teste  `Hangar`  : quand tout fonctionne, crée un dépôt  _git_  et envoie le tout sur  _GitHub_
13.  Partage le lien du dépôt  _GitHub_  en solution

Exemple de résultat attendu lors de l'exécution de  `Hangar`  :

```java
$ Je suis Clio et je fais vroum vroum !
$ Je suis Titanic et je fais glou glou !

```

#### Critères de validation

-   Le dépôt  _GitHub_  contient bien les fichiers  `Vehicle.java`,  `Car.java`,  `Boat.java`  et  `Hangar.java`
-   Les classes respectent les conventions de la POO : attributs privés, utilisation du mot-clef  _this_,  _getters_  et  _setters_  nommés correctement.
-   Des références à des instances de la classe  `Car`  et  `Boat`  sont présentes dans la classe  `Hangar`
-   La classe  `Hangar`  se compile sans erreur et affiche le résultat attendu dans le terminal
