public class LibroSegundaVersion implements ILibro{
    private String tituloLibro;

    public LibroSegundaVersion(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    @Override
    public String versionLibro() {
        return "La versión del libro es la número 2";
    }

    @Override
    public String cantidadPaginas() {
        return "La cantidad de hojas son 150";
    }
}
