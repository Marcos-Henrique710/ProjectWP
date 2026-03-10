/*package com.example.projectwp.Controller;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class TesteController {

    public class processarGet(res){

    }
    public class processarPost(req, res) {

    }

    @RequestMapping("/tarefas")
    public void gerenciarRotas(HttpServletRequest req, HttpServletResponse res) {
        String metodo = req.getMethod();
        if ("GET".equalsIgnoreCase(metodo)) {
            processarGet(res); // Exibe o form
        } else if ("POST".equalsIgnoreCase(metodo)) {
            processarPost(req, res); // Salva dados
        } else {
            // Proíbe métodos como DELETE ou PUT
            res.setStatus(405);
        }
    }

}
*/