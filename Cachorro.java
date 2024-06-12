package models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Cachorro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    private Double vlTamanho;
    private Boolean stPerfume;
    private String dtNascimento;

    @ManyToOne
    @JoinColumn(name = "id_raca")
    private Raca raca;

    @ManyToOne
    @JoinColumn(name = "id_pelagem")
    private Pelagem pelagem;

    @ManyToOne
    @JoinColumn(name = "id_cor")
    private Cor cor;
}
