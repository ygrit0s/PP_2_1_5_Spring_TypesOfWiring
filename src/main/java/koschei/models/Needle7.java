package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;

public class Needle7 {

    private Death8 death;

    public Needle7(Death8 death) {
        this.death = death;
    }
    
    @Autowired
    public void setDeath(Death8 death) {
        this.death = death;
    }

    @Override
    public String toString() {
        return ", смерть Кощея на игле :( " + death.toString();
    }
}
