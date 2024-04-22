
# <span style="color: blue;"> Western </span>


_<span style="font-size: smaller">
Inspiré de « A l’ouest de Java Town » de A. Lemay et des adaptations de Pascal Divoux et Loïc Mazo.
</span>_

On désire réaliser un modèle UML, puis des classes Java, qui permettront d'écrire facilement des histoires de Western.
Dans nos histoires, nous croiserons des _brigands_, des _cowboys_ et des _dames_ en détresses.

### Scénario 1 : Les personnages ...

Les intervenants de nos histoires sont tous des _personnages_.

Un personnage porte un nom et possède une boisson favorite. Par défaut, la boisson favorite d'un personnage est l'eau.
Un personnage pourra dire un texte. Son discours sera traduit par un affichage sur la sortie standard de la forme :
`« <nom du personnage > - <texte> »`.  
> _Exemple_ :   
> Quand le personnage nommé Luke dit « I'm a poor lonesome cowboy ! », on affichera :   
>    `Luke – I’m a poor lonesome cowboy ! `  

Un personnage pourra également se présenter (il dit `« Bonjour »`, son nom, et indique sa boisson favorite).
> Lorsque Luke se présente, on affichera  
>    `Luke - Bonjour, je suis Luke et j'aime la bière.`

Il pourra aussi boire une boisson, par défaut sa boisson favorite, ou éventuellement une autre boisson.  
Il dira alors :   
`« Ah ! boire <nom de sa boisson favorite> ! GLOUPS ! »`  
ou   
`« GLOUPS ! Faut vraiment avoir soif pour boire <nom de l’autre boisson> !
J’aurais préféré boire <nom de sa boisson favorite> ! »`.   

Afin de gérer correctement les dialogues, il convient de faire un peu de grammaire.  
Dans les phrases, les _noms_ (et en particulier ceux des boissons) peuvent s’accompagner :
-	soit d’un article _défini_ (**le** thé, **la** bière, ou **l**'eau)
-	soit d’un article _indéfini_ (**un** thé, **une** bière, **une** eau)
-	soit d’un article _partitif_ (**du** thé, **de la** bière, **de l**’eau)
-	soit de la préposition « **de** » (un verre **de** thé, **de** bière ou **d**’eau)

Les noms en général, et ceux des boissons en particulier, ne sont donc pas de simples chaînes de caractères,
mais des objets plus complexes qui ont un genre (masculin, féminin)
et peuvent fournir les opérations qui renvoient le nom avec les articles ou la préposition appropriée.

#### Questions:  
- Proposer un diagramme de classes, puis écrire le code Java des classes et énumérations.
- Tester ce code avec `Histoire1.java`.
- Faire un diagramme d’objets représentant les objets créés dans `Histoire1`.
- Faire le diagramme de séquence du début de l’exécution de `Histoire1` (création des personnages et intervention de max).
  On introduira l’objet `System.out` pour visualiser l’affichage des messages sur la sortie standard.

### Scénario 2 : Des brigands, des cowboys et des dames en détresse

Les dames, les brigands, et les cowboys, sont des personnages qui ont un nom et peuvent se présenter, parler et boire.   
Il y a toutefois certaines différences entre ces trois types de personnages.
Les brigands peuvent kidnapper des dames.
Les cowboys peuvent tirer sur les brigands et même les capturer et de cette manière libérer les dames captives.

A ce stade, nous ne voulons plus laisser la possibilité de créer un personnage
qui ne serait pas de l'un de ces types  : dame, cowboy, brigand ou narrateur.

En plus de leur nom, ces personnages possèdent aussi un pseudonyme par lequel ils se font appeler.
Le pseudonyme d'une dame sera `« Miss »` suivi de son nom.
Celui d'un brigand sera son nom suivi de son look ("le méchant" par défaut): `« Bob le méchant »`.
Un cowboy conservera simplement son nom (ce sont des gens simples).
Lorsqu'ils se présentent, les personnages donnent leur pseudonyme plutôt que leur nom.

Une **dame** peut être libre ou captive ; initialement, elle est toujours libre.
Quand une dame se fait enlever (par un brigand) elle crie : `« Hiiii ! Au secours ! <pseudo du brigand> m’enlève !»`.
Elle peut se faire libérer (par un cowboy, bien sûr) ; elle remercie alors le héros qui l'a libérée :
`« Merci <pseudo du cowboy>, tu es mon sauveur ! »`.

Un **brigand** est caractérisé par la récompense qui est offerte pour sa capture ;
elle est de 100 $ par défaut et augmente de 50$ à chaque enlèvement.
Il peut kidnapper une dame ; auquel cas, il s'exclame `« Ah, ah ! <pseudo de la dame>, tu es mienne désormais ! »`.
Quand il se fait capturer par un cowboy, il hurle `« Damned, je suis fait ! Tu m'as eu, <pseudo du cowboy> !
Mais tu n'emporteras pas les <montant de la récompense> $ au paradis. »`.

Un **cowboy** peut tirer sur un brigand ; le cowboy s'exclame alors `« PAN ! PAN ! Prends ça, chacal  de <pseudo du brigand>! »`.
Dans la foulée, le brigand répond `« Tu n’es qu’un coyote, <pseudo du cowboy> ! »`.
Le cowboy peut également capturer un brigand. Il touche alors la récompense offerte et libère immédiatement les dames captives.
Lorsqu’il délivre une dame captive, il dit `« Voilà <pseudo de la dame>, tu es libre maintenant ! »`.
Le cowboy est caractérisé par le montant total des récompenses qu’il a touchées pour ses captures.



#### Questions:

- Proposer un diagramme de classe.
- Modifier la classe `Personnage` et écrire le code Java des nouvelles classes.
- Tester avec `Histoire2.java`.
- Pourquoi votre `Histoire1` ne fonctionne-t-elle plus ?
  Comment peut-on la modifier pour la refaire fonctionner ?
- On s’intéresse au déroulement du scénario à partir de l’enlèvement de Scarlett dans `Histoire2`.
  Faire un diagramme de séquence qui illustre les échanges de messages qui ont lieu dans cette partie de l’histoire.

### Scénario 3 : Les présentations s’améliorent

  On désire personnaliser le mode de présentation des brigands, des dames et des cowboys.
  En plus de la présentation traditionnelle, les personnages rajoutent des détails supplémentaires à leur présentation.
  - Un brigand annonce le montant de la récompense offerte pour sa capture.
    De plus, s’il est libre, il ajoute : `« Je suis libre »` et, le cas échéant,
    `« et en bonne compagnie avec < liste des pseudos de ses captives >.»`.
    S’il a été capturé, il ajoute : `« Je suis le prisonnier de <pseudo du cow-boy qui l’a capturé>.»`.
    > _Exemple_ :  
    > Bob - Bonjour, je suis Bob le méchant et j'aime le tord-boyaux. Ma tête est mise à prix 300 $ ! Je suis le prisonnier de James Gosling.  

  - Un cowboy annonce le montant de ses primes puis précise la liste des noms des hors-la-loi qu’il a déjà capturés.
    > _Exemple_ :  
    > James Gosling – Bonjour, je suis James Gosling et j’aime boire du café. J’ai déjà empoché 2000$ en capturant Bob le méchant, Jessy Malocker et Joe Vial.  

  - Une dame, si elle est libre, ajoute : `« Je suis libre »` et le cas échéant, `« grâce à mon sauveur <pseudo du cowboy>.». `
    Si elle est captive, elle ajoute : `« Je suis captive de cet escroc de <pseudo du hors-la-loi>. »`.

    >  _Exemple_ :  
    > Daisy Derata – Bonjour, je suis Miss Daisy Derata et j’aime boire du thé. Je suis captive de cet escroc de Bob le méchant.

  De plus, on veut pouvoir fixer dynamiquement une boisson par défaut à chaque type de personnage
  (par exemple thé pour les dames, tord-boyaux pour les brigands et bière pour les cowboys).

  #### Questions:

  - Faire évoluer le diagramme de classes, ainsi que le code Java.
  - Testez vos classes avec `Histoire3.java` et les tests à dispositions.
