package com.hms.hotelmanagementservice.controller;

import com.hms.hotelmanagementservice.RoomRepository;
import com.hms.hotelmanagementservice.model.GetAllRoomsResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Hotel Management Service", description = "Hotel Management Service APIs")
@RestController
@RequestMapping("/api/v1")
public class MainRestController {

    private final RoomRepository roomRepository;

    @Autowired
    public MainRestController(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @GetMapping("/getAllRooms")
    public ResponseEntity<GetAllRoomsResponse> getAvailableRooms() {

        GetAllRoomsResponse getAllRoomsResponse = new GetAllRoomsResponse();
        getAllRoomsResponse.setRooms(roomRepository.findAll());

        return ResponseEntity.ok(getAllRoomsResponse);
    }
}
