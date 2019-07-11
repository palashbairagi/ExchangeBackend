package com.exchange.assignment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "parent_order")
public class ParentOrder {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "member_id")
    private String memberId;

    @Column(name = "symbol")
    private String symbol;

    @Column(name = "quantity")
    private  BigDecimal quantity;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "executed_qty")
    private BigDecimal executedQty;

    @Column(name = "executed_price")
    private BigDecimal executedPrice;

    @Column(name = "cancelled_qty")
    private BigDecimal cancelledQty;

    @Column(name = "leaves_qty")
    private BigDecimal leavesQty;

    @Column(name = "side")
    private String side;

    @Column(name = "type")
    private String type;

    @Column(name = "venue")
    private String venue;

    @Column(name = "transact_time")
    private Long transactTime;

    @Column(name = "child_order_id")
    private String childOrderId;

    @Column(name = "order_id")
    private String orderId;

    @Column(name = "exchange_order_id")
    private String exchangeOrderId;

    @Column(name = "order_status")
    private String orderStatus;

    @Column(name = "exchange_account_id")
    private String exchangeAccountId;

    @Column(name = "child_order")
    private Integer childOrder;

    @Column(name = "price_precision")
    private Integer pricePrecision;

    @Column(name = "qty_precision")
    private Integer qtyPrecision;

    @Column(name = "report_type")
    private String reportType;

    @Column(name = "reject_reason")
    private String rejectReason;

    @Column(name = "reject_code")
    private String rejectCode;

    @Column(name = "remaining_qty")
    private BigDecimal remainingQty;

    @Column(name = "filled")
    private Integer filled;

    @Column(name = "partition_id")
    private String partitionId;

    @Column(name = "kafka_offset")
    private Long kafkaOffset;

    @Column(name = "timestamp")
    private Timestamp timestamp;

    public ParentOrder() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getExecutedQty() {
        return executedQty;
    }

    public void setExecutedQty(BigDecimal executedQty) {
        this.executedQty = executedQty;
    }

    public BigDecimal getExecutedPrice() {
        return executedPrice;
    }

    public void setExecutedPrice(BigDecimal executedPrice) {
        this.executedPrice = executedPrice;
    }

    public BigDecimal getCancelledQty() {
        return cancelledQty;
    }

    public void setCancelledQty(BigDecimal cancelledQty) {
        this.cancelledQty = cancelledQty;
    }

    public BigDecimal getLeavesQty() {
        return leavesQty;
    }

    public void setLeavesQty(BigDecimal leavesQty) {
        this.leavesQty = leavesQty;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public Long getTransactTime() {
        return transactTime;
    }

    public void setTransactTime(Long transactTime) {
        this.transactTime = transactTime;
    }

    public String getChildOrderId() {
        return childOrderId;
    }

    public void setChildOrderId(String childOrderId) {
        this.childOrderId = childOrderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getExchangeOrderId() {
        return exchangeOrderId;
    }

    public void setExchangeOrderId(String exchangeOrderId) {
        this.exchangeOrderId = exchangeOrderId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getExchangeAccountId() {
        return exchangeAccountId;
    }

    public void setExchangeAccountId(String exchangeAccountId) {
        this.exchangeAccountId = exchangeAccountId;
    }

    public Integer getChildOrder() {
        return childOrder;
    }

    public void setChildOrder(Integer childOrder) {
        this.childOrder = childOrder;
    }

    public Integer getPricePrecision() {
        return pricePrecision;
    }

    public void setPricePrecision(Integer pricePrecision) {
        this.pricePrecision = pricePrecision;
    }

    public Integer getQtyPrecision() {
        return qtyPrecision;
    }

    public void setQtyPrecision(Integer qtyPrecision) {
        this.qtyPrecision = qtyPrecision;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    public String getRejectCode() {
        return rejectCode;
    }

    public void setRejectCode(String rejectCode) {
        this.rejectCode = rejectCode;
    }

    public BigDecimal getRemainingQty() {
        return remainingQty;
    }

    public void setRemainingQty(BigDecimal remainingQty) {
        this.remainingQty = remainingQty;
    }

    public Integer getFilled() {
        return filled;
    }

    public void setFilled(Integer filled) {
        this.filled = filled;
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
