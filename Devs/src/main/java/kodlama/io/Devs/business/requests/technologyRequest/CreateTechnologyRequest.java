package kodlama.io.Devs.business.requests.technologyRequest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateTechnologyRequest {

    private String name;
    private int programmingLanguageId;
}