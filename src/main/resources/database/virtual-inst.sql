DROP TABLE IF EXISTS sequncer-state;

CREATE TABLE sequencer-state
(
    sequencer-state-name varchar(16),
    step-classes varchar(max)
    PRIMARY KEY (sequencer-state-name)
);