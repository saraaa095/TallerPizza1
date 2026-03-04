package Model;

public class IngredientesNY implements IngredientesFactory{
    @Override
    public Salsa crearSalsa(){
        return new SalsaNY();
    }
    @Override
    public Queso crearQueso(){
        return new QuesoNY();
    }
    @Override
    public Masa crearMasa(){
        return new MasaNY();
    }
}
