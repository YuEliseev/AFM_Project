package com.company.afm_project.screen.player;

import io.jmix.ui.screen.*;
import com.company.afm_project.entity.Player;

@UiController("Player.browse")
@UiDescriptor("player-browse.xml")
@LookupComponent("playersTable")
public class PlayerBrowse extends StandardLookup<Player> {
}