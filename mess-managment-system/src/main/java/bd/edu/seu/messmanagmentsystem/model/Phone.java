package bd.edu.seu.messmanagmentsystem.model;import lombok.AllArgsConstructor;import lombok.Data;import lombok.NoArgsConstructor;import javax.persistence.Column;import javax.persistence.Embeddable;@Embeddable@Data@AllArgsConstructor@NoArgsConstructorpublic class Phone {    @Column(name = "Code",length = 10,nullable = false)    private String code;    @Column(name = "Number",length = 20,nullable = false)    private long number;}