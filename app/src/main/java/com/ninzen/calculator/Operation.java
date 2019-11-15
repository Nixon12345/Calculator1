package com.ninzen.calculator;

public class Operation {
    private String NumberText;
    private int numberOne,numberTwo;
    private String command;
    public Operation(String NumberText)
    {
        this.NumberText=NumberText;
    }
    public Operation(String NumberText, String command)
    {
        this.NumberText=NumberText;
        this.command=command;
    }
    public Operation(int NumberOne,int NumberTwo)
    {
        this.numberOne=NumberOne;
        this.numberTwo=NumberTwo;
    }


    public String  Print(String inputnumber)
    {
        return NumberText+inputnumber;
    }
    public String[]  Math()
    {
        if(command=="add")
        {
            return new String[]{"add",NumberText};
        }
        else if(command=="sub")
        {
            return new String[]{"sub",NumberText};
        }
        else if(command=="multiply")
        {
            return new String[]{"multiply",NumberText};
        }
        else if(command=="divide")
        {
            return new String[]{"divide",NumberText};
        }
        return null;

    }
    public int Equlas(String command)
    {

        if(command=="add")
        {
            return numberOne+numberTwo;

        }
        else if(command=="sub")
        {
            return numberOne-numberTwo;

        }
        else if(command=="multiply")
        {
            return numberOne*numberTwo;

        }
        else if(command=="divide"){
            return numberOne/numberTwo;
        }
        else {
            return 0;
        }


    }

}
