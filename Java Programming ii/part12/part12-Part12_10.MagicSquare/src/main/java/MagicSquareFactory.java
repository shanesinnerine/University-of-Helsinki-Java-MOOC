
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);
        int row = 0;
        int column = (size / 2);
        System.out.println("Position: [" + row + "][" + column + "]");
        for(int i = 1; i <= size * size; i++){
            square.placeValue(column, row, i);
            int newRow = row - 1;
            int newColumn = column + 1;
            if(newRow < 0){
                newRow = size - 1;
            }
            if(newColumn >= size){
                newColumn = 0;
            }
            System.out.println("i: " + i);
            System.out.println("Position: [" + newRow + "][" + newColumn + "]");
            System.out.println("Value: " + square.readValue(newColumn, newRow));
            if(square.readValue(newColumn, newRow) == 0){
                row = newRow;
                column = newColumn;
                continue;
            }
            row += 1;
            if(row >= size){
                row = 0;
            }
        }
        return square;
    }

}
