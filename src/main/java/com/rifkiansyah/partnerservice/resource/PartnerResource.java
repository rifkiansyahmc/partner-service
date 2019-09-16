package com.rifkiansyah.partnerservice.resource;

import com.netflix.discovery.converters.Auto;
import com.rifkiansyah.partnerservice.model.Partner;
import com.rifkiansyah.partnerservice.repository.PartnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/rest/partner")
public class PartnerResource {

    PartnerRepository partnerRepository;

    @Autowired
    RestTemplate restTemplate;

    public PartnerResource(PartnerRepository partnerRepository){
        this.partnerRepository = partnerRepository;
    }

    public List<Partner> getAllPartners(){
        return partnerRepository.findAll();
    }

    public Partner getPartnerByName(String partnerName){
        return partnerRepository.findOneByPartnerName(partnerName);
    }

    //public Partner getAllPartnerItems(String partnerName)
    //#TODO get all partner item from inventory service
}
