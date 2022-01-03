package com.itsfnf.firitfinux.CalcEngine

public class MathEquation {
    // --- Version 3: Using classes (no accessors and mutators)
    /*
    public double leftVal;
    public double rightVal;
    public char opCode;
    public double result;
    */
    // -----------------------------------------------------------------------------------------------------------------

    // --- Version 3a: Using classes with accessors and mutators -------------------------------------------------------
    /*
    private double leftVal;
    private double rightVal;
    private char opCode;
    private double result;

    // Accessors
    public double getLeftVal() {return leftVal;}
    public double getRightVal() {return rightVal;}
    public double getOpCode() {return opCode;}
    public double getResult() {return result;}
    // Mutators
    public void setLeftVal(double leftVal){this.leftVal = leftVal;}
    public void setRightVal(double rightVal){this.rightVal = rightVal;}
    public void setOpCode(char opCode){this.opCode = opCode;}
    */
    // -----------------------------------------------------------------------------------------------------------------

    // --- Version 4: With Field Initializers --------------------------------------------------------------------------
    private double leftVal;
    private double rightVal;
    private char opCode = 'a'; // set to initial value
    private double result;

    // Accessors
    public double getLeftVal() {return leftVal;}
    public double getRightVal() {return rightVal;}
    public double getOpCode() {return opCode;}
    public double getResult() {return result;}
    // Mutators
    public void setLeftVal(double leftVal){this.leftVal = leftVal;}
    public void setRightVal(double rightVal){this.rightVal = rightVal;}
    public void setOpCode(char opCode){this.opCode = opCode;}

    // Constructor that doesn't take args
    public MathEquation() {

    }

    // Constructor for default opCode
    public MathEquation(char opCode) {
        this.opCode = opCode;
    }

    // Constructor for both opCode and vals
    public MathEquation(char opCode, double leftVal, double rightVal) {
        this(opCode); // Chained to constructor above
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }
    // -----------------------------------------------------------------------------------------------------------------

    // ---- Version 5: Using overloads ---------------------------------------------------------------------------------

    public void execute(double leftVal, double rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;

        // Call other execute implementation
        execute();
    }

    public void execute(int leftVal, int rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;

        // Call other execute implementation
        execute();

        result = (int)result;
    }
    // -----------------------------------------------------------------------------------------------------------------

    public void execute() {
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;

            case 's':
                result = leftVal - rightVal;
                break;

            case 'd':
                if (rightVal != 0.0d)
                    result = leftVal / rightVal;
                else
                    result = 0.0d;
                // Version 1:
                //System.out.println("WARNING: Cannot divide by zero!");
                break;

            case 'm':
                result = leftVal * rightVal;
                break;
            default:
                System.out.println("Error: Invalid OpCode");
                result = 0.0d;
                break;
        }
    }
}
