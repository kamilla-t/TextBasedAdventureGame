package entities.openables;

import entities.Pickup;
import entities.openers.Opener;

public class Openable extends Pickup {
    Opener opener;
    boolean locked;
    Pickup contents;

    public Openable(String description, boolean locked, Pickup contents) {
        super(description);
        this.locked = locked;
        this.contents = contents;
    }
    //getOpener and setOpener for Opener
    public Opener getOpener(){
        return this.opener;
    }

    public void setOpener(Opener opener){
        this.opener = opener;
    }
    //getLooked and setLooked for locked
    public boolean getLooked(){
        return this.locked;
    }

    public void setLooked(boolean locked) {
        this.locked = locked;
    }

    //getContents and setContents for contents
    public Pickup getContents(){
        return this.contents;
    }

    public void setContents(Pickup contents){
        this.contents = contents;
    }
}
