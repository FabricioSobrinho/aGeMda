package com.fabriciosobrinho.aGeMda.models;

import jakarta.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "player")
public class PlayerModel implements Serializable {
    private static final long serialVersion = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    String name;
    boolean hasWork;
    boolean hasGirlfriend;
    int age;
    String friendGroup;

    public String getFriendGroup() {
        return friendGroup;
    }

    public void setFriendGroup(String friendGroup) {
        this.friendGroup = friendGroup;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasWork() {
        return hasWork;
    }

    public void setHasWork(boolean hasWork) {
        this.hasWork = hasWork;
    }

    public boolean isHasGirlfriend() {
        return hasGirlfriend;
    }

    public void setHasGirlfriend(boolean hasGirlfriend) {
        this.hasGirlfriend = hasGirlfriend;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
