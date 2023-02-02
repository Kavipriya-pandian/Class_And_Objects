package dxc;

class TVtester
{
	int channel=1;
    int volumeLevel=1;
    boolean on=false;
    TVtester()
    {
    	
    }

	void turnOn()
	{
		on=true;
	}
	void turnOff()
	{
		on = false;
	}
	void setChannel(int newChannel)
	{
		if(on && (newChannel>=1) && (newChannel<=120))
			channel=newChannel;
		
	}
	void setVolume(int newVolumeLevel)
	{
		
		if(on && (newVolumeLevel>=1) && (newVolumeLevel<=7))
			volumeLevel=newVolumeLevel;
		
		
	}
	void channelUp()
	{
		if(on && channel<=120)
			channel++;
		return;
	}
	void channelDown()
	{
		if(on && channel<=1)
			channel--;
		return;
	}
		
	
	void volumeUp()
	{
		if(on && volumeLevel<=7)
			volumeLevel++;
		return;
	}
	void volumeDown()
	{
		if(on && volumeLevel>=1)
			volumeLevel--;
		return;
	}

}

	public class TV
	{
	public static void main(String[] args) 
	{ 
		TVtester tv1=new TVtester();
		TVtester tv2=new TVtester();
		 tv1.turnOn();
	        tv1.setChannel(30);
	        tv1.setVolume(3);

	       
	        tv2.turnOn();
	        tv2.channelUp();
	        tv2.channelUp();
	        tv2.volumeUp();

	        System.out.println("TV 1 channel is " + tv1.channel + " and volume level is " + tv1.volumeLevel);
	        System.out.println("TV 2 channel is " + tv2.channel + " and volume level is " + tv2.volumeLevel);
		
		
		
	}
}


