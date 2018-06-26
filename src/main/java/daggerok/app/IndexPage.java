package daggerok.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexPage {

  @GetMapping({"", "/404"})
  public String redirect() {
    return "forward:/";
  }

  @GetMapping("/")
  String index(final Model model) {
    model.addAttribute("mytext", "ololo");
    model.addAttribute("mytext2", "trololo");
    return "index";
  }
}
