package com.frankmoley.lil.sbet.landon.roomwebapp.controllers;

import java.util.ArrayList;
import java.util.List;
import com.frankmoley.lil.sbet.landon.roomwebapp.models.Room;
import com.frankmoley.lil.sbet.landon.roomwebapp.services.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rooms")
public class RoomController {

    private static final List<Room> rooms = new ArrayList<>();
    private final RoomService roomService;

    public RoomController(RoomService roomService){
        this.roomService=roomService;
    }

    @GetMapping
    public String getAllRooms(Model model){
        model.addAttribute("rooms", roomService.getAllRooms());
        return "rooms";
    }
}