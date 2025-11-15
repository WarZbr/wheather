class PhoneDisplay implements Observer {
    private int temperature;

    @Override
    public void update(int temperature) {
        this.temperature = temperature;
        System.out.println("[PHONE] Temperatura atual: " + temperature + "°C");
    }
}
