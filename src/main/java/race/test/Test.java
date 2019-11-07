package race.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletResponse;
import java.io.IOException;

@Controller
@RequestMapping(value = "/test")
public class Test {
    @RequestMapping(value = "/g")
    public void test(ServletResponse response){
        try {
            response.getWriter().print("sfsafsa");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
