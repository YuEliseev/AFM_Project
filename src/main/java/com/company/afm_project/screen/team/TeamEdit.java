package com.company.afm_project.screen.team;

import io.jmix.ui.screen.*;
import com.company.afm_project.entity.Team;

@UiController("Team.edit")
@UiDescriptor("team-edit.xml")
@EditedEntityContainer("teamDc")
public class TeamEdit extends StandardEditor<Team> {
}