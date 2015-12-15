package fr.iutvalence.info.dut.m3105.pattern.state;

public class ChangeColorObserver implements Observer
{
	
	@Override
	public void notify(Event e)
	{
		System.out.println("Le feu est maintenant "+e);
	}
	
}
