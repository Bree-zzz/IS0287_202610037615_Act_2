public class Principal {
 public static void main(String[] args) {
 Libro libro = new Libro(); // Usa constructor por defecto
 Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez",
432, "978-8437604947");
 libro.mostrarInfo();
 libro2.mostrarInfo();
 libro2.setNumPaginas(450); // Modifica un atributo
 System.out.println("El título del libro2 es: " + libro2.getNombre());
 System.out.println("Total de libros creados: " + Libro.getTotalLibros()); //
 }
}
