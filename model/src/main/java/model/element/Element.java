package model.element;

import contract.Permeability;
import contract.iElement;
import contract.iSprite;

public abstract class Element implements iElement {
    private iSprite sprite;
    private Permeability permeability;
    private Boolean explosable;

    @Override
    public Permeability getPermeability() {
        return this.permeability;
    }

    @Override
    public iSprite getSprite() {
        return this.sprite;
    }

    @Override
    public Boolean isExplosable() {
        return this.explosable;
    }

    public void setExplosable(final Boolean explosable) {
        this.explosable = explosable;
    }

    public void setPermeability(final Permeability permeability) {
        this.permeability = permeability;
    }

    public void setSprite(final iSprite sprite) {
        this.sprite = sprite;
    }
}
