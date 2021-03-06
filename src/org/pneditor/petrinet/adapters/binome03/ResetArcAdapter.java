package org.pneditor.petrinet.adapters.binome03;

import org.pneditor.petrinet.AbstractNode;
import org.pneditor.petrinet.ResetArcMultiplicityException;
import org.pneditor.petrinet.models.binome03.arcs.CleanerArc;

/**
 * Classe adaptant l'arc videur pour l'affichage par le PNEditor. Le choix de
 * l'adaptateur Arc se fait dans PetriNetAdapter. Elle garde en mémoire l'arc
 * videur, la place et la transition associée.
 */
public class ResetArcAdapter extends ArcAdapter {

	public ResetArcAdapter(CleanerArc a, TransitionAdapter t, PlaceAdapter p) {
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
		return true;
	}

	@Override
	public boolean isRegular() {
		return false;
	}

	@Override
	public boolean isInhibitory() {
		return false;
	}

	public CleanerArc getArc() {
		return (CleanerArc) arc;
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
