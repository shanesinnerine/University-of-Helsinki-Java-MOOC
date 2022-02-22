
public class Program {

    public static void main(String[] args) {
        int[][] array = new int[2][3];
        String output = arrayAsString(array);
        System.out.println(output);
    }
    
    public static String arrayAsString(int[][] array){
        StringBuilder string = new StringBuilder();
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                string.append(array[i][j]);
            }
            string.append("\n");
        }
        return string.toString();
    }
}