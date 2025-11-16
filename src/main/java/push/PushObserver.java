package push;

// Também pode ser chamado de: Subscriber, Listener entre outros...
interface PushObserver {
    void update(int temperature, int humidity);
}
