package ru.netology.orm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

    // Открытый endpoint (доступен без авторизации)
    @GetMapping("/public")
    public String publicEndpoint() {
        return "Это публичный endpoint. Авторизация не требуется.";
    }

    // Защищённый endpoint (доступен только после авторизации)
    @GetMapping("/private")
    public String privateEndpoint() {
        return "Это защищённый endpoint. Вы авторизованы.";
    }

    // Ещё один защищённый endpoint
    @GetMapping("/admin")
    public String adminEndpoint() {
        return "Это защищённый endpoint для администраторов.";
    }
}
