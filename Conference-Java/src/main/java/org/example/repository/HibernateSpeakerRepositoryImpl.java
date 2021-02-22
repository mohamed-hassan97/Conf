package org.example.repository;

import org.example.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll(){

        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("Bryan");
        speaker.setLastName("Mohamed");

        speakers.add(speaker);

        return speakers;
    }
}