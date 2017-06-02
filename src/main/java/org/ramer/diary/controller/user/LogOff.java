package org.ramer.diary.controller.user;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.ramer.diary.domain.Topic;
import org.ramer.diary.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import lombok.extern.slf4j.Slf4j;

/**
 * 注销.
 * @author ramer
 *
 */
@Slf4j
@SessionAttributes(value = { "user", "topics", }, types = { User.class, Topic.class })
@Controller
public class LogOff{

    /**
     * 注销用户.
     *
     * @param session the session
     * @param map the map
     * @return 主页
     */
    @PostMapping("/logOff")
    public String logOff(HttpSession session, Map<String, Object> map) {
        log.debug("注销");
        map.clear();
        session.invalidate();
        //	try {
        //	 request.getRequestDispatcher("/home").forward(request, response);
        //	} catch (Exception e) {
        //	 e.printStackTrace();
        //	}
        return "redirect:/home";
    }

}