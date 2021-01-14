package io.chaosity.api.db.sample.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import io.chaosity.api.db.sample.dao.AddressAliasTypeAUT;

@RepositoryRestResource(exported = true, collectionResourceRel = "address_alias_type_AUT", path = "address_alias_type_AUT")
public interface AddressAliasTypeAUTRepo extends JpaRepository<AddressAliasTypeAUT, String> {

}
