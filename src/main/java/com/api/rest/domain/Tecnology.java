package com.api.rest.domain;

public class Tecnology {

    private int tecnologyId;
    private String tecnology;
    private boolean active;

    public int getTecnologyId() {
        return tecnologyId;
    }

    public void setTecnologyId(int tecnologyId) {
        this.tecnologyId = tecnologyId;
    }

    public String getTecnology() {
        return tecnology;
    }

    public void setTecnology(String tecnology) {
        this.tecnology = tecnology;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
