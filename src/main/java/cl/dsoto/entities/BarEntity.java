package cl.dsoto.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ta4j.core.Bar;
import org.ta4j.core.BaseBar;

import javax.persistence.*;

/**
 * Created by root on 03-05-23.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "BAR")
public class BarEntity extends AbstractPersistableEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    double open;
    double high;
    double low;
    double close;
    double volume;

    @Override
    public Long getId() {
        return id;
    }
}
