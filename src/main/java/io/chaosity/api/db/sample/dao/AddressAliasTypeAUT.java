package io.chaosity.api.db.sample.dao;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "address_alias_type_aut")
public class AddressAliasTypeAUT {

	@Id
	private String code;
	private String name;
	private String description;

}
