package org.pneditor.petrinet.adapters.binome03;

import org.pneditor.petrinet.AbstractArc;
import org.pneditor.petrinet.AbstractNode;
import org.pneditor.petrinet.ResetArcMultiplicityException;
import org.pneditor.petrinet.models.binome03.arcs.CleanerArc;

public class ResetArcAdapter extends AbstractArc {
	
	private CleanerArc arc;
	private TransitionAdapter ta;
	private PlaceAdapter pa;
	
	public ResetArcAdapter(CleanerArc a, TransitionAdapter t, PlaceAdapter p) {
		arc = a;
		ta = t;
		pa = p;
	}

	@Override
	public AbstractNode getSource() {
		return pa;
	}

	@Override
	public AbstractNode getDestination() {
		return ta;
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
		return arc;
	}

	@Override
	public int getMultiplicity() throws ResetArcMultiplicityException {
		//FIXME
		return 0;
	}

	@Override
	public void setMultiplicity(int multiplicity) throws ResetArcMultiplicityException {
		// FIXME
		
	}

}
