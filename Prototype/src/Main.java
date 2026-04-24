public class Main {
    public static void main(String[] args) {
        PrototypeRegistry registro = new PrototypeRegistry();

        // Configuración de prototipos base
        Personaje guerreroBase = new Personaje("Base", "Guerrero", 1, 150, 50);
        Personaje magoBase = new Personaje("Base", "Mago", 1, 80, 150);
        Personaje arqueroBase = new Personaje("Base", "Arquero", 1, 100, 100);

        registro.agregarPrototipo("Guerrero", guerreroBase);
        registro.agregarPrototipo("Mago", magoBase);
        registro.agregarPrototipo("Arquero", arqueroBase);

        // Creación de personajes mediante clonación
        Personaje jugador1 = (Personaje)registro.obtenerClon("Guerrero");
        if (jugador1 != null) {
            jugador1.setNombre("Aragon");
        }

        Personaje enemigo1 = (Personaje)registro.obtenerClon("Mago");
        if (enemigo1 != null) {
            enemigo1.setNombre("Dark Wizard");
        }

        // Verificación de resultados
        System.out.println("Prototipo Original:\n" + guerreroBase);
        System.out.println("Clon Modificado:\n" + jugador1);
        System.out.println("Enemigo Clonado:\n" + enemigo1);
    }
}
