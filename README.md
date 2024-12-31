# Kata de comptage du score d'un jeu de bowling

Ce Kata a pour objectif de développer une application de comptage du score d'une partie de bowling.

Il fonctionne en Java, avec une partie Test.

Le but est d'ajouter les fonctionnalités en utilisant le TDD.
 
## Installation du projet

Se placer sur sa propre branche de développement, puis installer le projet avec maven sur intelliJ, Eclipse ou autre


## Stack technique
 * Langage : Java 21
 * Framework de test : JUnit + Mockito




# US

## Je veux pouvoir démarrer une partie

**Test d'acceptance** :
- à chaque nouvelle partie, le score total est à 0

## Je veux pouvoir lancer une boule

En tant qu'utilisateur, je veux pouvoir indiquer à l'application le nombre de quilles tombées lors de mon lancer

**Test d'acceptance** :
- mon score total évolue du nombre de quilles que je fais tomber"

## Je veux avoir l'information, par tour, du lancer auquel j'en suis (1/2 ou 2/2)

En tant qu'utilisateur, je veux savoir à quel lancer j'en suis.

**Test d'acceptance** :
- Au début de la partie, j'en suis à mon premier lancer
- Quand je lance ma première boule, je passe à mon second lancer
- Une fois que j'ai lancé ma seconde boule, je repasse au lancer 1

## Je veux savoir à quel tour j'en suis

En tant qu'utilisateur, je veux savoir à quel tour j'en suis pour pouvoir suivre ma partie.

**Test d'acceptance** :
- Au début de la partie, j'en suis au tour 1
- Une fois que j'ai réalisé mes deux lancers, j'en suis au tour 2

## Je veux limiter le nombre possible de quilles à terre à 10 par tour

En tant qu'utilisateur, je ne dois pas pouvoir indiquer un nombre de quille tombée supérieur à 10 au sein d'un même tour

**Tests d'acceptation** :
- une erreur est renvoyée si le nombre de quilles tombées du lancer est > 10
- le score reste inchangé si le nombre de quilles tombées est > 10
- une erreur est renvoyée si le nombre de quille tombé du tour est > 10

## Je souhaite être informé si je réussis un spare

Un spare correspond à la chute des 10 quilles en deux lancers du même tour.

**Test d'acceptance** :
- si un spare est détecté, un message de félicitation rappelant la règle du spare s'affiche (est renvoyé)

## Je souhaite être informé si je réussi un strike

Un strike correspond à la chute des 10 quilles en un seul lancé

**Test d'acceptance** :
- si un strike est détecté, un message de félicitation rappelant la règle du strike s'affiche (est renvoyé)
- on passe directement au tour suivant

## Je veux que la règle du spare s'applique au lancé suivant

**Test d'acceptance** :
- si un spare est détecté, alors le score du prochain lancé est doublé

## Je veux que la règle du strike s'applique au deux lancés suivants

**Test d'acceptance** :
- si un strike est détecté, alors le score des deux prochains lancés est doublé

### Pour aller plus loin
- je veux pouvoir enchainer spare/strike en appliquant les règles
- je veux pouvoir gérer les scores de plusieurs joueurs
- je veux mettre en réseau l'application, comment dois-je m'y prendre

