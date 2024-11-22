package paresvalores;

public class ParesValores {
    public static void main(String[] args) {
        parKV<String,Integer> nombreEdad = new parKV<>("Asael",19);
        System.out.println("Informacion par generico nombre-edad: "+nombreEdad.getClave()+","+nombreEdad.getValor());
        
        parKV<String,String> paisCapital = new parKV<>("China","Shangai");
        System.out.println("Informacion par generico pais-capital: "+paisCapital.getClave()+","+paisCapital.getValor());

    }
    
}
