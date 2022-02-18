public class Prova {
    public static void main(String[] args) {
        Persona maria = Persona.creaPersona();
        maria.setApellidos("Ppp aaa");
        maria.setDni("54j");
        maria.setDomicilio("carrer jrjrjlfd a f 1");
        System.out.println(maria);

        Persona pepe = Persona.creaPersona("Pepe", "Ppp dfdf", 45, "kkk", "olee");
        System.out.println(pepe);
        pepe.setDomicilio("aufff");
        System.out.println(pepe.getDomicilio());
        pepe.setApellidos("asdasdasd");
        System.out.println(pepe.getApellidos());
        pepe.setDni("asasas");
        System.out.println(pepe.getDni());
        pepe.setNombre("Pascual");
        System.out.println(pepe.getNombre());
        System.out.println(pepe.getEdad());
        System.out.println(pepe);


    }
}
