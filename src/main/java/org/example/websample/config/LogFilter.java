package org.example.websample.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;


@Slf4j
public class LogFilter implements Filter {


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
        // 외부 -> filter (->처리->) filter -> 외부 () 부분하기위해 filterchain활용
        log.info("Hello filter : "+ Thread.currentThread());
        filterChain.doFilter(servletRequest, servletResponse);
        log.info("Bye filter : "+ Thread.currentThread());
    }
}
