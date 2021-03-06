package com.zachkoors.virtualinstspring.DAO;

import com.zachkoors.virtualinstspring.domain.SequencerState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import javax.sql.rowset.serial.SerialArray;
import javax.sql.rowset.serial.SerialException;
import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
        String sql = "SELECT step_classes \n" +
                "FROM sequencer_state \n" +
                "WHERE sequencer_state_name = ?";
        SqlRowSet result = jdbcTemplate.queryForRowSet(sql, sequencerStateName);
        if (result.next()){
            String resultString = result.getString("step_classes");
            String[] stepClasses = resultString.replace("\"", "").split(",");
            sequencerState = new SequencerState(sequencerStateName, stepClasses);
        }
        return sequencerState;
    }

}
