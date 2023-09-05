# AlgoDaten
<h2>Algorithmen und Datenstrukturen:</h2>
Hier werden die wichtigsten Datenstrukturen und Algorithmen in der Programmiersprache Java beschrieben und implementiert.  
 | Algorithmen  | Datenstrukturen |
| ------------- | ------------- |
| Bubble Sort  | Graphenn  |
| Selection Sort  | ArrayList  |
| Quick Sort  | LinkedList  |
| Insertion Sort  | Bäume  |
| Merge Sort  | Hash |


 

# Algorithmen #
## Bubble Sort ##
### Wie funktioniert ###
Bubble Sort ist ein einfacher Sortieralgorithmus, der in der Informatik häufig als Beispiel für Sortieralgorithmen verwendet wird. Der Algorithmus arbeitet, indem er die Liste mehrmals durchgeht, Element für Element vergleicht und benachbarte Elemente vertauscht, wenn sie in der falschen Reihenfolge sind. Dieser Vorgang wird so oft wiederholt, bis die gesamte Liste sortiert ist. Der Algorithmus hat seinen Namen aufgrund der Art und Weise, wie die größten Elemente "nach oben" wie Blasen in einem aufsteigenden Luftstrom steigen. Bubble Sort nicht besonders effizient ist, insbesondere für große Listen.
### Die Zeitkomplkexität ###
Die Zeitkomplexität von Bubble Sort beträgt im schlechtesten Fall O(n^2), wobei "n" die Anzahl der Elemente in der zu sortierenden Liste ist. Das bedeutet, dass die Anzahl der Vergleiche und Vertauschungen im schlimmsten Fall quadratisch zur Anzahl der Elemente in der Liste steigt. Im Durchschnitt und im besten Fall, wenn die Liste bereits fast sortiert ist, kann Bubble Sort effizienter sein, mit einer Zeitkomplexität von O(n) im besten Fall. Dies tritt auf, wenn keine Vertauschungen erforderlich sind, weil die Liste bereits sortiert ist.
## Selection Sort ##
### Wie funktioniert ###
Selection Sort ist ein weiterer einfacher Sortieralgorithmus, der in der Informatik häufig als Beispiel für Sortieralgorithmen verwendet wird. Der Algorithmus funktioniert, indem er das kleinste Element in der Liste findet und es an den Anfang der Liste verschiebt. Dann wird das zweitkleinste Element gefunden und an die zweite Stelle verschoben, und so weiter, bis die gesamte Liste sortiert ist.
### Die Zeitkomplkexität ###
Die Zeitkomplexität von Selection Sort beträgt immer O(n^2) im schlechtesten, besten und durchschnittlichen Fall, da der Algorithmus unabhängig von der Eingabe immer die gleiche Anzahl von Vergleichen und Vertauschungen durchführt. Aus diesem Grund ist Selection Sort nicht effizient für große Listen und wird normalerweise nur für kleine Listen oder aus didaktischen Gründen verwendet.
## Quick Sort ##
### Wie funktioniert ###
Quick Sort ist ein effizienter und weit verbreiteter Sortieralgorithmus, der nach dem Teile-und-Herrsche-Prinzip arbeitet. Der Algorithmus wählt ein Element aus der Liste als "Pivot" aus und teilt die Liste in zwei Teile: einen Teil, der alle Elemente kleiner oder gleich dem Pivot enthält, und einen Teil, der alle Elemente größer als der Pivot enthält. Dann wird der Algorithmus rekursiv auf beide Teillisten angewendet, bis die gesamte Liste sortiert ist.
### Die Zeitkomplkexität ###
Die Zeitkomplexität von Quick Sort beträgt im Durchschnitt O(n * log(n)), was es zu einem sehr effizienten Sortieralgorithmus macht. Im schlimmsten Fall kann die Zeitkomplexität jedoch O(n^2) betragen, wenn das Pivot-Element immer das größte oder kleinste Element ist und die Liste nicht gut aufgeteilt wird. Trotzdem wird Quick Sort aufgrund seiner durchschnittlich guten Leistung oft in der Praxis verwendet.
## Insertion Sort ##
### Wie funktioniert ###
Insertion Sort ist ein einfacher Sortieralgorithmus, der dadurch gekennzeichnet ist, dass er die Liste in zwei Teile unterteilt: einen sortierten und einen unsortierten Teil. Der Algorithmus beginnt mit einem einzelnen Element in der sortierten Liste (normalerweise das erste Element) und fügt dann nacheinander die verbleibenden Elemente aus der unsortierten Liste in die sortierte Liste ein, indem er sie an die richtige Stelle platziert.
### Die Zeitkomplkexität ###
Die Zeitkomplexität von Insertion Sort beträgt im Durchschnitt und im schlechtesten Fall O(n^2), da der Algorithmus in jedem Schritt bis zu n Vergleiche und Verschiebungen durchführt. Die beste Zeitkomplexität beträgt O(n), wenn die Liste bereits fast sortiert ist. Trotzdem hat Insertion Sort den Vorteil, dass er stabil ist (die relative Reihenfolge der gleichen Elemente bleibt erhalten) und in situ (er benötigt keinen zusätzlichen Speicherplatz). Es kann daher nützlich sein, wenn die Liste bereits teilweise sortiert ist oder für kleine Listen. Für große Listen sind jedoch effizientere Sortieralgorithmen wie Quick Sort oder Merge Sort vorzuziehen.
## Merge Sort ##
### Wie funktioniert ###
Merge Sort ist ein effizienter und stabiler Sortieralgorithmus, der nach dem Teile-und-Herrsche-Prinzip arbeitet. Der Algorithmus teilt die zu sortierende Liste in zwei Hälften, sortiert jede Hälfte separat und fügt dann die beiden sortierten Hälften zusammen (merge). Dieser Vorgang wird rekursiv durchgeführt, bis die gesamte Liste sortiert ist.
### Die Zeitkomplkexität ###
Die Zeitkomplexität von Merge Sort beträgt immer O(n * log(n)), unabhängig von der Eingabe. Dies macht Merge Sort zu einem effizienten Sortieralgorithmus, der auch für große Listen gut geeignet ist. Allerdings benötigt Merge Sort zusätzlichen Speicherplatz für die temporären Arrays, was bei sehr großen Listen berücksichtigt werden sollte.
