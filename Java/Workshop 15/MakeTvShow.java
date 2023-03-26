/**
 * @(#)MakeTvShow.java
 *
 *
 * @author 
 * @version 1.00 2017/1/11
 */

public class MakeTvShow {
        
    /**
     * Creates a new instance of <code>MakeTvShow</code>.
     */
    public MakeTvShow() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    TvShow tv1 = new TvShow("game of thrones");
    //constructor 1
tv1.setMainstar("Ensemble cast");
tv1.setEpisodes(60);
tv1.setTime(60);
    	tv1.print();
    	//constructor 2
     TvShow tv2 = new TvShow("Breaking Bad", "Brian Cranston", 62, 48);
    
    tv2.print();	
    
    TvShow tv3 = new TvShow("Longest Show Ever");
    tv3.setMainstar("Bruce Forsyth");
	tv3.setEpisodes(1000);
	tv3.setTime(300);
    tv3.print();
    }
    
}
