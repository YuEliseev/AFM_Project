package com.company.afm_project.screen.coach;

import io.jmix.ui.screen.*;
import com.company.afm_project.entity.Coach;

@UiController("Coach.browse")
@UiDescriptor("coach-browse.xml")
@LookupComponent("coachesTable")
public class CoachBrowse extends StandardLookup<Coach> {
}