package cl.dsoto.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
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
@Table(name = "TRADE")
public class TradeEntity extends AbstractPersistableEntity<Long>  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ORDER_ID", referencedColumnName = "ID", updatable = false, insertable = false)
    private OrderEntity entry;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ORDER_ID", referencedColumnName = "ID", updatable = false, insertable = false)
    private OrderEntity exit;

    private String startingType;

    @Override
    public Long getId() {
        return id;
    }
}
