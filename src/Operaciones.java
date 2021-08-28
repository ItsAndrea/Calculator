public class Operaciones {
    
    private int a;
    private int b;

    public void setA(int a){
        this.a = a;
    }
    public int getA() {
        return this.a;
    }
    public void setB(int b){
        this.b = b;
    }
    public int getB() {
        return this.b;
    }
    public int suma(){
        return a+b;
    }
    public int resta(){
        return a-b;
    }
    public int mult(){
        return a*b;
    }
    public int div(){
        return a/b;
    }
}
