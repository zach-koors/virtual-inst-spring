package com.zachkoors.virtualinstspring.controller;

import com.zachkoors.virtualinstspring.DAO.SequencerStateDAO;
import com.zachkoors.virtualinstspring.domain.SequencerState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SequencerStateController {

    @Autowired
    private SequencerStateDAO dao;
    private SequencerState sequencerState;


}
