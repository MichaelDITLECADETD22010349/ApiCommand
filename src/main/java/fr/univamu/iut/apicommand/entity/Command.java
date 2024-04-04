package fr.univamu.iut.apicommand.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Command")
public class Command {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "delivery_date")
    private Date deliveryDate;
    @Column(name = "delivery_address")
    private String deliveryAddress;
    @Column(name = "price")
    private Double price;
    public Command() {}

    public Command(Long id, Date deliveryDate, String deliveryAddress, Double price) {
        this.id = id;
        this.deliveryDate = deliveryDate;
        this.deliveryAddress = deliveryAddress;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Command{" +
                "id=" + id +
                ", deliveryDate=" + deliveryDate +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", price=" + price +
                '}';
    }
    @ElementCollection
    @CollectionTable(name = "menus_in_command", joinColumns = @JoinColumn(name = "id_command"))
    @Column(name = "id_menu")
    private List<Long> menuIds = new ArrayList<>();
}
