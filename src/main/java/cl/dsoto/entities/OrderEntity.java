package cl.dsoto.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ta4j.core.Decimal;
import org.ta4j.core.Order;

import javax.persistence.*;

/**
 * Created by root on 03-05-23.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ORDERS")
public class OrderEntity extends AbstractPersistableEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;

    @Column(name = "INDX")
    private int index;

    private double price;
    private double amount;

    @Override
    public Long getId() {
        return id;
    }



}
