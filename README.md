# Kreiranje leksera i parsera za gramatiku miniC# programskog jezika

Da bismo koristili ANTLR alat potrebno je da imamo sledeća 4 fajla:
  - antlr-x.y.z-complete.jar (xyz predstavlja verziju)
  - antlr4.bat
  - grun.bat
  - class.bat

Pored ovih fajlova potrebno je u User variables podesiti %CLASSPATH% varijablu tako da ima putanju do antlr-x.y.z-complete.jar fajla. Detaljno uputstvo u kojem je opisano kako treba da izgledaju .bat fajlovi se može pronaći na sledećim linkovima:
  - https://www.antlr.org/
  - https://www.youtube.com/watch?v=p2gIBPz69DM

#### Svi navedeni fajlovi se već nalaze u projektu, ali predlažem da se isprati tutorijal sa linka!
Projekat se pokreće tako što se u folderu *java* otvori komandna linija i pokrenu redom sledeće komande:
  - antlr4 miniCSharp.g4
  - javac miniCSharp*.java
  - grun miniCSharp program *naziv_testnog_fajla* *-gui* (-gui za prikaz AST-a)

#### Iako je moguće pokrenuti projekat pomoću komandne linije ipak prepourčujem upotrebu InteliJ okruženja koje, takođe, ima i podršku za prikaz AST-a.
