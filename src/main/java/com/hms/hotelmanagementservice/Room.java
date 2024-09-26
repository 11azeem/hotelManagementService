package com.hms.hotelmanagementservice;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "rooms", schema = "hms")
public class Room {
    @Id
    @Column(name = "roomnumber", nullable = false)
    private Integer id;

    @Column(name = "roomtype", length = Integer.MAX_VALUE)
    private String roomtype;

    @Column(name = "price")
    private Double price;

    @Column(name = "available")
    private Boolean available;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

}