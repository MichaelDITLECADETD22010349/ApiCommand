package fr.univamu.iut.apicommand.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "menus_in_command")
public class MenuInCommand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "id_command")
    private String idCommand;

    @Column(name = "id_menu")
    private String idMenu;

    public MenuInCommand() {}
    public MenuInCommand(Long id, String idCommand, String idMenu) {
        this.id = id;
        this.idCommand = idCommand;
        this.idMenu = idMenu;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdCommand() {
        return idCommand;
    }

    public void setIdCommand(String idCommand) {
        this.idCommand = idCommand;
    }

    public String getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(String idMenu) {
        this.idMenu = idMenu;
    }

    @Override
    public String toString() {
        return "MenuInCommand{" +
                "id=" + id +
                ", idCommand='" + idCommand + '\'' +
                ", idMenu='" + idMenu + '\'' +
                '}';
    }
}
