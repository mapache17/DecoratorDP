public class PrimeraVersionFactory implements IEditionfactory{
    @Override
    public ILibro crearLibro(String titulo) {
        return new LibroPrimeraVersion(titulo);
    }

    @Override
    public IPoster crearPoster() {
        return new PosterPrimeraVersion();
    }
}
