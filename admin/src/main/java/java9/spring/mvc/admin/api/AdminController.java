package java9.spring.mvc.admin.api;

import java9.spring.mvc.admin.model.MetricsResponse;
import java9.spring.mvc.admin.service.MetricsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/admin")
@RestController
public class AdminController {

    private final MetricsService metricsService;

    public AdminController(MetricsService metricsService) {
        this.metricsService = metricsService;
    }

    @RequestMapping("/metrics")
    public MetricsResponse metrics() {
        return new MetricsResponse(metricsService.isOkay());
    }
}
