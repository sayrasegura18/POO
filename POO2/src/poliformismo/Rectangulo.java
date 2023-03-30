package poliformismo;
public class Rectangulo {
    private float lado,base,altura;
    public Rectangulo(float lado, float altura, float base){
        this.lado=lado;
        this.altura=altura;
        this.base=base;
    }
    
    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }
}
