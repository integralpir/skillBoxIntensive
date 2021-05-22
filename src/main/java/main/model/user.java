package main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Date regTime;
    private String sessionId;
    private String name;

    public int getId() {
        return id;
    }

    public Date getRegTime() {
        return regTime;
    }

    public String getSessionId() {
        return sessionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public void setId(int id) {
        this.id = id;
    }
}
