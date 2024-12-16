public class Zbor {
    Airport departureAirport;
    Airport arrivalAirport;

    public Zbor(Airport departureAirport, Airport arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    @Override
    public String toString() {
        return "Zbor{" +
                "departureAirport=" + departureAirport +
                ", arrivalAirport=" + arrivalAirport +
                '}';
    }
}
