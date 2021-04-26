package oopIntroOdev1;

public class PlayList {
	int id;
	String name;
	String singer;
	String releaseDate;
	
	/*Constructor*/
	public PlayList() {
		System.out.println("Müzik çalara hoþ geldin");
	}
	
	/*Overloading*/
	
	public PlayList(int id,String name,String singer,String releaseDate) {
		this();
		this.id=id;
		this.name=name;
		this.singer=singer;
		this.releaseDate=releaseDate;
	}
}
