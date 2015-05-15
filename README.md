JVM Internals
=============
Zadanie ma na celu stworzenie pliku .ear oraz osadzenie go na serwerze ~~WildFly~~ lub WebLogic.
----
Projekt zawiera implementację prostego kalkulatora w dwóch wersjach : 
* zwykłej
* bankierskiej

Działanie kalkulatora następnie zostało zaprezentowane poprzez restowy serwis stworzony w Springu.

## Konfiguracja

Wybieramy sobie miejsce na repozytorium, następnie poleceniem `git clone https://github.com/MacMisDev/earExample` ściągamy je do siebie. 
Budujemy projekt poleceniem `mvn package`. Powinniśmy otrzymać komunikat:
```bash
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary:
[INFO]
[INFO] bankerCalc ........................................ SUCCESS [1.729s]
[INFO] arithmeticCalc .................................... SUCCESS [0.506s]
[INFO] jvmProject ........................................ SUCCESS [0.001s]
[INFO] restDemo Maven Webapp ............................. SUCCESS [1.196s]
[INFO] ear_project ....................................... SUCCESS [0.465s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 4.067s
[INFO] Finished at: Fri May 15 19:00:40 CEST 2015
[INFO] Final Memory: 11M/159M
[INFO] ------------------------------------------------------------------------
```
Oznacza to, iż projekt został zbudowany bez problemów.
W folderze `ear\target\` będzie znajdował się plik `ear_project-1.0.ear`, który należy umieścić na serwerze. Ja do tego zadania wybrałem `WebLogic Server 12.1.3.0`. Po przebrnięciu przez instalację, należy uruchomić domenę oraz przejść do konsoli admina (domyślnie `http://localhost:7001/console/`). Tam instalujemy naszego .ear'a zgodnie z instrukcją. Po zakończeniu pod adresem `http://localhost:7001/restDemo/` powinna znajdować się aplikacja.
