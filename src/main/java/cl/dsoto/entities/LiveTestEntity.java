package cl.dsoto.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

/**
 * Created by root on 03-05-23.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "LIVE_TEST")
public class LiveTestEntity extends AbstractPersistableEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, orphanRemoval = true)
    @JoinColumn(name = "LIVE_TEST_ID", updatable = false, insertable = false)
    private List<BarEntity> bars;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, orphanRemoval = true)
    @JoinColumn(name = "LIVE_TEST_ID", updatable = false, insertable = false)
    private List<TradeEntity> trades;

    @Override
    public Long getId() {
        return id;
    }
}
