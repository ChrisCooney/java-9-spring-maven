package java9.spring.mvc.admin.service;

import org.springframework.stereotype.Service;

@Service
public class MetricsService {
    public boolean isOkay() {
        return Math.random() > 0.5;
    }
}
