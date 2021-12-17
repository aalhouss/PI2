package praktikum;

public interface GList<T> {
	int  getLength() ;      // liefert die Länge der Liste.
	 int insertLast(T value);      // fügt value am Ende der List ein.
	 T getFirst();    // liefert das erste Element der Liste.
	 int deleteFirst();     // entfernt das erste Element von der Liste.
	boolean search(T value);       // prüft, ob der Wert in der Liste vorhanden ist.
	void print();       // zeigt den Inhalt der Liste an.
}


