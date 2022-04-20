package com.company.afm_project.screen.team;

import io.jmix.ui.screen.*;
import com.company.afm_project.entity.Team;

@UiController("Team.browse")
@UiDescriptor("team-browse.xml")
@LookupComponent("teamsTable")
public class TeamBrowse extends StandardLookup<Team> {
}