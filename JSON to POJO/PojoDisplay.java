package apiconnection;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
public class PojoDisplay extends JFrame {


   static JFrame frame;
   static JList jlist;

public void displayList(List<JSONPOJO> list){
   JFrame frame=new JFrame("Datas ");
   JPanel panal=new JPanel();
    for(int i=0; i<list.size(); i++){
        String[] arr={ "ID :"+list.get(i).getId(),"First Name: "+list.get(i).getFirst_name(),"Last Name : "+list.get(i).getLast_name()
                ,"E Mail : "+list.get(i).getEmail(),"Avatar : "+list.get(i).getAvatar()};
     jlist=new JList(arr);
     panal.add(jlist);
        frame.add(panal);
      //jlist.add(arr);
    }

    frame.setSize(1000,1000);
    frame.setVisible(true);
}
}
