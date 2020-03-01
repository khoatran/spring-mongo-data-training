package com.pycogroup.superblog.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "admin_users")
@Builder
public class User {
	@Id
	@Getter
	private ObjectId id;

	@Getter
	@Setter
	private String name;

	@Getter
	@Setter
	private String email;

}
