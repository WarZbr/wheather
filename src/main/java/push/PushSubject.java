package push;

// Também pode ser chamado de: Publisher, Observable entre outros...
interface PushSubject {
    void registerObserver(PushObserver observer);
    void removeObserver(PushObserver observer);
    void notifyObservers();
}