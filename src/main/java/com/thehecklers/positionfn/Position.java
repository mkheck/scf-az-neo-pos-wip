package com.thehecklers.positionfn;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

import java.util.Objects;

@Node
public class Position {
    @Id
    @GeneratedValue
    private Long id;
    private String adshex, squawk, flightno, route;
    private int altitude, heading, speed, vertRate, selectedAltitude;
    private double lat, lon, barometer;

    public Position(String adshex, String squawk, String flightno,
                    int altitude, int heading, int speed) {
        this(adshex, squawk, flightno, "LAX->LGA",
        altitude, heading, speed, 0, altitude,
                0d, 0d, 29.92);
    }

    public Position(String adshex, String squawk, String flightno, String route,
                    int altitude, int heading, int speed, int vertRate, int selectedAltitude,
                    double lat, double lon, double barometer) {
        this.adshex = adshex;
        this.squawk = squawk;
        this.flightno = flightno;
        this.route = route;
        this.altitude = altitude;
        this.heading = heading;
        this.speed = speed;
        this.vertRate = vertRate;
        this.selectedAltitude = selectedAltitude;
        this.lat = lat;
        this.lon = lon;
        this.barometer = barometer;
    }

    public String getAdshex() {
        return adshex;
    }

    public void setAdshex(String adshex) {
        this.adshex = adshex;
    }

    public String getSquawk() {
        return squawk;
    }

    public void setSquawk(String squawk) {
        this.squawk = squawk;
    }

    public String getFlightno() {
        return flightno;
    }

    public void setFlightno(String flightno) {
        this.flightno = flightno;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public int getHeading() {
        return heading;
    }

    public void setHeading(int heading) {
        this.heading = heading;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getVertRate() {
        return vertRate;
    }

    public void setVertRate(int vertRate) {
        this.vertRate = vertRate;
    }

    public int getSelectedAltitude() {
        return selectedAltitude;
    }

    public void setSelectedAltitude(int selectedAltitude) {
        this.selectedAltitude = selectedAltitude;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getBarometer() {
        return barometer;
    }

    public void setBarometer(double barometer) {
        this.barometer = barometer;
    }

    @Override
    public String toString() {
        return "Position{" +
                "adshex='" + adshex + '\'' +
                ", squawk='" + squawk + '\'' +
                ", flightno='" + flightno + '\'' +
                ", route='" + route + '\'' +
                ", altitude=" + altitude +
                ", heading=" + heading +
                ", speed=" + speed +
                ", vertRate=" + vertRate +
                ", selectedAltitude=" + selectedAltitude +
                ", lat=" + lat +
                ", lon=" + lon +
                ", barometer=" + barometer +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return altitude == position.altitude && heading == position.heading && speed == position.speed && vertRate == position.vertRate && selectedAltitude == position.selectedAltitude && Double.compare(position.lat, lat) == 0 && Double.compare(position.lon, lon) == 0 && Double.compare(position.barometer, barometer) == 0 && Objects.equals(adshex, position.adshex) && Objects.equals(squawk, position.squawk) && Objects.equals(flightno, position.flightno) && Objects.equals(route, position.route);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adshex, squawk, flightno, route, altitude, heading, speed, vertRate, selectedAltitude, lat, lon, barometer);
    }
}

//public record Position(String adshex,
//                       String squawk,
//                       String flightno,
//                       String route,
//                       int altitude,
//                       int heading,
//                       int speed,
//                       int vertRate,
//                       int selectedAltitude,
//                       double lat,
//                       double lon,
//                       double barometer,
//                       Instant lastSeenTime,
//                       Instant posUpdateTime,
//                       Instant bds40SeenTime) {
//}
