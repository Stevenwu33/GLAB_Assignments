package GLABS.GLab303_11_1_Generics;

public class GMultipleDatatype<DataTypeOne, DataTypeTwo> {

    DataTypeOne valueOne;
    DataTypeTwo valueTwo;

    public GMultipleDatatype(DataTypeOne valueOne, DataTypeTwo valueTwo) {
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }


    public DataTypeOne getValueOne() {
        return valueOne;
    }

    public void setValueOne(DataTypeOne valueOne) {
        this.valueOne = valueOne;
    }

    public DataTypeTwo getValueTwo() {
        return valueTwo;
    }

    public void setValueTwo(DataTypeTwo valueTwo) {
        this.valueTwo = valueTwo;
    }
}
