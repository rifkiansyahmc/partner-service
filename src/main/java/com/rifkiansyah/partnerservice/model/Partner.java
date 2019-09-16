package com.rifkiansyah.partnerservice.model;

import javax.persistence.*;

@Entity
@Table(name = "partner", catalog = "test")
public class Partner {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "partner_name")
    private String partnerName;

    @Column(name = "partner_profit")
    private Long partnerProfit;

    @Column(name = "partner_paid")
    private Long partnerPaid;

    public Partner() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    public Long getPartnerProfit() {
        return partnerProfit;
    }

    public void setPartnerProfit(Long partnerProfit) {
        this.partnerProfit = partnerProfit;
    }

    public Long getPartnerPaid() {
        return partnerPaid;
    }

    public void setPartnerPaid(Long partnerPaid) {
        this.partnerPaid = partnerPaid;
    }

    @Override
    public String toString() {
        return "Partner{" +
                "id=" + id +
                ", partnerName='" + partnerName + '\'' +
                ", partnerProfit=" + partnerProfit +
                ", partnerPaid=" + partnerPaid +
                '}';
    }
}
