
public class ejercicio05 {
    public static void main(String[] args) {
        String r = "\033[31m";
        String v = "\033[32m";
        String n = "\033[33m";
        String a = "\033[34m";
        String m = "\033[35m";
        String c = "\033[36m";
        String b = "\033[37m";
        System.out.println("|Hora |    Lunes   |   Martes  |    Miercoles  |    Jueves   |  Viernes    |");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%s|    %-8s|  %-8s |    %-8s   |   %-8s  |    %-8s\n",  m+"|08.15", "pro1", "Prog1", "io1", "Prog1", "libre    |");
        System.out.printf("%s|    %-8s|  %-8s |     %-8s  |    %-8s |     %-8s\n",  "|09.15", "pro1", "Prog1", "1o1", "Prog1", "libre   |");
        System.out.printf("%s|    %-8s|  %-8s |     %-8s  |    %-8s |     %-8s\n",  "|10.15", "Sistemas", "Prog1", "Sistemas", "estad", "Entorno |");
        System.out.printf("%s|    %-8s|  %-8s |     %-8s  |    %-8s |     %-8s\n",  "|11.45", "libre", "libre", "alge", "alge", "estad   |");
        System.out.printf("%s|    %-8s|  %-8s |     %-8s  |    %-8s |     %-8s\n",  "|12.40", "libre", "libre", "alge", "alge", "Libre   |");
        System.out.printf("%s|    %-8s|  %-8s |     %-8s  |    %-8s |     %-8s\n",  "|13.35", "libre", "libre", "alge", "alge", "libre   |");
      }
}
