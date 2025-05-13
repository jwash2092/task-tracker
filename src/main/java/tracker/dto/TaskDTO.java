package tracker.dto;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TaskDTO {

    private long id;
    private String description;
    private String status;
    private Timestamp createAt;
    private Timestamp updatedAt;

}
