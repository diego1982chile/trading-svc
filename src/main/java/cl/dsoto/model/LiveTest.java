package cl.dsoto.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ta4j.core.Bar;
import org.ta4j.core.Trade;

import java.util.List;

/**
 * Created by root on 05-05-23.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LiveTest {

    private Long id;

    private List<Bar> bars;

    private List<Trade> trades;
}
