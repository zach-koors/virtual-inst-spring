DROP TABLE IF EXISTS sequencer_state;

CREATE TABLE sequencer_state
(
    sequencer_state_name text,
    step_classes text,
    PRIMARY KEY (sequencer_state_name)
);

INSERT INTO sequencer_state (sequencer_state_name, step_classes)
VALUES ('house beat with bass and melody', '"melodic step on 2","melodic step on 4","melodic step off","melodic step off","melodic step on 6","melodic step off","melodic step on 8","melodic step off","melodic step on 0","melodic step off","melodic step off","melodic step on 6","melodic step off","melodic step on 4","melodic step off","melodic step on 2","rhythmic step off","rhythmic step on","rhythmic step off","rhythmic step on","rhythmic step off","rhythmic step on","rhythmic step off","rhythmic step on","rhythmic step off","rhythmic step off","rhythmic step on-loud","rhythmic step off","rhythmic step off","rhythmic step off","rhythmic step on-loud","rhythmic step off","rhythmic step on-loud","rhythmic step off","rhythmic step on-loud","rhythmic step off","rhythmic step on-loud","rhythmic step off","rhythmic step on-loud","rhythmic step off"');