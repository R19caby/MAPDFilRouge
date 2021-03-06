package org.pneditor.petrinet.adapters.binome03;

import org.pneditor.petrinet.AbstractNode;
import org.pneditor.petrinet.ResetArcMultiplicityException;
import org.pneditor.petrinet.models.binome03.arcs.ZeroArc;

/**
 * La classe qui adapte nos arcs Zéros. Le choix de l'adaptateur Arc se fait
 * dans PetriNetAdapter. Elle garde en mémoire l'arc zéro, la place et la
 * transition associés.
 */
public class InhibitoryArcAdapter extends ArcAdapter {

	public InhibitoryArcAdapter(ZeroArc a, TransitionAdapter t, PlaceAdapter p) {
		super(a, t, p);
	}

	@Override
	public AbstractNode getSource() {
		return placeAdapter;
	}

	@Override
	public AbstractNode getDestination() {
		return transitionAdapter;
	}

	@Override
	public boolean isReset() {
		return false;
	}

	@Override
	public boolean isRegular() {
		return false;
	}

	@Override
	public boolean isInhibitory() {
		return true;
	}

	public ZeroArc getArc() {
		return (ZeroArc) arc;
	}

	@Override
	public int getMultiplicity() throws ResetArcMultiplicityException {
		return 0;
	}

	@Override
	public void setMultiplicity(int multiplicity) throws ResetArcMultiplicityException {
		// Inutile.
	}

}
