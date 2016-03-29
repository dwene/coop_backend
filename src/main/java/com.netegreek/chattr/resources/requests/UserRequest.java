package com.netegreek.chattr.resources.requests;

import java.util.Optional;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotBlank;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.netegreek.chattr.resources.requests.credential.CredentialRequest;


public class UserRequest {

	@NotBlank
	private String name;

    @JsonProperty("photo_url")
	private Optional<String> photoUrl = Optional.empty();

	@NotBlank
    @JsonProperty("username")
	private String username;

	private Optional<String> email = Optional.empty();

	@NotBlank
	private String phone;

	@NotNull
	@JsonProperty("credentials")
	private CredentialRequest credentialRequest;

	public String getName() {
		return name;
	}

	public Optional<String> getPhotoUrl() {
		return photoUrl;
	}

	public String getUsername() {
		return username;
	}

	public Optional<String> getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public CredentialRequest getCredentialRequest() {
		return credentialRequest;
	}
}
