package remotecontrol;

public class Television implements remotecontrol{
	int volume;
	
	public void TurnOn() {
		System.out.println("Turn on Tv!");
		
	}
	public void SetVolume(int volume) {
		this.volume = volume;
		System.out.println("Tv volume : " + volume);
		
	}

}
