package com.jxsj.fallback;

import com.jxsj.feign.ResumeFeignClient;
import org.springframework.stereotype.Component;

@Component
public class ResumeFallback implements ResumeFeignClient {

    @Override
    public Integer findDefaultResumeState(Long userId) {
        System.out.println("兜底。。。。。");
        return -6;
    }
}
