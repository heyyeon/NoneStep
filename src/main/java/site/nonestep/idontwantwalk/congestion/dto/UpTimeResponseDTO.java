package site.nonestep.idontwantwalk.congestion.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class UpTimeResponseDTO {
    private String currentTime;
    private String after30;
    private String after60;
}
