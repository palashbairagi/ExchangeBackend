package com.exchange.assignment.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "account_info")
@IdClass(Account.class)
public class Account implements Serializable {
/*
    @Id
    @Column(name = "id")
    private Long id;
*/

    @Id
    @Column(name = "account_id")
    private String accountId;

    @Id
    @Column(name = "market")
    private String market;

    @Id
    @Column(name = "currency")
    private String currency;

    @Column(name = "total")
    private BigDecimal total;

    @Column(name = "available")
    private BigDecimal available;

    @Column(name = "frozen")
    private BigDecimal frozen;

    @Column(name = "borrowed")
    private BigDecimal borrowed;

    @Column(name = "loaned")
    private BigDecimal loaned;

    @Column(name = "withdrawing")
    private BigDecimal withdrawing;

    @Column(name = "depositing")
    private BigDecimal depositing;

    @Column(name = "partition_id")
    private String partitionId;

    @Column(name = "kafka_offset")
    private Long kafkaOffset;

    @Column(name = "timestamp")
    private Timestamp timestamp;

    public Account() {
    }

    /*
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    */

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getAvailable() {
        return available;
    }

    public void setAvailable(BigDecimal available) {
        this.available = available;
    }

    public BigDecimal getFrozen() {
        return frozen;
    }

    public void setFrozen(BigDecimal frozen) {
        this.frozen = frozen;
    }

    public BigDecimal getBorrowed() {
        return borrowed;
    }

    public void setBorrowed(BigDecimal borrowed) {
        this.borrowed = borrowed;
    }

    public BigDecimal getLoaned() {
        return loaned;
    }

    public void setLoaned(BigDecimal loaned) {
        this.loaned = loaned;
    }

    public BigDecimal getWithdrawing() {
        return withdrawing;
    }

    public void setWithdrawing(BigDecimal withdrawing) {
        this.withdrawing = withdrawing;
    }

    public BigDecimal getDepositing() {
        return depositing;
    }

    public void setDepositing(BigDecimal depositing) {
        this.depositing = depositing;
    }

    public String getPartitionId() {
        return partitionId;
    }

    public void setPartitionId(String partitionId) {
        this.partitionId = partitionId;
    }

    public Long getKafkaOffset() {
        return kafkaOffset;
    }

    public void setKafkaOffset(Long kafkaOffset) {
        this.kafkaOffset = kafkaOffset;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
