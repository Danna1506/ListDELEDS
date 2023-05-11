package co.edu.umanizales.listdeleds.service;

import co.edu.umanizales.listdeleds.model.ListDE;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class ListDEService {
    private ListDE Led;

    public ListDEService() {
        Led = new ListDE();

    }
}
