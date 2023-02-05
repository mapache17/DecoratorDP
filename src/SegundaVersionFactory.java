public class SegundaVersionFactory implements IEditionfactory{
    @Override
    public ILibro crearLibro(String titulo) {
        return new LibroSegundaVersion(titulo);
    }

    @Override
    public IPoster crearPoster() {
        return new PosterSegundaVersion();
    }
}
