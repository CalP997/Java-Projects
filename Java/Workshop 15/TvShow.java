/**
 * @(#)TvShow.java
 *
 *
 * @author 
 * @version 1.00 2017/1/11
 */


public class TvShow {
public final int maxepisodes = 100;
public final int maxtime = 180;
	
private String nameofshow;
private String mainstar;
private int episodes;
private int time;

public void print(){
	System.out.println(nameofshow);
	System.out.println("star of show: " + mainstar);
	System.out.println("Number of episodes: " + episodes);
	System.out.println("running time: " + time);
	System.out.println();
}
//add some constructors
//constrctor 1
//constructor 	2
public TvShow(String nameofshow){
	this.nameofshow = nameofshow;
}
//constructor 	2
public TvShow(String nameofshow , String mainstar , int episodes , int time){
	this.nameofshow = nameofshow;
	this.mainstar = mainstar;
	this.episodes = episodes;
	this.time = time;
	//get/set methods
	public void setNameofshow(String nameofshow){
		this.nameofshow = nameofshow;
	}
		public String getNameofshow(){
		return this.nameofshow;
	}
		public void setMainstar(String mainstar){
		this.mainstar = mainstar;
	}
		public String getMainstar(){
		return this.mainstar;
	}
		public void setEpisodes(int episodes){
		if (episodes > maxepisodes){
			System.out.println("Error:exeeded max no of episodes");
			this.episodes = -1;
		}else{
			this.episodes = episodes;
		}
	}
		public int getEpisodes(){
		return this.episodes;
	}
		public void setTime(int time){
			if (time > maxtime){
				System.out.println("Error: Exeeded max running time");
				this.time = -1;
			}else{
				this.time = time;
			}
	}
		public int getTime(){
		return this.time;
	}
}
    public TvShow() {
    	
    }
    
    
}