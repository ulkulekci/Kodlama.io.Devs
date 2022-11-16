package kodlama.io.Devs.business.requests.languageRequest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class UpdateLanguageRequest {
	 private int id;
	 private String name;
}
