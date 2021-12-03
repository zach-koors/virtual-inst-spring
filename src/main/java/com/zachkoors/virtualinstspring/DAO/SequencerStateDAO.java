package com.zachkoors.virtualinstspring.DAO;

import com.zachkoors.virtualinstspring.domain.SequencerState;

public interface SequencerStateDAO {

    SequencerState saveSequencerState(SequencerState sequencerState);

    SequencerState retrieveSequencerState(SequencerState sequencerState);

    boolean sequencerStateExists(SequencerState sequencerState);
}
