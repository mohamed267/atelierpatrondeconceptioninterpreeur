import java.util.Map;
import java.util.Scanner;

import javax.xml.validation.Validator;

import java.util.HashMap;
import java.util.List;
public class InterpreterExample {
    public static void main(String[] args) {
        String formula = args[0];
        Evaluator exp = new Evaluator(formula);
        Map<String,Expression> variables = new HashMap<String,Expression>();

        List<String> tokens =  exp.getTokens();

        // System.out.println("Les Valeurs : ");
        Scanner in = new Scanner(System.in);
        for (int i =0; i< 2 ; i ++){
            String numbers = in.nextLine();
            variables.put(tokens.get(i) , new Number(Integer.valueOf(numbers)));
        }

        System.out.println(exp.getTokens());



        int result = exp.interpret(variables);

        System.out.println(result);


        in.close();
    }
}