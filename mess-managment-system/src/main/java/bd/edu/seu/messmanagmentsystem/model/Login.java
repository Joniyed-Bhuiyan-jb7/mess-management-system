package bd.edu.seu.messmanagmentsystem.model;import lombok.AllArgsConstructor;import lombok.Data;import lombok.NoArgsConstructor;import javax.persistence.Column;import javax.persistence.Entity;import javax.persistence.Id;import javax.persistence.Table;@Data@AllArgsConstructor@NoArgsConstructor@Entity@Table(name = "Login_Table")public class Login {    @Id    @Column(name = "user_name",length = 30)    private String username;    @Column(name = "pass_word",length = 30,nullable = false)    private String password;}