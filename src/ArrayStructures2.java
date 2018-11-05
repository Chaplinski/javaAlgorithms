public class ArrayStructures2 {

    private int[] theArray = new int[50];

    private int arraySize = 10;

    public void generateRandomArray(){

        for (int i = 0; i < arraySize; i++){

            theArray[i] = (int)(Math.random()*10) + 10;

        }
    }

    public void printArray(){

        for(int i = 0; i < arraySize; i++){

            System.out.println("----------");
            System.out.print("| " + i + " | ");
            System.out.println(theArray[i] + " |");

        }

        System.out.println("----------");

    }

    public int getValueAtIndex(int index){

        if(index < arraySize) return theArray[index];

        return 0;

    }

    public boolean doesArrayContainThisValue(int searchValue){

        boolean valueExists = false;

        for(int i = 0; i < arraySize; i++){
            if(theArray[i] == searchValue){
                valueExists = true;
            }
        }

        return valueExists;

    }

    public void deleteIndex(int index){

        if(index < arraySize) {
            for (int i = index; i < (arraySize - 1); i++) {
                theArray[i] = theArray[i + 1];
            }

            arraySize--;
        }
    }

    public void insertValue(int value){

        theArray[arraySize] = value;
        arraySize++;
    }

    public String linearSearchForValue(int value){

        boolean valueAppearsInArray = false;

        String indexesWhereValueAppears = "The following indexes hold the searched for value: ";

        for(int i = 0; i < arraySize; i++){

            if(theArray[i] == value){

                valueAppearsInArray = true;

                indexesWhereValueAppears += (i + " ");

            }
        }

        if (!valueAppearsInArray){
            indexesWhereValueAppears += "NONE";
        }

        return indexesWhereValueAppears;
    }

    

    public static void main(String[] args){

        ArrayStructures2 newArray = new ArrayStructures2();

        newArray.generateRandomArray();

        newArray.printArray();

        System.out.println(newArray.getValueAtIndex(2));
        System.out.println(newArray.doesArrayContainThisValue(12));

        newArray.deleteIndex(3);

        newArray.insertValue(88);
        newArray.printArray();
        System.out.println(newArray.linearSearchForValue(12));
    }
}
