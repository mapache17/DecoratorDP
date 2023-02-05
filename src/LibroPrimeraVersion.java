public class LibroPrimeraVersion implements ILibro{
    private String tituloLibro;

    public LibroPrimeraVersion(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    @Override
    public String versionLibro() {
        return "La versión del libro es la número 1";
    }

    @Override
    public String cantidadPaginas() {
        return "La cantidad de hojas son 100";
    }

}
