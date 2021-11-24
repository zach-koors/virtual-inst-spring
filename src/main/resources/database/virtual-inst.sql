DROP TABLE IF EXISTS sequencer_state;

CREATE TABLE sequencer_state
(
    sequencer_state_name text,
    step_classes text[],
    PRIMARY KEY (sequencer_state_name)
);