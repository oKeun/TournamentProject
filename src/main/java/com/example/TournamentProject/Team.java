package com.example.TournamentProject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
@AllArgsConstructor
@Getter
@Setter
public class Team {
    String teamName, capitanName, coachName;
}
