package f2_1461700229.daskom.praktikumptm2;

public class MainActivityPresenter {
    MainActivityView view;

    public MainActivityPresenter(MainActivityView view){
        this.view = view;
    }

    public void olahData (String nilai1, String nilai2, String nilai3){
        double hitung = ((Double.parseDouble(nilai1)+Double.parseDouble(nilai2))*Double.parseDouble(nilai3))/2;
        view.setHasil(hitung);

    }
}
