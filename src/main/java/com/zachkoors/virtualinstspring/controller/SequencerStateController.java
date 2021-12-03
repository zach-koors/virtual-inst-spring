package com.zachkoors.virtualinstspring.controller;

import com.zachkoors.virtualinstspring.DAO.SequencerStateDAO;
import com.zachkoors.virtualinstspring.domain.SequencerState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class SequencerStateController {

    @Autowired
    private SequencerStateDAO dao;
    private SequencerState sequencerState;

    @PostMapping(path = "/")
    public SequencerState addSequencerState(@RequestBody SequencerState sequencerState){
        return dao.saveSequencerState(sequencerState);
    }


}
