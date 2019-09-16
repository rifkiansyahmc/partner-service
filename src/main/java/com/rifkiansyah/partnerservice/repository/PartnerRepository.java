package com.rifkiansyah.partnerservice.repository;

import com.rifkiansyah.partnerservice.model.Partner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartnerRepository extends JpaRepository {
    Partner findOneByPartnerName(String partner_name);
}
