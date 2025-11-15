class TVDisplay implements Observer {
    private int temperature;

    @Override
    public void update(int temperature) {
        this.temperature = temperature;
        int fahrenheit = temperature * 9 / 5 + 32;
        System.out.println("[TV] Temperatura atual: " + fahrenheit + "°F");
    }
}
