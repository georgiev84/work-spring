package com.petar.workspring.repository;

import com.petar.workspring.domain.entities.Partner;
import com.petar.workspring.model.service.PartnerServiceModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PartnersRepository extends JpaRepository<Partner, Integer> {

    Optional<Partner> findByEmail(String email);

    PartnerServiceModel loginUser(PartnerServiceModel partnerServiceModel);
}