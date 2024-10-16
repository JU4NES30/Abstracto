public class Poligonos extends abstractas implements inter1 {

    @Override
    int numeroVertices() {
        return 0;
    }

    @Override
    String figura() {
        return "";
    }

    @Override
    int numeroLados() {
        return 0;
    }

    @Override
    public void Figura(String a, String b) {

    }


    @Override
    public void Figura(String a) {
        System.out.println("Su figura es: "+ a);
    }

    @Override
    public void Vertices(int c) {
        System.out.println("El numero de vertices de su figura es: "+ c);
    }
}
