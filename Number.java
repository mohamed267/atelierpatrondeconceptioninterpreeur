import java.util.Map;
class Number implements Expression {
    private int number;
    public Number(int number) { this.number = number; }
    public int interpret(Map<String,Expression> variables) {
        System.out.println("we are interpreting number here");
        return number; 
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "number = " +String.valueOf(this.number);
    }
}
