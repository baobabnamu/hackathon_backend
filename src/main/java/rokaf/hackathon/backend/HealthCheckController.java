package rokaf.hackathon.backend;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import rokaf.hackathon.backend.global.config.CommonApiResponse;

@RestController
public class HealthCheckController {
    @Operation(summary = "Health Check Controller", description = "Health Checking을 위한 테스트용 API입니다.")
    @GetMapping()
    public CommonApiResponse<Boolean> healthCheck() {
        return CommonApiResponse.of(true);
    }
}
