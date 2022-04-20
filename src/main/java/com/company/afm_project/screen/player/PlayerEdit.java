package com.company.afm_project.screen.player;

import io.jmix.ui.screen.*;
import com.company.afm_project.entity.Player;

@UiController("Player.edit")
@UiDescriptor("player-edit.xml")
@EditedEntityContainer("playerDc")
public class PlayerEdit extends StandardEditor<Player> {
}