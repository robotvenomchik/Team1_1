import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    Imodel m;
    UI ui;
    Controller(Imodel m){
        ui=new UI(this);
        this.m=m;
    }
    public void click(){
        m.print();
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        click();
    }
}
