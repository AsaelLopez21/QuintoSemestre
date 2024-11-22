package animal;

public class Animal {

    public static void main(String[] args) {
        // Creamos un objeto de tipo Animal pero referenciamos a un caballo
        animal2 miAnimal = new caballo("RonDamon");
        //miAnimal.sonido();
        // Cambiamos la referencia
        miAnimal = new caballo("Petra");
        //miAnimal.sonido();
        
        animal2 perrito =  new perro("Firulais");
        perro firulais = new perro("Salchicha");
        
        animal2[] granja={firulais,miAnimal};
        
        for(animal2 animal: granja){
            animal.sonido();
        }
    }
}
