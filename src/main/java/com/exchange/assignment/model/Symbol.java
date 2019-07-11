package com.exchange.assignment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "symbol_config")
public class Symbol {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "venue_name")
    private String venueName;

    @Column(name = "symbol_name")
    private String symbolName;

    @Column(name = "status")
    private String status;

    @Column(name = "timestamp")
    private Timestamp timeStamp;

    public Symbol() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public String getSymbolName() {
        return symbolName;
    }

    public void setSymbolName(String symbolName) {
        this.symbolName = symbolName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Timestamp timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public String toString() {
        return "SymbolConfig{" +
                "id=" + id +
                ", venueName='" + venueName + '\'' +
                ", symbolName='" + symbolName + '\'' +
                ", status='" + status + '\'' +
                ", timeStamp=" + timeStamp +
                '}';
    }
}
