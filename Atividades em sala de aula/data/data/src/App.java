public class App {
    public static void main(String[] args) throws Exception {
        DataController d1 =new  DataController (1,12,1990);
        d1.validaData();
        DataController d2 =new DataController();
        d2.exibirData();
        d1.exibirData();
        
        

        d1.apresentaData(true);
        d1.exibirData();


        
    }
}
