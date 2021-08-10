package com.shrikant.services;

import com.shrikant.entity.Payload;
import com.shrikant.repository.PayloadRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PayloadService {

    private final PayloadRepository payloadRepository;

    public String saveLoad(Payload payload){
        payloadRepository.save(payload);
        return "loads details added successfully";
    }

    public Payload getPayloadById(int id){
       return payloadRepository.findById(id);
    }

    public List<Payload> getLoadsByShipperId(int id){
        return payloadRepository.findPayloadByShipperId(id);
    }

    public void deleteLoad(int id){
        payloadRepository.deleteById(id);
    }

    public Payload updatePayload(Payload payload){
        return payloadRepository.save(payload);
    }


}
