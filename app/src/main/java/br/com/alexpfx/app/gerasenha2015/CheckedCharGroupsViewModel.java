package br.com.alexpfx.app.gerasenha2015;

import java.util.Map;

/**
 * Created by alexandre on 24/01/15.
 */
public class CheckedCharGroupsViewModel {
    Map<String, Boolean> charGroups;

    public CheckedCharGroupsViewModel(Map<String, Boolean> charGroups) {
        this.charGroups = charGroups;
    }
}