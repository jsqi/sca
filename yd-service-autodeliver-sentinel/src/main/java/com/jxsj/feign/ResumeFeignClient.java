package com.jxsj.feign;

import com.jxsj.fallback.ResumeFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "yd-service-resume",path = "/resume",fallback = ResumeFallback.class)
public interface ResumeFeignClient {


    @GetMapping("/openstate/{userId}")
    Integer findDefaultResumeState(@PathVariable Long userId);
}
