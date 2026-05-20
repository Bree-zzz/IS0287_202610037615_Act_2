public class Libro {
    private String Nombre;
    private String Autor;
    private int NumPaginas;
    private final String Isbn;
    private static int ContLibros= 0;

    public Libro(){
        this.Nombre= "Desconocido";
        this.Autor= "Desconocido";
        this.NumPaginas = 0;
        this.Isbn = "000-0000000000";
        ContLibros++;
    }
    public Libro(String Nombre, String Autor, int NumPaginas, String Isbn){
         this.Nombre = Nombre;
         this.Autor = Autor;
         this.NumPaginas = NumPaginas;
         this.Isbn = Isbn; 
         ContLibros++;

    }
    public String getNombre() { return Nombre; }
 public void setNumPaginas(int paginas) { this.NumPaginas = paginas; }
 public void mostrarInfo() {
 System.out.println(Nombre + " por " + Autor + " tiene " + NumPaginas + " paginas, y su ISBN es: " +Isbn);
 }
 public static int getTotalLibros() { return ContLibros; }

}
