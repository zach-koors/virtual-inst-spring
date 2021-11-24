DROP TABLE IF EXISTS sequencer_state;

CREATE TABLE sequencer_state
(
    sequencer_state_name varchar(16),
    step_classes varchar(max)
    PRIMARY KEY (sequencer_state_name)
);