package Model;

public class Pizza {
    public Salsa salsa;
    public Masa masa;
    public Queso queso;
    public Pizza(IngredientesFactory f){
        this.salsa = f.crearSalsa();
        this.masa = f.crearMasa();
        this.queso = f.crearQueso();
    }
    public String descripcion(){
        return "Pizza "+"\n"+"salsa "+masa.descripcion()+
                "\n"+"queso "+queso.descripcion()+
                "\n"+"salsa "+salsa.descripcion();
    }
}
