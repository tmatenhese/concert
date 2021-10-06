package com.dev.concert.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Concert {

    private Integer id;
    private String artist;
    private String venue;
    private LocalDateTime timestamp;

    public Concert(Integer id, String artist, String venue) {
        this.id = id;
        this.artist = artist;
        this.venue = venue;
        this.timestamp = LocalDateTime.now();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Concert concert = (Concert) o;
        return id.equals(concert.id);
    }

    @Override
    public String toString() {
        return "Concert{" +
                "id=" + id +
                ", artist='" + artist + '\'' +
                ", venue='" + venue + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
