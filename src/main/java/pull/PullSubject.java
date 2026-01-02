package pull;

// Também pode ser chamado de: Publisher, Observable entre outros...
interface PullSubject {
    void registerObserver(PullObserver observer);
    void removeObserver(PullObserver observer);
    void notifyObservers();
}