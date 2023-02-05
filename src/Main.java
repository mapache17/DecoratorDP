public class Main {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(new PrimeraVersionFactory());
        Cliente cliente2 = new Cliente(new SegundaVersionFactory());

        //cliente compro la edición 1 del libro
        ILibro libroCliente1=cliente1.version.crearLibro("El retrato de Dorian Gray");
        IPoster posterCliente1=cliente1.version.crearPoster();
        System.out.println(libroCliente1.versionLibro()+" "+libroCliente1.cantidadPaginas()+";"+posterCliente1.versionPoster());

        //cliente compro la edición 2 del libro
        ILibro libroCliente2 = cliente2.version.crearLibro("El retrato de Dorian Gray");
        IPoster posterCliente2 = cliente2.version.crearPoster();
        System.out.println(libroCliente2.versionLibro()+" "+libroCliente2.cantidadPaginas()+"; "+posterCliente2.versionPoster());

    }
}
