# Lab 1 - Prosty kalkulator w Javie

## Opis projektu  
Program w Javie, który pyta o dwie liczby, dodaje je i pokazuje wynik.

## Wymagania  
- Java JDK (np. OpenJDK 17 lub nowsze) zainstalowane i dodane do PATH  
- Git (opcjonalnie, jeśli chcesz sklonować repozytorium)

## Jak uruchomić krok po kroku (Windows)

1. **Zainstaluj Java JDK**  
   - Wejdź na https://adoptium.net/  
   - Pobierz najnowszą wersję JDK dla Windows (plik `.msi`)  
   - Zainstaluj program. Jeśli instalator nie dodał JDK do PATH, dodaj to ręcznie (patrz punkt 8).

2. **Sprawdź, czy `javac` działa**  
   - Otwórz Wiersz polecenia (cmd)  
   - Wpisz:  
     
     javac -version
     
   - Jeśli zobaczysz wersję JDK, idź dalej. Jeśli pojawi się błąd, dodaj JDK do PATH lub przeinstaluj JDK.

3. **(Opcjonalnie) Sklonuj projekt z GitHub**  
   - W cmd wpisz:  
     
     git clone https://github.com/twoj-login/my-java-project1zad1.git
     cd my-java-project1zad1
     

4. **Przejdź do folderu projektu**  
   - Jeśli masz projekt lokalnie, wpisz w cmd:  
     
     cd ścieżka\do\folderu
     

5. **Skompiluj program**  
   - Wpisz:  
     
     javac src\Main.java

   - W folderze `src` powinien pojawić się plik `Main.class`.

6. **Uruchom program**  
   - Wpisz:  
     
     java -cp src Main
   

7. **Korzystaj z programu**  
   - Program zapyta o dwie liczby:  
    
     Podaj pierwszą liczbę:
    
     Wpisz liczbę i naciśnij Enter.  
     
     Podaj drugą liczbę:
    
     Wpisz drugą liczbę i naciśnij Enter.  
   - Program pokaże wynik, np.:  
     
     Wynik: 46
     

8. **Jak dodać JDK do PATH ręcznie (jeśli potrzeba)**  
   - Znajdź folder instalacji JDK, np.:  
     
     C:\Program Files\Eclipse Adoptium\jdk-17.0.x\bin
  
   - Otwórz Panel sterowania → System → Zaawansowane ustawienia systemu → Zmienne środowiskowe  
   - W „Zmienne systemowe” znajdź `Path`, kliknij Edytuj → Nowy i wklej ścieżkę do folderu `bin` JDK  
   - Zatwierdź zmiany, zamknij i otwórz nowy cmd  
   - Sprawdź ponownie:  
    
     javac -version
     

9. **Jak zaktualizować README i wysłać zmiany na GitHub**  
   - Otwórz terminal w folderze projektu  
   - Sprawdź status zmian:  
    
     git status
    
   - Dodaj README do commita:  
    
     git add README.md
      
   - Zrób commit:  
     
     git commit -m "Aktualizacja README z instrukcją krok po kroku dla Windows"
    
   - Wypchnij zmiany na GitHub:  
    
     git push origin main
     
     *Uwaga:* jeśli Twoja główna gałąź nazywa się inaczej (np. `master`), wpisz jej nazwę zamiast `main`.

## Licencja  
MIT
