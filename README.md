Zadanie “Playlisty”
Zadanie
Istotną częścią każdego komputerowego odtwarzacza medialnego jest tzw. lista odtwarzania (ang. playlist). Zaimplementuj w języku Java zestaw klas reprezentujących listę odtwarzania, która posiada funkcjonalność:
• dodawania utworów do playlisty, mogą to być zarówno utwory muzyczne jak i filmy,
• dodawania innych playlist jako podrzędne do playlisty,
• ustawienia sposobu odtwarzania playlisty: losowo, sekwencyjnie albo zapętlenie,
• odtwarzania utworów z playlisty zgodnie z ustalonym sposobem odtwarzania czyli:
o losowo: odtwarza wszystkie elementy playlisty w losowej kolejności,
o sekwencyjnie: odtwarza wszystkie elementy playlisty w kolejności dodania,
o zapętlenie: odtwarza wszystkie elementy w kółko w kolejności dodania.
Przykład użycia
Do playlisty dodano 3 utwory w następującej kolejności:
a) Utwór muzyczny Rolling Stones, Brown Sugar,
b) Inną playlistę z ustawionym sposobem odtwarzania losowym,
c) Film Casablanca. Dla tej playlisty ustawiono sposób odtwarzania sekwencyjnego, a następnie wywołano odtwarzanie.
Odtworzenie tej playlisty spowoduje odtworzenie zawartości tej playlisty w kolejności (a), (b), (c). Przy czym elementem (b) jest playlistą podrzędną i zostanie odtworzony zgodnie ze swoim sposobem odtwarzania, w tym przykładzie losowym.
Uwagi
Zestaw klas NIE powinien mieć żadnego styku z interfejsem użytkownika.
Zestaw klas NIE powinien mieć żadnego rzeczywistego odtwarzania muzyki czy filmów, a jedynie powinno to być symulowane przez wypisanie na System.out informacji np. „Muzyka: Rolling Stones, Brown Sugar” albo „Film: Casablanca”.
