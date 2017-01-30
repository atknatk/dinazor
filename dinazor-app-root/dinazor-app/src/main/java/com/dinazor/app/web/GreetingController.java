package com.dinazor.app.web;

import com.dinazor.domain.entity.Account;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by atakan on 30.01.2017.
 */
@Controller
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/resturl", method = RequestMethod.GET, produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
//    @Transactional("jpaTransactionManager")
    public @ResponseBody
    Account greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Account(counter.incrementAndGet(),
                name);
    }
}
