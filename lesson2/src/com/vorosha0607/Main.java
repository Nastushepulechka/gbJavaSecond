package com.vorosha0607;

public class Main {

    public static void main(String[] args) {
        String[][] arr = new String[][]{
                {"2", "5", "6", "Yfac"},
                {"4", "73", "1", "0"},
                {"7", "QwfhF2", "10", "19"},
                {"19", "29", "39", "сорок девять"}
        };

        try {
            System.out.println(sumInArray(arr));
        } catch (MyArraySizeException e){
            e.printStackTrace();
            System.out.println("Массив неудовлетворяет заданным условиям");
        }catch (MyArrayDataException e){
            e.printStackTrace();
        }


    }

    /**
     * Подсчет суммы значений эл-ов массива с проверкой массива на соответсвие размеру 4х4
     *
     * @param arr двумерный строковый массив
     * @throws MyArraySizeException выпадает при несоответсвии требуемому размеру массива
     * @throws MyArrayDataException выпадает, когда не удается преобразовать ячейку строкового массива в число (наличие символов в ячейке и тд)
     */
    public static int sumInArray(String[][] arr) throws MyArraySizeException, MyArrayDataException{
        int res = 0;

        if (arr.length == 4) {
            for (int i = 0; i < 4; i++) {
                if (arr[i].length != 4) {
                    throw new MyArraySizeException(i, arr[i].length);
                }
            }
        } else
            throw new MyArraySizeException(arr.length);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                    try {
                        res += Integer.parseInt(arr[i][j]);
                    } catch (NumberFormatException e){
                        throw new MyArrayDataException(i, j);
                    }
            }
        }
        return res;

    }
}
