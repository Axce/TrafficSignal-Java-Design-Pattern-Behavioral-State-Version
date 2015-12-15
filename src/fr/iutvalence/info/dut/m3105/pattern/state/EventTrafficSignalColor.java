package fr.iutvalence.info.dut.m3105.pattern.state;

public class EventTrafficSignalColor implements Event
{
	private String color;
	
	public EventTrafficSignalColor(String color)
	{
		this.color = color;
	}
	
	@Override
	public String toString()
	{
		return this.color;
	}
}
