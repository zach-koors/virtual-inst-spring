package com.zachkoors.virtualinstspring.controller;

import com.zachkoors.virtualinstspring.DAO.SequencerStateDAO;
import com.zachkoors.virtualinstspring.domain.SequencerState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class SequencerStateController {

    @Autowired
    private SequencerStateDAO dao;
    private SequencerState sequencerState;

    @RequestMapping(path = "/", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public SequencerState addSequencerState(@RequestBody SequencerState sequencerState){
        return dao.saveSequencerState(sequencerState);
    }

    @RequestMapping(path = "/{name}", method = RequestMethod.GET)
    @ResponseBody
    public SequencerState retrieveSequencerState(@PathVariable("name") String sequencerStateName){
        return dao.retrieveSequencerState(sequencerStateName);
    }


}
