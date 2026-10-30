package edu.pucp.gtics.lab4_gtics_20221.controller;

import edu.pucp.gtics.lab4_gtics_20221.repository.ProductRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@RequestMapping("/producto")
public class JuegosController {


    final ProductRepository productoRepository;

    public JuegosController(ProductRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @GetMapping({"", "/", "/lista"})
    public String listaProductos(Model model) {
        model.addAttribute("listaProductos", productoRepository.findAllByOrderByPrecioDesc());
        return "juegos/lista";
    }

}
