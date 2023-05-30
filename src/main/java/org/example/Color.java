package org.example;

public enum Color {

    BLUE("#0000FF"),
    GREEN("#00FF00"),
    GREY("#808080"),
    RED("#FF0000");

    private String code;
    Color(String code){
        this.code = code;
    }

    public String getCode(){
        return code;
    }

    @Override
    public String toString() {
        return "my string color is: " + super.toString();
    }
}
