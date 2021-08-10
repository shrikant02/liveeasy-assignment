package com.shrikant.controller;

import com.shrikant.entity.Payload;
import com.shrikant.services.PayloadService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/load")
public class PayloadController {

    private final PayloadService payloadService;

    @PostMapping
    public String addPayload(@RequestBody Payload load){
        return payloadService.saveLoad(load);
    }

    @GetMapping
    public List<Payload> getPayloads(@RequestParam int shipperId){
        return payloadService.getLoadsByShipperId(shipperId);
    }

    @GetMapping("/{loadId}")
    public Payload getLoad(@PathVariable("loadId") int id){
        return payloadService.getPayloadById(id);
    }


    @DeleteMapping("/{loadId}")
    public String deletePayload(@PathVariable("loadId") int id){
        payloadService.deleteLoad(id);
        return "load deleted";
    }

    @PutMapping("/{loadId}")
    public Payload updatePayload(@RequestBody Payload payload){
        return payloadService.updatePayload(payload);
    }
}
