package bd.edu.seu.messmanagmentsystem.ModelForResponse;import lombok.AllArgsConstructor;import lombok.Data;import lombok.NoArgsConstructor;import java.time.LocalDate;@Data@AllArgsConstructor@NoArgsConstructorpublic class BazarDetails {    private long member_id;    private String member_name;    private String details;    private double cost;    private LocalDate date;}