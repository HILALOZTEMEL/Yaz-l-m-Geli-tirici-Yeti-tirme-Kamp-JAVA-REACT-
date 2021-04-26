package oopIntroOdev1;

import oopIntro.Category;

public class Main {

	public static void main(String[] args) {
		PlayList playList1=new PlayList(1,"Fallen","Ufo361 & Ezhel","2019");
		PlayList playList2=new PlayList(2,"Regen","Ali471 & Mero","2021");
		PlayList playList3=new PlayList(3,"Bitte geh","Elif Demirezer & Mero","2019");
		PlayList playList4=new PlayList(4,"Perspektive","Mero","2019");
		
		PlayList[] playlist= {playList1,playList2,playList3,playList4};
		
		for (PlayList pList : playlist) {
			System.out.println(pList.name+" "+pList.singer+" "+pList.releaseDate);
			
		}
		
		Category category1=new Category();
		category1.id=1;
		category1.name="Rap";
		   
		Category category2=new Category();
		category2.id=2;
		category2.name="R&B";
		
		PlayListManager playListManager=new PlayListManager();
		playListManager.AddToPlaylist(playList4);
		playListManager.DeleteFromPlaylist(playList1);
	}

}
