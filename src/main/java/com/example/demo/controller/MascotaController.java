package com.example.demo.controller;

import com.example.demo.entity.Mascota;
import com.example.demo.repository.MascotaRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class MascotaController {

    MascotaRepository mascotaRepository;

    public MascotaController(MascotaRepository mascotaRepository) {
        this.mascotaRepository = mascotaRepository;
    }

    @GetMapping("/Listar")
    public String listarMascotas(Model model){
        List<Mascota> mascotaLista = mascotaRepository.findAll();
        model.addAttribute("mascotaLista",mascotaLista);
        return "Listar";
    }

}
