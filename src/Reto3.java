public class Reto3 {
    public static void main(String[] args) {
        String[][] teclado = {
            
            {"Esc", "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9","F10","F11","F12","     ", "Inicio","Fin","Insert","Supr"},
            {"º","1", "2", "3", "4", "5", "6", "7", "8", "9", "0","?","¿", " Back "},
            {"Tab ","q", "w", "e", "r", "t", "y", "u", "i", "o", "p","``","*", " Enter "},
            {"Mayus","a", "s", "d", "f", "g", "h", "j", "k", "l","Ñ", "{","}"},
            {"Shift ","z", "x", "c", "v", "b", "n", "m", ",", ".",                        "🡡"},
            {"Fn ","Ctrl", " ▨ ", "Alt", " Space  ", " Alt ", "Ctrl", "", ",", ".", "🠀", " ᛎ " , " ￫ "}
        };
        
        for (int i = 0; i < teclado.length; i++) {
            for (int j = 0; j < teclado[i].length; j++) {
                System.out.print(teclado[i][j] + " ");
            }
            System.out.println();
        }
    }
}
