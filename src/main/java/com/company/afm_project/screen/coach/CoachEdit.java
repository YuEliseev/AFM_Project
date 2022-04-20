package com.company.afm_project.screen.coach;

import io.jmix.ui.screen.*;
import com.company.afm_project.entity.Coach;

@UiController("Coach.edit")
@UiDescriptor("coach-edit.xml")
@EditedEntityContainer("coachDc")
public class CoachEdit extends StandardEditor<Coach> {
}