package SystemClan;

import java.util.ArrayList;

public class DetailClan {
    ArrayList<Clan> dc;
    public DetailClan(){
        dc = new ArrayList<>(3);
        dc.add(new Clan(1, "Spuyer Mampet", 12, 350, 10));
        dc.add(new Clan(2, "Busi Mati", 9, 200, 10));
        dc.add(new Clan(3, "Platina", 8, 150, 10));
        
        
    }
    
    public void showclanPeringkat(){
        for(Clan cl:dc){
            System.out.println(cl.getPeringkat() +". "+ cl.getNamaclan() + " Kekuatan : " + cl.getKekuatan());
        }
    }
    
    public void showdetailclan(int cmenu){
       cmenu--;
       int ix = 0;
       if (ix <= cmenu){
           System.out.println("\n=======" + dc.get(cmenu).getNamaclan() + "=======");
           System.out.println("Peringkat : " + dc.get(cmenu).getPeringkat());
           System.out.println("Nama Clan : " + dc.get(cmenu).getNamaclan());
           System.out.println("Level Clan : " + dc.get(cmenu).getLevel());
           System.out.println("Kekuatan : " + dc.get(cmenu).getKekuatan() + " Power");
           System.out.println("Jumlah Anggota : " + dc.get(cmenu).getJumlahanggota());
           System.out.println("============================");
       }
    }
}
