package makadji.mamadou.sa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // ça veut dire que c'est un controller qui va gérer les requêtes HTTP
@RequestMapping(path = "test") // ça veut dire que ce controller va gérer les requêtes qui commencent par /api/test
public class TestController {
    @GetMapping(path = "string") // ça veut dire que cette méthode va gérer les requêtes GET qui commencent par /api/test/string
  public String  getString() {
        return "Chaine de caractère transmise par SA";
    }
}