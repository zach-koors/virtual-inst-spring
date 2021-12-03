package com.zachkoors.virtualinstspring.DAO;

import com.zachkoors.virtualinstspring.domain.SequencerState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class SequencerStateJdbcDAO implements SequencerStateDAO{

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public SequencerState saveSequencerState(SequencerState sequencerState) {
        String sql = "INSERT INTO sequencer_state (sequencer_state_name, step_classes) \n" +
                "VALUES (?, ?)";
        String beatName = sequencerState.getSequencerStateName();
        String[] stepClasses = sequencerState.getStepClasses();
        jdbcTemplate.update(sql, beatName, stepClasses);
        return sequencerState;
    }

    @Override
    public SequencerState retrieveSequencerState(String sequencerStateName) {
        SequencerState sequencerState = null;
        String sql = "SELECT * \n" +
                "FROM sequencer_state \n" +
                "WHERE sequencer_state_name = ?";
        SqlRowSet result = jdbcTemplate.queryForRowSet(sql, sequencerStateName);
        if (result.next()){
            sequencerState = new SequencerState(result.getString(0), result.getObject(1, String[].class));
        }
        return sequencerState;
    }

    @Override
    public boolean sequencerStateExists(SequencerState sequencerState) {

        return false;
    }
}
