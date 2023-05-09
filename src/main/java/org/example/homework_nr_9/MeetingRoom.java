package org.example.homework_nr_9;

import java.util.List;

public class MeetingRoom implements AttenTraining {
    private List<AttenTraining> attendees;

    public MeetingRoom(List<AttenTraining> attendees) {
        this.attendees = attendees;
    }


    @Override
    public void conductTraining() {
        for (AttenTraining attendee : attendees) {
            attendee.conductTraining();
        }
    }
}
