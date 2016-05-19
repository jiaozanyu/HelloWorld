package au.edu.swu.service;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
 
@Service
public class TrampsService {
 
    private Map tramps;
    private static final Logger logger = LoggerFactory.getLogger(TrampsService.class);
 
    public TrampsService() {
        tramps = new HashMap();
        populate(tramps);
    }
    public Map findAll() {
        logger.info("Retrieving Walks");
        return tramps;
    }
 
    private void populate(Map tramps) {
        tramps.put(1L, "Lake Waikaremoana Great Walk");
        tramps.put(2L, "Tongariro Northern Circuit");
        tramps.put(3L, "Whanganui Journey");
        tramps.put(4L, "Abel Tasman Coast Track");
        tramps.put(5L, "Heaphy Track");
        tramps.put(6L, "Kepler Track");
        tramps.put(7L, "Milford Track");
        tramps.put(8L, "Routeburn Track");
        tramps.put(9L, "Rakiura Track");
    }
}
