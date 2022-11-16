package kodlama.io.Devs.business.responses.languageResponse;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UpdateLanguagesResponse {

    private int id;
    private String name;
}
