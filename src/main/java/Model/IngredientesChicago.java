package Model;

public class IngredientesChicago implements IngredientesFactory {
    @Override
    public Salsa crearSalsa(){
        return new SalsaChicago();
    }
    @Override
    public Queso crearQueso(){
        return new QuesoChicago();
    }
    @Override
    public Masa crearMasa(){
        return new MasaChicago();
    }
}
