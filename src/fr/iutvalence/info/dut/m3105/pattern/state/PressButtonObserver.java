package fr.iutvalence.info.dut.m3105.pattern.state;

public class PressButtonObserver implements Observer
{
	@Override
	public void notify(Event e)
	{
		System.out.println("Le bouton est appuyé ");
	}

}
