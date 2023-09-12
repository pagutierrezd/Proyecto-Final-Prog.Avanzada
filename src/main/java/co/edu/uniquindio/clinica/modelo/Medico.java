package co.edu.uniquindio.clinica.modelo;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Medico extends Usuario implements Serializable {

    @OneToMany(mappedBy = "medico")
    private List<Cita> citas;

    @OneToMany(mappedBy = "medico")
    private List<DiaLibre> diaLibres;

    @OneToMany(mappedBy = "medico")
    private List<HorarioMedico> horariosMedico;

    private Especialidad especialidad;
}
