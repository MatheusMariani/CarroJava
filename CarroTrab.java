package carrotrab;
public class CarroTrab {
    private String modelo;
    private String marca;
    private int ano;
    private float quilometragem;
    public CarroTrab(int ano,float km, String modelo, String marca){
        this.ano = ano;
        this.quilometragem = km;
        this.modelo = modelo;
        this.marca = marca;
        }

    public CarroTrab() {
    }
        public int getAno(){
        return ano;  
        }
        public void setAno(int ano){
        this.ano = ano;
        }
        public float getKm(){
        return quilometragem;
        }
        public void setKm(float Km){
        this.quilometragem = Km;
        }
        public String getModel(){
        return modelo;
        }
        public void setModel(String model){
        this.modelo = model;
        }
        public String getMarca(){
        return marca;
        }
        public void setMarca(String marca){
        this.marca = marca;
        }
        
        @Override
        public String toString(){
            return "Modelo = " +modelo +"\nMarca = "+marca+"\nAno = "+ano+"\nKm = "+quilometragem+"\n Km/Ano = "+getRodado(ano,quilometragem);
                  
        }
        public float getRodado(int ano, float Km){
            
            return Km/(2019 - ano);
        }
        
}
